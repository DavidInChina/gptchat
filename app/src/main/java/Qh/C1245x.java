package Qh;

import android.gov.nist.core.Separators;
import wh.AbstractC6235K;

/* renamed from: Qh.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1245x extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f15006a;

    public C1245x(C1225c c1225c) {
        this.f15006a = c1225c;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f15006a.a(((AbstractC6235K) obj).I0());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1245x.class != obj.getClass()) {
            return false;
        }
        if (!this.f15006a.equals(((C1245x) obj).f15006a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f15006a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "hasTypes(" + this.f15006a + Separators.RPAREN;
    }
}
