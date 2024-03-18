package D1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: D1.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0377x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public final View f3314Y;

    /* renamed from: Z  reason: collision with root package name */
    public ViewTreeObserver f3315Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Runnable f3316h0;

    public ViewTreeObserver$OnPreDrawListenerC0377x(View view, Runnable runnable) {
        this.f3314Y = view;
        this.f3315Z = view.getViewTreeObserver();
        this.f3316h0 = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserver$OnPreDrawListenerC0377x viewTreeObserver$OnPreDrawListenerC0377x = new ViewTreeObserver$OnPreDrawListenerC0377x(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0377x);
                view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC0377x);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f3315Z.isAlive();
        View view = this.f3314Y;
        if (isAlive) {
            this.f3315Z.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f3316h0.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3315Z = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f3315Z.isAlive();
        View view2 = this.f3314Y;
        if (isAlive) {
            this.f3315Z.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
