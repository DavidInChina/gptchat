package Qh;

import android.gov.nist.core.Separators;
import sh.AbstractC5633e;
import yh.AbstractC6632q;

/* renamed from: Qh.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1227e extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14993a;

    public C1227e(C1237o c1237o) {
        this.f14993a = c1237o;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        AbstractC6632q mo118a = ((AbstractC5633e) obj).mo118a();
        if (mo118a != null && this.f14993a.a(mo118a.w0())) {
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
        if (obj == null || C1227e.class != obj.getClass()) {
            return false;
        }
        if (!this.f14993a.equals(((C1227e) obj).f14993a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14993a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "declaredBy(" + this.f14993a + Separators.RPAREN;
    }
}
