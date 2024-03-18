package io.sentry.android.core;

import V1.C1465f;
import io.sentry.EnumC3642e1;
import io.sentry.EnumC3652i;
import io.sentry.I0;
import io.sentry.X;
import io.sentry.r1;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34021Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f34022Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f34023h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f34024i0;

    public /* synthetic */ Q(X x10, r1 r1Var, int i10) {
        io.sentry.A a5 = io.sentry.A.f33710a;
        this.f34021Y = i10;
        this.f34022Z = x10;
        this.f34024i0 = a5;
        this.f34023h0 = r1Var;
    }

    private final void a() {
        AnrIntegration anrIntegration = (AnrIntegration) this.f34022Z;
        io.sentry.G g10 = (io.sentry.G) this.f34024i0;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f34023h0;
        synchronized (anrIntegration.f33939h0) {
            try {
                if (!anrIntegration.f33938Z) {
                    anrIntegration.a(g10, sentryAndroidOptions);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        PhoneStateBreadcrumbsIntegration phoneStateBreadcrumbsIntegration = (PhoneStateBreadcrumbsIntegration) this.f34022Z;
        io.sentry.G g10 = (io.sentry.G) this.f34024i0;
        r1 r1Var = (r1) this.f34023h0;
        synchronized (phoneStateBreadcrumbsIntegration.f34020k0) {
            try {
                if (!phoneStateBreadcrumbsIntegration.f34019j0) {
                    phoneStateBreadcrumbsIntegration.a(g10, r1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34021Y) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f34022Z;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f34023h0;
                io.sentry.G g10 = (io.sentry.G) this.f34024i0;
                sendCachedEnvelopeIntegration.getClass();
                try {
                    if (sendCachedEnvelopeIntegration.f34038n0.get()) {
                        sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.f34037m0.getAndSet(true)) {
                        io.sentry.D connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f34033i0 = connectionStatusProvider;
                        connectionStatusProvider.i(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.f34036l0 = ((I0) sendCachedEnvelopeIntegration.f34030Y).a(g10, sentryAndroidOptions);
                    }
                    io.sentry.D d10 = sendCachedEnvelopeIntegration.f34033i0;
                    if (d10 != null && d10.g() == io.sentry.B.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    io.sentry.transport.o e10 = g10.e();
                    if (e10 != null && e10.b(EnumC3652i.All)) {
                        sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    C1465f c1465f = sendCachedEnvelopeIntegration.f34036l0;
                    if (c1465f == null) {
                        sentryAndroidOptions.getLogger().f(EnumC3642e1.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        c1465f.a();
                        return;
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Failed trying to send cached events.", th2);
                    return;
                }
            case 1:
                C3614e c3614e = (C3614e) this.f34022Z;
                Runnable runnable = (Runnable) this.f34023h0;
                String str = (String) this.f34024i0;
                c3614e.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        c3614e.f34094b.getLogger().f(EnumC3642e1.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                a();
                return;
            case 3:
                b();
                return;
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f34022Z;
                io.sentry.G g11 = (io.sentry.G) this.f34024i0;
                r1 r1Var = (r1) this.f34023h0;
                synchronized (systemEventsBreadcrumbsIntegration.f34044k0) {
                    try {
                        if (!systemEventsBreadcrumbsIntegration.f34043j0) {
                            systemEventsBreadcrumbsIntegration.a(g11, (SentryAndroidOptions) r1Var);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public /* synthetic */ Q(Object obj, Object obj2, Object obj3, int i10) {
        this.f34021Y = i10;
        this.f34022Z = obj;
        this.f34023h0 = obj2;
        this.f34024i0 = obj3;
    }
}
