package Qh;

import Bh.AbstractC0265q;

/* renamed from: Qh.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1242u implements AbstractC1243v {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f15004a;

    public C1242u(AbstractC1230h abstractC1230h) {
        this.f15004a = abstractC1230h;
    }

    @Override // Qh.AbstractC1243v
    public final AbstractC1234l a(AbstractC0265q abstractC0265q) {
        return this.f15004a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1242u.class != obj.getClass()) {
            return false;
        }
        if (this.f15004a.equals(((C1242u) obj).f15004a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15004a.hashCode() + (C1242u.class.hashCode() * 31);
    }
}
