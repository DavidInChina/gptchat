package O0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f13293a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13294b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13295c;

    /* renamed from: d  reason: collision with root package name */
    public final TextPaint f13296d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13297e;

    /* renamed from: f  reason: collision with root package name */
    public final TextDirectionHeuristic f13298f;

    /* renamed from: g  reason: collision with root package name */
    public final Layout.Alignment f13299g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13300h;

    /* renamed from: i  reason: collision with root package name */
    public final TextUtils.TruncateAt f13301i;

    /* renamed from: j  reason: collision with root package name */
    public final int f13302j;

    /* renamed from: k  reason: collision with root package name */
    public final float f13303k;

    /* renamed from: l  reason: collision with root package name */
    public final float f13304l;

    /* renamed from: m  reason: collision with root package name */
    public final int f13305m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f13306n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f13307o;

    /* renamed from: p  reason: collision with root package name */
    public final int f13308p;

    /* renamed from: q  reason: collision with root package name */
    public final int f13309q;

    /* renamed from: r  reason: collision with root package name */
    public final int f13310r;

    /* renamed from: s  reason: collision with root package name */
    public final int f13311s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f13312t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f13313u;

    public p(float f6, float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, V0.d dVar, TextUtils.TruncateAt truncateAt, CharSequence charSequence, boolean z10, boolean z11, int[] iArr, int[] iArr2) {
        this.f13293a = charSequence;
        this.f13294b = i10;
        this.f13295c = i11;
        this.f13296d = dVar;
        this.f13297e = i12;
        this.f13298f = textDirectionHeuristic;
        this.f13299g = alignment;
        this.f13300h = i13;
        this.f13301i = truncateAt;
        this.f13302j = i14;
        this.f13303k = f6;
        this.f13304l = f10;
        this.f13305m = i15;
        this.f13306n = z10;
        this.f13307o = z11;
        this.f13308p = i16;
        this.f13309q = i17;
        this.f13310r = i18;
        this.f13311s = i19;
        this.f13312t = iArr;
        this.f13313u = iArr2;
        if (i10 >= 0 && i10 <= i11) {
            int length = charSequence.length();
            if (i11 < 0 || i11 > length) {
                throw new IllegalArgumentException("invalid end value".toString());
            }
            if (i13 < 0) {
                throw new IllegalArgumentException("invalid maxLines value".toString());
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("invalid width value".toString());
            }
            if (i14 < 0) {
                throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
            }
            if (f6 < 0.0f) {
                throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
            }
            return;
        }
        throw new IllegalArgumentException("invalid start value".toString());
    }
}
