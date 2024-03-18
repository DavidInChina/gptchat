package va;

import L.M;
import Ng.F;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C;
import Z.C1723m;
import Z.C1741v0;
import Z.r;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import p9.t;
import wf.n;
import y.AbstractC6463a;

/* renamed from: va.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6003d {

    /* renamed from: a  reason: collision with root package name */
    public static final float f47426a = 64;

    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C6004e c6004e, boolean z10, n nVar, AbstractC4326r abstractC4326r, n nVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        C1741v0 v10;
        Object i15;
        int i16;
        int i17;
        int i18;
        int i19;
        AbstractC3557B.c0("sidebarLayoutState", c6004e);
        AbstractC3557B.c0("sidebarContent", nVar);
        AbstractC3557B.c0("content", nVar2);
        AbstractC4326r a5 = io.sentry.compose.b.a("SidebarLayout");
        r rVar = (r) abstractC1725n;
        rVar.X(-1094288988);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c6004e)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(z10)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.i(nVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        int i20 = i11 & 8;
        if (i20 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
            if ((i11 & 16) == 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (rVar.i(nVar2)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((46811 & i14) != 9362 && rVar.B()) {
                rVar.P();
            } else {
                if (i20 == 0) {
                    a5 = abstractC4326r2;
                }
                i15 = AbstractC6463a.i(rVar, 773894976, -492369756);
                if (i15 == C1723m.f22654Y) {
                    C c10 = new C(AbstractC1734s.k(rVar));
                    rVar.h0(c10);
                    i15 = c10;
                }
                rVar.t(false);
                F f6 = ((C) i15).f22442Y;
                rVar.t(false);
                AbstractC4326r abstractC4326r3 = a5;
                androidx.compose.foundation.layout.a.a(abstractC4326r3, null, false, R4.b.X(rVar, -1629302406, new M(c6004e.f47427a, z10, nVar, nVar2, f6, 2)), rVar, ((i14 >> 9) & 14) | 3072, 6);
                abstractC4326r2 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new t(c6004e, z10, nVar, abstractC4326r2, nVar2, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i11 & 16) == 0) {
        }
        i14 = i12;
        if ((46811 & i14) != 9362) {
        }
        if (i20 == 0) {
        }
        i15 = AbstractC6463a.i(rVar, 773894976, -492369756);
        if (i15 == C1723m.f22654Y) {
        }
        rVar.t(false);
        F f62 = ((C) i15).f22442Y;
        rVar.t(false);
        AbstractC4326r abstractC4326r32 = a5;
        androidx.compose.foundation.layout.a.a(abstractC4326r32, null, false, R4.b.X(rVar, -1629302406, new M(c6004e.f47427a, z10, nVar, nVar2, f62, 2)), rVar, ((i14 >> 9) & 14) | 3072, 6);
        abstractC4326r2 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
