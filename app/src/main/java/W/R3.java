package W;

import N0.C1049h;
import Z.AbstractC1725n;
import q0.C5251c;
import r0.AbstractC5350n;
import t0.AbstractC5651j;

/* loaded from: classes2.dex */
public final class R3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f19617Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f19618Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19619h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f19620i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f19621j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(float f6, long j6, wf.n nVar, boolean z10, long j10) {
        super(2);
        this.f19617Y = f6;
        this.f19618Z = j6;
        this.f19619h0 = nVar;
        this.f19620i0 = z10;
        this.f19621j0 = j10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Y0.o oVar;
        float f6;
        N0.t tVar;
        N0.s sVar;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        Z.m1 m1Var = q4.f20361a;
        Z.r rVar2 = (Z.r) abstractC1725n;
        N0.E e10 = ((p4) rVar2.m(m1Var)).f20309j;
        N0.E e11 = ((p4) rVar2.m(m1Var)).f20311l;
        N0.y yVar = e10.f12487a;
        N0.y yVar2 = e11.f12487a;
        int i10 = N0.A.f12466e;
        Y0.o oVar2 = yVar.f12628a;
        Y0.o oVar3 = yVar2.f12628a;
        boolean z10 = oVar2 instanceof Y0.b;
        float f10 = this.f19617Y;
        if (!z10 && !(oVar3 instanceof Y0.b)) {
            long n10 = androidx.compose.ui.graphics.a.n(f10, oVar2.b(), oVar3.b());
            if (n10 != r0.r.f44263k) {
                oVar = new Y0.c(n10);
            } else {
                oVar = Y0.m.f22036a;
            }
        } else if (z10 && (oVar3 instanceof Y0.b)) {
            oVar = Y0.l.a(K4.J.L(oVar2.a(), oVar3.a(), f10), (AbstractC5350n) N0.A.b(f10, ((Y0.b) oVar2).f22015a, ((Y0.b) oVar3).f22015a));
        } else {
            oVar = (Y0.o) N0.A.b(f10, oVar2, oVar3);
        }
        Y0.o oVar4 = oVar;
        S0.s sVar2 = (S0.s) N0.A.b(f10, yVar.f12633f, yVar2.f12633f);
        long c10 = N0.A.c(f10, yVar.f12629b, yVar2.f12629b);
        S0.D d10 = yVar.f12630c;
        if (d10 == null) {
            d10 = S0.D.f15971j0;
        }
        S0.D d11 = yVar2.f12630c;
        if (d11 == null) {
            d11 = S0.D.f15971j0;
        }
        S0.D d12 = new S0.D(com.google.android.gms.internal.play_billing.N.p(K4.J.M(f10, d10.f15975Y, d11.f15975Y), 1, 1000));
        S0.z zVar = (S0.z) N0.A.b(f10, yVar.f12631d, yVar2.f12631d);
        S0.A a5 = (S0.A) N0.A.b(f10, yVar.f12632e, yVar2.f12632e);
        String str = (String) N0.A.b(f10, yVar.f12634g, yVar2.f12634g);
        long c11 = N0.A.c(f10, yVar.f12635h, yVar2.f12635h);
        float f11 = 0.0f;
        Y0.a aVar = yVar.f12636i;
        if (aVar != null) {
            f6 = aVar.f22014a;
        } else {
            f6 = 0.0f;
        }
        Y0.a aVar2 = yVar2.f12636i;
        if (aVar2 != null) {
            f11 = aVar2.f22014a;
        }
        float L10 = K4.J.L(f6, f11, f10);
        Y0.p pVar = Y0.p.f22039c;
        Y0.p pVar2 = yVar.f12637j;
        if (pVar2 == null) {
            pVar2 = pVar;
        }
        Y0.p pVar3 = yVar2.f12637j;
        if (pVar3 != null) {
            pVar = pVar3;
        }
        Y0.p pVar4 = new Y0.p(K4.J.L(pVar2.f22040a, pVar.f22040a, f10), K4.J.L(pVar2.f22041b, pVar.f22041b, f10));
        U0.d dVar = (U0.d) N0.A.b(f10, yVar.f12638k, yVar2.f12638k);
        long n11 = androidx.compose.ui.graphics.a.n(f10, yVar.f12639l, yVar2.f12639l);
        Y0.j jVar = (Y0.j) N0.A.b(f10, yVar.f12640m, yVar2.f12640m);
        r0.K k10 = yVar.f12641n;
        if (k10 == null) {
            k10 = new r0.K();
        }
        r0.K k11 = yVar2.f12641n;
        if (k11 == null) {
            k11 = new r0.K();
        }
        long n12 = androidx.compose.ui.graphics.a.n(f10, k10.f44203a, k11.f44203a);
        long j6 = k10.f44204b;
        float d13 = C5251c.d(j6);
        long j10 = k11.f44204b;
        r0.K k12 = new r0.K(n12, R4.b.r(K4.J.L(d13, C5251c.d(j10), f10), K4.J.L(C5251c.e(j6), C5251c.e(j10), f10)), K4.J.L(k10.f44205c, k11.f44205c, f10));
        N0.t tVar2 = yVar.f12642o;
        if (tVar2 == null && yVar2.f12642o == null) {
            tVar = null;
        } else {
            if (tVar2 == null) {
                tVar2 = N0.t.f12566a;
            }
            tVar = tVar2;
        }
        N0.y yVar3 = new N0.y(oVar4, c10, d12, zVar, a5, sVar2, str, c11, new Y0.a(L10), pVar4, dVar, n11, jVar, k12, tVar, (AbstractC5651j) N0.A.b(f10, yVar.f12643p, yVar2.f12643p));
        int i11 = N0.q.f12559b;
        N0.p pVar5 = e10.f12488b;
        Y0.i iVar = new Y0.i(pVar5.f12549a);
        N0.p pVar6 = e11.f12488b;
        int i12 = ((Y0.i) N0.A.b(f10, iVar, new Y0.i(pVar6.f12549a))).f22030a;
        int i13 = ((Y0.k) N0.A.b(f10, new Y0.k(pVar5.f12550b), new Y0.k(pVar6.f12550b))).f22035a;
        long c12 = N0.A.c(f10, pVar5.f12551c, pVar6.f12551c);
        Y0.q qVar = pVar5.f12552d;
        if (qVar == null) {
            qVar = Y0.q.f22042c;
        }
        Y0.q qVar2 = pVar6.f12552d;
        if (qVar2 == null) {
            qVar2 = Y0.q.f22042c;
        }
        Y0.q qVar3 = new Y0.q(N0.A.c(f10, qVar.f22043a, qVar2.f22043a), N0.A.c(f10, qVar.f22044b, qVar2.f22044b));
        N0.s sVar3 = pVar5.f12553e;
        N0.s sVar4 = pVar6.f12553e;
        if (sVar3 == null && sVar4 == null) {
            sVar = null;
        } else {
            N0.s sVar5 = N0.s.f12563c;
            if (sVar3 == null) {
                sVar3 = sVar5;
            }
            if (sVar4 == null) {
                sVar4 = sVar5;
            }
            boolean z11 = sVar3.f12564a;
            boolean z12 = sVar4.f12564a;
            if (z11 != z12) {
                sVar3 = new N0.s(((Boolean) N0.A.b(f10, Boolean.valueOf(z11), Boolean.valueOf(z12))).booleanValue(), ((C1049h) N0.A.b(f10, new C1049h(sVar3.f12565b), new C1049h(sVar4.f12565b))).f12523a);
            }
            sVar = sVar3;
        }
        N0.E e12 = new N0.E(yVar3, new N0.p(i12, i13, c12, qVar3, sVar, (Y0.g) N0.A.b(f10, pVar5.f12554f, pVar6.f12554f), ((Y0.e) N0.A.b(f10, new Y0.e(pVar5.f12555g), new Y0.e(pVar6.f12555g))).f22020a, ((Y0.d) N0.A.b(f10, new Y0.d(pVar5.f12556h), new Y0.d(pVar6.f12556h))).f22018a, (Y0.r) N0.A.b(f10, pVar5.f12557i, pVar6.f12557i)));
        if (this.f19620i0) {
            e12 = N0.E.a(0, 0, 16777214, this.f19621j0, 0L, 0L, 0L, null, e12, null, null, null);
        }
        X3.b(this.f19618Z, e12, this.f19619h0, abstractC1725n, 0, 0);
        return jf.y.f36177a;
    }
}
