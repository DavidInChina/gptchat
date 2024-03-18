package gb;

import A.AbstractC0040r0;
import A.AbstractC0044t0;
import A.AbstractC0048v0;
import A.C0053y;
import A.C0055z;
import Df.AbstractC0405d;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.C0421f;
import E.C0423g;
import E.C0426j;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0696o0;
import H0.AbstractC0701r0;
import H0.E0;
import W.E1;
import W.P0;
import W.R0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.m1;
import android.content.Context;
import ca.AbstractC2313e;
import ca.C2315g;
import ca.C2316h;
import ca.C2317i;
import com.openai.chatgpt.R;
import com.openai.experiment.ExperimentKey;
import fa.AbstractC2965B;
import fa.C2969F;
import fa.C2973b;
import fa.C2976e;
import fa.C2979h;
import fa.EnumC2971H;
import gd.AbstractC3256b;
import h0.C3288a;
import id.AbstractC3557B;
import ja.C3931c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4317i;
import l0.C4323o;
import l8.AbstractC4344b;
import p9.AbstractC5103e;
import p9.C5100b;
import wd.C6168C;
import wd.C6182c0;
import wd.C6190g0;
import wd.EnumC6192h0;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import y.C6473k;
import yf.AbstractC6583a;
import z.AbstractC6696f;
import z.C6677Q;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public static final long f31357a = M3.H.V(24);

    /* renamed from: b  reason: collision with root package name */
    public static final float f31358b = 20;

    /* renamed from: c  reason: collision with root package name */
    public static final float f31359c = 24;

    public static final void a(String str, List list, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        C4323o c4323o;
        boolean z10;
        C4323o c4323o2 = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("AttachmentsBlock");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(739190538);
        if ((i11 & 8) != 0) {
            abstractC4326r2 = a5;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        boolean M02 = L4.a.M0(ExperimentKey.AdaV2Enabled.INSTANCE, rVar);
        rVar.W(-483455358);
        E0.N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar);
        rVar.W(-1323940314);
        int i12 = rVar.P;
        AbstractC1732q0 p10 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i13 = androidx.compose.ui.layout.a.i(abstractC4326r2);
        if (rVar.f22696a instanceof AbstractC1707e) {
            rVar.Z();
            if (rVar.f22695O) {
                rVar.o(c0582k);
            } else {
                rVar.k0();
            }
            U3.f.n0(rVar, a10, C0583l.f5808f);
            U3.f.n0(rVar, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i12))) {
                AbstractC6463a.q(i12, rVar, i12, c0581j);
            }
            boolean z11 = false;
            AbstractC6463a.r(0, i13, new L0(rVar), rVar, 2058660585);
            rVar.W(-376350501);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wd.L l10 = (wd.L) it.next();
                if (str != null && M02 && Lg.n.c2(l10.f48358b, ".csv", z11)) {
                    rVar.W(-1881474013);
                    K8.d.O(false, kotlin.jvm.internal.m.F(R.drawable.ic_spreadsheet, rVar), AbstractC5103e.f42775f, r9.y.W0(l10.f48358b), Ng.H.v(R.string.spreadsheet_file_content_description, rVar), new F.s(kVar, str, l10, 21), androidx.compose.foundation.layout.a.v(c4323o2, p9.r.f42844h, 0.0f, 0.0f, 0.0f, 14), rVar, 70, 0);
                    rVar.t(z11);
                    c4323o = c4323o2;
                    z10 = z11;
                } else {
                    rVar.W(-1881473383);
                    c4323o = c4323o2;
                    z10 = z11;
                    E1.a(R4.b.X(rVar, 998567182, new C6473k(29, l10)), androidx.compose.foundation.layout.a.t(c4323o2, p9.r.f42840d, 0.0f, 2), null, null, AbstractC3232i.f31447a, null, null, 0.0f, 0.0f, rVar, 24582, 492);
                    rVar.t(z10);
                }
                z11 = z10;
                c4323o2 = c4323o;
            }
            boolean z12 = z11;
            AbstractC6463a.v(rVar, z12, z12, true, z12);
            rVar.t(z12);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new G.I(str, list, kVar, abstractC4326r2, i10, i11, 14);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC2313e abstractC2313e, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        C1741v0 v10;
        int i15;
        int i16;
        AbstractC4326r a5 = io.sentry.compose.b.a("ConversationMessageItemContentContainer");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1396607667);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC2313e)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 731) != 146 && rVar.B()) {
                rVar.P();
            } else {
                if (i17 == 0) {
                    a5 = abstractC4326r2;
                }
                if (!(abstractC2313e instanceof C2316h)) {
                    if (((C2316h) abstractC2313e).f26391a.f30018k) {
                        rVar.W(1575268625);
                        j4.b(Ng.H.v(R.string.conversation_content_blocked, rVar), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, (i14 >> 3) & 112, 0, 131068);
                        rVar.t(false);
                        break;
                    }
                    rVar.W(1575268734);
                    j4.a(N0.E.a(0, 3, 16711679, 0L, 0L, 0L, 0L, null, ((p4) rVar.m(q4.f20361a)).f20309j, null, null, null), R4.b.X(rVar, -95483266, new N.D((Object) abstractC2313e, kVar, a5, 16)), rVar, 48);
                    rVar.t(false);
                } else {
                    if (abstractC2313e instanceof C2317i) {
                        List<C2969F> list = ((C2317i) abstractC2313e).f26393b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (C2969F c2969f : list) {
                                if (c2969f.f30018k) {
                                    rVar.W(1575268625);
                                    j4.b(Ng.H.v(R.string.conversation_content_blocked, rVar), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, (i14 >> 3) & 112, 0, 131068);
                                    rVar.t(false);
                                    break;
                                }
                            }
                        }
                    } else if (!(abstractC2313e instanceof C2315g)) {
                        throw new RuntimeException();
                    }
                    rVar.W(1575268734);
                    j4.a(N0.E.a(0, 3, 16711679, 0L, 0L, 0L, 0L, null, ((p4) rVar.m(q4.f20361a)).f20309j, null, null, null), R4.b.X(rVar, -95483266, new N.D((Object) abstractC2313e, kVar, a5, 16)), rVar, 48);
                    rVar.t(false);
                }
                abstractC4326r2 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new bb.j0(abstractC2313e, kVar, abstractC4326r2, i10, i11, 5);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        i14 = i12;
        if ((i14 & 731) != 146) {
        }
        if (i17 == 0) {
        }
        if (!(abstractC2313e instanceof C2316h)) {
        }
        abstractC4326r2 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final void c(AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        AbstractC4326r a5 = io.sentry.compose.b.a("LoadingMessageList");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1383201481);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.B()) {
            rVar.P();
        } else {
            if (i14 != 0) {
                abstractC4326r = a5;
            }
            rVar.W(-483455358);
            E0.N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar);
            rVar.W(-1323940314);
            int i15 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i16 = androidx.compose.ui.layout.a.i(abstractC4326r);
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, a10, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i15))) {
                    AbstractC6463a.q(i15, rVar, i15, c0581j);
                }
                AbstractC6463a.r(0, i16, new L0(rVar), rVar, 2058660585);
                AbstractC4326r a11 = io.sentry.compose.b.a("LoadingMessageList");
                d(EnumC2971H.f30046Y, 2, a11, rVar, 54, 4);
                d(EnumC2971H.f30047Z, 3, a11, rVar, 54, 4);
                AbstractC6463a.v(rVar, false, true, false, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new d9.o(abstractC4326r, i10, i11, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(EnumC2971H enumC2971H, int i10, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i11, int i12) {
        int i13;
        AbstractC4326r abstractC4326r2;
        int i14;
        int i15;
        AbstractC4326r abstractC4326r3;
        boolean z10;
        int i16;
        int i17;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("LoadingMessageListItem");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1290564485);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (rVar.g(enumC2971H)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i17 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (rVar.e(i10)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            i15 = i13;
            if ((i15 & 731) != 146 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i18 == 0) {
                    a5 = abstractC4326r2;
                }
                rVar.W(-483455358);
                C0423g c0423g = AbstractC0429m.f3909c;
                C4316h c4316h = C4310b.f37705r0;
                E0.N a10 = AbstractC0440y.a(c0423g, c4316h, rVar);
                rVar.W(-1323940314);
                int i19 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i20 = androidx.compose.ui.layout.a.i(a5);
                z10 = rVar.f22696a instanceof AbstractC1707e;
                if (!z10) {
                    rVar.Z();
                    abstractC4326r3 = a5;
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar, a10, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i19))) {
                        AbstractC6463a.q(i19, rVar, i19, c0581j3);
                    }
                    AbstractC6463a.r(0, i20, new L0(rVar), rVar, 2058660585);
                    float f6 = p9.r.f42841e;
                    float f10 = p9.r.f42840d;
                    AbstractC4326r s10 = androidx.compose.foundation.layout.a.s(c4323o, f6, f10);
                    rVar.W(-483455358);
                    E0.N a11 = AbstractC0440y.a(c0423g, c4316h, rVar);
                    rVar.W(-1323940314);
                    int i21 = rVar.P;
                    AbstractC1732q0 p11 = rVar.p();
                    C3288a i22 = androidx.compose.ui.layout.a.i(s10);
                    if (z10) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, a11, c0581j);
                        U3.f.n0(rVar, p11, c0581j2);
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i21))) {
                            AbstractC6463a.q(i21, rVar, i21, c0581j3);
                        }
                        AbstractC6463a.r(0, i22, new L0(rVar), rVar, 2058660585);
                        AbstractC4326r a12 = io.sentry.compose.b.a("LoadingMessageListItem");
                        int i23 = i15 << 6;
                        j(null, null, enumC2971H, a12, null, true, rVar, (i23 & 896) | 196662, 24);
                        androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.j(c4323o, f10), rVar);
                        j4.b("", AbstractC4194d.a((G0.X) a12, Bi.c.I1(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), f31358b + f10, 0.0f, 0.0f, 0.0f, 14), true, false)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, i10, i10, null, null, rVar, 6, (i23 & 7168) | ((i15 << 9) & 57344), 106492);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        AbstractC6463a.v(rVar, false, true, false, false);
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
                v10.f22739d = new C3243u(enumC2971H, i10, abstractC4326r3, i11, i12);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        i15 = i13;
        if ((i15 & 731) != 146) {
        }
        if (i18 == 0) {
        }
        rVar.W(-483455358);
        C0423g c0423g2 = AbstractC0429m.f3909c;
        C4316h c4316h2 = C4310b.f37705r0;
        E0.N a102 = AbstractC0440y.a(c0423g2, c4316h2, rVar);
        rVar.W(-1323940314);
        int i192 = rVar.P;
        AbstractC1732q0 p102 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i202 = androidx.compose.ui.layout.a.i(a5);
        z10 = rVar.f22696a instanceof AbstractC1707e;
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String str, String str2, AbstractC2965B abstractC2965B, wf.k kVar, AbstractC4326r abstractC4326r, boolean z10, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        boolean z11;
        Z.r rVar;
        boolean z12;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        boolean z16;
        Object K10;
        boolean z17;
        String str3;
        String str4;
        wd.U u10;
        wd.U u11;
        String str5;
        String str6;
        boolean z18;
        wd.U u12;
        wd.U u13;
        fa.n nVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C6168C c6168c;
        int i21;
        AbstractC3557B.c0("messageId", str2);
        AbstractC3557B.c0("content", abstractC2965B);
        AbstractC3557B.c0("onIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageContent");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1115321448);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (str != null) {
                c6168c = new C6168C(str);
            } else {
                c6168c = null;
            }
            if (rVar2.g(c6168c)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.g(str2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar2.g(abstractC2965B)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar2.i(kVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i12 |= i18;
        }
        int i22 = i11 & 16;
        if (i22 != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
            i13 = i11 & 32;
            if (i13 == 0) {
                i12 |= 196608;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i10 & 458752) == 0) {
                    if (rVar2.h(z11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i12 & 374491) != 74898 && rVar2.B()) {
                rVar2.P();
                rVar = rVar2;
                AbstractC4326r abstractC4326r5 = abstractC4326r2;
                z12 = z11;
                abstractC4326r3 = abstractC4326r5;
            } else {
                if (i22 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                if (i13 == 0) {
                    z13 = false;
                } else {
                    z13 = z11;
                }
                C6182c0 c6182c0 = new C6182c0(str2);
                Boolean valueOf = Boolean.valueOf(z13);
                rVar2.W(1522253671);
                i14 = i12 & 7168;
                if (i14 != 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i15 = i12 & 112;
                if (i15 != 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                K10 = rVar2.K();
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (!z16 || K10 == iVar) {
                    K10 = new C3244v(kVar, str2, null);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                int i23 = (i12 >> 3) & 14;
                AbstractC1734s.d(c6182c0, valueOf, (wf.n) K10, rVar2);
                if (!(abstractC2965B instanceof fa.t)) {
                    rVar2.W(1522253791);
                    j4.c(Bi.c.R1(((fa.t) abstractC2965B).f30079b, z13), abstractC4326r4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, rVar2, (i12 >> 9) & 112, 0, 262140);
                    rVar2.t(false);
                    z17 = z13;
                } else if (abstractC2965B instanceof fa.n) {
                    rVar2.W(1522253931);
                    if (z13) {
                        String str7 = ((fa.n) abstractC2965B).f30070b + "**\u2b24**";
                        AbstractC3557B.c0("content", str7);
                        nVar = new fa.n(str7);
                    } else if (!z13) {
                        nVar = (fa.n) abstractC2965B;
                    } else {
                        throw new RuntimeException();
                    }
                    fa.n nVar2 = nVar;
                    fa.l lVar = fa.n.Companion;
                    z17 = z13;
                    h(str2, nVar2, z13, kVar, abstractC4326r4, rVar2, i23 | 64 | ((i12 >> 9) & 896) | i14 | (i12 & 57344), 0);
                    rVar2.t(false);
                } else {
                    z17 = z13;
                    if (abstractC2965B instanceof fa.w) {
                        rVar2.W(1522254326);
                        Bi.c.q(str, str2, ((fa.w) abstractC2965B).f30082b, kVar, null, rVar2, (i12 & 14) | i15 | i14, 16);
                        rVar2.t(false);
                    } else if (abstractC2965B instanceof C2976e) {
                        rVar2.W(1522254550);
                        wd.Y y10 = ((C2976e) abstractC2965B).f30060b;
                        String str8 = y10.f48372a;
                        wd.X x10 = y10.f48376e;
                        if (x10 != null && (u13 = x10.f48371a) != null) {
                            str5 = u13.f48368b;
                        } else {
                            str5 = null;
                        }
                        if (x10 != null && (u12 = x10.f48371a) != null) {
                            str6 = u12.f48367a;
                        } else {
                            str6 = null;
                        }
                        int i24 = i12;
                        C3235l c3235l = new C3235l(str, str2, str8, str5, y10.f48374c, y10.f48375d, str6);
                        rVar2.W(1522255042);
                        if (i14 == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        Object K11 = rVar2.K();
                        if (z18 || K11 == iVar) {
                            K11 = AbstractC0044t0.v(1, kVar, rVar2);
                        }
                        rVar2.t(false);
                        AbstractC3242t.b(c3235l, (wf.k) K11, abstractC4326r4, rVar2, (i24 >> 6) & 896, 0);
                        rVar2.t(false);
                    } else {
                        int i25 = i12;
                        if (abstractC2965B instanceof C2979h) {
                            rVar2.W(1522255264);
                            List<wd.Y> list = ((C2979h) abstractC2965B).f30064b;
                            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                            for (wd.Y y11 : list) {
                                String str9 = y11.f48372a;
                                wd.X x11 = y11.f48376e;
                                if (x11 != null && (u11 = x11.f48371a) != null) {
                                    str3 = u11.f48368b;
                                } else {
                                    str3 = null;
                                }
                                if (x11 != null && (u10 = x11.f48371a) != null) {
                                    str4 = u10.f48367a;
                                } else {
                                    str4 = null;
                                }
                                arrayList.add(new C3235l(str, str2, str9, str3, y11.f48374c, y11.f48375d, str4));
                            }
                            AbstractC3242t.d(new C3238o(arrayList), new Ra.l(abstractC2965B, 6, kVar), abstractC4326r4, rVar2, (i25 >> 6) & 896, 0);
                            rVar2.t(false);
                        } else {
                            if (abstractC2965B instanceof fa.q) {
                                rVar2.W(1522256323);
                                rVar = rVar2;
                                i(str, str2, (fa.q) abstractC2965B, kVar, abstractC4326r4, z17, rVar2, (i25 & 14) | i15 | i14 | (i25 & 57344) | (i25 & 458752), 0);
                                rVar.t(false);
                            } else {
                                rVar = rVar2;
                                rVar.W(1522256590);
                                rVar.t(false);
                            }
                            z12 = z17;
                            abstractC4326r3 = abstractC4326r4;
                        }
                    }
                }
                rVar = rVar2;
                z12 = z17;
                abstractC4326r3 = abstractC4326r4;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new y.H(str, str2, abstractC2965B, kVar, abstractC4326r3, z12, i10, i11, 4);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 32;
        if (i13 == 0) {
        }
        if ((i12 & 374491) != 74898) {
        }
        if (i22 == 0) {
        }
        if (i13 == 0) {
        }
        C6182c0 c6182c02 = new C6182c0(str2);
        Boolean valueOf2 = Boolean.valueOf(z13);
        rVar2.W(1522253671);
        i14 = i12 & 7168;
        if (i14 != 2048) {
        }
        i15 = i12 & 112;
        if (i15 != 32) {
        }
        z16 = z14 | z15;
        K10 = rVar2.K();
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (!z16) {
        }
        K10 = new C3244v(kVar, str2, null);
        rVar2.h0(K10);
        rVar2.t(false);
        int i232 = (i12 >> 3) & 14;
        AbstractC1734s.d(c6182c02, valueOf2, (wf.n) K10, rVar2);
        if (!(abstractC2965B instanceof fa.t)) {
        }
        rVar = rVar2;
        z12 = z17;
        abstractC4326r3 = abstractC4326r4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(w9.j jVar, C2969F c2969f, boolean z10, wf.k kVar, wf.k kVar2, AbstractC4326r abstractC4326r, sb.x xVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        sb.x xVar2;
        sb.x xVar3;
        AbstractC4326r abstractC4326r3;
        int i13;
        sb.x xVar4;
        AbstractC4326r abstractC4326r4;
        Ad.g y02;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageContextMenu");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1031890970);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(jVar)) {
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
            if (rVar.g(c2969f)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.h(z10)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar.i(kVar)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (rVar.i(kVar2)) {
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
            if (rVar.g(abstractC4326r2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
            if ((3670016 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    xVar2 = xVar;
                    if (rVar.g(xVar2)) {
                        i14 = 1048576;
                        i12 |= i14;
                    }
                } else {
                    xVar2 = xVar;
                }
                i14 = 524288;
                i12 |= i14;
            } else {
                xVar2 = xVar;
            }
            if ((2995931 & i12) != 599186 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
                xVar3 = xVar2;
            } else {
                rVar.R();
                if ((i10 & 1) == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                    }
                    i13 = i12;
                    abstractC4326r4 = abstractC4326r2;
                } else {
                    if (i21 == 0) {
                        a5 = abstractC4326r2;
                    }
                    if ((i11 & 64) == 0) {
                        rVar.W(-490350905);
                        Context context = (Context) rVar.m(H0.Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar.m(Ad.k.f814a);
                        androidx.lifecycle.e0 a10 = m2.b.a(rVar);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC4326r abstractC4326r5 = a5;
                            AbstractC0405d b10 = d10.b(sb.x.class);
                            AbstractC0405d b11 = d10.b(sb.w.class);
                            rVar.W(608026872);
                            boolean g10 = rVar.g(b10) | rVar.g(b11) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                            Object K10 = rVar.K();
                            if (g10 || K10 == C1723m.f22654Y) {
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(sb.w.class), d10.b(sb.x.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(sb.x.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K10 = y02;
                                rVar.h0(K10);
                            }
                            rVar.t(false);
                            rVar.t(false);
                            abstractC4326r4 = abstractC4326r5;
                            xVar4 = (sb.x) ((Ad.g) K10);
                            i13 = i12 & (-3670017);
                            rVar.u();
                            int i22 = (i13 & 14) | 384 | ((i13 >> 12) & 112);
                            AbstractC4326r abstractC4326r6 = abstractC4326r4;
                            K8.d.Q(jVar, abstractC4326r6, R4.b.X(rVar, 1369112952, new C3246x(new C3227d(kVar, jVar, 1), c2969f, z10, new C3240q(xVar4, jVar, 1), L4.a.M0(ExperimentKey.AudioMessageEnabled.INSTANCE, rVar), jVar, kVar2)), rVar, i22, 0);
                            abstractC4326r3 = abstractC4326r4;
                            xVar3 = xVar4;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        abstractC4326r4 = a5;
                        i13 = i12;
                    }
                }
                xVar4 = xVar2;
                rVar.u();
                int i222 = (i13 & 14) | 384 | ((i13 >> 12) & 112);
                AbstractC4326r abstractC4326r62 = abstractC4326r4;
                K8.d.Q(jVar, abstractC4326r62, R4.b.X(rVar, 1369112952, new C3246x(new C3227d(kVar, jVar, 1), c2969f, z10, new C3240q(xVar4, jVar, 1), L4.a.M0(ExperimentKey.AudioMessageEnabled.INSTANCE, rVar), jVar, kVar2)), rVar, i222, 0);
                abstractC4326r3 = abstractC4326r4;
                xVar3 = xVar4;
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new y.I(jVar, c2969f, z10, kVar, kVar2, abstractC4326r3, xVar3, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((3670016 & i10) != 0) {
        }
        if ((2995931 & i12) != 599186) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i21 == 0) {
        }
        if ((i11 & 64) == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0137  */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(C3931c c3931c, C3931c c3931c2, AbstractC2313e abstractC2313e, wf.k kVar, AbstractC4326r abstractC4326r, boolean z10, boolean z11, wf.k kVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        wf.k kVar3;
        boolean z12;
        boolean z13;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        AbstractC4326r abstractC4326r3;
        boolean z14;
        boolean z15;
        C3247y c3247y;
        Object K10;
        io.sentry.hints.i iVar;
        Object w10;
        Throwable th2;
        int i16;
        AbstractC4326r abstractC4326r4;
        boolean z16;
        boolean z17;
        C4323o c4323o;
        Z.r rVar2;
        ?? r22;
        int i17;
        p0 p0Var;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        AbstractC3557B.c0("conversationItem", abstractC2313e);
        AbstractC3557B.c0("onIntent", kVar);
        C4323o c4323o2 = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageListItem");
        Z.r rVar3 = (Z.r) abstractC1725n;
        rVar3.X(-156614537);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar3.g(c3931c)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i12 = i25 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar3.g(c3931c2)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i12 |= i24;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar3.g(abstractC2313e)) {
                i23 = 256;
            } else {
                i23 = 128;
            }
            i12 |= i23;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar3.i(kVar)) {
                i22 = 2048;
            } else {
                i22 = 1024;
            }
            i12 |= i22;
        }
        int i26 = i11 & 16;
        if (i26 != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (rVar3.g(abstractC4326r)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i12 |= i21;
            i13 = i11 & 32;
            if (i13 == 0) {
                i12 |= 196608;
            } else if ((458752 & i10) == 0) {
                if (rVar3.h(z10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
                i14 = i11 & 64;
                if (i14 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (rVar3.h(z11)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (rVar3.i(kVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                int i27 = i12;
                if ((i12 & 23967451) != 4793490 && rVar3.B()) {
                    rVar3.P();
                    abstractC4326r2 = abstractC4326r;
                    z13 = z10;
                    z12 = z11;
                    kVar3 = kVar2;
                    rVar = rVar3;
                } else {
                    if (i26 != 0) {
                        abstractC4326r3 = a5;
                    } else {
                        abstractC4326r3 = abstractC4326r;
                    }
                    if (i13 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i15 != 0) {
                        c3247y = C3247y.f31534Y;
                    } else {
                        c3247y = kVar2;
                    }
                    rVar3.W(-892577994);
                    K10 = rVar3.K();
                    iVar = C1723m.f22654Y;
                    if (K10 == iVar) {
                        K10 = new w9.j(null, 3);
                        rVar3.h0(K10);
                    }
                    w9.j jVar = (w9.j) K10;
                    w10 = AbstractC0044t0.w(rVar3, false, -892577936);
                    if (w10 == iVar) {
                        w10 = new C5100b();
                        rVar3.h0(w10);
                    }
                    C5100b c5100b = (C5100b) w10;
                    rVar3.t(false);
                    u9.b C02 = r9.y.C0();
                    rVar3.W(-892577805);
                    if (z15) {
                        i16 = i27;
                        abstractC4326r4 = abstractC4326r3;
                        th2 = null;
                        abstractC4326r3 = androidx.compose.foundation.a.i(abstractC4326r4, c5100b, (AbstractC0040r0) rVar3.m(AbstractC0048v0.f314a), true, null, null, null, new C6677Q(C02, kVar, c5100b, jVar, 5), null, C3225b.f31386Z);
                    } else {
                        i16 = i27;
                        abstractC4326r4 = abstractC4326r3;
                        th2 = null;
                    }
                    AbstractC4326r a10 = AbstractC4194d.a((G0.X) a5, abstractC4326r3);
                    rVar3.t(false);
                    rVar3.W(733328855);
                    E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar3);
                    rVar3.W(-1323940314);
                    int i28 = rVar3.P;
                    AbstractC1732q0 p10 = rVar3.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i29 = androidx.compose.ui.layout.a.i(a10);
                    z16 = rVar3.f22696a instanceof AbstractC1707e;
                    if (z16) {
                        rVar3.Z();
                        if (rVar3.f22695O) {
                            rVar3.o(c0582k);
                        } else {
                            rVar3.k0();
                        }
                        C0581j c0581j = C0583l.f5808f;
                        U3.f.n0(rVar3, c10, c0581j);
                        C0581j c0581j2 = C0583l.f5807e;
                        U3.f.n0(rVar3, p10, c0581j2);
                        C0581j c0581j3 = C0583l.f5809g;
                        if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i28))) {
                            AbstractC6463a.q(i28, rVar3, i28, c0581j3);
                        }
                        AbstractC6463a.r(0, i29, new L0(rVar3), rVar3, 2058660585);
                        rVar3.W(-483455358);
                        C0423g c0423g = AbstractC0429m.f3909c;
                        C4316h c4316h = C4310b.f37705r0;
                        E0.N a11 = AbstractC0440y.a(c0423g, c4316h, rVar3);
                        rVar3.W(-1323940314);
                        int i30 = rVar3.P;
                        AbstractC4326r abstractC4326r5 = abstractC4326r4;
                        AbstractC1732q0 p11 = rVar3.p();
                        C3288a i31 = androidx.compose.ui.layout.a.i(c4323o2);
                        if (z16) {
                            rVar3.Z();
                            if (rVar3.f22695O) {
                                rVar3.o(c0582k);
                            } else {
                                rVar3.k0();
                            }
                            U3.f.n0(rVar3, a11, c0581j);
                            U3.f.n0(rVar3, p11, c0581j2);
                            if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i30))) {
                                AbstractC6463a.q(i30, rVar3, i30, c0581j3);
                            }
                            AbstractC6463a.r(0, i31, new L0(rVar3), rVar3, 2058660585);
                            AbstractC4326r a12 = io.sentry.compose.b.a("MessageListItem");
                            float f6 = p9.r.f42841e;
                            float f10 = p9.r.f42840d;
                            AbstractC4326r s10 = androidx.compose.foundation.layout.a.s(c4323o2, f6, f10);
                            rVar3.W(-483455358);
                            E0.N a13 = AbstractC0440y.a(c0423g, c4316h, rVar3);
                            rVar3.W(-1323940314);
                            int i32 = rVar3.P;
                            AbstractC1732q0 p12 = rVar3.p();
                            C3288a i33 = androidx.compose.ui.layout.a.i(s10);
                            if (z16) {
                                rVar3.Z();
                                if (rVar3.f22695O) {
                                    rVar3.o(c0582k);
                                } else {
                                    rVar3.k0();
                                }
                                U3.f.n0(rVar3, a13, c0581j);
                                U3.f.n0(rVar3, p12, c0581j2);
                                if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i32))) {
                                    AbstractC6463a.q(i32, rVar3, i32, c0581j3);
                                }
                                AbstractC6463a.r(0, i33, new L0(rVar3), rVar3, 2058660585);
                                j(c3931c, c3931c2, abstractC2313e.e(), io.sentry.compose.b.a("MessageListItem"), C6190g0.a(abstractC2313e.c().f30023p), false, rVar3, (i16 & 14) | (i16 & 112), 40);
                                AbstractC4326r p13 = androidx.compose.foundation.layout.e.p(androidx.compose.foundation.layout.e.b(androidx.compose.foundation.layout.a.v(c4323o2, f31358b + f10, 0.0f, 0.0f, 0.0f, 14), 0.0f, f31359c, 1), C4310b.f37699l0);
                                int i34 = i16 >> 6;
                                b(abstractC2313e, kVar, p13, rVar3, (i34 & 14) | (i34 & 112), 0);
                                AbstractC6463a.v(rVar3, false, true, false, false);
                                List list = abstractC2313e.c().f30030w;
                                rVar3.W(1711276000);
                                if (!list.isEmpty()) {
                                    r22 = 0;
                                    rVar2 = rVar3;
                                    c4323o = c4323o2;
                                    z17 = true;
                                    i17 = i16;
                                    a(abstractC2313e.c().f30009b, list, kVar, a12, rVar2, ((i16 >> 3) & 896) | 64, 8);
                                } else {
                                    r22 = 0;
                                    rVar2 = rVar3;
                                    c4323o = c4323o2;
                                    z17 = true;
                                    i17 = i16;
                                }
                                rVar2.t(r22);
                                rVar2.W(958555232);
                                if (abstractC2313e.c().f30018k || abstractC2313e.c().f30019l) {
                                    AbstractC4326r a14 = AbstractC4194d.a((G0.X) a12, androidx.compose.foundation.layout.a.r(c4323o, f6));
                                    C2969F c11 = abstractC2313e.c();
                                    AbstractC3557B.c0("<this>", c11);
                                    if (c11.f30018k) {
                                        p0Var = p0.f31500Y;
                                    } else if (c11.f30019l) {
                                        p0Var = p0.f31501Z;
                                    } else {
                                        p0Var = p0.f31502h0;
                                    }
                                    int i35 = r22 == true ? 1 : 0;
                                    int i36 = r22 == true ? 1 : 0;
                                    K8.d.k(p0Var, a14, rVar2, i35, r22);
                                }
                                AbstractC6463a.v(rVar2, r22, r22, z17, r22);
                                rVar2.t(r22);
                                int i37 = i17 >> 9;
                                f(jVar, abstractC2313e.c(), z14, kVar, c3247y, c4323o, null, rVar2, (i17 & 7168) | (i37 & 896) | (i37 & 57344), 96);
                                AbstractC6463a.v(rVar2, r22, z17, r22, r22);
                                abstractC4326r2 = abstractC4326r5;
                                z13 = z14;
                                z12 = z15;
                                kVar3 = c3247y;
                                rVar = rVar2;
                            } else {
                                R4.b.r1();
                                throw th2;
                            }
                        } else {
                            R4.b.r1();
                            throw th2;
                        }
                    } else {
                        R4.b.r1();
                        throw th2;
                    }
                }
                C1741v0 v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C3248z(c3931c, c3931c2, abstractC2313e, kVar, abstractC4326r2, z13, z12, kVar3, i10, i11);
                    return;
                }
                return;
            }
            i14 = i11 & 64;
            if (i14 != 0) {
            }
            i15 = i11 & 128;
            if (i15 != 0) {
            }
            int i272 = i12;
            if ((i12 & 23967451) != 4793490) {
            }
            if (i26 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            rVar3.W(-892577994);
            K10 = rVar3.K();
            iVar = C1723m.f22654Y;
            if (K10 == iVar) {
            }
            w9.j jVar2 = (w9.j) K10;
            w10 = AbstractC0044t0.w(rVar3, false, -892577936);
            if (w10 == iVar) {
            }
            C5100b c5100b2 = (C5100b) w10;
            rVar3.t(false);
            u9.b C022 = r9.y.C0();
            rVar3.W(-892577805);
            if (z15) {
            }
            AbstractC4326r a102 = AbstractC4194d.a((G0.X) a5, abstractC4326r3);
            rVar3.t(false);
            rVar3.W(733328855);
            E0.N c102 = AbstractC0434s.c(C4310b.f37693Y, false, rVar3);
            rVar3.W(-1323940314);
            int i282 = rVar3.P;
            AbstractC1732q0 p102 = rVar3.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k2 = C0583l.f5804b;
            C3288a i292 = androidx.compose.ui.layout.a.i(a102);
            z16 = rVar3.f22696a instanceof AbstractC1707e;
            if (z16) {
            }
        }
        i13 = i11 & 32;
        if (i13 == 0) {
        }
        i14 = i11 & 64;
        if (i14 != 0) {
        }
        i15 = i11 & 128;
        if (i15 != 0) {
        }
        int i2722 = i12;
        if ((i12 & 23967451) != 4793490) {
        }
        if (i26 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        rVar3.W(-892577994);
        K10 = rVar3.K();
        iVar = C1723m.f22654Y;
        if (K10 == iVar) {
        }
        w9.j jVar22 = (w9.j) K10;
        w10 = AbstractC0044t0.w(rVar3, false, -892577936);
        if (w10 == iVar) {
        }
        C5100b c5100b22 = (C5100b) w10;
        rVar3.t(false);
        u9.b C0222 = r9.y.C0();
        rVar3.W(-892577805);
        if (z15) {
        }
        AbstractC4326r a1022 = AbstractC4194d.a((G0.X) a5, abstractC4326r3);
        rVar3.t(false);
        rVar3.W(733328855);
        E0.N c1022 = AbstractC0434s.c(C4310b.f37693Y, false, rVar3);
        rVar3.W(-1323940314);
        int i2822 = rVar3.P;
        AbstractC1732q0 p1022 = rVar3.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k22 = C0583l.f5804b;
        C3288a i2922 = androidx.compose.ui.layout.a.i(a1022);
        z16 = rVar3.f22696a instanceof AbstractC1707e;
        if (z16) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(String str, fa.n nVar, boolean z10, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageMarkdownContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1357459705);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(nVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.h(z10)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar.i(kVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        int i18 = i11 & 16;
        if (i18 != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
            if ((46811 & i12) != 9362 && rVar.B()) {
                rVar.P();
            } else {
                if (i18 == 0) {
                    a5 = abstractC4326r2;
                }
                int i19 = ((i12 >> 12) & 14) | 384;
                T8.e.a(a5, n(rVar), R4.b.X(rVar, 109436892, new C0055z(nVar, kVar, str, z10)), rVar, i19, 0);
                abstractC4326r2 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new p9.t(str, nVar, z10, kVar, abstractC4326r2, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((46811 & i12) != 9362) {
        }
        if (i18 == 0) {
        }
        int i192 = ((i12 >> 12) & 14) | 384;
        T8.e.a(a5, n(rVar), R4.b.X(rVar, 109436892, new C0055z(nVar, kVar, str, z10)), rVar, i192, 0);
        abstractC4326r2 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String str, String str2, fa.q qVar, wf.k kVar, AbstractC4326r abstractC4326r, boolean z10, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        int i18;
        int i19;
        C6168C c6168c;
        int i20;
        AbstractC3557B.c0("messageId", str2);
        AbstractC3557B.c0("content", qVar);
        AbstractC3557B.c0("onIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageMultimodalContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2147292305);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (str != null) {
                c6168c = new C6168C(str);
            } else {
                c6168c = null;
            }
            if (rVar.g(c6168c)) {
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
            if (rVar.g(str2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.g(qVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar.i(kVar)) {
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
            i13 = i11 & 32;
            if (i13 == 0) {
                i12 |= 196608;
            } else if ((458752 & i10) == 0) {
                z11 = z10;
                if (rVar.h(z11)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
                i15 = i12;
                if ((374491 & i15) != 74898 && rVar.B()) {
                    rVar.P();
                    z12 = z11;
                    abstractC4326r3 = abstractC4326r2;
                } else {
                    if (i21 != 0) {
                        abstractC4326r4 = a5;
                    } else {
                        abstractC4326r4 = abstractC4326r2;
                    }
                    boolean z15 = false;
                    if (i13 != 0) {
                        z13 = false;
                    } else {
                        z13 = z11;
                    }
                    C0421f c0421f = AbstractC0429m.f3907a;
                    C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
                    rVar.W(-483455358);
                    E0.N a10 = AbstractC0440y.a(g10, C4310b.f37705r0, rVar);
                    rVar.W(-1323940314);
                    int i22 = rVar.P;
                    AbstractC1732q0 p10 = rVar.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i23 = androidx.compose.ui.layout.a.i(abstractC4326r4);
                    if (rVar.f22696a instanceof AbstractC1707e) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, a10, C0583l.f5808f);
                        U3.f.n0(rVar, p10, C0583l.f5807e);
                        C0581j c0581j = C0583l.f5809g;
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i22))) {
                            AbstractC6463a.q(i22, rVar, i22, c0581j);
                        }
                        AbstractC6463a.r(0, i23, new L0(rVar), rVar, 2058660585);
                        rVar.W(1929907717);
                        List list = qVar.f30076c;
                        int i24 = 0;
                        for (Object obj : list) {
                            int i25 = i24 + 1;
                            if (i24 >= 0) {
                                AbstractC2965B abstractC2965B = (AbstractC2965B) obj;
                                if (i24 == AbstractC4344b.u0(list) && z13) {
                                    z14 = true;
                                } else {
                                    z14 = z15;
                                }
                                C2973b c2973b = AbstractC2965B.Companion;
                                e(str, str2, abstractC2965B, kVar, null, z14, rVar, (i15 & 14) | (i15 & 112) | (i15 & 7168), 16);
                                i24 = i25;
                                i15 = i15;
                                list = list;
                                z15 = false;
                            } else {
                                AbstractC4344b.d1();
                                throw null;
                            }
                        }
                        boolean z16 = z15;
                        AbstractC6463a.v(rVar, z16, z16, true, z16);
                        rVar.t(z16);
                        abstractC4326r3 = abstractC4326r4;
                        z12 = z13;
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                C1741v0 v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new y.H(str, str2, qVar, kVar, abstractC4326r3, z12, i10, i11, 5);
                    return;
                }
                return;
            }
            z11 = z10;
            i15 = i12;
            if ((374491 & i15) != 74898) {
            }
            if (i21 != 0) {
            }
            boolean z152 = false;
            if (i13 != 0) {
            }
            C0421f c0421f2 = AbstractC0429m.f3907a;
            C0426j g102 = AbstractC0429m.g(p9.r.f42840d);
            rVar.W(-483455358);
            E0.N a102 = AbstractC0440y.a(g102, C4310b.f37705r0, rVar);
            rVar.W(-1323940314);
            int i222 = rVar.P;
            AbstractC1732q0 p102 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k2 = C0583l.f5804b;
            C3288a i232 = androidx.compose.ui.layout.a.i(abstractC4326r4);
            if (rVar.f22696a instanceof AbstractC1707e) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 32;
        if (i13 == 0) {
        }
        z11 = z10;
        i15 = i12;
        if ((374491 & i15) != 74898) {
        }
        if (i21 != 0) {
        }
        boolean z1522 = false;
        if (i13 != 0) {
        }
        C0421f c0421f22 = AbstractC0429m.f3907a;
        C0426j g1022 = AbstractC0429m.g(p9.r.f42840d);
        rVar.W(-483455358);
        E0.N a1022 = AbstractC0440y.a(g1022, C4310b.f37705r0, rVar);
        rVar.W(-1323940314);
        int i2222 = rVar.P;
        AbstractC1732q0 p1022 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k22 = C0583l.f5804b;
        C3288a i2322 = androidx.compose.ui.layout.a.i(abstractC4326r4);
        if (rVar.f22696a instanceof AbstractC1707e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(C3931c c3931c, C3931c c3931c2, EnumC2971H enumC2971H, AbstractC4326r abstractC4326r, EnumC6192h0 enumC6192h0, boolean z10, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        EnumC6192h0 enumC6192h02;
        int i14;
        boolean z11;
        boolean z12;
        EnumC6192h0 enumC6192h03;
        Z.r rVar;
        AbstractC4326r abstractC4326r3;
        EnumC6192h0 enumC6192h04;
        boolean z13;
        String str;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageSender");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(294564205);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(c3931c)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.g(c3931c2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar2.g(enumC2971H)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        int i22 = i11 & 8;
        if (i22 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i12 |= i18;
            i13 = i11 & 16;
            if (i13 == 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                enumC6192h02 = enumC6192h0;
                if (rVar2.g(enumC6192h02)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
                i14 = i11 & 32;
                if (i14 != 0) {
                    i12 |= 196608;
                } else if ((458752 & i10) == 0) {
                    z11 = z10;
                    if (rVar2.h(z11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                    if ((i12 & 374491) != 74898 && rVar2.B()) {
                        rVar2.P();
                        enumC6192h03 = enumC6192h02;
                        rVar = rVar2;
                        z12 = z11;
                    } else {
                        if (i22 == 0) {
                            abstractC4326r3 = a5;
                        } else {
                            abstractC4326r3 = abstractC4326r2;
                        }
                        String str2 = null;
                        if (i13 == 0) {
                            enumC6192h04 = null;
                        } else {
                            enumC6192h04 = enumC6192h02;
                        }
                        if (i14 == 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        C0421f c0421f = AbstractC0429m.f3907a;
                        C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
                        C4317i c4317i = C4310b.f37703p0;
                        rVar2.W(693286680);
                        E0.N a10 = E.p0.a(g10, c4317i, rVar2);
                        rVar2.W(-1323940314);
                        int i23 = rVar2.P;
                        AbstractC1732q0 p10 = rVar2.p();
                        AbstractC0584m.f5811i.getClass();
                        C0582k c0582k = C0583l.f5804b;
                        C3288a i24 = androidx.compose.ui.layout.a.i(abstractC4326r3);
                        if (!(rVar2.f22696a instanceof AbstractC1707e)) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, a10, C0583l.f5808f);
                            U3.f.n0(rVar2, p10, C0583l.f5807e);
                            C0581j c0581j = C0583l.f5809g;
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i23))) {
                                AbstractC6463a.q(i23, rVar2, i23, c0581j);
                            }
                            AbstractC6463a.r(0, i24, new L0(rVar2), rVar2, 2058660585);
                            AbstractC4326r a11 = io.sentry.compose.b.a("MessageSender");
                            r9.y.o(c3931c, c3931c2, enumC2971H, androidx.compose.ui.draw.a.b(Bi.c.I1(androidx.compose.foundation.layout.e.j(c4323o, f31358b), z13, false), K.f.f9317a), enumC6192h04, rVar2, (i12 & 14) | (i12 & 112) | (i12 & 896) | (57344 & i12), 0);
                            int ordinal = enumC2971H.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    rVar2.W(1960697177);
                                    rVar2.t(false);
                                    str = enumC2971H.name();
                                } else {
                                    rVar2.W(1960696470);
                                    if (c3931c != null) {
                                        str2 = c3931c.f36092a;
                                    }
                                    if (str2 != null) {
                                        rVar2.W(1960696571);
                                        rVar2.t(false);
                                        str = c3931c.f36092a;
                                        if (str == null) {
                                            str = "";
                                        }
                                    } else if (c3931c != null && c3931c.f36096e) {
                                        str = AbstractC4194d.u(rVar2, 1960696658, R.string.anonymous_gizmo, rVar2, false);
                                    } else {
                                        str = AbstractC4194d.u(rVar2, 1960696755, R.string.conversations_role_assistant, rVar2, false);
                                    }
                                    rVar2.t(false);
                                }
                            } else {
                                rVar2.W(1960696865);
                                if (c3931c2 != null && !c3931c2.f36094c) {
                                    i15 = R.string.conversations_role_user_current;
                                } else {
                                    i15 = R.string.conversations_role_user;
                                }
                                str = Ng.H.v(i15, rVar2);
                                rVar2.t(false);
                            }
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            AbstractC3557B.b0("toUpperCase(...)", upperCase);
                            rVar = rVar2;
                            j4.b(upperCase, AbstractC4194d.a((G0.X) a11, Bi.c.I1(c4323o, z13, false)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((p4) rVar2.m(q4.f20361a)).f20313n, rVar, 0, 3072, 57340);
                            AbstractC6463a.v(rVar, false, true, false, false);
                            z12 = z13;
                            abstractC4326r2 = abstractC4326r3;
                            enumC6192h03 = enumC6192h04;
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    }
                    C1741v0 v10 = rVar.v();
                    if (v10 != null) {
                        v10.f22739d = new y.H(c3931c, c3931c2, enumC2971H, abstractC4326r2, enumC6192h03, z12, i10, i11);
                        return;
                    }
                    return;
                }
                z11 = z10;
                if ((i12 & 374491) != 74898) {
                }
                if (i22 == 0) {
                }
                String str22 = null;
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                C0421f c0421f2 = AbstractC0429m.f3907a;
                C0426j g102 = AbstractC0429m.g(p9.r.f42840d);
                C4317i c4317i2 = C4310b.f37703p0;
                rVar2.W(693286680);
                E0.N a102 = E.p0.a(g102, c4317i2, rVar2);
                rVar2.W(-1323940314);
                int i232 = rVar2.P;
                AbstractC1732q0 p102 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i242 = androidx.compose.ui.layout.a.i(abstractC4326r3);
                if (!(rVar2.f22696a instanceof AbstractC1707e)) {
                }
            }
            enumC6192h02 = enumC6192h0;
            i14 = i11 & 32;
            if (i14 != 0) {
            }
            z11 = z10;
            if ((i12 & 374491) != 74898) {
            }
            if (i22 == 0) {
            }
            String str222 = null;
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            C0421f c0421f22 = AbstractC0429m.f3907a;
            C0426j g1022 = AbstractC0429m.g(p9.r.f42840d);
            C4317i c4317i22 = C4310b.f37703p0;
            rVar2.W(693286680);
            E0.N a1022 = E.p0.a(g1022, c4317i22, rVar2);
            rVar2.W(-1323940314);
            int i2322 = rVar2.P;
            AbstractC1732q0 p1022 = rVar2.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k22 = C0583l.f5804b;
            C3288a i2422 = androidx.compose.ui.layout.a.i(abstractC4326r3);
            if (!(rVar2.f22696a instanceof AbstractC1707e)) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 16;
        if (i13 == 0) {
        }
        enumC6192h02 = enumC6192h0;
        i14 = i11 & 32;
        if (i14 != 0) {
        }
        z11 = z10;
        if ((i12 & 374491) != 74898) {
        }
        if (i22 == 0) {
        }
        String str2222 = null;
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        C0421f c0421f222 = AbstractC0429m.f3907a;
        C0426j g10222 = AbstractC0429m.g(p9.r.f42840d);
        C4317i c4317i222 = C4310b.f37703p0;
        rVar2.W(693286680);
        E0.N a10222 = E.p0.a(g10222, c4317i222, rVar2);
        rVar2.W(-1323940314);
        int i23222 = rVar2.P;
        AbstractC1732q0 p10222 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k222 = C0583l.f5804b;
        C3288a i24222 = androidx.compose.ui.layout.a.i(abstractC4326r3);
        if (!(rVar2.f22696a instanceof AbstractC1707e)) {
        }
    }

    public static final void k(AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        int i13;
        AbstractC4326r a5 = io.sentry.compose.b.a("PlaceholderMessageContent");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-1108218615);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 14) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar2.B()) {
            rVar2.P();
            a5 = abstractC4326r2;
            rVar = rVar2;
        } else {
            if (i14 == 0) {
                a5 = abstractC4326r2;
            }
            rVar = rVar2;
            j4.b("\u2b24", androidx.compose.ui.draw.a.i(a5, ((Number) AbstractC6696f.f(AbstractC6696f.t("PulsatingTransition", rVar2, 0), 1.0f, 1.3f, AbstractC6696f.r(AbstractC6696f.v(600, 0, null, 6), 2, 4), "PulsatingAnimation", rVar2, 29112, 0).f51162i0.getValue()).floatValue()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 6, 0, 131068);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new d9.o(a5, i10, i11, 9);
        }
    }

    public static final void l(fa.n nVar, AbstractC6216a abstractC6216a, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1664573145);
        if ((i10 & 14) == 0) {
            if (rVar.g(nVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.i(abstractC6216a)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            Ra.l lVar = new Ra.l((AbstractC0696o0) rVar.m(AbstractC0701r0.f7001d), 5, abstractC6216a);
            int i14 = 1;
            ArrayList m10 = m(nVar.a(), true);
            ArrayList arrayList = new ArrayList();
            Iterator it = m10.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof wi.h) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (Lg.n.f2(((wi.h) next2).f48595j, "latex")) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                Object next3 = it3.next();
                int i16 = i15 + 1;
                if (i15 >= 0) {
                    Df.H.g(R4.b.X(rVar, 1804097969, new S8.U(arrayList2, i15, i14)), new I9.B(lVar, 14, (wi.h) next3), null, AbstractC3232i.f31460n, null, false, null, null, null, rVar, 3078, 500);
                    i15 = i16;
                    arrayList2 = arrayList2;
                    i14 = i14;
                    lVar = lVar;
                } else {
                    AbstractC4344b.d1();
                    throw null;
                }
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0053y(nVar, abstractC6216a, i10, 16);
        }
    }

    public static final ArrayList m(wi.s sVar, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            arrayList.add(sVar);
        }
        for (wi.s sVar2 = sVar.f48609b; sVar2 != null; sVar2 = sVar2.f48612e) {
            arrayList.add(sVar2);
            wi.s sVar3 = sVar2.f48609b;
            if (sVar3 != null) {
                arrayList.addAll(m(sVar3, false));
            }
        }
        return arrayList;
    }

    public static final S8.N n(AbstractC1725n abstractC1725n) {
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z0.n nVar = new Z0.n(f31357a);
        S0.E e10 = S0.s.f16044h0;
        Z.r rVar = (Z.r) abstractC1725n;
        long j6 = ((p4) rVar.m(q4.f20361a)).f20310k.f12487a.f12629b;
        m1 m1Var = R0.f19593a;
        return new S8.N(nVar, new U8.q(new N0.y(((P0) rVar.m(m1Var)).f19535s, j6, null, null, null, e10, null, 0L, null, null, null, 0L, null, null, 65500), new N0.y(((P0) rVar.m(m1Var)).f19526j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, Y0.j.f22031b, null, 61438), 63), 126);
    }
}
