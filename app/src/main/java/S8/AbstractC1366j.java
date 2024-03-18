package S8;

import H0.AbstractC0701r0;
import Z.AbstractC1725n;
import Z.C1741v0;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: S8.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1366j {

    /* renamed from: b  reason: collision with root package name */
    public static final long f16331b;

    /* renamed from: c  reason: collision with root package name */
    public static final AbstractC4326r f16332c;

    /* renamed from: a  reason: collision with root package name */
    public static final N0.E f16330a = new N0.E(0, 0, null, null, S0.s.f16044h0, 16777183);

    /* renamed from: d  reason: collision with root package name */
    public static final long f16333d = M3.H.V(16);

    static {
        long b10 = r0.r.b(r0.r.f44257e, 0.5f);
        f16331b = b10;
        f16332c = androidx.compose.foundation.a.d(C4323o.f37719b, b10, r0.G.f44171a);
    }

    public static final void a(M m10, Boolean bool, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("<this>", m10);
        AbstractC3557B.c0("children", oVar);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-112929136);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(m10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(bool)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
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
                bool = null;
            }
            int i17 = i12 & 14;
            C1367k c1367k = O.c(O.b(m10, rVar)).f16253e;
            AbstractC3557B.Z(c1367k);
            N0.E e10 = L.e(m10, rVar).e(c1367k.f16335a);
            AbstractC4326r abstractC4326r = c1367k.f16336b;
            AbstractC3557B.Z(abstractC4326r);
            Z0.n nVar = c1367k.f16337c;
            AbstractC3557B.Z(nVar);
            float t10 = ((Z0.b) rVar.m(AbstractC0701r0.f7002e)).t(nVar.f22811a);
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                Boolean bool2 = c1367k.f16338d;
                AbstractC3557B.Z(bool2);
                z10 = bool2.booleanValue();
            }
            M3.H.c(m10, z10, R4.b.X(rVar, -1189457944, new C1365i(abstractC4326r, t10, e10, oVar)), rVar, i17 | 384);
        }
        Boolean bool3 = bool;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new G.E(m10, bool3, oVar, i10, i11, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(M m10, String str, Boolean bool, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        Boolean bool2;
        Boolean bool3;
        C1741v0 v10;
        Boolean bool4;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("<this>", m10);
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1183188838);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(m10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            bool2 = bool;
            if (rVar.g(bool)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
                bool3 = bool2;
            } else {
                if (i16 == 0) {
                    bool4 = null;
                } else {
                    bool4 = bool2;
                }
                a(m10, bool4, R4.b.X(rVar, 1557188131, new C1363g(str, 0)), rVar, (i12 & 14) | 384 | ((i12 >> 3) & 112), 0);
                bool3 = bool4;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new G.E(m10, str, bool3, i10, i11, 9);
                return;
            }
            return;
        }
        bool2 = bool;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        a(m10, bool4, R4.b.X(rVar, 1557188131, new C1363g(str, 0)), rVar, (i12 & 14) | 384 | ((i12 >> 3) & 112), 0);
        bool3 = bool4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
