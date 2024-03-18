package bb;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.AbstractC0441z;
import E.C0423g;
import E.C0426j;
import F.AbstractC0539m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1607r1;
import W.AbstractC1646z0;
import W.I2;
import W.Z3;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.m1;
import androidx.compose.foundation.layout.FillElement;
import cb.C2334C;
import cb.C2337F;
import cb.C2350T;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: bb.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2161e extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2161e f25804Z = new C2161e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2161e f25805h0 = new C2161e(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2161e f25806i0 = new C2161e(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25807Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2161e(int i10) {
        super(5);
        this.f25807Y = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x038e, code lost:
        if (id.AbstractC3557B.K(r12.K(), java.lang.Integer.valueOf(r6)) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
        if (id.AbstractC3557B.K(r8.K(), java.lang.Integer.valueOf(r13)) == false) goto L44;
     */
    @Override // wf.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        C2334C c2334c;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        C0581j c0581j;
        int i12;
        boolean z14;
        boolean z15;
        boolean z16;
        C0582k c0582k;
        String str;
        boolean z17;
        wf.k kVar;
        boolean z18;
        boolean z19;
        boolean z20;
        int i13;
        C0581j c0581j2;
        List<H0> list;
        C2350T c2350t;
        boolean z21;
        boolean z22;
        jf.y yVar = jf.y.f36177a;
        E.A a5 = E.A.f3733a;
        C4323o c4323o = C4323o.f37719b;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
        C4318j c4318j = C4310b.f37693Y;
        C4318j c4318j2 = C4310b.f37697j0;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4316h c4316h = C4310b.f37705r0;
        int i14 = 4;
        int i15 = 128;
        int i16 = 16;
        switch (this.f25807Y) {
            case 0:
                E.g0 g0Var = (E.g0) obj;
                C2177q c2177q = (C2177q) obj2;
                wf.k kVar2 = (wf.k) obj3;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
                int intValue = num.intValue();
                AbstractC3557B.c0("paddings", g0Var);
                AbstractC3557B.c0("state", c2177q);
                AbstractC3557B.c0("onIntent", kVar2);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (!((Z.r) abstractC1725n).g(g0Var)) {
                        i14 = 2;
                    }
                    i10 = intValue | i14;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    if (((Z.r) abstractC1725n).g(c2177q)) {
                        i16 = 32;
                    }
                    i10 |= i16;
                }
                if ((intValue & 896) == 0) {
                    if (((Z.r) abstractC1725n).i(kVar2)) {
                        i15 = 256;
                    }
                    i10 |= i15;
                }
                if ((i10 & 5851) == 1170) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                C2337F c2337f = c2177q.f25889b;
                if (c2337f != null) {
                    c2334c = c2337f.f26467a;
                } else {
                    c2334c = null;
                }
                if (c2334c != null) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    rVar2.W(1088912847);
                    AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var);
                    rVar2.W(-483455358);
                    E0.N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar2);
                    rVar2.W(-1323940314);
                    int i17 = rVar2.P;
                    AbstractC1732q0 p10 = rVar2.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k2 = C0583l.f5804b;
                    C3288a i18 = androidx.compose.ui.layout.a.i(q10);
                    if (rVar2.f22696a instanceof AbstractC1707e) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k2);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, a10, C0583l.f5808f);
                        U3.f.n0(rVar2, p10, C0583l.f5807e);
                        C0581j c0581j3 = C0583l.f5809g;
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i17))) {
                            AbstractC6463a.q(i17, rVar2, i17, c0581j3);
                        }
                        AbstractC6463a.t(rVar2, i18, rVar2, 0, 2058660585);
                        AbstractC4326r P = AbstractC0044t0.P(a5, c4323o);
                        rVar2.W(852635077);
                        boolean g10 = rVar2.g(c2334c);
                        int i19 = i10 & 896;
                        if (i19 == 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z23 = g10 | z10;
                        if ((i10 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z24 = z23 | z11;
                        Object K10 = rVar2.K();
                        if (z24 || K10 == iVar) {
                            K10 = new C6.a(c2334c, c2177q, kVar2, 10);
                            rVar2.h0(K10);
                        }
                        rVar2.t(false);
                        AbstractC0539m.a(P, null, null, false, null, null, null, false, (wf.k) K10, rVar2, 0, 254);
                        rVar2.W(852640910);
                        if (i19 == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        Object K11 = rVar2.K();
                        if (z12 || K11 == iVar) {
                            K11 = AbstractC0044t0.t(21, kVar2, rVar2);
                        }
                        rVar2.t(false);
                        Ng.H.a((AbstractC6216a) K11, androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), p9.r.f42841e), false, null, null, null, null, null, null, AbstractC2163f.f25815f, rVar2, 805306368, 508);
                        AbstractC6463a.v(rVar2, false, true, false, false);
                        rVar2.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    rVar3.W(1088919108);
                    AbstractC4326r g11 = androidx.compose.foundation.layout.a.q(c4323o, g0Var).g(androidx.compose.foundation.layout.e.f24739c);
                    rVar3.W(733328855);
                    E0.N c10 = AbstractC0434s.c(c4318j, false, rVar3);
                    rVar3.W(-1323940314);
                    int i20 = rVar3.P;
                    AbstractC1732q0 p11 = rVar3.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k3 = C0583l.f5804b;
                    C3288a i21 = androidx.compose.ui.layout.a.i(g11);
                    if (rVar3.f22696a instanceof AbstractC1707e) {
                        rVar3.Z();
                        if (rVar3.f22695O) {
                            rVar3.o(c0582k3);
                        } else {
                            rVar3.k0();
                        }
                        U3.f.n0(rVar3, c10, C0583l.f5808f);
                        U3.f.n0(rVar3, p11, C0583l.f5807e);
                        C0581j c0581j4 = C0583l.f5809g;
                        if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i20))) {
                            AbstractC6463a.q(i20, rVar3, i20, c0581j4);
                        }
                        AbstractC6463a.t(rVar3, i21, rVar3, 0, 2058660585);
                        I2.b(bVar.a(c4323o, c4318j2), 0L, 0.0f, 0L, 0, rVar3, 0, 30);
                        AbstractC6463a.v(rVar3, false, true, false, false);
                        rVar3.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                return yVar;
            case 1:
                C2152D c2152d = (C2152D) obj2;
                wf.k kVar3 = (wf.k) obj3;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj4;
                int intValue2 = num.intValue();
                AbstractC3557B.c0("$this$ScrollableContentScreen", (AbstractC0441z) obj);
                AbstractC3557B.c0("state", c2152d);
                AbstractC3557B.c0("onIntent", kVar3);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((intValue2 & 112) == 0) {
                    if (((Z.r) abstractC1725n2).g(c2152d)) {
                        i16 = 32;
                    }
                    i11 = intValue2 | i16;
                } else {
                    i11 = intValue2;
                }
                if ((intValue2 & 896) == 0) {
                    if (((Z.r) abstractC1725n2).i(kVar3)) {
                        i15 = 256;
                    }
                    i11 |= i15;
                }
                if ((i11 & 5841) == 1168) {
                    Z.r rVar4 = (Z.r) abstractC1725n2;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar;
                    }
                }
                wd.O o10 = new wd.O(c2152d.f25693a);
                Z.r rVar5 = (Z.r) abstractC1725n2;
                rVar5.W(-377053168);
                int i22 = i11 & 112;
                if (i22 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object K12 = rVar5.K();
                if (z13 || K12 == iVar) {
                    K12 = new C2167h(c2152d, null);
                    rVar5.h0(K12);
                }
                rVar5.t(false);
                AbstractC1734s.e(o10, (wf.n) K12, rVar5);
                C2334C c2334c2 = c2152d.f25694b;
                AbstractC1707e abstractC1707e = rVar5.f22696a;
                if (c2334c2 != null) {
                    rVar5.W(-377053024);
                    AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
                    float f6 = p9.r.f42841e;
                    AbstractC4326r v10 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.a.t(d10, f6, 0.0f, 2), 0.0f, 0.0f, 0.0f, f6, 7);
                    C0426j g12 = AbstractC0429m.g(f6);
                    C4316h c4316h2 = C4310b.f37706s0;
                    rVar5.W(-483455358);
                    E0.N a11 = AbstractC0440y.a(g12, c4316h2, rVar5);
                    rVar5.W(-1323940314);
                    int i23 = rVar5.P;
                    AbstractC1732q0 p12 = rVar5.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k4 = C0583l.f5804b;
                    C3288a i24 = androidx.compose.ui.layout.a.i(v10);
                    boolean z25 = abstractC1707e instanceof AbstractC1707e;
                    if (z25) {
                        rVar5.Z();
                        if (rVar5.f22695O) {
                            rVar5.o(c0582k4);
                        } else {
                            rVar5.k0();
                        }
                        C0581j c0581j5 = C0583l.f5808f;
                        U3.f.n0(rVar5, a11, c0581j5);
                        C0581j c0581j6 = C0583l.f5807e;
                        U3.f.n0(rVar5, p12, c0581j6);
                        C0581j c0581j7 = C0583l.f5809g;
                        if (!rVar5.f22695O) {
                            c0581j = c0581j6;
                            break;
                        } else {
                            c0581j = c0581j6;
                        }
                        AbstractC6463a.q(i23, rVar5, i23, c0581j7);
                        AbstractC6463a.t(rVar5, i24, rVar5, 0, 2058660585);
                        AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                        K8.d.z(c2152d.f25694b, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42835f), null, rVar5, 0, 4);
                        String w10 = Ng.H.w(R.string.gizmo_rating_title, new Object[]{c2334c2.f26439b}, rVar5);
                        m1 m1Var = q4.f20361a;
                        j4.b(w10, a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar5.m(m1Var)).f20306g, rVar5, 0, 0, 65534);
                        Integer num2 = c2152d.f25695c;
                        if (num2 != null) {
                            i12 = num2.intValue();
                        } else {
                            i12 = 0;
                        }
                        rVar5.W(1813520636);
                        int i25 = i11 & 896;
                        if (i25 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        Object K13 = rVar5.K();
                        if (z14 || K13 == iVar) {
                            K13 = new y.Y(27, kVar3);
                            rVar5.h0(K13);
                        }
                        rVar5.t(false);
                        C0581j c0581j8 = c0581j;
                        x8.W.t(a5, i12, (wf.k) K13, a5.a(androidx.compose.foundation.layout.e.p(c4323o, c4318j2), c4316h2), 0, rVar5, 6, 8);
                        androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.j(c4323o, f6), rVar5);
                        rVar5.W(-377051897);
                        if (c2334c2.f26449l) {
                            AbstractC4326r d11 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
                            C0426j g13 = AbstractC0429m.g(p9.r.f42840d);
                            rVar5.W(693286680);
                            E0.N a13 = E.p0.a(g13, C4310b.f37702o0, rVar5);
                            rVar5.W(-1323940314);
                            int i26 = rVar5.P;
                            AbstractC1732q0 p13 = rVar5.p();
                            C3288a i27 = androidx.compose.ui.layout.a.i(d11);
                            if (z25) {
                                rVar5.Z();
                                if (rVar5.f22695O) {
                                    c0582k = c0582k4;
                                    rVar5.o(c0582k);
                                } else {
                                    c0582k = c0582k4;
                                    rVar5.k0();
                                }
                                U3.f.n0(rVar5, a13, c0581j5);
                                U3.f.n0(rVar5, p13, c0581j8);
                                if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i26))) {
                                    AbstractC6463a.q(i26, rVar5, i26, c0581j7);
                                }
                                AbstractC6463a.t(rVar5, i27, rVar5, 0, 2058660585);
                                j4.b(Ng.H.v(R.string.gizmo_rating_add_note, rVar5), io.sentry.compose.b.a("<anonymous>"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar5.m(m1Var)).f20310k, rVar5, 0, 0, 65534);
                                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.lock_key_hole, rVar5), Ng.H.v(R.string.gizmo_rating_add_note_icon_cd, rVar5), androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42830a), 0L, rVar5, 8, 8);
                                AbstractC6463a.v(rVar5, false, true, false, false);
                                String str2 = c2152d.f25697e;
                                if (str2 == null) {
                                    str = "";
                                } else {
                                    str = str2;
                                }
                                G0.X x10 = (G0.X) a12;
                                AbstractC4326r a14 = AbstractC4194d.a(x10, androidx.compose.foundation.layout.e.d(c4323o, 1.0f));
                                rVar5.W(1813521851);
                                if (i25 == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                Object K14 = rVar5.K();
                                if (!z17 && K14 != iVar) {
                                    kVar = kVar3;
                                } else {
                                    kVar = kVar3;
                                    K14 = new y.Y(28, kVar);
                                    rVar5.h0(K14);
                                }
                                rVar5.t(false);
                                Z3.a(str, (wf.k) K14, a14, false, false, null, null, AbstractC2169i.f25833d, null, null, null, null, null, false, null, null, null, false, 5, 3, null, null, null, rVar5, 12583296, 905969664, 0, 7602040);
                                C4317i c4317i = C4310b.f37703p0;
                                AbstractC4326r d12 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
                                rVar5.W(1813522468);
                                if (i25 == 256) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (i22 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                boolean z26 = z19 | z18;
                                Object K15 = rVar5.K();
                                if (z26 || K15 == iVar) {
                                    K15 = new I9.B(kVar, 10, c2152d);
                                    rVar5.h0(K15);
                                }
                                rVar5.t(false);
                                AbstractC4326r a15 = AbstractC4194d.a(x10, androidx.compose.foundation.a.h(d12, (AbstractC6216a) K15));
                                rVar5.W(693286680);
                                E0.N a16 = E.p0.a(AbstractC0429m.f3907a, c4317i, rVar5);
                                rVar5.W(-1323940314);
                                int i28 = rVar5.P;
                                AbstractC1732q0 p14 = rVar5.p();
                                C3288a i29 = androidx.compose.ui.layout.a.i(a15);
                                if (z25) {
                                    rVar5.Z();
                                    if (rVar5.f22695O) {
                                        rVar5.o(c0582k);
                                    } else {
                                        rVar5.k0();
                                    }
                                    U3.f.n0(rVar5, a16, c0581j5);
                                    U3.f.n0(rVar5, p14, c0581j8);
                                    if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i28))) {
                                        AbstractC6463a.q(i28, rVar5, i28, c0581j7);
                                    }
                                    AbstractC6463a.t(rVar5, i29, rVar5, 0, 2058660585);
                                    AbstractC4326r a17 = io.sentry.compose.b.a("<anonymous>");
                                    rVar5.W(1446640883);
                                    if (i25 == 256) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    Object K16 = rVar5.K();
                                    if (z20 || K16 == iVar) {
                                        K16 = new y.Y(29, kVar);
                                        rVar5.h0(K16);
                                    }
                                    rVar5.t(false);
                                    AbstractC1646z0.a(c2152d.f25698f, (wf.k) K16, a17, false, null, null, rVar5, 0, 60);
                                    Object[] objArr = new Object[1];
                                    String str3 = c2152d.f25699g;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    objArr[0] = str3;
                                    j4.b(Ng.H.w(R.string.gizmo_rating_add_note_email, objArr, rVar5), a17, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar5.m(m1Var)).f20310k, rVar5, 0, 0, 65534);
                                    z16 = false;
                                    z15 = true;
                                    AbstractC6463a.v(rVar5, false, true, false, false);
                                } else {
                                    R4.b.r1();
                                    throw null;
                                }
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        } else {
                            z16 = false;
                            z15 = true;
                        }
                        AbstractC6463a.v(rVar5, z16, z16, z15, z16);
                        rVar5.t(z16);
                        rVar5.t(z16);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    rVar5.W(-377049557);
                    FillElement fillElement = androidx.compose.foundation.layout.e.f24739c;
                    rVar5.W(733328855);
                    E0.N c11 = AbstractC0434s.c(c4318j, false, rVar5);
                    rVar5.W(-1323940314);
                    int i30 = rVar5.P;
                    AbstractC1732q0 p15 = rVar5.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k5 = C0583l.f5804b;
                    C3288a i31 = androidx.compose.ui.layout.a.i(fillElement);
                    if (abstractC1707e instanceof AbstractC1707e) {
                        rVar5.Z();
                        if (rVar5.f22695O) {
                            rVar5.o(c0582k5);
                        } else {
                            rVar5.k0();
                        }
                        U3.f.n0(rVar5, c11, C0583l.f5808f);
                        U3.f.n0(rVar5, p15, C0583l.f5807e);
                        C0581j c0581j9 = C0583l.f5809g;
                        if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i30))) {
                            AbstractC6463a.q(i30, rVar5, i30, c0581j9);
                        }
                        AbstractC6463a.t(rVar5, i31, rVar5, 0, 2058660585);
                        I2.b(bVar.a(c4323o, c4318j2), 0L, 0.0f, 0L, 0, rVar5, 0, 30);
                        AbstractC6463a.v(rVar5, false, true, false, false);
                        rVar5.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                return yVar;
            default:
                E.g0 g0Var2 = (E.g0) obj;
                m0 m0Var = (m0) obj2;
                wf.k kVar4 = (wf.k) obj3;
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj4;
                int intValue3 = num.intValue();
                AbstractC3557B.c0("paddings", g0Var2);
                AbstractC3557B.c0("state", m0Var);
                AbstractC3557B.c0("onIntent", kVar4);
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((intValue3 & 14) == 0) {
                    if (!((Z.r) abstractC1725n3).g(g0Var2)) {
                        i14 = 2;
                    }
                    i13 = intValue3 | i14;
                } else {
                    i13 = intValue3;
                }
                if ((intValue3 & 112) == 0) {
                    if (((Z.r) abstractC1725n3).g(m0Var)) {
                        i16 = 32;
                    }
                    i13 |= i16;
                }
                if ((intValue3 & 896) == 0) {
                    if (((Z.r) abstractC1725n3).i(kVar4)) {
                        i15 = 256;
                    }
                    i13 |= i15;
                }
                if ((i13 & 5851) == 1170) {
                    Z.r rVar6 = (Z.r) abstractC1725n3;
                    if (rVar6.B()) {
                        rVar6.P();
                        return yVar;
                    }
                }
                if (m0Var.f25875d != null) {
                    Z.r rVar7 = (Z.r) abstractC1725n3;
                    rVar7.W(-1627071646);
                    L4.a.R(m0Var.f25875d, kVar4, androidx.compose.foundation.layout.a.q(c4323o, g0Var2), rVar7, ((i13 >> 3) & 112) | 8, 0);
                    rVar7.t(false);
                    return yVar;
                }
                Z.r rVar8 = (Z.r) abstractC1725n3;
                rVar8.W(-1627071450);
                AbstractC4326r q11 = androidx.compose.foundation.layout.a.q(c4323o, g0Var2);
                rVar8.W(-483455358);
                C0423g c0423g = AbstractC0429m.f3909c;
                E0.N a18 = AbstractC0440y.a(c0423g, c4316h, rVar8);
                rVar8.W(-1323940314);
                int i32 = rVar8.P;
                AbstractC1732q0 p16 = rVar8.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k6 = C0583l.f5804b;
                C3288a i33 = androidx.compose.ui.layout.a.i(q11);
                boolean z27 = rVar8.f22696a instanceof AbstractC1707e;
                if (z27) {
                    rVar8.Z();
                    if (rVar8.f22695O) {
                        rVar8.o(c0582k6);
                    } else {
                        rVar8.k0();
                    }
                    C0581j c0581j10 = C0583l.f5808f;
                    U3.f.n0(rVar8, a18, c0581j10);
                    C0581j c0581j11 = C0583l.f5807e;
                    U3.f.n0(rVar8, p16, c0581j11);
                    C0581j c0581j12 = C0583l.f5809g;
                    if (!rVar8.f22695O) {
                        c0581j2 = c0581j11;
                        break;
                    } else {
                        c0581j2 = c0581j11;
                    }
                    AbstractC6463a.q(i32, rVar8, i32, c0581j12);
                    AbstractC6463a.t(rVar8, i33, rVar8, 0, 2058660585);
                    AbstractC4326r a19 = io.sentry.compose.b.a("<anonymous>");
                    List list2 = m0Var.f25872a;
                    if (!list2.isEmpty()) {
                        rVar8.W(69211639);
                        list = list2;
                        L4.a.J(m0Var.f25872a, m0Var.f25874c, m0Var.f25873b, kVar4, a19, rVar8, ((i13 << 3) & 7168) | 72, 16);
                        rVar8.t(false);
                    } else {
                        list = list2;
                        rVar8.W(69211945);
                        L4.a.L(a19, rVar8, 0, 1);
                        rVar8.t(false);
                    }
                    H0 h02 = m0Var.f25876e;
                    if (h02 != null) {
                        c2350t = h02.f25722c;
                    } else {
                        c2350t = null;
                    }
                    if (c2350t != null) {
                        rVar8.W(69212134);
                        L4.a.H(c2350t, AbstractC3557B.K(h02, m0Var.f25874c), h02.f25721b instanceof wd.m0, kVar4, rVar8, (i13 << 3) & 7168, 0);
                        rVar8.t(false);
                        z22 = false;
                        z21 = true;
                    } else {
                        rVar8.W(69212523);
                        AbstractC4326r n10 = androidx.compose.foundation.a.n(c4323o, androidx.compose.foundation.a.l(rVar8));
                        rVar8.W(-483455358);
                        E0.N a20 = AbstractC0440y.a(c0423g, c4316h, rVar8);
                        rVar8.W(-1323940314);
                        int i34 = rVar8.P;
                        AbstractC1732q0 p17 = rVar8.p();
                        C3288a i35 = androidx.compose.ui.layout.a.i(n10);
                        if (z27) {
                            rVar8.Z();
                            if (rVar8.f22695O) {
                                rVar8.o(c0582k6);
                            } else {
                                rVar8.k0();
                            }
                            U3.f.n0(rVar8, a20, c0581j10);
                            U3.f.n0(rVar8, p17, c0581j2);
                            if (rVar8.f22695O || !AbstractC3557B.K(rVar8.K(), Integer.valueOf(i34))) {
                                AbstractC6463a.q(i34, rVar8, i34, c0581j12);
                            }
                            AbstractC6463a.t(rVar8, i35, rVar8, 0, 2058660585);
                            AbstractC4326r a21 = io.sentry.compose.b.a("<anonymous>");
                            if (!list.isEmpty()) {
                                rVar8.W(-2079217109);
                                for (H0 h03 : list) {
                                    L4.a.I(h03, kVar4, rVar8, ((i13 >> 3) & 112) | 8);
                                }
                                z22 = false;
                                rVar8.t(false);
                                z21 = true;
                            } else {
                                z22 = false;
                                rVar8.W(-2079216727);
                                L4.a.O(rVar8, 0);
                                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42840d), rVar8);
                                z21 = true;
                                L4.a.G(a5, a21, rVar8, 6, 1);
                                rVar8.t(false);
                            }
                            AbstractC6463a.v(rVar8, z22, z21, z22, z22);
                            rVar8.t(z22);
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    }
                    AbstractC6463a.v(rVar8, z22, z21, z22, z22);
                    rVar8.t(z22);
                    return yVar;
                }
                R4.b.r1();
                throw null;
        }
    }
}
