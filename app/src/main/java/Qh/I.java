package Qh;

import sh.AbstractC5636h;

/* loaded from: classes.dex */
public final class I extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final H f14973a;

    public I(H h10) {
        this.f14973a = h10;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        if ((((AbstractC5636h) obj).u0() & this.f14973a.f14970Y) != 0) {
            return true;
        }
        return false;
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        if (!this.f14973a.equals(((I) obj).f14973a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14973a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return this.f14973a.f14971Z;
    }
}
