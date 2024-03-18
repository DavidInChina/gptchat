package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import i8.C3493k;
import io.sentry.EnumC3642e1;
import io.sentry.I0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import xe.C6431t;

/* renamed from: io.sentry.android.core.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3623n {
    public static void a(Context context, SentryAndroidOptions sentryAndroidOptions, B b10, C6431t c6431t, C3614e c3614e, boolean z10, boolean z11) {
        U3.l lVar = new U3.l(new C3493k(3, sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new I0(new C3622m(sentryAndroidOptions, 0), 0), lVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(C6431t.m("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.a());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new I0(new C3622m(sentryAndroidOptions, 1), 1), lVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(AbstractC3612c.b(context, b10));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, b10, c3614e));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application));
            if (z10) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z11) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, sentryAndroidOptions.getLogger(), b10));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
    }
}
