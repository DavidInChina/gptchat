package S0;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class I implements AbstractC1356q {

    /* renamed from: a  reason: collision with root package name */
    public final int f15979a;

    /* renamed from: b  reason: collision with root package name */
    public final D f15980b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15981c;

    /* renamed from: d  reason: collision with root package name */
    public final C f15982d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15983e;

    public I(int i10, D d10, int i11, C c10, int i12) {
        this.f15979a = i10;
        this.f15980b = d10;
        this.f15981c = i11;
        this.f15982d = c10;
        this.f15983e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        if (this.f15979a != i10.f15979a) {
            return false;
        }
        if (!AbstractC3557B.K(this.f15980b, i10.f15980b)) {
            return false;
        }
        if (!z.a(this.f15981c, i10.f15981c) || !AbstractC3557B.K(this.f15982d, i10.f15982d)) {
            return false;
        }
        if (Gi.e.v(this.f15983e, i10.f15983e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15982d.f15967a.hashCode() + (((((((this.f15979a * 31) + this.f15980b.f15975Y) * 31) + this.f15981c) * 31) + this.f15983e) * 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f15979a + ", weight=" + this.f15980b + ", style=" + ((Object) z.b(this.f15981c)) + ", loadingStrategy=" + ((Object) Gi.e.U(this.f15983e)) + ')';
    }
}
