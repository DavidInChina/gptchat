package Qh;

import yh.AbstractC6632q;

/* loaded from: classes.dex */
public final class a0 extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14988a;

    public a0(AbstractC1230h abstractC1230h) {
        this.f14988a = abstractC1230h;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f14988a.a(((AbstractC6632q) obj).c());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        if (!this.f14988a.equals(((a0) obj).f14988a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14988a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "ofSort(" + this.f14988a + ')';
    }
}
