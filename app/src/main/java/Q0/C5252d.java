package q0;

import M3.H;
import nf.AbstractC4828h;
import y.AbstractC6463a;

/* renamed from: q0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5252d {

    /* renamed from: e  reason: collision with root package name */
    public static final C5252d f43624e = new C5252d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f43625a;

    /* renamed from: b  reason: collision with root package name */
    public final float f43626b;

    /* renamed from: c  reason: collision with root package name */
    public final float f43627c;

    /* renamed from: d  reason: collision with root package name */
    public final float f43628d;

    public C5252d(float f6, float f10, float f11, float f12) {
        this.f43625a = f6;
        this.f43626b = f10;
        this.f43627c = f11;
        this.f43628d = f12;
    }

    public static C5252d a(C5252d c5252d, float f6, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f6 = c5252d.f43625a;
        }
        if ((i10 & 4) != 0) {
            f10 = c5252d.f43627c;
        }
        if ((i10 & 8) != 0) {
            f11 = c5252d.f43628d;
        }
        return new C5252d(f6, c5252d.f43626b, f10, f11);
    }

    public final long b() {
        return R4.b.r((f() / 2.0f) + this.f43625a, (c() / 2.0f) + this.f43626b);
    }

    public final float c() {
        return this.f43628d - this.f43626b;
    }

    public final long d() {
        return AbstractC4828h.i(f(), c());
    }

    public final long e() {
        return R4.b.r(this.f43625a, this.f43626b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5252d)) {
            return false;
        }
        C5252d c5252d = (C5252d) obj;
        if (Float.compare(this.f43625a, c5252d.f43625a) == 0 && Float.compare(this.f43626b, c5252d.f43626b) == 0 && Float.compare(this.f43627c, c5252d.f43627c) == 0 && Float.compare(this.f43628d, c5252d.f43628d) == 0) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f43627c - this.f43625a;
    }

    public final C5252d g(C5252d c5252d) {
        return new C5252d(Math.max(this.f43625a, c5252d.f43625a), Math.max(this.f43626b, c5252d.f43626b), Math.min(this.f43627c, c5252d.f43627c), Math.min(this.f43628d, c5252d.f43628d));
    }

    public final C5252d h(float f6, float f10) {
        return new C5252d(this.f43625a + f6, this.f43626b + f10, this.f43627c + f6, this.f43628d + f10);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f43628d) + AbstractC6463a.e(this.f43627c, AbstractC6463a.e(this.f43626b, Float.floatToIntBits(this.f43625a) * 31, 31), 31);
    }

    public final C5252d i(long j6) {
        return new C5252d(C5251c.d(j6) + this.f43625a, C5251c.e(j6) + this.f43626b, C5251c.d(j6) + this.f43627c, C5251c.e(j6) + this.f43628d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + H.A0(this.f43625a) + ", " + H.A0(this.f43626b) + ", " + H.A0(this.f43627c) + ", " + H.A0(this.f43628d) + ')';
    }
}
