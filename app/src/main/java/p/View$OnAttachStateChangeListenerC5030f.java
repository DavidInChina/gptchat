package p;

import D1.C0348e0;
import D1.K;
import D1.Z;
import H0.AbstractC0666a;
import H0.O;
import Ng.AbstractC1073l0;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import com.openai.chatgpt.R;
import i8.C3497o;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import java.util.WeakHashMap;

/* renamed from: p.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC5030f implements View.OnAttachStateChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41554Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f41555Z;

    public /* synthetic */ View$OnAttachStateChangeListenerC5030f(int i10, Object obj) {
        this.f41554Y = i10;
        this.f41555Z = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ContentCaptureSession a5;
        AccessibilityManager accessibilityManager;
        int i10 = this.f41554Y;
        Object obj = this.f41555Z;
        switch (i10) {
            case 0:
            case 1:
                return;
            case 2:
                O o10 = (O) obj;
                AccessibilityManager accessibilityManager2 = o10.f6821l0;
                accessibilityManager2.addAccessibilityStateChangeListener(o10.f6822m0);
                accessibilityManager2.addTouchExplorationStateChangeListener(o10.f6823n0);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    J0.g.a(view, 1);
                }
                C3636c1 c3636c1 = null;
                if (i11 >= 29 && (a5 = J0.f.a(view)) != null) {
                    c3636c1 = new C3636c1(a5, 2, view);
                }
                o10.f6800D0 = c3636c1;
                return;
            case 3:
            case 4:
                return;
            case 5:
                C3497o c3497o = (C3497o) obj;
                int i12 = C3497o.f32791D0;
                if (c3497o.f32793B0 != null && (accessibilityManager = c3497o.f32792A0) != null) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    if (K.b(c3497o)) {
                        E1.c.a(accessibilityManager, c3497o.f32793B0);
                        return;
                    }
                    return;
                }
                return;
            default:
                view.getViewTreeObserver().addOnDrawListener((io.sentry.android.core.internal.util.f) obj);
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Boolean bool;
        AccessibilityManager accessibilityManager;
        int i10 = this.f41554Y;
        Object obj = this.f41555Z;
        switch (i10) {
            case 0:
                View$OnKeyListenerC5033i view$OnKeyListenerC5033i = (View$OnKeyListenerC5033i) obj;
                ViewTreeObserver viewTreeObserver = view$OnKeyListenerC5033i.f41567D0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        view$OnKeyListenerC5033i.f41567D0 = view.getViewTreeObserver();
                    }
                    view$OnKeyListenerC5033i.f41567D0.removeGlobalOnLayoutListener(view$OnKeyListenerC5033i.f41578o0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                H h10 = (H) obj;
                ViewTreeObserver viewTreeObserver2 = h10.f41524u0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        h10.f41524u0 = view.getViewTreeObserver();
                    }
                    h10.f41524u0.removeGlobalOnLayoutListener(h10.f41518o0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                O o10 = (O) obj;
                o10.f6825p0.removeCallbacks(o10.f6814R0);
                AccessibilityManager accessibilityManager2 = o10.f6821l0;
                accessibilityManager2.removeAccessibilityStateChangeListener(o10.f6822m0);
                accessibilityManager2.removeTouchExplorationStateChangeListener(o10.f6823n0);
                o10.f6800D0 = null;
                return;
            case 3:
                AbstractC0666a abstractC0666a = (AbstractC0666a) obj;
                AbstractC3557B.c0("<this>", abstractC0666a);
                for (ViewParent viewParent : Kg.p.c1(abstractC0666a.getParent(), C0348e0.f3259Y)) {
                    if (viewParent instanceof View) {
                        View view2 = (View) viewParent;
                        AbstractC3557B.c0("<this>", view2);
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if (tag instanceof Boolean) {
                            bool = (Boolean) tag;
                        } else {
                            bool = null;
                        }
                        if (bool != null && bool.booleanValue()) {
                            return;
                        }
                    }
                }
                abstractC0666a.c();
                return;
            case 4:
                view.removeOnAttachStateChangeListener(this);
                ((AbstractC1073l0) obj).k(null);
                return;
            case 5:
                C3497o c3497o = (C3497o) obj;
                int i11 = C3497o.f32791D0;
                E1.d dVar = c3497o.f32793B0;
                if (dVar != null && (accessibilityManager = c3497o.f32792A0) != null) {
                    E1.c.b(accessibilityManager, dVar);
                    return;
                }
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
