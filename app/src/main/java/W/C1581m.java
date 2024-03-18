package W;

import E.AbstractC0429m;
import E.AbstractC0434s;
import E.C0424h;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import android.os.Build;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: W.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1581m extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20218Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f20219Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f20220h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1581m(Object obj, int i10, Object obj2) {
        super(2);
        this.f20218Y = i10;
        this.f20219Z = obj;
        this.f20220h0 = obj2;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4318j c4318j = C4310b.f37693Y;
        AbstractC4326r abstractC4326r = C4323o.f37719b;
        int i11 = this.f20218Y;
        Object obj = this.f20220h0;
        Object obj2 = this.f20219Z;
        switch (i11) {
            case 1:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                String w10 = kotlin.jvm.internal.m.w(R.string.m3c_dialog, abstractC1725n);
                AbstractC4326r l10 = androidx.compose.foundation.layout.e.l((AbstractC4326r) obj2, AbstractC1556h.f20102a, 0.0f, AbstractC1556h.f20103b, 0.0f, 10);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-874813489);
                boolean g10 = rVar2.g(w10);
                Object K10 = rVar2.K();
                if (g10 || K10 == C1723m.f22654Y) {
                    K10 = new G(w10, 0);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC4326r g11 = l10.g(L0.l.a(abstractC4326r, false, (wf.k) K10));
                wf.n nVar = (wf.n) obj;
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(c4318j, true, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(g11);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, c10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i13, rVar2, 0, 2058660585);
                    nVar.invoke(rVar2, 0);
                    rVar2.t(false);
                    rVar2.t(true);
                    rVar2.t(false);
                    rVar2.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 2:
                if ((i10 & 3) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                ((wf.o) obj2).invoke((E.q0) obj, abstractC1725n, 0);
                return;
            case 3:
                if ((i10 & 3) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.a(abstractC4326r, AbstractC1577l0.f20205c, AbstractC1577l0.f20206d), (E.g0) obj2);
                C0424h c0424h = AbstractC0429m.f3911e;
                C4317i c4317i = C4310b.f37703p0;
                wf.o oVar = (wf.o) obj;
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(693286680);
                E0.N a5 = E.p0.a(c0424h, c4317i, rVar5);
                rVar5.W(-1323940314);
                int i14 = rVar5.P;
                AbstractC1732q0 p11 = rVar5.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(q10);
                if (rVar5.f22696a instanceof AbstractC1707e) {
                    rVar5.Z();
                    if (rVar5.f22695O) {
                        rVar5.o(c0582k2);
                    } else {
                        rVar5.k0();
                    }
                    U3.f.n0(rVar5, a5, C0583l.f5808f);
                    U3.f.n0(rVar5, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar5, i14, c0581j2);
                    }
                    AbstractC6463a.t(rVar5, i15, rVar5, 0, 2058660585);
                    oVar.invoke(E.r0.f3944a, rVar5, 6);
                    rVar5.t(false);
                    AbstractC6463a.u(rVar5, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 4:
                if ((i10 & 3) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                j4.a(((p4) obj2).f20309j, (wf.n) obj, abstractC1725n, 0);
                return;
            case 5:
                if ((i10 & 3) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                AbstractC4326r a10 = E.D0.a(L0.l.a(abstractC4326r, false, S.f19629n0), (E.A0) obj2);
                if (Build.VERSION.SDK_INT >= 33) {
                    abstractC4326r = androidx.compose.foundation.layout.a.n(abstractC4326r);
                }
                AbstractC4326r g12 = a10.g(abstractC4326r);
                Z.l1 l1Var = (Z.l1) obj;
                Z.r rVar8 = (Z.r) abstractC1725n;
                rVar8.W(733328855);
                E0.N c11 = AbstractC0434s.c(c4318j, false, rVar8);
                rVar8.W(-1323940314);
                int i16 = rVar8.P;
                AbstractC1732q0 p12 = rVar8.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k3 = C0583l.f5804b;
                C3288a i17 = androidx.compose.ui.layout.a.i(g12);
                if (rVar8.f22696a instanceof AbstractC1707e) {
                    rVar8.Z();
                    if (rVar8.f22695O) {
                        rVar8.o(c0582k3);
                    } else {
                        rVar8.k0();
                    }
                    U3.f.n0(rVar8, c11, C0583l.f5808f);
                    U3.f.n0(rVar8, p12, C0583l.f5807e);
                    C0581j c0581j3 = C0583l.f5809g;
                    if (rVar8.f22695O || !AbstractC3557B.K(rVar8.K(), Integer.valueOf(i16))) {
                        AbstractC6463a.q(i16, rVar8, i16, c0581j3);
                    }
                    AbstractC6463a.t(rVar8, i17, rVar8, 0, 2058660585);
                    ((wf.n) l1Var.getValue()).invoke(rVar8, 0);
                    rVar8.t(false);
                    rVar8.t(true);
                    rVar8.t(false);
                    rVar8.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                C1585m3 c1585m3 = (C1585m3) obj;
                AbstractC3557B.Z(c1585m3);
                ((wf.o) obj2).invoke(c1585m3, abstractC1725n, 0);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20218Y) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                C c10 = ((C1645z) this.f20219Z).f20634a;
                c10.f19000i.i(floatValue);
                c10.f19001j.i(floatValue2);
                ((kotlin.jvm.internal.y) this.f20220h0).f37646Y = floatValue;
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
