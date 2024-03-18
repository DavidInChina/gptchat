package sb;

import H0.E0;
import H0.Z;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import android.content.Context;
import androidx.lifecycle.e0;
import gd.AbstractC3256b;
import id.AbstractC3557B;
import java.util.List;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import r9.C5387d;
import r9.y;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final i0.r f45515a;

    static {
        C5601a c5601a = C5601a.f45493i0;
        k kVar = k.f45514Y;
        i0.r rVar = i0.s.f32436a;
        f45515a = new i0.r(c5601a, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i10, int i11, AbstractC1725n abstractC1725n, AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, wf.n nVar) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        boolean z10;
        Object K10;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("onFeedbackSubmitted", nVar);
        AbstractC3557B.c0("onDialogDismissed", abstractC6216a);
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageFeedbackDetailsDialog");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-689701670);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(nVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(abstractC6216a)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
            } else {
                if (i16 == 0) {
                    a5 = abstractC4326r2;
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C5603c.f45499h0, rVar, 6);
                j0.u uVar = (j0.u) Ad.l.Y0(new Object[0], f45515a, C5603c.f45500i0, rVar, 4);
                rVar.W(1486976764);
                if ((i12 & 112) != 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                K10 = rVar.K();
                if (!z10 || K10 == C1723m.f22654Y) {
                    K10 = new C5605e(abstractC6216a, 0);
                    rVar.h0(K10);
                }
                rVar.t(false);
                y.g((AbstractC6216a) K10, a5, R4.b.X(rVar, -63964945, new Q8.i(abstractC1710f0, uVar, nVar, 8)), rVar, ((i12 >> 3) & 112) | 384, 0);
                abstractC4326r2 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C5387d(nVar, abstractC6216a, abstractC4326r2, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C5603c.f45499h0, rVar, 6);
        j0.u uVar2 = (j0.u) Ad.l.Y0(new Object[0], f45515a, C5603c.f45500i0, rVar, 4);
        rVar.W(1486976764);
        if ((i12 & 112) != 32) {
        }
        K10 = rVar.K();
        if (!z10) {
        }
        K10 = new C5605e(abstractC6216a, 0);
        rVar.h0(K10);
        rVar.t(false);
        y.g((AbstractC6216a) K10, a5, R4.b.X(rVar, -63964945, new Q8.i(abstractC1710f02, uVar2, nVar, 8)), rVar, ((i12 >> 3) & 112) | 384, 0);
        abstractC4326r2 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Tc.f fVar, x xVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        Object obj;
        x xVar2;
        AbstractC4326r abstractC4326r;
        x xVar3;
        boolean z10;
        Object obj2;
        boolean z11;
        Object y02;
        int i13;
        int i14;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageFeedbackDialogHost");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-291398599);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                obj = xVar;
                if (rVar.g(obj)) {
                    i13 = 32;
                    i12 |= i13;
                }
            } else {
                obj = xVar;
            }
            i13 = 16;
            i12 |= i13;
        } else {
            obj = xVar;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
            xVar2 = obj;
        } else {
            rVar.R();
            int i15 = i10 & 1;
            Object obj3 = C1723m.f22654Y;
            if (i15 != 0 && !rVar.A()) {
                rVar.P();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    xVar3 = obj;
                    abstractC4326r = a5;
                    z10 = true;
                    rVar.u();
                    AbstractC1734s.e(xVar3, new j(xVar3, fVar, null), rVar);
                    obj2 = (w) AbstractC4828h.z(xVar3.f808e, rVar).getValue();
                    if (obj2 instanceof u) {
                    }
                    xVar2 = xVar3;
                }
            } else if ((i11 & 2) != 0) {
                rVar.W(-490350905);
                Context context = (Context) rVar.m(Z.f6888b);
                boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                List list = (List) rVar.m(AbstractC3256b.f31580a);
                List list2 = (List) rVar.m(Ad.k.f814a);
                e0 a10 = m2.b.a(rVar);
                if (a10 != null) {
                    Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                    D d10 = C.f37623a;
                    Object b10 = d10.b(x.class);
                    Object b11 = d10.b(w.class);
                    abstractC4326r = a5;
                    rVar.W(608026872);
                    boolean g10 = rVar.g(b10) | rVar.g(b11) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                    Object K10 = rVar.K();
                    if (g10 || K10 == obj3) {
                        z10 = true;
                        if (booleanValue) {
                            y02 = AbstractC4344b.z0(d10.b(w.class), d10.b(x.class), context, list2);
                        } else if (!booleanValue) {
                            y02 = AbstractC4344b.y0(d10.b(x.class), a10, vVar, list);
                        } else {
                            throw new RuntimeException();
                        }
                        K10 = y02;
                        rVar.h0(K10);
                    } else {
                        z10 = true;
                    }
                    rVar.t(false);
                    rVar.t(false);
                    obj = (x) ((Ad.g) K10);
                    i12 &= -113;
                    xVar3 = obj;
                    rVar.u();
                    AbstractC1734s.e(xVar3, new j(xVar3, fVar, null), rVar);
                    obj2 = (w) AbstractC4828h.z(xVar3.f808e, rVar).getValue();
                    if (obj2 instanceof u) {
                        rVar.W(1496953383);
                        int i16 = (i12 & 112) ^ 48;
                        if ((i16 > 32 && rVar.g(xVar3)) || (i12 & 48) == 32) {
                            z11 = z10;
                        } else {
                            z11 = false;
                        }
                        boolean g11 = z11 | rVar.g(obj2);
                        Object K11 = rVar.K();
                        if (g11 || K11 == obj3) {
                            K11 = new androidx.compose.foundation.layout.c(xVar3, 23, obj2);
                            rVar.h0(K11);
                        }
                        wf.n nVar = (wf.n) K11;
                        rVar.t(false);
                        rVar.W(1496953535);
                        if ((i16 <= 32 || !rVar.g(xVar3)) && (i12 & 48) != 32) {
                            z10 = false;
                        }
                        Object K12 = rVar.K();
                        if (z10 || K12 == obj3) {
                            K12 = new d9.h(16, xVar3);
                            rVar.h0(K12);
                        }
                        rVar.t(false);
                        a(0, 4, rVar, abstractC4326r, (AbstractC6216a) K12, nVar);
                    }
                    xVar2 = xVar3;
                } else {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                }
            }
            abstractC4326r = a5;
            z10 = true;
            xVar3 = obj;
            rVar.u();
            AbstractC1734s.e(xVar3, new j(xVar3, fVar, null), rVar);
            obj2 = (w) AbstractC4828h.z(xVar3.f808e, rVar).getValue();
            if (obj2 instanceof u) {
            }
            xVar2 = xVar3;
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new F.o(fVar, xVar2, i10, i11, 16);
        }
    }
}
