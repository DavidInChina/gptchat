package io.sentry.android.core;

import android.content.Context;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class AnrIntegration implements X, Closeable {

    /* renamed from: j0  reason: collision with root package name */
    public static C3610a f33935j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final Object f33936k0 = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final Context f33937Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f33938Z = false;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f33939h0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public r1 f33940i0;

    public AnrIntegration(Context context) {
        this.f33937Y = context;
    }

    public final void a(io.sentry.G g10, SentryAndroidOptions sentryAndroidOptions) {
        synchronized (f33936k0) {
            try {
                if (f33935j0 == null) {
                    io.sentry.H logger = sentryAndroidOptions.getLogger();
                    EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
                    logger.f(enumC3642e1, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    C3610a c3610a = new C3610a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C3617h(this, g10, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f33937Y);
                    f33935j0 = c3610a;
                    c3610a.start();
                    sentryAndroidOptions.getLogger().f(enumC3642e1, "AnrIntegration installed.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33939h0) {
            this.f33938Z = true;
        }
        synchronized (f33936k0) {
            try {
                C3610a c3610a = f33935j0;
                if (c3610a != null) {
                    c3610a.interrupt();
                    f33935j0 = null;
                    r1 r1Var = this.f33940i0;
                    if (r1Var != null) {
                        r1Var.getLogger().f(EnumC3642e1.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        this.f33940i0 = r1Var;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            r.f.e(AnrIntegration.class);
            try {
                sentryAndroidOptions.getExecutorService().submit(new Q(this, sentryAndroidOptions, 2));
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().d(EnumC3642e1.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }
}
