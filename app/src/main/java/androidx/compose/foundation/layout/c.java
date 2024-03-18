package androidx.compose.foundation.layout;

import A.C0046u0;
import Df.AbstractC0408g;
import E.A;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.C0421f;
import E.C0426j;
import E.p0;
import E.r0;
import E0.N;
import E0.o0;
import F.AbstractC0539m;
import G.C;
import G.D;
import G.F;
import G.K;
import G.c0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import K4.C0813a;
import K6.g;
import L.AbstractC0844e;
import L.x0;
import L0.u;
import M3.H;
import Mb.C0986w0;
import N.B;
import N.C1034s;
import N.G;
import N.f0;
import N0.C1046e;
import N0.E;
import N0.y;
import Ra.l;
import Rb.C1256b;
import Rb.C1272s;
import Rb.M;
import Rb.O;
import Rb.Y;
import S8.C1363g;
import S8.a0;
import U8.q;
import V.v;
import W.AbstractC1577l0;
import W.AbstractC1607r1;
import W.C1572k0;
import W.M3;
import W.P0;
import W.R0;
import W.j4;
import W.p4;
import W.q4;
import Y0.h;
import Y0.j;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.l1;
import Z.m1;
import Z.r;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import cc.AbstractC2389d;
import cc.C2388c;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import d1.C2567b;
import d1.C2568c;
import d1.C2570e;
import d1.C2574i;
import d1.C2584s;
import dc.C2620a;
import h0.C3288a;
import id.AbstractC3557B;
import io.sentry.hints.i;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jf.C3959i;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import l8.AbstractC4344b;
import na.D0;
import na.D1;
import nf.AbstractC4828h;
import p5.EnumC5090b;
import q5.C5271a;
import q5.C5274d;
import r9.AbstractC5395l;
import s3.AbstractC5540C;
import s3.C5562l;
import sb.w;
import sb.x;
import t5.AbstractC5676b;
import ta.AbstractC5690F;
import u0.AbstractC5824b;
import w.C6077x;
import wd.m0;
import wf.AbstractC6216a;
import wf.k;
import wf.n;
import x8.W;
import y.AbstractC6463a;
import y.C6471i;
import y.C6473k;
import y.C6480s;
import za.C6783B;

/* loaded from: classes.dex */
public final class c extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24732Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f24733Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f24734h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        super(2);
        this.f24732Y = i10;
        this.f24733Z = obj;
        this.f24734h0 = obj2;
    }

    private final void c(AbstractC1725n abstractC1725n, int i10) {
        if ((i10 & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return;
            }
        }
        ((wf.o) this.f24733Z).invoke((d) this.f24734h0, abstractC1725n, 0);
    }

    private final void e(AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        if ((i10 & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return;
            }
        }
        D d10 = (D) this.f24733Z;
        F f6 = (F) d10.f5417b.mo122invoke();
        C c10 = (C) this.f24734h0;
        int i11 = c10.f5413c;
        if ((i11 >= f6.a() || !AbstractC3557B.K(f6.b(i11), c10.f5411a)) && (i11 = f6.c(c10.f5411a)) != -1) {
            c10.f5413c = i11;
        }
        int i12 = i11;
        if (i12 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r rVar2 = (r) abstractC1725n;
        rVar2.Y(Boolean.valueOf(z10));
        boolean h10 = rVar2.h(z10);
        if (z10) {
            Gi.e.f(f6, d10.f5416a, i12, c10.f5411a, rVar2, 0);
        } else {
            rVar2.q(h10);
        }
        rVar2.w();
        AbstractC1734s.b(c10.f5411a, new C6077x(11, c10), rVar2);
    }

    private final void f(AbstractC1725n abstractC1725n, int i10) {
        if ((i10 & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return;
            }
        }
        c0 c0Var = (c0) this.f24734h0;
        c0Var.f5489b.setValue(m.H(abstractC1725n));
        ((wf.o) this.f24733Z).invoke(c0Var, abstractC1725n, 8);
    }

    private final void g(AbstractC1725n abstractC1725n, int i10) {
        if ((i10 & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return;
            }
        }
        Object obj = this.f24733Z;
        if (((n) obj) == null) {
            r rVar2 = (r) abstractC1725n;
            rVar2.W(1275643845);
            AbstractC0844e.b((AbstractC4326r) this.f24734h0, rVar2, 0);
            rVar2.t(false);
            return;
        }
        r rVar3 = (r) abstractC1725n;
        rVar3.W(1275643915);
        ((n) obj).invoke(rVar3, 0);
        rVar3.t(false);
    }

    private final void i(AbstractC1725n abstractC1725n, int i10) {
        C1034s f6;
        C1034s f10;
        h hVar;
        N.C c10;
        boolean z10 = false;
        int i11 = 1;
        if ((i10 & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return;
            }
        }
        ((n) this.f24733Z).invoke(abstractC1725n, 0);
        f0 f0Var = (f0) this.f24734h0;
        if (f0Var.g() && f0Var.e() && (f6 = f0Var.f()) != null && !AbstractC3557B.K(f6.f12408a, f6.f12409b) && (f10 = f0Var.f()) != null) {
            List G02 = AbstractC4344b.G0(Boolean.TRUE, Boolean.FALSE);
            int size = G02.size();
            int i12 = 0;
            while (i12 < size) {
                Boolean bool = (Boolean) G02.get(i12);
                boolean booleanValue = bool.booleanValue();
                r rVar2 = (r) abstractC1725n;
                rVar2.W(1157296644);
                boolean g10 = rVar2.g(bool);
                Object K10 = rVar2.K();
                i iVar = C1723m.f22654Y;
                if (g10 || K10 == iVar) {
                    f0Var.getClass();
                    K10 = new N.c0(booleanValue, f0Var);
                    rVar2.h0(K10);
                }
                rVar2.t(z10);
                x0 x0Var = (x0) K10;
                rVar2.W(1157296644);
                boolean g11 = rVar2.g(bool);
                Object K11 = rVar2.K();
                if (g11 || K11 == iVar) {
                    if (booleanValue) {
                        int i13 = z10 ? 1 : 0;
                        int i14 = z10 ? 1 : 0;
                        c10 = new N.C(f0Var, i13);
                    } else {
                        c10 = new N.C(f0Var, i11);
                    }
                    K11 = c10;
                    rVar2.h0(K11);
                }
                rVar2.t(z10);
                AbstractC6216a abstractC6216a = (AbstractC6216a) K11;
                if (booleanValue) {
                    hVar = f10.f12408a.f12403a;
                } else {
                    hVar = f10.f12409b.f12403a;
                }
                H.h(new G(abstractC6216a), booleanValue, hVar, f10.f12410c, new SuspendPointerInputElement(x0Var, null, new B(x0Var, null), 6), rVar2, 0);
                i12++;
                i11 = 1;
                z10 = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a0, code lost:
        if (id.AbstractC3557B.K(r9.K(), java.lang.Integer.valueOf(r13)) == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        float f6;
        boolean z10;
        AbstractC0408g abstractC0408g;
        int i11;
        String str;
        boolean z11;
        long j6;
        boolean z12;
        long j10;
        Rb.F f10;
        int i12;
        boolean z13;
        boolean z14;
        C4316h c4316h = C4310b.f37705r0;
        Object obj = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i13 = this.f24732Y;
        Object obj2 = this.f24734h0;
        Object obj3 = this.f24733Z;
        switch (i13) {
            case 0:
                c(abstractC1725n, i10);
                return;
            case 1:
            case 3:
            case 12:
            case 13:
            case 23:
            default:
                AbstractC4326r a5 = io.sentry.compose.b.a("BetaSettingsScreen");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C2620a c2620a = (C2620a) obj3;
                M3.a(c2620a.f28200a, new l((dc.h) obj2, 17, c2620a), a5, null, false, null, null, abstractC1725n, 0, 124);
                return;
            case 2:
                e(abstractC1725n, i10);
                return;
            case 4:
                f(abstractC1725n, i10);
                return;
            case 5:
                g(abstractC1725n, i10);
                return;
            case 6:
                i(abstractC1725n, i10);
                return;
            case 7:
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC2469q0.p(obj3);
                throw null;
            case 8:
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Boolean bool = (Boolean) ((E0.B) obj3).f3990f.getValue();
                boolean booleanValue = bool.booleanValue();
                n nVar = (n) obj2;
                r rVar4 = (r) abstractC1725n;
                rVar4.Y(bool);
                boolean h10 = rVar4.h(booleanValue);
                if (booleanValue) {
                    nVar.invoke(rVar4, 0);
                } else {
                    rVar4.q(h10);
                }
                rVar4.w();
                return;
            case 9:
                if ((i10 & 11) == 2) {
                    r rVar5 = (r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                C2584s c2584s = (C2584s) obj3;
                AbstractC4326r k10 = androidx.compose.ui.layout.a.k(L0.l.a(c4323o, false, C2567b.f27850j0), new C2574i(c2584s, 1));
                if (c2584s.getCanCalculatePosition()) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                AbstractC4326r a10 = androidx.compose.ui.draw.a.a(k10, f6);
                C3288a X10 = R4.b.X(abstractC1725n, 606497925, new C2568c((l1) obj2, 2));
                r rVar6 = (r) abstractC1725n;
                rVar6.W(1406149896);
                C2570e c2570e = C2570e.f27861c;
                rVar6.W(-1323940314);
                int i14 = rVar6.P;
                AbstractC1732q0 p10 = rVar6.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(a10);
                if (rVar6.f22696a instanceof AbstractC1707e) {
                    rVar6.Z();
                    if (rVar6.f22695O) {
                        rVar6.o(c0582k);
                    } else {
                        rVar6.k0();
                    }
                    U3.f.n0(rVar6, c2570e, C0583l.f5808f);
                    U3.f.n0(rVar6, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar6.f22695O || !AbstractC3557B.K(rVar6.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar6, i14, c0581j);
                    }
                    AbstractC6463a.t(rVar6, i15, rVar6, 0, 2058660585);
                    X10.invoke(rVar6, 6);
                    rVar6.t(false);
                    rVar6.t(true);
                    rVar6.t(false);
                    rVar6.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 10:
                if ((i10 & 11) == 2) {
                    r rVar7 = (r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                ((t3.l) obj3).f45697p0.invoke((C5562l) obj2, abstractC1725n, 8);
                return;
            case 11:
                if ((i10 & 11) == 2) {
                    r rVar8 = (r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                C5562l c5562l = (C5562l) obj3;
                AbstractC5540C abstractC5540C = c5562l.f45306Z;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", abstractC5540C);
                ((t3.h) abstractC5540C).f45684o0.h((C6480s) obj2, c5562l, abstractC1725n, 72);
                return;
            case 14:
                if ((i10 & 11) == 2) {
                    r rVar9 = (r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                AbstractC0434s.a((AbstractC4326r) ((k) obj3).invoke((a0) obj2), abstractC1725n, 0);
                return;
            case 15:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar10 = (r) abstractC1725n;
                    if (rVar10.B()) {
                        rVar10.P();
                        return;
                    }
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj3;
                if (!Lg.n.n2((String) abstractC1710f0.getValue())) {
                    r rVar11 = (r) abstractC1725n;
                    rVar11.W(35293965);
                    k kVar = (k) obj2;
                    boolean g10 = rVar11.g(abstractC1710f0) | rVar11.g(kVar);
                    Object K10 = rVar11.K();
                    if (!g10 && K10 != obj) {
                        z10 = false;
                    } else {
                        z10 = false;
                        K10 = new r9.G(kVar, abstractC1710f0, 0);
                        rVar11.h0(K10);
                    }
                    rVar11.t(z10);
                    R4.b.o((AbstractC6216a) K10, a.v(c4323o, p9.r.f42839c, 0.0f, 0.0f, 0.0f, 14), false, null, null, AbstractC5395l.f44575b, rVar11, 196656, 28);
                    return;
                }
                return;
            case 16:
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar12 = (r) abstractC1725n;
                    if (rVar12.B()) {
                        rVar12.P();
                        return;
                    }
                }
                AbstractC4326r r10 = a.r(androidx.compose.foundation.a.n(c4323o, androidx.compose.foundation.a.l(abstractC1725n)), p9.r.f42841e);
                la.m mVar = (la.m) obj3;
                AbstractC0408g abstractC0408g2 = (AbstractC0408g) obj2;
                r rVar13 = (r) abstractC1725n;
                rVar13.W(-483455358);
                N a11 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar13);
                rVar13.W(-1323940314);
                int i16 = rVar13.P;
                AbstractC1732q0 p11 = rVar13.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i17 = androidx.compose.ui.layout.a.i(r10);
                boolean z15 = rVar13.f22696a instanceof AbstractC1707e;
                if (z15) {
                    rVar13.Z();
                    if (rVar13.f22695O) {
                        rVar13.o(c0582k2);
                    } else {
                        rVar13.k0();
                    }
                    C0581j c0581j2 = C0583l.f5808f;
                    U3.f.n0(rVar13, a11, c0581j2);
                    C0581j c0581j3 = C0583l.f5807e;
                    U3.f.n0(rVar13, p11, c0581j3);
                    C0581j c0581j4 = C0583l.f5809g;
                    if (rVar13.f22695O || !AbstractC3557B.K(rVar13.K(), Integer.valueOf(i16))) {
                        AbstractC6463a.q(i16, rVar13, i16, c0581j4);
                    }
                    AbstractC6463a.t(rVar13, i17, rVar13, 0, 2058660585);
                    AbstractC4326r a12 = io.sentry.compose.b.a("NonComplianceDialog");
                    j jVar = j.f22031b;
                    m1 m1Var = R0.f19593a;
                    T8.e.a(a12, new S8.N(null, new q(null, new y(((P0) rVar13.m(m1Var)).f19526j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jVar, null, 61438), 127), 127), R4.b.X(rVar13, 2008817692, new C6471i(9, mVar)), rVar13, 384, 1);
                    rVar13.W(-1919954258);
                    la.l lVar = (la.l) mVar;
                    if (lVar.f37911b) {
                        a.d(e.e(c4323o, p9.r.f42840d), rVar13);
                        j4.b(Ng.H.v(R.string.design_error_generic, rVar13), a12, ((P0) rVar13.m(m1Var)).f19539w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar13, 0, 0, 131066);
                    }
                    rVar13.t(false);
                    float f11 = p9.r.f42840d;
                    a.d(e.e(c4323o, f11), rVar13);
                    C0426j g11 = AbstractC0429m.g(f11);
                    rVar13.W(693286680);
                    N a13 = p0.a(g11, C4310b.f37702o0, rVar13);
                    rVar13.W(-1323940314);
                    int i18 = rVar13.P;
                    AbstractC1732q0 p12 = rVar13.p();
                    C3288a i19 = androidx.compose.ui.layout.a.i(c4323o);
                    if (z15) {
                        rVar13.Z();
                        if (rVar13.f22695O) {
                            rVar13.o(c0582k2);
                        } else {
                            rVar13.k0();
                        }
                        U3.f.n0(rVar13, a13, c0581j2);
                        U3.f.n0(rVar13, p12, c0581j3);
                        if (rVar13.f22695O || !AbstractC3557B.K(rVar13.K(), Integer.valueOf(i18))) {
                            AbstractC6463a.q(i18, rVar13, i18, c0581j4);
                        }
                        AbstractC6463a.t(rVar13, i19, rVar13, 0, 2058660585);
                        r0 r0Var = r0.f3944a;
                        AbstractC4326r a14 = io.sentry.compose.b.a("NonComplianceDialog");
                        String str2 = lVar.f37910a.f39007e;
                        rVar13.W(-1109879896);
                        if (str2 == null) {
                            abstractC0408g = abstractC0408g2;
                        } else {
                            rVar13.W(22767909);
                            abstractC0408g = abstractC0408g2;
                            boolean g12 = rVar13.g(abstractC0408g);
                            Object K11 = rVar13.K();
                            if (g12 || K11 == obj) {
                                i11 = 2;
                                K11 = AbstractC6463a.g(abstractC0408g, 2, rVar13);
                            } else {
                                i11 = 2;
                            }
                            rVar13.t(false);
                            Ng.H.d((AbstractC6216a) K11, r0Var.b(c4323o, true), false, null, null, null, null, null, null, R4.b.X(rVar13, 1833527325, new C1363g(str2, i11)), rVar13, 805306368, 508);
                        }
                        rVar13.t(false);
                        AbstractC4326r a15 = AbstractC4194d.a((X) a14, r0Var.b(c4323o, true));
                        boolean z16 = lVar.f37912c;
                        boolean z17 = !z16;
                        C1572k0 a16 = AbstractC1577l0.a(rVar13);
                        rVar13.W(-1109879480);
                        boolean g13 = rVar13.g(abstractC0408g);
                        Object K12 = rVar13.K();
                        if (g13 || K12 == obj) {
                            K12 = AbstractC6463a.g(abstractC0408g, 3, rVar13);
                        }
                        rVar13.t(false);
                        W.q((AbstractC6216a) K12, a15, a16, z16, z17, R4.b.X(rVar13, -62218436, new C6473k(19, mVar)), rVar13, 196608, 0);
                        AbstractC6463a.v(rVar13, false, true, false, false);
                        AbstractC6463a.v(rVar13, false, true, false, false);
                        return;
                    }
                    R4.b.r1();
                    throw null;
                }
                R4.b.r1();
                throw null;
            case 17:
                AbstractC4326r a17 = io.sentry.compose.b.a("ConversationTopBar");
                if ((i10 & 11) == 2) {
                    r rVar14 = (r) abstractC1725n;
                    if (rVar14.B()) {
                        rVar14.P();
                        return;
                    }
                }
                D1 d12 = (D1) obj3;
                AbstractC0408g abstractC0408g3 = (AbstractC0408g) obj2;
                A7.b.v(d12.f(), a17, null, "TopBarAnimation", R4.b.X(abstractC1725n, -1281086106, new C0046u0(d12, 8, abstractC0408g3)), abstractC1725n, 27648, 6);
                zd.n nVar2 = d12.f39780s;
                if (nVar2 != null) {
                    str = nVar2.f51992k;
                } else {
                    str = null;
                }
                String str3 = d12.f39747B;
                if (!AbstractC3557B.K(str, str3) && str3 != null && !Lg.n.n2(str3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar15 = (r) abstractC1725n;
                rVar15.W(-91077030);
                boolean g14 = rVar15.g(abstractC0408g3);
                Object K13 = rVar15.K();
                if (g14 || K13 == obj) {
                    K13 = AbstractC6463a.g(abstractC0408g3, 7, rVar15);
                }
                rVar15.t(false);
                Df.H.f(z11, (AbstractC6216a) K13, a17, 0L, null, null, R4.b.X(rVar15, 846976079, new C6471i(10, d12)), rVar15, 1572864, 60);
                return;
            case 18:
                AbstractC4326r a18 = io.sentry.compose.b.a("ConversationTopBar");
                if ((i10 & 11) == 2) {
                    r rVar16 = (r) abstractC1725n;
                    if (rVar16.B()) {
                        rVar16.P();
                        return;
                    }
                }
                D0.d((AbstractC6216a) obj3, a18, ((D1) obj2).f39787z, abstractC1725n, 0, 2);
                return;
            case 19:
                AbstractC4326r a19 = io.sentry.compose.b.a("InputFieldDecoration");
                if ((i10 & 11) == 2) {
                    r rVar17 = (r) abstractC1725n;
                    if (rVar17.B()) {
                        rVar17.P();
                        return;
                    }
                }
                r rVar18 = (r) abstractC1725n;
                rVar18.W(1378441384);
                if (((C6783B) obj3).f51758a.f16830a.f12512Y.length() == 0) {
                    j4.b(Ng.H.v(R.string.conversations_input_placeholder, rVar18), a19, ((P0) rVar18.m(R0.f19593a)).f19535s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, rVar18, 0, 3072, 122874);
                }
                rVar18.t(false);
                ((n) obj2).invoke(rVar18, 0);
                return;
            case 20:
                AbstractC4326r a20 = io.sentry.compose.b.a("InputFieldDecoration");
                if ((i10 & 11) == 2) {
                    r rVar19 = (r) abstractC1725n;
                    if (rVar19.B()) {
                        rVar19.P();
                        return;
                    }
                }
                AbstractC5690F.d((D1) obj3, (k) obj2, a20, abstractC1725n, 0, 4);
                return;
            case 21:
                u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar20 = (r) abstractC1725n;
                    if (rVar20.B()) {
                        rVar20.P();
                        return;
                    }
                }
                AbstractC5824b F10 = m.F(R.drawable.ic_close_context_chip, abstractC1725n);
                r rVar21 = (r) abstractC1725n;
                rVar21.W(1744786202);
                Object K14 = rVar21.K();
                if (K14 == obj) {
                    K14 = m.d();
                    rVar21.h0(K14);
                }
                rVar21.t(false);
                AbstractC1607r1.a(F10, "", androidx.compose.foundation.a.g(c4323o, (D.m) K14, v.a(false, 0.0f, rVar21, 6, 6), false, null, new Aa.h((k) obj3, (Aa.d) obj2), 28), 0L, rVar21, 56, 8);
                return;
            case 22:
                u uVar4 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar22 = (r) abstractC1725n;
                    if (rVar22.B()) {
                        rVar22.P();
                        return;
                    }
                }
                C1046e G10 = Ad.l.G(R.string.conversation_policy_warning, abstractC1725n);
                AbstractC4326r abstractC4326r = (AbstractC4326r) obj3;
                r rVar23 = (r) abstractC1725n;
                E e10 = ((p4) rVar23.m(q4.f20361a)).f20310k;
                gb.p0 p0Var = (gb.p0) obj2;
                p0Var.getClass();
                rVar23.W(-231278145);
                int ordinal = p0Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            rVar23.W(432006482);
                            j10 = ((P0) rVar23.m(R0.f19593a)).f19529m;
                            z12 = false;
                            rVar23.t(false);
                        } else {
                            rVar23.W(432005087);
                            rVar23.t(false);
                            throw new RuntimeException();
                        }
                    } else {
                        rVar23.W(432006423);
                        long j11 = ((P0) rVar23.m(R0.f19593a)).f19542z;
                        rVar23.t(false);
                        j6 = j11;
                        z12 = false;
                        rVar23.t(z12);
                        Ad.l.p(G10, abstractC4326r, E.a(0, 0, 16777214, j6, 0L, 0L, 0L, null, e10, null, null, null), abstractC1725n, 0, 0);
                        return;
                    }
                } else {
                    rVar23.W(432006373);
                    j10 = ((P0) rVar23.m(R0.f19593a)).f19540x;
                    z12 = false;
                    rVar23.t(false);
                }
                j6 = j10;
                rVar23.t(z12);
                Ad.l.p(G10, abstractC4326r, E.a(0, 0, 16777214, j6, 0L, 0L, 0L, null, e10, null, null, null), abstractC1725n, 0, 0);
                return;
            case 24:
                AbstractC4326r a21 = io.sentry.compose.b.a("FinishAccountScreen");
                if ((i10 & 11) == 2) {
                    r rVar24 = (r) abstractC1725n;
                    if (rVar24.B()) {
                        rVar24.P();
                        return;
                    }
                }
                boolean f12 = ((Mb.G) obj3).f();
                AbstractC4326r a22 = AbstractC4194d.a((X) a21, e.d(c4323o, 1.0f));
                r rVar25 = (r) abstractC1725n;
                rVar25.W(1032260314);
                Mb.H h11 = (Mb.H) obj2;
                boolean g15 = rVar25.g(h11);
                Object K15 = rVar25.K();
                if (g15 || K15 == obj) {
                    K15 = new d9.h(18, h11);
                    rVar25.h0(K15);
                }
                rVar25.t(false);
                Ng.H.a((AbstractC6216a) K15, a22, f12, null, null, null, null, null, null, Jb.h.f8993a, rVar25, 805306416, 504);
                return;
            case 25:
                AbstractC4326r a23 = io.sentry.compose.b.a("VerifyEmailContent");
                if ((i10 & 11) == 2) {
                    r rVar26 = (r) abstractC1725n;
                    if (rVar26.B()) {
                        rVar26.P();
                        return;
                    }
                }
                W.p((AbstractC6216a) obj2, AbstractC4194d.a((X) a23, e.d(a.v(c4323o, 0.0f, p9.r.f42841e, 0.0f, 0.0f, 13), 1.0f)), null, ((C0986w0) obj3).f11998d instanceof m0, false, Jb.i.f8996a, abstractC1725n, 196608, 20);
                return;
            case 26:
                u uVar5 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar27 = (r) abstractC1725n;
                    if (rVar27.B()) {
                        rVar27.P();
                        return;
                    }
                }
                O o10 = (O) obj3;
                M m10 = (M) AbstractC4828h.z(o10.f808e, abstractC1725n).getValue();
                Rb.F f13 = m10.f15277b;
                AbstractC4326r r11 = a.r(c4323o, p9.r.f42841e);
                C1272s c1272s = (C1272s) obj2;
                r rVar28 = (r) abstractC1725n;
                rVar28.W(-483455358);
                N a24 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar28);
                rVar28.W(-1323940314);
                int i20 = rVar28.P;
                AbstractC1732q0 p13 = rVar28.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k3 = C0583l.f5804b;
                C3288a i21 = androidx.compose.ui.layout.a.i(r11);
                boolean z18 = rVar28.f22696a instanceof AbstractC1707e;
                if (z18) {
                    rVar28.Z();
                    if (rVar28.f22695O) {
                        rVar28.o(c0582k3);
                    } else {
                        rVar28.k0();
                    }
                    C0581j c0581j5 = C0583l.f5808f;
                    U3.f.n0(rVar28, a24, c0581j5);
                    C0581j c0581j6 = C0583l.f5807e;
                    U3.f.n0(rVar28, p13, c0581j6);
                    C0581j c0581j7 = C0583l.f5809g;
                    if (!rVar28.f22695O) {
                        f10 = f13;
                        break;
                    } else {
                        f10 = f13;
                    }
                    AbstractC6463a.q(i20, rVar28, i20, c0581j7);
                    AbstractC6463a.t(rVar28, i21, rVar28, 0, 2058660585);
                    A a25 = A.f3733a;
                    AbstractC4326r a26 = io.sentry.compose.b.a("ReportContentDialog");
                    Rb.N n10 = m10.f15276a;
                    if (n10 == null) {
                        rVar28.W(-601911956);
                        rVar28.W(-601911940);
                        boolean g16 = rVar28.g(o10);
                        Object K16 = rVar28.K();
                        if (!g16 && K16 != obj) {
                            z14 = false;
                        } else {
                            z14 = false;
                            K16 = new Rb.X(0, o10);
                            rVar28.h0(K16);
                        }
                        rVar28.t(z14);
                        Bi.c.J(a25, (k) ((AbstractC0408g) K16), c1272s, rVar28, 6);
                        rVar28.t(z14);
                        z13 = false;
                    } else {
                        rVar28.W(-601911858);
                        AbstractC4326r d10 = e.d(c4323o, 1.0f);
                        float f14 = p9.q.f42833d;
                        AbstractC4326r e11 = e.e(d10, f14);
                        rVar28.W(733328855);
                        N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar28);
                        rVar28.W(-1323940314);
                        int i22 = rVar28.P;
                        AbstractC1732q0 p14 = rVar28.p();
                        C3288a i23 = androidx.compose.ui.layout.a.i(e11);
                        if (z18) {
                            rVar28.Z();
                            if (rVar28.f22695O) {
                                rVar28.o(c0582k3);
                            } else {
                                rVar28.k0();
                            }
                            U3.f.n0(rVar28, c10, c0581j5);
                            U3.f.n0(rVar28, p14, c0581j6);
                            if (rVar28.f22695O || !AbstractC3557B.K(rVar28.K(), Integer.valueOf(i22))) {
                                AbstractC6463a.q(i22, rVar28, i22, c0581j7);
                            }
                            AbstractC6463a.t(rVar28, i23, rVar28, 0, 2058660585);
                            AbstractC4326r a27 = io.sentry.compose.b.a("ReportContentDialog");
                            rVar28.W(868592940);
                            Rb.C c11 = m10.f15281f;
                            if (c11 != null) {
                                AbstractC5824b F11 = m.F(R.drawable.arrow_left, rVar28);
                                String v10 = Ng.H.v(R.string.design_up_button, rVar28);
                                AbstractC4326r g17 = e.j(c4323o, f14).g(new BoxChildDataElement(C4310b.f37696i0));
                                rVar28.W(868593404);
                                boolean g18 = rVar28.g(o10);
                                Object K17 = rVar28.K();
                                if (g18 || K17 == obj) {
                                    K17 = new d9.h(21, o10);
                                    rVar28.h0(K17);
                                }
                                rVar28.t(false);
                                AbstractC1607r1.a(F11, v10, a.r(androidx.compose.foundation.a.h(g17, (AbstractC6216a) K17), p9.r.f42840d), 0L, rVar28, 8, 8);
                            }
                            rVar28.t(false);
                            int i24 = Y.f15309a[n10.ordinal()];
                            if (i24 != 1 && i24 != 2) {
                                if (i24 == 3) {
                                    i12 = R.string.report_content_header_gizmo;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                i12 = R.string.report_content_header_conversation;
                            }
                            j4.b(Ng.H.v(i12, rVar28), AbstractC4194d.a((X) a27, new BoxChildDataElement(C4310b.f37697j0)), 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, ((p4) rVar28.m(q4.f20361a)).f20306g, rVar28, 0, 0, 65020);
                            rVar28.t(false);
                            rVar28.t(true);
                            rVar28.t(false);
                            rVar28.t(false);
                            U3.f.a(new C3959i(c11, f10), a26, C1256b.f15328j0, null, "ReportGizmoBottomSheet", null, R4.b.X(rVar28, -1856022767, new d9.i(c1272s, o10, m10, 4)), rVar28, 1597824, 42);
                            z13 = false;
                            rVar28.t(false);
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    }
                    AbstractC6463a.v(rVar28, z13, true, z13, z13);
                    return;
                }
                R4.b.r1();
                throw null;
            case 27:
                u uVar6 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar29 = (r) abstractC1725n;
                    if (rVar29.B()) {
                        rVar29.P();
                        return;
                    }
                }
                AbstractC4326r r12 = a.r(c4323o, p9.r.f42842f);
                C0421f c0421f = AbstractC0429m.f3907a;
                C0426j g19 = AbstractC0429m.g(p9.r.f42841e);
                r rVar30 = (r) abstractC1725n;
                rVar30.W(-263133023);
                xd.e eVar = (xd.e) obj3;
                k kVar2 = (k) obj2;
                boolean g20 = rVar30.g(eVar) | rVar30.g(kVar2);
                Object K18 = rVar30.K();
                if (g20 || K18 == obj) {
                    K18 = new l(eVar, 16, kVar2);
                    rVar30.h0(K18);
                }
                rVar30.t(false);
                AbstractC0539m.a(r12, null, null, false, g19, null, null, false, (k) K18, rVar30, 0, 238);
                return;
            case 28:
                AbstractC4326r a28 = io.sentry.compose.b.a("DeactivatedAccountScreen");
                if ((i10 & 11) == 2) {
                    r rVar31 = (r) abstractC1725n;
                    if (rVar31.B()) {
                        rVar31.P();
                        return;
                    }
                }
                cc.o oVar = (cc.o) obj3;
                boolean z19 = oVar instanceof cc.k;
                boolean z20 = oVar instanceof cc.l;
                C1572k0 a29 = AbstractC1577l0.a(abstractC1725n);
                r rVar32 = (r) abstractC1725n;
                rVar32.W(445282797);
                AbstractC2389d abstractC2389d = (AbstractC2389d) obj2;
                boolean g21 = rVar32.g(abstractC2389d);
                Object K19 = rVar32.K();
                if (g21 || K19 == obj) {
                    K19 = new d9.h(24, abstractC2389d);
                    rVar32.h0(K19);
                }
                rVar32.t(false);
                W.q((AbstractC6216a) K19, a28, a29, z20, z19, R4.b.X(rVar32, -1084399935, new C2388c(oVar, 1)), rVar32, 196608, 2);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Long l10;
        K6.f fVar;
        K6.a aVar;
        g gVar;
        K6.k kVar;
        String str;
        F6.c cVar;
        long j6;
        AbstractC5676b abstractC5676b;
        boolean z10;
        Throwable th2;
        String str2;
        String str3;
        String str4;
        K6.h hVar;
        String str5;
        String str6;
        String str7;
        String str8;
        int i10;
        switch (this.f24732Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 1:
                return j((o0) obj, ((Z0.a) obj2).f22782a);
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 3:
                return j((o0) obj, ((Z0.a) obj2).f22782a);
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 7:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 8:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 9:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 10:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 11:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 12:
                C5271a c5271a = (C5271a) obj;
                AbstractC5676b abstractC5676b2 = (AbstractC5676b) obj2;
                AbstractC3557B.c0("datadogContext", c5271a);
                AbstractC3557B.c0("eventBatchWriter", abstractC5676b2);
                F6.c cVar2 = (F6.c) this.f24734h0;
                Iterator it = ((List) this.f24733Z).iterator();
                while (it.hasNext()) {
                    M6.a aVar2 = (M6.a) it.next();
                    G6.a aVar3 = cVar2.f5059Z;
                    aVar3.getClass();
                    AbstractC3557B.c0("model", aVar2);
                    long j10 = c5271a.f43903i.f43934c;
                    if (aVar2.f11651b.f11662f.longValue() == 0) {
                        l10 = 1L;
                    } else {
                        l10 = null;
                    }
                    Map c10 = aVar2.f11651b.c();
                    AbstractC3557B.b0("event.metrics", c10);
                    K6.e eVar = new K6.e(l10, c10);
                    if (aVar3.f6064Y) {
                        C5274d c5274d = c5271a.f43905k;
                        Long l11 = c5274d.f43926c;
                        String str9 = c5274d.f43925b;
                        if (l11 == null && str9 == null) {
                            hVar = null;
                        } else {
                            if (l11 != null) {
                                str8 = l11.toString();
                            } else {
                                str8 = null;
                            }
                            hVar = new K6.h(str8, str9);
                        }
                        Long l12 = c5274d.f43929f;
                        if (l12 != null) {
                            str5 = l12.toString();
                        } else {
                            str5 = null;
                        }
                        Long l13 = c5274d.f43928e;
                        if (l13 != null) {
                            str6 = l13.toString();
                        } else {
                            str6 = null;
                        }
                        Long l14 = c5274d.f43927d;
                        if (l14 != null) {
                            str7 = l14.toString();
                        } else {
                            str7 = null;
                        }
                        fVar = new K6.f(new K6.b(hVar, str5, str6, str7, AbstractC4194d.D(c5274d.f43924a)));
                    } else {
                        fVar = null;
                    }
                    q5.g gVar2 = c5271a.f43907m;
                    K6.j jVar = new K6.j(gVar2.f43937a, gVar2.f43938b, gVar2.f43939c, AbstractC4268D.m1(gVar2.f43940d));
                    Object obj3 = aVar2.f().get("application_id");
                    if (obj3 != null) {
                        if (obj3 instanceof String) {
                            str4 = (String) obj3;
                        } else {
                            str4 = null;
                        }
                        aVar = new K6.a(str4);
                    } else {
                        aVar = null;
                    }
                    Object obj4 = aVar2.f().get("session_id");
                    if (obj4 != null) {
                        if (obj4 instanceof String) {
                            str3 = (String) obj4;
                        } else {
                            str3 = null;
                        }
                        gVar = new g(str3);
                    } else {
                        gVar = null;
                    }
                    Object obj5 = aVar2.f().get("view.id");
                    if (obj5 != null) {
                        if (obj5 instanceof String) {
                            str2 = (String) obj5;
                        } else {
                            str2 = null;
                        }
                        kVar = new K6.k(str2);
                    } else {
                        kVar = null;
                    }
                    K6.c cVar3 = new K6.c(c5271a.f43901g, aVar, gVar, kVar);
                    C0813a c0813a = new C0813a();
                    K6.i iVar = new K6.i(c5271a.f43902h);
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : aVar2.f11651b.f11659c.entrySet()) {
                        hashMap.put((String) entry.getKey(), (String) entry.getValue());
                        it = it;
                    }
                    Iterator it2 = it;
                    for (Map.Entry entry2 : aVar2.f().entrySet()) {
                        hashMap.put((String) entry2.getKey(), String.valueOf(entry2.getValue()));
                    }
                    K6.d dVar = new K6.d(c5271a.f43899e, cVar3, c0813a, iVar, jVar, fVar, hashMap);
                    BigInteger bigInteger = aVar2.f11651b.f11660d;
                    AbstractC3557B.b0("model.traceId", bigInteger);
                    String Z02 = r9.y.Z0(bigInteger);
                    BigInteger bigInteger2 = aVar2.f11651b.f11661e;
                    AbstractC3557B.b0("model.spanId", bigInteger2);
                    String Z03 = r9.y.Z0(bigInteger2);
                    BigInteger bigInteger3 = aVar2.f11651b.f11662f;
                    AbstractC3557B.b0("model.parentId", bigInteger3);
                    String Z04 = r9.y.Z0(bigInteger3);
                    M6.b bVar = aVar2.f11651b;
                    if (bVar.f11665i != null && !bVar.f11665i.isEmpty()) {
                        str = bVar.f11665i;
                    } else {
                        str = bVar.f11666j;
                    }
                    String str10 = str;
                    String str11 = aVar2.f11651b.f11666j;
                    String str12 = aVar2.f11651b.f11664h;
                    long j11 = aVar2.f11654e.get();
                    C5271a c5271a2 = c5271a;
                    AbstractC5676b abstractC5676b3 = abstractC5676b2;
                    long j12 = aVar2.f11653d;
                    if (j12 > 0) {
                        cVar = cVar2;
                    } else {
                        cVar = cVar2;
                        j12 = TimeUnit.MICROSECONDS.toNanos(aVar2.f11652c);
                    }
                    long j13 = j12 + j10;
                    if (aVar2.f11651b.f11667k) {
                        j6 = 1;
                    } else {
                        j6 = 0;
                    }
                    AbstractC3557B.b0("resourceName", str10);
                    AbstractC3557B.b0("operationName", str11);
                    AbstractC3557B.b0("serviceName", str12);
                    cVar2 = cVar;
                    K6.l lVar = (K6.l) cVar2.f5060h0.k(new K6.l(Z02, Z03, Z04, str10, str11, str12, j11, j13, j6, eVar, dVar));
                    if (lVar == null) {
                        abstractC5676b = abstractC5676b3;
                        c5271a = c5271a2;
                    } else {
                        try {
                            c5271a = c5271a2;
                            try {
                                byte[] bytes = ((G6.c) cVar2.f5061i0).a(c5271a, lVar).getBytes(Lg.a.f11131a);
                                AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
                                synchronized (cVar2) {
                                    try {
                                        abstractC5676b = abstractC5676b3;
                                        try {
                                            abstractC5676b.a(new t5.d(bytes));
                                            try {
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z10 = true;
                                                P4.a.l0(cVar2.f5062j0, 5, AbstractC4344b.G0(EnumC5090b.f42738Y, EnumC5090b.f42740h0), new F6.b(lVar), th, 48);
                                                abstractC5676b2 = abstractC5676b;
                                                it = it2;
                                            }
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            throw th2;
                                            break;
                                        }
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        abstractC5676b = abstractC5676b3;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                abstractC5676b = abstractC5676b3;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            abstractC5676b = abstractC5676b3;
                            c5271a = c5271a2;
                        }
                    }
                    z10 = true;
                    abstractC5676b2 = abstractC5676b;
                    it = it2;
                }
                return jf.y.f36177a;
            case 13:
                int intValue = ((Number) obj).intValue();
                List list = (List) obj2;
                AbstractC3557B.c0("row", list);
                kotlin.jvm.internal.B b10 = (kotlin.jvm.internal.B) this.f24733Z;
                if (b10.f37622Y == null) {
                    b10.f37622Y = Integer.valueOf(list.size());
                }
                Integer num = (Integer) b10.f37622Y;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = list.size();
                }
                int size = list.size();
                Object obj6 = this.f24734h0;
                if (size <= i10) {
                    if (i10 == list.size()) {
                        return list;
                    }
                    V6.b bVar2 = (V6.b) obj6;
                    bVar2.f18406a.getClass();
                    bVar2.f18406a.getClass();
                    bVar2.f18406a.getClass();
                    throw new Y6.a(i10, list.size(), intValue + 1);
                }
                V6.b bVar3 = (V6.b) obj6;
                bVar3.f18406a.getClass();
                bVar3.f18406a.getClass();
                bVar3.f18406a.getClass();
                throw new Y6.a(i10, list.size(), intValue + 1);
            case 14:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 15:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 16:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 17:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 18:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 19:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 20:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 21:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 22:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 23:
                String str13 = (String) obj;
                List list2 = (List) obj2;
                AbstractC3557B.c0("message", str13);
                AbstractC3557B.c0("tags", list2);
                sb.u uVar = (sb.u) ((w) this.f24734h0);
                AbstractC3557B.c0("<this>", uVar);
                ((x) this.f24733Z).j(new sb.r(uVar.f45524a, uVar.f45525b, str13, list2));
                return jf.y.f36177a;
            case 24:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 25:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 26:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 27:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            case 28:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return jf.y.f36177a;
        }
    }

    public final E0.O j(o0 o0Var, long j6) {
        int i10 = this.f24732Y;
        Object obj = this.f24734h0;
        Object obj2 = this.f24733Z;
        switch (i10) {
            case 1:
                return ((N) obj).a(o0Var, o0Var.z(jf.y.f36177a, new C3288a(new c((wf.o) obj2, 0, new d(o0Var, j6)), true, -1945019079)), j6);
            default:
                return (E0.O) ((n) obj).invoke(new K((D) obj2, o0Var), new Z0.a(j6));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, wf.o oVar, int i10) {
        super(2);
        this.f24732Y = i10;
        this.f24734h0 = obj;
        this.f24733Z = oVar;
    }
}
