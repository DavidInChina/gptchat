package io.sentry.cache;

import io.sentry.J;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.r1;

/* loaded from: classes.dex */
public final class e implements J {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f34295a;

    public e(r1 r1Var) {
        this.f34295a = r1Var;
    }

    public static Object a(SentryAndroidOptions sentryAndroidOptions, String str, Class cls) {
        return a.b(sentryAndroidOptions, ".options-cache", str, cls, null);
    }

    public final void b(String str, Object obj) {
        a.c(this.f34295a, obj, ".options-cache", str);
    }
}
