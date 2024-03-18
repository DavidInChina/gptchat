package S0;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final s f15986a;

    /* renamed from: b  reason: collision with root package name */
    public final D f15987b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15988c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15989d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f15990e;

    public M(s sVar, D d10, int i10, int i11, Object obj) {
        this.f15986a = sVar;
        this.f15987b = d10;
        this.f15988c = i10;
        this.f15989d = i11;
        this.f15990e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        if (AbstractC3557B.K(this.f15986a, m10.f15986a) && AbstractC3557B.K(this.f15987b, m10.f15987b) && z.a(this.f15988c, m10.f15988c) && A.a(this.f15989d, m10.f15989d) && AbstractC3557B.K(this.f15990e, m10.f15990e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        s sVar = this.f15986a;
        if (sVar == null) {
            i10 = 0;
        } else {
            i10 = sVar.hashCode();
        }
        int i12 = ((((((i10 * 31) + this.f15987b.f15975Y) * 31) + this.f15988c) * 31) + this.f15989d) * 31;
        Object obj = this.f15990e;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.f15986a + ", fontWeight=" + this.f15987b + ", fontStyle=" + ((Object) z.b(this.f15988c)) + ", fontSynthesis=" + ((Object) A.b(this.f15989d)) + ", resourceLoaderCacheKey=" + this.f15990e + ')';
    }
}
