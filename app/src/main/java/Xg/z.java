package xg;

import L.N;
import Mf.AbstractC0993b;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.EnumC0998g;
import Mf.U;
import Mf.V;
import Mf.h0;
import Pf.AbstractC1146d;
import Pf.C1163v;
import Pf.P;
import Pf.S;
import Pf.b0;
import fg.C3044l;
import fg.C3056y;
import fg.EnumC3030A;
import fg.EnumC3057z;
import fg.Q;
import fg.Z;
import fg.f0;
import hg.AbstractC3423b;
import hg.AbstractC3427f;
import hg.C3424c;
import hg.C3425d;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kg.C4291c;
import kg.C4294f;
import l8.AbstractC4344b;
import lg.AbstractC4456a;
import rg.AbstractC5493d;
import yf.AbstractC6583a;
import zg.AbstractC6864k;
import zg.C6854a;
import zg.C6856c;
import zg.C6862i;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final M3.I f50057a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.c f50058b;

    public z(M3.I i10) {
        AbstractC3557B.c0("c", i10);
        this.f50057a = i10;
        Object obj = i10.f11536a;
        this.f50058b = new U3.c(((m) obj).f50011b, ((m) obj).f50021l);
    }

    public final D a(AbstractC1003l abstractC1003l) {
        if (abstractC1003l instanceof Mf.G) {
            C4291c c4291c = ((Pf.I) ((Mf.G) abstractC1003l)).f14010j0;
            M3.I i10 = this.f50057a;
            return new C(c4291c, i10.f11537b, (C3430i) i10.f11539d, (AbstractC6864k) i10.f11542g);
        } else if (abstractC1003l instanceof C6862i) {
            return ((C6862i) abstractC1003l).f52036B0;
        } else {
            return null;
        }
    }

    public final Nf.i b(AbstractC4456a abstractC4456a, int i10, EnumC6447b enumC6447b) {
        if (!AbstractC3427f.f32314c.c(i10).booleanValue()) {
            return Nf.h.f12822a;
        }
        return new zg.v(this.f50057a.c(), new x(this, abstractC4456a, enumC6447b, 0));
    }

    public final Nf.i c(fg.G g10, boolean z10) {
        if (!AbstractC3427f.f32314c.c(g10.f30312i0).booleanValue()) {
            return Nf.h.f12822a;
        }
        return new zg.v(this.f50057a.c(), new N(this, z10, g10));
    }

    public final C6856c d(C3044l c3044l, boolean z10) {
        M3.I a5;
        M3.I i10 = this.f50057a;
        AbstractC1003l abstractC1003l = (AbstractC1003l) i10.f11538c;
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", abstractC1003l);
        AbstractC0997f abstractC0997f = (AbstractC0997f) abstractC1003l;
        int i11 = c3044l.f30676i0;
        EnumC6447b enumC6447b = EnumC6447b.f49992Y;
        C6856c c6856c = new C6856c(abstractC0997f, null, b(c3044l, i11, enumC6447b), z10, 1, c3044l, i10.f11537b, (C3430i) i10.f11539d, (C3432k) i10.f11540e, (AbstractC6864k) i10.f11542g, null);
        a5 = i10.a(c6856c, kf.v.f37483Y, i10.f11537b, (C3430i) i10.f11539d, (C3432k) i10.f11540e, (AbstractC3423b) i10.f11541f);
        List list = c3044l.f30677j0;
        AbstractC3557B.b0("getValueParameterList(...)", list);
        c6856c.K0(((z) a5.f11544i).g(list, c3044l, enumC6447b), Bi.c.K0((f0) AbstractC3427f.f32315d.c(c3044l.f30676i0)));
        c6856c.G0(abstractC0997f.n());
        c6856c.f14182w0 = abstractC0997f.H();
        c6856c.f14161B0 = !AbstractC3427f.f32326o.c(c3044l.f30676i0).booleanValue();
        return c6856c;
    }

    public final zg.s e(C3056y c3056y) {
        int i10;
        Nf.i iVar;
        C3432k c3432k;
        M3.I a5;
        S s10;
        AbstractC0997f abstractC0997f;
        AbstractC1146d abstractC1146d;
        Bg.A g10;
        AbstractC3557B.c0("proto", c3056y);
        if ((c3056y.f30768h0 & 1) == 1) {
            i10 = c3056y.f30769i0;
        } else {
            int i11 = c3056y.f30770j0;
            i10 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i10;
        EnumC6447b enumC6447b = EnumC6447b.f49992Y;
        Nf.i b10 = b(c3056y, i12, enumC6447b);
        boolean o10 = c3056y.o();
        Nf.i iVar2 = Nf.h.f12822a;
        M3.I i13 = this.f50057a;
        if (!o10 && (c3056y.f30768h0 & 64) != 64) {
            iVar = iVar2;
        } else {
            iVar = new C6854a(i13.c(), new x(this, c3056y, enumC6447b, 1));
        }
        if (AbstractC3557B.K(AbstractC5493d.g((AbstractC1003l) i13.f11538c).c(R4.b.o1(i13.f11537b, c3056y.f30771k0)), G.f49974a)) {
            c3432k = C3432k.f32342a;
        } else {
            c3432k = (C3432k) i13.f11540e;
        }
        Nf.i iVar3 = iVar;
        Nf.i iVar4 = iVar2;
        zg.s sVar = new zg.s((AbstractC1003l) i13.f11538c, null, b10, R4.b.o1(i13.f11537b, c3056y.f30771k0), Bi.c.p1((EnumC3057z) AbstractC3427f.f32327p.c(i12)), c3056y, i13.f11537b, (C3430i) i13.f11539d, c3432k, (AbstractC6864k) i13.f11542g, null);
        List list = c3056y.f30774n0;
        AbstractC3557B.b0("getTypeParameterList(...)", list);
        a5 = i13.a(sVar, list, i13.f11537b, (C3430i) i13.f11539d, (C3432k) i13.f11540e, (AbstractC3423b) i13.f11541f);
        Q y02 = P4.a.y0(c3056y, (C3430i) i13.f11539d);
        Object obj = a5.f11543h;
        if (y02 != null && (g10 = ((K) obj).g(y02)) != null) {
            s10 = R4.b.h0(sVar, g10, iVar3);
        } else {
            s10 = null;
        }
        AbstractC1003l abstractC1003l = (AbstractC1003l) i13.f11538c;
        if (abstractC1003l instanceof AbstractC0997f) {
            abstractC0997f = (AbstractC0997f) abstractC1003l;
        } else {
            abstractC0997f = null;
        }
        if (abstractC0997f != null) {
            abstractC1146d = abstractC0997f.v0();
        } else {
            abstractC1146d = null;
        }
        C3430i c3430i = (C3430i) i13.f11539d;
        AbstractC3557B.c0("typeTable", c3430i);
        ArrayList arrayList = c3056y.f30777q0;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list2 = c3056y.f30778r0;
            AbstractC3557B.b0("getContextReceiverTypeIdList(...)", list2);
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list2, 10));
            for (Integer num : list2) {
                AbstractC3557B.Z(num);
                arrayList2.add(c3430i.a(num.intValue()));
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        for (Object obj2 : arrayList) {
            int i15 = i14 + 1;
            if (i14 >= 0) {
                Nf.i iVar5 = iVar4;
                S b02 = R4.b.b0(sVar, ((K) obj).g((Q) obj2), null, iVar5, i14);
                if (b02 != null) {
                    arrayList3.add(b02);
                }
                i14 = i15;
                iVar4 = iVar5;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        K k10 = (K) obj;
        List b11 = k10.b();
        List list3 = c3056y.f30780t0;
        AbstractC3557B.b0("getValueParameterList(...)", list3);
        sVar.K0(s10, abstractC1146d, arrayList3, b11, ((z) a5.f11544i).g(list3, c3056y, enumC6447b), k10.g(P4.a.D0(c3056y, (C3430i) i13.f11539d)), n.f((EnumC3030A) AbstractC3427f.f32316e.c(i12)), Bi.c.K0((f0) AbstractC3427f.f32315d.c(i12)), kf.w.f37484Y);
        sVar.f14177r0 = AbstractC3427f.f32328q.c(i12).booleanValue();
        sVar.f14178s0 = AbstractC3427f.f32329r.c(i12).booleanValue();
        sVar.f14179t0 = AbstractC3427f.f32332u.c(i12).booleanValue();
        sVar.f14180u0 = AbstractC3427f.f32330s.c(i12).booleanValue();
        sVar.f14181v0 = AbstractC3427f.f32331t.c(i12).booleanValue();
        sVar.f14160A0 = AbstractC3427f.f32333v.c(i12).booleanValue();
        sVar.f14182w0 = AbstractC3427f.f32334w.c(i12).booleanValue();
        sVar.f14161B0 = !AbstractC3427f.f32335x.c(i12).booleanValue();
        ((n) ((m) i13.f11536a).f50022m).getClass();
        AbstractC3557B.c0("typeTable", (C3430i) i13.f11539d);
        AbstractC3557B.c0("typeDeserializer", k10);
        return sVar;
    }

    public final zg.r f(fg.G g10) {
        int i10;
        M3.I a5;
        Nf.i iVar;
        AbstractC0997f abstractC0997f;
        AbstractC1146d abstractC1146d;
        EnumC6447b enumC6447b;
        Q q10;
        S s10;
        int i11;
        C3424c c3424c;
        C3424c c3424c2;
        M3.I i12;
        C3425d c3425d;
        int i13;
        int i14;
        C3425d c3425d2;
        P p10;
        C3424c c3424c3;
        P p11;
        Pf.Q q11;
        Ag.j jVar;
        z zVar;
        AbstractC0997f abstractC0997f2;
        EnumC0998g enumC0998g;
        int i15;
        M3.I a10;
        int i16;
        P p12;
        Bg.A g11;
        AbstractC3557B.c0("proto", g10);
        if ((g10.f30311h0 & 1) == 1) {
            i10 = g10.f30312i0;
        } else {
            int i17 = g10.f30313j0;
            i10 = ((i17 >> 8) << 6) + (i17 & 63);
        }
        int i18 = i10;
        M3.I i19 = this.f50057a;
        zg.r rVar = new zg.r((AbstractC1003l) i19.f11538c, null, b(g10, i18, EnumC6447b.f49993Z), n.f((EnumC3030A) AbstractC3427f.f32316e.c(i18)), Bi.c.K0((f0) AbstractC3427f.f32315d.c(i18)), AbstractC3427f.f32336y.c(i18).booleanValue(), R4.b.o1(i19.f11537b, g10.f30314k0), Bi.c.p1((EnumC3057z) AbstractC3427f.f32327p.c(i18)), AbstractC3427f.f32300C.c(i18).booleanValue(), AbstractC3427f.f32299B.c(i18).booleanValue(), AbstractC3427f.f32302E.c(i18).booleanValue(), AbstractC3427f.f32303F.c(i18).booleanValue(), AbstractC3427f.f32304G.c(i18).booleanValue(), g10, i19.f11537b, (C3430i) i19.f11539d, (C3432k) i19.f11540e, (AbstractC6864k) i19.f11542g);
        List list = g10.f30317n0;
        AbstractC3557B.b0("getTypeParameterList(...)", list);
        a5 = i19.a(rVar, list, i19.f11537b, (C3430i) i19.f11539d, (C3432k) i19.f11540e, (AbstractC3423b) i19.f11541f);
        boolean booleanValue = AbstractC3427f.f32337z.c(i18).booleanValue();
        Nf.g gVar = Nf.h.f12822a;
        EnumC6447b enumC6447b2 = EnumC6447b.f49994h0;
        if (booleanValue && (g10.o() || (g10.f30311h0 & 64) == 64)) {
            iVar = new C6854a(i19.c(), new x(this, g10, enumC6447b2, 1));
        } else {
            iVar = gVar;
        }
        Object obj = a5.f11543h;
        K k10 = (K) obj;
        Bg.A g12 = k10.g(P4.a.E0(g10, (C3430i) i19.f11539d));
        List b10 = k10.b();
        AbstractC1003l abstractC1003l = (AbstractC1003l) i19.f11538c;
        if (abstractC1003l instanceof AbstractC0997f) {
            abstractC0997f = (AbstractC0997f) abstractC1003l;
        } else {
            abstractC0997f = null;
        }
        if (abstractC0997f != null) {
            abstractC1146d = abstractC0997f.v0();
        } else {
            abstractC1146d = null;
        }
        C3430i c3430i = (C3430i) i19.f11539d;
        AbstractC3557B.c0("typeTable", c3430i);
        if (g10.o()) {
            q10 = g10.f30318o0;
            enumC6447b = enumC6447b2;
        } else {
            enumC6447b = enumC6447b2;
            if ((g10.f30311h0 & 64) == 64) {
                q10 = c3430i.a(g10.f30319p0);
            } else {
                q10 = null;
            }
        }
        if (q10 != null && (g11 = k10.g(q10)) != null) {
            s10 = R4.b.h0(rVar, g11, iVar);
        } else {
            s10 = null;
        }
        C3430i c3430i2 = (C3430i) i19.f11539d;
        AbstractC3557B.c0("typeTable", c3430i2);
        ArrayList arrayList = g10.f30320q0;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list2 = g10.f30321r0;
            AbstractC3557B.b0("getContextReceiverTypeIdList(...)", list2);
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list2, 10));
            for (Integer num : list2) {
                AbstractC3557B.Z(num);
                arrayList2.add(c3430i2.a(num.intValue()));
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        int i20 = 0;
        for (Object obj2 : arrayList) {
            int i21 = i20 + 1;
            if (i20 >= 0) {
                arrayList3.add(R4.b.b0(rVar, ((K) obj).g((Q) obj2), null, gVar, i20));
                i20 = i21;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        rVar.E0(g12, b10, abstractC1146d, s10, arrayList3);
        C3424c c3424c4 = AbstractC3427f.f32314c;
        boolean booleanValue2 = c3424c4.c(i18).booleanValue();
        C3425d c3425d3 = AbstractC3427f.f32315d;
        f0 f0Var = (f0) c3425d3.c(i18);
        C3425d c3425d4 = AbstractC3427f.f32316e;
        EnumC3030A enumC3030A = (EnumC3030A) c3425d4.c(i18);
        if (f0Var != null) {
            if (enumC3030A != null) {
                if (booleanValue2) {
                    i11 = 1 << c3424c4.f32296a;
                } else {
                    i11 = 0;
                }
                int a11 = i11 | (enumC3030A.a() << c3425d4.f32296a) | (f0Var.a() << c3425d3.f32296a);
                C3424c c3424c5 = AbstractC3427f.f32308K;
                c3424c5.getClass();
                C3424c c3424c6 = AbstractC3427f.f32309L;
                c3424c6.getClass();
                C3424c c3424c7 = AbstractC3427f.f32310M;
                c3424c7.getClass();
                U u10 = V.f12075a;
                if (booleanValue) {
                    if ((g10.f30311h0 & 256) == 256) {
                        i16 = g10.f30324u0;
                    } else {
                        i16 = a11;
                    }
                    boolean booleanValue3 = c3424c5.c(i16).booleanValue();
                    boolean booleanValue4 = c3424c6.c(i16).booleanValue();
                    boolean booleanValue5 = c3424c7.c(i16).booleanValue();
                    Nf.i b11 = b(g10, i16, enumC6447b);
                    if (booleanValue3) {
                        c3424c2 = c3424c7;
                        c3424c = c3424c6;
                        i13 = a11;
                        c3424c3 = c3424c5;
                        i12 = i19;
                        c3425d2 = c3425d4;
                        c3425d = c3425d3;
                        i14 = i18;
                        p12 = new P(rVar, b11, n.f((EnumC3030A) c3425d4.c(i16)), Bi.c.K0((f0) c3425d3.c(i16)), !booleanValue3, booleanValue4, booleanValue5, rVar.e(), null, u10);
                    } else {
                        i13 = a11;
                        c3424c2 = c3424c7;
                        c3424c = c3424c6;
                        c3424c3 = c3424c5;
                        i12 = i19;
                        c3425d = c3425d3;
                        c3425d2 = c3425d4;
                        i14 = i18;
                        p12 = R4.b.c0(rVar, b11);
                    }
                    p12.z0(rVar.getReturnType());
                    p10 = p12;
                } else {
                    i13 = a11;
                    c3424c2 = c3424c7;
                    c3424c = c3424c6;
                    c3424c3 = c3424c5;
                    i12 = i19;
                    c3425d = c3425d3;
                    c3425d2 = c3425d4;
                    i14 = i18;
                    p10 = null;
                }
                if (AbstractC3427f.f32298A.c(i14).booleanValue()) {
                    if ((g10.f30311h0 & 512) == 512) {
                        i15 = g10.f30325v0;
                    } else {
                        i15 = i13;
                    }
                    boolean booleanValue6 = c3424c3.c(i15).booleanValue();
                    boolean booleanValue7 = c3424c.c(i15).booleanValue();
                    boolean booleanValue8 = c3424c2.c(i15).booleanValue();
                    EnumC6447b enumC6447b3 = EnumC6447b.f49995i0;
                    Nf.i b12 = b(g10, i15, enumC6447b3);
                    if (booleanValue6) {
                        zVar = this;
                        p11 = p10;
                        q11 = new Pf.Q(rVar, b12, n.f((EnumC3030A) c3425d2.c(i15)), Bi.c.K0((f0) c3425d.c(i15)), !booleanValue6, booleanValue7, booleanValue8, rVar.e(), null, u10);
                        a10 = a5.a(q11, kf.v.f37483Y, a5.f11537b, (C3430i) a5.f11539d, (C3432k) a5.f11540e, (AbstractC3423b) a5.f11541f);
                        h0 h0Var = (h0) kf.t.B2(((z) a10.f11544i).g(AbstractC4344b.F0(g10.f30323t0), g10, enumC6447b3));
                        if (h0Var != null) {
                            q11.f14059r0 = h0Var;
                            jVar = null;
                        } else {
                            Pf.Q.C(6);
                            throw null;
                        }
                    } else {
                        zVar = this;
                        p11 = p10;
                        jVar = null;
                        q11 = R4.b.d0(rVar, b12);
                    }
                } else {
                    zVar = this;
                    p11 = p10;
                    jVar = null;
                    q11 = null;
                }
                if (AbstractC3427f.f32301D.c(i14).booleanValue()) {
                    rVar.C0(jVar, new y(zVar, g10, rVar, 1));
                }
                AbstractC1003l abstractC1003l2 = (AbstractC1003l) i12.f11538c;
                if (abstractC1003l2 instanceof AbstractC0997f) {
                    abstractC0997f2 = (AbstractC0997f) abstractC1003l2;
                } else {
                    abstractC0997f2 = null;
                }
                if (abstractC0997f2 != null) {
                    enumC0998g = abstractC0997f2.e();
                } else {
                    enumC0998g = null;
                }
                if (enumC0998g == EnumC0998g.f12088j0) {
                    rVar.C0(null, new y(zVar, g10, rVar, 3));
                }
                rVar.B0(p11, q11, new C1163v(rVar, zVar.c(g10, false)), new C1163v(rVar, zVar.c(g10, true)));
                return rVar;
            }
            AbstractC3427f.a(11);
            throw null;
        }
        AbstractC3427f.a(10);
        throw null;
    }

    public final List g(List list, AbstractC4456a abstractC4456a, EnumC6447b enumC6447b) {
        int i10;
        Nf.i iVar;
        Q q10;
        Bg.A a5;
        M3.I i11 = this.f50057a;
        AbstractC1003l abstractC1003l = (AbstractC1003l) i11.f11538c;
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor", abstractC1003l);
        AbstractC0993b abstractC0993b = (AbstractC0993b) abstractC1003l;
        AbstractC1003l mo20k = abstractC0993b.mo20k();
        AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
        D a10 = a(mo20k);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 >= 0) {
                Z z10 = (Z) obj;
                if ((z10.f30481h0 & 1) == 1) {
                    i10 = z10.f30482i0;
                } else {
                    i10 = 0;
                }
                if (a10 != null && AbstractC3427f.f32314c.c(i10).booleanValue()) {
                    iVar = new zg.v(i11.c(), new c1.o(i12, 1, this, a10, abstractC4456a, enumC6447b, z10));
                } else {
                    iVar = Nf.h.f12822a;
                }
                C4294f o12 = R4.b.o1(i11.f11537b, z10.f30483j0);
                Object obj2 = i11.f11543h;
                Bg.A g10 = ((K) obj2).g(P4.a.O0(z10, (C3430i) i11.f11539d));
                boolean booleanValue = AbstractC3427f.f32305H.c(i10).booleanValue();
                boolean booleanValue2 = AbstractC3427f.f32306I.c(i10).booleanValue();
                boolean booleanValue3 = AbstractC3427f.f32307J.c(i10).booleanValue();
                C3430i c3430i = (C3430i) i11.f11539d;
                AbstractC3557B.c0("typeTable", c3430i);
                int i14 = z10.f30481h0;
                if ((i14 & 16) == 16) {
                    q10 = z10.f30486m0;
                } else if ((i14 & 32) == 32) {
                    q10 = c3430i.a(z10.f30487n0);
                } else {
                    q10 = null;
                }
                if (q10 != null) {
                    a5 = ((K) obj2).g(q10);
                } else {
                    a5 = null;
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new b0(abstractC0993b, null, i12, iVar, o12, g10, booleanValue, booleanValue2, booleanValue3, a5, V.f12075a));
                arrayList = arrayList2;
                i12 = i13;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        return kf.t.K2(arrayList);
    }
}
