package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import U3.u;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.Base64;
import e7.i;
import e7.q;
import h.C3276b;
import j$.util.Objects;
import j7.C3919i;
import l7.AbstractC4342c;
import l7.C4340a;
import m7.C4567c;
import n7.AbstractC4720a;
import u5.RunnableC5841a;

/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ int f26757Y = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        final int i11 = jobParameters.getExtras().getInt("attemptNumber");
        q.b(getApplicationContext());
        u a5 = i.a();
        a5.O(string);
        a5.P(AbstractC4720a.b(i10));
        if (string2 != null) {
            a5.f17493h0 = Base64.decode(string2, 0);
        }
        final C3919i c3919i = q.a().f29024d;
        final i h10 = a5.h();
        final RunnableC5841a runnableC5841a = new RunnableC5841a(this, 6, jobParameters);
        c3919i.getClass();
        c3919i.f36059e.execute(new Runnable() { // from class: j7.f
            @Override // java.lang.Runnable
            public final void run() {
                SQLiteDatabase sQLiteDatabase;
                e7.i iVar = h10;
                int i12 = i11;
                Runnable runnable = runnableC5841a;
                C3919i c3919i2 = C3919i.this;
                AbstractC3923m abstractC3923m = c3919i2.f36058d;
                AbstractC4342c abstractC4342c = c3919i2.f36060f;
                try {
                    try {
                        k7.d dVar = c3919i2.f36057c;
                        Objects.requireNonNull(dVar);
                        ((k7.k) abstractC4342c).k(new C3276b(23, dVar));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) c3919i2.f36055a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            c3919i2.a(iVar, i12);
                        } else {
                            k7.k kVar = (k7.k) abstractC4342c;
                            SQLiteDatabase a10 = kVar.a();
                            A9.a aVar = new A9.a(7);
                            C4567c c4567c = (C4567c) kVar.f37190h0;
                            long a11 = c4567c.a();
                            while (true) {
                                try {
                                    a10.beginTransaction();
                                    sQLiteDatabase = a10;
                                    break;
                                } catch (SQLiteDatabaseLockedException e10) {
                                    sQLiteDatabase = a10;
                                    if (c4567c.a() >= kVar.f37191i0.f37169c + a11) {
                                        aVar.apply(e10);
                                        break;
                                    } else {
                                        SystemClock.sleep(50L);
                                        a10 = sQLiteDatabase;
                                    }
                                }
                            }
                            try {
                                ((C3914d) abstractC3923m).a(iVar, i12 + 1, false);
                                sQLiteDatabase.setTransactionSuccessful();
                            } finally {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                    } catch (C4340a unused) {
                        ((C3914d) abstractC3923m).a(iVar, i12 + 1, false);
                    }
                    runnable.run();
                } catch (Throwable th2) {
                    runnable.run();
                    throw th2;
                }
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
