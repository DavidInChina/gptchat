package N0;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f12549a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12550b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12551c;

    /* renamed from: d  reason: collision with root package name */
    public final Y0.q f12552d;

    /* renamed from: e  reason: collision with root package name */
    public final s f12553e;

    /* renamed from: f  reason: collision with root package name */
    public final Y0.g f12554f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12555g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12556h;

    /* renamed from: i  reason: collision with root package name */
    public final Y0.r f12557i;

    public p(int i10, int i11, long j6, Y0.q qVar, int i12) {
        this((i12 & 1) != 0 ? Integer.MIN_VALUE : i10, (i12 & 2) != 0 ? Integer.MIN_VALUE : i11, (i12 & 4) != 0 ? Z0.n.f22810c : j6, (i12 & 8) != 0 ? null : qVar, null, null, 0, Integer.MIN_VALUE, null);
    }

    public final p a(p pVar) {
        if (pVar == null) {
            return this;
        }
        return q.a(this, pVar.f12549a, pVar.f12550b, pVar.f12551c, pVar.f12552d, pVar.f12553e, pVar.f12554f, pVar.f12555g, pVar.f12556h, pVar.f12557i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (Y0.i.a(this.f12549a, pVar.f12549a) && Y0.k.a(this.f12550b, pVar.f12550b) && Z0.n.a(this.f12551c, pVar.f12551c) && AbstractC3557B.K(this.f12552d, pVar.f12552d) && AbstractC3557B.K(this.f12553e, pVar.f12553e) && AbstractC3557B.K(this.f12554f, pVar.f12554f) && this.f12555g == pVar.f12555g && Y0.d.a(this.f12556h, pVar.f12556h) && AbstractC3557B.K(this.f12557i, pVar.f12557i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int d10 = (Z0.n.d(this.f12551c) + (((this.f12549a * 31) + this.f12550b) * 31)) * 31;
        int i13 = 0;
        Y0.q qVar = this.f12552d;
        if (qVar != null) {
            i10 = qVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (d10 + i10) * 31;
        s sVar = this.f12553e;
        if (sVar != null) {
            i11 = sVar.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Y0.g gVar = this.f12554f;
        if (gVar != null) {
            i12 = gVar.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (((((i15 + i12) * 31) + this.f12555g) * 31) + this.f12556h) * 31;
        Y0.r rVar = this.f12557i;
        if (rVar != null) {
            i13 = rVar.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) Y0.i.b(this.f12549a)) + ", textDirection=" + ((Object) Y0.k.b(this.f12550b)) + ", lineHeight=" + ((Object) Z0.n.e(this.f12551c)) + ", textIndent=" + this.f12552d + ", platformStyle=" + this.f12553e + ", lineHeightStyle=" + this.f12554f + ", lineBreak=" + ((Object) Y0.e.a(this.f12555g)) + ", hyphens=" + ((Object) Y0.d.b(this.f12556h)) + ", textMotion=" + this.f12557i + ')';
    }

    public p(int i10, int i11, long j6, Y0.q qVar, s sVar, Y0.g gVar, int i12, int i13, Y0.r rVar) {
        this.f12549a = i10;
        this.f12550b = i11;
        this.f12551c = j6;
        this.f12552d = qVar;
        this.f12553e = sVar;
        this.f12554f = gVar;
        this.f12555g = i12;
        this.f12556h = i13;
        this.f12557i = rVar;
        if (Z0.n.a(j6, Z0.n.f22810c) || Z0.n.c(j6) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + Z0.n.c(j6) + ')').toString());
    }
}
