package yh;

import Qh.AbstractC1230h;
import Qh.AbstractC1234l;
import yh.l1;

/* loaded from: classes.dex */
public final class Y0 extends AbstractC6602d1 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1234l f50981Y;

    public Y0(AbstractC1230h abstractC1230h) {
        this.f50981Y = abstractC1230h;
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        return new C6627n0((l1.a) aVar.mo119g().k(this), aVar);
    }

    @Override // yh.k1
    public final Object b(l1.a aVar) {
        if (aVar.T0()) {
            return new C6627n0((l1.a) aVar.mo119g().k(this), aVar);
        }
        return h(aVar);
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        return new F0(aVar.A0(), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y0.class != obj.getClass()) {
            return false;
        }
        if (this.f50981Y.equals(((Y0) obj).f50981Y)) {
            return true;
        }
        return false;
    }

    public final l1.a h(l1.a aVar) {
        if (this.f50981Y.a(aVar.l0())) {
            return new C6636s0(zh.H.f52110a, aVar.getOwnerType(), aVar);
        }
        return aVar;
    }

    public final int hashCode() {
        return this.f50981Y.hashCode() + (Y0.class.hashCode() * 31);
    }
}
