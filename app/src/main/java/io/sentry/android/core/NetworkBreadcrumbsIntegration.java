package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements X, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f34007Y;

    /* renamed from: Z  reason: collision with root package name */
    public final B f34008Z;

    /* renamed from: h0  reason: collision with root package name */
    public final io.sentry.H f34009h0;

    /* renamed from: i0  reason: collision with root package name */
    public M f34010i0;

    public NetworkBreadcrumbsIntegration(Context context, io.sentry.H h10, B b10) {
        this.f34007Y = context;
        this.f34008Z = b10;
        Ad.l.Z0("ILogger is required", h10);
        this.f34009h0 = h10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        M m10 = this.f34010i0;
        if (m10 != null) {
            this.f34008Z.getClass();
            Context context = this.f34007Y;
            io.sentry.H h10 = this.f34009h0;
            ConnectivityManager y10 = U3.i.y(context, h10);
            if (y10 != null) {
                try {
                    y10.unregisterNetworkCallback(m10);
                } catch (Throwable th2) {
                    h10.d(EnumC3642e1.WARNING, "unregisterNetworkCallback failed", th2);
                }
            }
            h10.f(EnumC3642e1.DEBUG, "NetworkBreadcrumbsIntegration remove.", new Object[0]);
        }
        this.f34010i0 = null;
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions;
        if (r1Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        } else {
            sentryAndroidOptions = null;
        }
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        Object[] objArr = {Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs())};
        io.sentry.H h10 = this.f34009h0;
        h10.f(enumC3642e1, "NetworkBreadcrumbsIntegration enabled: %s", objArr);
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            B b10 = this.f34008Z;
            b10.getClass();
            M m10 = new M(b10, r1Var.getDateProvider());
            this.f34010i0 = m10;
            if (!U3.i.H(this.f34007Y, h10, b10, m10)) {
                this.f34010i0 = null;
                h10.f(enumC3642e1, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                return;
            }
            h10.f(enumC3642e1, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
            r.f.e(NetworkBreadcrumbsIntegration.class);
        }
    }
}
