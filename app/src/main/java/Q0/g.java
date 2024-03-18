package Q0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes2.dex */
public final class g implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f14267a;

    public g(float f6) {
        this.f14267a = f6;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i14 <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.f14267a);
        int ceil2 = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / i14));
        fontMetricsInt.descent = ceil2;
        fontMetricsInt.ascent = ceil2 - ceil;
    }
}
