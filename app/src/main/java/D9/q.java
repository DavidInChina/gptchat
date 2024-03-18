package d9;

import G.I;
import L0.u;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1741v0;
import Z.r;
import java.util.ArrayList;
import java.util.List;
import jf.C3963m;
import kf.v;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import pd.s;
import s3.AbstractC5568s;
import s3.C5567q;
import wd.EnumC6206t;
import y.U;
import yf.AbstractC6583a;
import z.C6675O;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final List f28166a = AbstractC4344b.G0("chat.openai.com", "chatgpt.com", "www.chatgpt.com");

    public static final void a(AbstractC5568s abstractC5568s, AbstractC1725n abstractC1725n, int i10) {
        u uVar = io.sentry.compose.b.f34309a;
        r rVar = (r) abstractC1725n;
        rVar.X(-869879721);
        AbstractC1734s.b(abstractC5568s, new C5567q(abstractC5568s, 2), rVar);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6675O(abstractC5568s, i10, 11);
        }
    }

    public static final void b(AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        AbstractC4326r a5 = io.sentry.compose.b.a("MainApp");
        r rVar = (r) abstractC1725n;
        rVar.X(597584961);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.B()) {
            rVar.P();
        } else {
            if (i14 != 0) {
                abstractC4326r = a5;
            }
            C3963m D12 = R4.b.D1(C2608c.f28129h0);
            ((f9.p) D12.getValue()).f29896a.getClass();
            Tc.f W02 = Ad.l.W0(EnumC6206t.f48461h0, rVar, 30);
            pd.g gVar = (pd.g) ((f9.p) D12.getValue()).Q.get();
            AbstractC1734s.e(gVar, new m(gVar, W02, null), rVar);
            a(W02.f17057b, rVar, 8);
            A7.b.F(false, R4.b.X(rVar, 199263877, new n(W02, gVar, abstractC4326r)), rVar, 48, 1);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new o(abstractC4326r, i10, i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Tc.f fVar, s sVar, pd.g gVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        pd.o oVar;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC4326r a5 = io.sentry.compose.b.a("AppNavHost");
        r rVar = (r) abstractC1725n;
        rVar.X(-882735401);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
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
            if (rVar.g(sVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.g(gVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
            if ((i12 & 5851) != 1170 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i17 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                String str = null;
                if (!(sVar instanceof pd.o)) {
                    oVar = (pd.o) sVar;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    str = oVar.f43066a;
                }
                K8.d.K(str, R4.b.X(rVar, 1764235227, new U(fVar, sVar, abstractC4326r4, gVar, 5)), rVar, 48);
                abstractC4326r3 = abstractC4326r4;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new I(fVar, sVar, gVar, abstractC4326r3, i10, i11, 9);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 5851) != 1170) {
        }
        if (i17 == 0) {
        }
        String str2 = null;
        if (!(sVar instanceof pd.o)) {
        }
        if (oVar != null) {
        }
        K8.d.K(str2, R4.b.X(rVar, 1764235227, new U(fVar, sVar, abstractC4326r4, gVar, 5)), rVar, 48);
        abstractC4326r3 = abstractC4326r4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final List d(s sVar, String... strArr) {
        if (sVar instanceof pd.p) {
            return v.f37483Y;
        }
        List<String> list = f28166a;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (String str : list) {
            ArrayList arrayList2 = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                arrayList2.add(AbstractC4828h.a0(new p(0, str, str2)));
            }
            arrayList.add(arrayList2);
        }
        return AbstractC6583a.I1(arrayList);
    }
}
