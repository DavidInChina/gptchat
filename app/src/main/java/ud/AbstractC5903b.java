package ud;

import A.AbstractC0044t0;
import Df.H;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.C0421f;
import E.C0424h;
import E.C0426j;
import E.C0439x;
import E.p0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import H0.AbstractC0696o0;
import H0.AbstractC0701r0;
import H0.E0;
import H0.Z;
import N0.C1044c;
import N0.C1046e;
import N0.E;
import N0.y;
import S0.s;
import W.AbstractC1530b3;
import W.C1525a3;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.O;
import Z.l1;
import Z.m1;
import Z.o1;
import Z.r;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import n0.C4707f;
import nf.AbstractC4828h;
import p9.q;
import r0.C5347k;
import r0.F;
import r0.G;
import u0.AbstractC5824b;
import y.AbstractC6463a;
import z.AbstractC6704j;
import z.C6675O;

/* renamed from: ud.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5903b {

    /* renamed from: a  reason: collision with root package name */
    public static final long f46680a = androidx.compose.ui.graphics.a.c(4280295715L);

    /* renamed from: b  reason: collision with root package name */
    public static final long f46681b = androidx.compose.ui.graphics.a.c(4292467171L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0224  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, boolean z10, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        r rVar;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        int i13;
        AbstractC4326r abstractC4326r5;
        boolean z11;
        Object obj;
        h hVar;
        long j6;
        boolean z12;
        boolean z13;
        Object K10;
        long j10;
        boolean z14;
        C0581j c0581j;
        r0.r rVar2;
        List list;
        C1046e i14;
        long j11;
        boolean z15;
        boolean z16;
        Object obj2;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC3557B.c0("language", str);
        AbstractC3557B.c0("code", str2);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("CodeBlock");
        r rVar3 = (r) abstractC1725n;
        rVar3.X(-1699239227);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar3.g(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar3.g(str2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar3.h(z10)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        try {
            if (i19 != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                abstractC4326r2 = abstractC4326r;
                if (rVar3.g(abstractC4326r2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
                if ((i12 & 5851) != 1170 && rVar3.B()) {
                    rVar3.P();
                    abstractC4326r3 = abstractC4326r2;
                    rVar = rVar3;
                } else {
                    if (i19 == 0) {
                        abstractC4326r4 = a5;
                    } else {
                        abstractC4326r4 = abstractC4326r2;
                    }
                    rVar3.W(-1896896390);
                    Object obj3 = C1723m.f22654Y;
                    Throwable th2 = null;
                    if (!z10) {
                        int i20 = (i12 & 14) | (i12 & 112);
                        rVar3.W(1232041189);
                        if (((Boolean) rVar3.m(E0.f6720a)).booleanValue()) {
                            rVar3.t(false);
                            i13 = i12;
                            hVar = null;
                            obj = obj3;
                            abstractC4326r5 = abstractC4326r4;
                            rVar = rVar3;
                            z11 = false;
                        } else {
                            rVar3.W(-208531230);
                            if ((((i20 & 14) ^ 6) > 4 && rVar3.g(str)) || (i20 & 6) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((((i20 & 112) ^ 48) > 32 && rVar3.g(str2)) || (i20 & 48) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            boolean z17 = z16 | z15;
                            Object K11 = rVar3.K();
                            o1 o1Var = o1.f22665a;
                            if (z17 || K11 == obj3) {
                                K11 = AbstractC4828h.Z(null, o1Var);
                                rVar3.h0(K11);
                            }
                            AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K11;
                            Object w10 = AbstractC0044t0.w(rVar3, false, -208531160);
                            if (w10 == obj3) {
                                w10 = AbstractC4828h.Z(Boolean.FALSE, o1Var);
                                rVar3.h0(w10);
                            }
                            AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) w10;
                            rVar3.t(false);
                            Context context = (Context) rVar3.m(Z.f6888b);
                            rVar3.W(-208531054);
                            Object K12 = rVar3.K();
                            if (K12 == obj3) {
                                K12 = AbstractC4828h.Z(null, o1Var);
                                rVar3.h0(K12);
                            }
                            AbstractC1710f0 abstractC1710f03 = (AbstractC1710f0) K12;
                            Object w11 = AbstractC0044t0.w(rVar3, false, -208530984);
                            if (w11 == obj3) {
                                w11 = AbstractC4828h.Z(null, o1Var);
                                rVar3.h0(w11);
                            }
                            AbstractC1710f0 abstractC1710f04 = (AbstractC1710f0) w11;
                            rVar3.t(false);
                            rVar3.W(-208530932);
                            boolean g10 = rVar3.g(context);
                            Object K13 = rVar3.K();
                            if (!g10 && K13 != obj3) {
                                i13 = i12;
                                obj2 = obj3;
                            } else {
                                long currentTimeMillis = System.currentTimeMillis();
                                i13 = i12;
                                WebView webView = new WebView(context);
                                WebSettings settings = webView.getSettings();
                                obj2 = obj3;
                                settings.setJavaScriptEnabled(true);
                                settings.setBlockNetworkLoads(true);
                                settings.setBlockNetworkImage(true);
                                webView.setWebViewClient(new n(currentTimeMillis, abstractC1710f03, abstractC1710f02));
                                webView.loadUrl("file:///android_asset/syntax_highlighting.html");
                                rVar3.h0(webView);
                                K13 = webView;
                            }
                            WebView webView2 = (WebView) K13;
                            rVar3.t(false);
                            Boolean bool = (Boolean) abstractC1710f02.getValue();
                            bool.booleanValue();
                            abstractC4326r5 = abstractC4326r4;
                            rVar = rVar3;
                            AbstractC1734s.f(new Object[]{bool, webView2, str, str2}, new l(str2, webView2, str, abstractC1710f02, abstractC1710f04, abstractC1710f0, null), rVar);
                            Long l10 = (Long) abstractC1710f03.getValue();
                            Long l11 = (Long) abstractC1710f04.getValue();
                            rVar.W(-208528589);
                            Object K14 = rVar.K();
                            obj = obj2;
                            if (K14 == obj) {
                                th2 = null;
                                K14 = new m(abstractC1710f03, abstractC1710f04, null);
                                rVar.h0(K14);
                            } else {
                                th2 = null;
                            }
                            z11 = false;
                            rVar.t(false);
                            AbstractC1734s.d(l10, l11, (wf.n) K14, rVar);
                            hVar = (h) abstractC1710f0.getValue();
                            rVar.t(false);
                        }
                    } else {
                        i13 = i12;
                        obj = obj3;
                        abstractC4326r5 = abstractC4326r4;
                        rVar = rVar3;
                        z11 = false;
                        hVar = null;
                    }
                    rVar.t(z11);
                    int i21 = j.f46697b;
                    rVar.W(-285084666);
                    j6 = j.f46696a;
                    rVar.W(195652253);
                    boolean g11 = rVar.g(hVar);
                    if ((((i13 & 112) ^ 48) <= 32 && rVar.g(str2)) || (i13 & 48) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = g11 | z12;
                    K10 = rVar.K();
                    if (!z13 || K10 == obj) {
                        if (hVar == null) {
                            list = hVar.f46693c;
                        } else {
                            list = th2;
                        }
                        if (list == 0 && !list.isEmpty()) {
                            C1044c c1044c = new C1044c();
                            r0.r rVar4 = hVar.f46692b;
                            if (rVar4 != null) {
                                j11 = rVar4.f44265a;
                            } else {
                                j11 = j6;
                            }
                            int h10 = c1044c.h(new y(j11, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            try {
                                for (g gVar : list) {
                                    j.a(c1044c, gVar);
                                }
                                c1044c.e(h10);
                                i14 = c1044c.i();
                            } finally {
                            }
                        } else {
                            C1044c c1044c2 = new C1044c();
                            int h11 = c1044c2.h(new y(j6, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            c1044c2.c(str2);
                            c1044c2.e(h11);
                            i14 = c1044c2.i();
                        }
                        K10 = i14;
                        rVar.h0(K10);
                    }
                    C1046e c1046e = (C1046e) K10;
                    rVar.t(false);
                    rVar.t(false);
                    AbstractC4326r b10 = androidx.compose.ui.draw.a.b(abstractC4326r5, ((C1525a3) rVar.m(AbstractC1530b3.f19940a)).f19905b);
                    if (hVar == null && (rVar2 = hVar.f46691a) != null) {
                        j10 = rVar2.f44265a;
                    } else {
                        j10 = r0.r.f44254b;
                    }
                    F f6 = G.f44171a;
                    AbstractC4326r d10 = androidx.compose.foundation.a.d(b10, j10, f6);
                    rVar.W(-483455358);
                    N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar);
                    rVar.W(-1323940314);
                    int i22 = rVar.P;
                    AbstractC1732q0 p10 = rVar.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i23 = androidx.compose.ui.layout.a.i(d10);
                    z14 = rVar.f22696a instanceof AbstractC1707e;
                    if (!z14) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        C0581j c0581j2 = C0583l.f5808f;
                        U3.f.n0(rVar, a10, c0581j2);
                        C0581j c0581j3 = C0583l.f5807e;
                        U3.f.n0(rVar, p10, c0581j3);
                        C0581j c0581j4 = C0583l.f5809g;
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i22))) {
                            AbstractC6463a.q(i22, rVar, i22, c0581j4);
                        }
                        AbstractC6463a.r(0, i23, new L0(rVar), rVar, 2058660585);
                        AbstractC4326r a11 = io.sentry.compose.b.a("CodeBlock");
                        C0424h c0424h = AbstractC0429m.f3912f;
                        C4317i c4317i = C4310b.f37703p0;
                        AbstractC4326r d11 = androidx.compose.foundation.layout.e.d(androidx.compose.foundation.a.d(c4323o, f46680a, f6), 1.0f);
                        float f10 = p9.r.f42841e;
                        AbstractC4326r a12 = AbstractC4194d.a((X) a11, androidx.compose.foundation.layout.a.v(d11, f10, 0.0f, p9.r.f42840d, 0.0f, 10));
                        rVar.W(693286680);
                        N a13 = p0.a(c0424h, c4317i, rVar);
                        rVar.W(-1323940314);
                        int i24 = rVar.P;
                        AbstractC1732q0 p11 = rVar.p();
                        C3288a i25 = androidx.compose.ui.layout.a.i(a12);
                        if (z14) {
                            rVar.Z();
                            if (rVar.f22695O) {
                                rVar.o(c0582k);
                            } else {
                                rVar.k0();
                            }
                            U3.f.n0(rVar, a13, c0581j2);
                            U3.f.n0(rVar, p11, c0581j3);
                            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i24))) {
                                c0581j = c0581j4;
                                AbstractC6463a.q(i24, rVar, i24, c0581j);
                            } else {
                                c0581j = c0581j4;
                            }
                            AbstractC6463a.r(0, i25, new L0(rVar), rVar, 2058660585);
                            O o10 = j4.f20182a;
                            m1 m1Var = q4.f20361a;
                            A7.b.k(o10.b(E.a(0, 0, 16777214, f46681b, 0L, 0L, 0L, null, ((p4) rVar.m(m1Var)).f20313n, null, null, null)), R4.b.X(rVar, 510214239, new gc.l(str, 5, c1046e)), rVar, 48);
                            AbstractC6463a.v(rVar, false, true, false, false);
                            AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(c4323o, f10);
                            rVar.W(733328855);
                            N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
                            rVar.W(-1323940314);
                            int i26 = rVar.P;
                            AbstractC1732q0 p12 = rVar.p();
                            C3288a i27 = androidx.compose.ui.layout.a.i(r10);
                            if (z14) {
                                rVar.Z();
                                if (rVar.f22695O) {
                                    rVar.o(c0582k);
                                } else {
                                    rVar.k0();
                                }
                                U3.f.n0(rVar, c10, c0581j2);
                                U3.f.n0(rVar, p12, c0581j3);
                                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i26))) {
                                    AbstractC6463a.q(i26, rVar, i26, c0581j);
                                }
                                AbstractC6463a.r(0, i27, new L0(rVar), rVar, 2058660585);
                                j4.c(c1046e, io.sentry.compose.b.a("CodeBlock"), 0L, 0L, null, null, s.f16044h0, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p4) rVar.m(m1Var)).f20311l, rVar, 0, 0, 131006);
                                AbstractC6463a.v(rVar, false, true, false, false);
                                AbstractC6463a.v(rVar, false, true, false, false);
                                abstractC4326r3 = abstractC4326r5;
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    } else {
                        Throwable th3 = th2;
                        R4.b.r1();
                        throw th3;
                    }
                }
                C1741v0 v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C0439x(str, str2, z10, abstractC4326r3, i10, i11, 5);
                    return;
                }
                return;
            }
            c1044c2.c(str2);
            c1044c2.e(h11);
            i14 = c1044c2.i();
            K10 = i14;
            rVar.h0(K10);
            C1046e c1046e2 = (C1046e) K10;
            rVar.t(false);
            rVar.t(false);
            AbstractC4326r b102 = androidx.compose.ui.draw.a.b(abstractC4326r5, ((C1525a3) rVar.m(AbstractC1530b3.f19940a)).f19905b);
            if (hVar == null) {
            }
            j10 = r0.r.f44254b;
            F f62 = G.f44171a;
            AbstractC4326r d102 = androidx.compose.foundation.a.d(b102, j10, f62);
            rVar.W(-483455358);
            N a102 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar);
            rVar.W(-1323940314);
            int i222 = rVar.P;
            AbstractC1732q0 p102 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k2 = C0583l.f5804b;
            C3288a i232 = androidx.compose.ui.layout.a.i(d102);
            z14 = rVar.f22696a instanceof AbstractC1707e;
            if (!z14) {
            }
        } finally {
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 5851) != 1170) {
        }
        if (i19 == 0) {
        }
        rVar3.W(-1896896390);
        Object obj32 = C1723m.f22654Y;
        Throwable th22 = null;
        if (!z10) {
        }
        rVar.t(z11);
        int i212 = j.f46697b;
        rVar.W(-285084666);
        j6 = j.f46696a;
        rVar.W(195652253);
        boolean g112 = rVar.g(hVar);
        if (((i13 & 112) ^ 48) <= 32) {
        }
        z12 = false;
        z13 = g112 | z12;
        K10 = rVar.K();
        if (!z13) {
        }
        if (hVar == null) {
        }
        if (list == 0) {
        }
        C1044c c1044c22 = new C1044c();
        int h112 = c1044c22.h(new y(j6, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
    }

    public static final void b(C1046e c1046e, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        r rVar;
        float f6;
        int i12;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("CopyButton");
        r rVar2 = (r) abstractC1725n;
        rVar2.X(1682296480);
        if ((i10 & 14) == 0) {
            if (rVar2.g(c1046e)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar2.B()) {
            rVar2.P();
            rVar = rVar2;
        } else {
            AbstractC0696o0 abstractC0696o0 = (AbstractC0696o0) rVar2.m(AbstractC0701r0.f7001d);
            rVar2.W(1870341436);
            Object K10 = rVar2.K();
            if (K10 == C1723m.f22654Y) {
                K10 = kotlin.jvm.internal.m.d();
                rVar2.h0(K10);
            }
            D.m mVar = (D.m) K10;
            rVar2.t(false);
            if (((Boolean) H.t(mVar, rVar2, 6).getValue()).booleanValue()) {
                f6 = 0.5f;
            } else {
                f6 = 1.0f;
            }
            l1 b10 = AbstractC6704j.b(f6, null, "Copy code", rVar2, 3072, 22);
            C0421f c0421f = AbstractC0429m.f3907a;
            C0426j g10 = AbstractC0429m.g(p9.r.f42839c);
            C4317i c4317i = C4310b.f37703p0;
            AbstractC4326r a10 = AbstractC4194d.a((X) a5, androidx.compose.foundation.layout.a.r(androidx.compose.ui.draw.a.a(androidx.compose.foundation.a.g(c4323o, mVar, null, false, null, new C5902a(abstractC0696o0, 0, c1046e), 28), ((Number) b10.getValue()).floatValue()), p9.r.f42840d));
            rVar2.W(693286680);
            N a11 = p0.a(g10, c4317i, rVar2);
            rVar2.W(-1323940314);
            int i13 = rVar2.P;
            AbstractC1732q0 p10 = rVar2.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i14 = androidx.compose.ui.layout.a.i(a10);
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
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                    AbstractC6463a.q(i13, rVar2, i13, c0581j);
                }
                AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
                AbstractC4326r a12 = io.sentry.compose.b.a("CopyButton");
                AbstractC5824b F10 = kotlin.jvm.internal.m.F(R.drawable.ic_copy, rVar2);
                String v10 = Ng.H.v(R.string.copy_code, rVar2);
                int i15 = C5347k.f44246d;
                C5347k a13 = C4707f.a(5, f46681b);
                rVar = rVar2;
                androidx.compose.foundation.a.b(F10, v10, AbstractC4194d.a((X) a12, androidx.compose.foundation.layout.e.j(c4323o, q.f42830a)), null, null, 0.0f, a13, rVar, 1572872, 56);
                j4.b(Ng.H.v(R.string.copy_code, rVar), a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                AbstractC6463a.v(rVar, false, true, false, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v11 = rVar.v();
        if (v11 != null) {
            v11.f22739d = new C6675O(c1046e, i10, 16);
        }
    }
}
