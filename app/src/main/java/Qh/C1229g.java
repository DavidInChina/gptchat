package Qh;

import android.gov.nist.core.Separators;
import sh.AbstractC5637i;

/* renamed from: Qh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1229g extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14995a;

    public C1229g(Y y10) {
        this.f14995a = y10;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f14995a.a(((AbstractC5637i.a) obj).getDescriptor());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1229g.class != obj.getClass()) {
            return false;
        }
        if (!this.f14995a.equals(((C1229g) obj).f14995a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14995a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "hasDescriptor(" + this.f14995a + Separators.RPAREN;
    }
}
