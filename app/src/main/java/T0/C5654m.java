package t0;

import id.AbstractC3557B;
import r0.G;
import y.AbstractC6463a;

/* renamed from: t0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5654m extends AbstractC5651j {

    /* renamed from: a  reason: collision with root package name */
    public final float f45623a;

    /* renamed from: b  reason: collision with root package name */
    public final float f45624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45625c;

    /* renamed from: d  reason: collision with root package name */
    public final int f45626d;

    public C5654m(float f6, float f10, int i10, int i11, int i12) {
        f10 = (i12 & 2) != 0 ? 4.0f : f10;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f45623a = f6;
        this.f45624b = f10;
        this.f45625c = i10;
        this.f45626d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5654m)) {
            return false;
        }
        C5654m c5654m = (C5654m) obj;
        if (this.f45623a != c5654m.f45623a || this.f45624b != c5654m.f45624b || !G.f(this.f45625c, c5654m.f45625c) || !G.g(this.f45626d, c5654m.f45626d)) {
            return false;
        }
        c5654m.getClass();
        if (AbstractC3557B.K(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((AbstractC6463a.e(this.f45624b, Float.floatToIntBits(this.f45623a) * 31, 31) + this.f45625c) * 31) + this.f45626d) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f45623a);
        sb2.append(", miter=");
        sb2.append(this.f45624b);
        sb2.append(", cap=");
        int i10 = this.f45625c;
        String str2 = "Unknown";
        if (G.f(i10, 0)) {
            str = "Butt";
        } else if (G.f(i10, 1)) {
            str = "Round";
        } else if (G.f(i10, 2)) {
            str = "Square";
        } else {
            str = str2;
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i11 = this.f45626d;
        if (G.g(i11, 0)) {
            str2 = "Miter";
        } else if (G.g(i11, 1)) {
            str2 = "Round";
        } else if (G.g(i11, 2)) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
