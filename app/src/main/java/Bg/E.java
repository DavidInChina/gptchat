package Bg;

import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes2.dex */
public final class E extends D {

    /* renamed from: Z  reason: collision with root package name */
    public final Y f2063Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f2064h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f2065i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ug.n f2066j0;

    /* renamed from: k0  reason: collision with root package name */
    public final wf.k f2067k0;

    public E(Y y10, List list, boolean z10, ug.n nVar, wf.k kVar) {
        AbstractC3557B.c0("constructor", y10);
        AbstractC3557B.c0("arguments", list);
        AbstractC3557B.c0("memberScope", nVar);
        this.f2063Z = y10;
        this.f2064h0 = list;
        this.f2065i0 = z10;
        this.f2066j0 = nVar;
        this.f2067k0 = kVar;
        if ((nVar instanceof Dg.h) && !(nVar instanceof Dg.n)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + nVar + '\n' + y10);
        }
    }

    @Override // Bg.A
    public final A A0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D d10 = (D) this.f2067k0.invoke(iVar);
        if (d10 == null) {
            return this;
        }
        return d10;
    }

    @Override // Bg.o0
    public final o0 D0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D d10 = (D) this.f2067k0.invoke(iVar);
        if (d10 == null) {
            return this;
        }
        return d10;
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        if (z10 == this.f2065i0) {
            return this;
        }
        if (z10) {
            return new C(this, 1);
        }
        return new C(this, 0);
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        if (q10.isEmpty()) {
            return this;
        }
        return new F(this, q10);
    }

    @Override // Bg.A
    public final ug.n R() {
        return this.f2066j0;
    }

    @Override // Bg.A
    public final List w0() {
        return this.f2064h0;
    }

    @Override // Bg.A
    public final Q x0() {
        Q.f2084Z.getClass();
        return Q.f2085h0;
    }

    @Override // Bg.A
    public final Y y0() {
        return this.f2063Z;
    }

    @Override // Bg.A
    public final boolean z0() {
        return this.f2065i0;
    }
}
