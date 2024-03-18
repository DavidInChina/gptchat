package r0;

import A.AbstractC0044t0;
import android.graphics.ColorFilter;
import jf.C3970t;

/* renamed from: r0.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5347k {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f44246d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ColorFilter f44247a;

    /* renamed from: b  reason: collision with root package name */
    public final long f44248b;

    /* renamed from: c  reason: collision with root package name */
    public final int f44249c;

    public C5347k(long j6, int i10, ColorFilter colorFilter) {
        this.f44247a = colorFilter;
        this.f44248b = j6;
        this.f44249c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5347k)) {
            return false;
        }
        C5347k c5347k = (C5347k) obj;
        if (r.c(this.f44248b, c5347k.f44248b) && G.b(this.f44249c, c5347k.f44249c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f44264l;
        return (C3970t.a(this.f44248b) * 31) + this.f44249c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0044t0.B(this.f44248b, sb2, ", blendMode=");
        int i10 = this.f44249c;
        if (G.b(i10, 0)) {
            str = "Clear";
        } else if (G.b(i10, 1)) {
            str = "Src";
        } else if (G.b(i10, 2)) {
            str = "Dst";
        } else if (G.b(i10, 3)) {
            str = "SrcOver";
        } else if (G.b(i10, 4)) {
            str = "DstOver";
        } else if (G.b(i10, 5)) {
            str = "SrcIn";
        } else if (G.b(i10, 6)) {
            str = "DstIn";
        } else if (G.b(i10, 7)) {
            str = "SrcOut";
        } else if (G.b(i10, 8)) {
            str = "DstOut";
        } else if (G.b(i10, 9)) {
            str = "SrcAtop";
        } else if (G.b(i10, 10)) {
            str = "DstAtop";
        } else if (G.b(i10, 11)) {
            str = "Xor";
        } else if (G.b(i10, 12)) {
            str = "Plus";
        } else if (G.b(i10, 13)) {
            str = "Modulate";
        } else if (G.b(i10, 14)) {
            str = "Screen";
        } else if (G.b(i10, 15)) {
            str = "Overlay";
        } else if (G.b(i10, 16)) {
            str = "Darken";
        } else if (G.b(i10, 17)) {
            str = "Lighten";
        } else if (G.b(i10, 18)) {
            str = "ColorDodge";
        } else if (G.b(i10, 19)) {
            str = "ColorBurn";
        } else if (G.b(i10, 20)) {
            str = "HardLight";
        } else if (G.b(i10, 21)) {
            str = "Softlight";
        } else if (G.b(i10, 22)) {
            str = "Difference";
        } else if (G.b(i10, 23)) {
            str = "Exclusion";
        } else if (G.b(i10, 24)) {
            str = "Multiply";
        } else if (G.b(i10, 25)) {
            str = "Hue";
        } else if (G.b(i10, 26)) {
            str = "Saturation";
        } else if (G.b(i10, 27)) {
            str = "Color";
        } else if (G.b(i10, 28)) {
            str = "Luminosity";
        } else {
            str = "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
