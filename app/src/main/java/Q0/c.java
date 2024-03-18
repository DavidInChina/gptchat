package Q0;

import Ng.H;
import O0.r;
import O0.t;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i15)) == layout.getLineCount() - 1) {
            r rVar = t.f13332a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float p10 = H.p(layout, lineForOffset, paint) + H.o(layout, lineForOffset, paint);
                if (p10 != 0.0f) {
                    AbstractC3557B.Z(canvas);
                    canvas.translate(p10, 0.0f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
