package T5;

import Lg.n;
import M3.F;
import Q5.e;
import android.content.Context;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kf.q;
import kf.v;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import r5.d;
import u5.g;
import x5.C6275a;
import x5.C6276b;
import y5.h;

/* loaded from: classes2.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: Y  reason: collision with root package name */
    public final d f16919Y;

    /* renamed from: Z  reason: collision with root package name */
    public final WeakReference f16920Z;

    /* renamed from: h0  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f16921h0;

    public c(d dVar, Context context) {
        AbstractC3557B.c0("sdkCore", dVar);
        this.f16919Y = dVar;
        this.f16920Z = new WeakReference(context);
    }

    public static String a(Throwable th2) {
        String message = th2.getMessage();
        if (message == null || n.n2(message)) {
            String canonicalName = th2.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = th2.getClass().getSimpleName();
            }
            return "Application crash detected: ".concat(canonicalName);
        }
        return message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [kf.v] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        ?? r02;
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5091c abstractC5091c;
        boolean z10;
        String str;
        String str2;
        boolean z11;
        EnumC5090b enumC5090b = EnumC5090b.f42739Z;
        d dVar = this.f16919Y;
        AbstractC3557B.c0("t", thread);
        AbstractC3557B.c0("e", th2);
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            AbstractC3557B.b0("getAllStackTraces()", allStackTraces);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                StackTraceElement[] value = entry.getValue();
                AbstractC3557B.b0("it", value);
                if (value.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            r02 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Thread thread2 = (Thread) entry2.getKey();
                boolean K10 = AbstractC3557B.K(thread2, thread);
                if (K10) {
                    str = AbstractC4344b.J0(th2);
                } else {
                    StackTraceElement[] stackTrace = thread2.getStackTrace();
                    AbstractC3557B.b0("thread.stackTrace", stackTrace);
                    str = q.r3(stackTrace, Separators.RETURN, null, null, e.f14435Y, 30);
                }
                String name = thread2.getName();
                AbstractC3557B.b0("thread.name", name);
                Thread.State state = thread2.getState();
                AbstractC3557B.b0("thread.state", state);
                switch (Q5.d.f14434a[state.ordinal()]) {
                    case 1:
                        str2 = "new";
                        break;
                    case 2:
                        str2 = "blocked";
                        break;
                    case 3:
                        str2 = "runnable";
                        break;
                    case 4:
                        str2 = "terminated";
                        break;
                    case 5:
                        str2 = "timed_waiting";
                        break;
                    case 6:
                        str2 = "waiting";
                        break;
                    default:
                        throw new RuntimeException();
                }
                r02.add(new x5.c(name, str2, K10, str));
            }
        } catch (SecurityException e10) {
            P4.a.m0(dVar.l(), 5, enumC5090b, b.f16914Z, e10, false, 48);
            r02 = v.f37483Y;
        }
        AbstractC5368c h10 = dVar.h("logs");
        EnumC5090b enumC5090b2 = EnumC5090b.f42738Y;
        if (h10 != null) {
            String name2 = thread.getName();
            AbstractC3557B.b0("t.name", name2);
            ((h) h10).a(new C6275a(name2, th2, System.currentTimeMillis(), a(th2), r02));
        } else {
            P4.a.m0(dVar.l(), 3, enumC5090b2, b.f16915h0, null, false, 56);
        }
        AbstractC5368c h11 = dVar.h("rum");
        if (h11 != null) {
            ((h) h11).a(new C6276b(a(th2), th2, r02));
        } else {
            P4.a.m0(dVar.l(), 3, enumC5090b2, b.f16916i0, null, false, 56);
        }
        if (dVar instanceof g) {
            ExecutorService n10 = ((g) dVar).n();
            if (n10 instanceof ThreadPoolExecutor) {
                threadPoolExecutor = (ThreadPoolExecutor) n10;
            } else {
                threadPoolExecutor = null;
            }
            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
            if (threadPoolExecutor2 != null) {
                AbstractC5091c l10 = dVar.l();
                AbstractC3557B.c0("internalLogger", l10);
                long nanoTime = System.nanoTime();
                long nanos = TimeUnit.MILLISECONDS.toNanos(100L);
                long q10 = N.q(100L, 0L, 10L);
                while (threadPoolExecutor2.getTaskCount() - threadPoolExecutor2.getCompletedTaskCount() > 0) {
                    try {
                        Thread.sleep(q10);
                        abstractC5091c = l10;
                    } catch (IllegalArgumentException e11) {
                        abstractC5091c = l10;
                        P4.a.m0(l10, 4, enumC5090b, N5.c.f12716j0, e11, false, 48);
                    } catch (InterruptedException unused) {
                        abstractC5091c = l10;
                        try {
                            Thread.currentThread().interrupt();
                        } catch (SecurityException e12) {
                            P4.a.m0(abstractC5091c, 5, enumC5090b, N5.c.f12715i0, e12, false, 48);
                        }
                        z10 = true;
                    }
                    z10 = false;
                    if (System.nanoTime() - nanoTime < nanos && !z10) {
                        l10 = abstractC5091c;
                    } else if (threadPoolExecutor2.getTaskCount() - threadPoolExecutor2.getCompletedTaskCount() > 0) {
                        P4.a.m0(dVar.l(), 4, enumC5090b2, b.f16917j0, null, false, 56);
                    }
                }
            }
        }
        Context context = (Context) this.f16920Z.get();
        if (context != null && F.f0() != null) {
            AbstractC4828h.u0(context, dVar.l());
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16921h0;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
