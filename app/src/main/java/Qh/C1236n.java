package Qh;

import android.gov.nist.core.Separators;

/* renamed from: Qh.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1236n extends AbstractC1230h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14998a;

    public C1236n(Object obj) {
        this.f14998a = obj;
    }

    @Override // Qh.AbstractC1234l
    public final boolean a(Object obj) {
        return this.f14998a.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1236n.class != obj.getClass()) {
            return false;
        }
        if (this.f14998a.equals(((C1236n) obj).f14998a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14998a.hashCode() + (C1236n.class.hashCode() * 31);
    }

    public final String toString() {
        return "is(" + this.f14998a + Separators.RPAREN;
    }
}
