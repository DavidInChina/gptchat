package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C3640e;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.protocol.EnumC3678e;
import io.sentry.r1;
import java.io.Closeable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements X, Closeable, ComponentCallbacks2 {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f33944Y;

    /* renamed from: Z  reason: collision with root package name */
    public io.sentry.G f33945Z;

    /* renamed from: h0  reason: collision with root package name */
    public SentryAndroidOptions f33946h0;

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f33944Y = context;
    }

    public final void a(Integer num) {
        if (this.f33945Z != null) {
            C3640e c3640e = new C3640e();
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                }
                c3640e.a("level", num);
            }
            c3640e.f34320h0 = "system";
            c3640e.f34322j0 = "device.event";
            c3640e.f34319Z = "Low memory";
            c3640e.a("action", "LOW_MEMORY");
            c3640e.f34323k0 = EnumC3642e1.WARNING;
            this.f33945Z.i(c3640e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f33944Y.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f33946h0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(EnumC3642e1.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f33946h0;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().f(EnumC3642e1.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions;
        this.f33945Z = io.sentry.A.f33710a;
        if (r1Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        } else {
            sentryAndroidOptions = null;
        }
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f33946h0 = sentryAndroidOptions;
        io.sentry.H logger = sentryAndroidOptions.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f33946h0.isEnableAppComponentBreadcrumbs()));
        if (this.f33946h0.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f33944Y.registerComponentCallbacks(this);
                r1Var.getLogger().f(enumC3642e1, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                r.f.e(AppComponentsBreadcrumbsIntegration.class);
            } catch (Throwable th2) {
                this.f33946h0.setEnableAppComponentBreadcrumbs(false);
                r1Var.getLogger().b(EnumC3642e1.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        EnumC3678e enumC3678e;
        String str;
        if (this.f33945Z != null) {
            int i10 = this.f33944Y.getResources().getConfiguration().orientation;
            if (i10 != 1) {
                if (i10 != 2) {
                    enumC3678e = null;
                } else {
                    enumC3678e = EnumC3678e.LANDSCAPE;
                }
            } else {
                enumC3678e = EnumC3678e.PORTRAIT;
            }
            if (enumC3678e != null) {
                str = enumC3678e.name().toLowerCase(Locale.ROOT);
            } else {
                str = "undefined";
            }
            C3640e c3640e = new C3640e();
            c3640e.f34320h0 = "navigation";
            c3640e.f34322j0 = "device.orientation";
            c3640e.a("position", str);
            c3640e.f34323k0 = EnumC3642e1.INFO;
            C3686u c3686u = new C3686u();
            c3686u.c("android:configuration", configuration);
            this.f33945Z.o(c3640e, c3686u);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        a(null);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        a(Integer.valueOf(i10));
    }
}
