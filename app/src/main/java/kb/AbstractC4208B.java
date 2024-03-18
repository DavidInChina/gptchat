package kb;

import A.AbstractC0044t0;
import A.C0033n0;
import A.C0051x;
import Df.AbstractC0405d;
import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.C0424h;
import E.C0439x;
import E.i0;
import E.p0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H.L;
import H0.AbstractC0701r0;
import H0.E0;
import H0.Z;
import W.AbstractC1577l0;
import W.C1;
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
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.lifecycle.e0;
import com.openai.chatgpt.R;
import d1.C2568c;
import db.C2615c;
import gb.C3234k;
import gd.AbstractC3256b;
import h0.C3288a;
import i0.C3455b;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.C3960j;
import jf.C3961k;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import l8.AbstractC4344b;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import o6.C4929h;
import of.EnumC5000a;
import p0.C5035b;
import p9.AbstractC5102d;
import pf.AbstractC5156c;
import pf.AbstractC5163j;
import r0.C5334A;
import wd.C6209w;
import wd.s0;
import wd.u0;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import yf.AbstractC6583a;

/* renamed from: kb.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4208B {

    /* renamed from: a  reason: collision with root package name */
    public static final long f37218a = r0.r.f44258f;

    /* renamed from: b  reason: collision with root package name */
    public static final float f37219b = 5;

    /* renamed from: c  reason: collision with root package name */
    public static final float f37220c = 24;

    /* renamed from: d  reason: collision with root package name */
    public static final long f37221d = r0.r.b(r0.r.f44256d, 0.38f);

    /* renamed from: e  reason: collision with root package name */
    public static final C5334A f37222e;

    static {
        r0.r rVar = new r0.r(r0.r.f44262j);
        long j6 = AbstractC5102d.f42764a;
        f37222e = C5035b.c(AbstractC4344b.G0(rVar, new r0.r(r0.r.b(j6, 0.5f)), new r0.r(r0.r.b(j6, 0.5f))));
    }

    public static final void a(String str, int i10, AbstractC6216a abstractC6216a, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        AbstractC3557B.c0("onClick", abstractC6216a);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-142839316);
        if ((i11 & 14) == 0) {
            if (rVar.g(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (rVar.e(i10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (rVar.i(abstractC6216a)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            rVar.W(946738156);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object K10 = rVar.K();
            if (z10 || K10 == C1723m.f22654Y) {
                K10 = new C0033n0(abstractC6216a, 29);
                rVar.h0(K10);
            }
            rVar.t(false);
            R4.b.o((AbstractC6216a) K10, androidx.compose.foundation.layout.e.j(c4323o, p9.r.f42847k), false, null, null, R4.b.X(rVar, -1282347473, new Q8.e(i10, str)), rVar, 196608, 28);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new F.o(str, i10, abstractC6216a, i11, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, boolean z10, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3557B.c0("fileId", str);
        AbstractC3557B.c0("onInputIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("BottomImageActionBar");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1470640258);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(str)) {
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
            if (rVar.h(z10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.i(kVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
            if ((i12 & 5851) != 1170 && rVar.B()) {
                rVar.P();
            } else {
                if (i17 != 0) {
                    abstractC4326r2 = a5;
                }
                AbstractC4326r s10 = androidx.compose.foundation.layout.a.s(androidx.compose.foundation.a.c(androidx.compose.foundation.layout.e.d(abstractC4326r2, 1.0f), f37222e), p9.r.f42840d, p9.r.f42839c);
                C0424h c0424h = AbstractC0429m.f3912f;
                C4317i c4317i = C4310b.f37703p0;
                rVar.W(693286680);
                N a10 = p0.a(c0424h, c4317i, rVar);
                rVar.W(-1323940314);
                int i18 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i19 = androidx.compose.ui.layout.a.i(s10);
                if (!(rVar.f22696a instanceof AbstractC1707e)) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, a10, C0583l.f5808f);
                    U3.f.n0(rVar, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i18))) {
                        AbstractC6463a.q(i18, rVar, i18, c0581j);
                    }
                    AbstractC6463a.r(0, i19, new L0(rVar), rVar, 2058660585);
                    rVar.W(-525216651);
                    io.sentry.hints.i iVar = C1723m.f22654Y;
                    if (z10) {
                        String v10 = Ng.H.v(R.string.image_action_edit, rVar);
                        rVar.W(-525216508);
                        int i20 = i12 & 896;
                        if (i20 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z18 = z16 | z15;
                        Object K10 = rVar.K();
                        if (z18 || K10 == iVar) {
                            K10 = new C2615c(kVar, str, 1);
                            rVar.h0(K10);
                        }
                        rVar.t(false);
                        a(v10, R.drawable.edit_gpt, (AbstractC6216a) K10, rVar, 0);
                        String v11 = Ng.H.v(R.string.image_action_replace, rVar);
                        rVar.W(-525216239);
                        if (i20 == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        Object K11 = rVar.K();
                        if (z17 || K11 == iVar) {
                            K11 = AbstractC0044t0.t(28, kVar, rVar);
                        }
                        rVar.t(false);
                        a(v11, R.drawable.inpaint, (AbstractC6216a) K11, rVar, 0);
                    }
                    rVar.t(false);
                    String v12 = Ng.H.v(R.string.image_action_save, rVar);
                    rVar.W(-525216006);
                    int i21 = i12 & 896;
                    if (i21 == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i22 = i12 & 14;
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z19 = z11 | z12;
                    Object K12 = rVar.K();
                    if (z19 || K12 == iVar) {
                        K12 = new C2615c(kVar, str, 2);
                        rVar.h0(K12);
                    }
                    rVar.t(false);
                    a(v12, R.drawable.download, (AbstractC6216a) K12, rVar, 0);
                    String v13 = Ng.H.v(R.string.image_action_Share, rVar);
                    rVar.W(-525215801);
                    if (i21 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i22 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z20 = z14 | z13;
                    Object K13 = rVar.K();
                    if (z20 || K13 == iVar) {
                        K13 = new C2615c(kVar, str, 3);
                        rVar.h0(K13);
                    }
                    rVar.t(false);
                    a(v13, R.drawable.share, (AbstractC6216a) K13, rVar, 0);
                    AbstractC6463a.v(rVar, false, true, false, false);
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v14 = rVar.v();
            if (v14 != null) {
                v14.f22739d = new C0439x(str, z10, kVar, abstractC4326r2, i10, i11, 3);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 5851) != 1170) {
        }
        if (i17 != 0) {
        }
        AbstractC4326r s102 = androidx.compose.foundation.layout.a.s(androidx.compose.foundation.a.c(androidx.compose.foundation.layout.e.d(abstractC4326r2, 1.0f), f37222e), p9.r.f42840d, p9.r.f42839c);
        C0424h c0424h2 = AbstractC0429m.f3912f;
        C4317i c4317i2 = C4310b.f37703p0;
        rVar.W(693286680);
        N a102 = p0.a(c0424h2, c4317i2, rVar);
        rVar.W(-1323940314);
        int i182 = rVar.P;
        AbstractC1732q0 p102 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i192 = androidx.compose.ui.layout.a.i(s102);
        if (!(rVar.f22696a instanceof AbstractC1707e)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [pf.j, wf.n] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Tc.f fVar, AbstractC4210D abstractC4210D, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4210D abstractC4210D2;
        AbstractC4210D abstractC4210D3;
        AbstractC4326r abstractC4326r;
        AbstractC4210D abstractC4210D4;
        int i13;
        int i14;
        boolean z10;
        Object K10;
        List<C3234k> list;
        ?? r32;
        kf.v vVar;
        boolean g10;
        Object K11;
        boolean g11;
        Object K12;
        Ad.g y02;
        int i15;
        int i16;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("ImageDetailScreen");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1704379672);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i10 | i16;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                abstractC4210D2 = abstractC4210D;
                if (rVar.g(abstractC4210D2)) {
                    i15 = 32;
                    i12 |= i15;
                }
            } else {
                abstractC4210D2 = abstractC4210D;
            }
            i15 = 16;
            i12 |= i15;
        } else {
            abstractC4210D2 = abstractC4210D;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
            abstractC4210D3 = abstractC4210D2;
        } else {
            rVar.R();
            int i17 = i10 & 1;
            io.sentry.hints.i iVar = C1723m.f22654Y;
            if (i17 != 0 && !rVar.A()) {
                rVar.P();
                if ((i11 & 2) != 0) {
                    i13 = i12 & (-113);
                    abstractC4326r = a5;
                    abstractC4210D4 = abstractC4210D2;
                    rVar.u();
                    C4209C c4209c = (C4209C) AbstractC4828h.z(abstractC4210D4.f808e, rVar).getValue();
                    AbstractC1734s.e(abstractC4210D4, new s(abstractC4210D4, fVar, (AbstractActivityC4532l) rVar.m(p9.m.f42797a), null), rVar);
                    AbstractC1734s.e(jf.y.f36177a, new AbstractC5163j(2, null), rVar);
                    rVar.W(826309881);
                    i14 = i13 & 112;
                    if ((i14 ^ 48) <= 32) {
                    }
                    z10 = false;
                    K10 = rVar.K();
                    if (!z10) {
                    }
                    kotlin.jvm.internal.j jVar = new kotlin.jvm.internal.j(1, abstractC4210D4, AbstractC4210D.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                    rVar.h0(jVar);
                    K10 = jVar;
                    AbstractC0408g abstractC0408g = (AbstractC0408g) K10;
                    rVar.t(false);
                    list = c4209c.f37225c;
                    if (list != null) {
                    }
                    if (r32 == 0) {
                    }
                    H.I a10 = L.a(c4209c.f37227e, new H.H(2, vVar), rVar);
                    H.A a11 = a10.f6549d;
                    Integer valueOf = Integer.valueOf(a11.f6527b.h());
                    rVar.W(826310174);
                    g10 = rVar.g(abstractC0408g) | rVar.g(a10);
                    K11 = rVar.K();
                    if (!g10) {
                    }
                    K11 = new u(abstractC0408g, a10, null);
                    rVar.h0(K11);
                    rVar.t(false);
                    AbstractC1734s.e(valueOf, (wf.n) K11, rVar);
                    String str = ((C6209w) vVar.get(a11.f6527b.h())).f48469a;
                    i0.r rVar2 = x9.n.f49685a;
                    AbstractC3557B.c0("image", str);
                    L0.u uVar = io.sentry.compose.b.f34309a;
                    rVar.W(1898901869);
                    Object[] objArr = {new C6209w(str)};
                    i0.r rVar3 = x9.n.f49685a;
                    rVar.W(-1123949028);
                    g11 = rVar.g(str);
                    K12 = rVar.K();
                    if (!g11) {
                    }
                    K12 = new C4929h(str, 9);
                    rVar.h0(K12);
                    rVar.t(false);
                    x9.l lVar = (x9.l) Ad.l.Y0(objArr, rVar3, (AbstractC6216a) K12, rVar, 4);
                    rVar.t(false);
                    lVar.f49680f.i(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f37219b));
                    lVar.f49681g.setValue(new r0.r(f37218a));
                    K8.d.f(fVar, abstractC4210D4, v.f37274Y, abstractC4326r, AbstractC5102d.f42764a, null, false, R4.b.X(rVar, 1834381304, new w(c4209c, a10, lVar, abstractC0408g, vVar)), rVar, i14 | (i13 & 14) | 12583304, 104);
                    abstractC4210D3 = abstractC4210D4;
                }
            } else if ((i11 & 2) != 0) {
                rVar.W(-490350905);
                Context context = (Context) rVar.m(Z.f6888b);
                boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                List list2 = (List) rVar.m(AbstractC3256b.f31580a);
                List list3 = (List) rVar.m(Ad.k.f814a);
                e0 a12 = m2.b.a(rVar);
                if (a12 != null) {
                    Ad.v vVar2 = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                    kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                    AbstractC0405d b10 = d10.b(AbstractC4210D.class);
                    AbstractC0405d b11 = d10.b(C4209C.class);
                    abstractC4326r = a5;
                    rVar.W(608026872);
                    boolean g12 = rVar.g(b11) | rVar.g(b10) | rVar.g(list2) | rVar.g(vVar2) | rVar.h(booleanValue);
                    Object K13 = rVar.K();
                    if (g12 || K13 == iVar) {
                        if (booleanValue) {
                            y02 = AbstractC4344b.z0(d10.b(C4209C.class), d10.b(AbstractC4210D.class), context, list3);
                        } else if (!booleanValue) {
                            y02 = AbstractC4344b.y0(d10.b(AbstractC4210D.class), a12, vVar2, list2);
                        } else {
                            throw new RuntimeException();
                        }
                        K13 = y02;
                        rVar.h0(K13);
                    }
                    rVar.t(false);
                    rVar.t(false);
                    abstractC4210D4 = (AbstractC4210D) ((Ad.g) K13);
                    i13 = i12 & (-113);
                    rVar.u();
                    C4209C c4209c2 = (C4209C) AbstractC4828h.z(abstractC4210D4.f808e, rVar).getValue();
                    AbstractC1734s.e(abstractC4210D4, new s(abstractC4210D4, fVar, (AbstractActivityC4532l) rVar.m(p9.m.f42797a), null), rVar);
                    AbstractC1734s.e(jf.y.f36177a, new AbstractC5163j(2, null), rVar);
                    rVar.W(826309881);
                    i14 = i13 & 112;
                    if (((i14 ^ 48) <= 32 && rVar.g(abstractC4210D4)) || (i13 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    K10 = rVar.K();
                    if (!z10 || K10 == iVar) {
                        kotlin.jvm.internal.j jVar2 = new kotlin.jvm.internal.j(1, abstractC4210D4, AbstractC4210D.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                        rVar.h0(jVar2);
                        K10 = jVar2;
                    }
                    AbstractC0408g abstractC0408g2 = (AbstractC0408g) K10;
                    rVar.t(false);
                    list = c4209c2.f37225c;
                    if (list != null) {
                        r32 = new ArrayList(AbstractC6583a.H1(list, 10));
                        for (C3234k c3234k : list) {
                            r32.add(new C6209w(c3234k.f31470a));
                        }
                    } else {
                        r32 = 0;
                    }
                    if (r32 == 0) {
                        vVar = kf.v.f37483Y;
                    } else {
                        vVar = r32;
                    }
                    H.I a102 = L.a(c4209c2.f37227e, new H.H(2, vVar), rVar);
                    H.A a112 = a102.f6549d;
                    Integer valueOf2 = Integer.valueOf(a112.f6527b.h());
                    rVar.W(826310174);
                    g10 = rVar.g(abstractC0408g2) | rVar.g(a102);
                    K11 = rVar.K();
                    if (!g10 || K11 == iVar) {
                        K11 = new u(abstractC0408g2, a102, null);
                        rVar.h0(K11);
                    }
                    rVar.t(false);
                    AbstractC1734s.e(valueOf2, (wf.n) K11, rVar);
                    String str2 = ((C6209w) vVar.get(a112.f6527b.h())).f48469a;
                    i0.r rVar22 = x9.n.f49685a;
                    AbstractC3557B.c0("image", str2);
                    L0.u uVar2 = io.sentry.compose.b.f34309a;
                    rVar.W(1898901869);
                    Object[] objArr2 = {new C6209w(str2)};
                    i0.r rVar32 = x9.n.f49685a;
                    rVar.W(-1123949028);
                    g11 = rVar.g(str2);
                    K12 = rVar.K();
                    if (!g11 || K12 == iVar) {
                        K12 = new C4929h(str2, 9);
                        rVar.h0(K12);
                    }
                    rVar.t(false);
                    x9.l lVar2 = (x9.l) Ad.l.Y0(objArr2, rVar32, (AbstractC6216a) K12, rVar, 4);
                    rVar.t(false);
                    lVar2.f49680f.i(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f37219b));
                    lVar2.f49681g.setValue(new r0.r(f37218a));
                    K8.d.f(fVar, abstractC4210D4, v.f37274Y, abstractC4326r, AbstractC5102d.f42764a, null, false, R4.b.X(rVar, 1834381304, new w(c4209c2, a102, lVar2, abstractC0408g2, vVar)), rVar, i14 | (i13 & 14) | 12583304, 104);
                    abstractC4210D3 = abstractC4210D4;
                } else {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                }
            }
            abstractC4326r = a5;
            i13 = i12;
            abstractC4210D4 = abstractC4210D2;
            rVar.u();
            C4209C c4209c22 = (C4209C) AbstractC4828h.z(abstractC4210D4.f808e, rVar).getValue();
            AbstractC1734s.e(abstractC4210D4, new s(abstractC4210D4, fVar, (AbstractActivityC4532l) rVar.m(p9.m.f42797a), null), rVar);
            AbstractC1734s.e(jf.y.f36177a, new AbstractC5163j(2, null), rVar);
            rVar.W(826309881);
            i14 = i13 & 112;
            if ((i14 ^ 48) <= 32) {
            }
            z10 = false;
            K10 = rVar.K();
            if (!z10) {
            }
            kotlin.jvm.internal.j jVar22 = new kotlin.jvm.internal.j(1, abstractC4210D4, AbstractC4210D.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
            rVar.h0(jVar22);
            K10 = jVar22;
            AbstractC0408g abstractC0408g22 = (AbstractC0408g) K10;
            rVar.t(false);
            list = c4209c22.f37225c;
            if (list != null) {
            }
            if (r32 == 0) {
            }
            H.I a1022 = L.a(c4209c22.f37227e, new H.H(2, vVar), rVar);
            H.A a1122 = a1022.f6549d;
            Integer valueOf22 = Integer.valueOf(a1122.f6527b.h());
            rVar.W(826310174);
            g10 = rVar.g(abstractC0408g22) | rVar.g(a1022);
            K11 = rVar.K();
            if (!g10) {
            }
            K11 = new u(abstractC0408g22, a1022, null);
            rVar.h0(K11);
            rVar.t(false);
            AbstractC1734s.e(valueOf22, (wf.n) K11, rVar);
            String str22 = ((C6209w) vVar.get(a1122.f6527b.h())).f48469a;
            i0.r rVar222 = x9.n.f49685a;
            AbstractC3557B.c0("image", str22);
            L0.u uVar22 = io.sentry.compose.b.f34309a;
            rVar.W(1898901869);
            Object[] objArr22 = {new C6209w(str22)};
            i0.r rVar322 = x9.n.f49685a;
            rVar.W(-1123949028);
            g11 = rVar.g(str22);
            K12 = rVar.K();
            if (!g11) {
            }
            K12 = new C4929h(str22, 9);
            rVar.h0(K12);
            rVar.t(false);
            x9.l lVar22 = (x9.l) Ad.l.Y0(objArr22, rVar322, (AbstractC6216a) K12, rVar, 4);
            rVar.t(false);
            lVar22.f49680f.i(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f37219b));
            lVar22.f49681g.setValue(new r0.r(f37218a));
            K8.d.f(fVar, abstractC4210D4, v.f37274Y, abstractC4326r, AbstractC5102d.f42764a, null, false, R4.b.X(rVar, 1834381304, new w(c4209c22, a1022, lVar22, abstractC0408g22, vVar)), rVar, i14 | (i13 & 14) | 12583304, 104);
            abstractC4210D3 = abstractC4210D4;
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new F.o(fVar, abstractC4210D3, i10, i11, 14);
        }
    }

    public static final void d(C4209C c4209c, H.F f6, x9.l lVar, wf.k kVar, List list, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar;
        boolean z10;
        boolean z11;
        boolean z12;
        String u10;
        AbstractC3557B.c0("imageDetailState", c4209c);
        AbstractC3557B.c0("pagerState", f6);
        AbstractC3557B.c0("imageDrawState", lVar);
        AbstractC3557B.c0("onInputIntent", kVar);
        AbstractC3557B.c0("images", list);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1304143555);
        rVar2.W(-1580347486);
        Object K10 = rVar2.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (K10 == iVar) {
            K10 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
            rVar2.h0(K10);
        }
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        rVar2.t(false);
        FillElement fillElement = androidx.compose.foundation.layout.e.f24739c;
        rVar2.W(733328855);
        N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(fillElement);
        boolean z13 = rVar2.f22696a instanceof AbstractC1707e;
        if (z13) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            C0581j c0581j = C0583l.f5808f;
            U3.f.n0(rVar2, c10, c0581j);
            C0581j c0581j2 = C0583l.f5807e;
            U3.f.n0(rVar2, p10, c0581j2);
            C0581j c0581j3 = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                AbstractC6463a.q(i11, rVar2, i11, c0581j3);
            }
            AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
            AbstractC4326r a5 = io.sentry.compose.b.a("ImageDetailScreenContent");
            int i13 = i10 >> 3;
            R4.b.n(f6, fillElement, null, null, 0, 0.0f, null, null, false, false, null, null, R4.b.X(rVar2, -401963252, new d9.i(lVar, c4209c, abstractC1710f0, 3)), rVar2, (i13 & 14) | 48, 384, 4092);
            C4318j c4318j = C4310b.f37700m0;
            boolean z14 = c4209c.f37226d;
            boolean z15 = c4209c.f37233k;
            boolean z16 = c4209c.f37230h;
            if (z16 && !((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                rVar = rVar2;
                rVar.W(913072797);
                long j6 = AbstractC5102d.f42764a;
                AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.a.c(c4323o, C5035b.c(AbstractC4344b.G0(new r0.r(r0.r.b(j6, 0.5f)), new r0.r(r0.r.b(j6, 0.5f)), new r0.r(r0.r.f44262j)))), 1.0f), p9.r.f42841e);
                rVar.W(693286680);
                N a10 = p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar);
                rVar.W(-1323940314);
                int i14 = rVar.P;
                AbstractC1732q0 p11 = rVar.p();
                C3288a i15 = androidx.compose.ui.layout.a.i(r10);
                if (z13) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, a10, c0581j);
                    U3.f.n0(rVar, p11, c0581j2);
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar, i14, c0581j3);
                    }
                    AbstractC6463a.r(0, i15, new L0(rVar), rVar, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("ImageDetailScreenContent");
                    if (c4209c.f37229g) {
                        u10 = AbstractC4194d.u(rVar, -2112222121, R.string.conversation_image_annotate, rVar, false);
                    } else {
                        u10 = AbstractC4194d.u(rVar, -2112222023, R.string.conversation_image_inpaint, rVar, false);
                    }
                    j4.b(u10, a11, r0.r.f44257e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 384, 0, 131066);
                    AbstractC6463a.v(rVar, false, true, false, false);
                    AbstractC4326r a12 = bVar.a(c4323o, c4318j);
                    int i16 = (i10 >> 6) & 14;
                    e(lVar, c4209c, a12, kVar, rVar, 72 | i16 | (i10 & 7168), 0);
                    if (z15 && z14) {
                        AbstractC4215I.a(lVar, a5, rVar, 8 | i16, 2);
                    }
                    rVar.t(false);
                    z10 = false;
                } else {
                    R4.b.r1();
                    throw null;
                }
            } else {
                rVar = rVar2;
                if (!z16) {
                    rVar.W(913074133);
                    rVar.W(913074154);
                    if ((((i10 & 7168) ^ 3072) > 2048 && rVar.g(kVar)) || (i10 & 3072) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object K11 = rVar.K();
                    if (z11 || K11 == iVar) {
                        K11 = AbstractC0044t0.t(29, kVar, rVar);
                    }
                    rVar.t(false);
                    R4.b.o((AbstractC6216a) K11, a5, false, null, null, AbstractC4218c.f37250a, rVar, 196608, 30);
                    String str = ((C6209w) list.get(f6.f6549d.f6527b.h())).f48469a;
                    if (z15 && z14) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    b(str, z12, kVar, bVar.a(c4323o, c4318j), rVar, i13 & 896, 0);
                    z10 = false;
                    rVar.t(false);
                } else {
                    z10 = false;
                    rVar.W(913074813);
                    rVar.t(false);
                }
            }
            rVar.t(z10);
            rVar.t(true);
            rVar.t(z10);
            rVar.t(z10);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new C1(i10, 3, c4209c, f6, lVar, kVar, list);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    public static final void e(x9.l lVar, C4209C c4209c, AbstractC4326r abstractC4326r, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC3557B.c0("imageDrawState", lVar);
        AbstractC3557B.c0("imageDetailState", c4209c);
        AbstractC3557B.c0("onInputIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("InPaintingActionBar");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1527341845);
        if ((i11 & 4) == 0) {
            a5 = abstractC4326r;
        }
        rVar.W(-1862175852);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (K10 == iVar) {
            K10 = AbstractC4828h.E(new y(lVar, 3));
            rVar.h0(K10);
        }
        l1 l1Var = (l1) K10;
        Object w10 = AbstractC0044t0.w(rVar, false, -1862175767);
        if (w10 == iVar) {
            w10 = AbstractC4828h.E(new y(lVar, 2));
            rVar.h0(w10);
        }
        l1 l1Var2 = (l1) w10;
        rVar.t(false);
        Context context = (Context) rVar.m(Z.f6888b);
        Object i12 = AbstractC6463a.i(rVar, 773894976, -492369756);
        if (i12 == iVar) {
            Z.C c10 = new Z.C(AbstractC1734s.k(rVar));
            rVar.h0(c10);
            i12 = c10;
        }
        rVar.t(false);
        Ng.F f6 = ((Z.C) i12).f22442Y;
        rVar.t(false);
        AbstractC4326r s10 = androidx.compose.foundation.layout.a.s(androidx.compose.foundation.a.c(androidx.compose.foundation.layout.e.d(a5, 1.0f), f37222e), p9.r.f42841e, p9.r.f42839c);
        C0424h c0424h = AbstractC0429m.f3912f;
        C4317i c4317i = C4310b.f37703p0;
        rVar.W(693286680);
        N a10 = p0.a(c0424h, c4317i, rVar);
        rVar.W(-1323940314);
        int i13 = rVar.P;
        AbstractC1732q0 p10 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i14 = androidx.compose.ui.layout.a.i(s10);
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
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i13))) {
                AbstractC6463a.q(i13, rVar, i13, c0581j);
            }
            AbstractC6463a.r(0, i14, new L0(rVar), rVar, 2058660585);
            AbstractC4326r a11 = io.sentry.compose.b.a("InPaintingActionBar");
            float f10 = f37220c;
            K.e a12 = K.f.a(f10);
            C0051x c0051x = new C0051x(1, new r0.N(r0.r.f44256d));
            i0 i0Var = AbstractC1577l0.f20203a;
            Ng.H.a(new F.s(c4209c, kVar, lVar, 23), a11, false, a12, AbstractC1577l0.b(r0.r.f44262j, 0L, rVar, 14), null, c0051x, null, null, AbstractC4218c.f37251b, rVar, 806879232, 422);
            R4.b.o(new y(lVar, 0), a11, ((Boolean) l1Var.getValue()).booleanValue(), null, null, R4.b.X(rVar, 1365485868, new C2568c(l1Var, 3)), rVar, 196608, 26);
            R4.b.o(new y(lVar, 1), a11, ((Boolean) l1Var2.getValue()).booleanValue(), null, null, R4.b.X(rVar, 1273032483, new C2568c(l1Var2, 4)), rVar, 196608, 26);
            AbstractC4326r abstractC4326r2 = a5;
            Ng.H.a(new C3455b(f6, l1Var, lVar, c4209c, context, kVar, 1), a11, ((Boolean) l1Var.getValue()).booleanValue(), K.f.a(f10), AbstractC1577l0.b(r0.r.f44258f, 0L, rVar, 14), null, null, null, null, AbstractC4218c.f37252c, rVar, 805306368, 482);
            rVar.t(false);
            rVar.t(true);
            rVar.t(false);
            rVar.t(false);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new G.I((Object) lVar, (Object) c4209c, abstractC4326r2, (Object) kVar, i10, i11, 17);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(x9.l lVar, C4209C c4209c, Context context, wf.k kVar, AbstractC4825e abstractC4825e) {
        C4207A c4207a;
        EnumC5000a enumC5000a;
        int i10;
        Object obj;
        C4209C c4209c2;
        wf.k kVar2;
        Object obj2;
        Throwable a5;
        s0 s0Var;
        Object c10;
        x9.l lVar2;
        if (abstractC4825e instanceof C4207A) {
            C4207A c4207a2 = (C4207A) abstractC4825e;
            int i11 = c4207a2.f37217k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4207a2.f37217k0 = i11 - Integer.MIN_VALUE;
                c4207a = c4207a2;
                Object obj3 = c4207a.f37216j0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c4207a.f37217k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            obj2 = c4207a.f37214h0;
                            kVar2 = (wf.k) c4207a.f37213Z;
                            c4209c2 = (C4209C) c4207a.f37212Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj3);
                            obj = ((C3961k) obj3).f36158Y;
                            if (!(!(obj2 instanceof C3960j)) && (!(obj instanceof C3960j))) {
                                kVar2.invoke(new C4227l(new u0(c4209c2.f37223a), new u0(c4209c2.f37224b)));
                            } else {
                                a5 = C3961k.a(obj2);
                                if (a5 == null) {
                                    s0Var = new s0(1, a5);
                                } else {
                                    s0Var = new s0(1, new IllegalStateException("Failed to save images"));
                                }
                                kVar2.invoke(new C4227l(s0Var, null));
                            }
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = c4207a.f37215i0;
                    context = (Context) c4207a.f37214h0;
                    c4209c = (C4209C) c4207a.f37213Z;
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                    c10 = ((C3961k) obj3).f36158Y;
                    lVar2 = (x9.l) c4207a.f37212Y;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                    Uri uri = c4209c.f37223a;
                    c4207a.f37212Y = lVar;
                    c4207a.f37213Z = c4209c;
                    c4207a.f37214h0 = context;
                    c4207a.f37215i0 = kVar;
                    c4207a.f37217k0 = 1;
                    c10 = lVar.c(context, uri, c4207a);
                    lVar2 = lVar;
                    if (c10 == enumC5000a) {
                        return enumC5000a;
                    }
                }
                C4209C c4209c3 = c4209c;
                x9.l lVar3 = lVar2;
                obj2 = c10;
                wf.k kVar3 = kVar;
                Context context2 = context;
                c4209c2 = c4209c3;
                Uri uri2 = c4209c2.f37224b;
                c4207a.f37212Y = c4209c2;
                c4207a.f37213Z = kVar3;
                c4207a.f37214h0 = obj2;
                c4207a.f37215i0 = null;
                c4207a.f37217k0 = 2;
                obj = lVar3.b(context2, uri2, c4207a);
                if (obj != enumC5000a) {
                    return enumC5000a;
                }
                kVar2 = kVar3;
                if (!(!(obj2 instanceof C3960j))) {
                }
                a5 = C3961k.a(obj2);
                if (a5 == null) {
                }
                kVar2.invoke(new C4227l(s0Var, null));
                return jf.y.f36177a;
            }
        }
        c4207a = new AbstractC5156c(abstractC4825e);
        Object obj32 = c4207a.f37216j0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c4207a.f37217k0;
        if (i10 == 0) {
        }
        C4209C c4209c32 = c4209c;
        x9.l lVar32 = lVar2;
        obj2 = c10;
        wf.k kVar32 = kVar;
        Context context22 = context;
        c4209c2 = c4209c32;
        Uri uri22 = c4209c2.f37224b;
        c4207a.f37212Y = c4209c2;
        c4207a.f37213Z = kVar32;
        c4207a.f37214h0 = obj2;
        c4207a.f37215i0 = null;
        c4207a.f37217k0 = 2;
        obj = lVar32.b(context22, uri22, c4207a);
        if (obj != enumC5000a) {
        }
    }
}
