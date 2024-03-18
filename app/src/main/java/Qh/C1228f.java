package Qh;

import sh.AbstractC5631c;

/* renamed from: Qh.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1228f extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14994a;

    public C1228f(C1236n c1236n) {
        this.f14994a = c1236n;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f14994a.a(((AbstractC5631c) obj).y());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1228f.class != obj.getClass()) {
            return false;
        }
        if (!this.f14994a.equals(((C1228f) obj).f14994a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14994a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "isDefinedAs(" + this.f14994a + ')';
    }
}
