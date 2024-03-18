package Bg;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class H extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final D f2071a;

    public H(Jf.l lVar) {
        AbstractC3557B.c0("kotlinBuiltIns", lVar);
        D o10 = lVar.o();
        AbstractC3557B.b0("getNullableAnyType(...)", o10);
        this.f2071a = o10;
    }

    @Override // Bg.d0
    public final d0 a(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        return this;
    }

    @Override // Bg.d0
    public final p0 b() {
        return p0.f2148j0;
    }

    @Override // Bg.d0
    public final boolean c() {
        return true;
    }

    @Override // Bg.d0
    public final A getType() {
        return this.f2071a;
    }
}
