package W;

import A.C0041s;
import H0.AbstractC0701r0;
import X.AbstractC1671e;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import q0.C5254f;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5654m;
import wf.AbstractC6216a;
import z.AbstractC6652A0;
import z.AbstractC6657D;
import z.AbstractC6696f;
import z.C6655C;
import z.C6671K;
import z.C6676P;
import z.C6732x;
import z.C6737z0;

/* loaded from: classes2.dex */
public abstract class I2 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f19218a;

    /* renamed from: b  reason: collision with root package name */
    public static final AbstractC4326r f19219b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f19220c = 240;

    /* renamed from: d  reason: collision with root package name */
    public static final float f19221d = X.t.f21632a;

    /* renamed from: e  reason: collision with root package name */
    public static final float f19222e = AbstractC1671e.f21495b - (AbstractC1671e.f21494a * 2);

    /* renamed from: f  reason: collision with root package name */
    public static final C6732x f19223f = new C6732x(0.2f, 0.8f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    public static final C6732x f19224g = new C6732x(0.4f, 1.0f, 1.0f);

    /* renamed from: h  reason: collision with root package name */
    public static final C6732x f19225h = new C6732x(0.0f, 0.65f, 1.0f);

    /* renamed from: i  reason: collision with root package name */
    public static final C6732x f19226i = new C6732x(0.1f, 0.45f, 1.0f);

    /* renamed from: j  reason: collision with root package name */
    public static final C6732x f19227j = new C6732x(0.4f, 0.2f, 1.0f);

    static {
        float f6 = 10;
        f19218a = f6;
        f19219b = androidx.compose.foundation.layout.a.t(L0.l.a(androidx.compose.ui.layout.a.g(C4323o.f37719b, C1641y0.f20623o0), true, S.f19635t0), 0.0f, f6, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, long j6, float f6, long j10, int i10, AbstractC1725n abstractC1725n, int i11, int i12) {
        int i13;
        C4323o c4323o;
        long j11;
        int i14;
        float f10;
        long j12;
        int i15;
        int i16;
        long j13;
        float f11;
        long j14;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        boolean z10;
        Object K10;
        boolean g10;
        Object K11;
        boolean z11;
        boolean z12;
        boolean z13;
        Object K12;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-761680467);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (rVar.i(abstractC6216a)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i13 = i22 | i11;
        } else {
            i13 = i11;
        }
        int i23 = i12 & 2;
        if (i23 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            c4323o = abstractC4326r;
            if (rVar.g(c4323o)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i13 |= i21;
            if ((i11 & 384) != 0) {
                j11 = j6;
                if ((i12 & 4) == 0 && rVar.f(j11)) {
                    i20 = 256;
                } else {
                    i20 = 128;
                }
                i13 |= i20;
            } else {
                j11 = j6;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                f10 = f6;
                if (rVar.d(f10)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i13 |= i19;
                if ((i11 & 24576) == 0) {
                    j12 = j10;
                    if ((i12 & 16) == 0 && rVar.f(j12)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                } else {
                    j12 = j10;
                }
                i15 = i12 & 32;
                if (i15 != 0) {
                    i13 |= 196608;
                    i16 = i10;
                } else {
                    i16 = i10;
                    if ((i11 & 196608) == 0) {
                        if (rVar.e(i16)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                }
                if ((i13 & 74899) != 74898 && rVar.B()) {
                    rVar.P();
                    abstractC4326r2 = c4323o;
                    j14 = j11;
                    f11 = f10;
                    j13 = j12;
                } else {
                    rVar.R();
                    if ((i11 & 1) == 0 && !rVar.A()) {
                        rVar.P();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                    } else {
                        if (i23 != 0) {
                            c4323o = C4323o.f37719b;
                        }
                        if ((i12 & 4) != 0) {
                            float f12 = C2.f19018a;
                            rVar.W(1803349725);
                            float f13 = AbstractC1671e.f21494a;
                            j11 = R0.e(26, rVar);
                            rVar.t(false);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            f10 = C2.f19018a;
                        }
                        if ((i12 & 16) != 0) {
                            float f14 = C2.f19018a;
                            rVar.W(-404222247);
                            j12 = r0.r.f44262j;
                            rVar.t(false);
                            i13 &= -57345;
                        }
                        if (i15 != 0) {
                            float f15 = C2.f19018a;
                            i16 = 0;
                        }
                    }
                    rVar.u();
                    rVar.W(821866314);
                    if ((i13 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    K10 = rVar.K();
                    Object obj = C1723m.f22654Y;
                    if (!z10 || K10 == obj) {
                        K10 = new X1(abstractC6216a, 1);
                        rVar.h0(K10);
                    }
                    AbstractC6216a abstractC6216a2 = (AbstractC6216a) K10;
                    rVar.t(false);
                    C5654m c5654m = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f10), 0.0f, i16, 0, 26);
                    rVar.W(821866535);
                    g10 = rVar.g(abstractC6216a2);
                    K11 = rVar.K();
                    if (!g10 || K11 == obj) {
                        K11 = new U1(abstractC6216a2, 2);
                        rVar.h0(K11);
                    }
                    rVar.t(false);
                    AbstractC4326r j15 = androidx.compose.foundation.layout.e.j(L0.l.a(c4323o, true, (wf.k) K11), f19222e);
                    rVar.W(821866689);
                    boolean g11 = rVar.g(abstractC6216a2);
                    AbstractC4326r abstractC4326r3 = c4323o;
                    if ((((i13 & 57344) ^ 24576) <= 16384 && rVar.f(j12)) || (i13 & 24576) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean i24 = z11 | g11 | rVar.i(c5654m);
                    if ((((i13 & 896) ^ 384) <= 256 && rVar.f(j11)) || (i13 & 384) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = i24 | z12;
                    K12 = rVar.K();
                    if (!z13 || K12 == obj) {
                        K12 = new y.Z(abstractC6216a2, j12, c5654m, j11);
                        rVar.h0(K12);
                    }
                    rVar.t(false);
                    androidx.compose.foundation.a.a(j15, (wf.k) K12, rVar, 0);
                    j14 = j11;
                    f11 = f10;
                    j13 = j12;
                    abstractC4326r2 = abstractC4326r3;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new D2(abstractC6216a, abstractC4326r2, j14, f11, j13, i16, i11, i12);
                    return;
                }
                return;
            }
            f10 = f6;
            if ((i11 & 24576) == 0) {
            }
            i15 = i12 & 32;
            if (i15 != 0) {
            }
            if ((i13 & 74899) != 74898) {
            }
            rVar.R();
            if ((i11 & 1) == 0) {
            }
            if (i23 != 0) {
            }
            if ((i12 & 4) != 0) {
            }
            if (i14 != 0) {
            }
            if ((i12 & 16) != 0) {
            }
            if (i15 != 0) {
            }
            rVar.u();
            rVar.W(821866314);
            if ((i13 & 14) == 4) {
            }
            K10 = rVar.K();
            Object obj2 = C1723m.f22654Y;
            if (!z10) {
            }
            K10 = new X1(abstractC6216a, 1);
            rVar.h0(K10);
            AbstractC6216a abstractC6216a22 = (AbstractC6216a) K10;
            rVar.t(false);
            C5654m c5654m2 = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f10), 0.0f, i16, 0, 26);
            rVar.W(821866535);
            g10 = rVar.g(abstractC6216a22);
            K11 = rVar.K();
            if (!g10) {
            }
            K11 = new U1(abstractC6216a22, 2);
            rVar.h0(K11);
            rVar.t(false);
            AbstractC4326r j152 = androidx.compose.foundation.layout.e.j(L0.l.a(c4323o, true, (wf.k) K11), f19222e);
            rVar.W(821866689);
            boolean g112 = rVar.g(abstractC6216a22);
            AbstractC4326r abstractC4326r32 = c4323o;
            if (((i13 & 57344) ^ 24576) <= 16384) {
            }
            z11 = false;
            boolean i242 = z11 | g112 | rVar.i(c5654m2);
            if (((i13 & 896) ^ 384) <= 256) {
            }
            z12 = false;
            z13 = i242 | z12;
            K12 = rVar.K();
            if (!z13) {
            }
            K12 = new y.Z(abstractC6216a22, j12, c5654m2, j11);
            rVar.h0(K12);
            rVar.t(false);
            androidx.compose.foundation.a.a(j152, (wf.k) K12, rVar, 0);
            j14 = j11;
            f11 = f10;
            j13 = j12;
            abstractC4326r2 = abstractC4326r32;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        c4323o = abstractC4326r;
        if ((i11 & 384) != 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        f10 = f6;
        if ((i11 & 24576) == 0) {
        }
        i15 = i12 & 32;
        if (i15 != 0) {
        }
        if ((i13 & 74899) != 74898) {
        }
        rVar.R();
        if ((i11 & 1) == 0) {
        }
        if (i23 != 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if (i14 != 0) {
        }
        if ((i12 & 16) != 0) {
        }
        if (i15 != 0) {
        }
        rVar.u();
        rVar.W(821866314);
        if ((i13 & 14) == 4) {
        }
        K10 = rVar.K();
        Object obj22 = C1723m.f22654Y;
        if (!z10) {
        }
        K10 = new X1(abstractC6216a, 1);
        rVar.h0(K10);
        AbstractC6216a abstractC6216a222 = (AbstractC6216a) K10;
        rVar.t(false);
        C5654m c5654m22 = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f10), 0.0f, i16, 0, 26);
        rVar.W(821866535);
        g10 = rVar.g(abstractC6216a222);
        K11 = rVar.K();
        if (!g10) {
        }
        K11 = new U1(abstractC6216a222, 2);
        rVar.h0(K11);
        rVar.t(false);
        AbstractC4326r j1522 = androidx.compose.foundation.layout.e.j(L0.l.a(c4323o, true, (wf.k) K11), f19222e);
        rVar.W(821866689);
        boolean g1122 = rVar.g(abstractC6216a222);
        AbstractC4326r abstractC4326r322 = c4323o;
        if (((i13 & 57344) ^ 24576) <= 16384) {
        }
        z11 = false;
        boolean i2422 = z11 | g1122 | rVar.i(c5654m22);
        if (((i13 & 896) ^ 384) <= 256) {
        }
        z12 = false;
        z13 = i2422 | z12;
        K12 = rVar.K();
        if (!z13) {
        }
        K12 = new y.Z(abstractC6216a222, j12, c5654m22, j11);
        rVar.h0(K12);
        rVar.t(false);
        androidx.compose.foundation.a.a(j1522, (wf.k) K12, rVar, 0);
        j14 = j11;
        f11 = f10;
        j13 = j12;
        abstractC4326r2 = abstractC4326r322;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC4326r abstractC4326r, long j6, float f6, long j10, int i10, AbstractC1725n abstractC1725n, int i11, int i12) {
        int i13;
        AbstractC4326r abstractC4326r2;
        long j11;
        float f10;
        long j12;
        int i14;
        int i15;
        int i16;
        long j13;
        float f11;
        long j14;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object K10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-115871647);
        int i22 = i12 & 1;
        if (i22 != 0) {
            i13 = i11 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i11 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i13 = i21 | i11;
        } else {
            abstractC4326r2 = abstractC4326r;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            j11 = j6;
            if ((i12 & 2) == 0 && rVar.f(j11)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i13 |= i20;
        } else {
            j11 = j6;
        }
        int i23 = i12 & 4;
        if (i23 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            f10 = f6;
            if (rVar.d(f10)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i13 |= i19;
            if ((i11 & 3072) != 0) {
                j12 = j10;
                if ((i12 & 8) == 0 && rVar.f(j12)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i13 |= i18;
            } else {
                j12 = j10;
            }
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i15 = i10;
                if (rVar.e(i15)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
                if ((i13 & 9363) != 9362 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    i16 = i15;
                    j14 = j11;
                    f11 = f10;
                    j13 = j12;
                } else {
                    rVar.R();
                    if ((i11 & 1) == 0 && !rVar.A()) {
                        rVar.P();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        abstractC4326r4 = abstractC4326r2;
                    } else {
                        if (i22 != 0) {
                            abstractC4326r4 = C4323o.f37719b;
                        } else {
                            abstractC4326r4 = abstractC4326r2;
                        }
                        if ((i12 & 2) != 0) {
                            float f12 = C2.f19018a;
                            rVar.W(1803349725);
                            float f13 = AbstractC1671e.f21494a;
                            j11 = R0.e(26, rVar);
                            rVar.t(false);
                            i13 &= -113;
                        }
                        if (i23 != 0) {
                            f10 = C2.f19018a;
                        }
                        if ((i12 & 8) != 0) {
                            float f14 = C2.f19018a;
                            rVar.W(-404222247);
                            j12 = r0.r.f44262j;
                            rVar.t(false);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            i15 = C2.f19019b;
                        }
                    }
                    rVar.u();
                    C5654m c5654m = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f10), 0.0f, i15, 0, 26);
                    C6676P t10 = AbstractC6696f.t(null, rVar, 1);
                    C6737z0 c6737z0 = AbstractC6652A0.f51117b;
                    C6655C c6655c = AbstractC6657D.f51128d;
                    int i24 = i15;
                    C6671K i25 = AbstractC6696f.i(t10, 0, 5, c6737z0, AbstractC6696f.r(AbstractC6696f.v(6660, 0, c6655c, 2), 0, 6), null, rVar, 16);
                    C6671K f15 = AbstractC6696f.f(t10, 0.0f, 286.0f, AbstractC6696f.r(AbstractC6696f.v(1332, 0, c6655c, 2), 0, 6), null, rVar, 4536, 8);
                    C6671K f16 = AbstractC6696f.f(t10, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19633r0), 0, 6), null, rVar, 4536, 8);
                    C6671K f17 = AbstractC6696f.f(t10, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19634s0), 0, 6), null, rVar, 4536, 8);
                    AbstractC4326r j15 = androidx.compose.foundation.layout.e.j(L0.l.a(abstractC4326r4, true, C0041s.f292j0), f19222e);
                    rVar.W(821870113);
                    if ((((i13 & 7168) ^ 3072) <= 2048 && rVar.f(j12)) || (i13 & 3072) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean i26 = z10 | rVar.i(c5654m) | rVar.g(i25) | rVar.g(f16) | rVar.g(f17) | rVar.g(f15);
                    AbstractC4326r abstractC4326r5 = abstractC4326r4;
                    if ((i13 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z14 = z11 | i26;
                    if ((((i13 & 112) ^ 48) <= 32 && rVar.f(j11)) || (i13 & 48) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z14 | z12;
                    K10 = rVar.K();
                    if (!z13 || K10 == C1723m.f22654Y) {
                        K10 = new O.i(j12, c5654m, i25, f16, f17, f15, f10, j11);
                        rVar.h0(K10);
                    }
                    rVar.t(false);
                    androidx.compose.foundation.a.a(j15, (wf.k) K10, rVar, 0);
                    j14 = j11;
                    f11 = f10;
                    j13 = j12;
                    abstractC4326r3 = abstractC4326r5;
                    i16 = i24;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new O.j(abstractC4326r3, j14, f11, j13, i16, i11, i12, 1);
                    return;
                }
                return;
            }
            i15 = i10;
            if ((i13 & 9363) != 9362) {
            }
            rVar.R();
            if ((i11 & 1) == 0) {
            }
            if (i22 != 0) {
            }
            if ((i12 & 2) != 0) {
            }
            if (i23 != 0) {
            }
            if ((i12 & 8) != 0) {
            }
            if (i14 != 0) {
            }
            rVar.u();
            C5654m c5654m2 = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f10), 0.0f, i15, 0, 26);
            C6676P t102 = AbstractC6696f.t(null, rVar, 1);
            C6737z0 c6737z02 = AbstractC6652A0.f51117b;
            C6655C c6655c2 = AbstractC6657D.f51128d;
            int i242 = i15;
            C6671K i252 = AbstractC6696f.i(t102, 0, 5, c6737z02, AbstractC6696f.r(AbstractC6696f.v(6660, 0, c6655c2, 2), 0, 6), null, rVar, 16);
            C6671K f152 = AbstractC6696f.f(t102, 0.0f, 286.0f, AbstractC6696f.r(AbstractC6696f.v(1332, 0, c6655c2, 2), 0, 6), null, rVar, 4536, 8);
            C6671K f162 = AbstractC6696f.f(t102, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19633r0), 0, 6), null, rVar, 4536, 8);
            C6671K f172 = AbstractC6696f.f(t102, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19634s0), 0, 6), null, rVar, 4536, 8);
            AbstractC4326r j152 = androidx.compose.foundation.layout.e.j(L0.l.a(abstractC4326r4, true, C0041s.f292j0), f19222e);
            rVar.W(821870113);
            if (((i13 & 7168) ^ 3072) <= 2048) {
            }
            z10 = false;
            boolean i262 = z10 | rVar.i(c5654m2) | rVar.g(i252) | rVar.g(f162) | rVar.g(f172) | rVar.g(f152);
            AbstractC4326r abstractC4326r52 = abstractC4326r4;
            if ((i13 & 896) == 256) {
            }
            boolean z142 = z11 | i262;
            if (((i13 & 112) ^ 48) <= 32) {
            }
            z12 = false;
            z13 = z142 | z12;
            K10 = rVar.K();
            if (!z13) {
            }
            K10 = new O.i(j12, c5654m2, i252, f162, f172, f152, f10, j11);
            rVar.h0(K10);
            rVar.t(false);
            androidx.compose.foundation.a.a(j152, (wf.k) K10, rVar, 0);
            j14 = j11;
            f11 = f10;
            j13 = j12;
            abstractC4326r3 = abstractC4326r52;
            i16 = i242;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        f10 = f6;
        if ((i11 & 3072) != 0) {
        }
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        i15 = i10;
        if ((i13 & 9363) != 9362) {
        }
        rVar.R();
        if ((i11 & 1) == 0) {
        }
        if (i22 != 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if (i23 != 0) {
        }
        if ((i12 & 8) != 0) {
        }
        if (i14 != 0) {
        }
        rVar.u();
        C5654m c5654m22 = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f10), 0.0f, i15, 0, 26);
        C6676P t1022 = AbstractC6696f.t(null, rVar, 1);
        C6737z0 c6737z022 = AbstractC6652A0.f51117b;
        C6655C c6655c22 = AbstractC6657D.f51128d;
        int i2422 = i15;
        C6671K i2522 = AbstractC6696f.i(t1022, 0, 5, c6737z022, AbstractC6696f.r(AbstractC6696f.v(6660, 0, c6655c22, 2), 0, 6), null, rVar, 16);
        C6671K f1522 = AbstractC6696f.f(t1022, 0.0f, 286.0f, AbstractC6696f.r(AbstractC6696f.v(1332, 0, c6655c22, 2), 0, 6), null, rVar, 4536, 8);
        C6671K f1622 = AbstractC6696f.f(t1022, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19633r0), 0, 6), null, rVar, 4536, 8);
        C6671K f1722 = AbstractC6696f.f(t1022, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19634s0), 0, 6), null, rVar, 4536, 8);
        AbstractC4326r j1522 = androidx.compose.foundation.layout.e.j(L0.l.a(abstractC4326r4, true, C0041s.f292j0), f19222e);
        rVar.W(821870113);
        if (((i13 & 7168) ^ 3072) <= 2048) {
        }
        z10 = false;
        boolean i2622 = z10 | rVar.i(c5654m22) | rVar.g(i2522) | rVar.g(f1622) | rVar.g(f1722) | rVar.g(f1522);
        AbstractC4326r abstractC4326r522 = abstractC4326r4;
        if ((i13 & 896) == 256) {
        }
        boolean z1422 = z11 | i2622;
        if (((i13 & 112) ^ 48) <= 32) {
        }
        z12 = false;
        z13 = z1422 | z12;
        K10 = rVar.K();
        if (!z13) {
        }
        K10 = new O.i(j12, c5654m22, i2522, f1622, f1722, f1522, f10, j11);
        rVar.h0(K10);
        rVar.t(false);
        androidx.compose.foundation.a.a(j1522, (wf.k) K10, rVar, 0);
        j14 = j11;
        f11 = f10;
        j13 = j12;
        abstractC4326r3 = abstractC4326r522;
        i16 = i2422;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(AbstractC4326r abstractC4326r, long j6, long j10, int i10, AbstractC1725n abstractC1725n, int i11, int i12) {
        int i13;
        AbstractC4326r abstractC4326r2;
        long j11;
        long j12;
        int i14;
        int i15;
        long j13;
        long j14;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        long j15;
        int i16;
        int i17;
        long j16;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean g10;
        Object K10;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-476865359);
        int i22 = i12 & 1;
        if (i22 != 0) {
            i13 = i11 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i11 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i13 = i21 | i11;
        } else {
            abstractC4326r2 = abstractC4326r;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            j11 = j6;
            if ((i12 & 2) == 0 && rVar.f(j11)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i13 |= i20;
        } else {
            j11 = j6;
        }
        if ((i11 & 384) == 0) {
            j12 = j10;
            if ((i12 & 4) == 0 && rVar.f(j12)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i13 |= i19;
        } else {
            j12 = j10;
        }
        int i23 = i12 & 8;
        if (i23 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i14 = i10;
            if (rVar.e(i14)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i13 |= i18;
            if ((i13 & 1171) != 1170 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
                j14 = j11;
                j13 = j12;
                i15 = i14;
            } else {
                rVar.R();
                if ((i11 & 1) == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    abstractC4326r4 = abstractC4326r2;
                } else {
                    if (i22 == 0) {
                        abstractC4326r4 = C4323o.f37719b;
                    } else {
                        abstractC4326r4 = abstractC4326r2;
                    }
                    if ((i12 & 2) != 0) {
                        float f6 = C2.f19018a;
                        rVar.W(-914312983);
                        float f10 = X.t.f21632a;
                        j11 = R0.e(26, rVar);
                        rVar.t(false);
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        float f11 = C2.f19018a;
                        rVar.W(1677541593);
                        float f12 = X.t.f21632a;
                        j12 = R0.e(44, rVar);
                        rVar.t(false);
                        i13 &= -897;
                    }
                    if (i23 != 0) {
                        float f13 = C2.f19018a;
                        j15 = j12;
                        i16 = 0;
                        i17 = i13;
                        j14 = j11;
                        rVar.u();
                        C6676P t10 = AbstractC6696f.t(null, rVar, 1);
                        j16 = j15;
                        C6671K f14 = AbstractC6696f.f(t10, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19636u0), 0, 6), null, rVar, 4536, 8);
                        C6671K f15 = AbstractC6696f.f(t10, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19637v0), 0, 6), null, rVar, 4536, 8);
                        C6671K f16 = AbstractC6696f.f(t10, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19638w0), 0, 6), null, rVar, 4536, 8);
                        C6671K f17 = AbstractC6696f.f(t10, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19639x0), 0, 6), null, rVar, 4536, 8);
                        AbstractC4326r k10 = androidx.compose.foundation.layout.e.k(L0.l.a(abstractC4326r4.g(f19219b), true, C0041s.f292j0), f19220c, f19221d);
                        rVar.W(-1348537245);
                        if ((((i17 & 896) ^ 384) <= 256 && rVar.f(j16)) || (i17 & 384) == 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i17 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean g11 = z10 | z11 | rVar.g(f14) | rVar.g(f15);
                        AbstractC4326r abstractC4326r5 = abstractC4326r4;
                        if ((((i17 & 112) ^ 48) <= 32 && rVar.f(j14)) || (i17 & 48) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        g10 = g11 | z12 | rVar.g(f16) | rVar.g(f17);
                        K10 = rVar.K();
                        if (!g10 || K10 == C1723m.f22654Y) {
                            K10 = new G2(j16, i16, f14, f15, j14, f16, f17);
                            rVar.h0(K10);
                        }
                        rVar.t(false);
                        androidx.compose.foundation.a.a(k10, (wf.k) K10, rVar, 0);
                        i15 = i16;
                        j13 = j16;
                        abstractC4326r3 = abstractC4326r5;
                    }
                }
                i16 = i14;
                j15 = j12;
                i17 = i13;
                j14 = j11;
                rVar.u();
                C6676P t102 = AbstractC6696f.t(null, rVar, 1);
                j16 = j15;
                C6671K f142 = AbstractC6696f.f(t102, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19636u0), 0, 6), null, rVar, 4536, 8);
                C6671K f152 = AbstractC6696f.f(t102, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19637v0), 0, 6), null, rVar, 4536, 8);
                C6671K f162 = AbstractC6696f.f(t102, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19638w0), 0, 6), null, rVar, 4536, 8);
                C6671K f172 = AbstractC6696f.f(t102, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19639x0), 0, 6), null, rVar, 4536, 8);
                AbstractC4326r k102 = androidx.compose.foundation.layout.e.k(L0.l.a(abstractC4326r4.g(f19219b), true, C0041s.f292j0), f19220c, f19221d);
                rVar.W(-1348537245);
                if (((i17 & 896) ^ 384) <= 256) {
                }
                z10 = false;
                if ((i17 & 7168) == 2048) {
                }
                boolean g112 = z10 | z11 | rVar.g(f142) | rVar.g(f152);
                AbstractC4326r abstractC4326r52 = abstractC4326r4;
                if (((i17 & 112) ^ 48) <= 32) {
                }
                z12 = false;
                g10 = g112 | z12 | rVar.g(f162) | rVar.g(f172);
                K10 = rVar.K();
                if (!g10) {
                }
                K10 = new G2(j16, i16, f142, f152, j14, f162, f172);
                rVar.h0(K10);
                rVar.t(false);
                androidx.compose.foundation.a.a(k102, (wf.k) K10, rVar, 0);
                i15 = i16;
                j13 = j16;
                abstractC4326r3 = abstractC4326r52;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new H2(abstractC4326r3, j14, j13, i15, i11, i12);
                return;
            }
            return;
        }
        i14 = i10;
        if ((i13 & 1171) != 1170) {
        }
        rVar.R();
        if ((i11 & 1) == 0) {
        }
        if (i22 == 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if (i23 != 0) {
        }
        i16 = i14;
        j15 = j12;
        i17 = i13;
        j14 = j11;
        rVar.u();
        C6676P t1022 = AbstractC6696f.t(null, rVar, 1);
        j16 = j15;
        C6671K f1422 = AbstractC6696f.f(t1022, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19636u0), 0, 6), null, rVar, 4536, 8);
        C6671K f1522 = AbstractC6696f.f(t1022, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19637v0), 0, 6), null, rVar, 4536, 8);
        C6671K f1622 = AbstractC6696f.f(t1022, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19638w0), 0, 6), null, rVar, 4536, 8);
        C6671K f1722 = AbstractC6696f.f(t1022, 0.0f, 1.0f, AbstractC6696f.r(AbstractC6696f.s(S.f19639x0), 0, 6), null, rVar, 4536, 8);
        AbstractC4326r k1022 = androidx.compose.foundation.layout.e.k(L0.l.a(abstractC4326r4.g(f19219b), true, C0041s.f292j0), f19220c, f19221d);
        rVar.W(-1348537245);
        if (((i17 & 896) ^ 384) <= 256) {
        }
        z10 = false;
        if ((i17 & 7168) == 2048) {
        }
        boolean g1122 = z10 | z11 | rVar.g(f1422) | rVar.g(f1522);
        AbstractC4326r abstractC4326r522 = abstractC4326r4;
        if (((i17 & 112) ^ 48) <= 32) {
        }
        z12 = false;
        g10 = g1122 | z12 | rVar.g(f1622) | rVar.g(f1722);
        K10 = rVar.K();
        if (!g10) {
        }
        K10 = new G2(j16, i16, f1422, f1522, j14, f1622, f1722);
        rVar.h0(K10);
        rVar.t(false);
        androidx.compose.foundation.a.a(k1022, (wf.k) K10, rVar, 0);
        i15 = i16;
        j13 = j16;
        abstractC4326r3 = abstractC4326r522;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, long j6, long j10, int i10, AbstractC1725n abstractC1725n, int i11, int i12) {
        int i13;
        C4323o c4323o;
        long j11;
        long j12;
        int i14;
        int i15;
        int i16;
        long j13;
        long j14;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        long j15;
        boolean z10;
        Object K10;
        boolean g10;
        Object K11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object K12;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1796992155);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (rVar.i(abstractC6216a)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i13 = i21 | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            c4323o = abstractC4326r;
            if (rVar.g(c4323o)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i13 |= i20;
            if ((i11 & 384) != 0) {
                j11 = j6;
                if ((i12 & 4) == 0 && rVar.f(j11)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i13 |= i19;
            } else {
                j11 = j6;
            }
            if ((i11 & 3072) != 0) {
                j12 = j10;
                if ((i12 & 8) == 0 && rVar.f(j12)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i13 |= i18;
            } else {
                j12 = j10;
            }
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i15 = i10;
                if (rVar.e(i15)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
                if ((i13 & 9363) != 9362 && rVar.B()) {
                    rVar.P();
                    abstractC4326r2 = c4323o;
                    i16 = i15;
                    j14 = j11;
                    j13 = j12;
                } else {
                    rVar.R();
                    if ((i11 & 1) == 0 && !rVar.A()) {
                        rVar.P();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        j15 = j12;
                    } else {
                        if (i22 != 0) {
                            c4323o = C4323o.f37719b;
                        }
                        if ((i12 & 4) != 0) {
                            float f6 = C2.f19018a;
                            rVar.W(-914312983);
                            float f10 = X.t.f21632a;
                            j11 = R0.e(26, rVar);
                            rVar.t(false);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            float f11 = C2.f19018a;
                            rVar.W(1677541593);
                            float f12 = X.t.f21632a;
                            j15 = R0.e(44, rVar);
                            rVar.t(false);
                            i13 &= -7169;
                        } else {
                            j15 = j12;
                        }
                        if (i14 != 0) {
                            float f13 = C2.f19018a;
                            i15 = 0;
                        }
                    }
                    rVar.u();
                    rVar.W(-1348540816);
                    if ((i13 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    K10 = rVar.K();
                    Object obj = C1723m.f22654Y;
                    if (!z10 || K10 == obj) {
                        K10 = new X1(abstractC6216a, 2);
                        rVar.h0(K10);
                    }
                    AbstractC6216a abstractC6216a2 = (AbstractC6216a) K10;
                    rVar.t(false);
                    AbstractC4326r g11 = c4323o.g(f19219b);
                    rVar.W(-1348540664);
                    g10 = rVar.g(abstractC6216a2);
                    K11 = rVar.K();
                    if (!g10 || K11 == obj) {
                        K11 = new U1(abstractC6216a2, 3);
                        rVar.h0(K11);
                    }
                    rVar.t(false);
                    AbstractC4326r k10 = androidx.compose.foundation.layout.e.k(L0.l.a(g11, true, (wf.k) K11), f19220c, f19221d);
                    rVar.W(-1348540492);
                    if ((((i13 & 7168) ^ 3072) <= 2048 && rVar.f(j15)) || (i13 & 3072) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((57344 & i13) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean g12 = z11 | z12 | rVar.g(abstractC6216a2);
                    if ((((i13 & 896) ^ 384) <= 256 && rVar.f(j11)) || (i13 & 384) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = g12 | z13;
                    K12 = rVar.K();
                    if (!z14 || K12 == obj) {
                        K12 = new E2(j15, i15, abstractC6216a2, j11);
                        rVar.h0(K12);
                    }
                    rVar.t(false);
                    androidx.compose.foundation.a.a(k10, (wf.k) K12, rVar, 0);
                    abstractC4326r2 = c4323o;
                    i16 = i15;
                    j14 = j11;
                    j13 = j15;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new F2(abstractC6216a, abstractC4326r2, j14, j13, i16, i11, i12);
                    return;
                }
                return;
            }
            i15 = i10;
            if ((i13 & 9363) != 9362) {
            }
            rVar.R();
            if ((i11 & 1) == 0) {
            }
            if (i22 != 0) {
            }
            if ((i12 & 4) != 0) {
            }
            if ((i12 & 8) != 0) {
            }
            if (i14 != 0) {
            }
            rVar.u();
            rVar.W(-1348540816);
            if ((i13 & 14) == 4) {
            }
            K10 = rVar.K();
            Object obj2 = C1723m.f22654Y;
            if (!z10) {
            }
            K10 = new X1(abstractC6216a, 2);
            rVar.h0(K10);
            AbstractC6216a abstractC6216a22 = (AbstractC6216a) K10;
            rVar.t(false);
            AbstractC4326r g112 = c4323o.g(f19219b);
            rVar.W(-1348540664);
            g10 = rVar.g(abstractC6216a22);
            K11 = rVar.K();
            if (!g10) {
            }
            K11 = new U1(abstractC6216a22, 3);
            rVar.h0(K11);
            rVar.t(false);
            AbstractC4326r k102 = androidx.compose.foundation.layout.e.k(L0.l.a(g112, true, (wf.k) K11), f19220c, f19221d);
            rVar.W(-1348540492);
            if (((i13 & 7168) ^ 3072) <= 2048) {
            }
            z11 = false;
            if ((57344 & i13) == 16384) {
            }
            boolean g122 = z11 | z12 | rVar.g(abstractC6216a22);
            if (((i13 & 896) ^ 384) <= 256) {
            }
            z13 = false;
            z14 = g122 | z13;
            K12 = rVar.K();
            if (!z14) {
            }
            K12 = new E2(j15, i15, abstractC6216a22, j11);
            rVar.h0(K12);
            rVar.t(false);
            androidx.compose.foundation.a.a(k102, (wf.k) K12, rVar, 0);
            abstractC4326r2 = c4323o;
            i16 = i15;
            j14 = j11;
            j13 = j15;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        c4323o = abstractC4326r;
        if ((i11 & 384) != 0) {
        }
        if ((i11 & 3072) != 0) {
        }
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        i15 = i10;
        if ((i13 & 9363) != 9362) {
        }
        rVar.R();
        if ((i11 & 1) == 0) {
        }
        if (i22 != 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if ((i12 & 8) != 0) {
        }
        if (i14 != 0) {
        }
        rVar.u();
        rVar.W(-1348540816);
        if ((i13 & 14) == 4) {
        }
        K10 = rVar.K();
        Object obj22 = C1723m.f22654Y;
        if (!z10) {
        }
        K10 = new X1(abstractC6216a, 2);
        rVar.h0(K10);
        AbstractC6216a abstractC6216a222 = (AbstractC6216a) K10;
        rVar.t(false);
        AbstractC4326r g1122 = c4323o.g(f19219b);
        rVar.W(-1348540664);
        g10 = rVar.g(abstractC6216a222);
        K11 = rVar.K();
        if (!g10) {
        }
        K11 = new U1(abstractC6216a222, 3);
        rVar.h0(K11);
        rVar.t(false);
        AbstractC4326r k1022 = androidx.compose.foundation.layout.e.k(L0.l.a(g1122, true, (wf.k) K11), f19220c, f19221d);
        rVar.W(-1348540492);
        if (((i13 & 7168) ^ 3072) <= 2048) {
        }
        z11 = false;
        if ((57344 & i13) == 16384) {
        }
        boolean g1222 = z11 | z12 | rVar.g(abstractC6216a222);
        if (((i13 & 896) ^ 384) <= 256) {
        }
        z13 = false;
        z14 = g1222 | z13;
        K12 = rVar.K();
        if (!z14) {
        }
        K12 = new E2(j15, i15, abstractC6216a222, j11);
        rVar.h0(K12);
        rVar.t(false);
        androidx.compose.foundation.a.a(k1022, (wf.k) K12, rVar, 0);
        abstractC4326r2 = c4323o;
        i16 = i15;
        j14 = j11;
        j13 = j15;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void e(AbstractC5650i abstractC5650i, float f6, float f10, long j6, C5654m c5654m) {
        float f11 = 2;
        float f12 = c5654m.f45623a / f11;
        float d10 = C5254f.d(abstractC5650i.g()) - (f11 * f12);
        AbstractC5648g.b(abstractC5650i, j6, f6, f10, R4.b.r(f12, f12), AbstractC4828h.i(d10, d10), 0.0f, c5654m, 832);
    }

    public static final void f(AbstractC5650i abstractC5650i, float f6, float f10, long j6, float f11, int i10) {
        boolean z10;
        float f12;
        float f13;
        float d10 = C5254f.d(abstractC5650i.g());
        float b10 = C5254f.b(abstractC5650i.g());
        float f14 = 2;
        float f15 = b10 / f14;
        if (abstractC5650i.getLayoutDirection() == Z0.l.f22805Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f12 = f6;
        } else {
            f12 = 1.0f - f10;
        }
        float f16 = f12 * d10;
        if (z10) {
            f13 = f10;
        } else {
            f13 = 1.0f - f6;
        }
        float f17 = f13 * d10;
        if (!r0.G.f(i10, 0) && b10 <= d10) {
            float f18 = f11 / f14;
            Cf.d dVar = new Cf.d(f18, d10 - f18);
            float floatValue = ((Number) com.google.android.gms.internal.play_billing.N.s(Float.valueOf(f16), dVar)).floatValue();
            float floatValue2 = ((Number) com.google.android.gms.internal.play_billing.N.s(Float.valueOf(f17), dVar)).floatValue();
            if (Math.abs(f10 - f6) > 0.0f) {
                AbstractC5648g.g(abstractC5650i, j6, R4.b.r(floatValue, f15), R4.b.r(floatValue2, f15), f11, i10, 480);
                return;
            }
            return;
        }
        AbstractC5648g.g(abstractC5650i, j6, R4.b.r(f16, f15), R4.b.r(f17, f15), f11, 0, 496);
    }
}
