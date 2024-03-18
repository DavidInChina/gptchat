package Cg;

import Bg.AbstractC0227u;
import Bg.C0224q;
import Bg.D;
import Bg.I;
import Bg.Y;
import Bg.d0;
import Bg.o0;
import cg.C2414e;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C;
import og.AbstractC5006b;
import og.C5005a;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final p f3146a = new Object();

    @Override // Eg.k
    public final Y A(Eg.g gVar) {
        return AbstractC3557B.G2(gVar);
    }

    @Override // Eg.k
    public final boolean B(Eg.f fVar) {
        AbstractC3557B.c0("<this>", fVar);
        if (AbstractC3557B.R1(e(fVar)) && !AbstractC3557B.S1(fVar)) {
            return true;
        }
        return false;
    }

    @Override // Eg.k
    public final d0 C(Eg.f fVar, int i10) {
        return AbstractC3557B.f1(fVar, i10);
    }

    @Override // Eg.k
    public final D D(Eg.e eVar) {
        return AbstractC3557B.e2(eVar);
    }

    @Override // Eg.k
    public final boolean E(Eg.g gVar) {
        AbstractC3557B.c0("<this>", gVar);
        return AbstractC3557B.N1(AbstractC3557B.G2(gVar));
    }

    @Override // Eg.k
    public final Collection F(Eg.i iVar) {
        return AbstractC3557B.x2(iVar);
    }

    @Override // Eg.k
    public final List G(Eg.i iVar) {
        return AbstractC3557B.n1(iVar);
    }

    @Override // Eg.k
    public final d0 H(Eg.g gVar, int i10) {
        AbstractC3557B.c0("<this>", gVar);
        if (i10 >= 0 && i10 < AbstractC3557B.M(gVar)) {
            return AbstractC3557B.f1(gVar, i10);
        }
        return null;
    }

    @Override // Eg.k
    public final D I(Eg.g gVar, boolean z10) {
        return AbstractC3557B.L2(gVar, z10);
    }

    @Override // Eg.k
    public final Collection J(Eg.g gVar) {
        return AbstractC3557B.l2(this, gVar);
    }

    @Override // Eg.k
    public final Eg.j K(Eg.i iVar, int i10) {
        return AbstractC3557B.m1(iVar, i10);
    }

    @Override // Eg.k
    public final boolean L(Eg.f fVar) {
        C0224q c0224q;
        AbstractC3557B.c0("<this>", fVar);
        D R10 = AbstractC3557B.R(fVar);
        if (R10 != null) {
            c0224q = AbstractC3557B.P(R10);
        } else {
            c0224q = null;
        }
        if (c0224q != null) {
            return true;
        }
        return false;
    }

    @Override // Eg.k
    public final o0 M(ArrayList arrayList) {
        return AbstractC3557B.F1(arrayList);
    }

    @Override // Eg.k
    public final D N(Eg.f fVar) {
        D K22;
        AbstractC3557B.c0("<this>", fVar);
        AbstractC0227u Q = AbstractC3557B.Q(fVar);
        if (Q == null || (K22 = AbstractC3557B.K2(Q)) == null) {
            D R10 = AbstractC3557B.R(fVar);
            AbstractC3557B.Z(R10);
            return R10;
        }
        return K22;
    }

    @Override // Eg.k
    public final Eg.c O(Eg.g gVar) {
        return AbstractC3557B.O(this, gVar);
    }

    @Override // Eg.k
    public final d0 P(Eg.h hVar, int i10) {
        AbstractC3557B.c0("<this>", hVar);
        if (hVar instanceof Eg.g) {
            return AbstractC3557B.f1((Eg.f) hVar, i10);
        }
        if (hVar instanceof Eg.a) {
            E e10 = ((Eg.a) hVar).get(i10);
            AbstractC3557B.b0("get(...)", e10);
            return (d0) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + C.f37623a.b(hVar.getClass())).toString());
    }

    @Override // Eg.k
    public final D Q(Eg.d dVar) {
        return AbstractC3557B.j2(dVar);
    }

    @Override // Eg.k
    public final I R(Eg.f fVar) {
        return AbstractC3557B.S(fVar);
    }

    @Override // Eg.k
    public final boolean S(Eg.g gVar) {
        AbstractC3557B.c0("<this>", gVar);
        return AbstractC3557B.H1(AbstractC3557B.G2(gVar));
    }

    @Override // Eg.k
    public final l T(Eg.c cVar) {
        return AbstractC3557B.H2(cVar);
    }

    @Override // Eg.k
    public final boolean U(Eg.g gVar) {
        Eg.c cVar;
        AbstractC3557B.c0("<this>", gVar);
        D R10 = AbstractC3557B.R(gVar);
        if (R10 != null) {
            cVar = AbstractC3557B.O(this, R10);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return true;
        }
        return false;
    }

    @Override // Eg.k
    public final AbstractC0227u V(Eg.f fVar) {
        return AbstractC3557B.Q(fVar);
    }

    @Override // Eg.k
    public final boolean W(Eg.g gVar) {
        return AbstractC3557B.Q1(gVar);
    }

    @Override // Eg.k
    public final boolean X(Eg.g gVar) {
        return AbstractC3557B.K1(gVar);
    }

    @Override // Eg.k
    public final boolean Y(Eg.c cVar) {
        AbstractC3557B.c0("$receiver", cVar);
        return cVar instanceof C5005a;
    }

    @Override // Eg.k
    public final D Z(Eg.f fVar) {
        return AbstractC3557B.R(fVar);
    }

    @Override // Eg.k
    public final C0224q a(Eg.g gVar) {
        return AbstractC3557B.P(gVar);
    }

    @Override // Eg.k
    public final boolean a0(Eg.i iVar) {
        return AbstractC3557B.I1(iVar);
    }

    @Override // Eg.k
    public final a b(Eg.g gVar) {
        return AbstractC3557B.w2(this, gVar);
    }

    @Override // Eg.k
    public final int b0(Eg.f fVar) {
        return AbstractC3557B.M(fVar);
    }

    @Override // Eg.k
    public final void c(Eg.g gVar) {
        AbstractC3557B.X1(gVar);
    }

    @Override // Eg.k
    public final Eg.g c0(Eg.g gVar) {
        D j22;
        AbstractC3557B.c0("<this>", gVar);
        C0224q P = AbstractC3557B.P(gVar);
        if (P != null && (j22 = AbstractC3557B.j2(P)) != null) {
            return j22;
        }
        return gVar;
    }

    @Override // Eg.k
    public final D d(Eg.f fVar) {
        D e22;
        AbstractC3557B.c0("<this>", fVar);
        AbstractC0227u Q = AbstractC3557B.Q(fVar);
        if (Q == null || (e22 = AbstractC3557B.e2(Q)) == null) {
            D R10 = AbstractC3557B.R(fVar);
            AbstractC3557B.Z(R10);
            return R10;
        }
        return e22;
    }

    @Override // Eg.k
    public final boolean d0(Eg.g gVar, Eg.g gVar2) {
        return AbstractC3557B.E1(gVar, gVar2);
    }

    @Override // Eg.k
    public final Y e(Eg.f fVar) {
        AbstractC3557B.c0("<this>", fVar);
        D R10 = AbstractC3557B.R(fVar);
        if (R10 == null) {
            R10 = d(fVar);
        }
        return AbstractC3557B.G2(R10);
    }

    @Override // Eg.k
    public final D e0(Eg.g gVar) {
        Eg.b bVar = Eg.b.f4732Y;
        return AbstractC3557B.W(gVar);
    }

    @Override // Eg.k
    public final boolean f(o0 o0Var) {
        AbstractC3557B.c0("<this>", o0Var);
        if (AbstractC3557B.Q1(d(o0Var)) != AbstractC3557B.Q1(N(o0Var))) {
            return true;
        }
        return false;
    }

    @Override // Eg.k
    public final boolean f0(Eg.i iVar) {
        return AbstractC3557B.G1(iVar);
    }

    @Override // Eg.k
    public final boolean g(Eg.j jVar, Eg.i iVar) {
        return AbstractC3557B.C1(jVar, iVar);
    }

    @Override // Eg.k
    public final Eg.h g0(Eg.g gVar) {
        return AbstractC3557B.N(gVar);
    }

    @Override // Eg.k
    public final int h(Eg.i iVar) {
        return AbstractC3557B.k2(iVar);
    }

    @Override // Eg.k
    public final Eg.l h0(Eg.j jVar) {
        return AbstractC3557B.z1(jVar);
    }

    @Override // Eg.k
    public final boolean i(Eg.f fVar) {
        return AbstractC3557B.V1(fVar);
    }

    @Override // Eg.k
    public final o0 i0(Eg.c cVar) {
        return AbstractC3557B.f2(cVar);
    }

    @Override // Eg.k
    public final boolean j(Eg.i iVar) {
        return AbstractC3557B.J1(iVar);
    }

    @Override // Eg.k
    public final Eg.f j0(Eg.f fVar) {
        return AbstractC3557B.M2(this, fVar);
    }

    @Override // Eg.k
    public final void k(Eg.g gVar) {
        AbstractC3557B.W1(gVar);
    }

    @Override // Eg.k
    public final o0 k0(Eg.f fVar) {
        return AbstractC3557B.g2(fVar);
    }

    @Override // Eg.k
    public final boolean l(d0 d0Var) {
        AbstractC3557B.c0("$receiver", d0Var);
        return d0Var.c();
    }

    @Override // Eg.k
    public final boolean l0(Eg.i iVar) {
        return AbstractC3557B.H1(iVar);
    }

    @Override // Eg.k
    public final boolean m(Eg.i iVar) {
        return AbstractC3557B.N1(iVar);
    }

    @Override // Eg.k
    public final d0 m0(AbstractC5006b abstractC5006b) {
        return AbstractC3557B.m2(abstractC5006b);
    }

    @Override // Eg.k
    public final boolean n(Eg.i iVar) {
        return AbstractC3557B.R1(iVar);
    }

    @Override // Eg.k
    public final Eg.b n0(Eg.c cVar) {
        return AbstractC3557B.X(cVar);
    }

    @Override // Eg.k
    public final int o(Eg.h hVar) {
        AbstractC3557B.c0("<this>", hVar);
        if (hVar instanceof Eg.g) {
            return AbstractC3557B.M((Eg.f) hVar);
        }
        if (hVar instanceof Eg.a) {
            return ((Eg.a) hVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + C.f37623a.b(hVar.getClass())).toString());
    }

    public final boolean o0(Eg.f fVar) {
        AbstractC3557B.c0("<this>", fVar);
        if ((fVar instanceof Eg.g) && AbstractC3557B.Q1((Eg.g) fVar)) {
            return true;
        }
        return false;
    }

    @Override // Eg.k
    public final D p(Eg.e eVar) {
        return AbstractC3557B.K2(eVar);
    }

    public final Eg.f p0(Eg.f fVar) {
        D L22;
        AbstractC3557B.c0("<this>", fVar);
        D R10 = AbstractC3557B.R(fVar);
        if (R10 != null && (L22 = AbstractC3557B.L2(R10, true)) != null) {
            return L22;
        }
        return fVar;
    }

    @Override // Eg.k
    public final boolean q(Eg.f fVar) {
        AbstractC3557B.c0("$receiver", fVar);
        return fVar instanceof C2414e;
    }

    @Override // Eg.k
    public final Eg.l r(d0 d0Var) {
        AbstractC3557B.c0("$receiver", d0Var);
        return Ad.l.c0(d0Var.b());
    }

    @Override // Eg.k
    public final List s(Eg.f fVar) {
        return AbstractC3557B.g1(fVar);
    }

    @Override // Eg.k
    public final boolean t(Eg.i iVar, Eg.i iVar2) {
        return AbstractC3557B.L(iVar, iVar2);
    }

    @Override // Eg.k
    public final boolean u(Eg.i iVar) {
        return AbstractC3557B.O1(iVar);
    }

    @Override // Eg.k
    public final boolean v(Eg.c cVar) {
        return AbstractC3557B.U1(cVar);
    }

    @Override // Eg.k
    public final void w(Eg.f fVar) {
        AbstractC3557B.c0("<this>", fVar);
        AbstractC3557B.Q(fVar);
    }

    @Override // Cg.b
    public final o0 x(Eg.g gVar, Eg.g gVar2) {
        return AbstractC3557B.r0(this, gVar, gVar2);
    }

    @Override // Eg.k
    public final o0 y(d0 d0Var) {
        AbstractC3557B.c0("$receiver", d0Var);
        return d0Var.getType().B0();
    }

    @Override // Eg.k
    public final void z(Eg.g gVar, Eg.i iVar) {
    }
}
