package Ng;

import A.C0007a0;
import A.C0051x;
import B.AbstractC0168u1;
import B.C0124f1;
import B.C0127g1;
import B.W0;
import E0.AbstractC0461u;
import F.C0530d;
import H.AbstractC0662k;
import H.C0653b;
import H.C0654c;
import H.C0657f;
import H.C0663l;
import H.C0664m;
import H0.AbstractC0701r0;
import N.C1021e;
import W.AbstractC1530b3;
import W.AbstractC1577l0;
import W.C1572k0;
import W.C1587n0;
import W.C1592o0;
import W.C1597p0;
import W.C1602q0;
import W.C1606r0;
import W.G3;
import W.N3;
import W.R0;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.l1;
import Z.m1;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Paint;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.Layout;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import jf.C3961k;
import l0.AbstractC4311c;
import l0.AbstractC4312d;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import o1.AbstractC4896k;
import o1.AbstractC4897l;
import of.EnumC5000a;
import pf.AbstractC5156c;
import q0.AbstractC5249a;
import w.C6060g;
import wf.AbstractC6216a;
import x.AbstractC6262a;
import y.AbstractC6463a;
import z.AbstractC6652A0;
import z.AbstractC6696f;
import z.AbstractC6704j;
import z.AbstractC6714o;
import z.C6694e;
import z.C6716p;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final Q1.u f12873a = new Q1.u("RESUME_TOKEN", 9, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Q1.u f12874b = new Q1.u("REMOVED_TASK", 9, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final Q1.u f12875c = new Q1.u("CLOSED_EMPTY", 9, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final Q1.u f12876d = new Q1.u("COMPLETING_ALREADY", 9, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final Q1.u f12877e = new Q1.u("COMPLETING_WAITING_CHILDREN", 9, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final Q1.u f12878f = new Q1.u("COMPLETING_RETRY", 9, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final Q1.u f12879g = new Q1.u("TOO_LATE_TO_CANCEL", 9, 0);

    /* renamed from: h  reason: collision with root package name */
    public static final Q1.u f12880h = new Q1.u("SEALED", 9, 0);

    /* renamed from: i  reason: collision with root package name */
    public static final V f12881i = new V(false);

    /* renamed from: j  reason: collision with root package name */
    public static final V f12882j = new V(true);

    public static final Object A(Object obj) {
        C1065h0 c1065h0;
        AbstractC1063g0 abstractC1063g0;
        if (obj instanceof C1065h0) {
            c1065h0 = (C1065h0) obj;
        } else {
            c1065h0 = null;
        }
        if (c1065h0 != null && (abstractC1063g0 = c1065h0.f12944a) != null) {
            return abstractC1063g0;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, r0.L l10, C1572k0 c1572k0, C1597p0 c1597p0, C0051x c0051x, E.g0 g0Var, D.m mVar, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        boolean z11;
        r0.L l11;
        C1572k0 c1572k02;
        C1597p0 c1597p02;
        int i14;
        C0051x c0051x2;
        int i15;
        int i16;
        D.m mVar2;
        E.g0 g0Var2;
        C0051x c0051x3;
        C1597p0 c1597p03;
        C1572k0 c1572k03;
        r0.L l12;
        boolean z12;
        AbstractC4326r abstractC4326r2;
        int i17;
        int i18;
        C1597p0 c1597p04;
        C1572k0 c1572k04;
        r0.L l13;
        AbstractC4326r abstractC4326r3;
        D.m mVar3;
        E.g0 g0Var3;
        C0051x c0051x4;
        C1572k0 c1572k05;
        C0051x c0051x5;
        D.m mVar4;
        C6716p c6716p;
        ?? r32;
        float f6;
        float f10;
        Object obj;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(650121315);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (rVar.i(abstractC6216a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= rVar.g(abstractC4326r) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                z11 = z10;
                i12 |= rVar.h(z11) ? 256 : 128;
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l11 = l10;
                        if (rVar.g(l11)) {
                            i21 = 2048;
                            i12 |= i21;
                        }
                    } else {
                        l11 = l10;
                    }
                    i21 = 1024;
                    i12 |= i21;
                } else {
                    l11 = l10;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1572k02 = c1572k0;
                        if (rVar.g(c1572k02)) {
                            i20 = 16384;
                            i12 |= i20;
                        }
                    } else {
                        c1572k02 = c1572k0;
                    }
                    i20 = 8192;
                    i12 |= i20;
                } else {
                    c1572k02 = c1572k0;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        c1597p02 = c1597p0;
                        if (rVar.g(c1597p02)) {
                            i19 = 131072;
                            i12 |= i19;
                        }
                    } else {
                        c1597p02 = c1597p0;
                    }
                    i19 = 65536;
                    i12 |= i19;
                } else {
                    c1597p02 = c1597p0;
                }
                i14 = i11 & 64;
                if (i14 != 0) {
                    i12 |= 1572864;
                    c0051x2 = c0051x;
                } else {
                    c0051x2 = c0051x;
                    if ((i10 & 1572864) == 0) {
                        i12 |= rVar.g(c0051x2) ? 1048576 : 524288;
                    }
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    i12 |= rVar.g(g0Var) ? 8388608 : 4194304;
                }
                i16 = i11 & 256;
                if (i16 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    i12 |= rVar.g(mVar) ? 67108864 : 33554432;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    i12 |= rVar.i(oVar) ? 536870912 : 268435456;
                    if ((i12 & 306783379) != 306783378 && rVar.B()) {
                        rVar.P();
                        abstractC4326r2 = abstractC4326r;
                        c0051x3 = c0051x2;
                        z12 = z11;
                        l12 = l11;
                        c1572k03 = c1572k02;
                        c1597p03 = c1597p02;
                        g0Var2 = g0Var;
                        mVar2 = mVar;
                    } else {
                        rVar.R();
                        i17 = i10 & 1;
                        Object obj2 = C1723m.f22654Y;
                        boolean z13 = true;
                        if (i17 == 0 && !rVar.A()) {
                            rVar.P();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            abstractC4326r3 = abstractC4326r;
                            c0051x4 = c0051x;
                            g0Var3 = g0Var;
                            l13 = l11;
                            c1572k04 = c1572k02;
                            c1597p04 = c1597p02;
                        } else {
                            abstractC4326r3 = i22 == 0 ? C4323o.f37719b : abstractC4326r;
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) == 0) {
                                l13 = AbstractC1577l0.f(rVar);
                                i12 &= -7169;
                            } else {
                                l13 = l11;
                            }
                            if ((i11 & 16) == 0) {
                                c1572k04 = AbstractC1577l0.a(rVar);
                                i12 &= -57345;
                            } else {
                                c1572k04 = c1572k02;
                            }
                            if ((i11 & 32) == 0) {
                                E.i0 i0Var = AbstractC1577l0.f20203a;
                                rVar.W(1827791191);
                                c1597p04 = new C1597p0(X.m.f21590a, X.m.f21598i, X.m.f21595f, X.m.f21596g, X.m.f21593d);
                                rVar.t(false);
                                i12 &= -458753;
                            } else {
                                c1597p04 = c1597p02;
                            }
                            C0051x c0051x6 = i14 == 0 ? null : c0051x;
                            g0Var3 = i15 == 0 ? AbstractC1577l0.f20203a : g0Var;
                            if (i16 == 0) {
                                rVar.W(823568939);
                                Object K10 = rVar.K();
                                Object obj3 = K10;
                                if (K10 == obj2) {
                                    Object d10 = kotlin.jvm.internal.m.d();
                                    rVar.h0(d10);
                                    obj3 = d10;
                                }
                                rVar.t(false);
                                int i23 = i12;
                                mVar3 = (D.m) obj3;
                                c0051x4 = c0051x6;
                                i18 = i23;
                                rVar.u();
                                long j6 = !z11 ? c1572k04.f20183a : c1572k04.f20185c;
                                long j10 = !z11 ? c1572k04.f20184b : c1572k04.f20186d;
                                rVar.W(823569174);
                                if (c1597p04 != null) {
                                    c0051x5 = c0051x4;
                                    mVar4 = mVar3;
                                    c1572k05 = c1572k04;
                                    r32 = 0;
                                    c6716p = null;
                                } else {
                                    int i24 = ((i18 >> 6) & 14) | ((i18 >> 21) & 112) | ((i18 >> 9) & 896);
                                    rVar.W(-2045116089);
                                    int i25 = (i24 & 896) | (i24 & 14) | (i24 & 112);
                                    Object i26 = AbstractC6463a.i(rVar, -1312510462, -719928578);
                                    Object obj4 = i26;
                                    if (i26 == obj2) {
                                        Object uVar = new j0.u();
                                        rVar.h0(uVar);
                                        obj4 = uVar;
                                    }
                                    j0.u uVar2 = (j0.u) obj4;
                                    rVar.t(false);
                                    rVar.W(-719928489);
                                    c1572k05 = c1572k04;
                                    boolean z14 = (((i25 & 112) ^ 48) > 32 && rVar.g(mVar3)) || (i25 & 48) == 32;
                                    Object K11 = rVar.K();
                                    Object obj5 = K11;
                                    if (z14 || K11 == obj2) {
                                        Object c1587n0 = new C1587n0(mVar3, uVar2, null);
                                        rVar.h0(c1587n0);
                                        obj5 = c1587n0;
                                    }
                                    rVar.t(false);
                                    AbstractC1734s.e(mVar3, (wf.n) obj5, rVar);
                                    D.k kVar = (D.k) kf.t.p2(uVar2);
                                    if (!z11) {
                                        f10 = c1597p04.f20277e;
                                    } else if (kVar instanceof D.p) {
                                        f10 = c1597p04.f20274b;
                                    } else if (kVar instanceof D.h) {
                                        f10 = c1597p04.f20276d;
                                    } else {
                                        f10 = kVar instanceof D.d ? c1597p04.f20275c : c1597p04.f20273a;
                                    }
                                    rVar.W(-719926909);
                                    Object K12 = rVar.K();
                                    if (K12 == obj2) {
                                        mVar4 = mVar3;
                                        c0051x5 = c0051x4;
                                        Object c6694e = new C6694e(new Z0.e(f10), AbstractC6652A0.f51118c, null, 12);
                                        rVar.h0(c6694e);
                                        obj = c6694e;
                                    } else {
                                        c0051x5 = c0051x4;
                                        mVar4 = mVar3;
                                        obj = K12;
                                    }
                                    C6694e c6694e2 = (C6694e) obj;
                                    rVar.t(false);
                                    Z0.e eVar = new Z0.e(f10);
                                    rVar.W(-719926825);
                                    boolean i27 = rVar.i(c6694e2) | rVar.d(f10) | ((((i25 & 14) ^ 6) > 4 && rVar.h(z11)) || (i25 & 6) == 4);
                                    if ((((i25 & 896) ^ 384) <= 256 || !rVar.g(c1597p04)) && (i25 & 384) != 256) {
                                        z13 = false;
                                    }
                                    boolean i28 = i27 | z13 | rVar.i(kVar);
                                    Object K13 = rVar.K();
                                    Object obj6 = K13;
                                    if (i28 || K13 == obj2) {
                                        Object c1592o0 = new C1592o0(c6694e2, f10, z11, c1597p04, kVar, null);
                                        rVar.h0(c1592o0);
                                        obj6 = c1592o0;
                                    }
                                    r32 = 0;
                                    rVar.t(false);
                                    AbstractC1734s.e(eVar, (wf.n) obj6, rVar);
                                    c6716p = c6694e2.f51230c;
                                    rVar.t(false);
                                    rVar.t(false);
                                }
                                rVar.t(r32);
                                float f11 = c6716p == null ? ((Z0.e) c6716p.f51346Z.getValue()).f22788Y : (float) r32;
                                if (c1597p04 == null) {
                                    f6 = z11 ? c1597p04.f20273a : c1597p04.f20277e;
                                } else {
                                    f6 = r32 == true ? 1.0f : 0.0f;
                                }
                                G3.b(abstractC6216a, L0.l.a(abstractC4326r3, r32, W.S.f19623h0), z11, l13, j6, j10, f6, f11, c0051x5, mVar4, R4.b.X(rVar, 956488494, new C1602q0(j10, g0Var3, oVar, 0)), rVar, (i18 & 14) | (i18 & 896) | (i18 & 7168) | ((i18 << 6) & 234881024) | ((i18 << 3) & 1879048192), 0);
                                g0Var2 = g0Var3;
                                abstractC4326r2 = abstractC4326r3;
                                l12 = l13;
                                z12 = z11;
                                c1597p03 = c1597p04;
                                mVar2 = mVar4;
                                c0051x3 = c0051x5;
                                c1572k03 = c1572k05;
                            } else {
                                c0051x4 = c0051x6;
                            }
                        }
                        i18 = i12;
                        mVar3 = mVar;
                        rVar.u();
                        long j62 = !z11 ? c1572k04.f20183a : c1572k04.f20185c;
                        long j102 = !z11 ? c1572k04.f20184b : c1572k04.f20186d;
                        rVar.W(823569174);
                        if (c1597p04 != null) {
                        }
                        rVar.t(r32);
                        if (c6716p == null) {
                        }
                        if (c1597p04 == null) {
                        }
                        G3.b(abstractC6216a, L0.l.a(abstractC4326r3, r32, W.S.f19623h0), z11, l13, j62, j102, f6, f11, c0051x5, mVar4, R4.b.X(rVar, 956488494, new C1602q0(j102, g0Var3, oVar, 0)), rVar, (i18 & 14) | (i18 & 896) | (i18 & 7168) | ((i18 << 6) & 234881024) | ((i18 << 3) & 1879048192), 0);
                        g0Var2 = g0Var3;
                        abstractC4326r2 = abstractC4326r3;
                        l12 = l13;
                        z12 = z11;
                        c1597p03 = c1597p04;
                        mVar2 = mVar4;
                        c0051x3 = c0051x5;
                        c1572k03 = c1572k05;
                    }
                    C1741v0 v10 = rVar.v();
                    if (v10 == null) {
                        return;
                    }
                    v10.f22739d = new C1606r0(abstractC6216a, abstractC4326r2, z12, l12, c1572k03, c1597p03, c0051x3, g0Var2, mVar2, oVar, i10, i11, 0);
                    return;
                }
                if ((i12 & 306783379) != 306783378) {
                }
                rVar.R();
                i17 = i10 & 1;
                Object obj22 = C1723m.f22654Y;
                boolean z132 = true;
                if (i17 == 0) {
                }
                if (i22 == 0) {
                }
                if (i13 != 0) {
                }
                if ((i11 & 8) == 0) {
                }
                if ((i11 & 16) == 0) {
                }
                if ((i11 & 32) == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
            }
            z11 = z10;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            if ((196608 & i10) == 0) {
            }
            i14 = i11 & 64;
            if (i14 != 0) {
            }
            i15 = i11 & 128;
            if (i15 != 0) {
            }
            i16 = i11 & 256;
            if (i16 != 0) {
            }
            if ((i11 & 512) != 0) {
            }
            if ((i12 & 306783379) != 306783378) {
            }
            rVar.R();
            i17 = i10 & 1;
            Object obj222 = C1723m.f22654Y;
            boolean z1322 = true;
            if (i17 == 0) {
            }
            if (i22 == 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 8) == 0) {
            }
            if ((i11 & 16) == 0) {
            }
            if ((i11 & 32) == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        i14 = i11 & 64;
        if (i14 != 0) {
        }
        i15 = i11 & 128;
        if (i15 != 0) {
        }
        i16 = i11 & 256;
        if (i16 != 0) {
        }
        if ((i11 & 512) != 0) {
        }
        if ((i12 & 306783379) != 306783378) {
        }
        rVar.R();
        i17 = i10 & 1;
        Object obj2222 = C1723m.f22654Y;
        boolean z13222 = true;
        if (i17 == 0) {
        }
        if (i22 == 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 8) == 0) {
        }
        if ((i11 & 16) == 0) {
        }
        if ((i11 & 32) == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
    }

    public static final long b(float f6, float f10) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        int i10 = AbstractC5249a.f43614b;
        return floatToRawIntBits;
    }

    public static final long c(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, r0.L l10, C1572k0 c1572k0, C1597p0 c1597p0, C0051x c0051x, E.g0 g0Var, D.m mVar, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        r0.L l11;
        C1572k0 c1572k02;
        int i14;
        C1597p0 c1597p02;
        C0051x c0051x2;
        int i15;
        E.g0 g0Var2;
        int i16;
        D.m mVar2;
        E.g0 g0Var3;
        C0051x c0051x3;
        C1597p0 c1597p03;
        C1572k0 c1572k03;
        r0.L l12;
        boolean z11;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        int i17;
        E.g0 g0Var4;
        r0.L l13;
        boolean z12;
        AbstractC4326r abstractC4326r3;
        D.m mVar3;
        C0051x c0051x4;
        C1572k0 c1572k04;
        C1572k0 c1572k05;
        C0051x c0051x5;
        int i18;
        int i19;
        int i20;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1694808287);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (rVar.i(abstractC6216a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= rVar.g(abstractC4326r) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                i12 |= rVar.h(z10) ? 256 : 128;
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l11 = l10;
                        if (rVar.g(l11)) {
                            i20 = 2048;
                            i12 |= i20;
                        }
                    } else {
                        l11 = l10;
                    }
                    i20 = 1024;
                    i12 |= i20;
                } else {
                    l11 = l10;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1572k02 = c1572k0;
                        if (rVar.g(c1572k02)) {
                            i19 = 16384;
                            i12 |= i19;
                        }
                    } else {
                        c1572k02 = c1572k0;
                    }
                    i19 = 8192;
                    i12 |= i19;
                } else {
                    c1572k02 = c1572k0;
                }
                i14 = i11 & 32;
                if (i14 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    c1597p02 = c1597p0;
                    i12 |= rVar.g(c1597p02) ? 131072 : 65536;
                    if ((1572864 & i10) != 0) {
                        if ((i11 & 64) == 0) {
                            c0051x2 = c0051x;
                            if (rVar.g(c0051x2)) {
                                i18 = 1048576;
                                i12 |= i18;
                            }
                        } else {
                            c0051x2 = c0051x;
                        }
                        i18 = 524288;
                        i12 |= i18;
                    } else {
                        c0051x2 = c0051x;
                    }
                    i15 = i11 & 128;
                    if (i15 == 0) {
                        i12 |= 12582912;
                    } else if ((12582912 & i10) == 0) {
                        g0Var2 = g0Var;
                        i12 |= rVar.g(g0Var2) ? 8388608 : 4194304;
                        i16 = i11 & 256;
                        if (i16 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            i12 |= rVar.g(mVar) ? 67108864 : 33554432;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            i12 |= rVar.i(oVar) ? 536870912 : 268435456;
                            if ((i12 & 306783379) != 306783378 && rVar.B()) {
                                rVar.P();
                                abstractC4326r2 = abstractC4326r;
                                z11 = z10;
                                mVar2 = mVar;
                                l12 = l11;
                                c1572k03 = c1572k02;
                                c1597p03 = c1597p02;
                                c0051x3 = c0051x2;
                                g0Var3 = g0Var2;
                            } else {
                                rVar.R();
                                if ((i10 & 1) == 0 && !rVar.A()) {
                                    rVar.P();
                                    if ((i11 & 8) != 0) {
                                        i12 &= -7169;
                                    }
                                    if ((i11 & 16) != 0) {
                                        i12 &= -57345;
                                    }
                                    if ((i11 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                    abstractC4326r3 = abstractC4326r;
                                    z12 = z10;
                                    l13 = l11;
                                    c0051x4 = c0051x2;
                                    g0Var4 = g0Var2;
                                    i17 = i12;
                                    mVar3 = mVar;
                                } else {
                                    abstractC4326r3 = i21 == 0 ? C4323o.f37719b : abstractC4326r;
                                    z12 = i13 == 0 ? true : z10;
                                    if ((i11 & 8) == 0) {
                                        E.i0 i0Var = AbstractC1577l0.f20203a;
                                        rVar.W(-2045213065);
                                        float f6 = X.w.f21665a;
                                        l13 = AbstractC1530b3.a(5, rVar);
                                        rVar.t(false);
                                        i12 &= -7169;
                                    } else {
                                        l13 = l11;
                                    }
                                    if ((i11 & 16) == 0) {
                                        c1572k04 = AbstractC1577l0.g(rVar);
                                        i12 &= -57345;
                                    } else {
                                        c1572k04 = c1572k02;
                                    }
                                    C1597p0 c1597p04 = i14 == 0 ? null : c1597p02;
                                    if ((i11 & 64) == 0) {
                                        E.i0 i0Var2 = AbstractC1577l0.f20203a;
                                        rVar.W(-563957672);
                                        c1572k05 = c1572k04;
                                        c0051x5 = new C0051x(X.w.f21665a, new r0.N(R0.e(24, rVar)));
                                        rVar.t(false);
                                        i12 &= -3670017;
                                    } else {
                                        c1572k05 = c1572k04;
                                        c0051x5 = c0051x2;
                                    }
                                    g0Var4 = i15 == 0 ? AbstractC1577l0.f20203a : g0Var2;
                                    if (i16 == 0) {
                                        rVar.W(-219967464);
                                        Object K10 = rVar.K();
                                        if (K10 == C1723m.f22654Y) {
                                            K10 = kotlin.jvm.internal.m.d();
                                            rVar.h0(K10);
                                        }
                                        rVar.t(false);
                                        i17 = i12;
                                        mVar3 = (D.m) K10;
                                        c0051x4 = c0051x5;
                                    } else {
                                        i17 = i12;
                                        c0051x4 = c0051x5;
                                        mVar3 = mVar;
                                    }
                                    c1597p02 = c1597p04;
                                    c1572k02 = c1572k05;
                                }
                                rVar.u();
                                a(abstractC6216a, abstractC4326r3, z12, l13, c1572k02, c1597p02, c0051x4, g0Var4, mVar3, oVar, rVar, (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), 0);
                                c0051x3 = c0051x4;
                                mVar2 = mVar3;
                                abstractC4326r2 = abstractC4326r3;
                                z11 = z12;
                                l12 = l13;
                                c1572k03 = c1572k02;
                                g0Var3 = g0Var4;
                                c1597p03 = c1597p02;
                            }
                            v10 = rVar.v();
                            if (v10 != null) {
                                return;
                            }
                            v10.f22739d = new C1606r0(abstractC6216a, abstractC4326r2, z11, l12, c1572k03, c1597p03, c0051x3, g0Var3, mVar2, oVar, i10, i11, 1);
                            return;
                        }
                        if ((i12 & 306783379) != 306783378) {
                        }
                        rVar.R();
                        if ((i10 & 1) == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) == 0) {
                        }
                        if ((i11 & 16) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if ((i11 & 64) == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        c1597p02 = c1597p04;
                        c1572k02 = c1572k05;
                        rVar.u();
                        a(abstractC6216a, abstractC4326r3, z12, l13, c1572k02, c1597p02, c0051x4, g0Var4, mVar3, oVar, rVar, (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), 0);
                        c0051x3 = c0051x4;
                        mVar2 = mVar3;
                        abstractC4326r2 = abstractC4326r3;
                        z11 = z12;
                        l12 = l13;
                        c1572k03 = c1572k02;
                        g0Var3 = g0Var4;
                        c1597p03 = c1597p02;
                        v10 = rVar.v();
                        if (v10 != null) {
                        }
                    }
                    g0Var2 = g0Var;
                    i16 = i11 & 256;
                    if (i16 != 0) {
                    }
                    if ((i11 & 512) != 0) {
                    }
                    if ((i12 & 306783379) != 306783378) {
                    }
                    rVar.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) == 0) {
                    }
                    if ((i11 & 16) == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if ((i11 & 64) == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    c1597p02 = c1597p04;
                    c1572k02 = c1572k05;
                    rVar.u();
                    a(abstractC6216a, abstractC4326r3, z12, l13, c1572k02, c1597p02, c0051x4, g0Var4, mVar3, oVar, rVar, (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), 0);
                    c0051x3 = c0051x4;
                    mVar2 = mVar3;
                    abstractC4326r2 = abstractC4326r3;
                    z11 = z12;
                    l12 = l13;
                    c1572k03 = c1572k02;
                    g0Var3 = g0Var4;
                    c1597p03 = c1597p02;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                c1597p02 = c1597p0;
                if ((1572864 & i10) != 0) {
                }
                i15 = i11 & 128;
                if (i15 == 0) {
                }
                g0Var2 = g0Var;
                i16 = i11 & 256;
                if (i16 != 0) {
                }
                if ((i11 & 512) != 0) {
                }
                if ((i12 & 306783379) != 306783378) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i21 == 0) {
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) == 0) {
                }
                if ((i11 & 16) == 0) {
                }
                if (i14 == 0) {
                }
                if ((i11 & 64) == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                c1597p02 = c1597p04;
                c1572k02 = c1572k05;
                rVar.u();
                a(abstractC6216a, abstractC4326r3, z12, l13, c1572k02, c1597p02, c0051x4, g0Var4, mVar3, oVar, rVar, (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), 0);
                c0051x3 = c0051x4;
                mVar2 = mVar3;
                abstractC4326r2 = abstractC4326r3;
                z11 = z12;
                l12 = l13;
                c1572k03 = c1572k02;
                g0Var3 = g0Var4;
                c1597p03 = c1597p02;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            i14 = i11 & 32;
            if (i14 != 0) {
            }
            c1597p02 = c1597p0;
            if ((1572864 & i10) != 0) {
            }
            i15 = i11 & 128;
            if (i15 == 0) {
            }
            g0Var2 = g0Var;
            i16 = i11 & 256;
            if (i16 != 0) {
            }
            if ((i11 & 512) != 0) {
            }
            if ((i12 & 306783379) != 306783378) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i21 == 0) {
            }
            if (i13 == 0) {
            }
            if ((i11 & 8) == 0) {
            }
            if ((i11 & 16) == 0) {
            }
            if (i14 == 0) {
            }
            if ((i11 & 64) == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            c1597p02 = c1597p04;
            c1572k02 = c1572k05;
            rVar.u();
            a(abstractC6216a, abstractC4326r3, z12, l13, c1572k02, c1597p02, c0051x4, g0Var4, mVar3, oVar, rVar, (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), 0);
            c0051x3 = c0051x4;
            mVar2 = mVar3;
            abstractC4326r2 = abstractC4326r3;
            z11 = z12;
            l12 = l13;
            c1572k03 = c1572k02;
            g0Var3 = g0Var4;
            c1597p03 = c1597p02;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        i14 = i11 & 32;
        if (i14 != 0) {
        }
        c1597p02 = c1597p0;
        if ((1572864 & i10) != 0) {
        }
        i15 = i11 & 128;
        if (i15 == 0) {
        }
        g0Var2 = g0Var;
        i16 = i11 & 256;
        if (i16 != 0) {
        }
        if ((i11 & 512) != 0) {
        }
        if ((i12 & 306783379) != 306783378) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i21 == 0) {
        }
        if (i13 == 0) {
        }
        if ((i11 & 8) == 0) {
        }
        if ((i11 & 16) == 0) {
        }
        if (i14 == 0) {
        }
        if ((i11 & 64) == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        c1597p02 = c1597p04;
        c1572k02 = c1572k05;
        rVar.u();
        a(abstractC6216a, abstractC4326r3, z12, l13, c1572k02, c1597p02, c0051x4, g0Var4, mVar3, oVar, rVar, (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), 0);
        c0051x3 = c0051x4;
        mVar2 = mVar3;
        abstractC4326r2 = abstractC4326r3;
        z11 = z12;
        l12 = l13;
        c1572k03 = c1572k02;
        g0Var3 = g0Var4;
        c1597p03 = c1597p02;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final void e(AbstractC4326r abstractC4326r, H.F f6, E.g0 g0Var, boolean z10, W0 w02, C.j jVar, boolean z11, int i10, float f10, AbstractC0662k abstractC0662k, A0.a aVar, wf.k kVar, AbstractC4311c abstractC4311c, AbstractC4312d abstractC4312d, wf.p pVar, AbstractC1725n abstractC1725n, int i11, int i12, int i13) {
        boolean z12;
        C0654c c0654c;
        int i14;
        io.sentry.hints.i iVar;
        float f11;
        Z.r rVar;
        boolean z13;
        boolean z14;
        AbstractC4326r abstractC4326r2;
        int i15;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-301644943);
        int i16 = (i13 & 128) != 0 ? 0 : i10;
        float f12 = (i13 & 256) != 0 ? 0 : f10;
        if (i16 >= 0) {
            A.L0 e10 = B.G0.e(rVar2);
            rVar2.W(1320096574);
            boolean g10 = rVar2.g(f6);
            Object K10 = rVar2.K();
            io.sentry.hints.i iVar2 = C1723m.f22654Y;
            if (g10 || K10 == iVar2) {
                K10 = new C0654c(f6, 1);
                rVar2.h0(K10);
            }
            AbstractC6216a abstractC6216a = (AbstractC6216a) K10;
            rVar2.t(false);
            rVar2.W(-1372505274);
            AbstractC1710f0 g02 = AbstractC4828h.g0(pVar, rVar2);
            AbstractC1710f0 g03 = AbstractC4828h.g0(kVar, rVar2);
            Object[] objArr = {f6, g02, g03, abstractC6216a};
            rVar2.W(-568225417);
            int i17 = 0;
            boolean z15 = false;
            for (int i18 = 4; i17 < i18; i18 = 4) {
                z15 |= rVar2.g(objArr[i17]);
                i17++;
            }
            Object K11 = rVar2.K();
            if (z15 || K11 == iVar2) {
                Z.F0 f02 = Z.F0.f22489a;
                K11 = new kotlin.jvm.internal.w(AbstractC4828h.D(f02, new C0007a0(AbstractC4828h.D(f02, new F.s(g02, g03, abstractC6216a, 1)), 1, f6)), l1.class, "value", "getValue()Ljava/lang/Object;", 0);
                rVar2.h0(K11);
            }
            rVar2.t(false);
            Df.q qVar = K11;
            rVar2.t(false);
            rVar2.W(1320097128);
            boolean g11 = rVar2.g(f6);
            Object K12 = rVar2.K();
            if (g11 || K12 == iVar2) {
                z12 = false;
                C0654c c0654c2 = new C0654c(f6, 0);
                rVar2.h0(c0654c2);
                c0654c = c0654c2;
            } else {
                z12 = false;
                c0654c = K12;
            }
            AbstractC6216a abstractC6216a2 = c0654c;
            rVar2.t(z12);
            rVar2.W(-1615726010);
            Boolean valueOf = Boolean.valueOf(z10);
            Z0.e eVar = new Z0.e(f12);
            Object[] objArr2 = new Object[10];
            char c10 = z12 ? 1 : 0;
            char c11 = z12 ? 1 : 0;
            objArr2[c10] = f6;
            objArr2[1] = g0Var;
            objArr2[2] = valueOf;
            objArr2[3] = w02;
            objArr2[4] = abstractC4311c;
            objArr2[5] = abstractC4312d;
            objArr2[6] = eVar;
            objArr2[7] = abstractC0662k;
            objArr2[8] = H.L.f6584d;
            objArr2[9] = abstractC6216a2;
            rVar2.W(-568225417);
            int i19 = z12 ? 1 : 0;
            boolean z16 = z12 ? 1 : 0;
            int i20 = i19;
            int i21 = i20;
            while (i20 < 10) {
                i21 |= rVar2.g(objArr2[i20]) ? 1 : 0;
                i20++;
            }
            Object K13 = rVar2.K();
            if (i21 != 0 || K13 == iVar2) {
                f11 = f12;
                i14 = i16;
                rVar = rVar2;
                iVar = iVar2;
                H.w wVar = new H.w(w02, g0Var, z10, f6, f12, abstractC0662k, qVar, abstractC6216a2, abstractC4312d, abstractC4311c, i14);
                rVar.h0(wVar);
                K13 = wVar;
                z13 = false;
            } else {
                f11 = f12;
                i14 = i16;
                z13 = z12;
                rVar = rVar2;
                iVar = iVar2;
            }
            rVar.t(z13);
            wf.n nVar = (wf.n) K13;
            rVar.t(z13);
            rVar.W(511388516);
            boolean g12 = rVar.g(jVar) | rVar.g(f6);
            Object K14 = rVar.K();
            io.sentry.hints.i iVar3 = iVar;
            if (g12 || K14 == iVar3) {
                K14 = new H.N(jVar, f6);
                rVar.h0(K14);
            }
            rVar.t(false);
            H.N n10 = (H.N) K14;
            W0 w03 = W0.f1213Y;
            boolean z17 = w02 == w03;
            rVar.W(352210115);
            Boolean valueOf2 = Boolean.valueOf(z10);
            Boolean valueOf3 = Boolean.valueOf(z17);
            rVar.W(1618982084);
            boolean g13 = rVar.g(valueOf2) | rVar.g(f6) | rVar.g(valueOf3);
            Object K15 = rVar.K();
            if (g13 || K15 == iVar3) {
                z14 = true;
                K15 = new C0530d(f6, z17, 1);
                rVar.h0(K15);
            } else {
                z14 = true;
            }
            rVar.t(false);
            G.V v10 = (G.V) K15;
            rVar.t(false);
            rVar.W(1157296644);
            boolean g14 = rVar.g(f6);
            Object K16 = rVar.K();
            if (g14 || K16 == iVar3) {
                K16 = new C0664m(f6);
                rVar.h0(K16);
            }
            rVar.t(false);
            C0664m c0664m = (C0664m) K16;
            AbstractC4326r G10 = Gi.e.G(abstractC4326r.g(f6.f6569x).g(f6.f6567v), qVar, v10, w02, z11, z10, rVar);
            if (w02 == w03) {
                abstractC4326r2 = A.M.f93c;
            } else {
                abstractC4326r2 = A.M.f92b;
            }
            AbstractC4326r g15 = G10.g(abstractC4326r2);
            rVar.W(373558254);
            Integer valueOf4 = Integer.valueOf(i14);
            rVar.W(511388516);
            boolean g16 = rVar.g(valueOf4) | rVar.g(f6);
            Object K17 = rVar.K();
            if (g16 || K17 == iVar3) {
                i15 = i14;
                K17 = new C0663l(f6, i15);
                rVar.h0(K17);
            } else {
                i15 = i14;
            }
            rVar.t(false);
            rVar.t(false);
            m1 m1Var = AbstractC0701r0.f7008k;
            int i22 = i15;
            Gi.e.b(qVar, androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.gestures.a.b(Gi.e.F(g15, (C0663l) K17, f6.f6566u, z10, (Z0.l) rVar.m(m1Var), w02, z11, rVar).g(e10.b()), f6, w02, e10, z11, (((Z0.l) rVar.m(m1Var)) != Z0.l.f22806Z || w02 == w03) ? !z10 : z10, n10, f6.f6562q, c0664m).g(new SuspendPointerInputElement(f6, null, new C0657f(f6, null), 6)), aVar, null), f6.f6565t, nVar, rVar, 0, 0);
            C1741v0 v11 = rVar.v();
            if (v11 == null) {
                return;
            }
            v11.f22739d = new C0653b(abstractC4326r, f6, g0Var, z10, w02, jVar, z11, i22, f11, abstractC0662k, aVar, kVar, abstractC4311c, abstractC4312d, pVar, i11, i12, i13);
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("beyondBoundsPageCount should be greater than or equal to 0, you selected ", i16).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, r0.L l10, C1572k0 c1572k0, C1597p0 c1597p0, C0051x c0051x, E.g0 g0Var, D.m mVar, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        r0.L l11;
        C1572k0 c1572k02;
        int i14;
        C1597p0 c1597p02;
        int i15;
        C0051x c0051x2;
        int i16;
        int i17;
        D.m mVar2;
        E.g0 g0Var2;
        C0051x c0051x3;
        C1597p0 c1597p03;
        C1572k0 c1572k03;
        r0.L l12;
        boolean z11;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        E.g0 g0Var3;
        C0051x c0051x4;
        C1572k0 c1572k04;
        r0.L l13;
        boolean z12;
        AbstractC4326r abstractC4326r3;
        D.m mVar3;
        int i18;
        int i19;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2106428362);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (rVar.i(abstractC6216a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= rVar.g(abstractC4326r) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                i12 |= rVar.h(z10) ? 256 : 128;
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l11 = l10;
                        if (rVar.g(l11)) {
                            i19 = 2048;
                            i12 |= i19;
                        }
                    } else {
                        l11 = l10;
                    }
                    i19 = 1024;
                    i12 |= i19;
                } else {
                    l11 = l10;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1572k02 = c1572k0;
                        if (rVar.g(c1572k02)) {
                            i18 = 16384;
                            i12 |= i18;
                        }
                    } else {
                        c1572k02 = c1572k0;
                    }
                    i18 = 8192;
                    i12 |= i18;
                } else {
                    c1572k02 = c1572k0;
                }
                i14 = i11 & 32;
                if (i14 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    c1597p02 = c1597p0;
                    i12 |= rVar.g(c1597p02) ? 131072 : 65536;
                    i15 = i11 & 64;
                    if (i15 == 0) {
                        i12 |= 1572864;
                    } else if ((1572864 & i10) == 0) {
                        c0051x2 = c0051x;
                        i12 |= rVar.g(c0051x2) ? 1048576 : 524288;
                        i16 = i11 & 128;
                        if (i16 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 12582912) == 0) {
                            i12 |= rVar.g(g0Var) ? 8388608 : 4194304;
                        }
                        i17 = i11 & 256;
                        if (i17 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            i12 |= rVar.g(mVar) ? 67108864 : 33554432;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            i12 |= rVar.i(oVar) ? 536870912 : 268435456;
                            if ((i12 & 306783379) != 306783378 && rVar.B()) {
                                rVar.P();
                                abstractC4326r2 = abstractC4326r;
                                z11 = z10;
                                mVar2 = mVar;
                                l12 = l11;
                                c1572k03 = c1572k02;
                                c1597p03 = c1597p02;
                                c0051x3 = c0051x2;
                                g0Var2 = g0Var;
                            } else {
                                rVar.R();
                                if ((i10 & 1) == 0 && !rVar.A()) {
                                    rVar.P();
                                    if ((i11 & 8) != 0) {
                                        i12 &= -7169;
                                    }
                                    if ((i11 & 16) != 0) {
                                        i12 &= -57345;
                                    }
                                    abstractC4326r3 = abstractC4326r;
                                    z12 = z10;
                                    g0Var3 = g0Var;
                                    mVar3 = mVar;
                                    l13 = l11;
                                    c1572k04 = c1572k02;
                                    c0051x4 = c0051x2;
                                } else {
                                    abstractC4326r3 = i20 == 0 ? C4323o.f37719b : abstractC4326r;
                                    z12 = i13 == 0 ? true : z10;
                                    if ((i11 & 8) == 0) {
                                        E.i0 i0Var = AbstractC1577l0.f20203a;
                                        rVar.W(-349121587);
                                        l13 = AbstractC1530b3.a(5, rVar);
                                        rVar.t(false);
                                        i12 &= -7169;
                                    } else {
                                        l13 = l11;
                                    }
                                    if ((i11 & 16) == 0) {
                                        E.i0 i0Var2 = AbstractC1577l0.f20203a;
                                        rVar.W(1880341584);
                                        c1572k04 = AbstractC1577l0.e((W.P0) rVar.m(R0.f19593a));
                                        rVar.t(false);
                                        i12 &= -57345;
                                    } else {
                                        c1572k04 = c1572k02;
                                    }
                                    c0051x4 = null;
                                    if (i14 != 0) {
                                        c1597p02 = null;
                                    }
                                    if (i15 == 0) {
                                        c0051x4 = c0051x2;
                                    }
                                    g0Var3 = i16 == 0 ? AbstractC1577l0.f20204b : g0Var;
                                    if (i17 == 0) {
                                        rVar.W(593745314);
                                        Object K10 = rVar.K();
                                        if (K10 == C1723m.f22654Y) {
                                            K10 = kotlin.jvm.internal.m.d();
                                            rVar.h0(K10);
                                        }
                                        mVar3 = (D.m) K10;
                                        rVar.t(false);
                                    } else {
                                        mVar3 = mVar;
                                    }
                                }
                                rVar.u();
                                a(abstractC6216a, abstractC4326r3, z12, l13, c1572k04, c1597p02, c0051x4, g0Var3, mVar3, oVar, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
                                abstractC4326r2 = abstractC4326r3;
                                z11 = z12;
                                l12 = l13;
                                c1572k03 = c1572k04;
                                c0051x3 = c0051x4;
                                g0Var2 = g0Var3;
                                c1597p03 = c1597p02;
                                mVar2 = mVar3;
                            }
                            v10 = rVar.v();
                            if (v10 != null) {
                                return;
                            }
                            v10.f22739d = new C1606r0(abstractC6216a, abstractC4326r2, z11, l12, c1572k03, c1597p03, c0051x3, g0Var2, mVar2, oVar, i10, i11, 2);
                            return;
                        }
                        if ((i12 & 306783379) != 306783378) {
                        }
                        rVar.R();
                        if ((i10 & 1) == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) == 0) {
                        }
                        if ((i11 & 16) == 0) {
                        }
                        c0051x4 = null;
                        if (i14 != 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        rVar.u();
                        a(abstractC6216a, abstractC4326r3, z12, l13, c1572k04, c1597p02, c0051x4, g0Var3, mVar3, oVar, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
                        abstractC4326r2 = abstractC4326r3;
                        z11 = z12;
                        l12 = l13;
                        c1572k03 = c1572k04;
                        c0051x3 = c0051x4;
                        g0Var2 = g0Var3;
                        c1597p03 = c1597p02;
                        mVar2 = mVar3;
                        v10 = rVar.v();
                        if (v10 != null) {
                        }
                    }
                    c0051x2 = c0051x;
                    i16 = i11 & 128;
                    if (i16 != 0) {
                    }
                    i17 = i11 & 256;
                    if (i17 != 0) {
                    }
                    if ((i11 & 512) != 0) {
                    }
                    if ((i12 & 306783379) != 306783378) {
                    }
                    rVar.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) == 0) {
                    }
                    if ((i11 & 16) == 0) {
                    }
                    c0051x4 = null;
                    if (i14 != 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    rVar.u();
                    a(abstractC6216a, abstractC4326r3, z12, l13, c1572k04, c1597p02, c0051x4, g0Var3, mVar3, oVar, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
                    abstractC4326r2 = abstractC4326r3;
                    z11 = z12;
                    l12 = l13;
                    c1572k03 = c1572k04;
                    c0051x3 = c0051x4;
                    g0Var2 = g0Var3;
                    c1597p03 = c1597p02;
                    mVar2 = mVar3;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                c1597p02 = c1597p0;
                i15 = i11 & 64;
                if (i15 == 0) {
                }
                c0051x2 = c0051x;
                i16 = i11 & 128;
                if (i16 != 0) {
                }
                i17 = i11 & 256;
                if (i17 != 0) {
                }
                if ((i11 & 512) != 0) {
                }
                if ((i12 & 306783379) != 306783378) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i20 == 0) {
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) == 0) {
                }
                if ((i11 & 16) == 0) {
                }
                c0051x4 = null;
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                rVar.u();
                a(abstractC6216a, abstractC4326r3, z12, l13, c1572k04, c1597p02, c0051x4, g0Var3, mVar3, oVar, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
                abstractC4326r2 = abstractC4326r3;
                z11 = z12;
                l12 = l13;
                c1572k03 = c1572k04;
                c0051x3 = c0051x4;
                g0Var2 = g0Var3;
                c1597p03 = c1597p02;
                mVar2 = mVar3;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            i14 = i11 & 32;
            if (i14 != 0) {
            }
            c1597p02 = c1597p0;
            i15 = i11 & 64;
            if (i15 == 0) {
            }
            c0051x2 = c0051x;
            i16 = i11 & 128;
            if (i16 != 0) {
            }
            i17 = i11 & 256;
            if (i17 != 0) {
            }
            if ((i11 & 512) != 0) {
            }
            if ((i12 & 306783379) != 306783378) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i20 == 0) {
            }
            if (i13 == 0) {
            }
            if ((i11 & 8) == 0) {
            }
            if ((i11 & 16) == 0) {
            }
            c0051x4 = null;
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            rVar.u();
            a(abstractC6216a, abstractC4326r3, z12, l13, c1572k04, c1597p02, c0051x4, g0Var3, mVar3, oVar, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
            abstractC4326r2 = abstractC4326r3;
            z11 = z12;
            l12 = l13;
            c1572k03 = c1572k04;
            c0051x3 = c0051x4;
            g0Var2 = g0Var3;
            c1597p03 = c1597p02;
            mVar2 = mVar3;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        i14 = i11 & 32;
        if (i14 != 0) {
        }
        c1597p02 = c1597p0;
        i15 = i11 & 64;
        if (i15 == 0) {
        }
        c0051x2 = c0051x;
        i16 = i11 & 128;
        if (i16 != 0) {
        }
        i17 = i11 & 256;
        if (i17 != 0) {
        }
        if ((i11 & 512) != 0) {
        }
        if ((i12 & 306783379) != 306783378) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i20 == 0) {
        }
        if (i13 == 0) {
        }
        if ((i11 & 8) == 0) {
        }
        if ((i11 & 16) == 0) {
        }
        c0051x4 = null;
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        rVar.u();
        a(abstractC6216a, abstractC4326r3, z12, l13, c1572k04, c1597p02, c0051x4, g0Var3, mVar3, oVar, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
        abstractC4326r2 = abstractC4326r3;
        z11 = z12;
        l12 = l13;
        c1572k03 = c1572k04;
        c0051x3 = c0051x4;
        g0Var2 = g0Var3;
        c1597p03 = c1597p02;
        mVar2 = mVar3;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void g(boolean z10, Y0.h hVar, N.t0 t0Var, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1344558920);
        Boolean valueOf = Boolean.valueOf(z10);
        rVar.W(511388516);
        boolean g10 = rVar.g(valueOf) | rVar.g(t0Var);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            t0Var.getClass();
            K10 = new N.c0(t0Var, z10);
            rVar.h0(K10);
        }
        rVar.t(false);
        L.x0 x0Var = (L.x0) K10;
        N.u0 u0Var = new N.u0(t0Var, z10);
        boolean f6 = N0.D.f(t0Var.j().f16831b);
        SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(x0Var, null, new N.v0(x0Var, null), 6);
        int i11 = i10 << 3;
        M3.H.h(u0Var, z10, hVar, f6, suspendPointerInputElement, rVar, (i11 & 112) | (i11 & 896));
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1021e(z10, hVar, t0Var, i10);
        }
    }

    public static final AbstractC1710f0 h(boolean z10, boolean z11, D.l lVar, N3 n32, float f6, float f10, AbstractC1725n abstractC1725n, int i10) {
        long j6;
        l1 l1Var;
        float f11;
        l1 l1Var2;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1633063017);
        AbstractC1710f0 a02 = r9.y.a0(lVar, rVar, (i10 >> 6) & 14);
        n32.getClass();
        rVar.W(-1877482635);
        AbstractC1710f0 a03 = r9.y.a0(lVar, rVar, (((i10 & 7168) | (((i10 & 14) | (i10 & 112)) | (i10 & 896))) >> 6) & 14);
        if (!z10) {
            j6 = n32.f19443n;
        } else if (z11) {
            j6 = n32.f19444o;
        } else if (((Boolean) a03.getValue()).booleanValue()) {
            j6 = n32.f19441l;
        } else {
            j6 = n32.f19442m;
        }
        if (z10) {
            rVar.W(715804770);
            l1Var = y.l0.a(j6, AbstractC6696f.v(150, 0, null, 6), null, rVar, 48, 12);
            rVar.t(false);
        } else {
            rVar.W(715804875);
            l1Var = AbstractC4828h.g0(new r0.r(j6), rVar);
            rVar.t(false);
        }
        rVar.t(false);
        if (((Boolean) a02.getValue()).booleanValue()) {
            f11 = f6;
        } else {
            f11 = f10;
        }
        if (z10) {
            rVar.W(-1927721478);
            l1Var2 = AbstractC6704j.a(f11, AbstractC6696f.v(150, 0, null, 6), null, rVar, 48, 12);
            rVar.t(false);
        } else {
            rVar.W(-1927721380);
            l1Var2 = AbstractC4828h.g0(new Z0.e(f10), rVar);
            rVar.t(false);
        }
        AbstractC1710f0 g02 = AbstractC4828h.g0(new C0051x(((Z0.e) l1Var2.getValue()).f22788Y, new r0.N(((r0.r) l1Var.getValue()).f44265a)), rVar);
        rVar.t(false);
        return g02;
    }

    public static final int i(long j6) {
        int i10;
        if ((4294967295L & j6) == 0) {
            i10 = 32;
            j6 >>= 32;
        } else {
            i10 = 0;
        }
        if ((65535 & j6) == 0) {
            i10 += 16;
            j6 >>= 16;
        }
        if ((255 & j6) == 0) {
            i10 += 8;
            j6 >>= 8;
        }
        if ((15 & j6) == 0) {
            i10 += 4;
            j6 >>= 4;
        }
        if ((1 & j6) == 0) {
            if ((2 & j6) != 0) {
                return i10 + 1;
            }
            if ((4 & j6) != 0) {
                return i10 + 2;
            }
            if ((j6 & 8) != 0) {
                return i10 + 3;
            }
            return -1;
        }
        return i10;
    }

    public static final void j(C6060g c6060g, int i10) {
        AbstractC3557B.c0("<this>", c6060g);
        c6060g.f47584Y = new int[i10];
        c6060g.f47585Z = new Object[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [B.u1] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(AbstractC0168u1 abstractC0168u1, float f6, AbstractC6714o abstractC6714o, AbstractC4825e abstractC4825e) {
        C0124f1 c0124f1;
        int i10;
        kotlin.jvm.internal.y yVar;
        if (abstractC4825e instanceof C0124f1) {
            C0124f1 c0124f12 = (C0124f1) abstractC4825e;
            int i11 = c0124f12.f1316h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0124f12.f1316h0 = i11 - Integer.MIN_VALUE;
                c0124f1 = c0124f12;
                Object obj = c0124f1.f1315Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0124f1.f1316h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        yVar = c0124f1.f1314Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ?? obj2 = new Object();
                    C0127g1 c0127g1 = new C0127g1(f6, abstractC6714o, obj2, null);
                    c0124f1.f1314Y = obj2;
                    c0124f1.f1316h0 = 1;
                    if (abstractC0168u1.c(A.B0.f14Y, c0127g1, c0124f1) == enumC5000a) {
                        return enumC5000a;
                    }
                    yVar = obj2;
                }
                return new Float(yVar.f37646Y);
            }
        }
        c0124f1 = new AbstractC5156c(abstractC4825e);
        Object obj3 = c0124f1.f1315Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0124f1.f1316h0;
        if (i10 == 0) {
        }
        return new Float(yVar.f37646Y);
    }

    public static final int m(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else if (i10 < i13) {
                length = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static int n(Context context, String str) {
        int i10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d10 = AbstractC4896k.d(str);
        if (d10 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && C1.b.a(packageName2, packageName)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c10 = AbstractC4897l.c(context);
                    i10 = AbstractC4897l.a(c10, d10, Binder.getCallingUid(), packageName);
                    if (i10 == 0) {
                        i10 = AbstractC4897l.a(c10, d10, myUid, AbstractC4897l.b(context));
                    }
                } else {
                    i10 = AbstractC4896k.c((AppOpsManager) AbstractC4896k.a(context, AppOpsManager.class), d10, packageName);
                }
            } else {
                i10 = AbstractC4896k.c((AppOpsManager) AbstractC4896k.a(context, AppOpsManager.class), d10, packageName);
            }
            if (i10 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final float o(Layout layout, int i10, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        O0.r rVar = O0.t.f13332a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        int lineStart = layout.getLineStart(i10);
        float measureText = paint.measureText("\u2026") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + lineStart) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment != null && Q0.d.f14264a[paragraphAlignment.ordinal()] == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float p(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        O0.r rVar = O0.t.f13332a;
        if (layout.getEllipsisCount(i10) > 0 && layout.getParagraphDirection(i10) == -1 && layout.getWidth() < layout.getLineRight(i10)) {
            float primaryHorizontal = layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10));
            float measureText = paint.measureText("\u2026") + (layout.getLineRight(i10) - primaryHorizontal);
            Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
            if (paragraphAlignment != null && Q0.d.f14264a[paragraphAlignment.ordinal()] == 1) {
                width = layout.getWidth() - layout.getLineRight(i10);
                width2 = (layout.getWidth() - measureText) / 2.0f;
            } else {
                width = layout.getWidth() - layout.getLineRight(i10);
                width2 = layout.getWidth() - measureText;
            }
            return width - width2;
        }
        return 0.0f;
    }

    public static final String q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final int r(C6060g c6060g, Object obj, int i10) {
        AbstractC3557B.c0("<this>", c6060g);
        int i11 = c6060g.f47586h0;
        if (i11 == 0) {
            return -1;
        }
        try {
            int a5 = AbstractC6262a.a(c6060g.f47586h0, i10, c6060g.f47584Y);
            if (a5 < 0) {
                return a5;
            }
            if (AbstractC3557B.K(obj, c6060g.f47585Z[a5])) {
                return a5;
            }
            int i12 = a5 + 1;
            while (i12 < i11 && c6060g.f47584Y[i12] == i10) {
                if (AbstractC3557B.K(obj, c6060g.f47585Z[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a5 - 1; i13 >= 0 && c6060g.f47584Y[i13] == i10; i13--) {
                if (AbstractC3557B.K(obj, c6060g.f47585Z[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int s(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final boolean t(N.t0 t0Var, boolean z10) {
        AbstractC0461u c10;
        L.P0 p02 = t0Var.f12416d;
        if (p02 != null && (c10 = p02.c()) != null) {
            return N.h0.a(t0Var.i(z10), N.h0.c(c10));
        }
        return false;
    }

    public static final String u(Object obj) {
        String str;
        if (obj.getClass().isAnonymousClass()) {
            str = obj.getClass().getName();
        } else {
            str = obj.getClass().getSimpleName();
        }
        return str + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String v(int i10, AbstractC1725n abstractC1725n) {
        return Df.H.q0(abstractC1725n).getString(i10);
    }

    public static final String w(int i10, Object[] objArr, AbstractC1725n abstractC1725n) {
        return Df.H.q0(abstractC1725n).getString(i10, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String x(AbstractC4825e abstractC4825e) {
        String str;
        if (abstractC4825e instanceof Sg.i) {
            return abstractC4825e.toString();
        }
        try {
            str = abstractC4825e + '@' + q(abstractC4825e);
        } catch (Throwable th2) {
            str = com.google.android.gms.internal.play_billing.N.w(th2);
        }
        Throwable a5 = C3961k.a(str);
        String str2 = str;
        if (a5 != null) {
            str2 = abstractC4825e.getClass().getName() + '@' + q(abstractC4825e);
        }
        return (String) str2;
    }

    public static final ExtractedText y(T0.z zVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = zVar.f16830a.f12512Y;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j6 = zVar.f16831b;
        extractedText.selectionStart = N0.D.e(j6);
        extractedText.selectionEnd = N0.D.d(j6);
        extractedText.flags = !Lg.n.a2(zVar.f16830a.f12512Y, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long z(long j6) {
        return AbstractC4828h.i((int) (j6 >> 32), (int) (j6 & 4294967295L));
    }
}
