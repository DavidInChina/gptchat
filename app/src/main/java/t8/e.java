package T8;

import N.C1041z;
import N.D;
import S8.C1357a;
import S8.C1368l;
import S8.N;
import Z.AbstractC1725n;
import Z.C1741v0;
import Z.O;
import Z.r;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.n;
import wf.o;
import x8.W;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final O f16963a = A7.b.o0(c.f16959Y);

    public static final void a(AbstractC4326r abstractC4326r, N n10, o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("children", oVar);
        r rVar = (r) abstractC1725n;
        rVar.X(-649695358);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(n10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.i(oVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            if (i16 != 0) {
                abstractC4326r = C4323o.f37719b;
            }
            if (i17 != 0) {
                n10 = null;
            }
            b(R4.b.X(rVar, 391388596, new D(abstractC4326r, n10, oVar, 7)), rVar, 6);
        }
        AbstractC4326r abstractC4326r2 = abstractC4326r;
        N n11 = n10;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1357a(abstractC4326r2, n11, oVar, i10, i11, 1);
        }
    }

    public static final void b(n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        AbstractC3557B.c0("child", nVar);
        r rVar = (r) abstractC1725n;
        rVar.X(-1726357480);
        if ((i10 & 14) == 0) {
            if (rVar.i(nVar)) {
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
        } else if (!((Boolean) rVar.m(f16963a)).booleanValue()) {
            rVar.W(-383566387);
            W.r(d.f16960Z, b.f16957a, d.f16961h0, b.f16958b, R4.b.X(rVar, 1746380571, new C1368l(nVar, 6)), rVar, 27696, 0);
            rVar.t(false);
        } else {
            rVar.W(-383565853);
            nVar.invoke(rVar, Integer.valueOf(i11 & 14));
            rVar.t(false);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1041z(nVar, i10, 2);
        }
    }
}
