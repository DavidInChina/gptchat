package V3;

import D1.N0;
import L3.C0889a;
import M3.F;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import io.sentry.L0;
import io.sentry.S;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import q1.AbstractC5260f;
import x3.C6270B;
import x3.y;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: j0  reason: collision with root package name */
    public static final String f18343j0 = L3.s.f("ForceStopRunnable");

    /* renamed from: k0  reason: collision with root package name */
    public static final long f18344k0 = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: Y  reason: collision with root package name */
    public final Context f18345Y;

    /* renamed from: Z  reason: collision with root package name */
    public final F f18346Z;

    /* renamed from: h0  reason: collision with root package name */
    public final J0.a f18347h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f18348i0 = 0;

    public f(Context context, F f6) {
        this.f18345Y = context.getApplicationContext();
        this.f18346Z = f6;
        this.f18347h0 = f6.f11523l;
    }

    public static void c(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f18344k0;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        S s10;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        Throwable e10;
        int i12;
        int i13;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        String str;
        J0.a aVar = this.f18347h0;
        F f6 = this.f18346Z;
        WorkDatabase workDatabase = f6.f11519h;
        String str2 = P3.b.f13804k0;
        Context context = this.f18345Y;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList f10 = P3.b.f(context, jobScheduler);
        U3.i r10 = workDatabase.r();
        r10.getClass();
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        ((y) r10.f17414Y).b();
        Cursor t12 = A7.b.t1((y) r10.f17414Y, a5, false);
        try {
            ArrayList arrayList = new ArrayList(t12.getCount());
            while (t12.moveToNext()) {
                if (t12.isNull(0)) {
                    str = null;
                } else {
                    str = t12.getString(0);
                }
                arrayList.add(str);
            }
            if (f10 != null) {
                i10 = f10.size();
            } else {
                i10 = 0;
            }
            HashSet hashSet = new HashSet(i10);
            if (f10 != null && !f10.isEmpty()) {
                Iterator it = f10.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    U3.j g10 = P3.b.g(jobInfo);
                    if (g10 != null) {
                        hashSet.add(g10.f17418a);
                    } else {
                        P3.b.a(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                i11 = 1;
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        L3.s.d().a(P3.b.f13804k0, "Reconciling jobs");
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                workDatabase.c();
                try {
                    U3.s u10 = workDatabase.u();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        u10.q(-1L, (String) it3.next());
                    }
                    workDatabase.n();
                    workDatabase.j();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            workDatabase = f6.f11519h;
            U3.s u11 = workDatabase.u();
            U3.n t10 = workDatabase.t();
            workDatabase.c();
            try {
                ArrayList g11 = u11.g();
                boolean z12 = !g11.isEmpty();
                if (z12) {
                    Iterator it4 = g11.iterator();
                    while (it4.hasNext()) {
                        String str3 = ((U3.q) it4.next()).f17450a;
                        u11.v(i11, str3);
                        u11.w(-512, str3);
                        u11.q(-1L, str3);
                        i11 = 1;
                    }
                }
                t10.i();
                workDatabase.n();
                workDatabase.j();
                if (!z12 && !z10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                Long w10 = ((WorkDatabase) f6.f11523l.f8729Y).q().w("reschedule_needed");
                long j6 = 0;
                String str4 = f18343j0;
                if (w10 != null && w10.longValue() == 1) {
                    L3.s.d().a(str4, "Rescheduling Workers.");
                    f6.i0();
                    J0.a aVar2 = f6.f11523l;
                    aVar2.getClass();
                    ((WorkDatabase) aVar2.f8729Y).q().x(new U3.d("reschedule_needed", 0L));
                    return;
                }
                try {
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 31) {
                        i13 = 570425344;
                    } else {
                        i13 = 536870912;
                    }
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
                    intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                    broadcast = PendingIntent.getBroadcast(context, -1, intent, i13);
                } catch (IllegalArgumentException e11) {
                    e10 = e11;
                    if (L3.s.d().f10731a <= 5) {
                        AbstractC3612c.s(str4, "Ignoring exception", e10);
                    }
                    L3.s.d().a(str4, "Application was force-stopped, rescheduling.");
                    f6.i0();
                    f6.f11518g.f10686c.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    aVar.getClass();
                    ((WorkDatabase) aVar.f8729Y).q().x(new U3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                    return;
                } catch (SecurityException e12) {
                    e10 = e12;
                    if (L3.s.d().f10731a <= 5) {
                    }
                    L3.s.d().a(str4, "Application was force-stopped, rescheduling.");
                    f6.i0();
                    f6.f11518g.f10686c.getClass();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    aVar.getClass();
                    ((WorkDatabase) aVar.f8729Y).q().x(new U3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                    return;
                }
                if (i12 >= 30) {
                    if (broadcast != null) {
                        broadcast.cancel();
                    }
                    historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                        Long w11 = ((WorkDatabase) aVar.f8729Y).q().w("last_force_stop_ms");
                        if (w11 != null) {
                            j6 = w11.longValue();
                        }
                        for (int i14 = 0; i14 < historicalProcessExitReasons.size(); i14++) {
                            ApplicationExitInfo c10 = N0.c(historicalProcessExitReasons.get(i14));
                            reason = c10.getReason();
                            if (reason == 10) {
                                timestamp = c10.getTimestamp();
                                if (timestamp >= j6) {
                                    L3.s.d().a(str4, "Application was force-stopped, rescheduling.");
                                    f6.i0();
                                    f6.f11518g.f10686c.getClass();
                                    long currentTimeMillis22 = System.currentTimeMillis();
                                    aVar.getClass();
                                    ((WorkDatabase) aVar.f8729Y).q().x(new U3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                    return;
                                }
                            }
                        }
                    }
                    if (!z11) {
                        L3.s.d().a(str4, "Found unfinished work, scheduling it.");
                        M3.v.b(f6.f11518g, f6.f11519h, f6.f11521j);
                        return;
                    }
                    return;
                }
                if (broadcast == null) {
                    c(context);
                    L3.s.d().a(str4, "Application was force-stopped, rescheduling.");
                    f6.i0();
                    f6.f11518g.f10686c.getClass();
                    long currentTimeMillis222 = System.currentTimeMillis();
                    aVar.getClass();
                    ((WorkDatabase) aVar.f8729Y).q().x(new U3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                    return;
                }
                if (!z11) {
                }
            } finally {
                workDatabase.j();
            }
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final boolean b() {
        C0889a c0889a = this.f18346Z.f11518g;
        c0889a.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f18343j0;
        if (isEmpty) {
            L3.s.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a5 = m.a(this.f18345Y, c0889a);
        L3.s d10 = L3.s.d();
        d10.a(str, "Is default app process = " + a5);
        return a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Context context = this.f18345Y;
        String str2 = f18343j0;
        F f6 = this.f18346Z;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    AbstractC5260f.E(context);
                    L3.s.d().a(str2, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        int i10 = this.f18348i0 + 1;
                        this.f18348i0 = i10;
                        if (i10 >= 3) {
                            if (Build.VERSION.SDK_INT >= 24 && !y1.r.a(context)) {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                L3.s.d().c(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                f6.f11518g.getClass();
                                throw illegalStateException;
                            }
                            str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            L3.s.d().c(str2, str, e10);
                            IllegalStateException illegalStateException2 = new IllegalStateException(str, e10);
                            f6.f11518g.getClass();
                            throw illegalStateException2;
                        }
                        String str3 = "Retrying after " + (i10 * 300);
                        if (L3.s.d().f10731a <= 3) {
                            Log.d(str2, str3, e10);
                        }
                        try {
                            Thread.sleep(this.f18348i0 * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    L3.s.d().b(str2, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    f6.f11518g.getClass();
                    throw illegalStateException3;
                }
            }
        } finally {
            f6.h0();
        }
    }
}
