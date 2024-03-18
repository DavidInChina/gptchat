package yh;

import yh.l1;

/* loaded from: classes.dex */
public final class P0 implements k1 {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f50963Y;

    public P0(l1 l1Var) {
        this.f50963Y = l1Var;
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        if (this.f50963Y.V0()) {
            return new C6636s0(aVar.l0(), aVar);
        }
        return aVar;
    }

    @Override // yh.k1
    public final Object c(l1.a aVar) {
        if (this.f50963Y.V0()) {
            return new C6636s0(aVar.l0(), aVar);
        }
        return aVar;
    }

    @Override // yh.k1
    public final Object d(l1.a aVar) {
        throw new IllegalStateException("Did not expect wildcard on top-level: " + aVar);
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        if (this.f50963Y.V0()) {
            return new C6636s0(aVar.l0(), aVar);
        }
        return aVar;
    }

    @Override // yh.k1
    public final Object b(l1.a aVar) {
        return aVar;
    }
}
