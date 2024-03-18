package V1;

import D1.ViewTreeObserver$OnPreDrawListenerC0377x;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: V1.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1484z extends AnimationSet implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final ViewGroup f18319Y;

    /* renamed from: Z  reason: collision with root package name */
    public final View f18320Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f18321h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f18322i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f18323j0 = true;

    public RunnableC1484z(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f18319Y = viewGroup;
        this.f18320Z = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f18323j0 = true;
        if (this.f18321h0) {
            return !this.f18322i0;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f18321h0 = true;
            ViewTreeObserver$OnPreDrawListenerC0377x.a(this.f18319Y, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f18321h0;
        ViewGroup viewGroup = this.f18319Y;
        if (!z10 && this.f18323j0) {
            this.f18323j0 = false;
            viewGroup.post(this);
            return;
        }
        viewGroup.endViewTransition(this.f18320Z);
        this.f18322i0 = true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation, float f6) {
        this.f18323j0 = true;
        if (this.f18321h0) {
            return !this.f18322i0;
        }
        if (!super.getTransformation(j6, transformation, f6)) {
            this.f18321h0 = true;
            ViewTreeObserver$OnPreDrawListenerC0377x.a(this.f18319Y, this);
        }
        return true;
    }
}
