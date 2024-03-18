package r9;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.AbstractC0441z;
import E.B0;
import E.C0412a0;
import E.D0;
import E.p0;
import E0.N;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import W.AbstractC1577l0;
import W.J2;
import W.K2;
import W.P0;
import W.R0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.WeakHashMap;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import p9.AbstractC5101c;
import p9.AbstractC5102d;
import qa.C5291a;
import qa.C5293c;
import qa.C5294d;
import wf.AbstractC6216a;
import x8.W;
import y.AbstractC6463a;

/* renamed from: r9.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5389f extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44547Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f44548Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f44549h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5389f(Object obj, boolean z10, int i10) {
        super(3);
        this.f44547Y = i10;
        this.f44549h0 = obj;
        this.f44548Z = z10;
    }

    public final void a(AbstractC0441z abstractC0441z, AbstractC1725n abstractC1725n, int i10) {
        long j6;
        long j10;
        long j11;
        long j12;
        AbstractC4326r abstractC4326r = C4323o.f37719b;
        int i11 = this.f44547Y;
        boolean z10 = this.f44548Z;
        Object obj = this.f44549h0;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$ModalBottomSheet", abstractC0441z);
                AbstractC4326r a5 = io.sentry.compose.b.a("BottomSheet");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(1707906242);
                if (z10) {
                    rVar2.W(-49441252);
                    WeakHashMap weakHashMap = B0.f3736v;
                    B0 c10 = E.G.c(rVar2);
                    rVar2.t(false);
                    abstractC4326r = D0.a(abstractC4326r, new C0412a0(c10.f3747k, 32));
                }
                AbstractC4326r a10 = AbstractC4194d.a((X) a5, abstractC4326r);
                rVar2.t(false);
                wf.o oVar = (wf.o) obj;
                rVar2.W(-483455358);
                N a11 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(a10);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a11, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i13, rVar2, 0, 2058660585);
                    oVar.invoke(E.A.f3733a, rVar2, 6);
                    rVar2.t(false);
                    AbstractC6463a.u(rVar2, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 4:
                AbstractC3557B.c0("$this$ScrollableContentScreen", abstractC0441z);
                AbstractC4326r a12 = io.sentry.compose.b.a("DisclosureContent");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-1205194522);
                C5294d c5294d = (C5294d) obj;
                String str = c5294d.f44023b;
                if (str != null) {
                    N0.E e10 = ((p4) rVar4.m(q4.f20361a)).f20309j;
                    j4.b(str, AbstractC4194d.a((X) a12, Bi.c.I1(abstractC4326r, z10, false)), ((P0) rVar4.m(R0.f19593a)).f19529m, 0L, null, S0.D.f15974m0, null, 0L, null, null, 0L, 0, false, 0, 0, null, e10, rVar4, 196608, 0, 65496);
                }
                rVar4.t(false);
                rVar4.W(-1205194168);
                String str2 = c5294d.f44024c;
                if (str2 != null) {
                    N0.E e11 = ((p4) rVar4.m(q4.f20361a)).f20309j;
                    j4.b(str2, AbstractC4194d.a((X) a12, Bi.c.I1(abstractC4326r, z10, false)), ((P0) rVar4.m(R0.f19593a)).f19529m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, e11, rVar4, 0, 0, 65528);
                }
                rVar4.t(false);
                for (C5293c c5293c : c5294d.f44025d) {
                    Integer num = c5293c.f44020d;
                    AbstractC5101c abstractC5101c = c5293c.f44021e;
                    if (num != null) {
                        rVar4.W(597924475);
                        L4.a.l(c5293c.f44017a, R4.b.X(rVar4, -1245415806, new C5291a(c5293c, 0)), kotlin.jvm.internal.m.F(c5293c.f44020d.intValue(), rVar4), K8.d.u0(abstractC5101c, rVar4), Bi.c.I1(abstractC4326r, z10, false), 0L, rVar4, 560, 32);
                        rVar4.t(false);
                    } else if (c5293c.f44019c != null) {
                        rVar4.W(597924841);
                        L4.a.m(c5293c.f44017a, R4.b.X(rVar4, 70313657, new C5291a(c5293c, 1)), c5293c.f44019c, K8.d.u0(abstractC5101c, rVar4), Bi.c.I1(abstractC4326r, z10, false), 0L, rVar4, 48, 32);
                        rVar4.t(false);
                    } else {
                        rVar4.W(597925140);
                        rVar4.t(false);
                    }
                }
                return;
            default:
                AbstractC3557B.c0("$this$Card", abstractC0441z);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(abstractC4326r, AbstractC1577l0.f20203a);
                C4317i c4317i = C4310b.f37703p0;
                Ed.i iVar = (Ed.i) obj;
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(693286680);
                N a13 = p0.a(AbstractC0429m.f3907a, c4317i, rVar6);
                rVar6.W(-1323940314);
                int i14 = rVar6.P;
                AbstractC1732q0 p11 = rVar6.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(q10);
                if (rVar6.f22696a instanceof AbstractC1707e) {
                    rVar6.Z();
                    if (rVar6.f22695O) {
                        rVar6.o(c0582k2);
                    } else {
                        rVar6.k0();
                    }
                    U3.f.n0(rVar6, a13, C0583l.f5808f);
                    U3.f.n0(rVar6, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar6.f22695O || !AbstractC3557B.K(rVar6.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar6, i14, c0581j2);
                    }
                    AbstractC6463a.t(rVar6, i15, rVar6, 0, 2058660585);
                    AbstractC4326r a14 = io.sentry.compose.b.a("VoiceModeSettingsScreen");
                    long j13 = AbstractC5102d.f42765b;
                    if (1.0f > 0.0d) {
                        j4.b(Ng.H.v(iVar.f4683Z, rVar6), AbstractC4194d.a((X) a14, new LayoutWeightElement(com.google.android.gms.internal.play_billing.N.l(1.0f, Float.MAX_VALUE), true)), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar6, 0, 0, 131064);
                        rVar6.W(-351083046);
                        long j14 = r0.r.f44263k;
                        P0 p02 = (P0) rVar6.m(R0.f19593a);
                        J2 j22 = p02.f19513Y;
                        if (j22 == null) {
                            float f6 = X.y.f21713a;
                            j22 = new J2(R0.d(p02, 26), R0.d(p02, 19), r0.r.b(R0.d(p02, 18), 0.38f), r0.r.b(R0.d(p02, 18), 0.38f));
                            p02.f19513Y = j22;
                            j6 = j13;
                        } else {
                            j6 = j13;
                        }
                        if (j6 != j14) {
                            j10 = j6;
                        } else {
                            j10 = j22.f19256a;
                        }
                        int i16 = (j14 > j14 ? 1 : (j14 == j14 ? 0 : -1));
                        if (i16 != 0) {
                            j11 = j14;
                        } else {
                            j11 = j22.f19257b;
                        }
                        if (i16 != 0) {
                            j12 = j14;
                        } else {
                            j12 = j22.f19258c;
                        }
                        if (i16 == 0) {
                            j14 = j22.f19259d;
                        }
                        J2 j23 = new J2(j10, j11, j12, j14);
                        rVar6.t(false);
                        K2.a(this.f44548Z, null, a14, false, j23, null, rVar6, 48, 44);
                        AbstractC6463a.v(rVar6, false, true, false, false);
                        return;
                    }
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                R4.b.r1();
                throw null;
        }
    }

    public final void c(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f44547Y;
        Object obj = this.f44549h0;
        boolean z10 = this.f44548Z;
        switch (i11) {
            case 1:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a5 = io.sentry.compose.b.a("GizmosAndHistoryList");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                if (z10) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    rVar2.W(-1509678458);
                    W.m(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), rVar2, 6, 0);
                    rVar2.t(false);
                    return;
                }
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-1509678271);
                rVar3.W(-1509678199);
                wf.k kVar = (wf.k) obj;
                boolean g10 = rVar3.g(kVar);
                Object K10 = rVar3.K();
                if (g10 || K10 == C1723m.f22654Y) {
                    K10 = AbstractC0044t0.t(6, kVar, rVar3);
                }
                rVar3.t(false);
                W.l((AbstractC6216a) K10, a5, rVar3, 0, 2);
                rVar3.t(false);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a10 = io.sentry.compose.b.a("GizmosAndHistoryList");
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                if (z10) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    rVar5.W(-1509677648);
                    K8.d.D(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), rVar5, 6, 0);
                    rVar5.t(false);
                    return;
                }
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(-1509677464);
                K8.d.C(new F9.e((Tc.f) obj, 3), a10, rVar6, 0, 2);
                rVar6.t(false);
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        jf.y yVar = jf.y.f36177a;
        switch (this.f44547Y) {
            case 0:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                c((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                c((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 3:
                String str = (String) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("currentText", str);
                C4323o c4323o = C4323o.f37719b;
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(str)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                L4.a.S(Bi.c.R1(str, !AbstractC3557B.K(str, (String) this.f44549h0)), K8.d.y0(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), this.f44548Z), 1, 0, abstractC1725n, 384, 8);
                return yVar;
            case 4:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5389f(boolean z10, Object obj, int i10) {
        super(3);
        this.f44547Y = i10;
        this.f44548Z = z10;
        this.f44549h0 = obj;
    }
}
