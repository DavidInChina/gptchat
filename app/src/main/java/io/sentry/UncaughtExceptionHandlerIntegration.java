package io.sentry;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.io.Closeable;
import java.lang.Thread;

/* loaded from: classes2.dex */
public final class UncaughtExceptionHandlerIntegration implements X, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f33871Y;

    /* renamed from: Z  reason: collision with root package name */
    public G f33872Z;

    /* renamed from: h0  reason: collision with root package name */
    public r1 f33873h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f33874i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public final L1 f33875j0;

    public UncaughtExceptionHandlerIntegration() {
        C3680q0 c3680q0 = C3680q0.f34688e;
        this.f33875j0 = c3680q0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        L1 l12 = this.f33875j0;
        ((C3680q0) l12).getClass();
        if (this == Thread.getDefaultUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f33871Y;
            ((C3680q0) l12).getClass();
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            r1 r1Var = this.f33873h0;
            if (r1Var != null) {
                r1Var.getLogger().f(EnumC3642e1.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        A a5 = A.f33710a;
        if (this.f33874i0) {
            r1Var.getLogger().f(EnumC3642e1.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f33874i0 = true;
        this.f33872Z = a5;
        this.f33873h0 = r1Var;
        H logger = r1Var.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f33873h0.isEnableUncaughtExceptionHandler()));
        if (this.f33873h0.isEnableUncaughtExceptionHandler()) {
            C3680q0 c3680q0 = (C3680q0) this.f33875j0;
            c3680q0.getClass();
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                H logger2 = this.f33873h0.getLogger();
                logger2.f(enumC3642e1, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + Separators.QUOTE, new Object[0]);
                this.f33871Y = defaultUncaughtExceptionHandler;
            }
            c3680q0.getClass();
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.f33873h0.getLogger().f(enumC3642e1, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            r.f.e(UncaughtExceptionHandlerIntegration.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, io.sentry.protocol.k] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        io.sentry.protocol.s sVar;
        r1 r1Var = this.f33873h0;
        if (r1Var != null && this.f33872Z != null) {
            r1Var.getLogger().f(EnumC3642e1.INFO, "Uncaught exception received.", new Object[0]);
            try {
                M1 m12 = new M1(this.f33873h0.getFlushTimeoutMillis(), this.f33873h0.getLogger());
                ?? obj = new Object();
                obj.f34568i0 = Boolean.FALSE;
                obj.f34565Y = "UncaughtExceptionHandler";
                Z0 z02 = new Z0(new io.sentry.exception.a(obj, th2, thread, false));
                z02.f33904z0 = EnumC3642e1.FATAL;
                if (this.f33872Z.v() == null && (sVar = z02.f33836Y) != null) {
                    m12.f(sVar);
                }
                C3686u t02 = AbstractC3557B.t0(m12);
                boolean equals = this.f33872Z.C(z02, t02).equals(io.sentry.protocol.s.f34619Z);
                io.sentry.hints.e eVar = (io.sentry.hints.e) t02.b(io.sentry.hints.e.class, "sentry:eventDropReason");
                if ((!equals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVar)) && !m12.d()) {
                    this.f33873h0.getLogger().f(EnumC3642e1.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", z02.f33836Y);
                }
            } catch (Throwable th3) {
                this.f33873h0.getLogger().d(EnumC3642e1.ERROR, "Error sending uncaught exception to Sentry.", th3);
            }
            if (this.f33871Y != null) {
                this.f33873h0.getLogger().f(EnumC3642e1.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
                this.f33871Y.uncaughtException(thread, th2);
            } else if (this.f33873h0.isPrintUncaughtStackTrace()) {
                th2.printStackTrace();
            }
        }
    }
}
