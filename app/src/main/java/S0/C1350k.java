package S0;

import id.AbstractC3557B;

/* renamed from: S0.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1350k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1356q f16032a;

    public C1350k(AbstractC1356q abstractC1356q) {
        this.f16032a = abstractC1356q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1350k)) {
            return false;
        }
        if (AbstractC3557B.K(this.f16032a, ((C1350k) obj).f16032a) && AbstractC3557B.K(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16032a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f16032a + ", loaderKey=null)";
    }
}
