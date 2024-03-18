package ub;

import Cd.AbstractC0324i;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.AbstractC0441z;
import E.C0426j;
import E.g0;
import E.p0;
import E0.N;
import F.AbstractC0528b;
import F.AbstractC0539m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import Ng.H;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.m1;
import aa.C1939b;
import aa.EnumC1938a;
import com.openai.chatgpt.R;
import h0.C3288a;
import ha.K;
import ha.M;
import ha.P;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46560Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1939b f46561Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f46562h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f46563i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(C1939b c1939b, wf.k kVar, wf.k kVar2, int i10) {
        super(3);
        this.f46560Y = i10;
        this.f46561Z = c1939b;
        this.f46562h0 = kVar;
        this.f46563i0 = kVar2;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar;
        String str;
        String str2;
        String str3;
        io.sentry.hints.i iVar;
        boolean z10;
        int i10;
        String w10;
        int i11;
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        jf.y yVar2 = jf.y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        int i12 = this.f46560Y;
        wf.k kVar = this.f46563i0;
        wf.k kVar2 = this.f46562h0;
        C1939b c1939b = this.f46561Z;
        switch (i12) {
            case 0:
                g0 g0Var = (g0) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("paddingValues", g0Var);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(g0Var)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    intValue |= i11;
                }
                if ((intValue & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar2;
                    }
                }
                AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.n(c4323o, androidx.compose.foundation.a.l(abstractC1725n)), g0Var), p9.r.f42841e, 0.0f, 2);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-483455358);
                N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
                rVar2.W(-1323940314);
                int i13 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(t10);
                boolean z11 = rVar2.f22696a instanceof AbstractC1707e;
                if (z11) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a5, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                        AbstractC6463a.q(i13, rVar2, i13, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i14, rVar2, 0, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("CustomActionUserDetailsDialog");
                    String v10 = H.v(R.string.tool_function_action_dialog_title, rVar2);
                    m1 m1Var = q4.f20361a;
                    N0.E e10 = ((p4) rVar2.m(m1Var)).f20306g;
                    float f6 = p9.r.f42840d;
                    X x10 = (X) a10;
                    j4.b(v10, AbstractC4194d.a(x10, androidx.compose.foundation.layout.a.t(c4323o, 0.0f, f6, 1)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, e10, rVar2, 0, 0, 65532);
                    String str4 = c1939b.f24021a.f32018b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    EnumC1938a enumC1938a = c1939b.f24023c;
                    int ordinal = enumC1938a.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                str = "";
                                rVar2.W(1622177108);
                                yVar = yVar2;
                                w10 = H.w(R.string.tool_function_action_dialog_description_declined, new Object[]{str4}, rVar2);
                                rVar2.t(false);
                            } else if (ordinal == 3) {
                                rVar2.W(1622176775);
                                str = "";
                                String w11 = H.w(R.string.tool_function_action_dialog_description_in_progress, new Object[]{str4}, rVar2);
                                rVar2.t(false);
                                str2 = w11;
                                yVar = yVar2;
                            } else {
                                rVar2.W(1622166872);
                                rVar2.t(false);
                                throw new RuntimeException();
                            }
                        } else {
                            yVar = yVar2;
                            str = "";
                            rVar2.W(1622176943);
                            w10 = H.w(R.string.tool_function_action_dialog_description_success, new Object[]{str4}, rVar2);
                            rVar2.t(false);
                        }
                        str2 = w10;
                    } else {
                        yVar = yVar2;
                        str = "";
                        rVar2.W(-1252112833);
                        rVar2.t(false);
                        str2 = str;
                    }
                    j4.b(str2, AbstractC4194d.a(x10, androidx.compose.foundation.layout.a.t(c4323o, 0.0f, f6, 1)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(m1Var)).f20310k, rVar2, 0, 0, 65532);
                    Object[] objArr = new Object[1];
                    M m10 = c1939b.f24021a;
                    String str5 = m10.f32020d;
                    if (str5 == null) {
                        str3 = str;
                    } else {
                        str3 = str5;
                    }
                    objArr[0] = str3;
                    j4.b(H.w(R.string.tool_function_action_dialog_action_name, objArr, rVar2), AbstractC4194d.a(x10, androidx.compose.foundation.layout.a.t(c4323o, 0.0f, f6, 1)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(m1Var)).f20310k, rVar2, 0, 0, 65532);
                    rVar2.W(1622177902);
                    for (Map.Entry entry : m10.f32022f.entrySet()) {
                        j4.b(android.gov.nist.core.a.j((String) entry.getKey(), ": ", (String) entry.getValue()), androidx.compose.foundation.layout.a.s(c4323o, p9.r.f42841e, p9.r.f42839c), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20310k, rVar2, 0, 0, 65532);
                    }
                    rVar2.t(false);
                    rVar2.W(1622178234);
                    List<P> list = m10.f32021e;
                    boolean z12 = !list.isEmpty();
                    wf.k kVar3 = this.f46562h0;
                    if (z12) {
                        float f10 = p9.r.f42840d;
                        androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.a.t(c4323o, 0.0f, f10, 1), rVar2);
                        AbstractC4326r k10 = androidx.compose.foundation.a.k(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), androidx.compose.foundation.a.l(rVar2));
                        C0426j g10 = AbstractC0429m.g(f10);
                        rVar2.W(693286680);
                        N a11 = p0.a(g10, C4310b.f37702o0, rVar2);
                        rVar2.W(-1323940314);
                        int i15 = rVar2.P;
                        AbstractC1732q0 p11 = rVar2.p();
                        AbstractC0584m.f5811i.getClass();
                        iVar = iVar2;
                        C0582k c0582k2 = C0583l.f5804b;
                        C3288a i16 = androidx.compose.ui.layout.a.i(k10);
                        if (z11) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k2);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, a11, C0583l.f5808f);
                            U3.f.n0(rVar2, p11, C0583l.f5807e);
                            C0581j c0581j2 = C0583l.f5809g;
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i15))) {
                                AbstractC6463a.q(i15, rVar2, i15, c0581j2);
                            }
                            AbstractC6463a.t(rVar2, i16, rVar2, 0, 2058660585);
                            L0.u uVar2 = io.sentry.compose.b.f34309a;
                            rVar2.W(1622178692);
                            for (P p12 : list) {
                                String str6 = p12.f32028c;
                                if (str6 != null && Lg.n.I2(str6, "image/", false)) {
                                    rVar2.W(1224940490);
                                    k.f(p12, kVar3, null, rVar2, 0, 4);
                                    rVar2.t(false);
                                } else {
                                    rVar2.W(1224940562);
                                    k.e(p12, null, rVar2, 0, 2);
                                    rVar2.t(false);
                                }
                            }
                            i10 = 1;
                            z10 = false;
                            AbstractC6463a.v(rVar2, false, false, true, false);
                            rVar2.t(false);
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    } else {
                        iVar = iVar2;
                        i10 = 1;
                        z10 = false;
                    }
                    rVar2.t(z10);
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.a.t(c4323o, 0.0f, p9.r.f42840d, i10), rVar2);
                    rVar2.W(1622179106);
                    if (enumC1938a == EnumC1938a.f24019i0) {
                        for (K k11 : m10.f32023g) {
                            k.a(k11, this.f46563i0, c1939b, androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), p9.r.f42841e, 0.0f, 2), rVar2, 8, 0);
                            kVar3 = kVar3;
                            c1939b = c1939b;
                        }
                    }
                    wf.k kVar4 = kVar3;
                    C1939b c1939b2 = c1939b;
                    rVar2.t(false);
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.a.t(c4323o, 0.0f, p9.r.f42840d, 1), rVar2);
                    AbstractC4326r a12 = AbstractC4194d.a(x10, androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), p9.r.f42841e, 0.0f, 2));
                    rVar2.W(1622179942);
                    boolean g11 = rVar2.g(kVar4) | rVar2.g(c1939b2);
                    Object K10 = rVar2.K();
                    if (g11 || K10 == iVar) {
                        K10 = new I9.B(kVar4, 15, c1939b2);
                        rVar2.h0(K10);
                    }
                    rVar2.t(false);
                    H.d((AbstractC6216a) K10, a12, false, null, null, null, null, null, null, AbstractC5880d.f46547d, rVar2, 805306368, 508);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
            case 1:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$item", (AbstractC0528b) obj);
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((intValue2 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n2;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar2;
                    }
                }
                AbstractC0324i.a(R4.b.X(abstractC1725n2, -1056038297, new N.D(c1939b, kVar2, kVar, 25)), abstractC1725n2, 6);
                return yVar2;
            default:
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj2;
                int intValue3 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BottomSheet", (AbstractC0441z) obj);
                AbstractC4326r a13 = io.sentry.compose.b.a("VoiceActionsBottomSheet");
                if ((intValue3 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n3;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar2;
                    }
                }
                Z.r rVar5 = (Z.r) abstractC1725n3;
                rVar5.W(1434752679);
                boolean g12 = rVar5.g(c1939b) | rVar5.g(kVar2) | rVar5.g(kVar);
                Object K11 = rVar5.K();
                if (g12 || K11 == iVar2) {
                    K11 = new C6.a(c1939b, kVar2, kVar, 22);
                    rVar5.h0(K11);
                }
                rVar5.t(false);
                AbstractC0539m.a(a13, null, null, false, null, null, null, false, (wf.k) K11, rVar5, 0, 255);
                return yVar2;
        }
    }
}
