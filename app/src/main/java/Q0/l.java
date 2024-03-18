package Q0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes2.dex */
public final class l extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14295a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14296b;

    public l(boolean z10, boolean z11) {
        this.f14295a = z10;
        this.f14296b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f14295a);
        textPaint.setStrikeThruText(this.f14296b);
    }
}
