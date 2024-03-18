package Qh;

import android.gov.nist.core.Separators;
import wh.AbstractC6236a;
import wh.AbstractC6250o;

/* loaded from: classes.dex */
public final class M extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14977a;

    public M(AbstractC1230h abstractC1230h) {
        this.f14977a = abstractC1230h;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f14977a.a(((AbstractC6236a) ((AbstractC6250o) obj)).j1());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        if (!this.f14977a.equals(((M) obj).f14977a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14977a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "signature(" + this.f14977a + Separators.RPAREN;
    }
}
