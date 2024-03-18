package io.sentry.android.core;

import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class NdkIntegration implements X, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Class f34005Y;

    /* renamed from: Z  reason: collision with root package name */
    public SentryAndroidOptions f34006Z;

    public NdkIntegration(Class cls) {
        this.f34005Y = cls;
    }

    public static void a(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f34006Z;
        if (sentryAndroidOptions != null && sentryAndroidOptions.isEnableNdk()) {
            Class cls = this.f34005Y;
            try {
                if (cls != null) {
                    try {
                        cls.getMethod("close", new Class[0]).invoke(null, new Object[0]);
                        this.f34006Z.getLogger().f(EnumC3642e1.DEBUG, "NdkIntegration removed.", new Object[0]);
                    } catch (NoSuchMethodException e10) {
                        this.f34006Z.getLogger().d(EnumC3642e1.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                        a(this.f34006Z);
                    } catch (Throwable th2) {
                        this.f34006Z.getLogger().d(EnumC3642e1.ERROR, "Failed to close SentryNdk.", th2);
                        a(this.f34006Z);
                    }
                    a(this.f34006Z);
                }
            } catch (Throwable th3) {
                a(this.f34006Z);
                throw th3;
            }
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions;
        Class cls;
        if (r1Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        } else {
            sentryAndroidOptions = null;
        }
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f34006Z = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        io.sentry.H logger = this.f34006Z.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (isEnableNdk && (cls = this.f34005Y) != null) {
            if (this.f34006Z.getCacheDirPath() == null) {
                this.f34006Z.getLogger().f(EnumC3642e1.ERROR, "No cache dir path is defined in options.", new Object[0]);
                a(this.f34006Z);
                return;
            }
            try {
                cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f34006Z);
                this.f34006Z.getLogger().f(enumC3642e1, "NdkIntegration installed.", new Object[0]);
                r.f.e(NdkIntegration.class);
                return;
            } catch (NoSuchMethodException e10) {
                a(this.f34006Z);
                this.f34006Z.getLogger().d(EnumC3642e1.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
                return;
            } catch (Throwable th2) {
                a(this.f34006Z);
                this.f34006Z.getLogger().d(EnumC3642e1.ERROR, "Failed to initialize SentryNdk.", th2);
                return;
            }
        }
        a(this.f34006Z);
    }
}
