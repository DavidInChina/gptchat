package Qh;

/* loaded from: classes2.dex */
public final class Y extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final String f14982a;

    /* renamed from: b  reason: collision with root package name */
    public final X f14983b;

    public Y(String str, X x10) {
        this.f14982a = str;
        this.f14983b = x10;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f14983b.a(this.f14982a, (String) obj);
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        Y y10 = (Y) obj;
        if (!this.f14983b.equals(y10.f14983b) || !this.f14982a.equals(y10.f14982a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14983b.hashCode() + E9.f.v(this.f14982a, super.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14983b.f14981Y);
        sb2.append('(');
        return android.gov.nist.core.a.n(sb2, this.f14982a, ')');
    }
}
