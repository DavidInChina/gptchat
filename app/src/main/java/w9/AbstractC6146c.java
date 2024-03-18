package w9;

import S8.X;
import W.C1603q1;
import W.G3;
import W.P0;
import W.R0;
import W.Z2;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import Z.r;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.k;
import wf.o;
import z.AbstractC6652A0;
import z.AbstractC6659E;
import z.AbstractC6696f;
import z.C6684Y;
import z.C6721r0;
import z.C6729v0;
import z.C6737z0;

/* renamed from: w9.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6146c {

    /* renamed from: a  reason: collision with root package name */
    public static final float f48244a = 8;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C6684Y c6684y, long j6, AbstractC4326r abstractC4326r, o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        r rVar;
        C1741v0 v10;
        boolean booleanValue;
        float f6;
        boolean booleanValue2;
        boolean booleanValue3;
        float f10;
        boolean booleanValue4;
        boolean z10;
        boolean z11;
        Object K10;
        int i15;
        int i16;
        int i17;
        AbstractC3557B.c0("expandedStates", c6684y);
        AbstractC3557B.c0("content", oVar);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("PopupMenuContent");
        r rVar2 = (r) abstractC1725n;
        rVar2.X(-1121546233);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(c6684y)) {
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
            if (rVar2.f(j6)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
            if ((i11 & 8) == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (rVar2.i(oVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 5851) != 1170 && rVar2.B()) {
                rVar2.P();
                a5 = abstractC4326r2;
                rVar = rVar2;
            } else {
                if (i18 == 0) {
                    a5 = abstractC4326r2;
                }
                C6729v0 y10 = AbstractC6696f.y(c6684y, rVar2);
                C6145b c6145b = C6145b.f48242h0;
                rVar2.W(-1338768149);
                C6737z0 c6737z0 = AbstractC6652A0.f51116a;
                rVar2.W(-142660079);
                booleanValue = ((Boolean) y10.b()).booleanValue();
                rVar2.W(-718045149);
                float f11 = 0.8f;
                float f12 = 1.0f;
                if (!booleanValue) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.8f;
                }
                rVar2.t(false);
                Float valueOf = Float.valueOf(f6);
                C1724m0 c1724m0 = y10.f51386c;
                booleanValue2 = ((Boolean) c1724m0.getValue()).booleanValue();
                rVar2.W(-718045149);
                if (booleanValue2) {
                    f11 = 1.0f;
                }
                rVar2.t(false);
                C6721r0 n10 = AbstractC6696f.n(y10, valueOf, Float.valueOf(f11), (AbstractC6659E) c6145b.invoke(y10.c(), rVar2, 0), c6737z0, rVar2);
                rVar2.t(false);
                rVar2.t(false);
                C6145b c6145b2 = C6145b.f48241Z;
                rVar2.W(-1338768149);
                rVar2.W(-142660079);
                booleanValue3 = ((Boolean) y10.b()).booleanValue();
                rVar2.W(996838199);
                if (!booleanValue3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rVar2.t(false);
                Float valueOf2 = Float.valueOf(f10);
                booleanValue4 = ((Boolean) c1724m0.getValue()).booleanValue();
                rVar2.W(996838199);
                if (!booleanValue4) {
                    f12 = 0.0f;
                }
                rVar2.t(false);
                C6721r0 n11 = AbstractC6696f.n(y10, valueOf2, Float.valueOf(f12), (AbstractC6659E) c6145b2.invoke(y10.c(), rVar2, 0), c6737z0, rVar2);
                rVar2.t(false);
                rVar2.t(false);
                rVar2.W(-610863325);
                boolean g10 = rVar2.g(n10) | rVar2.g(n11);
                if ((i14 & 112) != 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = g10 | z10;
                K10 = rVar2.K();
                if (!z11 || K10 == C1723m.f22654Y) {
                    K10 = new C6144a(j6, n10, n11);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC4326r l10 = androidx.compose.ui.graphics.a.l(c4323o, (k) K10);
                K.e eVar = Z2.f19878a;
                long j10 = ((P0) rVar2.m(R0.f19593a)).f19532p;
                float f13 = p9.i.f42783b;
                rVar = rVar2;
                G3.a(l10, eVar, j10, 0L, f13, f13, null, R4.b.X(rVar2, 1587984780, new X(a5, oVar, 3)), rVar, 12804096, 72);
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C1603q1(c6684y, j6, a5, oVar, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i11 & 8) == 0) {
        }
        i14 = i12;
        if ((i14 & 5851) != 1170) {
        }
        if (i18 == 0) {
        }
        C6729v0 y102 = AbstractC6696f.y(c6684y, rVar2);
        C6145b c6145b3 = C6145b.f48242h0;
        rVar2.W(-1338768149);
        C6737z0 c6737z02 = AbstractC6652A0.f51116a;
        rVar2.W(-142660079);
        booleanValue = ((Boolean) y102.b()).booleanValue();
        rVar2.W(-718045149);
        float f112 = 0.8f;
        float f122 = 1.0f;
        if (!booleanValue) {
        }
        rVar2.t(false);
        Float valueOf3 = Float.valueOf(f6);
        C1724m0 c1724m02 = y102.f51386c;
        booleanValue2 = ((Boolean) c1724m02.getValue()).booleanValue();
        rVar2.W(-718045149);
        if (booleanValue2) {
        }
        rVar2.t(false);
        C6721r0 n102 = AbstractC6696f.n(y102, valueOf3, Float.valueOf(f112), (AbstractC6659E) c6145b3.invoke(y102.c(), rVar2, 0), c6737z02, rVar2);
        rVar2.t(false);
        rVar2.t(false);
        C6145b c6145b22 = C6145b.f48241Z;
        rVar2.W(-1338768149);
        rVar2.W(-142660079);
        booleanValue3 = ((Boolean) y102.b()).booleanValue();
        rVar2.W(996838199);
        if (!booleanValue3) {
        }
        rVar2.t(false);
        Float valueOf22 = Float.valueOf(f10);
        booleanValue4 = ((Boolean) c1724m02.getValue()).booleanValue();
        rVar2.W(996838199);
        if (!booleanValue4) {
        }
        rVar2.t(false);
        C6721r0 n112 = AbstractC6696f.n(y102, valueOf22, Float.valueOf(f122), (AbstractC6659E) c6145b22.invoke(y102.c(), rVar2, 0), c6737z02, rVar2);
        rVar2.t(false);
        rVar2.t(false);
        rVar2.W(-610863325);
        boolean g102 = rVar2.g(n102) | rVar2.g(n112);
        if ((i14 & 112) != 32) {
        }
        z11 = g102 | z10;
        K10 = rVar2.K();
        if (!z11) {
        }
        K10 = new C6144a(j6, n102, n112);
        rVar2.h0(K10);
        rVar2.t(false);
        AbstractC4326r l102 = androidx.compose.ui.graphics.a.l(c4323o, (k) K10);
        K.e eVar2 = Z2.f19878a;
        long j102 = ((P0) rVar2.m(R0.f19593a)).f19532p;
        float f132 = p9.i.f42783b;
        rVar = rVar2;
        G3.a(l102, eVar2, j102, 0L, f132, f132, null, R4.b.X(rVar2, 1587984780, new X(a5, oVar, 3)), rVar, 12804096, 72);
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
