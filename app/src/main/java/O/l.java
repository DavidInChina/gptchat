package O;

import A.C0041s;
import H0.AbstractC0701r0;
import Z.AbstractC1725n;
import Z.C1741v0;
import Z.r;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import q0.C5254f;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5654m;
import z.AbstractC6652A0;
import z.AbstractC6657D;
import z.AbstractC6696f;
import z.C6655C;
import z.C6676P;
import z.C6732x;
import z.C6737z0;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final float f13267a = 40;

    /* renamed from: b  reason: collision with root package name */
    public static final C6732x f13268b;

    static {
        float f6 = h.f13246a;
        if (!Float.isNaN(0.2f) && !Float.isNaN(0.0f) && !Float.isNaN(0.8f) && !Float.isNaN(1.0f)) {
            if (!Float.isNaN(0.4f) && !Float.isNaN(0.0f) && !Float.isNaN(1.0f) && !Float.isNaN(1.0f)) {
                if (!Float.isNaN(0.0f) && !Float.isNaN(0.0f) && !Float.isNaN(0.65f) && !Float.isNaN(1.0f)) {
                    if (!Float.isNaN(0.1f) && !Float.isNaN(0.0f) && !Float.isNaN(0.45f) && !Float.isNaN(1.0f)) {
                        f13268b = new C6732x(0.4f, 0.2f, 1.0f);
                        return;
                    }
                    throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.1, 0.0, 0.45, 1.0.".toString());
                }
                throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.0, 0.0, 0.65, 1.0.".toString());
            }
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.4, 0.0, 1.0, 1.0.".toString());
        }
        throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.2, 0.0, 0.8, 1.0.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC4326r abstractC4326r, long j6, float f6, long j10, int i10, AbstractC1725n abstractC1725n, int i11, int i12) {
        int i13;
        AbstractC4326r abstractC4326r2;
        long j11;
        float f10;
        int i14;
        long j12;
        int i15;
        int i16;
        long j13;
        float f11;
        long j14;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i17;
        long j15;
        float f12;
        long j16;
        AbstractC4326r abstractC4326r4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        r rVar = (r) abstractC1725n;
        rVar.X(-1119119072);
        int i23 = i12 & 1;
        if (i23 != 0) {
            i13 = i11 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i11 & 14) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i13 = i22 | i11;
        } else {
            abstractC4326r2 = abstractC4326r;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                j11 = j6;
                if (rVar.f(j11)) {
                    i21 = 32;
                    i13 |= i21;
                }
            } else {
                j11 = j6;
            }
            i21 = 16;
            i13 |= i21;
        } else {
            j11 = j6;
        }
        int i24 = i12 & 4;
        if (i24 != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            f10 = f6;
            if (rVar.d(f10)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i13 |= i20;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                j12 = j10;
                if (rVar.f(j12)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i13 |= i19;
                if ((57344 & i11) == 0) {
                    if ((i12 & 16) == 0) {
                        i15 = i10;
                        if (rVar.e(i15)) {
                            i18 = 16384;
                            i13 |= i18;
                        }
                    } else {
                        i15 = i10;
                    }
                    i18 = 8192;
                    i13 |= i18;
                } else {
                    i15 = i10;
                }
                if ((i13 & 46811) != 9362 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    j14 = j11;
                    f11 = f10;
                    j13 = j12;
                    i16 = i15;
                } else {
                    rVar.R();
                    if ((i11 & 1) == 0 && !rVar.A()) {
                        rVar.P();
                        abstractC4326r4 = abstractC4326r2;
                        j16 = j11;
                    } else {
                        if (i23 != 0) {
                            abstractC4326r4 = C4323o.f37719b;
                        } else {
                            abstractC4326r4 = abstractC4326r2;
                        }
                        if ((i12 & 2) != 0) {
                            j16 = ((r0.r) ((a) rVar.m(c.f13242a)).f13224a.getValue()).f44265a;
                        } else {
                            j16 = j11;
                        }
                        if (i24 != 0) {
                            f10 = h.f13246a;
                        }
                        if (i14 != 0) {
                            j12 = r0.r.f44262j;
                        }
                        if ((i12 & 16) != 0) {
                            i17 = 2;
                            f12 = f10;
                            j15 = j12;
                            rVar.u();
                            C5654m c5654m = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f12), 0.0f, i17, 0, 26);
                            C6676P t10 = AbstractC6696f.t(null, rVar, 1);
                            C6737z0 c6737z0 = AbstractC6652A0.f51117b;
                            C6655C c6655c = AbstractC6657D.f51128d;
                            float f13 = f12;
                            androidx.compose.foundation.a.a(androidx.compose.foundation.layout.e.j(L0.l.a(abstractC4326r4, true, C0041s.f292j0), f13267a), new i(j15, c5654m, f12, j16, AbstractC6696f.i(t10, 0, 5, c6737z0, AbstractC6696f.r(AbstractC6696f.v(6660, 0, c6655c, 2), 0, 6), null, rVar, 16), AbstractC6696f.f(t10, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(k.f13264Z), 0, 6), null, rVar, 4536, 8), AbstractC6696f.f(t10, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(k.f13265h0), 0, 6), null, rVar, 4536, 8), AbstractC6696f.f(t10, 0.0f, 286.0f, AbstractC6696f.r(AbstractC6696f.v(1332, 0, c6655c, 2), 0, 6), null, rVar, 4536, 8)), rVar, 0);
                            abstractC4326r3 = abstractC4326r4;
                            j13 = j15;
                            j14 = j16;
                            i16 = i17;
                            f11 = f13;
                        }
                    }
                    f12 = f10;
                    j15 = j12;
                    i17 = i15;
                    rVar.u();
                    C5654m c5654m2 = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f12), 0.0f, i17, 0, 26);
                    C6676P t102 = AbstractC6696f.t(null, rVar, 1);
                    C6737z0 c6737z02 = AbstractC6652A0.f51117b;
                    C6655C c6655c2 = AbstractC6657D.f51128d;
                    float f132 = f12;
                    androidx.compose.foundation.a.a(androidx.compose.foundation.layout.e.j(L0.l.a(abstractC4326r4, true, C0041s.f292j0), f13267a), new i(j15, c5654m2, f12, j16, AbstractC6696f.i(t102, 0, 5, c6737z02, AbstractC6696f.r(AbstractC6696f.v(6660, 0, c6655c2, 2), 0, 6), null, rVar, 16), AbstractC6696f.f(t102, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(k.f13264Z), 0, 6), null, rVar, 4536, 8), AbstractC6696f.f(t102, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(k.f13265h0), 0, 6), null, rVar, 4536, 8), AbstractC6696f.f(t102, 0.0f, 286.0f, AbstractC6696f.r(AbstractC6696f.v(1332, 0, c6655c2, 2), 0, 6), null, rVar, 4536, 8)), rVar, 0);
                    abstractC4326r3 = abstractC4326r4;
                    j13 = j15;
                    j14 = j16;
                    i16 = i17;
                    f11 = f132;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new j(abstractC4326r3, j14, f11, j13, i16, i11, i12, 0);
                    return;
                }
                return;
            }
            j12 = j10;
            if ((57344 & i11) == 0) {
            }
            if ((i13 & 46811) != 9362) {
            }
            rVar.R();
            if ((i11 & 1) == 0) {
            }
            if (i23 != 0) {
            }
            if ((i12 & 2) != 0) {
            }
            if (i24 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i12 & 16) != 0) {
            }
            f12 = f10;
            j15 = j12;
            i17 = i15;
            rVar.u();
            C5654m c5654m22 = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f12), 0.0f, i17, 0, 26);
            C6676P t1022 = AbstractC6696f.t(null, rVar, 1);
            C6737z0 c6737z022 = AbstractC6652A0.f51117b;
            C6655C c6655c22 = AbstractC6657D.f51128d;
            float f1322 = f12;
            androidx.compose.foundation.a.a(androidx.compose.foundation.layout.e.j(L0.l.a(abstractC4326r4, true, C0041s.f292j0), f13267a), new i(j15, c5654m22, f12, j16, AbstractC6696f.i(t1022, 0, 5, c6737z022, AbstractC6696f.r(AbstractC6696f.v(6660, 0, c6655c22, 2), 0, 6), null, rVar, 16), AbstractC6696f.f(t1022, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(k.f13264Z), 0, 6), null, rVar, 4536, 8), AbstractC6696f.f(t1022, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(k.f13265h0), 0, 6), null, rVar, 4536, 8), AbstractC6696f.f(t1022, 0.0f, 286.0f, AbstractC6696f.r(AbstractC6696f.v(1332, 0, c6655c22, 2), 0, 6), null, rVar, 4536, 8)), rVar, 0);
            abstractC4326r3 = abstractC4326r4;
            j13 = j15;
            j14 = j16;
            i16 = i17;
            f11 = f1322;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        f10 = f6;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        j12 = j10;
        if ((57344 & i11) == 0) {
        }
        if ((i13 & 46811) != 9362) {
        }
        rVar.R();
        if ((i11 & 1) == 0) {
        }
        if (i23 != 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if (i24 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i12 & 16) != 0) {
        }
        f12 = f10;
        j15 = j12;
        i17 = i15;
        rVar.u();
        C5654m c5654m222 = new C5654m(((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f12), 0.0f, i17, 0, 26);
        C6676P t10222 = AbstractC6696f.t(null, rVar, 1);
        C6737z0 c6737z0222 = AbstractC6652A0.f51117b;
        C6655C c6655c222 = AbstractC6657D.f51128d;
        float f13222 = f12;
        androidx.compose.foundation.a.a(androidx.compose.foundation.layout.e.j(L0.l.a(abstractC4326r4, true, C0041s.f292j0), f13267a), new i(j15, c5654m222, f12, j16, AbstractC6696f.i(t10222, 0, 5, c6737z0222, AbstractC6696f.r(AbstractC6696f.v(6660, 0, c6655c222, 2), 0, 6), null, rVar, 16), AbstractC6696f.f(t10222, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(k.f13264Z), 0, 6), null, rVar, 4536, 8), AbstractC6696f.f(t10222, 0.0f, 290.0f, AbstractC6696f.r(AbstractC6696f.s(k.f13265h0), 0, 6), null, rVar, 4536, 8), AbstractC6696f.f(t10222, 0.0f, 286.0f, AbstractC6696f.r(AbstractC6696f.v(1332, 0, c6655c222, 2), 0, 6), null, rVar, 4536, 8)), rVar, 0);
        abstractC4326r3 = abstractC4326r4;
        j13 = j15;
        j14 = j16;
        i16 = i17;
        f11 = f13222;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void b(AbstractC5650i abstractC5650i, float f6, float f10, long j6, C5654m c5654m) {
        float f11 = 2;
        float f12 = c5654m.f45623a / f11;
        float d10 = C5254f.d(abstractC5650i.g()) - (f11 * f12);
        AbstractC5648g.b(abstractC5650i, j6, f6, f10, R4.b.r(f12, f12), AbstractC4828h.i(d10, d10), 0.0f, c5654m, 832);
    }
}
