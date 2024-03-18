package Ec;

import Df.AbstractC0405d;
import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.C0421f;
import E.C0424h;
import E.C0426j;
import E.p0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.E0;
import H0.Z;
import K4.J;
import S8.C1363g;
import W.AbstractC1552g0;
import W.AbstractC1607r1;
import W.G3;
import W.I2;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.l1;
import Z.o1;
import android.content.Context;
import android.text.format.DateUtils;
import androidx.lifecycle.e0;
import com.openai.chatgpt.R;
import gd.AbstractC3256b;
import h0.C3288a;
import hc.K;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import sb.C5605e;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import y.C6477o;
import y.P;
import z.AbstractC6696f;
import z.AbstractC6704j;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final float f4652a = 64;

    /* renamed from: b  reason: collision with root package name */
    public static final float f4653b = 256;

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        AbstractC4326r abstractC4326r3;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("WhisperMessageContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1952232748);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(str)) {
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
            if (rVar.g(str2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.i(abstractC6216a)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar.i(abstractC6216a2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        int i19 = i11 & 16;
        if (i19 != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 46811) != 9362 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i19 == 0) {
                    a5 = abstractC4326r2;
                }
                rVar.W(733328855);
                N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
                rVar.W(-1323940314);
                int i20 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i21 = androidx.compose.ui.layout.a.i(a5);
                z10 = rVar.f22696a instanceof AbstractC1707e;
                if (!z10) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar, c10, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    AbstractC4326r abstractC4326r4 = a5;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i20))) {
                        AbstractC6463a.q(i20, rVar, i20, c0581j3);
                    }
                    AbstractC6463a.r(0, i21, new L0(rVar), rVar, 2058660585);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                    AbstractC4326r a10 = bVar.a(c4323o, C4310b.f37697j0);
                    C0421f c0421f = AbstractC0429m.f3907a;
                    float f6 = p9.r.f42840d;
                    C0426j g10 = AbstractC0429m.g(f6);
                    C4316h c4316h = C4310b.f37706s0;
                    rVar.W(-483455358);
                    N a11 = AbstractC0440y.a(g10, c4316h, rVar);
                    rVar.W(-1323940314);
                    int i22 = rVar.P;
                    AbstractC1732q0 p11 = rVar.p();
                    C3288a i23 = androidx.compose.ui.layout.a.i(a10);
                    if (z10) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, a11, c0581j);
                        U3.f.n0(rVar, p11, c0581j2);
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i22))) {
                            AbstractC6463a.q(i22, rVar, i22, c0581j3);
                        }
                        AbstractC6463a.r(0, i23, new L0(rVar), rVar, 2058660585);
                        AbstractC4326r a12 = io.sentry.compose.b.a("WhisperMessageContent");
                        j4.b(str, a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, i14 & 14, 0, 131070);
                        Ng.H.a(abstractC6216a, a12, false, null, null, null, null, null, null, R4.b.X(rVar, -206194496, new C1363g(str2, 8)), rVar, ((i14 >> 6) & 14) | 805306368, 510);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        R4.b.o(abstractC6216a2, androidx.compose.foundation.layout.a.r(bVar.a(c4323o, C4310b.f37695h0), f6), false, null, null, AbstractC0498e.f4619b, rVar, ((i14 >> 9) & 14) | 196608, 28);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        abstractC4326r3 = abstractC4326r4;
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new P(str, str2, abstractC6216a, abstractC6216a2, abstractC4326r3, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        i14 = i12;
        if ((i14 & 46811) != 9362) {
        }
        if (i19 == 0) {
        }
        rVar.W(733328855);
        N c102 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
        rVar.W(-1323940314);
        int i202 = rVar.P;
        AbstractC1732q0 p102 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i212 = androidx.compose.ui.layout.a.i(a5);
        z10 = rVar.f22696a instanceof AbstractC1707e;
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Tc.f fVar, boolean z10, wf.k kVar, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, G g10, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        G g11;
        G g12;
        C1741v0 v10;
        int i13;
        int i14;
        G g13;
        boolean z11;
        AbstractC4326r abstractC4326r3;
        H h10;
        boolean z12;
        Object K10;
        boolean z13;
        boolean g14;
        Object K11;
        boolean z14;
        long j6;
        Ad.g y02;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        AbstractC3557B.c0("appState", fVar);
        AbstractC3557B.c0("onTranscribed", kVar);
        AbstractC3557B.c0("onClose", abstractC6216a);
        AbstractC4326r a5 = io.sentry.compose.b.a("WhisperPanel");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-804954259);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(z10)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.i(kVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar.i(abstractC6216a)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
        }
        int i21 = i11 & 16;
        if (i21 != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
            if ((i10 & 458752) != 0) {
                if ((i11 & 32) == 0) {
                    g11 = g10;
                    if (rVar.g(g11)) {
                        i15 = 131072;
                        i12 |= i15;
                    }
                } else {
                    g11 = g10;
                }
                i15 = 65536;
                i12 |= i15;
            } else {
                g11 = g10;
            }
            if ((374491 & i12) != 74898 && rVar.B()) {
                rVar.P();
                g12 = g11;
            } else {
                rVar.R();
                i13 = i10 & 1;
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (i13 == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    i14 = i12;
                    abstractC4326r3 = abstractC4326r2;
                    g13 = g11;
                    z11 = true;
                } else {
                    if (i21 != 0) {
                        abstractC4326r2 = a5;
                    }
                    if ((i11 & 32) == 0) {
                        rVar.W(-490350905);
                        Context context = (Context) rVar.m(Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar.m(Ad.k.f814a);
                        e0 a10 = m2.b.a(rVar);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC4326r abstractC4326r4 = abstractC4326r2;
                            AbstractC0405d b10 = d10.b(G.class);
                            AbstractC0405d b11 = d10.b(H.class);
                            rVar.W(608026872);
                            boolean g15 = rVar.g(b10) | rVar.g(b11) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                            Object K12 = rVar.K();
                            if (g15 || K12 == iVar) {
                                z11 = true;
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(H.class), d10.b(G.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(G.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K12 = y02;
                                rVar.h0(K12);
                            } else {
                                z11 = true;
                            }
                            rVar.t(false);
                            rVar.t(false);
                            g13 = (G) ((Ad.g) K12);
                            i14 = i12 & (-458753);
                            abstractC4326r3 = abstractC4326r4;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        z11 = true;
                        abstractC4326r3 = abstractC4326r2;
                        i14 = i12;
                        g13 = g11;
                    }
                }
                rVar.u();
                h10 = (H) AbstractC4828h.z(g13.f808e, rVar).getValue();
                rVar.W(1107030341);
                if ((((458752 & i14) ^ 196608) <= 131072 && rVar.g(g13)) || (i14 & 196608) == 131072) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                K10 = rVar.K();
                if (!z12 || K10 == iVar) {
                    kotlin.jvm.internal.j jVar = new kotlin.jvm.internal.j(1, g13, G.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                    rVar.h0(jVar);
                    K10 = jVar;
                }
                AbstractC0408g abstractC0408g = (AbstractC0408g) K10;
                rVar.t(false);
                AbstractC1734s.e(g13.f812i, new q(g13, fVar, kVar, null), rVar);
                Boolean valueOf = Boolean.valueOf(z10);
                rVar.W(1107030781);
                if ((i14 & 112) != 32) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                g14 = rVar.g(abstractC0408g) | z13;
                K11 = rVar.K();
                if (g14 && K11 != iVar) {
                    z14 = z10;
                } else {
                    z14 = z10;
                    K11 = new r(z14, abstractC0408g, null);
                    rVar.h0(K11);
                }
                rVar.t(false);
                AbstractC1734s.e(valueOf, (wf.n) K11, rVar);
                if (!(h10.f4605a instanceof C)) {
                    rVar.W(1107030952);
                    j6 = ((P0) rVar.m(R0.f19593a)).f19519c;
                    rVar.t(false);
                } else {
                    rVar.W(1107031011);
                    j6 = ((P0) rVar.m(R0.f19593a)).f19524h;
                    rVar.t(false);
                }
                long j10 = j6;
                G3.a(abstractC4326r3, null, j10, 0L, AbstractC1552g0.f20071a, 0.0f, null, R4.b.X(rVar, 1904576754, new u(z14, abstractC0408g, h10, abstractC6216a)), rVar, ((i14 >> 12) & 14) | 12582912, 106);
                abstractC4326r2 = abstractC4326r3;
                g12 = g13;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new y.H(fVar, z10, kVar, abstractC6216a, abstractC4326r2, g12, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 458752) != 0) {
        }
        if ((374491 & i12) != 74898) {
        }
        rVar.R();
        i13 = i10 & 1;
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (i13 == 0) {
        }
        if (i21 != 0) {
        }
        if ((i11 & 32) == 0) {
        }
        rVar.u();
        h10 = (H) AbstractC4828h.z(g13.f808e, rVar).getValue();
        rVar.W(1107030341);
        if (((458752 & i14) ^ 196608) <= 131072) {
        }
        z12 = false;
        K10 = rVar.K();
        if (!z12) {
        }
        kotlin.jvm.internal.j jVar2 = new kotlin.jvm.internal.j(1, g13, G.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        rVar.h0(jVar2);
        K10 = jVar2;
        AbstractC0408g abstractC0408g2 = (AbstractC0408g) K10;
        rVar.t(false);
        AbstractC1734s.e(g13.f812i, new q(g13, fVar, kVar, null), rVar);
        Boolean valueOf2 = Boolean.valueOf(z10);
        rVar.W(1107030781);
        if ((i14 & 112) != 32) {
        }
        g14 = rVar.g(abstractC0408g2) | z13;
        K11 = rVar.K();
        if (g14) {
        }
        z14 = z10;
        K11 = new r(z14, abstractC0408g2, null);
        rVar.h0(K11);
        rVar.t(false);
        AbstractC1734s.e(valueOf2, (wf.n) K11, rVar);
        if (!(h10.f4605a instanceof C)) {
        }
        long j102 = j6;
        G3.a(abstractC4326r3, null, j102, 0L, AbstractC1552g0.f20071a, 0.0f, null, R4.b.X(rVar, 1904576754, new u(z14, abstractC0408g2, h10, abstractC6216a)), rVar, ((i14 >> 12) & 14) | 12582912, 106);
        abstractC4326r2 = abstractC4326r3;
        g12 = g13;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final void c(C c10, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        boolean z10;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("WhisperRecordingContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1262568093);
        if ((i11 & 4) == 0) {
            a5 = abstractC4326r;
        }
        AbstractC4326r g10 = a5.g(androidx.compose.foundation.layout.e.f24739c);
        rVar.W(-1399860258);
        if ((((i10 & 112) ^ 48) > 32 && rVar.g(abstractC6216a)) || (i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (z10 || K10 == iVar) {
            K10 = new C5605e(abstractC6216a, 10);
            rVar.h0(K10);
        }
        rVar.t(false);
        AbstractC4326r h10 = androidx.compose.foundation.a.h(g10, (AbstractC6216a) K10);
        rVar.W(733328855);
        C4318j c4318j = C4310b.f37693Y;
        N c11 = AbstractC0434s.c(c4318j, false, rVar);
        rVar.W(-1323940314);
        int i12 = rVar.P;
        AbstractC1732q0 p10 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i13 = androidx.compose.ui.layout.a.i(h10);
        boolean z11 = rVar.f22696a instanceof AbstractC1707e;
        if (z11) {
            rVar.Z();
            if (rVar.f22695O) {
                rVar.o(c0582k);
            } else {
                rVar.k0();
            }
            C0581j c0581j = C0583l.f5808f;
            U3.f.n0(rVar, c11, c0581j);
            C0581j c0581j2 = C0583l.f5807e;
            U3.f.n0(rVar, p10, c0581j2);
            C0581j c0581j3 = C0583l.f5809g;
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i12))) {
                AbstractC6463a.q(i12, rVar, i12, c0581j3);
            }
            AbstractC6463a.r(0, i13, new L0(rVar), rVar, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
            Yg.p pVar = c10.f4601a;
            rVar.W(1916993708);
            boolean g11 = rVar.g(pVar);
            Object K11 = rVar.K();
            if (g11 || K11 == iVar) {
                Mg.a aVar = Mg.b.f12127Z;
                K11 = AbstractC4828h.Z(new Mg.b(Df.H.x0(0, Mg.d.f12134i0)), o1.f22665a);
                rVar = rVar;
                rVar.h0(K11);
            }
            AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K11;
            rVar.t(false);
            AbstractC1734s.e(c10.f4601a, new w(c10, abstractC1710f0, null), rVar);
            String formatElapsedTime = DateUtils.formatElapsedTime(Mg.b.l(((Mg.b) abstractC1710f0.getValue()).f12130Y, Mg.d.f12134i0));
            AbstractC3557B.b0("formatElapsedTime(...)", formatElapsedTime);
            Z.r rVar2 = rVar;
            j4.b(formatElapsedTime, androidx.compose.foundation.layout.a.r(bVar.a(c4323o, c4318j), p9.r.f42841e), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131068);
            l1 a10 = AbstractC6704j.a(J.L(f4652a, f4653b, c10.f4602b / 32767.0f), AbstractC6696f.v(0, 0, null, 7), "AmplitudeAnimation", rVar2, 432, 8);
            C4318j c4318j2 = C4310b.f37697j0;
            AbstractC0434s.a(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.j(bVar.a(c4323o, c4318j2), ((Z0.e) a10.getValue()).f22788Y), K.f.f9317a), ((P0) rVar2.m(R0.f19593a)).f19528l, r0.G.f44171a), rVar2, 0);
            AbstractC4326r a11 = bVar.a(c4323o, c4318j2);
            C0421f c0421f = AbstractC0429m.f3907a;
            C0426j g12 = AbstractC0429m.g(p9.r.f42840d);
            rVar2.W(693286680);
            N a12 = p0.a(g12, C4310b.f37702o0, rVar2);
            rVar2.W(-1323940314);
            int i14 = rVar2.P;
            AbstractC1732q0 p11 = rVar2.p();
            C3288a i15 = androidx.compose.ui.layout.a.i(a11);
            if (z11) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                U3.f.n0(rVar2, a12, c0581j);
                U3.f.n0(rVar2, p11, c0581j2);
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i14))) {
                    AbstractC6463a.q(i14, rVar2, i14, c0581j3);
                }
                AbstractC6463a.r(0, i15, new L0(rVar2), rVar2, 2058660585);
                AbstractC4326r a13 = io.sentry.compose.b.a("WhisperRecordingContent");
                C5953f c5953f = AbstractC4828h.f40332n;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.StopCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i16 = AbstractC5944H.f46870a;
                    r0.N n10 = new r0.N(r0.r.f44254b);
                    Wh.p p12 = R.a.p(0, 12.0f, 2.0f);
                    p12.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    p12.h(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
                    p12.u(10.0f, -4.48f, 10.0f, -10.0f);
                    p12.g(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
                    p12.f();
                    p12.p(12.0f, 20.0f);
                    p12.h(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                    p12.u(3.58f, -8.0f, 8.0f, -8.0f);
                    p12.u(8.0f, 3.58f, 8.0f, 8.0f);
                    p12.t(16.42f, 20.0f, 12.0f, 20.0f);
                    p12.f();
                    p12.p(16.0f, 16.0f);
                    p12.l(8.0f);
                    p12.w(8.0f);
                    p12.m(8.0f);
                    p12.w(16.0f);
                    p12.f();
                    C5952e.b(c5952e, p12.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    AbstractC4828h.f40332n = c5953f;
                }
                AbstractC1607r1.b(c5953f, null, a13, 0L, rVar2, 48, 12);
                j4.b(Ng.H.v(R.string.whisper_tap_to_stop, rVar2), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                AbstractC6463a.v(rVar2, false, true, false, false);
                rVar2.t(false);
                rVar2.t(true);
                rVar2.t(false);
                rVar2.t(false);
                C1741v0 v10 = rVar2.v();
                if (v10 != null) {
                    v10.f22739d = new K(c10, abstractC6216a, a5, i10, i11, 10);
                    return;
                }
                return;
            }
            R4.b.r1();
            throw null;
        }
        R4.b.r1();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(H h10, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, AbstractC6216a abstractC6216a4, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        F f6;
        Z.r rVar2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("WhisperStateContent");
        Z.r rVar3 = (Z.r) abstractC1725n;
        rVar3.X(-543105192);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar3.g(h10)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar3.i(abstractC6216a)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar3.i(abstractC6216a2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar3.i(abstractC6216a3)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (rVar3.i(abstractC6216a4)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        int i21 = i11 & 32;
        if (i21 != 0) {
            i12 |= 196608;
        } else if ((458752 & i10) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar3.g(abstractC4326r2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
            if ((374491 & i12) != 74898 && rVar3.B()) {
                rVar3.P();
                abstractC4326r3 = abstractC4326r2;
                rVar = rVar3;
            } else {
                if (i21 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                f6 = h10.f4605a;
                if (!AbstractC3557B.K(f6, A.f4599c)) {
                    rVar3.W(1752822463);
                    rVar3.t(false);
                } else {
                    boolean z11 = f6 instanceof C;
                    F f10 = h10.f4605a;
                    if (z11) {
                        rVar3.W(1752822518);
                        c((C) f10, abstractC6216a, abstractC4326r4, rVar3, (i12 & 112) | 8 | ((i12 >> 9) & 896), 0);
                        rVar3.t(false);
                    } else {
                        if (f6 instanceof E) {
                            rVar3.W(1752822638);
                            C0424h c0424h = AbstractC0429m.f3911e;
                            C4317i c4317i = C4310b.f37703p0;
                            rVar3.W(693286680);
                            N a10 = p0.a(c0424h, c4317i, rVar3);
                            rVar3.W(-1323940314);
                            int i22 = rVar3.P;
                            AbstractC1732q0 p10 = rVar3.p();
                            AbstractC0584m.f5811i.getClass();
                            C0582k c0582k = C0583l.f5804b;
                            C3288a i23 = androidx.compose.ui.layout.a.i(abstractC4326r4);
                            if (rVar3.f22696a instanceof AbstractC1707e) {
                                rVar3.Z();
                                if (rVar3.f22695O) {
                                    rVar3.o(c0582k);
                                } else {
                                    rVar3.k0();
                                }
                                U3.f.n0(rVar3, a10, C0583l.f5808f);
                                U3.f.n0(rVar3, p10, C0583l.f5807e);
                                C0581j c0581j = C0583l.f5809g;
                                if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i22))) {
                                    AbstractC6463a.q(i22, rVar3, i22, c0581j);
                                }
                                AbstractC6463a.r(0, i23, new L0(rVar3), rVar3, 2058660585);
                                AbstractC4326r a11 = io.sentry.compose.b.a("WhisperStateContent");
                                rVar2 = rVar3;
                                I2.b(a11, 0L, 0.0f, 0L, 0, rVar2, 0, 31);
                                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, p9.r.f42840d), rVar2);
                                j4.b(Ng.H.v(R.string.whisper_transcribing, rVar2), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                                AbstractC6463a.v(rVar2, false, true, false, false);
                                rVar2.t(false);
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        } else {
                            rVar2 = rVar3;
                            if (f6 instanceof D) {
                                rVar2.W(1752823049);
                                rVar2.t(false);
                            } else {
                                if ((f6 instanceof B) || (f6 instanceof z)) {
                                    rVar2.W(1752823137);
                                    if (AbstractC3557B.K(f10, B.f4600a)) {
                                        i13 = R.string.whisper_error_service;
                                    } else {
                                        i13 = R.string.whisper_error_network;
                                    }
                                    int i24 = i12 >> 3;
                                    rVar = rVar2;
                                    a(Ng.H.v(i13, rVar2), Ng.H.v(R.string.whisper_retry, rVar2), abstractC6216a3, abstractC6216a4, abstractC4326r4, rVar2, (i24 & 57344) | (i24 & 896) | (i24 & 7168), 0);
                                    rVar.t(false);
                                } else {
                                    rVar = rVar2;
                                    if (AbstractC3557B.K(f6, A.f4598b)) {
                                        rVar.W(1752823713);
                                        jf.y yVar = jf.y.f36177a;
                                        rVar.W(1752823734);
                                        if ((57344 & i12) == 16384) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        Object K10 = rVar.K();
                                        if (z10 || K10 == C1723m.f22654Y) {
                                            K10 = new x(abstractC6216a4, null);
                                            rVar.h0(K10);
                                        }
                                        rVar.t(false);
                                        AbstractC1734s.e(yVar, (wf.n) K10, rVar);
                                        rVar.t(false);
                                    } else {
                                        A a12 = A.f4597a;
                                        if (AbstractC3557B.K(f6, a12)) {
                                            rVar.W(1752823811);
                                            if (AbstractC3557B.K(f10, a12)) {
                                                i14 = R.string.whisper_no_speech;
                                            } else {
                                                i14 = R.string.whisper_too_short;
                                            }
                                            int i25 = i12 & 896;
                                            int i26 = i12 >> 3;
                                            a(Ng.H.v(i14, rVar), Ng.H.v(R.string.whisper_restart, rVar), abstractC6216a2, abstractC6216a4, abstractC4326r4, rVar, i25 | (i26 & 7168) | (i26 & 57344), 0);
                                            rVar.t(false);
                                        } else {
                                            rVar.W(1752824336);
                                            rVar.t(false);
                                        }
                                    }
                                }
                                abstractC4326r3 = abstractC4326r4;
                            }
                        }
                        rVar = rVar2;
                        abstractC4326r3 = abstractC4326r4;
                    }
                }
                rVar = rVar3;
                abstractC4326r3 = abstractC4326r4;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C6477o(h10, abstractC6216a, abstractC6216a2, abstractC6216a3, abstractC6216a4, abstractC4326r3, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((374491 & i12) != 74898) {
        }
        if (i21 == 0) {
        }
        f6 = h10.f4605a;
        if (!AbstractC3557B.K(f6, A.f4599c)) {
        }
        rVar = rVar3;
        abstractC4326r3 = abstractC4326r4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
