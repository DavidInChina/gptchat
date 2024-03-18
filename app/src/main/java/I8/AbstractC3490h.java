package i8;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: i8.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3490h extends f8.g {

    /* renamed from: D0  reason: collision with root package name */
    public static final /* synthetic */ int f32769D0 = 0;

    /* renamed from: C0  reason: collision with root package name */
    public C3488f f32770C0;

    public AbstractC3490h(C3488f c3488f) {
        super(c3488f);
        this.f32770C0 = c3488f;
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f32770C0 = new C3488f(this.f32770C0);
        return this;
    }

    public final void o(float f6, float f10, float f11, float f12) {
        RectF rectF = this.f32770C0.f32768v;
        if (f6 != rectF.left || f10 != rectF.top || f11 != rectF.right || f12 != rectF.bottom) {
            rectF.set(f6, f10, f11, f12);
            invalidateSelf();
        }
    }
}
