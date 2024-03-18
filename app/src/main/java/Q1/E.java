package Q1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class E extends ReplacementSpan {

    /* renamed from: b  reason: collision with root package name */
    public final D f14309b;

    /* renamed from: e  reason: collision with root package name */
    public TextPaint f14312e;

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f14308a = new Paint.FontMetricsInt();

    /* renamed from: c  reason: collision with root package name */
    public short f14310c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f14311d = 1.0f;

    public E(D d10) {
        R4.b.U(d10, "rasterizer cannot be null");
        this.f14309b = d10;
    }

    /* renamed from: a */
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        Paint.FontMetricsInt fontMetricsInt2 = this.f14308a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        D d10 = this.f14309b;
        R1.a c10 = d10.c();
        int a5 = c10.a(14);
        short s11 = 0;
        if (a5 != 0) {
            s10 = ((ByteBuffer) c10.f15023d).getShort(a5 + c10.f15020a);
        } else {
            s10 = 0;
        }
        this.f14311d = abs / s10;
        R1.a c11 = d10.c();
        int a10 = c11.a(14);
        if (a10 != 0) {
            ((ByteBuffer) c11.f15023d).getShort(a10 + c11.f15020a);
        }
        R1.a c12 = d10.c();
        int a11 = c12.a(12);
        if (a11 != 0) {
            s11 = ((ByteBuffer) c12.f15023d).getShort(a11 + c12.f15020a);
        }
        short s12 = (short) (s11 * this.f14311d);
        this.f14310c = s12;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s12;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f6, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = paint;
        TextPaint textPaint2 = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint3 = this.f14312e;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.f14312e = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(textPaint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint2);
                    }
                }
            }
            if (textPaint instanceof TextPaint) {
                textPaint2 = (TextPaint) textPaint;
            }
        } else if (textPaint instanceof TextPaint) {
            textPaint2 = (TextPaint) textPaint;
        }
        if (textPaint2 != null && textPaint2.bgColor != 0) {
            int color = textPaint2.getColor();
            Paint.Style style = textPaint2.getStyle();
            textPaint2.setColor(textPaint2.bgColor);
            textPaint2.setStyle(Paint.Style.FILL);
            canvas.drawRect(f6, i12, f6 + this.f14310c, i14, textPaint2);
            textPaint2.setStyle(style);
            textPaint2.setColor(color);
        }
        l.a().getClass();
        float f10 = i13;
        if (textPaint2 != null) {
            textPaint = textPaint2;
        }
        D d10 = this.f14309b;
        U3.n nVar = d10.f14306b;
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface((Typeface) nVar.f17429i0);
        canvas.drawText((char[]) nVar.f17427Z, d10.f14305a * 2, 2, f6, f10, textPaint);
        textPaint.setTypeface(typeface);
    }
}
