package H3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import t1.AbstractC5656b;

/* loaded from: classes2.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V7.a f7353a;

    public b(V7.a aVar) {
        this.f7353a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f7353a.f18412b.f18433v0;
        if (colorStateList != null) {
            AbstractC5656b.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f7353a.a(drawable);
    }
}
