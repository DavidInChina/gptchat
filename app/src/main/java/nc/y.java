package nc;

import H0.E0;
import H0.Z;
import Rb.C1272s;
import W.AbstractC1522a0;
import W.C1568j1;
import W.m4;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import Z.o1;
import android.content.Context;
import androidx.lifecycle.e0;
import cb.C2334C;
import fa.C2969F;
import fa.EnumC2971H;
import gd.AbstractC3256b;
import hc.K;
import id.AbstractC3557B;
import java.util.List;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import m.AbstractActivityC4532l;
import nf.AbstractC4828h;
import wd.C6190g0;
import wd.O;
import wd.y0;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f40262a = 0;

    static {
        EnumC2971H enumC2971H = EnumC2971H.f30047Z;
        fa.t tVar = new fa.t("Hello, world!");
        C6190g0.Companion.getClass();
        new C2969F("messageId", null, tVar, "text-davinci-002-render-sha", enumC2971H, null, false, null, null, null, null, false, null, 8160);
        new C2969F("messageUserId", null, new fa.t("Hi there!"), "text-davinci-002-render-sha", EnumC2971H.f30046Y, null, false, null, null, null, null, false, null, 8160);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Tc.f fVar, AbstractC4326r abstractC4326r, AbstractC4808A abstractC4808A, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4808A abstractC4808A2;
        int i13;
        AbstractC4326r abstractC4326r3;
        AbstractC4808A abstractC4808A3;
        AbstractC4326r abstractC4326r4;
        Object K10;
        AbstractC1710f0 abstractC1710f0;
        String str;
        O o10;
        String str2;
        y0 y0Var;
        String str3;
        Object y02;
        int i14;
        int i15;
        int i16;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("ViewSharedConversationScreen");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(2100784903);
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
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
            if ((i10 & 896) != 0) {
                if ((i11 & 4) == 0) {
                    abstractC4808A2 = abstractC4808A;
                    if (rVar.g(abstractC4808A2)) {
                        i14 = 256;
                        i12 |= i14;
                    }
                } else {
                    abstractC4808A2 = abstractC4808A;
                }
                i14 = 128;
                i12 |= i14;
            } else {
                abstractC4808A2 = abstractC4808A;
            }
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
            } else {
                rVar.R();
                i13 = i10 & 1;
                Object obj = C1723m.f22654Y;
                if (i13 == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    abstractC4326r4 = abstractC4326r2;
                    abstractC4326r3 = a5;
                } else {
                    if (i17 != 0) {
                        abstractC4326r2 = a5;
                    }
                    if ((i11 & 4) == 0) {
                        rVar.W(-490350905);
                        Context context = (Context) rVar.m(Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar.m(Ad.k.f814a);
                        e0 a10 = m2.b.a(rVar);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            D d10 = C.f37623a;
                            Object b10 = d10.b(AbstractC4808A.class);
                            AbstractC4326r abstractC4326r5 = abstractC4326r2;
                            Object b11 = d10.b(z.class);
                            abstractC4326r3 = a5;
                            rVar.W(608026872);
                            boolean g10 = rVar.g(b10) | rVar.g(b11) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                            Object K11 = rVar.K();
                            if (g10 || K11 == obj) {
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(z.class), d10.b(AbstractC4808A.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(AbstractC4808A.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K11 = y02;
                                rVar.h0(K11);
                            }
                            rVar.t(false);
                            rVar.t(false);
                            AbstractC4808A abstractC4808A4 = (AbstractC4808A) ((Ad.g) K11);
                            i12 &= -897;
                            abstractC4326r4 = abstractC4326r5;
                            abstractC4808A3 = abstractC4808A4;
                            rVar.u();
                            Context context2 = (Context) rVar.m(Z.f6888b);
                            AbstractActivityC4532l abstractActivityC4532l = (AbstractActivityC4532l) rVar.m(p9.m.f42797a);
                            rVar.W(1687596031);
                            K10 = rVar.K();
                            if (K10 == obj) {
                                K10 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                                rVar.h0(K10);
                            }
                            abstractC1710f0 = (AbstractC1710f0) K10;
                            rVar.t(false);
                            rVar.W(286497075);
                            C1568j1 c1568j1 = new C1568j1(AbstractC1522a0.h(rVar), m4.f20229Y);
                            rVar.t(false);
                            int i18 = i12 & 14;
                            AbstractC4808A abstractC4808A5 = abstractC4808A3;
                            K8.d.f(fVar, abstractC4808A5, new Xb.h(fVar, context2, 5), androidx.compose.ui.input.nestedscroll.a.a(abstractC4326r4, c1568j1.a(), null), 0L, R4.b.X(rVar, -1014748795, new d9.i(fVar, abstractActivityC4532l, abstractC1710f0, 8)), false, d.f40226j, rVar, 12779528 | i18 | ((i12 >> 3) & 112), 80);
                            if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                                z zVar = (z) AbstractC4828h.z(abstractC4808A3.f808e, rVar).getValue();
                                C2334C c2334c = zVar.f40270h;
                                if (c2334c != null) {
                                    str = c2334c.f26438a;
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    o10 = new O(str);
                                } else {
                                    o10 = null;
                                }
                                if (c2334c == null || !c2334c.f26447j) {
                                    o10 = null;
                                }
                                if (o10 != null) {
                                    str2 = o10.f48362a;
                                } else {
                                    str2 = null;
                                }
                                String str4 = zVar.f40271i;
                                if (str4 != null) {
                                    y0Var = new y0(str4);
                                } else {
                                    y0Var = null;
                                }
                                if (!zVar.f40272j) {
                                    y0Var = null;
                                }
                                if (y0Var != null) {
                                    str3 = y0Var.f48473a;
                                } else {
                                    str3 = null;
                                }
                                C1272s c1272s = new C1272s(str2, (String) null, str3, 2);
                                rVar.W(1687601075);
                                Object K12 = rVar.K();
                                if (K12 == obj) {
                                    K12 = E9.f.x(abstractC1710f0, 29, rVar);
                                }
                                rVar.t(false);
                                Bi.c.s(fVar, c1272s, (AbstractC6216a) K12, abstractC4326r3, null, rVar, 392 | i18, 24);
                            }
                            abstractC4326r2 = abstractC4326r4;
                            abstractC4808A2 = abstractC4808A3;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        abstractC4326r3 = a5;
                        abstractC4326r4 = abstractC4326r2;
                    }
                }
                abstractC4808A3 = abstractC4808A2;
                rVar.u();
                Context context22 = (Context) rVar.m(Z.f6888b);
                AbstractActivityC4532l abstractActivityC4532l2 = (AbstractActivityC4532l) rVar.m(p9.m.f42797a);
                rVar.W(1687596031);
                K10 = rVar.K();
                if (K10 == obj) {
                }
                abstractC1710f0 = (AbstractC1710f0) K10;
                rVar.t(false);
                rVar.W(286497075);
                C1568j1 c1568j12 = new C1568j1(AbstractC1522a0.h(rVar), m4.f20229Y);
                rVar.t(false);
                int i182 = i12 & 14;
                AbstractC4808A abstractC4808A52 = abstractC4808A3;
                K8.d.f(fVar, abstractC4808A52, new Xb.h(fVar, context22, 5), androidx.compose.ui.input.nestedscroll.a.a(abstractC4326r4, c1568j12.a(), null), 0L, R4.b.X(rVar, -1014748795, new d9.i(fVar, abstractActivityC4532l2, abstractC1710f0, 8)), false, d.f40226j, rVar, 12779528 | i182 | ((i12 >> 3) & 112), 80);
                if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                }
                abstractC4326r2 = abstractC4326r4;
                abstractC4808A2 = abstractC4808A3;
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new K(fVar, abstractC4326r2, abstractC4808A2, i10, i11, 8);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 896) != 0) {
        }
        if ((i12 & 731) != 146) {
        }
        rVar.R();
        i13 = i10 & 1;
        Object obj2 = C1723m.f22654Y;
        if (i13 == 0) {
        }
        if (i17 != 0) {
        }
        if ((i11 & 4) == 0) {
        }
    }
}
