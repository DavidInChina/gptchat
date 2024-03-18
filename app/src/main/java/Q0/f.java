package Q0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes2.dex */
public final class f extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f14266a;

    public f(float f6) {
        this.f14266a = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX != 0.0f) {
            textPaint.setLetterSpacing(this.f14266a / textScaleX);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX != 0.0f) {
            textPaint.setLetterSpacing(this.f14266a / textScaleX);
        }
    }
}
