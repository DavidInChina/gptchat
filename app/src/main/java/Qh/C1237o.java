package Qh;

import android.gov.nist.core.Separators;
import yh.AbstractC6632q;

/* renamed from: Qh.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1237o extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14999a;

    public C1237o(AbstractC1230h abstractC1230h) {
        this.f14999a = abstractC1230h;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f14999a.a(((AbstractC6632q) obj).l0());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1237o.class != obj.getClass()) {
            return false;
        }
        if (!this.f14999a.equals(((C1237o) obj).f14999a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14999a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "erasure(" + this.f14999a + Separators.RPAREN;
    }
}
