package io.sentry.android.core;

import V1.C1465f;
import io.sentry.EnumC3642e1;
import io.sentry.H0;
import io.sentry.I0;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SendCachedEnvelopeIntegration implements X, io.sentry.C, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final H0 f34030Y;

    /* renamed from: Z  reason: collision with root package name */
    public final U3.l f34031Z;

    /* renamed from: i0  reason: collision with root package name */
    public io.sentry.D f34033i0;

    /* renamed from: j0  reason: collision with root package name */
    public io.sentry.G f34034j0;

    /* renamed from: k0  reason: collision with root package name */
    public SentryAndroidOptions f34035k0;

    /* renamed from: l0  reason: collision with root package name */
    public C1465f f34036l0;

    /* renamed from: h0  reason: collision with root package name */
    public final AtomicBoolean f34032h0 = new AtomicBoolean(false);

    /* renamed from: m0  reason: collision with root package name */
    public final AtomicBoolean f34037m0 = new AtomicBoolean(false);

    /* renamed from: n0  reason: collision with root package name */
    public final AtomicBoolean f34038n0 = new AtomicBoolean(false);

    public SendCachedEnvelopeIntegration(I0 i02, U3.l lVar) {
        this.f34030Y = i02;
        this.f34031Z = lVar;
    }

    @Override // io.sentry.C
    public final void a() {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.G g10 = this.f34034j0;
        if (g10 != null && (sentryAndroidOptions = this.f34035k0) != null) {
            i(g10, sentryAndroidOptions);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34038n0.set(true);
        io.sentry.D d10 = this.f34033i0;
        if (d10 != null) {
            d10.k(this);
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.A a5 = io.sentry.A.f33710a;
        this.f34034j0 = a5;
        if (r1Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        } else {
            sentryAndroidOptions = null;
        }
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f34035k0 = sentryAndroidOptions;
        String cacheDirPath = r1Var.getCacheDirPath();
        io.sentry.H logger = r1Var.getLogger();
        switch (((I0) this.f34030Y).f33799a) {
            case 0:
                if (cacheDirPath == null || cacheDirPath.isEmpty()) {
                    logger.f(EnumC3642e1.INFO, "No cached dir path is defined in options.", new Object[0]);
                    r1Var.getLogger().f(EnumC3642e1.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    return;
                }
                i(a5, this.f34035k0);
                return;
            default:
                if (cacheDirPath == null || cacheDirPath.isEmpty()) {
                    logger.f(EnumC3642e1.INFO, "No cached dir path is defined in options.", new Object[0]);
                    r1Var.getLogger().f(EnumC3642e1.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    return;
                }
                i(a5, this.f34035k0);
                return;
        }
    }

    public final synchronized void i(io.sentry.G g10, SentryAndroidOptions sentryAndroidOptions) {
        try {
            try {
                Future submit = sentryAndroidOptions.getExecutorService().submit(new Q(this, sentryAndroidOptions, g10, 0));
                if (((Boolean) this.f34031Z.m()).booleanValue() && this.f34032h0.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        submit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }
}
