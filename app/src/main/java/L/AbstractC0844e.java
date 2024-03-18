package L;

import E.C0432p;
import N.AbstractC1031o;
import N.EnumC1027k;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import l0.AbstractC4326r;

/* renamed from: L.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0844e {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10118a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f10119b;

    static {
        float f6 = 25;
        f10118a = f6;
        f10119b = (f6 * 2.0f) / 2.4142137f;
    }

    public static final void a(long j6, AbstractC4326r abstractC4326r, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-5185995);
        if ((i10 & 14) == 0) {
            if (rVar.f(j6)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(nVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            rVar.W(2068318109);
            boolean f6 = rVar.f(j6);
            Object K10 = rVar.K();
            if (f6 || K10 == C1723m.f22654Y) {
                K10 = new C0836a(j6);
                rVar.h0(K10);
            }
            rVar.t(false);
            M3.H.e((AbstractC1031o) K10, EnumC1027k.f12361h0, R4.b.X(rVar, -1458480226, new androidx.compose.foundation.layout.c(nVar, 5, abstractC4326r)), rVar, 432);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0838b(j6, abstractC4326r, nVar, i10, 0);
        }
    }

    public static final void b(AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(694251107);
        if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar.B()) {
            rVar.P();
        } else {
            androidx.compose.foundation.layout.a.d(U3.f.o(androidx.compose.foundation.layout.e.k(abstractC4326r, f10119b, f10118a), C0842d.f10109Z), rVar);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0432p(abstractC4326r, i10, 1);
        }
    }
}
