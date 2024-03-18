package zg;

import Bg.D;
import Bg.Y;
import M3.I;
import Mf.A;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.C1008q;
import Mf.EnumC0998g;
import Mf.P;
import Mf.T;
import Mf.V;
import Pf.AbstractC1144b;
import Pf.S;
import Yf.C1696h;
import fg.C3042j;
import fg.C3051t;
import fg.EnumC3030A;
import fg.EnumC3041i;
import fg.Q;
import fg.X;
import fg.e0;
import fg.f0;
import hg.AbstractC3423b;
import hg.AbstractC3427f;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3431j;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kg.C4290b;
import kg.C4294f;
import rg.AbstractC5493d;
import xg.C6445B;
import xg.E;
import xg.K;
import yf.AbstractC6583a;

/* renamed from: zg.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6862i extends AbstractC1144b implements AbstractC1003l {

    /* renamed from: A0  reason: collision with root package name */
    public final Ag.j f52035A0;

    /* renamed from: B0  reason: collision with root package name */
    public final C6445B f52036B0;

    /* renamed from: C0  reason: collision with root package name */
    public final Nf.i f52037C0;

    /* renamed from: j0  reason: collision with root package name */
    public final C3042j f52038j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC3423b f52039k0;

    /* renamed from: l0  reason: collision with root package name */
    public final V f52040l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C4290b f52041m0;

    /* renamed from: n0  reason: collision with root package name */
    public final A f52042n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C1008q f52043o0;

    /* renamed from: p0  reason: collision with root package name */
    public final EnumC0998g f52044p0;

    /* renamed from: q0  reason: collision with root package name */
    public final I f52045q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ug.o f52046r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C1696h f52047s0;

    /* renamed from: t0  reason: collision with root package name */
    public final T f52048t0;

    /* renamed from: u0  reason: collision with root package name */
    public final U3.n f52049u0;

    /* renamed from: v0  reason: collision with root package name */
    public final AbstractC1003l f52050v0;

    /* renamed from: w0  reason: collision with root package name */
    public final Ag.j f52051w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Ag.l f52052x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Ag.j f52053y0;

    /* renamed from: z0  reason: collision with root package name */
    public final Ag.l f52054z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r12v12, types: [U3.n, java.lang.Object] */
    public C6862i(I i10, C3042j c3042j, AbstractC3428g abstractC3428g, AbstractC3423b abstractC3423b, V v10) {
        super(i10.c(), R4.b.f1(abstractC3428g, c3042j.f30651j0).i());
        int i11;
        EnumC0998g enumC0998g;
        ug.o oVar;
        U3.n nVar;
        C6862i c6862i;
        Nf.i iVar;
        boolean z10;
        AbstractC3557B.c0("outerContext", i10);
        AbstractC3557B.c0("classProto", c3042j);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("metadataVersion", abstractC3423b);
        AbstractC3557B.c0("sourceElement", v10);
        this.f52038j0 = c3042j;
        this.f52039k0 = abstractC3423b;
        this.f52040l0 = v10;
        this.f52041m0 = R4.b.f1(abstractC3428g, c3042j.f30651j0);
        this.f52042n0 = xg.n.f((EnumC3030A) AbstractC3427f.f32316e.c(c3042j.f30650i0));
        this.f52043o0 = Bi.c.K0((f0) AbstractC3427f.f32315d.c(c3042j.f30650i0));
        EnumC3041i enumC3041i = (EnumC3041i) AbstractC3427f.f32317f.c(c3042j.f30650i0);
        if (enumC3041i == null) {
            i11 = -1;
        } else {
            i11 = E.f49971b[enumC3041i.ordinal()];
        }
        switch (i11) {
            case 1:
                enumC0998g = EnumC0998g.f12084Y;
                break;
            case 2:
                enumC0998g = EnumC0998g.f12085Z;
                break;
            case 3:
                enumC0998g = EnumC0998g.f12086h0;
                break;
            case 4:
                enumC0998g = EnumC0998g.f12087i0;
                break;
            case 5:
                enumC0998g = EnumC0998g.f12088j0;
                break;
            case 6:
            case 7:
                enumC0998g = EnumC0998g.f12089k0;
                break;
            default:
                enumC0998g = EnumC0998g.f12084Y;
                break;
        }
        this.f52044p0 = enumC0998g;
        List list = c3042j.f30653l0;
        AbstractC3557B.b0("getTypeParameterList(...)", list);
        X x10 = c3042j.f30643J0;
        AbstractC3557B.b0("getTypeTable(...)", x10);
        C3430i c3430i = new C3430i(x10);
        e0 e0Var = c3042j.f30645L0;
        AbstractC3557B.b0("getVersionRequirementTable(...)", e0Var);
        I a5 = i10.a(this, list, abstractC3428g, c3430i, C3431j.c(e0Var), abstractC3423b);
        this.f52045q0 = a5;
        EnumC0998g enumC0998g2 = EnumC0998g.f12086h0;
        Object obj = a5.f11536a;
        if (enumC0998g == enumC0998g2) {
            if (!AbstractC3427f.f32324m.c(c3042j.f30650i0).booleanValue() && !AbstractC3557B.K(((xg.m) obj).f50028s.d(), Boolean.TRUE)) {
                z10 = false;
            } else {
                z10 = true;
            }
            oVar = new ug.r(a5.c(), this, z10);
        } else {
            oVar = ug.m.f46797b;
        }
        this.f52046r0 = oVar;
        this.f52047s0 = new C1696h(this);
        Cf.h hVar = T.f12069e;
        Ag.u c10 = a5.c();
        Cg.i iVar2 = ((Cg.o) ((xg.m) obj).f50026q).f3143c;
        C6861h c6861h = new C6861h(2, this);
        hVar.getClass();
        AbstractC3557B.c0("storageManager", c10);
        AbstractC3557B.c0("kotlinTypeRefinerForOwnerModule", iVar2);
        this.f52048t0 = new T(this, c10, c6861h, iVar2);
        C6445B c6445b = null;
        if (enumC0998g == enumC0998g2) {
            ?? obj2 = new Object();
            obj2.f17429i0 = this;
            List list2 = c3042j.f30666y0;
            AbstractC3557B.b0("getEnumEntryList(...)", list2);
            C6862i c6862i2 = (C6862i) obj2.f17429i0;
            int n02 = P4.a.n0(AbstractC6583a.H1(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(n02 < 16 ? 16 : n02);
            for (Object obj3 : list2) {
                linkedHashMap.put(R4.b.o1(c6862i2.f52045q0.f11537b, ((C3051t) obj3).f30721i0), obj3);
            }
            obj2.f17426Y = linkedHashMap;
            obj2.f17427Z = ((Ag.q) ((C6862i) obj2.f17429i0).f52045q0.c()).c(new Oc.c(obj2, 25, (C6862i) obj2.f17429i0));
            Ag.u c11 = ((C6862i) obj2.f17429i0).f52045q0.c();
            Uf.A a10 = new Uf.A(11, obj2);
            Ag.q qVar = (Ag.q) c11;
            qVar.getClass();
            obj2.f17428h0 = new Ag.l(qVar, a10);
            nVar = obj2;
        } else {
            nVar = null;
        }
        this.f52049u0 = nVar;
        AbstractC1003l abstractC1003l = (AbstractC1003l) i10.f11538c;
        this.f52050v0 = abstractC1003l;
        Ag.u c12 = this.f52045q0.c();
        C6860g c6860g = new C6860g(this, 4);
        Ag.q qVar2 = (Ag.q) c12;
        qVar2.getClass();
        this.f52051w0 = new Ag.j(qVar2, c6860g);
        Ag.u c13 = this.f52045q0.c();
        C6860g c6860g2 = new C6860g(this, 3);
        Ag.q qVar3 = (Ag.q) c13;
        qVar3.getClass();
        this.f52052x0 = new Ag.l(qVar3, c6860g2);
        Ag.u c14 = this.f52045q0.c();
        C6860g c6860g3 = new C6860g(this, 2);
        Ag.q qVar4 = (Ag.q) c14;
        qVar4.getClass();
        this.f52053y0 = new Ag.j(qVar4, c6860g3);
        Ag.u c15 = this.f52045q0.c();
        C6860g c6860g4 = new C6860g(this, 5);
        Ag.q qVar5 = (Ag.q) c15;
        qVar5.getClass();
        this.f52054z0 = new Ag.l(qVar5, c6860g4);
        Ag.u c16 = this.f52045q0.c();
        C6860g c6860g5 = new C6860g(this, 6);
        Ag.q qVar6 = (Ag.q) c16;
        qVar6.getClass();
        this.f52035A0 = new Ag.j(qVar6, c6860g5);
        C3042j c3042j2 = this.f52038j0;
        I i12 = this.f52045q0;
        AbstractC3428g abstractC3428g2 = i12.f11537b;
        C3430i c3430i2 = (C3430i) i12.f11539d;
        V v11 = this.f52040l0;
        if (abstractC1003l instanceof C6862i) {
            c6862i = (C6862i) abstractC1003l;
        } else {
            c6862i = null;
        }
        this.f52036B0 = new C6445B(c3042j2, abstractC3428g2, c3430i2, v11, c6862i != null ? c6862i.f52036B0 : c6445b);
        if (!AbstractC3427f.f32314c.c(this.f52038j0.f30650i0).booleanValue()) {
            iVar = Nf.h.f12822a;
        } else {
            iVar = new v(this.f52045q0.c(), new C6860g(this, 1));
        }
        this.f52037C0 = iVar;
    }

    @Override // Mf.AbstractC0997f
    public final boolean F() {
        if (AbstractC3427f.f32322k.c(this.f52038j0.f30650i0).booleanValue() && this.f52039k0.a(1, 4, 2)) {
            return true;
        }
        return false;
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return AbstractC3427f.f32321j.c(this.f52038j0.f30650i0).booleanValue();
    }

    @Override // Mf.AbstractC1001j
    public final boolean I() {
        return AbstractC3427f.f32318g.c(this.f52038j0.f30650i0).booleanValue();
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0996e M() {
        return (AbstractC0996e) this.f52051w0.mo122invoke();
    }

    @Override // Mf.AbstractC0997f
    public final ug.n N() {
        return this.f52046r0;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0997f P() {
        return (AbstractC0997f) this.f52053y0.mo122invoke();
    }

    @Override // Mf.AbstractC0997f
    public final EnumC0998g e() {
        return this.f52044p0;
    }

    @Override // Mf.AbstractC1000i
    public final Y f() {
        return this.f52047s0;
    }

    @Override // Mf.AbstractC1004m
    public final V g() {
        return this.f52040l0;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        return this.f52037C0;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        return this.f52043o0;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1016z
    public final A h() {
        return this.f52042n0;
    }

    @Override // Mf.AbstractC0997f
    public final Collection i() {
        return (Collection) this.f52054z0.mo122invoke();
    }

    @Override // Mf.AbstractC1016z
    public final boolean isExternal() {
        return AbstractC3427f.f32320i.c(this.f52038j0.f30650i0).booleanValue();
    }

    @Override // Mf.AbstractC0997f
    public final boolean isInline() {
        if (AbstractC3427f.f32322k.c(this.f52038j0.f30650i0).booleanValue()) {
            AbstractC3423b abstractC3423b = this.f52039k0;
            int i10 = abstractC3423b.f32291b;
            if (i10 < 1) {
                return true;
            }
            if (i10 <= 1) {
                int i11 = abstractC3423b.f32292c;
                if (i11 < 4) {
                    return true;
                }
                if (i11 <= 4 && abstractC3423b.f32293d <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final Mf.f0 j0() {
        return (Mf.f0) this.f52035A0.mo122invoke();
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        return this.f52050v0;
    }

    @Override // Pf.D
    public final ug.n k0(Cg.i iVar) {
        T t10 = this.f52048t0;
        t10.getClass();
        AbstractC5493d.j(t10.f12071a);
        return (ug.n) A7.b.X0(t10.f12074d, T.f12070f[0]);
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1001j
    public final List o() {
        return ((K) this.f52045q0.f11543h).b();
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final boolean q() {
        if (AbstractC3427f.f32317f.c(this.f52038j0.f30650i0) == EnumC3041i.COMPANION_OBJECT) {
            return true;
        }
        return false;
    }

    @Override // Pf.AbstractC1144b, Mf.AbstractC0997f
    public final List r0() {
        I i10 = this.f52045q0;
        C3430i c3430i = (C3430i) i10.f11539d;
        C3042j c3042j = this.f52038j0;
        AbstractC3557B.c0("<this>", c3042j);
        AbstractC3557B.c0("typeTable", c3430i);
        List<Q> list = c3042j.f30659r0;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = c3042j.f30660s0;
            AbstractC3557B.b0("getContextReceiverTypeIdList(...)", list2);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list2, 10));
            for (Integer num : list2) {
                AbstractC3557B.Z(num);
                arrayList.add(c3430i.a(num.intValue()));
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        for (Q q10 : list) {
            arrayList2.add(new S(v0(), new vg.b(this, ((K) i10.f11543h).g(q10), (C4294f) null), Nf.h.f12822a));
        }
        return arrayList2;
    }

    @Override // Mf.AbstractC0997f
    public final boolean t0() {
        return AbstractC3427f.f32319h.c(this.f52038j0.f30650i0).booleanValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("deserialized ");
        if (H()) {
            str = "expect ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // Mf.AbstractC0997f
    public final Collection u() {
        return (Collection) this.f52052x0.mo122invoke();
    }

    public final C6859f x0() {
        Cg.i iVar = ((Cg.o) ((xg.m) this.f52045q0.f11536a).f50026q).f3143c;
        T t10 = this.f52048t0;
        t10.getClass();
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        AbstractC5493d.j(t10.f12071a);
        return (C6859f) ((ug.n) A7.b.X0(t10.f12074d, T.f12070f[0]));
    }

    @Override // Mf.AbstractC0997f
    public final boolean y() {
        return AbstractC3427f.f32323l.c(this.f52038j0.f30650i0).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r1 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D y0(C4294f c4294f) {
        Iterator it = x0().f(c4294f, Tf.d.f17217l0).iterator();
        Bg.A a5 = null;
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((P) next).Z() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        P p10 = (P) obj;
        if (p10 != null) {
            a5 = p10.getType();
        }
        return (D) a5;
    }
}
