package Qh;

import android.gov.nist.core.Separators;
import wh.AbstractC6250o;

/* renamed from: Qh.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1247z extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f15008a;

    public C1247z(C1237o c1237o) {
        this.f15008a = c1237o;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f15008a.a(((AbstractC6250o) obj).getReturnType());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1247z.class != obj.getClass()) {
            return false;
        }
        if (!this.f15008a.equals(((C1247z) obj).f15008a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f15008a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "returns(" + this.f15008a + Separators.RPAREN;
    }
}
