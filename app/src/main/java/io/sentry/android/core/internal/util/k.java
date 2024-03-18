package io.sentry.android.core.internal.util;

import Ad.l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Window;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.android.core.B;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import r3.m;
import u5.RunnableC5841a;

/* loaded from: classes2.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s0  reason: collision with root package name */
    public static final long f34179s0 = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: t0  reason: collision with root package name */
    public static final long f34180t0 = TimeUnit.MILLISECONDS.toNanos(700);

    /* renamed from: u0  reason: collision with root package name */
    public static final /* synthetic */ int f34181u0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final B f34182Y;

    /* renamed from: h0  reason: collision with root package name */
    public final H f34184h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Handler f34185i0;

    /* renamed from: j0  reason: collision with root package name */
    public WeakReference f34186j0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f34188l0;

    /* renamed from: m0  reason: collision with root package name */
    public final b f34189m0;

    /* renamed from: n0  reason: collision with root package name */
    public final m f34190n0;

    /* renamed from: o0  reason: collision with root package name */
    public Choreographer f34191o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Field f34192p0;

    /* renamed from: Z  reason: collision with root package name */
    public final CopyOnWriteArraySet f34183Z = new CopyOnWriteArraySet();

    /* renamed from: k0  reason: collision with root package name */
    public final ConcurrentHashMap f34187k0 = new ConcurrentHashMap();

    /* renamed from: q0  reason: collision with root package name */
    public long f34193q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public long f34194r0 = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.android.core.internal.util.b, java.lang.Object] */
    public k(Context context, final H h10, B b10) {
        ?? obj = new Object();
        this.f34188l0 = false;
        l.Z0("The context is required", context);
        this.f34184h0 = h10;
        this.f34182Y = b10;
        this.f34189m0 = obj;
        if ((context instanceof Application) && Build.VERSION.SDK_INT >= 24) {
            this.f34188l0 = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.i
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    H.this.d(EnumC3642e1.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f34185i0 = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new RunnableC5841a(this, 19, h10));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f34192p0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                h10.d(EnumC3642e1.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.f34190n0 = new m(this, 1, b10);
        }
    }

    public final void a(String str) {
        Window window;
        if (!this.f34188l0) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f34187k0;
        if (str != null) {
            concurrentHashMap.remove(str);
        }
        WeakReference weakReference = this.f34186j0;
        if (weakReference != null) {
            window = (Window) weakReference.get();
        } else {
            window = null;
        }
        if (window != null && concurrentHashMap.isEmpty()) {
            b(window);
        }
    }

    public final void b(Window window) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f34183Z;
        if (copyOnWriteArraySet.contains(window)) {
            this.f34182Y.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    b bVar = this.f34189m0;
                    m mVar = this.f34190n0;
                    bVar.getClass();
                    window.removeOnFrameMetricsAvailableListener(mVar);
                } catch (Exception e10) {
                    this.f34184h0.d(EnumC3642e1.ERROR, "Failed to remove frameMetricsAvailableListener", e10);
                }
            }
            copyOnWriteArraySet.remove(window);
        }
    }

    public final void c() {
        Window window;
        Handler handler;
        WeakReference weakReference = this.f34186j0;
        if (weakReference != null) {
            window = (Window) weakReference.get();
        } else {
            window = null;
        }
        if (window != null && this.f34188l0) {
            CopyOnWriteArraySet copyOnWriteArraySet = this.f34183Z;
            if (!copyOnWriteArraySet.contains(window) && !this.f34187k0.isEmpty()) {
                this.f34182Y.getClass();
                if (Build.VERSION.SDK_INT >= 24 && (handler = this.f34185i0) != null) {
                    copyOnWriteArraySet.add(window);
                    m mVar = this.f34190n0;
                    this.f34189m0.getClass();
                    window.addOnFrameMetricsAvailableListener(mVar, handler);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f34186j0;
        if (weakReference == null || weakReference.get() != window) {
            this.f34186j0 = new WeakReference(window);
            c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        b(activity.getWindow());
        WeakReference weakReference = this.f34186j0;
        if (weakReference != null && weakReference.get() == activity.getWindow()) {
            this.f34186j0 = null;
        }
    }
}
