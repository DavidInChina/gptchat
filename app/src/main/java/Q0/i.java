package Q0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f14280a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14281b;

    /* renamed from: c  reason: collision with root package name */
    public final float f14282c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14283d;

    /* renamed from: e  reason: collision with root package name */
    public final float f14284e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14285f;

    /* renamed from: g  reason: collision with root package name */
    public Paint.FontMetricsInt f14286g;

    /* renamed from: h  reason: collision with root package name */
    public int f14287h;

    /* renamed from: i  reason: collision with root package name */
    public int f14288i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14289j;

    public i(float f6, int i10, float f10, int i11, float f11, int i12) {
        this.f14280a = f6;
        this.f14281b = i10;
        this.f14282c = f10;
        this.f14283d = i11;
        this.f14284e = f11;
        this.f14285f = i12;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f14286g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC3557B.C2("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f14289j) {
            return this.f14288i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        if (this.f14289j) {
            return this.f14287h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f6;
        double ceil;
        this.f14289j = true;
        float textSize = paint.getTextSize();
        this.f14286g = paint.getFontMetricsInt();
        if (a().descent > a().ascent) {
            float f10 = this.f14284e;
            float f11 = this.f14280a;
            int i12 = this.f14281b;
            if (i12 != 0) {
                if (i12 == 1) {
                    f6 = f11 * textSize;
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                f6 = f11 * f10;
            }
            this.f14287h = (int) Math.ceil(f6);
            float f12 = this.f14282c;
            int i13 = this.f14283d;
            if (i13 != 0) {
                if (i13 == 1) {
                    ceil = Math.ceil(f12 * textSize);
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                ceil = Math.ceil(f12 * f10);
            }
            this.f14288i = (int) ceil;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (this.f14285f) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                            fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b10 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b10;
                            fontMetricsInt.descent = b() + b10;
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return c();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f6, int i12, int i13, int i14, Paint paint) {
    }
}
