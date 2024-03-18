package be;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import g.RunnableC3118k;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f25952Y;

    /* renamed from: Z  reason: collision with root package name */
    public final View f25953Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6216a f25954h0;

    public e(View view, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("view", view);
        this.f25953Z = view;
        this.f25954h0 = abstractC6216a;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f25952Y) {
            return;
        }
        this.f25952Y = true;
        this.f25953Z.removeOnAttachStateChangeListener(this);
        ((Handler) d.f25951a.getValue()).post(new RunnableC3118k(20, this));
        this.f25954h0.mo122invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC3557B.c0("view", view);
        view.getViewTreeObserver().addOnDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC3557B.c0("view", view);
        view.getViewTreeObserver().removeOnDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
    }
}
