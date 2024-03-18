package androidx.compose.animation;

import Ng.H;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1724m0;
import Z.o1;
import Z.r;
import Z0.i;
import Z0.k;
import id.AbstractC3557B;
import java.util.Map;
import kotlin.jvm.internal.m;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import nf.AbstractC4828h;
import r0.P;
import ta.C5705d;
import y.C6481t;
import y.N;
import y.V;
import y.W;
import y.Y;
import y.d0;
import y.e0;
import y.f0;
import y.k0;
import y.q0;
import y.t0;
import z.AbstractC6652A0;
import z.AbstractC6659E;
import z.AbstractC6670J0;
import z.AbstractC6696f;
import z.C6697f0;
import z.C6715o0;
import z.C6729v0;
import z.C6735y0;
import z.C6737z0;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6737z0 f24636a;

    /* renamed from: b  reason: collision with root package name */
    public static final C6697f0 f24637b = AbstractC6696f.u(0.0f, 400.0f, null, 5);

    /* renamed from: c  reason: collision with root package name */
    public static final C6697f0 f24638c = AbstractC6696f.u(0.0f, 400.0f, new i(m.c(1, 1)), 1);

    /* renamed from: d  reason: collision with root package name */
    public static final C6697f0 f24639d = AbstractC6696f.u(0.0f, 400.0f, new k(H.c(1, 1)), 1);

    static {
        C6481t c6481t = C6481t.f50289m0;
        C6481t c6481t2 = C6481t.f50290n0;
        C6737z0 c6737z0 = AbstractC6652A0.f51116a;
        f24636a = new C6737z0(c6481t, c6481t2);
        int i10 = i.f22798c;
        Map map = AbstractC6670J0.f51158a;
    }

    public static final AbstractC4326r a(C6729v0 c6729v0, d0 d0Var, e0 e0Var, AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        boolean z11;
        C6715o0 c6715o0;
        C6715o0 c6715o02;
        C6715o0 c6715o03;
        boolean z12;
        boolean z13;
        boolean z14;
        C6715o0 c6715o04;
        C6715o0 c6715o05;
        C6715o0 c6715o06;
        N n10;
        r rVar = (r) abstractC1725n;
        rVar.W(914000546);
        rVar.W(21614502);
        rVar.W(1157296644);
        boolean g10 = rVar.g(c6729v0);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        o1 o1Var = o1.f22665a;
        if (g10 || K10 == iVar) {
            K10 = AbstractC4828h.Z(d0Var, o1Var);
            rVar.h0(K10);
        }
        rVar.t(false);
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        Object b10 = c6729v0.b();
        C1724m0 c1724m0 = c6729v0.f51386c;
        Object value = c1724m0.getValue();
        V v10 = V.f50157Z;
        if (b10 == value && c6729v0.b() == v10) {
            if (c6729v0.d()) {
                abstractC1710f0.setValue(d0Var);
            } else {
                abstractC1710f0.setValue(d0.f50196b);
            }
        } else if (c1724m0.getValue() == v10) {
            abstractC1710f0.setValue(((d0) abstractC1710f0.getValue()).b(d0Var));
        }
        d0 d0Var2 = (d0) abstractC1710f0.getValue();
        rVar.t(false);
        rVar.W(-1363864804);
        rVar.W(1157296644);
        boolean g11 = rVar.g(c6729v0);
        Object K11 = rVar.K();
        if (g11 || K11 == iVar) {
            K11 = AbstractC4828h.Z(e0Var, o1Var);
            rVar.h0(K11);
        }
        rVar.t(false);
        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K11;
        if (c6729v0.b() == c1724m0.getValue() && c6729v0.b() == v10) {
            if (c6729v0.d()) {
                abstractC1710f02.setValue(e0Var);
            } else {
                abstractC1710f02.setValue(e0.f50199b);
            }
        } else if (c1724m0.getValue() != v10) {
            abstractC1710f02.setValue(((e0) abstractC1710f02.getValue()).b(e0Var));
        }
        e0 e0Var2 = (e0) abstractC1710f02.getValue();
        rVar.t(false);
        t0 t0Var = d0Var2.f50197a;
        if (t0Var.f50301b == null && e0Var2.f50201a.f50301b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (t0Var.f50302c == null && e0Var2.f50201a.f50302c == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        rVar.W(1657242209);
        if (z10) {
            int i11 = i.f22798c;
            C6737z0 c6737z0 = AbstractC6652A0.f51122g;
            rVar.W(-492369756);
            Object K12 = rVar.K();
            if (K12 == iVar) {
                K12 = "Built-in slide";
                rVar.h0(K12);
            }
            rVar.t(false);
            c6715o0 = AbstractC6696f.m(c6729v0, c6737z0, (String) K12, rVar, 0);
        } else {
            c6715o0 = null;
        }
        rVar.t(false);
        rVar.W(1657242379);
        if (z11) {
            C6737z0 c6737z02 = AbstractC6652A0.f51123h;
            rVar.W(-492369756);
            Object K13 = rVar.K();
            if (K13 == iVar) {
                K13 = "Built-in shrink/expand";
                rVar.h0(K13);
            }
            rVar.t(false);
            c6715o02 = AbstractC6696f.m(c6729v0, c6737z02, (String) K13, rVar, 0);
        } else {
            c6715o02 = null;
        }
        rVar.t(false);
        rVar.W(1657242547);
        if (z11) {
            int i12 = i.f22798c;
            C6737z0 c6737z03 = AbstractC6652A0.f51122g;
            rVar.W(-492369756);
            Object K14 = rVar.K();
            if (K14 == iVar) {
                K14 = "Built-in InterruptionHandlingOffset";
                rVar.h0(K14);
            }
            rVar.t(false);
            c6715o03 = AbstractC6696f.m(c6729v0, c6737z03, (String) K14, rVar, 0);
        } else {
            c6715o03 = null;
        }
        rVar.t(false);
        t0 t0Var2 = d0Var2.f50197a;
        N n11 = t0Var2.f50302c;
        if ((n11 != null && !n11.f50133d) || (((n10 = e0Var2.f50201a.f50302c) != null && !n10.f50133d) || !z11)) {
            z12 = true;
        } else {
            z12 = false;
        }
        rVar.W(642253525);
        if (t0Var2.f50300a == null && e0Var2.f50201a.f50300a == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (t0Var2.f50303d == null && e0Var2.f50201a.f50303d == null) {
            z14 = false;
        } else {
            z14 = true;
        }
        rVar.W(-1158245383);
        if (z13) {
            C6737z0 c6737z04 = AbstractC6652A0.f51116a;
            rVar.W(-492369756);
            Object K15 = rVar.K();
            if (K15 == iVar) {
                K15 = "Built-in alpha";
                rVar.h0(K15);
            }
            rVar.t(false);
            c6715o04 = AbstractC6696f.m(c6729v0, c6737z04, (String) K15, rVar, 0);
        } else {
            c6715o04 = null;
        }
        rVar.t(false);
        rVar.W(-1158245186);
        if (z14) {
            C6737z0 c6737z05 = AbstractC6652A0.f51116a;
            rVar.W(-492369756);
            Object K16 = rVar.K();
            if (K16 == iVar) {
                K16 = "Built-in scale";
                rVar.h0(K16);
            }
            rVar.t(false);
            c6715o05 = AbstractC6696f.m(c6729v0, c6737z05, (String) K16, rVar, 0);
        } else {
            c6715o05 = null;
        }
        rVar.t(false);
        if (z14) {
            c6715o06 = AbstractC6696f.m(c6729v0, f24636a, "TransformOriginInterruptionHandling", rVar, 0);
        } else {
            c6715o06 = null;
        }
        W w10 = new W(c6715o04, c6715o05, c6729v0, d0Var2, e0Var2, c6715o06);
        rVar.t(false);
        AbstractC4326r g12 = androidx.compose.ui.graphics.a.m(C4323o.f37719b, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, !z12, 126975).g(new EnterExitTransitionElement(c6729v0, c6715o02, c6715o03, c6715o0, d0Var2, e0Var2, w10));
        rVar.t(false);
        return g12;
    }

    public static final d0 b(AbstractC6659E abstractC6659E, AbstractC4313e abstractC4313e, wf.k kVar, boolean z10) {
        return new d0(new t0(null, null, new N(abstractC6659E, abstractC4313e, kVar, z10), null, false, null, 59));
    }

    public static d0 c(AbstractC6659E abstractC6659E, int i10) {
        if ((i10 & 1) != 0) {
            abstractC6659E = AbstractC6696f.u(0.0f, 400.0f, null, 5);
        }
        return new d0(new t0(new f0(0.0f, abstractC6659E), null, null, null, false, null, 62));
    }

    public static e0 d(AbstractC6659E abstractC6659E, int i10) {
        if ((i10 & 1) != 0) {
            abstractC6659E = AbstractC6696f.u(0.0f, 400.0f, null, 5);
        }
        return new e0(new t0(new f0(0.0f, abstractC6659E), null, null, null, false, null, 62));
    }

    public static d0 e(AbstractC6659E abstractC6659E, float f6, int i10) {
        if ((i10 & 1) != 0) {
            abstractC6659E = AbstractC6696f.u(0.0f, 400.0f, null, 5);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        return new d0(new t0(null, null, null, new k0(f6, P.f44225b, abstractC6659E), false, null, 55));
    }

    public static e0 f(C6697f0 c6697f0, int i10) {
        if ((i10 & 1) != 0) {
            c6697f0 = AbstractC6696f.u(0.0f, 400.0f, null, 5);
        }
        return new e0(new t0(null, null, null, new k0(0.0f, P.f44225b, c6697f0), false, null, 55));
    }

    public static final e0 g(AbstractC6659E abstractC6659E, AbstractC4313e abstractC4313e, wf.k kVar, boolean z10) {
        return new e0(new t0(null, null, new N(abstractC6659E, abstractC4313e, kVar, z10), null, false, null, 59));
    }

    public static e0 h(C6735y0 c6735y0, C4317i c4317i, ub.r rVar, int i10) {
        C4318j c4318j;
        AbstractC6659E abstractC6659E = c6735y0;
        if ((i10 & 1) != 0) {
            Map map = AbstractC6670J0.f51158a;
            abstractC6659E = AbstractC6696f.u(0.0f, 400.0f, new k(H.c(1, 1)), 1);
        }
        int i11 = i10 & 2;
        C4317i c4317i2 = C4310b.f37704q0;
        if (i11 != 0) {
            c4317i = c4317i2;
        }
        wf.k kVar = rVar;
        if ((i10 & 8) != 0) {
            kVar = C6481t.f50297u0;
        }
        if (AbstractC3557B.K(c4317i, C4310b.f37702o0)) {
            c4318j = C4310b.f37694Z;
        } else if (AbstractC3557B.K(c4317i, c4317i2)) {
            c4318j = C4310b.f37700m0;
        } else {
            c4318j = C4310b.f37697j0;
        }
        return g(abstractC6659E, c4318j, new Y(3, kVar), true);
    }

    public static final d0 i(AbstractC6659E abstractC6659E, wf.k kVar) {
        return new d0(new t0(null, new q0(abstractC6659E, kVar), null, null, false, null, 61));
    }

    public static d0 j(C5705d c5705d) {
        int i10 = i.f22798c;
        Map map = AbstractC6670J0.f51158a;
        return i(AbstractC6696f.u(0.0f, 400.0f, new i(m.c(1, 1)), 1), new Y(5, c5705d));
    }

    public static final e0 k(AbstractC6659E abstractC6659E, wf.k kVar) {
        return new e0(new t0(null, new q0(abstractC6659E, kVar), null, null, false, null, 61));
    }

    public static e0 l(C5705d c5705d) {
        int i10 = i.f22798c;
        Map map = AbstractC6670J0.f51158a;
        return k(AbstractC6696f.u(0.0f, 400.0f, new i(m.c(1, 1)), 1), new Y(7, c5705d));
    }
}
