package Q0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes2.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f14268a;

    /* renamed from: c  reason: collision with root package name */
    public final int f14270c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14271d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14272e;

    /* renamed from: f  reason: collision with root package name */
    public final float f14273f;

    /* renamed from: k  reason: collision with root package name */
    public int f14278k;

    /* renamed from: l  reason: collision with root package name */
    public int f14279l;

    /* renamed from: b  reason: collision with root package name */
    public final int f14269b = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f14274g = Integer.MIN_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public int f14275h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public int f14276i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public int f14277j = Integer.MIN_VALUE;

    public h(float f6, int i10, boolean z10, boolean z11, float f10) {
        this.f14268a = f6;
        this.f14270c = i10;
        this.f14271d = z10;
        this.f14272e = z11;
        this.f14273f = f10;
        if ((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f) {
            return;
        }
        throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i14;
        int i15;
        double ceil;
        int i16 = fontMetricsInt.descent;
        int i17 = fontMetricsInt.ascent;
        if (i16 - i17 <= 0) {
            return;
        }
        boolean z11 = false;
        if (i10 == this.f14269b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == this.f14270c) {
            z11 = true;
        }
        boolean z12 = this.f14272e;
        boolean z13 = this.f14271d;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f14274g == Integer.MIN_VALUE) {
            int i18 = i16 - i17;
            int ceil2 = (int) Math.ceil(this.f14268a);
            int i19 = ceil2 - i18;
            float f6 = this.f14273f;
            if (f6 == -1.0f) {
                f6 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            if (i19 <= 0) {
                ceil = Math.ceil(i19 * f6);
            } else {
                ceil = Math.ceil((1.0f - f6) * i19);
            }
            int i20 = (int) ceil;
            int i21 = fontMetricsInt.descent;
            int i22 = i20 + i21;
            this.f14276i = i22;
            int i23 = i22 - ceil2;
            this.f14275h = i23;
            if (z13) {
                i23 = fontMetricsInt.ascent;
            }
            this.f14274g = i23;
            if (z12) {
                i22 = i21;
            }
            this.f14277j = i22;
            this.f14278k = fontMetricsInt.ascent - i23;
            this.f14279l = i22 - i21;
        }
        if (z10) {
            i14 = this.f14274g;
        } else {
            i14 = this.f14275h;
        }
        fontMetricsInt.ascent = i14;
        if (z11) {
            i15 = this.f14277j;
        } else {
            i15 = this.f14276i;
        }
        fontMetricsInt.descent = i15;
    }
}
