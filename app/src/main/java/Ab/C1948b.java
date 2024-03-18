package ab;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E.g0;
import E0.N;
import F.AbstractC0539m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Ng.H;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import cb.C2332A;
import cb.C2334C;
import cb.C2378s;
import cb.C2379t;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: ab.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1948b extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1948b f24075Z = new C1948b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1948b f24076h0 = new C1948b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24077Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1948b(int i10) {
        super(5);
        this.f24077Y = i10;
    }

    public final void a(g0 g0Var, C1965s c1965s, wf.k kVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        String str;
        Z.r rVar;
        List<Wa.m> list;
        C2379t c2379t;
        List list2;
        Object obj;
        String str2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        int i18;
        C4323o c4323o = C4323o.f37719b;
        boolean z11 = true;
        switch (this.f24077Y) {
            case 0:
                AbstractC3557B.c0("paddings", g0Var);
                AbstractC3557B.c0("state", c1965s);
                AbstractC3557B.c0("onIntent", kVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(g0Var)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i11 = i10 | i14;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    if (((Z.r) abstractC1725n).g(c1965s)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                if ((i10 & 896) == 0) {
                    if (((Z.r) abstractC1725n).i(kVar)) {
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i11 |= i12;
                }
                int i19 = i11;
                if ((i19 & 5851) == 1170) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var);
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-483455358);
                N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar3);
                rVar3.W(-1323940314);
                int i20 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i21 = androidx.compose.ui.layout.a.i(q10);
                if (rVar3.f22696a instanceof AbstractC1707e) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(c0582k);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, a5, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i20))) {
                        AbstractC6463a.q(i20, rVar3, i20, c0581j);
                    }
                    AbstractC6463a.r(0, i21, new L0(rVar3), rVar3, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                    Object[] objArr = new Object[1];
                    C2334C c2334c = c1965s.f24126c;
                    if (c2334c != null) {
                        str = c2334c.f26439b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    j4.b(H.w(R.string.gizmos_accounts_description, objArr, rVar3), androidx.compose.foundation.layout.a.s(c4323o, p9.r.f42841e, p9.r.f42840d), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 131068);
                    Bi.c.o(H.v(R.string.gizmos_accounts_section_header, rVar3), a10, 0L, rVar3, 0, 6);
                    if (c1965s.f24124a) {
                        rVar3.W(-1265082037);
                        Ad.l.C(a10, rVar3, 0, 1);
                        rVar3.t(false);
                        rVar = rVar3;
                    } else {
                        rVar3.W(-1265081952);
                        Wa.j jVar = c1965s.f24127d;
                        if (jVar != null) {
                            list = jVar.f20853a;
                        } else {
                            list = null;
                        }
                        if (list != null) {
                            for (Wa.m mVar : list) {
                                if (c2334c != null && (list2 = c2334c.f26459v) != null) {
                                    Iterator it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            C2332A c2332a = ((C2379t) obj).f26551c;
                                            if (c2332a != null) {
                                                str2 = c2332a.f26424a;
                                            } else {
                                                str2 = null;
                                            }
                                            if (AbstractC3557B.K(str2, mVar.f20857a)) {
                                            }
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    c2379t = (C2379t) obj;
                                } else {
                                    c2379t = null;
                                }
                                boolean contains = c1965s.f24125b.contains(mVar.f20857a);
                                C2378s c2378s = C2379t.Companion;
                                Ad.l.B(contains, mVar, c2379t, kVar, null, rVar3, (i19 << 3) & 7168, 16);
                                rVar3 = rVar3;
                                c2334c = c2334c;
                            }
                        }
                        rVar = rVar3;
                        rVar.t(false);
                    }
                    AbstractC6463a.v(rVar, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC3557B.c0("paddings", g0Var);
                AbstractC3557B.c0("state", c1965s);
                AbstractC3557B.c0("onIntent", kVar);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(g0Var)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i15 = i10 | i18;
                } else {
                    i15 = i10;
                }
                if ((i10 & 112) == 0) {
                    if (((Z.r) abstractC1725n).g(c1965s)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i15 |= i17;
                }
                if ((i10 & 896) == 0) {
                    if (((Z.r) abstractC1725n).i(kVar)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i15 |= i16;
                }
                if ((i15 & 5851) == 1170) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC4326r q11 = androidx.compose.foundation.layout.a.q(c4323o, g0Var);
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(-1749032115);
                if ((i15 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i15 & 896) != 256) {
                    z11 = false;
                }
                boolean z12 = z10 | z11;
                Object K10 = rVar5.K();
                if (z12 || K10 == C1723m.f22654Y) {
                    K10 = new Ra.l(c1965s, 2, kVar);
                    rVar5.h0(K10);
                }
                rVar5.t(false);
                AbstractC0539m.a(q11, null, null, false, null, null, null, false, (wf.k) K10, rVar5, 0, 254);
                return;
        }
    }

    @Override // wf.q
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f24077Y) {
            case 0:
                a((g0) obj, (C1965s) obj2, (wf.k) obj3, (AbstractC1725n) obj4, num.intValue());
                return yVar;
            default:
                a((g0) obj, (C1965s) obj2, (wf.k) obj3, (AbstractC1725n) obj4, num.intValue());
                return yVar;
        }
    }
}
