package yh;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class U0 extends W0 {
    public U0() {
        super("INITIATING", 0);
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        throw new IllegalArgumentException("Cannot reify a generic array: " + aVar);
    }

    @Override // yh.k1
    public final Object b(l1.a aVar) {
        l1 l02 = aVar.l0();
        if (l02.V0()) {
            return new C6634r0(l02);
        }
        return aVar;
    }

    @Override // yh.k1
    public final Object d(l1.a aVar) {
        throw new IllegalArgumentException("Cannot reify a wildcard: " + aVar);
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        throw new IllegalArgumentException("Cannot reify a type variable: " + aVar);
    }

    @Override // yh.k1
    public final Object c(l1.a aVar) {
        return aVar;
    }
}
