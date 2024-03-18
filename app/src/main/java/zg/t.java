package zg;

import Bg.C0213f;
import Bg.D;
import Bg.Q;
import Bg.Y;
import Bg.j0;
import Bg.m0;
import Bg.p0;
import K4.J;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1004m;
import Mf.AbstractC1007p;
import Pf.AbstractC1149g;
import Pf.C1147e;
import Pf.C1148f;
import fg.T;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import java.util.List;
import kg.C4294f;

/* loaded from: classes.dex */
public final class t extends AbstractC1149g implements AbstractC6865l {

    /* renamed from: n0  reason: collision with root package name */
    public final T f52092n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AbstractC3428g f52093o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C3430i f52094p0;

    /* renamed from: q0  reason: collision with root package name */
    public final C3432k f52095q0;

    /* renamed from: r0  reason: collision with root package name */
    public final AbstractC6864k f52096r0;

    /* renamed from: s0  reason: collision with root package name */
    public D f52097s0;

    /* renamed from: t0  reason: collision with root package name */
    public D f52098t0;

    /* renamed from: u0  reason: collision with root package name */
    public List f52099u0;

    /* renamed from: v0  reason: collision with root package name */
    public D f52100v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Ag.u uVar, AbstractC1003l abstractC1003l, Nf.i iVar, C4294f c4294f, AbstractC1007p abstractC1007p, T t10, AbstractC3428g abstractC3428g, C3430i c3430i, C3432k c3432k, AbstractC6864k abstractC6864k) {
        super(uVar, abstractC1003l, iVar, c4294f, abstractC1007p);
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("containingDeclaration", abstractC1003l);
        AbstractC3557B.c0("visibility", abstractC1007p);
        AbstractC3557B.c0("proto", t10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        AbstractC3557B.c0("versionRequirementTable", c3432k);
        this.f52092n0 = t10;
        this.f52093o0 = abstractC3428g;
        this.f52094p0 = c3430i;
        this.f52095q0 = c3432k;
        this.f52096r0 = abstractC6864k;
    }

    @Override // zg.AbstractC6865l
    public final C3430i O() {
        throw null;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC3428g T() {
        throw null;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC6864k U() {
        return this.f52096r0;
    }

    @Override // Mf.X
    public final AbstractC1004m c(j0 j0Var) {
        AbstractC3557B.c0("substitutor", j0Var);
        if (j0Var.f2128a.e()) {
            return this;
        }
        AbstractC1003l mo20k = mo20k();
        AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
        Nf.i annotations = getAnnotations();
        AbstractC3557B.b0("<get-annotations>(...)", annotations);
        C4294f name = getName();
        AbstractC3557B.b0("getName(...)", name);
        t tVar = new t(this.f14091j0, mo20k, annotations, name, this.f14092k0, this.f52092n0, this.f52093o0, this.f52094p0, this.f52095q0, this.f52096r0);
        List o10 = o();
        D y02 = y0();
        p0 p0Var = p0.f2146h0;
        tVar.z0(o10, J.i(j0Var.h(y02, p0Var)), J.i(j0Var.h(x0(), p0Var)));
        return tVar;
    }

    @Override // Mf.AbstractC1000i
    public final D n() {
        D d10 = this.f52100v0;
        if (d10 != null) {
            return d10;
        }
        AbstractC3557B.C2("defaultTypeImpl");
        throw null;
    }

    public final AbstractC0997f w0() {
        if (Bi.c.g1(x0())) {
            return null;
        }
        AbstractC1000i k10 = x0().y0().k();
        if (!(k10 instanceof AbstractC0997f)) {
            return null;
        }
        return (AbstractC0997f) k10;
    }

    public final D x0() {
        D d10 = this.f52098t0;
        if (d10 != null) {
            return d10;
        }
        AbstractC3557B.C2("expandedType");
        throw null;
    }

    public final D y0() {
        D d10 = this.f52097s0;
        if (d10 != null) {
            return d10;
        }
        AbstractC3557B.C2("underlyingType");
        throw null;
    }

    public final void z0(List list, D d10, D d11) {
        ug.n nVar;
        D d12;
        AbstractC3557B.c0("underlyingType", d10);
        AbstractC3557B.c0("expandedType", d11);
        this.f14093l0 = list;
        this.f52097s0 = d10;
        this.f52098t0 = d11;
        this.f52099u0 = AbstractC3557B.i0(this);
        AbstractC0997f w02 = w0();
        if (w02 == null || (nVar = w02.n0()) == null) {
            nVar = ug.m.f46797b;
        }
        ug.n nVar2 = nVar;
        C1147e c1147e = new C1147e(this, 0);
        Dg.j jVar = m0.f2138a;
        if (Dg.m.f(this)) {
            d12 = Dg.m.c(Dg.l.f3696p0, toString());
        } else {
            Y f6 = f();
            if (f6 != null) {
                List e10 = m0.e(((C1148f) f6).getParameters());
                Q.f2084Z.getClass();
                d12 = C0213f.o(Q.f2085h0, f6, e10, false, nVar2, c1147e);
            } else {
                m0.a(12);
                throw null;
            }
        }
        this.f52100v0 = d12;
    }
}
