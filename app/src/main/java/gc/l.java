package gc;

import A.AbstractC0044t0;
import E.AbstractC0434s;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import I9.B;
import L0.u;
import Mf.AbstractC0993b;
import Mf.AbstractC1003l;
import N0.C1046e;
import W.I2;
import W.M3;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import android.content.Context;
import com.openai.voice.assistant.AssistantActivity;
import db.C2615c;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.Locale;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import lc.C4393Q;
import m.AbstractActivityC4532l;
import nc.AbstractC4811c;
import nf.AbstractC4828h;
import oh.C5022i;
import r9.y;
import ud.AbstractC5903b;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31564Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f31565Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f31566h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, int i10, Object obj2) {
        super(2);
        this.f31564Y = i10;
        this.f31565Z = obj;
        this.f31566h0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [Z.n, Z.r] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        String str;
        Object obj = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f31564Y;
        Object obj2 = this.f31566h0;
        Object obj3 = this.f31565Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ExperimentOverrideScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C3251c c3251c = (C3251c) obj3;
                M3.a(c3251c.f31551b, new k((p) obj2, c3251c), a5, null, false, null, null, abstractC1725n, 0, 124);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("SettingsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                zd.n nVar = ((C4393Q) obj3).f38123l;
                if (nVar != null) {
                    z10 = nVar.f51993l;
                } else {
                    z10 = false;
                }
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-908412288);
                wf.k kVar = (wf.k) obj2;
                boolean g10 = rVar3.g(kVar);
                Object K10 = rVar3.K();
                if (g10 || K10 == obj) {
                    K10 = AbstractC0044t0.v(24, kVar, rVar3);
                }
                rVar3.t(false);
                M3.a(z10, K10, a10, null, false, null, null, rVar3, 0, 124);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                nc.s sVar = (nc.s) obj3;
                String str2 = sVar.f40257i;
                if (sVar.f40256h && str2 != null) {
                    ?? r42 = (Z.r) abstractC1725n;
                    r42.W(-408086652);
                    r42.W(-408086631);
                    wf.k kVar2 = (wf.k) obj2;
                    boolean g11 = r42.g(kVar2) | r42.g(str2);
                    Object K11 = r42.K();
                    if (g11 || K11 == obj) {
                        K11 = new C2615c(kVar2, str2, 7);
                        r42.h0(K11);
                    }
                    r42.t(false);
                    R4.b.o((AbstractC6216a) K11, a11, false, null, null, AbstractC4811c.f40210c, r42, 196608, 30);
                    r42.t(false);
                    return;
                }
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(-408086142);
                Ad.l.v(sVar.f40255g, sVar.f40250b, (wf.k) obj2, rVar5, 0);
                rVar5.t(false);
                return;
            case 3:
                AbstractC4326r a12 = io.sentry.compose.b.a("ViewSharedConversationScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                R4.b.o(new B((Tc.f) obj3, 28, (AbstractActivityC4532l) obj2), a12, false, null, null, nc.d.f40218b, abstractC1725n, 196608, 30);
                return;
            case 4:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                ((Hc.c) obj3).f((Context) obj2, abstractC1725n, 8);
                return;
            case 5:
                AbstractC4326r a13 = io.sentry.compose.b.a("CodeBlock");
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                String str3 = (String) obj3;
                if (str3.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String valueOf = String.valueOf(str3.charAt(0));
                    AbstractC3557B.a0("null cannot be cast to non-null type java.lang.String", valueOf);
                    String upperCase = valueOf.toUpperCase(Locale.ROOT);
                    AbstractC3557B.b0("toUpperCase(...)", upperCase);
                    sb2.append((Object) upperCase);
                    String substring = str3.substring(1);
                    AbstractC3557B.b0("substring(...)", substring);
                    sb2.append(substring);
                    str = sb2.toString();
                } else {
                    str = str3;
                }
                j4.b(str, a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                AbstractC5903b.b((C1046e) obj2, abstractC1725n, 0);
                return;
            default:
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                if (((pd.s) AbstractC4828h.z(((pd.g) obj3).f808e, abstractC1725n).getValue()) instanceof pd.o) {
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    rVar10.W(691888347);
                    rVar10.W(691888402);
                    AssistantActivity assistantActivity = (AssistantActivity) obj2;
                    boolean g12 = rVar10.g(assistantActivity);
                    Object K12 = rVar10.K();
                    if (g12 || K12 == obj) {
                        K12 = new zc.u(4, assistantActivity);
                        rVar10.h0(K12);
                    }
                    rVar10.t(false);
                    y.C((AbstractC6216a) K12, null, rVar10, 0, 2);
                    rVar10.t(false);
                    return;
                }
                Z.r rVar11 = (Z.r) abstractC1725n;
                rVar11.W(691888475);
                rVar11.W(733328855);
                N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar11);
                rVar11.W(-1323940314);
                int i12 = rVar11.P;
                AbstractC1732q0 p10 = rVar11.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar11.f22696a instanceof AbstractC1707e) {
                    rVar11.Z();
                    if (rVar11.f22695O) {
                        rVar11.o(c0582k);
                    } else {
                        rVar11.k0();
                    }
                    U3.f.n0(rVar11, c10, C0583l.f5808f);
                    U3.f.n0(rVar11, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar11.f22695O || !AbstractC3557B.K(rVar11.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar11, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new L0(rVar11), rVar11, 2058660585);
                    I2.b(androidx.compose.foundation.layout.b.f24731a.a(c4323o, C4310b.f37697j0), 0L, 0.0f, 0L, 0, rVar11, 0, 30);
                    AbstractC6463a.v(rVar11, false, true, false, false);
                    rVar11.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f31564Y;
        Object obj3 = this.f31566h0;
        Object obj4 = this.f31565Z;
        switch (i10) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
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
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                AbstractC1003l abstractC1003l = (AbstractC1003l) obj2;
                if (AbstractC3557B.K((AbstractC1003l) obj, (AbstractC0993b) obj4) && AbstractC3557B.K(abstractC1003l, (AbstractC0993b) obj3)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                B0.u uVar = (B0.u) obj;
                float floatValue = ((Number) obj2).floatValue();
                AbstractC3557B.c0("change", uVar);
                ((wf.k) obj4).invoke(new C5022i(((B0.u) obj3).f1672c, com.google.android.gms.internal.play_billing.N.o((floatValue * 0.004f) + 1.0f, 0.1f, 2.0f)));
                uVar.a();
                return yVar;
        }
    }
}
