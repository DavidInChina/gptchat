package nc;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0421f;
import E.C0426j;
import E.g0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import Ng.H;
import W.AbstractC1577l0;
import W.C1572k0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.m1;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import wf.AbstractC6216a;
import x8.W;
import y.AbstractC6463a;

/* renamed from: nc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4810b extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4810b f40205Z = new C4810b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4810b f40206h0 = new C4810b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40207Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4810b(int i10) {
        super(5);
        this.f40207Y = i10;
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        int i11;
        String u10;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        jf.y yVar = jf.y.f36177a;
        E.A a5 = E.A.f3733a;
        C4316h c4316h = C4310b.f37705r0;
        C4323o c4323o = C4323o.f37719b;
        int i16 = 4;
        switch (this.f40207Y) {
            case 0:
                g0 g0Var = (g0) obj;
                s sVar = (s) obj2;
                wf.k kVar = (wf.k) obj3;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
                int intValue = num.intValue();
                AbstractC3557B.c0("paddings", g0Var);
                AbstractC3557B.c0("state", sVar);
                AbstractC3557B.c0("onIntent", kVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (!((Z.r) abstractC1725n).g(g0Var)) {
                        i16 = 2;
                    }
                    i10 = intValue | i16;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    if (((Z.r) abstractC1725n).g(sVar)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i10 |= i13;
                }
                if ((intValue & 896) == 0) {
                    if (((Z.r) abstractC1725n).i(kVar)) {
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                if ((i10 & 5851) == 1170) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var);
                C0421f c0421f = AbstractC0429m.f3907a;
                float f6 = p9.r.f42841e;
                C0426j g10 = AbstractC0429m.g(f6);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-483455358);
                N a10 = AbstractC0440y.a(g10, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i17 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(q10);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i17))) {
                        AbstractC6463a.q(i17, rVar2, i17, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i18, rVar2, 0, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                    if (sVar.f40256h) {
                        i11 = R.string.share_screen_description_already_shared;
                    } else {
                        i11 = R.string.share_screen_description;
                    }
                    String v10 = H.v(i11, rVar2);
                    AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(c4323o, f6, 0.0f, 2);
                    m1 m1Var = q4.f20361a;
                    j4.b(v10, t10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(m1Var)).f20310k, rVar2, 0, 0, 65532);
                    boolean z12 = sVar.f40251c;
                    if (z12) {
                        u10 = AbstractC4194d.u(rVar2, 952748836, R.string.share_screen_plugin_content_warning, rVar2, false);
                    } else if (!z12) {
                        u10 = AbstractC4194d.u(rVar2, 952748927, R.string.share_screen_custom_profile_warning, rVar2, false);
                    } else {
                        rVar2.W(952743237);
                        rVar2.t(false);
                        throw new RuntimeException();
                    }
                    j4.b(u10, androidx.compose.foundation.layout.a.t(c4323o, f6, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(m1Var)).f20310k, rVar2, 0, 0, 65532);
                    Ad.l.f(sVar.f40252d, sVar.f40255g, sVar.f40250b, sVar.f40254f, AbstractC0044t0.P(a5, c4323o), false, null, R4.b.X(rVar2, 1572194475, new gc.l(sVar, 2, kVar)), rVar2, 12587016, 96);
                    AbstractC4326r a12 = AbstractC4194d.a((X) a11, androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.a.s(c4323o, f6, f6), 1.0f));
                    C1572k0 a13 = AbstractC1577l0.a(rVar2);
                    if (sVar.f40257i != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rVar2.W(952750623);
                    if ((i10 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object K10 = rVar2.K();
                    if (z11 || K10 == C1723m.f22654Y) {
                        K10 = AbstractC0044t0.z(10, kVar, rVar2);
                    }
                    rVar2.t(false);
                    W.q((AbstractC6216a) K10, a12, a13, sVar.f40258j, z10, AbstractC4811c.f40211d, rVar2, 196608, 0);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
            default:
                g0 g0Var2 = (g0) obj;
                z zVar = (z) obj2;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj4;
                int intValue2 = num.intValue();
                AbstractC3557B.c0("paddings", g0Var2);
                AbstractC3557B.c0("state", zVar);
                AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((intValue2 & 14) == 0) {
                    if (!((Z.r) abstractC1725n2).g(g0Var2)) {
                        i16 = 2;
                    }
                    i14 = intValue2 | i16;
                } else {
                    i14 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    if (((Z.r) abstractC1725n2).g(zVar)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 |= i15;
                }
                if ((i14 & 5211) == 1042) {
                    Z.r rVar3 = (Z.r) abstractC1725n2;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                AbstractC4326r q11 = androidx.compose.foundation.layout.a.q(c4323o, g0Var2);
                Z.r rVar4 = (Z.r) abstractC1725n2;
                rVar4.W(-483455358);
                N a14 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar4);
                rVar4.W(-1323940314);
                int i19 = rVar4.P;
                AbstractC1732q0 p11 = rVar4.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i20 = androidx.compose.ui.layout.a.i(q11);
                if (rVar4.f22696a instanceof AbstractC1707e) {
                    rVar4.Z();
                    if (rVar4.f22695O) {
                        rVar4.o(c0582k2);
                    } else {
                        rVar4.k0();
                    }
                    U3.f.n0(rVar4, a14, C0583l.f5808f);
                    U3.f.n0(rVar4, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar4.f22695O || !AbstractC3557B.K(rVar4.K(), Integer.valueOf(i19))) {
                        AbstractC6463a.q(i19, rVar4, i19, c0581j2);
                    }
                    AbstractC6463a.t(rVar4, i20, rVar4, 0, 2058660585);
                    AbstractC4326r a15 = AbstractC4194d.a((X) io.sentry.compose.b.a("<anonymous>"), AbstractC0044t0.P(a5, c4323o));
                    C3288a c3288a = d.f40225i;
                    Ad.l.f(zVar.f40269g, zVar.f40266d, zVar.f40264b, zVar.f40265c, a15, zVar.f40263a, zVar.f40268f, c3288a, rVar4, 12587016, 0);
                    AbstractC6463a.v(rVar4, false, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
        }
    }
}
