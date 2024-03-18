package io.sentry.android.core;

import io.sentry.C3695y0;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class EnvelopeFileObserverIntegration implements X, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public H f33960Y;

    /* renamed from: Z  reason: collision with root package name */
    public io.sentry.H f33961Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f33962h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f33963i0 = new Object();

    /* loaded from: classes.dex */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i10) {
            this();
        }
    }

    public static EnvelopeFileObserverIntegration a() {
        return new OutboxEnvelopeFileObserverIntegration(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33963i0) {
            this.f33962h0 = true;
        }
        H h10 = this.f33960Y;
        if (h10 != null) {
            h10.stopWatching();
            io.sentry.H h11 = this.f33961Z;
            if (h11 != null) {
                h11.f(EnumC3642e1.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        io.sentry.A a5 = io.sentry.A.f33710a;
        this.f33961Z = r1Var.getLogger();
        String outboxPath = r1Var.getOutboxPath();
        if (outboxPath == null) {
            this.f33961Z.f(EnumC3642e1.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f33961Z.f(EnumC3642e1.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            r1Var.getExecutorService().submit(new M3.u(this, a5, r1Var, outboxPath, 5));
        } catch (Throwable th2) {
            this.f33961Z.d(EnumC3642e1.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }

    public final void i(io.sentry.G g10, r1 r1Var, String str) {
        H h10 = new H(str, new C3695y0(g10, r1Var.getEnvelopeReader(), r1Var.getSerializer(), r1Var.getLogger(), r1Var.getFlushTimeoutMillis(), r1Var.getMaxQueueSize()), r1Var.getLogger(), r1Var.getFlushTimeoutMillis());
        this.f33960Y = h10;
        try {
            h10.startWatching();
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th2) {
            r1Var.getLogger().d(EnumC3642e1.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }
}
