package io.sentry.android.core.performance;

import U3.n;
import android.content.ContentProvider;
import android.os.SystemClock;
import io.sentry.U;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final long f34206i = SystemClock.uptimeMillis();

    /* renamed from: j  reason: collision with root package name */
    public static volatile b f34207j;

    /* renamed from: a  reason: collision with root package name */
    public a f34208a = a.UNKNOWN;

    /* renamed from: g  reason: collision with root package name */
    public U f34214g = null;

    /* renamed from: h  reason: collision with root package name */
    public n f34215h = null;

    /* renamed from: b  reason: collision with root package name */
    public final c f34209b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final c f34210c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final c f34211d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f34212e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f34213f = new ArrayList();

    public static b b() {
        if (f34207j == null) {
            synchronized (b.class) {
                try {
                    if (f34207j == null) {
                        f34207j = new b();
                    }
                } finally {
                }
            }
        }
        return f34207j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, io.sentry.android.core.performance.c] */
    public static void c(ContentProvider contentProvider) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ?? obj = new Object();
        obj.c(uptimeMillis);
        b().f34212e.put(contentProvider, obj);
    }

    public static void d(ContentProvider contentProvider) {
        long uptimeMillis = SystemClock.uptimeMillis();
        c cVar = (c) b().f34212e.get(contentProvider);
        if (cVar != null && cVar.a()) {
            cVar.f34216Y = contentProvider.getClass().getName().concat(".onCreate");
            cVar.f34219i0 = uptimeMillis;
        }
    }

    public final c a(SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            c cVar = this.f34209b;
            if (cVar.b()) {
                return cVar;
            }
        }
        return this.f34210c;
    }
}
