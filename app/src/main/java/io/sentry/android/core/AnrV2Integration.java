package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class AnrV2Integration implements X, Closeable {

    /* renamed from: h0  reason: collision with root package name */
    public static final long f33941h0 = TimeUnit.DAYS.toMillis(91);

    /* renamed from: Y  reason: collision with root package name */
    public final Context f33942Y;

    /* renamed from: Z  reason: collision with root package name */
    public SentryAndroidOptions f33943Z;

    public AnrV2Integration(Context context) {
        this.f33942Y = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f33943Z;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "AnrV2Integration removed.", new Object[0]);
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
        this.f33943Z = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f33943Z.isAnrEnabled()));
        if (this.f33943Z.getCacheDirPath() == null) {
            this.f33943Z.getLogger().f(EnumC3642e1.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
        } else if (this.f33943Z.isAnrEnabled()) {
            try {
                r1Var.getExecutorService().submit(new w(this.f33942Y, this.f33943Z));
            } catch (Throwable th2) {
                r1Var.getLogger().d(EnumC3642e1.DEBUG, "Failed to start AnrProcessor.", th2);
            }
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "AnrV2Integration installed.", new Object[0]);
            r.f.e(getClass());
        }
    }
}
