package Qh;

import android.gov.nist.core.Separators;

/* renamed from: Qh.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1224b extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14989a;

    public C1224b(C1244w c1244w) {
        this.f14989a = c1244w;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        for (Object obj2 : (Iterable) obj) {
            if (this.f14989a.a(obj2)) {
                return true;
            }
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
        if (obj == null || C1224b.class != obj.getClass()) {
            return false;
        }
        if (!this.f14989a.equals(((C1224b) obj).f14989a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14989a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "whereOne(" + this.f14989a + Separators.RPAREN;
    }
}
