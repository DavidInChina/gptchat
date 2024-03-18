package Qh;

import android.gov.nist.core.Separators;
import wh.AbstractC6250o;

/* renamed from: Qh.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1246y extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f15007a;

    public C1246y(AbstractC1230h abstractC1230h) {
        this.f15007a = abstractC1230h;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f15007a.a(((AbstractC6250o) obj).getParameters());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1246y.class != obj.getClass()) {
            return false;
        }
        if (!this.f15007a.equals(((C1246y) obj).f15007a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f15007a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "hasParameter(" + this.f15007a + Separators.RPAREN;
    }
}
