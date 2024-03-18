package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.B0;
import io.sentry.C0;
import io.sentry.CallableC3688v;
import io.sentry.EnumC3642e1;
import io.sentry.L0;
import io.sentry.r1;
import io.sentry.w1;
import j7.RunnableC3921k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import livekit.org.webrtc.WebrtcBuildVersion;

/* loaded from: classes2.dex */
public final class r implements io.sentry.U {

    /* renamed from: a  reason: collision with root package name */
    public final Context f34236a;

    /* renamed from: b  reason: collision with root package name */
    public final io.sentry.H f34237b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34238c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34239d;

    /* renamed from: e  reason: collision with root package name */
    public final int f34240e;

    /* renamed from: f  reason: collision with root package name */
    public final io.sentry.P f34241f;

    /* renamed from: g  reason: collision with root package name */
    public final B f34242g;

    /* renamed from: j  reason: collision with root package name */
    public final io.sentry.android.core.internal.util.k f34245j;

    /* renamed from: k  reason: collision with root package name */
    public C0 f34246k;

    /* renamed from: m  reason: collision with root package name */
    public long f34248m;

    /* renamed from: n  reason: collision with root package name */
    public long f34249n;

    /* renamed from: h  reason: collision with root package name */
    public boolean f34243h = false;

    /* renamed from: i  reason: collision with root package name */
    public int f34244i = 0;

    /* renamed from: l  reason: collision with root package name */
    public C3626q f34247l = null;

    public r(Context context, SentryAndroidOptions sentryAndroidOptions, B b10, io.sentry.android.core.internal.util.k kVar) {
        io.sentry.H logger = sentryAndroidOptions.getLogger();
        String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
        boolean isProfilingEnabled = sentryAndroidOptions.isProfilingEnabled();
        int profilingTracesHz = sentryAndroidOptions.getProfilingTracesHz();
        io.sentry.P executorService = sentryAndroidOptions.getExecutorService();
        this.f34236a = context;
        Ad.l.Z0("ILogger is required", logger);
        this.f34237b = logger;
        this.f34245j = kVar;
        this.f34242g = b10;
        this.f34238c = profilingTracesDirPath;
        this.f34239d = isProfilingEnabled;
        this.f34240e = profilingTracesHz;
        Ad.l.Z0("The ISentryExecutorService is required.", executorService);
        this.f34241f = executorService;
    }

    @Override // io.sentry.U
    public final synchronized B0 a(io.sentry.T t10, List list, r1 r1Var) {
        return e(t10.getName(), t10.n().toString(), t10.s().f33714Y.toString(), false, list, r1Var);
    }

    @Override // io.sentry.U
    public final synchronized void b(w1 w1Var) {
        if (this.f34244i > 0 && this.f34246k == null) {
            this.f34246k = new C0(w1Var, Long.valueOf(this.f34248m), Long.valueOf(this.f34249n));
        }
    }

    public final void c() {
        if (this.f34243h) {
            return;
        }
        this.f34243h = true;
        boolean z10 = this.f34239d;
        io.sentry.H h10 = this.f34237b;
        if (!z10) {
            h10.f(EnumC3642e1.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f34238c;
        if (str == null) {
            h10.f(EnumC3642e1.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f34240e;
        if (i10 <= 0) {
            h10.f(EnumC3642e1.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f34247l = new C3626q(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i10, this.f34245j, this.f34241f, this.f34237b, this.f34242g);
        }
    }

    @Override // io.sentry.U
    public final void close() {
        C0 c02 = this.f34246k;
        if (c02 != null) {
            e(c02.f33756h0, c02.f33754Y, c02.f33755Z, true, null, L0.c().s());
        } else {
            int i10 = this.f34244i;
            if (i10 != 0) {
                this.f34244i = i10 - 1;
            }
        }
        C3626q c3626q = this.f34247l;
        if (c3626q != null) {
            synchronized (c3626q) {
                try {
                    Future future = c3626q.f34223d;
                    if (future != null) {
                        future.cancel(true);
                        c3626q.f34223d = null;
                    }
                    if (c3626q.f34235p) {
                        c3626q.a(null, true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean d() {
        Q1.z zVar;
        String str;
        C3626q c3626q = this.f34247l;
        if (c3626q == null) {
            return false;
        }
        synchronized (c3626q) {
            int i10 = c3626q.f34222c;
            zVar = null;
            if (i10 == 0) {
                c3626q.f34234o.f(EnumC3642e1.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i10));
            } else if (c3626q.f34235p) {
                c3626q.f34234o.f(EnumC3642e1.WARNING, "Profiling has already started...", new Object[0]);
            } else {
                c3626q.f34232m.getClass();
                c3626q.f34224e = new File(c3626q.f34221b, UUID.randomUUID() + ".trace");
                c3626q.f34231l.clear();
                c3626q.f34228i.clear();
                c3626q.f34229j.clear();
                c3626q.f34230k.clear();
                io.sentry.android.core.internal.util.k kVar = c3626q.f34227h;
                C3624o c3624o = new C3624o(c3626q);
                if (!kVar.f34188l0) {
                    str = null;
                } else {
                    str = UUID.randomUUID().toString();
                    kVar.f34187k0.put(str, c3624o);
                    kVar.c();
                }
                c3626q.f34225f = str;
                try {
                    c3626q.f34223d = c3626q.f34233n.l(new RunnableC3921k(11, c3626q), 30000L);
                } catch (RejectedExecutionException e10) {
                    c3626q.f34234o.d(EnumC3642e1.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
                }
                c3626q.f34220a = SystemClock.elapsedRealtimeNanos();
                long elapsedCpuTime = Process.getElapsedCpuTime();
                Debug.startMethodTracingSampling(c3626q.f34224e.getPath(), 3000000, c3626q.f34222c);
                c3626q.f34235p = true;
                zVar = new Q1.z(c3626q.f34220a, elapsedCpuTime);
            }
        }
        if (zVar == null) {
            return false;
        }
        this.f34248m = zVar.f14371a;
        this.f34249n = zVar.f14372b;
        return true;
    }

    public final synchronized B0 e(String str, String str2, String str3, boolean z10, List list, r1 r1Var) {
        String str4;
        String str5;
        String str6;
        try {
            ActivityManager.MemoryInfo memoryInfo = null;
            if (this.f34247l == null) {
                return null;
            }
            this.f34242g.getClass();
            C0 c02 = this.f34246k;
            if (c02 != null && c02.f33754Y.equals(str2)) {
                int i10 = this.f34244i;
                if (i10 > 0) {
                    this.f34244i = i10 - 1;
                }
                this.f34237b.f(EnumC3642e1.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.f34244i != 0) {
                    C0 c03 = this.f34246k;
                    if (c03 != null) {
                        c03.a(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f34248m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f34249n));
                    }
                    return null;
                }
                C3625p a5 = this.f34247l.a(list, false);
                if (a5 == null) {
                    return null;
                }
                long j6 = a5.f34201a - this.f34248m;
                ArrayList arrayList = new ArrayList(1);
                C0 c04 = this.f34246k;
                if (c04 != null) {
                    arrayList.add(c04);
                }
                this.f34246k = null;
                this.f34244i = 0;
                io.sentry.H h10 = this.f34237b;
                ActivityManager activityManager = (ActivityManager) this.f34236a.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo2);
                    memoryInfo = memoryInfo2;
                } else {
                    h10.f(EnumC3642e1.INFO, "Error getting MemoryInfo.", new Object[0]);
                }
                if (memoryInfo != null) {
                    str4 = Long.toString(memoryInfo.totalMem);
                } else {
                    str4 = WebrtcBuildVersion.maint_version;
                }
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0) it.next()).a(Long.valueOf(a5.f34201a), Long.valueOf(this.f34248m), Long.valueOf(a5.f34202b), Long.valueOf(this.f34249n));
                }
                File file = a5.f34203c;
                String l10 = Long.toString(j6);
                this.f34242g.getClass();
                int i11 = Build.VERSION.SDK_INT;
                if (strArr != null && strArr.length > 0) {
                    str5 = strArr[0];
                } else {
                    str5 = "";
                }
                CallableC3688v callableC3688v = new CallableC3688v(4);
                this.f34242g.getClass();
                String str7 = Build.MANUFACTURER;
                this.f34242g.getClass();
                String str8 = Build.MODEL;
                this.f34242g.getClass();
                String str9 = Build.VERSION.RELEASE;
                Boolean a10 = this.f34242g.a();
                String proguardUuid = r1Var.getProguardUuid();
                String release = r1Var.getRelease();
                String environment = r1Var.getEnvironment();
                if (!a5.f34205e && !z10) {
                    str6 = "normal";
                    return new B0(file, arrayList, str, str2, str3, l10, i11, str5, callableC3688v, str7, str8, str9, a10, str4, proguardUuid, release, environment, str6, a5.f34204d);
                }
                str6 = "timeout";
                return new B0(file, arrayList, str, str2, str3, l10, i11, str5, callableC3688v, str7, str8, str9, a10, str4, proguardUuid, release, environment, str6, a5.f34204d);
            }
            this.f34237b.f(EnumC3642e1.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.sentry.U
    public final boolean isRunning() {
        if (this.f34244i != 0) {
            return true;
        }
        return false;
    }

    @Override // io.sentry.U
    public final synchronized void start() {
        try {
            this.f34242g.getClass();
            c();
            int i10 = this.f34244i + 1;
            this.f34244i = i10;
            if (i10 == 1 && d()) {
                this.f34237b.f(EnumC3642e1.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.f34244i--;
                this.f34237b.f(EnumC3642e1.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
