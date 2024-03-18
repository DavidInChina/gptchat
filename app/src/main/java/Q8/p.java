package Q8;

import E0.AbstractC0454m;
import E0.C0452k;
import E0.C0453l;
import G.I;
import H0.AbstractC0701r0;
import H0.Z;
import Z.AbstractC1725n;
import Z.C1741v0;
import Z.r;
import android.content.Context;
import g4.AbstractC3190r;
import g4.AbstractC3198z;
import g4.C3174b;
import g4.C3188p;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import t0.AbstractC5650i;
import t0.C5649h;
import t4.C5673a;
import y.C6475m;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final float f14520a = 64;

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, AbstractC4326r abstractC4326r, AbstractC0454m abstractC0454m, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        C4323o c4323o;
        int i15;
        int i16;
        int i17;
        AbstractC3557B.c0("url", str);
        AbstractC3557B.c0("contentScale", abstractC0454m);
        r rVar = (r) abstractC1725n;
        rVar.X(-980895233);
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
            if (rVar.g(str2)) {
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
            if (rVar.g(abstractC4326r2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
            if ((i11 & 8) == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (rVar.g(abstractC0454m)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 5851) != 1170 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i18 == 0) {
                    c4323o = C4323o.f37719b;
                } else {
                    c4323o = abstractC4326r2;
                }
                q4.h hVar = new q4.h((Context) rVar.m(Z.f6888b));
                hVar.f43805c = str;
                r4.h hVar2 = r4.h.f44440c;
                hVar.f43798K = new r4.e();
                hVar.b();
                hVar.f43816n = new C5673a(100);
                q4.j a5 = hVar.a();
                rVar.W(-1494234083);
                C3174b c3174b = C3174b.f31206h0;
                C0452k c0452k = C0453l.f4074b;
                AbstractC5650i.f45621D.getClass();
                C3188p a10 = AbstractC3190r.a(a5, R4.b.g1(AbstractC3198z.f31278a, rVar), c3174b, null, c0452k, C5649h.f45620c, rVar, 64);
                rVar.t(false);
                androidx.compose.foundation.layout.a.a(c4323o, C4310b.f37697j0, false, R4.b.X(rVar, -1906883371, new C6475m((Z0.b) rVar.m(AbstractC0701r0.f7002e), a10, str2, abstractC0454m, 4)), rVar, ((i14 >> 6) & 14) | 3120, 4);
                abstractC4326r3 = c4323o;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new I(str, str2, abstractC4326r3, abstractC0454m, i10, i11, 7);
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
        q4.h hVar3 = new q4.h((Context) rVar.m(Z.f6888b));
        hVar3.f43805c = str;
        r4.h hVar22 = r4.h.f44440c;
        hVar3.f43798K = new r4.e();
        hVar3.b();
        hVar3.f43816n = new C5673a(100);
        q4.j a52 = hVar3.a();
        rVar.W(-1494234083);
        C3174b c3174b2 = C3174b.f31206h0;
        C0452k c0452k2 = C0453l.f4074b;
        AbstractC5650i.f45621D.getClass();
        C3188p a102 = AbstractC3190r.a(a52, R4.b.g1(AbstractC3198z.f31278a, rVar), c3174b2, null, c0452k2, C5649h.f45620c, rVar, 64);
        rVar.t(false);
        androidx.compose.foundation.layout.a.a(c4323o, C4310b.f37697j0, false, R4.b.X(rVar, -1906883371, new C6475m((Z0.b) rVar.m(AbstractC0701r0.f7002e), a102, str2, abstractC0454m, 4)), rVar, ((i14 >> 6) & 14) | 3120, 4);
        abstractC4326r3 = c4323o;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
