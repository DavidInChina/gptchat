package w6;

import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.Window;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kf.s;
import o1.Window$OnFrameMetricsAvailableListenerC4899n;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes.dex */
public final class f implements Application.ActivityLifecycleCallbacks, r3.h {

    /* renamed from: p0  reason: collision with root package name */
    public static final double f48046p0 = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: Y  reason: collision with root package name */
    public final m f48047Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5091c f48048Z;

    /* renamed from: h0  reason: collision with root package name */
    public final i f48049h0;

    /* renamed from: j0  reason: collision with root package name */
    public final R4.a f48051j0;

    /* renamed from: m0  reason: collision with root package name */
    public Display f48054m0;

    /* renamed from: n0  reason: collision with root package name */
    public Window$OnFrameMetricsAvailableListenerC4899n f48055n0;

    /* renamed from: i0  reason: collision with root package name */
    public double f48050i0 = 60.0d;

    /* renamed from: k0  reason: collision with root package name */
    public final WeakHashMap f48052k0 = new WeakHashMap();

    /* renamed from: l0  reason: collision with root package name */
    public final WeakHashMap f48053l0 = new WeakHashMap();

    /* renamed from: o0  reason: collision with root package name */
    public long f48056o0 = 16666666;

    /* JADX WARN: Type inference failed for: r1v0, types: [R4.a, java.lang.Object] */
    public f(m mVar, AbstractC5091c abstractC5091c) {
        g gVar = h.f48057a;
        ?? obj = new Object();
        AbstractC3557B.c0("vitalObserver", mVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f48047Y = mVar;
        this.f48048Z = abstractC5091c;
        this.f48049h0 = gVar;
        this.f48051j0 = obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        WeakHashMap weakHashMap = this.f48053l0;
        Collection collection = (Collection) weakHashMap.get(activity.getWindow());
        if (collection == null || collection.isEmpty()) {
            this.f48052k0.remove(activity.getWindow());
            weakHashMap.remove(activity.getWindow());
            this.f48051j0.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                Window window = activity.getWindow();
                AbstractC3557B.b0("activity.window", window);
                try {
                    window.removeOnFrameMetricsAvailableListener(this.f48055n0);
                } catch (IllegalArgumentException e10) {
                    P4.a.m0(this.f48048Z, 5, EnumC5090b.f42739Z, c.f48039m0, e10, false, 48);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("outState", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i10;
        r3.i iVar;
        AbstractC3557B.c0("activity", activity);
        Window window = activity.getWindow();
        AbstractC3557B.b0("window", window);
        WeakHashMap weakHashMap = this.f48053l0;
        List list = (List) weakHashMap.get(window);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(new WeakReference(activity));
        weakHashMap.put(window, list);
        WeakHashMap weakHashMap2 = this.f48052k0;
        boolean containsKey = weakHashMap2.containsKey(window);
        r3.i iVar2 = (r3.i) weakHashMap2.get(window);
        EnumC5090b enumC5090b = EnumC5090b.f42739Z;
        if (iVar2 != null) {
            i10 = 1;
            P4.a.m0(this.f48048Z, 2, enumC5090b, new e(window, 1), null, false, 56);
            iVar2.f44402b.R2(true);
            iVar2.f44403c = true;
        } else {
            i10 = 1;
            P4.a.m0(this.f48048Z, 2, enumC5090b, new e(window, 2), null, false, 56);
            ((g) this.f48049h0).getClass();
            AbstractC5091c abstractC5091c = this.f48048Z;
            AbstractC3557B.c0("internalLogger", abstractC5091c);
            try {
                iVar = new r3.i(window, this);
            } catch (IllegalStateException e10) {
                P4.a.m0(abstractC5091c, 5, enumC5090b, c.f48040n0, e10, false, 48);
                iVar = null;
            }
            if (iVar == null) {
                P4.a.m0(this.f48048Z, 4, enumC5090b, c.f48038l0, null, false, 56);
            } else {
                weakHashMap2.put(window, iVar);
            }
        }
        this.f48051j0.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 && !containsKey) {
            if (this.f48055n0 == null) {
                this.f48055n0 = new Window$OnFrameMetricsAvailableListenerC4899n(i10, this);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null && peekDecorView.isHardwareAccelerated() == i10) {
                Window$OnFrameMetricsAvailableListenerC4899n window$OnFrameMetricsAvailableListenerC4899n = this.f48055n0;
                if (window$OnFrameMetricsAvailableListenerC4899n != null) {
                    try {
                        window.addOnFrameMetricsAvailableListener(window$OnFrameMetricsAvailableListenerC4899n, handler);
                        return;
                    } catch (IllegalStateException e11) {
                        P4.a.m0(this.f48048Z, 5, enumC5090b, c.f48036j0, e11, false, 48);
                        return;
                    }
                }
                return;
            }
            P4.a.m0(this.f48048Z, 4, enumC5090b, c.f48037k0, null, false, 56);
        } else if (this.f48054m0 == null && i11 == 30) {
            Object systemService = activity.getSystemService("display");
            AbstractC3557B.a0("null cannot be cast to non-null type android.hardware.display.DisplayManager", systemService);
            this.f48054m0 = ((DisplayManager) systemService).getDisplay(0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        AbstractC3557B.c0("activity", activity);
        Window window = activity.getWindow();
        WeakHashMap weakHashMap = this.f48053l0;
        boolean containsKey = weakHashMap.containsKey(window);
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        if (!containsKey) {
            P4.a.m0(this.f48048Z, 4, enumC5090b2, c.f48033Z, null, false, 56);
        }
        List list = (List) weakHashMap.get(window);
        if (list == null) {
            list = new ArrayList();
        }
        s.R1(new d(activity, 0), list);
        weakHashMap.put(window, list);
        if (list.isEmpty()) {
            P4.a.m0(this.f48048Z, 2, enumC5090b2, new e(window, 0), null, false, 56);
            try {
                r3.i iVar = (r3.i) this.f48052k0.get(window);
                if (iVar != null) {
                    if (iVar.f44403c) {
                        iVar.f44402b.R2(false);
                        iVar.f44403c = false;
                    } else {
                        P4.a.m0(this.f48048Z, 5, enumC5090b, c.f48034h0, null, false, 56);
                    }
                }
            } catch (IllegalArgumentException e10) {
                P4.a.m0(this.f48048Z, 5, enumC5090b, c.f48035i0, e10, false, 48);
            }
        }
    }
}
