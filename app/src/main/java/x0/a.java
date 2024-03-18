package X0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import id.AbstractC3557B;
import r0.G;
import t0.AbstractC5651j;
import t0.C5653l;
import t0.C5654m;

/* loaded from: classes2.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5651j f21716a;

    public a(AbstractC5651j abstractC5651j) {
        this.f21716a = abstractC5651j;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C5653l c5653l = C5653l.f45622a;
            AbstractC5651j abstractC5651j = this.f21716a;
            if (AbstractC3557B.K(abstractC5651j, c5653l)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (abstractC5651j instanceof C5654m) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((C5654m) abstractC5651j).f45623a);
                textPaint.setStrokeMiter(((C5654m) abstractC5651j).f45624b);
                int i10 = ((C5654m) abstractC5651j).f45626d;
                if (G.g(i10, 0)) {
                    join = Paint.Join.MITER;
                } else if (G.g(i10, 1)) {
                    join = Paint.Join.ROUND;
                } else if (G.g(i10, 2)) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i11 = ((C5654m) abstractC5651j).f45625c;
                if (G.f(i11, 0)) {
                    cap = Paint.Cap.BUTT;
                } else if (G.f(i11, 1)) {
                    cap = Paint.Cap.ROUND;
                } else if (G.f(i11, 2)) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                ((C5654m) abstractC5651j).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
