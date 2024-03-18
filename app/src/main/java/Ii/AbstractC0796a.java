package Ii;

import D1.N0;
import Hi.q;
import Ii.H;
import Ii.v;
import ae.AbstractC1976b;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import jf.C3963m;
import nf.AbstractC4828h;
import yf.AbstractC6583a;

/* renamed from: Ii.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0796a extends ContentProvider {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, android.os.MessageQueue$IdleHandler] */
    /* JADX WARN: Type inference failed for: r7v6, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        A7.b bVar;
        boolean z10;
        Long l10;
        Hi.i iVar;
        Long l11;
        String str;
        Long l12;
        Long l13;
        List historicalProcessExitReasons;
        long timestamp;
        long startUptimeMillis;
        A7.b bVar2;
        int myPid;
        Object systemService;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0(ParameterNames.INFO, providerInfo);
        super.attachInfo(context, providerInfo);
        boolean z11 = v.f8689a;
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C3963m c3963m = AbstractC0804i.f8654a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread() && !v.f8690b) {
            if (!(context instanceof Application)) {
                AbstractC3557B.v2("Perfs.init() called with a non Application context: ", context.getClass());
                return;
            }
            try {
                myPid = Process.myPid();
                systemService = context.getSystemService("activity");
            } catch (Throwable th2) {
                bVar2 = new o(th2);
            }
            if (systemService != null) {
                ActivityManager activityManager = (ActivityManager) systemService;
                try {
                    runningAppProcesses = activityManager.getRunningAppProcesses();
                } catch (SecurityException e10) {
                    bVar2 = new o(e10);
                    bVar = bVar2;
                    if (bVar instanceof o) {
                    }
                }
                if (runningAppProcesses == null) {
                    bVar = null;
                } else {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == myPid) {
                            List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                            AbstractC3557B.b0("activityManager.appTasks", appTasks);
                            bVar = new p(runningAppProcessInfo, Ad.l.V0(myPid), r.f.X(appTasks));
                        }
                    }
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(runningAppProcesses, 10));
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : runningAppProcesses) {
                        arrayList.add(Integer.valueOf(runningAppProcessInfo2.pid));
                    }
                    bVar = new o(new RuntimeException("ActivityManager.getRunningAppProcesses() returned " + arrayList + ", no process matching myPid() " + myPid));
                    if (bVar instanceof o) {
                        o oVar = (o) bVar;
                        oVar.f8676m.getClass();
                        oVar.f8676m.getMessage();
                        return;
                    } else if (bVar instanceof p) {
                        p pVar = (p) bVar;
                        v.f8690b = true;
                        Application application = (Application) context;
                        if (pVar.f8677m.importance == 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        AbstractC4828h.f40327i = application;
                        Looper mainLooper = Looper.getMainLooper();
                        if (mainLooper == Looper.myLooper()) {
                            if (Build.VERSION.SDK_INT != 28 && !Bi.c.f2425a && Hi.q.e() && AbstractC4828h.f40327i != null) {
                                Application application2 = AbstractC4828h.f40327i;
                                if (application2 != null) {
                                    if (application2.getResources().getBoolean(R.bool.papa_trace_main_thread)) {
                                        Bi.c.f2425a = true;
                                        Looper.getMainLooper().setMessageLogging(new H(new Object()));
                                    }
                                } else {
                                    AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                                    throw null;
                                }
                            }
                        } else {
                            new Handler(mainLooper).post(new Runnable() { // from class: j7.a
                                /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.jvm.internal.x] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (r1) {
                                        case 0:
                                            int i10 = AlarmManagerSchedulerBroadcastReceiver.f26756a;
                                            return;
                                        case 1:
                                            boolean z12 = v.f8689a;
                                            v.f8696h = Long.valueOf(SystemClock.uptimeMillis());
                                            Hi.c cVar = v.f8691c;
                                            if (cVar != null) {
                                                long uptimeMillis2 = SystemClock.uptimeMillis() - cVar.f7833b;
                                                Hi.c cVar2 = v.f8691c;
                                                if (cVar2 != null) {
                                                    v.f8691c = Hi.c.a(cVar2, null, null, Long.valueOf(uptimeMillis2), null, null, null, null, null, null, null, null, null, null, null, -262145);
                                                    return;
                                                } else {
                                                    AbstractC3557B.C2("appStartData");
                                                    throw null;
                                                }
                                            }
                                            AbstractC3557B.C2("appStartData");
                                            throw null;
                                        default:
                                            if (Build.VERSION.SDK_INT != 28 && !Bi.c.f2425a && q.e() && AbstractC4828h.f40327i != null) {
                                                Application application3 = AbstractC4828h.f40327i;
                                                if (application3 != null) {
                                                    if (application3.getResources().getBoolean(R.bool.papa_trace_main_thread)) {
                                                        Bi.c.f2425a = true;
                                                        Looper.getMainLooper().setMessageLogging(new H(new Object()));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                                                throw null;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        if (z10) {
                            Hi.q.a("App Launch", 0);
                        }
                        ThreadLocal threadLocal = G.f8631a;
                        if (application.getResources().getBoolean(R.bool.papa_track_input_events)) {
                            ((be.g) AbstractC1976b.f24158a.getValue()).f25956a.add(G.f8634d);
                        }
                        ((be.g) AbstractC1976b.f24158a.getValue()).f25956a.add(new C0803h(new Object(), new Object(), new Object()));
                        long uptimeMillis2 = SystemClock.uptimeMillis() - (SystemClock.elapsedRealtime() - pVar.f8678n);
                        if (Build.VERSION.SDK_INT >= 24) {
                            startUptimeMillis = Process.getStartUptimeMillis();
                            l10 = Long.valueOf(startUptimeMillis - uptimeMillis2);
                        } else {
                            l10 = null;
                        }
                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.post(new Runnable() { // from class: j7.a
                            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.jvm.internal.x] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r1) {
                                    case 0:
                                        int i10 = AlarmManagerSchedulerBroadcastReceiver.f26756a;
                                        return;
                                    case 1:
                                        boolean z12 = v.f8689a;
                                        v.f8696h = Long.valueOf(SystemClock.uptimeMillis());
                                        Hi.c cVar = v.f8691c;
                                        if (cVar != null) {
                                            long uptimeMillis22 = SystemClock.uptimeMillis() - cVar.f7833b;
                                            Hi.c cVar2 = v.f8691c;
                                            if (cVar2 != null) {
                                                v.f8691c = Hi.c.a(cVar2, null, null, Long.valueOf(uptimeMillis22), null, null, null, null, null, null, null, null, null, null, null, -262145);
                                                return;
                                            } else {
                                                AbstractC3557B.C2("appStartData");
                                                throw null;
                                            }
                                        }
                                        AbstractC3557B.C2("appStartData");
                                        throw null;
                                    default:
                                        if (Build.VERSION.SDK_INT != 28 && !Bi.c.f2425a && q.e() && AbstractC4828h.f40327i != null) {
                                            Application application3 = AbstractC4828h.f40327i;
                                            if (application3 != null) {
                                                if (application3.getResources().getBoolean(R.bool.papa_trace_main_thread)) {
                                                    Bi.c.f2425a = true;
                                                    Looper.getMainLooper().setMessageLogging(new H(new Object()));
                                                    return;
                                                }
                                                return;
                                            }
                                            AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                                            throw null;
                                        }
                                        return;
                                }
                            }
                        });
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo3 = new ActivityManager.RunningAppProcessInfo();
                        try {
                            ActivityManager.getMyMemoryState(runningAppProcessInfo3);
                        } catch (Throwable unused) {
                        }
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            SharedPreferences sharedPreferences = application.getSharedPreferences("Perfs", 0);
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            String string = sharedPreferences.getString("lastResumedState", null);
                            if (string == null) {
                                iVar = null;
                            } else if (AbstractC3557B.K(string, "VISIBLE")) {
                                iVar = Hi.i.f7878Y;
                            } else {
                                iVar = Hi.i.f7879Z;
                            }
                            long j6 = sharedPreferences.getLong("lastResumedCurrentMillis", -1L);
                            if (j6 == -1) {
                                l11 = null;
                            } else {
                                l11 = Long.valueOf(currentTimeMillis - j6);
                            }
                            long j10 = 0;
                            if (Build.VERSION.SDK_INT >= 30) {
                                Object systemService2 = context.getSystemService("activity");
                                if (systemService2 != null) {
                                    historicalProcessExitReasons = ((ActivityManager) systemService2).getHistoricalProcessExitReasons(null, 0, 0);
                                    AbstractC3557B.b0("activityManager.getHisto\u2026ssExitReasons(null, 0, 0)", historicalProcessExitReasons);
                                    ApplicationExitInfo c10 = N0.c(kf.t.h2(historicalProcessExitReasons));
                                    if (c10 != null) {
                                        timestamp = c10.getTimestamp();
                                        j10 = currentTimeMillis - timestamp;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                                }
                            }
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo4 = pVar.f8677m;
                            long j11 = pVar.f8678n;
                            long j12 = v.f8692d - uptimeMillis2;
                            long j13 = uptimeMillis - uptimeMillis2;
                            int i10 = runningAppProcessInfo4.importance;
                            int i11 = runningAppProcessInfo3.importance;
                            int i12 = runningAppProcessInfo4.importanceReasonCode;
                            int i13 = runningAppProcessInfo4.importanceReasonPid;
                            ComponentName componentName = runningAppProcessInfo4.importanceReasonComponent;
                            if (componentName == null) {
                                str = null;
                            } else {
                                str = componentName.toShortString();
                            }
                            Long valueOf = Long.valueOf(j10);
                            List list = pVar.f8679o;
                            Long l14 = v.f8693e;
                            if (l14 == null) {
                                l12 = null;
                            } else {
                                l12 = Long.valueOf(l14.longValue() - uptimeMillis2);
                            }
                            Long l15 = v.f8694f;
                            if (l15 == null) {
                                l13 = null;
                            } else {
                                l13 = Long.valueOf(l15.longValue() - uptimeMillis2);
                            }
                            v.f8691c = new Hi.c(j11, uptimeMillis2, l10, j12, j13, i10, i11, i12, i13, str, iVar, l11, valueOf, list, l12, l13, null, Hi.f.f7863h, null, null, null, null, null, null, null, null, null, null, null, null, null, kf.w.f37484Y);
                            Looper.myQueue().addIdleHandler(new Object());
                            application.registerActivityLifecycleCallbacks(new A(new kh.j(4, sharedPreferences), new u(j6, iVar, uptimeMillis, elapsedRealtime)));
                            t tVar = t.f8683h0;
                            final C0799d c0799d = new C0799d(application);
                            Executors.newSingleThreadExecutor(new Object()).execute(new Q1.n(c0799d, new Handler(Looper.getMainLooper()), tVar, 21));
                            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: Ii.c
                                @Override // java.lang.Thread.UncaughtExceptionHandler
                                public final void uncaughtException(Thread thread, Throwable th3) {
                                    C0799d c0799d2 = C0799d.this;
                                    AbstractC3557B.c0("$detector", c0799d2);
                                    c0799d2.b().edit().putLong("crash_realtime", SystemClock.elapsedRealtime()).commit();
                                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                                    if (uncaughtExceptionHandler != null) {
                                        uncaughtExceptionHandler.uncaughtException(thread, th3);
                                    }
                                }
                            });
                            AbstractC0804i.b(handler, C0800e.f8644i0);
                            return;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
                if (bVar == null) {
                    bVar = new o(new RuntimeException("ActivityManager.getRunningAppProcesses() returned null"));
                }
                if (bVar instanceof o) {
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        AbstractC3557B.c0("uri", uri);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        AbstractC3557B.c0("uri", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        AbstractC3557B.c0("uri", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.b.c(this);
        io.sentry.android.core.performance.b.d(this);
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC3557B.c0("uri", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC3557B.c0("uri", uri);
        return 0;
    }
}
