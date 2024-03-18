package na;

import A.AbstractC0044t0;
import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.AbstractC0441z;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import cb.C2334C;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jf.AbstractC3953c;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import ta.AbstractC5690F;
import wd.C6189g;
import wd.EnumC6212z;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: na.k0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4766k0 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40008Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f40009Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ D1 f40010h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f40011i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f40012j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f40013k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f40014l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4766k0(D1 d12, Tc.f fVar, AbstractC0408g abstractC0408g, C4769l0 c4769l0, C4769l0 c4769l02, I9.B b10) {
        super(3);
        this.f40010h0 = d12;
        this.f40012j0 = fVar;
        this.f40011i0 = abstractC0408g;
        this.f40013k0 = c4769l0;
        this.f40014l0 = c4769l02;
        this.f40009Z = b10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x052f, code lost:
        if (id.AbstractC3557B.K(r5.K(), java.lang.Integer.valueOf(r12)) == false) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f4  */
    @Override // wf.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC0408g abstractC0408g;
        AbstractC0408g abstractC0408g2;
        boolean z10;
        AbstractC4326r abstractC4326r;
        AbstractC6216a abstractC6216a;
        io.sentry.hints.i iVar;
        C4323o c4323o;
        AbstractC0408g abstractC0408g3;
        D1 d12;
        jf.y yVar;
        boolean z11;
        int i10;
        boolean z12;
        M1 m12;
        boolean z13;
        boolean z14;
        boolean z15;
        List list;
        C6189g c6189g;
        I9.c1 c1Var;
        int i11;
        jf.y yVar2;
        C4323o c4323o2;
        zd.n nVar;
        C4323o c4323o3;
        List<Sc.f> list2;
        C4803y0 c4803y0;
        boolean z16;
        C4799w0 c4799w0;
        boolean z17;
        jf.y yVar3 = jf.y.f36177a;
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        C4323o c4323o4 = C4323o.f37719b;
        int i12 = this.f40008Y;
        AbstractC3953c abstractC3953c = this.f40013k0;
        Object obj4 = this.f40012j0;
        AbstractC0408g abstractC0408g4 = this.f40011i0;
        D1 d13 = this.f40010h0;
        AbstractC3953c abstractC3953c2 = this.f40014l0;
        AbstractC6216a abstractC6216a2 = this.f40009Z;
        switch (i12) {
            case 0:
                E.g0 g0Var = (E.g0) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("paddings", g0Var);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    intValue |= ((Z.r) abstractC1725n).g(g0Var) ? 4 : 2;
                }
                if ((intValue & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar3;
                    }
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                Z0.l lVar = (Z0.l) rVar2.m(AbstractC0701r0.f7008k);
                AbstractC4326r g10 = androidx.compose.foundation.layout.a.u(c4323o4, androidx.compose.foundation.layout.a.h(g0Var, lVar), g0Var.d(), androidx.compose.foundation.layout.a.g(g0Var, lVar), p9.r.f42837a).g(androidx.compose.foundation.layout.e.f24739c);
                Tc.f fVar = (Tc.f) obj4;
                AbstractC0408g abstractC0408g5 = (AbstractC0408g) abstractC3953c;
                AbstractC0408g abstractC0408g6 = (AbstractC0408g) abstractC3953c2;
                rVar2.W(-483455358);
                E0.N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
                rVar2.W(-1323940314);
                int i13 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(g10);
                boolean z18 = rVar2.f22696a instanceof AbstractC1707e;
                if (z18) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar2, a5, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar2, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    if (!rVar2.f22695O) {
                        abstractC0408g = abstractC0408g5;
                        break;
                    } else {
                        abstractC0408g = abstractC0408g5;
                    }
                    AbstractC6463a.q(i13, rVar2, i13, c0581j3);
                    AbstractC6463a.t(rVar2, i14, rVar2, 0, 2058660585);
                    E.A a10 = E.A.f3733a;
                    AbstractC4326r a11 = io.sentry.compose.b.a("ConversationScreenContent");
                    AbstractC4326r a12 = AbstractC4194d.a((G0.X) a11, androidx.compose.foundation.layout.e.d(AbstractC0044t0.P(a10, c4323o4), 1.0f));
                    boolean z19 = d13.f39756K;
                    List list3 = d13.f39771j;
                    C2334C c2334c = d13.f39759N;
                    if (z19) {
                        rVar2.W(-207515592);
                        abstractC0408g2 = abstractC0408g4;
                        x8.W.u(fVar, a11, rVar2, 8, 2);
                        rVar2.t(false);
                        z10 = false;
                    } else {
                        abstractC0408g2 = abstractC0408g4;
                        if (list3.isEmpty() && d13.f39753H) {
                            if (AbstractC3557B.K(d13.f39754I, Boolean.FALSE) && c2334c == null) {
                                rVar2.W(-207515486);
                                x8.W.o(fVar, a11, rVar2, 8, 2);
                                z10 = false;
                                rVar2.t(false);
                            }
                        }
                        z10 = false;
                        rVar2.W(-207515438);
                        rVar2.t(false);
                    }
                    boolean isEmpty = list3.isEmpty();
                    C2334C c2334c2 = d13.f39759N;
                    if (isEmpty) {
                        rVar2.W(-207515316);
                        rVar2.W(733328855);
                        E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, z10, rVar2);
                        rVar2.W(-1323940314);
                        int i15 = rVar2.P;
                        abstractC4326r = a11;
                        AbstractC1732q0 p11 = rVar2.p();
                        C3288a i16 = androidx.compose.ui.layout.a.i(a12);
                        if (z18) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, c10, c0581j);
                            U3.f.n0(rVar2, p11, c0581j2);
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i15))) {
                                AbstractC6463a.q(i15, rVar2, i15, c0581j3);
                            }
                            AbstractC6463a.t(rVar2, i16, rVar2, 0, 2058660585);
                            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                            AbstractC4326r a13 = io.sentry.compose.b.a("ConversationScreenContent");
                            if (d13.f39783v) {
                                m12 = M1.f39832Z;
                            } else if (c2334c != null && c2334c.f26450m != null) {
                                m12 = M1.f39835j0;
                            } else if (c2334c != null && c2334c.f26450m == null) {
                                m12 = M1.f39834i0;
                            } else if (d13.f39768g.f8896c) {
                                m12 = M1.f39833h0;
                            } else {
                                m12 = M1.f39831Y;
                            }
                            int ordinal = m12.ordinal();
                            if (ordinal == 0) {
                                iVar = iVar2;
                                abstractC0408g3 = abstractC0408g2;
                                z14 = false;
                                z13 = true;
                                rVar2.W(-513393392);
                                AbstractC4778o0.e(bVar, a13, rVar2, 6, 1);
                                rVar2.t(false);
                            } else if (ordinal == 1) {
                                z13 = true;
                                iVar = iVar2;
                                abstractC0408g3 = abstractC0408g2;
                                z14 = false;
                                rVar2.W(-513393252);
                                gb.D.c(a13, rVar2, 0, 1);
                                rVar2.t(false);
                            } else if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        rVar2.W(-513392404);
                                        rVar2.t(false);
                                    } else {
                                        rVar2.W(-513392493);
                                        x8.W.h(bVar, c2334c2, a13, rVar2, 6, 2);
                                        rVar2.t(false);
                                    }
                                    iVar = iVar2;
                                    abstractC0408g3 = abstractC0408g2;
                                    z14 = false;
                                } else {
                                    rVar2.W(-513393113);
                                    rVar2.W(-513392945);
                                    abstractC0408g3 = abstractC0408g2;
                                    boolean g11 = rVar2.g(c2334c2) | rVar2.g(abstractC0408g3);
                                    Object K10 = rVar2.K();
                                    iVar = iVar2;
                                    s3.r rVar3 = K10;
                                    if (g11 || K10 == iVar) {
                                        s3.r rVar4 = new s3.r(c2334c2, 21, abstractC0408g3);
                                        rVar2.h0(rVar4);
                                        rVar3 = rVar4;
                                    }
                                    rVar2.t(false);
                                    x8.W.i(bVar, fVar, c2334c2, a13, rVar3, rVar2, 70, 4);
                                    z14 = false;
                                    rVar2.t(false);
                                }
                                z13 = true;
                            } else {
                                iVar = iVar2;
                                abstractC0408g3 = abstractC0408g2;
                                z14 = false;
                                rVar2.W(-513392635);
                                z13 = true;
                                x8.W.j(bVar, a13, rVar2, 6, 1);
                                rVar2.t(false);
                            }
                            AbstractC6463a.v(rVar2, z14, z13, z14, z14);
                            Qb.f fVar2 = d13.f39774m;
                            Map map = d13.f39773l;
                            if (fVar2 != null && map.isEmpty() && c2334c == null && d13.f39769h == null) {
                                rVar2.W(-207514046);
                                rVar2.W(-207513926);
                                boolean g12 = rVar2.g(abstractC0408g3);
                                Object K11 = rVar2.K();
                                if (g12 || K11 == iVar) {
                                    i11 = 1;
                                    I9.c1 c1Var2 = new I9.c1(abstractC0408g3, 1);
                                    rVar2.h0(c1Var2);
                                    c1Var = c1Var2;
                                } else {
                                    i11 = 1;
                                    c1Var = K11;
                                }
                                rVar2.t(false);
                                c4323o = c4323o4;
                                K8.d.Y(d13.f39774m, c1Var, androidx.compose.foundation.layout.a.t(c4323o, 0.0f, p9.r.f42840d, i11), rVar2, 0, 0);
                                rVar2.t(false);
                            } else {
                                c4323o = c4323o4;
                                if (map.isEmpty() && c2334c != null && (list = c2334c.f26460w) != null && (!list.isEmpty()) && c2334c.d() && (c6189g = d13.f39764c) != null && c6189g.a()) {
                                    rVar2.W(-207513614);
                                    List list4 = c2334c2 != null ? c2334c2.f26460w : null;
                                    if (list4 == null) {
                                        list4 = kf.v.f37483Y;
                                    }
                                    List list5 = list4;
                                    rVar2.W(-207513476);
                                    boolean g13 = rVar2.g(abstractC0408g3);
                                    Object K12 = rVar2.K();
                                    I9.c1 c1Var3 = K12;
                                    if (g13 || K12 == iVar) {
                                        I9.c1 c1Var4 = new I9.c1(abstractC0408g3, 2);
                                        rVar2.h0(c1Var4);
                                        c1Var3 = c1Var4;
                                    }
                                    rVar2.t(false);
                                    K8.d.U(list5, c1Var3, androidx.compose.foundation.layout.a.t(c4323o, 0.0f, p9.r.f42840d, 1), rVar2, 8, 0);
                                    rVar2.t(false);
                                } else {
                                    rVar2.W(-207513236);
                                    z15 = false;
                                    rVar2.t(false);
                                    rVar2.t(z15);
                                    d12 = d13;
                                    abstractC6216a = abstractC6216a2;
                                }
                            }
                            z15 = false;
                            rVar2.t(z15);
                            d12 = d13;
                            abstractC6216a = abstractC6216a2;
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    } else {
                        abstractC4326r = a11;
                        iVar = iVar2;
                        abstractC0408g3 = abstractC0408g2;
                        c4323o = c4323o4;
                        rVar2.W(-207513198);
                        d12 = d13;
                        K8.d.m(d13, (wf.k) abstractC0408g3, (wf.k) abstractC0408g, (wf.k) abstractC0408g6, a12, rVar2, 0, 0);
                        if (c2334c == null) {
                            C4780p c4780p = d12.f39785x;
                            if (c4780p.f40080a && !c4780p.f40083d && !c4780p.f40084e) {
                                abstractC6216a = abstractC6216a2;
                                z12 = false;
                                x8.W.g(R.string.conversation_different_custom_instructions, abstractC6216a, rVar2, 0);
                                rVar2.t(z12);
                            }
                        }
                        abstractC6216a = abstractC6216a2;
                        z12 = false;
                        rVar2.t(z12);
                    }
                    rVar2.W(-207512681);
                    Object K13 = rVar2.K();
                    p0.l lVar2 = K13;
                    if (K13 == iVar) {
                        p0.l lVar3 = new p0.l();
                        rVar2.h0(lVar3);
                        lVar2 = lVar3;
                    }
                    p0.l lVar4 = (p0.l) lVar2;
                    rVar2.t(false);
                    Object[] objArr = new Object[0];
                    rVar2.W(-207512599);
                    boolean g14 = rVar2.g(d12);
                    Object K14 = rVar2.K();
                    d9.h hVar = K14;
                    if (g14 || K14 == iVar) {
                        d9.h hVar2 = new d9.h(7, d12);
                        rVar2.h0(hVar2);
                        hVar = hVar2;
                    }
                    rVar2.t(false);
                    AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(objArr, null, hVar, rVar2, 6);
                    rVar2.W(-207512545);
                    if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                        rVar2.W(-207512485);
                        boolean g15 = rVar2.g(abstractC1710f0);
                        Object K15 = rVar2.K();
                        C4763j0 c4763j0 = K15;
                        if (g15 || K15 == iVar) {
                            C4763j0 c4763j02 = new C4763j0(lVar4, abstractC1710f0, null);
                            rVar2.h0(c4763j02);
                            c4763j0 = c4763j02;
                        }
                        z11 = false;
                        rVar2.t(false);
                        yVar = yVar3;
                        AbstractC1734s.e(yVar, c4763j0, rVar2);
                    } else {
                        yVar = yVar3;
                        z11 = false;
                    }
                    rVar2.t(z11);
                    if (c2334c != null && !c2334c.d()) {
                        rVar2.W(-207512256);
                        if (c2334c.f26453p) {
                            i10 = R.string.gizmo_workspace_disabled;
                        } else {
                            i10 = c2334c.f26454q ? R.string.gizmo_memory_disabled : R.string.gizmo_disabled;
                        }
                        x8.W.g(i10, abstractC6216a, rVar2, 0);
                        rVar2.t(false);
                    } else if (d12.P) {
                        rVar2.W(-207512124);
                        AbstractC4778o0.d(0, 4, rVar2, abstractC4326r, c2334c2, (wf.k) abstractC0408g3);
                        rVar2.t(false);
                    } else {
                        rVar2.W(-207512042);
                        AbstractC5690F.a(fVar, androidx.compose.foundation.layout.e.d(c4323o, 1.0f), lVar4, null, null, null, rVar2, 440, 56);
                        rVar2.t(false);
                    }
                    rVar2.W(-207511695);
                    Object K16 = rVar2.K();
                    d9.h hVar3 = K16;
                    if (K16 == iVar) {
                        d9.h hVar4 = new d9.h(6, lVar4);
                        rVar2.h0(hVar4);
                        hVar3 = hVar4;
                    }
                    AbstractC6216a abstractC6216a3 = (AbstractC6216a) hVar3;
                    rVar2.t(false);
                    rVar2.W(-207511624);
                    boolean g16 = rVar2.g(abstractC0408g3);
                    Object K17 = rVar2.K();
                    I9.c1 c1Var5 = K17;
                    if (g16 || K17 == iVar) {
                        I9.c1 c1Var6 = new I9.c1(abstractC0408g3, 3);
                        rVar2.h0(c1Var6);
                        c1Var5 = c1Var6;
                    }
                    wf.k kVar = c1Var5;
                    rVar2.t(false);
                    rVar2.W(-207511541);
                    boolean g17 = rVar2.g(abstractC0408g3);
                    Object K18 = rVar2.K();
                    I9.a1 a1Var = K18;
                    if (g17 || K18 == iVar) {
                        a1Var = AbstractC6463a.g(abstractC0408g3, 4, rVar2);
                    }
                    rVar2.t(false);
                    A7.b.a(fVar, d12.f39779r, abstractC6216a3, kVar, a1Var, androidx.compose.foundation.layout.e.d(c4323o, 1.0f), rVar2, 197000, 0);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC0441z abstractC0441z = (AbstractC0441z) obj;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$DropdownMenu", abstractC0441z);
                AbstractC4326r a14 = io.sentry.compose.b.a("ConversationMenu");
                if ((intValue2 & 14) == 0) {
                    intValue2 |= ((Z.r) abstractC1725n2).g(abstractC0441z) ? 4 : 2;
                }
                if ((intValue2 & 91) == 18) {
                    Z.r rVar5 = (Z.r) abstractC1725n2;
                    if (rVar5.B()) {
                        rVar5.P();
                        return yVar3;
                    }
                }
                C3288a c3288a = AbstractC4768l.f40022d;
                Z.r rVar6 = (Z.r) abstractC1725n2;
                rVar6.W(-1626628659);
                boolean g18 = rVar6.g(abstractC6216a2);
                AbstractC6216a abstractC6216a4 = (AbstractC6216a) abstractC3953c2;
                Object K19 = rVar6.K();
                r9.o oVar = K19;
                if (g18 || K19 == iVar2) {
                    r9.o oVar2 = new r9.o(abstractC6216a4, abstractC6216a2, 2);
                    rVar6.h0(oVar2);
                    oVar = oVar2;
                }
                rVar6.t(false);
                Df.H.g(c3288a, oVar, a14, AbstractC4768l.f40023e, null, false, null, null, null, rVar6, 3078, 500);
                rVar6.W(-1626628433);
                boolean z20 = !d13.f39771j.isEmpty();
                boolean z21 = d13.f39756K;
                zd.n nVar2 = d13.f39780s;
                if (z20 && !z21 && ((nVar2 == null || !nVar2.f51982a) && d13.f39778q)) {
                    C3288a c3288a2 = AbstractC4768l.f40024f;
                    rVar6.W(-1626628220);
                    boolean g19 = rVar6.g(abstractC0408g4);
                    Object K20 = rVar6.K();
                    C4803y0 c4803y02 = K20;
                    if (g19 || K20 == iVar2) {
                        C4803y0 c4803y03 = new C4803y0(abstractC6216a4, abstractC0408g4, 1);
                        rVar6.h0(c4803y03);
                        c4803y02 = c4803y03;
                    }
                    rVar6.t(false);
                    Df.H.g(c3288a2, c4803y02, a14, AbstractC4768l.f40025g, null, false, null, null, null, rVar6, 3078, 500);
                }
                rVar6.t(false);
                rVar6.W(-1626627955);
                if (d13.T) {
                    C3288a c3288a3 = AbstractC4768l.f40026h;
                    rVar6.W(-1626627767);
                    boolean g20 = rVar6.g(abstractC0408g4);
                    Object K21 = rVar6.K();
                    C4803y0 c4803y04 = K21;
                    if (g20 || K21 == iVar2) {
                        C4803y0 c4803y05 = new C4803y0(abstractC6216a4, abstractC0408g4, 2);
                        rVar6.h0(c4803y05);
                        c4803y04 = c4803y05;
                    }
                    rVar6.t(false);
                    Df.H.g(c3288a3, c4803y04, a14, AbstractC4768l.f40027i, null, false, null, null, null, rVar6, 3078, 500);
                }
                rVar6.t(false);
                rVar6.W(-1626627493);
                C2334C c2334c3 = d13.f39759N;
                if (c2334c3 != null) {
                    yVar2 = yVar3;
                    if (c2334c3.f26448k) {
                        C3288a c3288a4 = AbstractC4768l.f40028j;
                        rVar6.W(-1626627269);
                        boolean g21 = rVar6.g(abstractC0408g4) | rVar6.g(d13);
                        Object K22 = rVar6.K();
                        C4799w0 c4799w02 = K22;
                        if (g21 || K22 == iVar2) {
                            C4799w0 c4799w03 = new C4799w0(abstractC6216a4, abstractC0408g4, d13, 1);
                            rVar6.h0(c4799w03);
                            c4799w02 = c4799w03;
                        }
                        rVar6.t(false);
                        Df.H.g(c3288a4, c4799w02, a14, AbstractC4768l.f40029k, null, false, null, null, null, rVar6, 3078, 500);
                    }
                } else {
                    yVar2 = yVar3;
                }
                rVar6.t(false);
                rVar6.W(-1626626837);
                if (c2334c3 != null) {
                    C3288a c3288a5 = AbstractC4768l.f40030l;
                    rVar6.W(-1626626632);
                    boolean g22 = rVar6.g(abstractC0408g4) | rVar6.g(d13);
                    Object K23 = rVar6.K();
                    C4799w0 c4799w04 = K23;
                    if (g22 || K23 == iVar2) {
                        C4799w0 c4799w05 = new C4799w0(abstractC6216a4, abstractC0408g4, d13, 2);
                        rVar6.h0(c4799w05);
                        c4799w04 = c4799w05;
                    }
                    rVar6.t(false);
                    Df.H.g(c3288a5, c4799w04, a14, AbstractC4768l.f40031m, null, false, null, null, null, rVar6, 3078, 500);
                }
                rVar6.t(false);
                rVar6.W(-1626626292);
                List list6 = d13.f39771j;
                if (!(!list6.isEmpty()) || z21 || (nVar2 != null && nVar2.f51982a)) {
                    c4323o2 = c4323o4;
                    nVar = nVar2;
                } else {
                    c4323o2 = c4323o4;
                    nVar = nVar2;
                    U3.f.c(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(c4323o4, 1.0f), 0.0f, p9.r.f42839c, 1), 0.0f, 0L, rVar6, 0, 6);
                    C3288a c3288a6 = AbstractC4768l.f40032n;
                    rVar6.W(-1626625898);
                    AbstractC6216a abstractC6216a5 = (AbstractC6216a) obj4;
                    boolean g23 = rVar6.g(abstractC6216a5);
                    Object K24 = rVar6.K();
                    r9.o oVar3 = K24;
                    if (g23 || K24 == iVar2) {
                        r9.o oVar4 = new r9.o(abstractC6216a4, abstractC6216a5, 3);
                        rVar6.h0(oVar4);
                        oVar3 = oVar4;
                    }
                    rVar6.t(false);
                    Df.H.g(c3288a6, oVar3, a14, AbstractC4768l.f40033o, null, false, null, null, null, rVar6, 3078, 500);
                    C3288a c3288a7 = AbstractC4768l.f40034p;
                    rVar6.W(-1626625460);
                    boolean g24 = rVar6.g(abstractC0408g4);
                    Object K25 = rVar6.K();
                    C4803y0 c4803y06 = K25;
                    if (g24 || K25 == iVar2) {
                        C4803y0 c4803y07 = new C4803y0(abstractC6216a4, abstractC0408g4, 3);
                        rVar6.h0(c4803y07);
                        c4803y06 = c4803y07;
                    }
                    rVar6.t(false);
                    Df.H.g(c3288a7, c4803y06, a14, AbstractC4768l.f40035q, null, false, null, null, null, rVar6, 3078, 500);
                    C3288a c3288a8 = AbstractC4768l.f40036r;
                    rVar6.W(-1626624896);
                    AbstractC6216a abstractC6216a6 = (AbstractC6216a) abstractC3953c;
                    boolean g25 = rVar6.g(abstractC6216a6);
                    Object K26 = rVar6.K();
                    r9.o oVar5 = K26;
                    if (g25 || K26 == iVar2) {
                        r9.o oVar6 = new r9.o(abstractC6216a4, abstractC6216a6, 4);
                        rVar6.h0(oVar6);
                        oVar5 = oVar6;
                    }
                    rVar6.t(false);
                    Df.H.g(c3288a8, oVar5, a14, AbstractC4768l.f40037s, null, !d13.f39782u, null, null, null, rVar6, 3078, 468);
                }
                rVar6.t(false);
                rVar6.W(-1626624601);
                Sc.c cVar = d13.f39765d;
                if (c2334c3 == null && list6.isEmpty() && cVar.f16507a.size() > 1) {
                    rVar6.W(-1626624401);
                    boolean g26 = rVar6.g(abstractC0408g4);
                    Object K27 = rVar6.K();
                    I9.a1 a1Var2 = K27;
                    if (g26 || K27 == iVar2) {
                        a1Var2 = AbstractC6463a.g(abstractC0408g4, 6, rVar6);
                    }
                    AbstractC6216a abstractC6216a7 = a1Var2;
                    rVar6.t(false);
                    rVar6.W(-1626624293);
                    boolean g27 = rVar6.g(abstractC0408g4);
                    Object K28 = rVar6.K();
                    I9.a1 a1Var3 = K28;
                    if (g27 || K28 == iVar2) {
                        a1Var3 = AbstractC6463a.g(abstractC0408g4, 5, rVar6);
                    }
                    rVar6.t(false);
                    D0.e(abstractC0441z, this.f40010h0, abstractC6216a4, abstractC6216a7, a1Var3, rVar6, (intValue2 & 14) | 384);
                    if (d13.f39752G && (nVar == null || !nVar.f51982a)) {
                        c4323o3 = c4323o2;
                        U3.f.c(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(c4323o3, 1.0f), 0.0f, p9.r.f42839c, 1), 0.0f, 0L, rVar6, 0, 6);
                        C3288a c3288a9 = AbstractC4768l.f40038t;
                        rVar6.W(-1626623769);
                        boolean g28 = rVar6.g(abstractC0408g4) | rVar6.g(d13);
                        Object K29 = rVar6.K();
                        if (g28 || K29 == iVar2) {
                            z17 = false;
                            C4799w0 c4799w06 = new C4799w0(abstractC6216a4, abstractC0408g4, d13, 0);
                            rVar6.h0(c4799w06);
                            c4799w0 = c4799w06;
                        } else {
                            z17 = false;
                            c4799w0 = K29;
                        }
                        rVar6.t(z17);
                        C3288a c3288a10 = AbstractC4768l.f40039u;
                        int i17 = z17 ? 1 : 0;
                        int i18 = z17 ? 1 : 0;
                        Df.H.g(c3288a9, c4799w0, a14, c3288a10, R4.b.X(rVar6, -1677463993, new C4801x0(d13, i17)), false, null, null, null, rVar6, 27654, 484);
                        rVar6.t(false);
                        list2 = cVar.f16507a;
                        if (!(list2 instanceof Collection) && list2.isEmpty()) {
                            return yVar2;
                        }
                        for (Sc.f fVar3 : list2) {
                            EnumC6212z enumC6212z = fVar3.f16512a.f16521a;
                            if (enumC6212z == EnumC6212z.f48476h0 || enumC6212z == EnumC6212z.f48477i0) {
                                U3.f.c(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(c4323o3, 1.0f), 0.0f, p9.r.f42839c, 1), 0.0f, 0L, rVar6, 0, 6);
                                C3288a X10 = R4.b.X(rVar6, -1854472539, new C4801x0(d13, 1));
                                rVar6.W(-1626622321);
                                boolean g29 = rVar6.g(abstractC0408g4);
                                Object K30 = rVar6.K();
                                if (g29 || K30 == iVar2) {
                                    z16 = false;
                                    C4803y0 c4803y08 = new C4803y0(abstractC6216a4, abstractC0408g4, 0);
                                    rVar6.h0(c4803y08);
                                    c4803y0 = c4803y08;
                                } else {
                                    z16 = false;
                                    c4803y0 = K30;
                                }
                                rVar6.t(z16);
                                Df.H.g(X10, c4803y0, a14, AbstractC4768l.f40040v, null, false, null, null, null, rVar6, 3078, 500);
                                return yVar2;
                            }
                            while (r3.hasNext()) {
                            }
                        }
                        return yVar2;
                    }
                }
                c4323o3 = c4323o2;
                rVar6.t(false);
                list2 = cVar.f16507a;
                if (!(list2 instanceof Collection)) {
                }
                while (r3.hasNext()) {
                }
                return yVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4766k0(AbstractC6216a abstractC6216a, D1 d12, AbstractC0408g abstractC0408g, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, AbstractC6216a abstractC6216a4) {
        super(3);
        this.f40009Z = abstractC6216a;
        this.f40010h0 = d12;
        this.f40011i0 = abstractC0408g;
        this.f40012j0 = abstractC6216a2;
        this.f40013k0 = abstractC6216a3;
        this.f40014l0 = abstractC6216a4;
    }
}
