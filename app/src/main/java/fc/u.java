package fc;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E.p0;
import E0.N;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0583l;
import W.E1;
import W.K2;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1708e0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.U0;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import l8.AbstractC4344b;
import mc.C4616c;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30227Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y f30228Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f30229h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(y yVar, wf.k kVar, int i10) {
        super(3);
        this.f30227Y = i10;
        this.f30228Z = yVar;
        this.f30229h0 = kVar;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        Vc.A a5;
        boolean z10;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f30227Y;
        wf.k kVar = this.f30229h0;
        y yVar = this.f30228Z;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a10 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                E1.a(AbstractC3009d.f30191j, a10, null, null, AbstractC3009d.f30192k, R4.b.X(abstractC1725n, 1459851854, new t(yVar, kVar, 0)), null, 0.0f, 0.0f, abstractC1725n, 221190, 462);
                return;
            case 1:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a11 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                E1.a(AbstractC3009d.f30193l, a11, null, AbstractC3009d.f30194m, AbstractC3009d.f30195n, R4.b.X(abstractC1725n, 146743693, new t(yVar, kVar, 1)), null, 0.0f, 0.0f, abstractC1725n, 224262, 454);
                return;
            case 2:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a12 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                E1.a(AbstractC3009d.f30196o, a12, null, AbstractC3009d.f30197p, AbstractC3009d.f30198q, R4.b.X(abstractC1725n, 1478919798, new t(yVar, kVar, 2)), null, 0.0f, 0.0f, abstractC1725n, 224262, 454);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a13 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                E1.a(AbstractC3009d.f30199r, a13, null, null, AbstractC3009d.f30200s, null, null, 0.0f, 0.0f, abstractC1725n, 24582, 494);
                C4616c c4616c = yVar.f30237a;
                if (c4616c == null || (a5 = c4616c.f39127c) == null) {
                    a5 = Vc.A.f18524Z;
                }
                List K22 = kf.t.K2(w.f30234a);
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(-1869688687);
                Object K10 = rVar5.K();
                Object obj = C1723m.f22654Y;
                if (K10 == obj) {
                    K10 = U3.f.h0(K22.indexOf(a5));
                    rVar5.h0(K10);
                }
                AbstractC1708e0 abstractC1708e0 = (AbstractC1708e0) K10;
                rVar5.t(false);
                AbstractC4326r v10 = androidx.compose.foundation.layout.a.v(c4323o, p9.r.f42844h, 0.0f, 0.0f, 0.0f, 14);
                rVar5.W(-483455358);
                N a14 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar5);
                int i12 = -1323940314;
                rVar5.W(-1323940314);
                int i13 = rVar5.P;
                AbstractC1732q0 p10 = rVar5.p();
                AbstractC0584m.f5811i.getClass();
                AbstractC6216a abstractC6216a = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(v10);
                boolean z11 = rVar5.f22696a instanceof AbstractC1707e;
                if (z11) {
                    rVar5.Z();
                    if (rVar5.f22695O) {
                        rVar5.o(abstractC6216a);
                    } else {
                        rVar5.k0();
                    }
                    U3.f.n0(rVar5, a14, C0583l.f5808f);
                    U3.f.n0(rVar5, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i13))) {
                        AbstractC6463a.q(i13, rVar5, i13, c0581j);
                    }
                    AbstractC6463a.t(rVar5, i14, rVar5, 0, 2058660585);
                    rVar5.W(-1869688512);
                    int i15 = 0;
                    for (Object obj2 : K22) {
                        int i16 = i15 + 1;
                        if (i15 >= 0) {
                            Vc.A a15 = (Vc.A) obj2;
                            C4317i c4317i = C4310b.f37703p0;
                            rVar5.W(693286680);
                            N a16 = p0.a(AbstractC0429m.f3907a, c4317i, rVar5);
                            rVar5.W(i12);
                            int i17 = rVar5.P;
                            AbstractC1732q0 p11 = rVar5.p();
                            AbstractC0584m.f5811i.getClass();
                            AbstractC6216a abstractC6216a2 = C0583l.f5804b;
                            C3288a i18 = androidx.compose.ui.layout.a.i(c4323o);
                            if (z11) {
                                rVar5.Z();
                                if (rVar5.f22695O) {
                                    rVar5.o(abstractC6216a2);
                                } else {
                                    rVar5.k0();
                                }
                                U3.f.n0(rVar5, a16, C0583l.f5808f);
                                U3.f.n0(rVar5, p11, C0583l.f5807e);
                                C0581j c0581j2 = C0583l.f5809g;
                                if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i17))) {
                                    AbstractC6463a.q(i17, rVar5, i17, c0581j2);
                                }
                                AbstractC6463a.t(rVar5, i18, rVar5, 0, 2058660585);
                                AbstractC4326r a17 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                                if (i15 == ((U0) abstractC1708e0).h()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                rVar5.W(581591026);
                                boolean e10 = rVar5.e(i15) | rVar5.g(kVar) | rVar5.g(a15);
                                Object K11 = rVar5.K();
                                if (e10 || K11 == obj) {
                                    K11 = new v(i15, kVar, a15, abstractC1708e0);
                                    rVar5.h0(K11);
                                }
                                rVar5.t(false);
                                K2.a(z10, (AbstractC6216a) K11, a17, false, null, null, rVar5, 0, 60);
                                j4.b(a15.name(), a17, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar5, 0, 0, 131070);
                                AbstractC6463a.v(rVar5, false, true, false, false);
                                i15 = i16;
                                i12 = -1323940314;
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        } else {
                            AbstractC4344b.d1();
                            throw null;
                        }
                    }
                    AbstractC6463a.v(rVar5, false, false, true, false);
                    rVar5.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f30227Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
