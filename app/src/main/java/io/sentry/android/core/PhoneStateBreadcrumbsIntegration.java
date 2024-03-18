package io.sentry.android.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import id.AbstractC3557B;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class PhoneStateBreadcrumbsIntegration implements X, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f34015Y;

    /* renamed from: Z  reason: collision with root package name */
    public SentryAndroidOptions f34016Z;

    /* renamed from: h0  reason: collision with root package name */
    public P f34017h0;

    /* renamed from: i0  reason: collision with root package name */
    public TelephonyManager f34018i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f34019j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f34020k0 = new Object();

    public PhoneStateBreadcrumbsIntegration(Context context) {
        this.f34015Y = context;
    }

    public final void a(io.sentry.G g10, r1 r1Var) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f34015Y.getSystemService("phone");
        this.f34018i0 = telephonyManager;
        if (telephonyManager != null) {
            try {
                P p10 = new P(g10);
                this.f34017h0 = p10;
                this.f34018i0.listen(p10, 32);
                r1Var.getLogger().f(EnumC3642e1.DEBUG, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                r.f.e(PhoneStateBreadcrumbsIntegration.class);
                return;
            } catch (Throwable th2) {
                r1Var.getLogger().b(EnumC3642e1.INFO, th2, "TelephonyManager is not available or ready to use.", new Object[0]);
                return;
            }
        }
        r1Var.getLogger().f(EnumC3642e1.INFO, "TelephonyManager is not available", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        P p10;
        synchronized (this.f34020k0) {
            this.f34019j0 = true;
        }
        TelephonyManager telephonyManager = this.f34018i0;
        if (telephonyManager != null && (p10 = this.f34017h0) != null) {
            telephonyManager.listen(p10, 0);
            this.f34017h0 = null;
            SentryAndroidOptions sentryAndroidOptions = this.f34016Z;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
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
        this.f34016Z = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f34016Z.isEnableSystemEventBreadcrumbs()));
        if (this.f34016Z.isEnableSystemEventBreadcrumbs() && AbstractC3557B.B1(this.f34015Y, "android.permission.READ_PHONE_STATE")) {
            try {
                r1Var.getExecutorService().submit(new Q(this, r1Var, 3));
            } catch (Throwable th2) {
                r1Var.getLogger().d(EnumC3642e1.DEBUG, "Failed to start PhoneStateBreadcrumbsIntegration on executor thread.", th2);
            }
        }
    }
}
