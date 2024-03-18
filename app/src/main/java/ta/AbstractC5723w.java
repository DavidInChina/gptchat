package ta;

import E.AbstractC0429m;
import E.C0421f;
import E.C0426j;
import F.AbstractC0539m;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import za.C6783B;

/* renamed from: ta.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5723w {

    /* renamed from: a  reason: collision with root package name */
    public static final float f46020a = 96;

    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C6783B c6783b, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        Object obj;
        C1741v0 v10;
        int i13;
        boolean z10;
        boolean z11;
        Object K10;
        boolean z12;
        boolean z13;
        Object K11;
        int i14;
        int i15;
        int i16;
        AbstractC3557B.c0("inputState", c6783b);
        AbstractC3557B.c0("onInputIntent", kVar);
        Object a5 = io.sentry.compose.b.a("InputAttachmentsView");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2113712335);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c6783b)) {
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
            obj = abstractC4326r;
            if (rVar.g(obj)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
            } else {
                if (i17 == 0) {
                    a5 = obj;
                }
                F.J a10 = F.M.a(0, rVar, 3);
                Integer valueOf = Integer.valueOf(c6783b.f51762e.size());
                rVar.W(-2038291152);
                boolean g10 = rVar.g(a10);
                i13 = i12 & 14;
                boolean z14 = true;
                if (i13 != 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = g10 | z10;
                K10 = rVar.K();
                Object obj2 = C1723m.f22654Y;
                if (!z11 || K10 == obj2) {
                    K10 = new C5720t(a10, c6783b, null);
                    rVar.h0(K10);
                }
                rVar.t(false);
                AbstractC1734s.e(valueOf, (wf.n) K10, rVar);
                C0421f c0421f = AbstractC0429m.f3907a;
                C0426j g11 = AbstractC0429m.g(p9.r.f42840d);
                rVar.W(-2038290933);
                if (i13 != 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((i12 & 112) != 32) {
                    z14 = false;
                }
                z13 = z12 | z14;
                K11 = rVar.K();
                if (!z13 || K11 == obj2) {
                    K11 = new s3.r(c6783b, 27, kVar);
                    rVar.h0(K11);
                }
                rVar.t(false);
                AbstractC0539m.c(a5, a10, null, false, g11, null, null, false, (wf.k) K11, rVar, (i12 >> 6) & 14, 236);
                obj = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C5722v(c6783b, kVar, obj, i10, i11, 0);
                return;
            }
            return;
        }
        obj = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i17 == 0) {
        }
        F.J a102 = F.M.a(0, rVar, 3);
        Integer valueOf2 = Integer.valueOf(c6783b.f51762e.size());
        rVar.W(-2038291152);
        boolean g102 = rVar.g(a102);
        i13 = i12 & 14;
        boolean z142 = true;
        if (i13 != 4) {
        }
        z11 = g102 | z10;
        K10 = rVar.K();
        Object obj22 = C1723m.f22654Y;
        if (!z11) {
        }
        K10 = new C5720t(a102, c6783b, null);
        rVar.h0(K10);
        rVar.t(false);
        AbstractC1734s.e(valueOf2, (wf.n) K10, rVar);
        C0421f c0421f2 = AbstractC0429m.f3907a;
        C0426j g112 = AbstractC0429m.g(p9.r.f42840d);
        rVar.W(-2038290933);
        if (i13 != 4) {
        }
        if ((i12 & 112) != 32) {
        }
        z13 = z12 | z142;
        K11 = rVar.K();
        if (!z13) {
        }
        K11 = new s3.r(c6783b, 27, kVar);
        rVar.h0(K11);
        rVar.t(false);
        AbstractC0539m.c(a5, a102, null, false, g112, null, null, false, (wf.k) K11, rVar, (i12 >> 6) & 14, 236);
        obj = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
