package io.sentry.android.ndk;

import io.sentry.C3636c1;
import io.sentry.android.core.SentryAndroidOptions;

/* loaded from: classes2.dex */
public final class SentryNdk {
    static {
        System.loadLibrary("log");
        System.loadLibrary("sentry");
        System.loadLibrary("sentry-android");
    }

    private SentryNdk() {
    }

    public static void close() {
        shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.sentry.android.core.I, java.lang.Object] */
    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.getSdkVersion() != null) {
            C3636c1.l().c("maven:io.sentry:sentry-android-ndk");
        }
        initSentryNative(sentryAndroidOptions);
        if (sentryAndroidOptions.isEnableScopeSync()) {
            sentryAndroidOptions.addScopeObserver(new b(sentryAndroidOptions));
        }
        sentryAndroidOptions.setDebugImagesLoader(new Object());
    }

    private static native void initSentryNative(SentryAndroidOptions sentryAndroidOptions);

    private static native void shutdown();
}
