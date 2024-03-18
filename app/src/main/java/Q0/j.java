package Q0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes2.dex */
public final class j extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final int f14290a;

    /* renamed from: b  reason: collision with root package name */
    public final float f14291b;

    /* renamed from: c  reason: collision with root package name */
    public final float f14292c;

    /* renamed from: d  reason: collision with root package name */
    public final float f14293d;

    public j(float f6, float f10, float f11, int i10) {
        this.f14290a = i10;
        this.f14291b = f6;
        this.f14292c = f10;
        this.f14293d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f14293d, this.f14291b, this.f14292c, this.f14290a);
    }
}
