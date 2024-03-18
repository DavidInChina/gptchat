package Qh;

/* loaded from: classes.dex */
public final class K extends AbstractC1230h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14975a;

    public K(AbstractC1234l abstractC1234l) {
        this.f14975a = abstractC1234l;
    }

    @Override // Qh.AbstractC1234l
    public final boolean a(Object obj) {
        return !this.f14975a.a(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        if (this.f14975a.equals(((K) obj).f14975a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14975a.hashCode() + (K.class.hashCode() * 31);
    }

    public final String toString() {
        return "not(" + this.f14975a + ')';
    }
}
