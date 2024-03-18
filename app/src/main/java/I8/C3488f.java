package i8;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: i8.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3488f extends f8.f {

    /* renamed from: v  reason: collision with root package name */
    public final RectF f32768v;

    public C3488f(f8.j jVar, RectF rectF) {
        super(jVar);
        this.f32768v = rectF;
    }

    @Override // f8.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        AbstractC3490h abstractC3490h = new AbstractC3490h(this);
        abstractC3490h.invalidateSelf();
        return abstractC3490h;
    }

    public C3488f(C3488f c3488f) {
        super(c3488f);
        this.f32768v = c3488f.f32768v;
    }
}
