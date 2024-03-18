package androidx.compose.foundation;

import A.AbstractC0040r0;
import A.AbstractC0048v0;
import A.C0033n0;
import A.C0035o0;
import A.C0037p0;
import A.C0039q0;
import A.C0046u0;
import A.C0053y;
import A.C0055z;
import A.S0;
import A.X0;
import A.Z0;
import B.W0;
import D.m;
import E0.AbstractC0454m;
import E0.C0452k;
import E0.C0453l;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.Q;
import L0.g;
import L0.l;
import Ng.H;
import U3.f;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import Z.m1;
import Z.r;
import id.AbstractC3557B;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import p9.C5100b;
import q0.AbstractC5249a;
import r0.C5334A;
import r0.C5347k;
import r0.G;
import r0.L;
import u0.AbstractC5824b;
import wf.AbstractC6216a;
import wf.k;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(AbstractC4326r abstractC4326r, k kVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        r rVar = (r) abstractC1725n;
        rVar.X(-932836462);
        if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            androidx.compose.foundation.layout.a.d(androidx.compose.ui.draw.a.d(abstractC4326r, kVar), rVar);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0053y(abstractC4326r, kVar, i10, 0);
        }
    }

    public static final void b(AbstractC5824b abstractC5824b, String str, AbstractC4326r abstractC4326r, AbstractC4313e abstractC4313e, AbstractC0454m abstractC0454m, float f6, C5347k c5347k, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        C4318j c4318j;
        C0452k c0452k;
        float f10;
        C5347k c5347k2;
        r rVar = (r) abstractC1725n;
        rVar.X(1142754848);
        int i12 = i11 & 4;
        AbstractC4326r abstractC4326r3 = C4323o.f37719b;
        if (i12 != 0) {
            abstractC4326r2 = abstractC4326r3;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        if ((i11 & 8) != 0) {
            c4318j = C4310b.f37697j0;
        } else {
            c4318j = abstractC4313e;
        }
        if ((i11 & 16) != 0) {
            c0452k = C0453l.f4074b;
        } else {
            c0452k = abstractC0454m;
        }
        if ((i11 & 32) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f6;
        }
        if ((i11 & 64) != 0) {
            c5347k2 = null;
        } else {
            c5347k2 = c5347k;
        }
        if (str != null) {
            rVar.W(-1521136142);
            boolean g10 = rVar.g(str);
            Object K10 = rVar.K();
            if (g10 || K10 == C1723m.f22654Y) {
                K10 = new C0039q0(str, 0);
                rVar.h0(K10);
            }
            rVar.t(false);
            abstractC4326r3 = l.a(abstractC4326r3, false, (k) K10);
        }
        AbstractC4326r g11 = androidx.compose.ui.draw.a.g(androidx.compose.ui.draw.a.c(abstractC4326r2.g(abstractC4326r3)), abstractC5824b, c4318j, c0452k, f10, c5347k2, 2);
        C0035o0 c0035o0 = C0035o0.f260a;
        rVar.W(544976794);
        int i13 = rVar.P;
        AbstractC4326r f02 = f.f0(rVar, g11);
        AbstractC1732q0 p10 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        rVar.W(1405779621);
        if (rVar.f22696a instanceof AbstractC1707e) {
            rVar.Z();
            if (rVar.f22695O) {
                rVar.o(new C0033n0(c0582k, 0));
            } else {
                rVar.k0();
            }
            f.n0(rVar, c0035o0, C0583l.f5808f);
            f.n0(rVar, p10, C0583l.f5807e);
            f.n0(rVar, f02, C0583l.f5806d);
            C0581j c0581j = C0583l.f5809g;
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i13))) {
                AbstractC6463a.q(i13, rVar, i13, c0581j);
            }
            rVar.t(true);
            rVar.t(false);
            rVar.t(false);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new C0037p0(abstractC5824b, str, abstractC4326r2, c4318j, c0452k, f10, c5347k2, i10, i11);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    public static AbstractC4326r c(AbstractC4326r abstractC4326r, C5334A c5334a) {
        return abstractC4326r.g(new BackgroundElement(0L, c5334a, 1.0f, G.f44171a, 1));
    }

    public static final AbstractC4326r d(AbstractC4326r abstractC4326r, long j6, L l10) {
        return abstractC4326r.g(new BackgroundElement(j6, null, 1.0f, l10, 2));
    }

    public static final void e(long j6, W0 w02) {
        if (w02 == W0.f1213Y) {
            if (Z0.a.g(j6) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else if (Z0.a.h(j6) != Integer.MAX_VALUE) {
        } else {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    public static final AbstractC4326r f(AbstractC4326r abstractC4326r, m mVar, AbstractC0040r0 abstractC0040r0, boolean z10, String str, g gVar, AbstractC6216a abstractC6216a) {
        AbstractC4326r abstractC4326r2 = C4323o.f37719b;
        m1 m1Var = AbstractC0048v0.f314a;
        AbstractC4326r o10 = f.o(abstractC4326r2, new C0046u0(abstractC0040r0, 0, mVar));
        if (z10) {
            abstractC4326r2 = new HoverableElement(mVar);
        }
        return Q.s(abstractC4326r, Q.s(o10.g(abstractC4326r2), b.a(mVar, b.f24675a, z10)).g(new ClickableElement(mVar, z10, str, gVar, abstractC6216a)));
    }

    public static /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r, m mVar, AbstractC0040r0 abstractC0040r0, boolean z10, g gVar, AbstractC6216a abstractC6216a, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return f(abstractC4326r, mVar, abstractC0040r0, z11, null, gVar, abstractC6216a);
    }

    public static AbstractC4326r h(AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a) {
        return f.o(abstractC4326r, new C0055z(true, (String) null, (g) null, abstractC6216a));
    }

    public static final AbstractC4326r i(AbstractC4326r abstractC4326r, m mVar, AbstractC0040r0 abstractC0040r0, boolean z10, String str, g gVar, String str2, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3) {
        AbstractC4326r abstractC4326r2 = C4323o.f37719b;
        m1 m1Var = AbstractC0048v0.f314a;
        AbstractC4326r o10 = f.o(abstractC4326r2, new C0046u0(abstractC0040r0, 0, mVar));
        if (z10) {
            abstractC4326r2 = new HoverableElement(mVar);
        }
        return Q.s(abstractC4326r, Q.s(o10.g(abstractC4326r2), b.a(mVar, b.f24675a, z10)).g(new CombinedClickableElement(mVar, gVar, str, str2, abstractC6216a3, abstractC6216a, abstractC6216a2, z10)));
    }

    public static /* synthetic */ AbstractC4326r j(AbstractC4326r abstractC4326r, C5100b c5100b, AbstractC0040r0 abstractC0040r0, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2) {
        return i(abstractC4326r, c5100b, abstractC0040r0, true, null, null, null, abstractC6216a, null, abstractC6216a2);
    }

    public static AbstractC4326r k(AbstractC4326r abstractC4326r, Z0 z02) {
        return f.o(abstractC4326r, new X0(z02, null, false, false, true));
    }

    public static final Z0 l(AbstractC1725n abstractC1725n) {
        r rVar = (r) abstractC1725n;
        rVar.W(-1464256199);
        Object[] objArr = new Object[0];
        i0.r rVar2 = Z0.f150i;
        rVar.W(546516376);
        boolean e10 = rVar.e(0);
        Object K10 = rVar.K();
        if (e10 || K10 == C1723m.f22654Y) {
            K10 = new S0(0, 0);
            rVar.h0(K10);
        }
        rVar.t(false);
        Z0 z02 = (Z0) Ad.l.Y0(objArr, rVar2, (AbstractC6216a) K10, rVar, 4);
        rVar.t(false);
        return z02;
    }

    public static final long m(float f6, long j6) {
        return H.b(Math.max(0.0f, AbstractC5249a.b(j6) - f6), Math.max(0.0f, AbstractC5249a.c(j6) - f6));
    }

    public static AbstractC4326r n(AbstractC4326r abstractC4326r, Z0 z02) {
        return f.o(abstractC4326r, new X0(z02, null, true, false, true));
    }
}
