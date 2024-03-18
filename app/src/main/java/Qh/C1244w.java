package Qh;

import android.gov.nist.core.Separators;
import wh.AbstractC6226B;

/* renamed from: Qh.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1244w extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f15005a;

    public C1244w(C1237o c1237o) {
        this.f15005a = c1237o;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f15005a.a(((AbstractC6226B) obj).getType());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1244w.class != obj.getClass()) {
            return false;
        }
        if (!this.f15005a.equals(((C1244w) obj).f15005a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f15005a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "hasType(" + this.f15005a + Separators.RPAREN;
    }
}
