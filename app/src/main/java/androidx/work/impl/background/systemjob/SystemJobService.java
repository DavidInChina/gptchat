package androidx.work.impl.background.systemjob;

import L3.s;
import M3.AbstractC0935d;
import M3.D;
import M3.F;
import M3.q;
import M3.w;
import P3.c;
import P3.d;
import P3.e;
import U3.j;
import U3.l;
import U3.u;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import z1.RunnableC6742a;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements AbstractC0935d {

    /* renamed from: j0  reason: collision with root package name */
    public static final String f25537j0 = s.f("SystemJobService");

    /* renamed from: Y  reason: collision with root package name */
    public F f25538Y;

    /* renamed from: Z  reason: collision with root package name */
    public final HashMap f25539Z = new HashMap();

    /* renamed from: h0  reason: collision with root package name */
    public final l f25540h0 = new l(9, 0);

    /* renamed from: i0  reason: collision with root package name */
    public D f25541i0;

    public static j b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // M3.AbstractC0935d
    public final void a(j jVar, boolean z10) {
        JobParameters jobParameters;
        s d10 = s.d();
        String str = f25537j0;
        d10.a(str, jVar.f17418a + " executed on JobScheduler");
        synchronized (this.f25539Z) {
            jobParameters = (JobParameters) this.f25539Z.remove(jVar);
        }
        this.f25540h0.n(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            F g02 = F.g0(getApplicationContext());
            this.f25538Y = g02;
            q qVar = g02.f11522k;
            this.f25541i0 = new D(qVar, g02.f11520i);
            qVar.a(this);
        } catch (IllegalStateException e10) {
            if (Application.class.equals(getApplication().getClass())) {
                s.d().g(f25537j0, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        F f6 = this.f25538Y;
        if (f6 != null) {
            f6.f11522k.h(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        u uVar;
        if (this.f25538Y == null) {
            s.d().a(f25537j0, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j b10 = b(jobParameters);
        if (b10 == null) {
            s.d().b(f25537j0, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f25539Z) {
            try {
                if (this.f25539Z.containsKey(b10)) {
                    s d10 = s.d();
                    String str = f25537j0;
                    d10.a(str, "Job is already being executed by SystemJobService: " + b10);
                    return false;
                }
                s d11 = s.d();
                String str2 = f25537j0;
                d11.a(str2, "onStartJob for " + b10);
                this.f25539Z.put(b10, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    uVar = new u(17);
                    if (c.b(jobParameters) != null) {
                        uVar.f17493h0 = Arrays.asList(c.b(jobParameters));
                    }
                    if (c.a(jobParameters) != null) {
                        uVar.f17492Z = Arrays.asList(c.a(jobParameters));
                    }
                    if (i10 >= 28) {
                        uVar.f17494i0 = d.a(jobParameters);
                    }
                } else {
                    uVar = null;
                }
                D d12 = this.f25541i0;
                d12.f11513b.a(new RunnableC6742a(d12.f11512a, this.f25540h0.p(b10), uVar));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        int i10;
        if (this.f25538Y == null) {
            s.d().a(f25537j0, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j b10 = b(jobParameters);
        if (b10 == null) {
            s.d().b(f25537j0, "WorkSpec id not found!");
            return false;
        }
        s d10 = s.d();
        String str = f25537j0;
        d10.a(str, "onStopJob for " + b10);
        synchronized (this.f25539Z) {
            this.f25539Z.remove(b10);
        }
        w n10 = this.f25540h0.n(b10);
        if (n10 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i10 = e.a(jobParameters);
            } else {
                i10 = -512;
            }
            this.f25541i0.a(n10, i10);
        }
        return !this.f25538Y.f11522k.f(b10.f17418a);
    }
}
