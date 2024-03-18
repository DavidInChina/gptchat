package x8;

import A.C0033n0;
import Df.AbstractC0405d;
import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0438w;
import E.AbstractC0440y;
import E.AbstractC0441z;
import E.C0421f;
import E.C0424h;
import E.C0426j;
import F.AbstractC0539m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import H0.E0;
import I9.C0766k0;
import L.C0837a0;
import L9.C0900f;
import Mb.Q0;
import Mb.X0;
import N0.C1046e;
import S8.AbstractC1370n;
import S8.C1368l;
import S8.C1378w;
import Uc.EnumC1427l;
import W.AbstractC1522a0;
import W.AbstractC1530b3;
import W.AbstractC1577l0;
import W.AbstractC1607r1;
import W.AbstractC1617t1;
import W.AbstractC1642y1;
import W.C1525a3;
import W.C1568j1;
import W.C1572k0;
import W.C1637x1;
import W.E1;
import W.I2;
import W.P0;
import W.R0;
import W.Z0;
import W.j4;
import W.m4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1737t0;
import Z.C1741v0;
import Z.L0;
import Z.m1;
import Z.o1;
import Z1.C1761f0;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import androidx.compose.material3.MinimumInteractiveModifier;
import ba.AbstractC2148f;
import ba.C2143a;
import ba.C2146d;
import ba.C2147e;
import ca.C2311c;
import ca.C2317i;
import ca.C2324p;
import ca.EnumC2323o;
import cb.C2334C;
import cc.AbstractC2389d;
import cc.C2388c;
import com.auth0.android.result.Credentials;
import com.openai.chatgpt.R;
import d1.C2580o;
import db.AbstractC2614b;
import db.C2615c;
import db.C2616d;
import db.C2619g;
import e2.C2789u;
import fa.C2969F;
import fa.EnumC2970G;
import fa.EnumC2971H;
import fb.C2989h;
import gd.AbstractC3256b;
import h0.C3288a;
import hc.AbstractC3392g;
import hc.AbstractC3404t;
import hc.C3393h;
import hc.C3403s;
import id.AbstractC3557B;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import l8.AbstractC4344b;
import lc.AbstractC4394S;
import lc.C4392P;
import lc.C4393Q;
import na.C4771m;
import na.C4772m0;
import na.C4774n;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5156c;
import q9.AbstractC5285b;
import r9.C5380C;
import r9.C5381D;
import r9.C5384a;
import r9.C5385b;
import r9.C5386c;
import sb.C5605e;
import ub.AbstractC5875D;
import ub.C5877a;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import ve.AbstractC6034c;
import w9.C6148e;
import wd.C6182c0;
import wd.C6189g;
import wd.C6205s;
import wf.AbstractC6216a;
import xe.C6406K;
import y.AbstractC6463a;
import y.C6468f;
import y.C6471i;
import yf.AbstractC6583a;
import z.C6675O;

/* loaded from: classes.dex */
public abstract class W {
    public static final void A(boolean z10, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2074893259);
        if ((i10 & 14) == 0) {
            if (rVar.h(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.i(nVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
            C4318j c4318j = C4310b.f37697j0;
            rVar.W(733328855);
            E0.N c10 = AbstractC0434s.c(c4318j, false, rVar);
            rVar.W(-1323940314);
            int i14 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i15 = androidx.compose.ui.layout.a.i(d10);
            boolean z11 = rVar.f22696a instanceof AbstractC1707e;
            if (z11) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                C0581j c0581j = C0583l.f5808f;
                U3.f.n0(rVar, c10, c0581j);
                C0581j c0581j2 = C0583l.f5807e;
                U3.f.n0(rVar, p10, c0581j2);
                C0581j c0581j3 = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i14))) {
                    AbstractC6463a.q(i14, rVar, i14, c0581j3);
                }
                AbstractC6463a.r(0, i15, new L0(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                C0424h c0424h = AbstractC0429m.f3911e;
                C4317i c4317i = C4310b.f37703p0;
                rVar.W(693286680);
                E0.N a5 = E.p0.a(c0424h, c4317i, rVar);
                rVar.W(-1323940314);
                int i16 = rVar.P;
                AbstractC1732q0 p11 = rVar.p();
                C3288a i17 = androidx.compose.ui.layout.a.i(c4323o);
                if (z11) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, a5, c0581j);
                    U3.f.n0(rVar, p11, c0581j2);
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i16))) {
                        AbstractC6463a.q(i16, rVar, i16, c0581j3);
                    }
                    AbstractC6463a.r(0, i17, new L0(rVar), rVar, 2058660585);
                    AbstractC6463a.s((i11 >> 3) & 14, nVar, rVar, false, true);
                    rVar.t(false);
                    rVar.t(false);
                    rVar.W(188047391);
                    if (z10) {
                        I2.b(bVar.a(androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b), C4310b.f37698k0), ((r0.r) rVar.m(Z0.f19875a)).f44265a, p9.u.f42856a, 0L, 0, rVar, 384, 24);
                    }
                    AbstractC6463a.v(rVar, false, false, true, false);
                    rVar.t(false);
                } else {
                    R4.b.r1();
                    throw null;
                }
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new L.P(z10, nVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Type inference failed for: r0v7, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(Vc.r rVar, AbstractC4825e abstractC4825e) {
        Db.n nVar;
        int i10;
        me.T t10;
        Serializable serializable;
        Fb.s sVar;
        if (abstractC4825e instanceof Db.n) {
            Db.n nVar2 = (Db.n) abstractC4825e;
            int i11 = nVar2.f3485i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar2.f3485i0 = i11 - Integer.MIN_VALUE;
                nVar = nVar2;
                Object obj = nVar.f3484h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = nVar.f3485i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        me.T t11 = nVar.f3483Z;
                        Vc.r rVar2 = nVar.f3482Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        t10 = t11;
                        rVar = rVar2;
                        serializable = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Throwable th2 = rVar.f18561a;
                    if (th2 instanceof me.T) {
                        t10 = (me.T) th2;
                    } else {
                        t10 = null;
                    }
                    if (t10 != null) {
                        Fb.o oVar = Fb.s.Companion;
                        nVar.f3482Y = rVar;
                        nVar.f3483Z = t10;
                        nVar.f3485i0 = 1;
                        serializable = oVar.a(t10, nVar);
                        if (serializable == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return rVar;
                }
                sVar = (Fb.s) serializable;
                if (sVar != null) {
                    int i12 = t10.f39189Y.f().f49834Y;
                    AbstractC6034c abstractC6034c = t10.f39189Y;
                    AbstractC3557B.c0("<this>", abstractC6034c);
                    return new Vc.v(i12, abstractC6034c.a().e("cf-ray"), sVar.f5173Z, sVar);
                }
                return rVar;
            }
        }
        nVar = new AbstractC5156c(abstractC4825e);
        Object obj2 = nVar.f3484h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = nVar.f3485i0;
        if (i10 == 0) {
        }
        sVar = (Fb.s) serializable;
        if (sVar != null) {
        }
        return rVar;
    }

    public static final Intent D(Context context, String str, List list) {
        AbstractC3557B.c0("context", context);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                launchIntentForPackage.addFlags(((Number) it.next()).intValue());
            }
            launchIntentForPackage.setData(Uri.parse("https://chatgpt.com/".concat(str)));
            return launchIntentForPackage;
        }
        return null;
    }

    public static /* synthetic */ void F(Pc.c cVar, String str, Throwable th2, int i10) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        cVar.d(str, th2, kf.w.f37484Y);
    }

    public static /* synthetic */ void G(Pc.c cVar, String str, Throwable th2, int i10) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        cVar.b(str, th2, kf.w.f37484Y);
    }

    public static final EnumC2323o H(List list) {
        AbstractC3557B.c0("<this>", list);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2969F c2969f = (C2969F) it.next();
                AbstractC3557B.c0("<this>", c2969f);
                if (c2969f.f30015h instanceof fa.y) {
                    return EnumC2323o.f26409i0;
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (O((C2969F) it2.next())) {
                    return EnumC2323o.f26407Z;
                }
            }
        }
        return EnumC2323o.f26406Y;
    }

    public static final EnumC2323o J(C2969F c2969f) {
        AbstractC3557B.c0("<this>", c2969f);
        if (c2969f.f30015h instanceof fa.y) {
            return EnumC2323o.f26409i0;
        }
        if (N(c2969f)) {
            return EnumC2323o.f26408h0;
        }
        if (O(c2969f)) {
            return EnumC2323o.f26407Z;
        }
        return EnumC2323o.f26406Y;
    }

    public static SimpleDateFormat K(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        str = "M/d/yy";
                    } else {
                        throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown DateFormat style: ", i10));
                    }
                } else {
                    str = "MMM d, yyyy";
                }
            } else {
                str = "MMMM d, yyyy";
            }
        } else {
            str = "EEEE, MMMM d, yyyy";
        }
        sb2.append(str);
        sb2.append(Separators.SP);
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    str2 = "h:mm a";
                } else {
                    throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown DateFormat style: ", i11));
                }
            } else {
                str2 = "h:mm:ss a";
            }
        } else {
            str2 = "h:mm:ss a z";
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String L(Credentials credentials) {
        Object obj;
        AbstractC3557B.c0("<this>", credentials);
        try {
            com.auth0.android.jwt.a aVar = (com.auth0.android.jwt.a) new com.auth0.android.jwt.d(credentials.a()).f26712h0.f26714a.get("https://api.openai.com/auth");
            Map map = (Map) (aVar != null ? aVar : new Object()).a();
            if (map != null) {
                obj = map.get("user_id");
            } else {
                obj = null;
            }
            if (!(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        } catch (com.auth0.android.jwt.c e10) {
            F(Pc.e.a(), "Failed to decode auth claim for token: " + e10, null, 6);
            return null;
        }
    }

    public static /* synthetic */ void M(Pc.c cVar, String str, LinkedHashMap linkedHashMap, int i10) {
        kf.w wVar = linkedHashMap;
        if ((i10 & 4) != 0) {
            wVar = kf.w.f37484Y;
        }
        cVar.c(str, null, wVar);
    }

    public static final boolean N(C2969F c2969f) {
        AbstractC3557B.c0("<this>", c2969f);
        if (c2969f.f30022o != EnumC2970G.f30034Y) {
            if (c2969f.f30011d == EnumC2971H.f30047Z && c2969f.f30020m) {
                return true;
            }
        }
        return false;
    }

    public static final boolean O(C2969F c2969f) {
        AbstractC3557B.c0("<this>", c2969f);
        if (c2969f.f30022o == EnumC2970G.f30034Y) {
            if (c2969f.f30011d == EnumC2971H.f30047Z) {
                return true;
            }
        }
        return false;
    }

    public static final ArrayList Q(C2311c c2311c) {
        boolean z10;
        boolean z11;
        P9.f fVar;
        AbstractC3557B.c0("<this>", c2311c);
        ArrayList d10 = c2311c.f26387n.d(c2311c.b().f14554a);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(d10, 10));
        Iterator it = d10.iterator();
        while (it.hasNext()) {
            Qa.h hVar = (Qa.h) it.next();
            C2969F c2969f = (C2969F) hVar.f14557d;
            C6182c0 c6182c0 = new C6182c0(c2969f.f30008a);
            Map map = c2311c.f26380g;
            P9.f fVar2 = (P9.f) map.get(c6182c0);
            if (fVar2 != null) {
                z10 = fVar2.f13885c;
            } else {
                z10 = false;
            }
            C2969F c2969f2 = (C2969F) hVar.f14557d;
            if (!c2969f2.f30019l && ((fVar = (P9.f) map.get(new C6182c0(c2969f2.f30008a))) == null || !fVar.f13884b)) {
                z11 = false;
            } else {
                z11 = true;
            }
            arrayList.add(C2969F.a(c2969f, null, null, false, z10, z11, null, false, 268432383));
        }
        return arrayList;
    }

    public static ArrayList R(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:2|(2:4|(8:6|8|35|(1:(1:(1:(3:13|32|37)(2:14|15))(4:16|17|28|38))(2:19|20))(3:21|22|(1:24))|25|(1:27)|28|38))|7|8|35|(0)(0)|25|(0)|28|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        r12 = r12.a();
        r0.f18549Y = null;
        r0.f18550Z = null;
        r0.f18552i0 = 3;
        r12.getClass();
        r15 = r12.a(r13, new kotlin.jvm.internal.j(1, r12.f22251a, b9.AbstractC2133b.class, "onUnauthorizedLogout", "onUnauthorizedLogout(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new Yc.j(r12, null), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (r15 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
        return Vc.q.f18560a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r14v0, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.jvm.internal.j, Yc.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object S(Vc.l lVar, Je.a aVar, wf.n nVar, AbstractC4825e abstractC4825e) {
        Vc.k kVar;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        if (abstractC4825e instanceof Vc.k) {
            Vc.k kVar2 = (Vc.k) abstractC4825e;
            int i11 = kVar2.f18552i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar2.f18552i0 = i11 - Integer.MIN_VALUE;
                kVar = kVar2;
                obj = kVar.f18551h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f18552i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return (Vc.x) obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lVar = kVar.f18549Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return new Vc.w(obj);
                    }
                    aVar = kVar.f18550Z;
                    lVar = kVar.f18549Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ge.d b10 = lVar.b();
                    kVar.f18549Y = lVar;
                    kVar.f18550Z = aVar;
                    kVar.f18552i0 = 1;
                    obj = nVar.invoke(b10, kVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                kVar.f18549Y = lVar;
                kVar.f18550Z = null;
                kVar.f18552i0 = 2;
                obj = ((AbstractC6034c) obj).b().a(aVar, kVar);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                return new Vc.w(obj);
            }
        }
        kVar = new AbstractC5156c(abstractC4825e);
        obj = kVar.f18551h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = kVar.f18552i0;
        if (i10 == 0) {
        }
        kVar.f18549Y = lVar;
        kVar.f18550Z = null;
        kVar.f18552i0 = 2;
        obj = ((AbstractC6034c) obj).b().a(aVar, kVar);
        if (obj == enumC5000a) {
        }
        return new Vc.w(obj);
    }

    public static final C2311c T(Ga.o oVar) {
        AbstractC3557B.c0("<this>", oVar);
        Map map = oVar.f6231g;
        if (map == null) {
            return null;
        }
        Qa.e U12 = A7.b.U1(map, oVar.f6225a, null);
        String obj = Lg.n.U2(oVar.f6226b).toString();
        String str = oVar.f6228d;
        String str2 = oVar.f6225a;
        return new C2311c(str2, str2, oVar.f6229e, oVar.f6230f, oVar.f6227c, obj, null, str, false, U12, 7872);
    }

    public static final C2311c U(C0900f c0900f, String str, String str2) {
        String str3;
        AbstractC3557B.c0("$this$toDomainConversation", c0900f);
        AbstractC3557B.c0(ParameterNames.ID, str);
        Qa.e U12 = A7.b.U1(c0900f.f10928e, str, null);
        String str4 = c0900f.f10924a;
        if (str4 != null) {
            str3 = Lg.n.U2(str4).toString();
        } else {
            str3 = null;
        }
        List list = c0900f.f10929f;
        int n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (Object obj : list) {
            linkedHashMap.put(new C6182c0(((P9.f) obj).f13883a), obj);
        }
        return new C2311c(str, str2, c0900f.f10926c, c0900f.f10927d, c0900f.f10925b, str3, linkedHashMap, c0900f.f10931h, false, U12, 7808);
    }

    public static /* synthetic */ void W(Pc.c cVar, String str, Throwable th2, Map map, int i10) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            map = kf.w.f37484Y;
        }
        cVar.a(str, th2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wf.n nVar, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, wf.n nVar2, wf.n nVar3, wf.n nVar4, wf.n nVar5, C1637x1 c1637x1, float f6, float f10, AbstractC1725n abstractC1725n, int i10, int i11, int i12) {
        int i13;
        AbstractC4326r abstractC4326r2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        wf.n nVar6;
        int i17;
        wf.n nVar7;
        AbstractC4326r abstractC4326r3;
        int i18;
        int i19;
        int i20;
        Z.r rVar;
        float f11;
        float f12;
        C1637x1 c1637x12;
        wf.n nVar8;
        wf.n nVar9;
        wf.n nVar10;
        wf.n nVar11;
        boolean z12;
        AbstractC4326r abstractC4326r4;
        C1741v0 v10;
        wf.n nVar12;
        float f13;
        float f14;
        C1637x1 c1637x13;
        wf.n nVar13;
        wf.n nVar14;
        AbstractC4326r abstractC4326r5;
        boolean z13;
        wf.n nVar15;
        int i21;
        boolean z14;
        C3288a c3288a;
        boolean z15;
        boolean z16;
        wf.n nVar16;
        wf.n nVar17;
        C1637x1 c1637x14;
        float f15;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        AbstractC3557B.c0("headlineContent", nVar);
        AbstractC3557B.c0("onClick", abstractC6216a);
        AbstractC4326r abstractC4326r6 = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("ActionListItem");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(2053955748);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.i(nVar)) {
                i32 = 4;
            } else {
                i32 = 2;
            }
            i13 = i32 | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.i(abstractC6216a)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i13 |= i31;
        }
        int i33 = i12 & 4;
        if (i33 != 0) {
            i13 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i30 = 256;
            } else {
                i30 = 128;
            }
            i13 |= i30;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i10 & 7168) == 0) {
                z11 = z10;
                if (rVar2.h(z11)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i13 |= i29;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (rVar2.i(nVar2)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i13 |= i28;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= 196608;
                    nVar6 = nVar3;
                } else {
                    nVar6 = nVar3;
                    if ((i10 & 458752) == 0) {
                        if (rVar2.i(nVar6)) {
                            i27 = 131072;
                        } else {
                            i27 = 65536;
                        }
                        i13 |= i27;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                    nVar7 = nVar4;
                } else {
                    nVar7 = nVar4;
                    if ((i10 & 3670016) == 0) {
                        if (rVar2.i(nVar7)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                }
                abstractC4326r3 = a5;
                i18 = i12 & 128;
                if (i18 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (rVar2.i(nVar5)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i12 & 256) == 0 && rVar2.g(c1637x1)) {
                        i24 = 67108864;
                        i13 |= i24;
                    }
                    i24 = 33554432;
                    i13 |= i24;
                }
                if ((i10 & 1879048192) == 0) {
                    if ((i12 & 512) == 0 && rVar2.d(f6)) {
                        i23 = 536870912;
                        i13 |= i23;
                    }
                    i23 = 268435456;
                    i13 |= i23;
                }
                i19 = i13;
                if ((i11 & 14) == 0) {
                    if ((i12 & 1024) == 0 && rVar2.d(f10)) {
                        i22 = 4;
                        i20 = i11 | i22;
                    }
                    i22 = 2;
                    i20 = i11 | i22;
                } else {
                    i20 = i11;
                }
                if ((i19 & 1533916891) != 306783378 && (i20 & 11) == 2 && rVar2.B()) {
                    rVar2.P();
                    nVar11 = nVar2;
                    c1637x12 = c1637x1;
                    nVar9 = nVar7;
                    abstractC4326r4 = abstractC4326r2;
                    z12 = z11;
                    nVar10 = nVar6;
                    rVar = rVar2;
                    nVar8 = nVar5;
                    f12 = f6;
                    f11 = f10;
                } else {
                    rVar2.R();
                    if ((i10 & 1) == 0 && !rVar2.A()) {
                        rVar2.P();
                        if ((i12 & 256) != 0) {
                            i19 &= -234881025;
                        }
                        if ((i12 & 512) != 0) {
                            i19 &= -1879048193;
                        }
                        if ((i12 & 1024) != 0) {
                            i20 &= -15;
                        }
                        nVar12 = nVar2;
                        nVar13 = nVar5;
                        c1637x13 = c1637x1;
                        f14 = f6;
                        z13 = z11;
                        nVar14 = nVar6;
                        i21 = i19;
                        f13 = f10;
                        nVar15 = nVar7;
                        abstractC4326r5 = abstractC4326r2;
                    } else {
                        if (i33 == 0) {
                            abstractC4326r3 = abstractC4326r2;
                        }
                        if (i14 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i15 != 0) {
                            nVar12 = null;
                        } else {
                            nVar12 = nVar2;
                        }
                        if (i16 != 0) {
                            nVar6 = null;
                        }
                        if (i17 != 0) {
                            nVar16 = null;
                        } else {
                            nVar16 = nVar7;
                        }
                        if (i18 != 0) {
                            nVar17 = null;
                        } else {
                            nVar17 = nVar5;
                        }
                        if ((i12 & 256) != 0) {
                            c1637x14 = AbstractC1642y1.a(0L, 0L, 0L, rVar2, 511);
                            i19 &= -234881025;
                        } else {
                            c1637x14 = c1637x1;
                        }
                        if ((i12 & 512) != 0) {
                            f15 = AbstractC1642y1.f20630a;
                            i19 &= -1879048193;
                        } else {
                            f15 = f6;
                        }
                        if ((i12 & 1024) != 0) {
                            i20 &= -15;
                            nVar13 = nVar17;
                            c1637x13 = c1637x14;
                            nVar15 = nVar16;
                            i21 = i19;
                            z13 = z16;
                            f13 = AbstractC1642y1.f20630a;
                        } else {
                            nVar13 = nVar17;
                            c1637x13 = c1637x14;
                            nVar15 = nVar16;
                            i21 = i19;
                            z13 = z16;
                            f13 = f10;
                        }
                        nVar14 = nVar6;
                        abstractC4326r5 = abstractC4326r3;
                        f14 = f15;
                    }
                    rVar2.u();
                    rVar2.W(-1555828743);
                    if (!z13) {
                        rVar2.W(-1555828687);
                        if ((i21 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        Object K10 = rVar2.K();
                        if (z15 || K10 == C1723m.f22654Y) {
                            K10 = new C0033n0(abstractC6216a, 12);
                            rVar2.h0(K10);
                        }
                        z14 = false;
                        rVar2.t(false);
                        abstractC4326r6 = androidx.compose.foundation.a.h(abstractC4326r6, (AbstractC6216a) K10);
                    } else {
                        z14 = false;
                    }
                    rVar2.t(z14);
                    AbstractC4326r g10 = abstractC4326r5.g(abstractC4326r6);
                    if (nVar15 != null) {
                        int i34 = z14 ? 1 : 0;
                        int i35 = z14 ? 1 : 0;
                        c3288a = R4.b.X(rVar2, -1998947961, new C5384a(z13, nVar15, i34));
                    } else {
                        c3288a = null;
                    }
                    int i36 = i21 & 14;
                    int i37 = i21 >> 6;
                    wf.n nVar18 = nVar15;
                    boolean z17 = z13;
                    AbstractC4326r abstractC4326r7 = abstractC4326r5;
                    rVar = rVar2;
                    E1.a(nVar, g10, nVar12, nVar14, c3288a, nVar13, c1637x13, f14, f13, rVar2, i36 | (i37 & 896) | (i37 & 7168) | (i37 & 458752) | (i37 & 3670016) | (i37 & 29360128) | ((i20 << 24) & 234881024), 0);
                    nVar10 = nVar14;
                    nVar8 = nVar13;
                    nVar9 = nVar18;
                    c1637x12 = c1637x13;
                    f12 = f14;
                    abstractC4326r4 = abstractC4326r7;
                    f11 = f13;
                    z12 = z17;
                    nVar11 = nVar12;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C5385b(nVar, abstractC6216a, abstractC4326r4, z12, nVar11, nVar10, nVar9, nVar8, c1637x12, f12, f11, i10, i11, i12);
                    return;
                }
                return;
            }
            z11 = z10;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            i16 = i12 & 32;
            if (i16 != 0) {
            }
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            abstractC4326r3 = a5;
            i18 = i12 & 128;
            if (i18 != 0) {
            }
            if ((i10 & 234881024) == 0) {
            }
            if ((i10 & 1879048192) == 0) {
            }
            i19 = i13;
            if ((i11 & 14) == 0) {
            }
            if ((i19 & 1533916891) != 306783378) {
            }
            rVar2.R();
            if ((i10 & 1) == 0) {
            }
            if (i33 == 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if ((i12 & 256) != 0) {
            }
            if ((i12 & 512) != 0) {
            }
            if ((i12 & 1024) != 0) {
            }
            nVar14 = nVar6;
            abstractC4326r5 = abstractC4326r3;
            f14 = f15;
            rVar2.u();
            rVar2.W(-1555828743);
            if (!z13) {
            }
            rVar2.t(z14);
            AbstractC4326r g102 = abstractC4326r5.g(abstractC4326r6);
            if (nVar15 != null) {
            }
            int i362 = i21 & 14;
            int i372 = i21 >> 6;
            wf.n nVar182 = nVar15;
            boolean z172 = z13;
            AbstractC4326r abstractC4326r72 = abstractC4326r5;
            rVar = rVar2;
            E1.a(nVar, g102, nVar12, nVar14, c3288a, nVar13, c1637x13, f14, f13, rVar2, i362 | (i372 & 896) | (i372 & 7168) | (i372 & 458752) | (i372 & 3670016) | (i372 & 29360128) | ((i20 << 24) & 234881024), 0);
            nVar10 = nVar14;
            nVar8 = nVar13;
            nVar9 = nVar182;
            c1637x12 = c1637x13;
            f12 = f14;
            abstractC4326r4 = abstractC4326r72;
            f11 = f13;
            z12 = z172;
            nVar11 = nVar12;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        z11 = z10;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        i16 = i12 & 32;
        if (i16 != 0) {
        }
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        abstractC4326r3 = a5;
        i18 = i12 & 128;
        if (i18 != 0) {
        }
        if ((i10 & 234881024) == 0) {
        }
        if ((i10 & 1879048192) == 0) {
        }
        i19 = i13;
        if ((i11 & 14) == 0) {
        }
        if ((i19 & 1533916891) != 306783378) {
        }
        rVar2.R();
        if ((i10 & 1) == 0) {
        }
        if (i33 == 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if ((i12 & 256) != 0) {
        }
        if ((i12 & 512) != 0) {
        }
        if ((i12 & 1024) != 0) {
        }
        nVar14 = nVar6;
        abstractC4326r5 = abstractC4326r3;
        f14 = f15;
        rVar2.u();
        rVar2.W(-1555828743);
        if (!z13) {
        }
        rVar2.t(z14);
        AbstractC4326r g1022 = abstractC4326r5.g(abstractC4326r6);
        if (nVar15 != null) {
        }
        int i3622 = i21 & 14;
        int i3722 = i21 >> 6;
        wf.n nVar1822 = nVar15;
        boolean z1722 = z13;
        AbstractC4326r abstractC4326r722 = abstractC4326r5;
        rVar = rVar2;
        E1.a(nVar, g1022, nVar12, nVar14, c3288a, nVar13, c1637x13, f14, f13, rVar2, i3622 | (i3722 & 896) | (i3722 & 7168) | (i3722 & 458752) | (i3722 & 3670016) | (i3722 & 29360128) | ((i20 << 24) & 234881024), 0);
        nVar10 = nVar14;
        nVar8 = nVar13;
        nVar9 = nVar1822;
        c1637x12 = c1637x13;
        f12 = f14;
        abstractC4326r4 = abstractC4326r722;
        f11 = f13;
        z12 = z1722;
        nVar11 = nVar12;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C2317i c2317i, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        C1741v0 v10;
        EnumC2323o enumC2323o;
        EnumC2323o enumC2323o2;
        C5877a c5877a;
        int i13;
        int i14;
        AbstractC3557B.c0(ParameterNames.SESSION, c2317i);
        AbstractC4326r a5 = io.sentry.compose.b.a("BrowsingTool");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(98655945);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(c2317i)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 91) != 18 && rVar2.B()) {
                rVar2.P();
                a5 = abstractC4326r2;
                rVar = rVar2;
            } else {
                if (i15 == 0) {
                    a5 = abstractC4326r2;
                }
                rVar2.W(1880397346);
                enumC2323o = EnumC2323o.f26407Z;
                enumC2323o2 = c2317i.f26392a;
                if (enumC2323o2 != enumC2323o) {
                    c5877a = new C5877a(R.string.browsing_finished, new Object());
                } else if (enumC2323o2 == EnumC2323o.f26408h0) {
                    c5877a = new C5877a(R.string.browsing_stopped, new Object());
                } else {
                    C2324p c2324p = (C2324p) c2317i.f26395d;
                    if (c2324p.f26411g.isEmpty()) {
                        c5877a = new C5877a(R.string.browsing_active, new Object());
                    } else {
                        AbstractC2148f abstractC2148f = (AbstractC2148f) kf.t.o2(c2324p.f26411g);
                        if (abstractC2148f instanceof C2143a) {
                            String str = ((C2143a) abstractC2148f).f25673b;
                            if (str != null) {
                                String str2 = "";
                                try {
                                    String str3 = com.google.android.gms.internal.play_billing.N.b(str).f49859b;
                                    if (str3 != null) {
                                        str2 = str3;
                                    }
                                } catch (C6406K e10) {
                                    W(Pc.e.a(), "URL failed to parse: ".concat(str), e10, null, 4);
                                }
                                c5877a = new C5877a(R.string.browsing_active_reading_url, str2);
                            } else {
                                c5877a = new C5877a(R.string.browsing_active_reading_no_url, new Object());
                            }
                        } else if (abstractC2148f instanceof C2146d) {
                            c5877a = new C5877a(R.string.browsing_active_reading_no_url, new Object());
                        } else if (abstractC2148f instanceof C2147e) {
                            c5877a = new C5877a(R.string.browsing_active_search, ((C2147e) abstractC2148f).f25677b);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
                String w10 = Ng.H.w(c5877a.f46533a, new Object[]{c5877a.f46534b}, rVar2);
                rVar2.t(false);
                L0.u uVar = io.sentry.compose.b.f34309a;
                rVar2.W(421262922);
                z4.q o02 = Df.H.o0(new z4.r(R.raw.browse_icon_lottie), rVar2);
                rVar2.t(false);
                rVar = rVar2;
                AbstractC5875D.a(w10, o02, c2317i.f26392a, a5, false, false, false, false, 0, rVar2, (i12 << 6) & 7168, 496);
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new F.o(c2317i, a5, i10, i11, 17);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 91) != 18) {
        }
        if (i15 == 0) {
        }
        rVar2.W(1880397346);
        enumC2323o = EnumC2323o.f26407Z;
        enumC2323o2 = c2317i.f26392a;
        if (enumC2323o2 != enumC2323o) {
        }
        String w102 = Ng.H.w(c5877a.f46533a, new Object[]{c5877a.f46534b}, rVar2);
        rVar2.t(false);
        L0.u uVar2 = io.sentry.compose.b.f34309a;
        rVar2.W(421262922);
        z4.q o022 = Df.H.o0(new z4.r(R.raw.browse_icon_lottie), rVar2);
        rVar2.t(false);
        rVar = rVar2;
        AbstractC5875D.a(w102, o022, c2317i.f26392a, a5, false, false, false, false, 0, rVar2, (i12 << 6) & 7168, 496);
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, AbstractC6216a abstractC6216a, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        C1741v0 v10;
        AbstractC4326r abstractC4326r3;
        Object K10;
        int i15;
        int i16;
        int i17;
        AbstractC3557B.c0("currentName", str);
        AbstractC3557B.c0("onDismiss", abstractC6216a);
        AbstractC3557B.c0("onConfirm", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("ConversationRenameDialog");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1493652057);
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
            if (rVar.i(abstractC6216a)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.i(kVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        int i18 = i11 & 8;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 5851) != 1170 && rVar.B()) {
                rVar.P();
            } else {
                if (i18 == 0) {
                    abstractC4326r3 = a5;
                } else {
                    abstractC4326r3 = abstractC4326r2;
                }
                rVar.W(-1768494179);
                K10 = rVar.K();
                if (K10 == C1723m.f22654Y) {
                    K10 = AbstractC4828h.Z(new T0.z(str, U3.f.e(0, str.length()), 4), o1.f22665a);
                    rVar.h0(K10);
                }
                rVar.t(false);
                r9.y.e(abstractC6216a, new C2580o(false, 23), R4.b.X(rVar, -1234159632, new W.I(abstractC4326r3, (AbstractC1710f0) K10, abstractC6216a, str, kVar)), rVar, ((i14 >> 3) & 14) | 432, 0);
                abstractC4326r2 = abstractC4326r3;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new G.I(str, abstractC6216a, kVar, abstractC4326r2, i10, i11, 16);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        i14 = i12;
        if ((i14 & 5851) != 1170) {
        }
        if (i18 == 0) {
        }
        rVar.W(-1768494179);
        K10 = rVar.K();
        if (K10 == C1723m.f22654Y) {
        }
        rVar.t(false);
        r9.y.e(abstractC6216a, new C2580o(false, 23), R4.b.X(rVar, -1234159632, new W.I(abstractC4326r3, (AbstractC1710f0) K10, abstractC6216a, str, kVar)), rVar, ((i14 >> 3) & 14) | 432, 0);
        abstractC4326r2 = abstractC4326r3;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(EnumC1427l enumC1427l, String str, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        Z.r rVar;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("instruction", enumC1427l);
        AbstractC3557B.c0("value", str);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("CustomInstructionsEditFooter");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-1390526606);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(enumC1427l)) {
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
            if (rVar2.g(str)) {
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
            if (rVar2.g(abstractC4326r2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 731) != 146 && rVar2.B()) {
                rVar2.P();
                rVar = rVar2;
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i16 == 0) {
                    abstractC4326r3 = a5;
                } else {
                    abstractC4326r3 = abstractC4326r2;
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C3393h.f32204h0, rVar2, 6);
                C0424h c0424h = AbstractC0429m.f3912f;
                C4317i c4317i = C4310b.f37703p0;
                rVar2.W(693286680);
                E0.N a10 = E.p0.a(c0424h, c4317i, rVar2);
                rVar2.W(-1323940314);
                int i17 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(abstractC4326r3);
                if (!(rVar2.f22696a instanceof AbstractC1707e)) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i17))) {
                        AbstractC6463a.q(i17, rVar2, i17, c0581j);
                    }
                    AbstractC6463a.r(0, i18, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("CustomInstructionsEditFooter");
                    int length = str.length();
                    j4.b(length + " / 1500", androidx.compose.foundation.layout.a.r(c4323o, p9.r.f42840d), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131068);
                    rVar2.W(-33488329);
                    boolean g10 = rVar2.g(abstractC1710f0);
                    Object K10 = rVar2.K();
                    Object obj = C1723m.f22654Y;
                    if (g10 || K10 == obj) {
                        K10 = E9.f.x(abstractC1710f0, 13, rVar2);
                    }
                    rVar2.t(false);
                    Ng.H.f((AbstractC6216a) K10, a11, false, null, null, null, null, null, null, AbstractC3392g.f32200f, rVar2, 805306368, 510);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                        rVar2.W(417638984);
                        boolean g11 = rVar2.g(abstractC1710f0);
                        Object K11 = rVar2.K();
                        if (g11 || K11 == obj) {
                            K11 = E9.f.x(abstractC1710f0, 14, rVar2);
                        }
                        rVar2.t(false);
                        rVar = rVar2;
                        W.H.a((AbstractC6216a) K11, R4.b.X(rVar2, 710820735, new C6148e(abstractC1710f0, 2)), a5, null, null, AbstractC3392g.f32202h, R4.b.X(rVar2, -1337562364, new Jb.c(3, enumC1427l)), null, 0L, 0L, 0L, 0L, 0.0f, null, rVar, 1769520, 0, 16284);
                    } else {
                        rVar = rVar2;
                    }
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new bb.j0(enumC1427l, str, abstractC4326r3, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C3393h.f32204h0, rVar2, 6);
        C0424h c0424h2 = AbstractC0429m.f3912f;
        C4317i c4317i2 = C4310b.f37703p0;
        rVar2.W(693286680);
        E0.N a102 = E.p0.a(c0424h2, c4317i2, rVar2);
        rVar2.W(-1323940314);
        int i172 = rVar2.P;
        AbstractC1732q0 p102 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i182 = androidx.compose.ui.layout.a.i(abstractC4326r3);
        if (!(rVar2.f22696a instanceof AbstractC1707e)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(Tc.f fVar, AbstractC4326r abstractC4326r, AbstractC3404t abstractC3404t, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC3404t abstractC3404t2;
        Z.r rVar;
        AbstractC3404t abstractC3404t3;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i13;
        AbstractC4326r abstractC4326r4;
        AbstractC3404t abstractC3404t4;
        int i14;
        int i15;
        C3403s c3403s;
        boolean z10;
        Object K10;
        AbstractC0408g abstractC0408g;
        boolean g10;
        Object K11;
        AbstractC3404t abstractC3404t5;
        Ad.g y02;
        int i16;
        int i17;
        int i18;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("CustomInstructionsEditScreen");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-1899691718);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(fVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
            if ((i10 & 896) != 0) {
                if ((i11 & 4) == 0) {
                    abstractC3404t2 = abstractC3404t;
                    if (rVar2.g(abstractC3404t2)) {
                        i16 = 256;
                        i12 |= i16;
                    }
                } else {
                    abstractC3404t2 = abstractC3404t;
                }
                i16 = 128;
                i12 |= i16;
            } else {
                abstractC3404t2 = abstractC3404t;
            }
            if ((i12 & 731) != 146 && rVar2.B()) {
                rVar2.P();
                abstractC4326r3 = abstractC4326r2;
                abstractC3404t3 = abstractC3404t2;
                rVar = rVar2;
            } else {
                rVar2.R();
                i13 = i10 & 1;
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (i13 == 0 && !rVar2.A()) {
                    rVar2.P();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    i14 = i12;
                    abstractC4326r4 = abstractC4326r2;
                    abstractC3404t4 = abstractC3404t2;
                } else {
                    if (i19 == 0) {
                        a5 = abstractC4326r2;
                    }
                    if ((i11 & 4) == 0) {
                        rVar2.W(-490350905);
                        Context context = (Context) rVar2.m(H0.Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar2.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar2.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar2.m(Ad.k.f814a);
                        androidx.lifecycle.e0 a10 = m2.b.a(rVar2);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b10 = d10.b(AbstractC3404t.class);
                            AbstractC4326r abstractC4326r5 = a5;
                            AbstractC0405d b11 = d10.b(C3403s.class);
                            rVar2.W(608026872);
                            boolean g11 = rVar2.g(b11) | rVar2.g(b10) | rVar2.g(list) | rVar2.g(vVar) | rVar2.h(booleanValue);
                            Object K12 = rVar2.K();
                            if (g11 || K12 == iVar) {
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(C3403s.class), d10.b(AbstractC3404t.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(AbstractC3404t.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K12 = y02;
                                rVar2.h0(K12);
                            }
                            rVar2.t(false);
                            rVar2.t(false);
                            abstractC4326r4 = abstractC4326r5;
                            abstractC3404t4 = (AbstractC3404t) ((Ad.g) K12);
                            i14 = i12 & (-897);
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        abstractC4326r4 = a5;
                        i14 = i12;
                        abstractC3404t4 = abstractC3404t2;
                    }
                }
                rVar2.u();
                i15 = i14;
                K8.d.f(fVar, abstractC3404t4, new G9.j(fVar, 8), abstractC4326r4, 0L, AbstractC3392g.f32198d, false, AbstractC3392g.f32199e, rVar2, 12779528 | (i14 & 14) | ((i14 >> 3) & 112) | ((i14 << 6) & 7168), 80);
                c3403s = (C3403s) AbstractC4828h.z(abstractC3404t4.f808e, rVar2).getValue();
                rVar2.W(-1270943299);
                if ((((i15 & 896) ^ 384) <= 256 && rVar2.g(abstractC3404t4)) || (i15 & 384) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                K10 = rVar2.K();
                if (!z10 || K10 == iVar) {
                    kotlin.jvm.internal.j jVar = new kotlin.jvm.internal.j(1, abstractC3404t4, AbstractC3404t.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                    rVar2.h0(jVar);
                    K10 = jVar;
                }
                abstractC0408g = (AbstractC0408g) K10;
                rVar2.t(false);
                boolean f6 = c3403s.f();
                rVar2.W(-1270943241);
                g10 = rVar2.g(abstractC0408g);
                K11 = rVar2.K();
                if (!g10 || K11 == iVar) {
                    K11 = AbstractC6463a.g(abstractC0408g, 18, rVar2);
                }
                rVar2.t(false);
                Df.H.e(f6, (AbstractC6216a) K11, rVar2, 0, 0);
                if (!c3403s.f32220e) {
                    String v11 = Ng.H.v(R.string.custom_instructions_unsaved_description, rVar2);
                    String v12 = Ng.H.v(R.string.custom_instructions_unsaved_title, rVar2);
                    String v13 = Ng.H.v(R.string.custom_instructions_unsaved_keep, rVar2);
                    String v14 = Ng.H.v(R.string.custom_instructions_unsaved_discard, rVar2);
                    long j6 = ((P0) rVar2.m(R0.f19593a)).f19539w;
                    rVar2.W(-1270943082);
                    boolean g12 = rVar2.g(abstractC0408g);
                    Object K13 = rVar2.K();
                    if (g12 || K13 == iVar) {
                        K13 = AbstractC6463a.g(abstractC0408g, 19, rVar2);
                    }
                    AbstractC6216a abstractC6216a = (AbstractC6216a) K13;
                    rVar2.t(false);
                    rVar2.W(-1270942994);
                    boolean g13 = rVar2.g(abstractC0408g);
                    Object K14 = rVar2.K();
                    if (g13 || K14 == iVar) {
                        K14 = AbstractC6463a.g(abstractC0408g, 20, rVar2);
                    }
                    rVar2.t(false);
                    abstractC3404t5 = abstractC3404t4;
                    rVar = rVar2;
                    K8.d.j(abstractC6216a, (AbstractC6216a) K14, v11, v14, j6, v12, false, v13, rVar, 0, 64);
                } else {
                    abstractC3404t5 = abstractC3404t4;
                    rVar = rVar2;
                }
                abstractC3404t3 = abstractC3404t5;
                abstractC4326r3 = abstractC4326r4;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new bb.j0(fVar, abstractC4326r3, abstractC3404t3, i10, i11, 27);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 896) != 0) {
        }
        if ((i12 & 731) != 146) {
        }
        rVar2.R();
        i13 = i10 & 1;
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (i13 == 0) {
        }
        if (i19 == 0) {
        }
        if ((i11 & 4) == 0) {
        }
        rVar2.u();
        i15 = i14;
        K8.d.f(fVar, abstractC3404t4, new G9.j(fVar, 8), abstractC4326r4, 0L, AbstractC3392g.f32198d, false, AbstractC3392g.f32199e, rVar2, 12779528 | (i14 & 14) | ((i14 >> 3) & 112) | ((i14 << 6) & 7168), 80);
        c3403s = (C3403s) AbstractC4828h.z(abstractC3404t4.f808e, rVar2).getValue();
        rVar2.W(-1270943299);
        if (((i15 & 896) ^ 384) <= 256) {
        }
        z10 = false;
        K10 = rVar2.K();
        if (!z10) {
        }
        kotlin.jvm.internal.j jVar2 = new kotlin.jvm.internal.j(1, abstractC3404t4, AbstractC3404t.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        rVar2.h0(jVar2);
        K10 = jVar2;
        abstractC0408g = (AbstractC0408g) K10;
        rVar2.t(false);
        boolean f62 = c3403s.f();
        rVar2.W(-1270943241);
        g10 = rVar2.g(abstractC0408g);
        K11 = rVar2.K();
        if (!g10) {
        }
        K11 = AbstractC6463a.g(abstractC0408g, 18, rVar2);
        rVar2.t(false);
        Df.H.e(f62, (AbstractC6216a) K11, rVar2, 0, 0);
        if (!c3403s.f32220e) {
        }
        abstractC3404t3 = abstractC3404t5;
        abstractC4326r3 = abstractC4326r4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(Tc.f fVar, AbstractC4326r abstractC4326r, AbstractC2389d abstractC2389d, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC2389d abstractC2389d2;
        Z.r rVar;
        AbstractC2389d abstractC2389d3;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        AbstractC2389d abstractC2389d4;
        Ad.g y02;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("DeactivatedAccountScreen");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-989210041);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(fVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 896) != 0) {
                if ((i11 & 4) == 0) {
                    abstractC2389d2 = abstractC2389d;
                    if (rVar2.g(abstractC2389d2)) {
                        i13 = 256;
                        i12 |= i13;
                    }
                } else {
                    abstractC2389d2 = abstractC2389d;
                }
                i13 = 128;
                i12 |= i13;
            } else {
                abstractC2389d2 = abstractC2389d;
            }
            if ((i12 & 731) != 146 && rVar2.B()) {
                rVar2.P();
                abstractC4326r3 = abstractC4326r2;
                abstractC2389d3 = abstractC2389d2;
                rVar = rVar2;
            } else {
                rVar2.R();
                if ((i10 & 1) == 0 && !rVar2.A()) {
                    rVar2.P();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    abstractC4326r4 = abstractC4326r2;
                } else {
                    if (i16 == 0) {
                        a5 = abstractC4326r2;
                    }
                    if ((i11 & 4) == 0) {
                        rVar2.W(-490350905);
                        Context context = (Context) rVar2.m(H0.Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar2.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar2.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar2.m(Ad.k.f814a);
                        androidx.lifecycle.e0 a10 = m2.b.a(rVar2);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b10 = d10.b(AbstractC2389d.class);
                            AbstractC0405d b11 = d10.b(cc.o.class);
                            AbstractC4326r abstractC4326r5 = a5;
                            rVar2.W(608026872);
                            boolean g10 = rVar2.g(b10) | rVar2.g(b11) | rVar2.g(list) | rVar2.g(vVar) | rVar2.h(booleanValue);
                            Object K10 = rVar2.K();
                            if (g10 || K10 == C1723m.f22654Y) {
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(cc.o.class), d10.b(AbstractC2389d.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(AbstractC2389d.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K10 = y02;
                                rVar2.h0(K10);
                            }
                            rVar2.t(false);
                            rVar2.t(false);
                            i12 &= -897;
                            abstractC4326r4 = abstractC4326r5;
                            abstractC2389d4 = (AbstractC2389d) ((Ad.g) K10);
                            rVar2.u();
                            cc.o oVar = (cc.o) AbstractC4828h.z(abstractC2389d4.f808e, rVar2).getValue();
                            rVar = rVar2;
                            r9.y.v(fVar, abstractC4326r4, 0L, null, 0.0f, null, null, R4.b.X(rVar2, 18742611, new C2388c(oVar, 0)), R4.b.X(rVar2, -2021932494, new androidx.compose.foundation.layout.c(oVar, 28, abstractC2389d4)), R4.b.X(rVar2, 1262683521, new C6471i(21, oVar)), rVar2, 918552584 | (i12 & 14) | (i12 & 112), 124);
                            abstractC4326r3 = abstractC4326r4;
                            abstractC2389d3 = abstractC2389d4;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        abstractC4326r4 = a5;
                    }
                }
                abstractC2389d4 = abstractC2389d2;
                rVar2.u();
                cc.o oVar2 = (cc.o) AbstractC4828h.z(abstractC2389d4.f808e, rVar2).getValue();
                rVar = rVar2;
                r9.y.v(fVar, abstractC4326r4, 0L, null, 0.0f, null, null, R4.b.X(rVar2, 18742611, new C2388c(oVar2, 0)), R4.b.X(rVar2, -2021932494, new androidx.compose.foundation.layout.c(oVar2, 28, abstractC2389d4)), R4.b.X(rVar2, 1262683521, new C6471i(21, oVar2)), rVar2, 918552584 | (i12 & 14) | (i12 & 112), 124);
                abstractC4326r3 = abstractC4326r4;
                abstractC2389d3 = abstractC2389d4;
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new bb.j0(fVar, abstractC4326r3, abstractC2389d3, i10, i11, 21);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 896) != 0) {
        }
        if ((i12 & 731) != 146) {
        }
        rVar2.R();
        if ((i10 & 1) == 0) {
        }
        if (i16 == 0) {
        }
        if ((i11 & 4) == 0) {
        }
    }

    public static final void g(int i10, AbstractC6216a abstractC6216a, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        Z.r rVar;
        boolean z10;
        int i13;
        int i14;
        AbstractC3557B.c0("onShowDetails", abstractC6216a);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(489713804);
        if ((i11 & 14) == 0) {
            if (rVar2.e(i10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (rVar2.i(abstractC6216a)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar2.B()) {
            rVar2.P();
            rVar = rVar2;
        } else {
            String v10 = Ng.H.v(i10, rVar2);
            AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), p9.r.f42841e, 0.0f, 2);
            rVar2.W(-59827995);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object K10 = rVar2.K();
            if (z10 || K10 == C1723m.f22654Y) {
                K10 = new C0033n0(abstractC6216a, 21);
                rVar2.h0(K10);
            }
            rVar2.t(false);
            AbstractC4326r h10 = androidx.compose.foundation.a.h(t10, (AbstractC6216a) K10);
            m1 m1Var = AbstractC1617t1.f20423a;
            rVar = rVar2;
            j4.b(v10, h10.g(MinimumInteractiveModifier.f24779b), ((P0) rVar2.m(R0.f19593a)).f19529m, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20313n, rVar, 0, 0, 65016);
        }
        C1741v0 v11 = rVar.v();
        if (v11 != null) {
            v11.f22739d = new C2789u(i10, i11, abstractC6216a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(AbstractC0438w abstractC0438w, C2334C c2334c, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        String str;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("<this>", abstractC0438w);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("GizmoBriefZeroStateContent");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-295510721);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(abstractC0438w)) {
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
            if (rVar2.g(c2334c)) {
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
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 731) != 146 && rVar2.B()) {
                rVar2.P();
                abstractC4326r3 = abstractC4326r2;
                rVar = rVar2;
            } else {
                if (i16 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                AbstractC4326r a10 = abstractC0438w.a(abstractC4326r4, C4310b.f37697j0);
                C0421f c0421f = AbstractC0429m.f3907a;
                C0426j g10 = AbstractC0429m.g(p9.r.f42841e);
                C4316h c4316h = C4310b.f37706s0;
                rVar2.W(-483455358);
                E0.N a11 = AbstractC0440y.a(g10, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i17 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(a10);
                String str2 = null;
                if (!(rVar2.f22696a instanceof AbstractC1707e)) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a11, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i17))) {
                        AbstractC6463a.q(i17, rVar2, i17, c0581j);
                    }
                    AbstractC6463a.r(0, i18, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a12 = io.sentry.compose.b.a("GizmoBriefZeroStateContent");
                    K8.d.z(c2334c, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42833d), null, rVar2, (i12 >> 3) & 14, 4);
                    if (c2334c != null) {
                        str2 = c2334c.f26440c;
                    }
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    rVar = rVar2;
                    j4.b(str, a12, ((P0) rVar2.m(R0.f19593a)).f19535s, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 5, 0, null, ((p4) rVar2.m(q4.f20361a)).f20309j, rVar, 0, 3072, 56826);
                    AbstractC6463a.v(rVar, false, true, false, false);
                    abstractC4326r3 = abstractC4326r4;
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new G.E(abstractC0438w, c2334c, abstractC4326r3, i10, i11, 23);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        AbstractC4326r a102 = abstractC0438w.a(abstractC4326r4, C4310b.f37697j0);
        C0421f c0421f2 = AbstractC0429m.f3907a;
        C0426j g102 = AbstractC0429m.g(p9.r.f42841e);
        C4316h c4316h2 = C4310b.f37706s0;
        rVar2.W(-483455358);
        E0.N a112 = AbstractC0440y.a(g102, c4316h2, rVar2);
        rVar2.W(-1323940314);
        int i172 = rVar2.P;
        AbstractC1732q0 p102 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i182 = androidx.compose.ui.layout.a.i(a102);
        String str22 = null;
        if (!(rVar2.f22696a instanceof AbstractC1707e)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(AbstractC0438w abstractC0438w, Tc.f fVar, C2334C c2334c, AbstractC4326r abstractC4326r, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        wf.k kVar2;
        int i14;
        int i15;
        wf.k kVar3;
        AbstractC4326r abstractC4326r3;
        Z.r rVar;
        wf.k kVar4;
        AbstractC1710f0 abstractC1710f0;
        boolean z10;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        int i20;
        AbstractC3557B.c0("<this>", abstractC0438w);
        AbstractC3557B.c0("appState", fVar);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("GizmoDetailedZeroStateContent");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-930059038);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(abstractC0438w)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.g(fVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar2.g(c2334c)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                kVar2 = kVar;
                if (rVar2.i(kVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
                i15 = i12;
                if ((i15 & 46811) != 9362 && rVar2.B()) {
                    rVar2.P();
                    abstractC4326r3 = abstractC4326r2;
                    rVar = rVar2;
                    kVar3 = kVar2;
                } else {
                    if (i21 != 0) {
                        abstractC4326r2 = a5;
                    }
                    if (i13 != 0) {
                        kVar4 = null;
                    } else {
                        kVar4 = kVar2;
                    }
                    if (c2334c == null) {
                        C1741v0 v10 = rVar2.v();
                        if (v10 != null) {
                            v10.f22739d = new Xa.c(abstractC0438w, fVar, c2334c, abstractC4326r2, kVar4, i10, i11, 0);
                            return;
                        }
                        return;
                    }
                    AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, Xa.d.f21816Y, rVar2, 6);
                    AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(abstractC0438w.a(abstractC4326r2, C4310b.f37697j0), p9.r.f42841e);
                    C0421f c0421f = AbstractC0429m.f3907a;
                    C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
                    C4316h c4316h = C4310b.f37706s0;
                    rVar2.W(-483455358);
                    E0.N a10 = AbstractC0440y.a(g10, c4316h, rVar2);
                    rVar2.W(-1323940314);
                    int i22 = rVar2.P;
                    AbstractC1732q0 p10 = rVar2.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i23 = androidx.compose.ui.layout.a.i(r10);
                    if (rVar2.f22696a instanceof AbstractC1707e) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, a10, C0583l.f5808f);
                        U3.f.n0(rVar2, p10, C0583l.f5807e);
                        C0581j c0581j = C0583l.f5809g;
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i22))) {
                            AbstractC6463a.q(i22, rVar2, i22, c0581j);
                        }
                        AbstractC6463a.r(0, i23, new L0(rVar2), rVar2, 2058660585);
                        AbstractC4326r a11 = io.sentry.compose.b.a("GizmoDetailedZeroStateContent");
                        int i24 = i15 >> 6;
                        int i25 = i24 & 14;
                        K8.d.A(c2334c, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42835f), rVar2, i25, 0);
                        m1 m1Var = q4.f20361a;
                        j4.b(c2334c.f26439b, a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(m1Var)).f20306g, rVar2, 0, 0, 65534);
                        AbstractC4326r abstractC4326r4 = abstractC4326r2;
                        Bi.c.f((i24 & 896) | i25, 2, rVar2, a11, c2334c, kVar4);
                        rVar2.W(1015764841);
                        String str = c2334c.f26440c;
                        if (str != null) {
                            float f6 = p9.r.f42839c;
                            androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.j(c4323o, f6), rVar2);
                            z10 = false;
                            abstractC1710f0 = abstractC1710f02;
                            i16 = i25;
                            j4.b(str, a11, 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 5, 0, null, ((p4) rVar2.m(m1Var)).f20309j, rVar2, 0, 3072, 56830);
                            androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.j(c4323o, f6), rVar2);
                        } else {
                            abstractC1710f0 = abstractC1710f02;
                            i16 = i25;
                            z10 = false;
                        }
                        rVar2.t(z10);
                        rVar2.W(2044239406);
                        if (c2334c.f26457t) {
                            Bi.c.g(c2334c, a11, rVar2, i16, 2);
                        }
                        AbstractC6463a.v(rVar2, z10, z10, true, z10);
                        rVar2.t(z10);
                        rVar2.W(2044239482);
                        if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                            rVar2.W(-592604931);
                            AbstractC1710f0 abstractC1710f03 = abstractC1710f0;
                            boolean g11 = rVar2.g(abstractC1710f03);
                            Object K10 = rVar2.K();
                            if (g11 || K10 == C1723m.f22654Y) {
                                K10 = R.a.o(abstractC1710f03, 19, rVar2);
                            }
                            rVar2.t(z10);
                            z11 = z10;
                            rVar = rVar2;
                            Bi.c.t(fVar, c2334c.f26438a, (AbstractC6216a) K10, null, rVar2, ((i15 >> 3) & 14) | 8, 8);
                        } else {
                            z11 = z10;
                            rVar = rVar2;
                        }
                        rVar.t(z11);
                        kVar3 = kVar4;
                        abstractC4326r3 = abstractC4326r4;
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                C1741v0 v11 = rVar.v();
                if (v11 != null) {
                    v11.f22739d = new Xa.c(abstractC0438w, fVar, c2334c, abstractC4326r3, kVar3, i10, i11, 1);
                    return;
                }
                return;
            }
            kVar2 = kVar;
            i15 = i12;
            if ((i15 & 46811) != 9362) {
            }
            if (i21 != 0) {
            }
            if (i13 != 0) {
            }
            if (c2334c == null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        kVar2 = kVar;
        i15 = i12;
        if ((i15 & 46811) != 9362) {
        }
        if (i21 != 0) {
        }
        if (i13 != 0) {
        }
        if (c2334c == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(AbstractC0438w abstractC0438w, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        boolean z10;
        int i13;
        int i14;
        AbstractC3557B.c0("<this>", abstractC0438w);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("GizmoLoadingStateContent");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1889721587);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(abstractC0438w)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 91) != 18 && rVar2.B()) {
                rVar2.P();
                rVar = rVar2;
                a5 = abstractC4326r2;
            } else {
                if (i15 == 0) {
                    a5 = abstractC4326r2;
                }
                AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(abstractC0438w.a(a5, C4310b.f37697j0), p9.r.f42841e);
                C0421f c0421f = AbstractC0429m.f3907a;
                float f6 = p9.r.f42840d;
                C0426j g10 = AbstractC0429m.g(f6);
                C4316h c4316h = C4310b.f37706s0;
                rVar2.W(-483455358);
                E0.N a10 = AbstractC0440y.a(g10, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i16 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i17 = androidx.compose.ui.layout.a.i(r10);
                z10 = rVar2.f22696a instanceof AbstractC1707e;
                if (!z10) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar2, a10, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar2, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i16))) {
                        AbstractC6463a.q(i16, rVar2, i16, c0581j3);
                    }
                    AbstractC6463a.r(0, i17, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("GizmoLoadingStateContent");
                    AbstractC4326r I12 = Bi.c.I1(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42835f), K.f.f9317a), true, false);
                    rVar2.W(733328855);
                    E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                    rVar2.W(-1323940314);
                    int i18 = rVar2.P;
                    AbstractC1732q0 p11 = rVar2.p();
                    C3288a i19 = androidx.compose.ui.layout.a.i(I12);
                    if (z10) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, c10, c0581j);
                        U3.f.n0(rVar2, p11, c0581j2);
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i18))) {
                            AbstractC6463a.q(i18, rVar2, i18, c0581j3);
                        }
                        AbstractC6463a.r(0, i19, new L0(rVar2), rVar2, 2058660585);
                        AbstractC6463a.v(rVar2, false, true, false, false);
                        m1 m1Var = q4.f20361a;
                        G0.X x10 = (G0.X) a11;
                        j4.b("Gizmo Name", AbstractC4194d.a(x10, Bi.c.I1(c4323o, true, false)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(m1Var)).f20306g, rVar2, 6, 0, 65532);
                        j4.b("This is a gizmo subtitle", Bi.c.I1(c4323o, true, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 6, 0, 131068);
                        androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.j(c4323o, f6), rVar2);
                        j4.b("Multi-line description of a gizmo for loading purposes but don't think too much about it", AbstractC4194d.a(x10, Bi.c.I1(c4323o, true, false)), 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 5, 0, null, ((p4) rVar2.m(m1Var)).f20309j, rVar2, 6, 3072, 56828);
                        rVar = rVar2;
                        androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.j(c4323o, f6), rVar);
                        rVar.t(false);
                        rVar.t(true);
                        rVar.t(false);
                        rVar.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new C4772m0(abstractC0438w, a5, i10, i11, 2);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 91) != 18) {
        }
        if (i15 == 0) {
        }
        AbstractC4326r r102 = androidx.compose.foundation.layout.a.r(abstractC0438w.a(a5, C4310b.f37697j0), p9.r.f42841e);
        C0421f c0421f2 = AbstractC0429m.f3907a;
        float f62 = p9.r.f42840d;
        C0426j g102 = AbstractC0429m.g(f62);
        C4316h c4316h2 = C4310b.f37706s0;
        rVar2.W(-483455358);
        E0.N a102 = AbstractC0440y.a(g102, c4316h2, rVar2);
        rVar2.W(-1323940314);
        int i162 = rVar2.P;
        AbstractC1732q0 p102 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i172 = androidx.compose.ui.layout.a.i(r102);
        z10 = rVar2.f22696a instanceof AbstractC1707e;
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(String str, AbstractC4326r abstractC4326r, long j6, long j10, N0.E e10, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        long j11;
        int i14;
        long j12;
        N0.E e11;
        C1741v0 v10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        AbstractC4326r a5 = io.sentry.compose.b.a("HeroLabel");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(293833305);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(str)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
                j11 = j6;
            } else {
                j11 = j6;
                if ((i10 & 896) == 0) {
                    if (rVar.f(j11)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i12 |= i17;
                }
            }
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                j12 = j10;
                if (rVar.f(j12)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        e11 = e10;
                        if (rVar.g(e11)) {
                            i15 = 16384;
                            i12 |= i15;
                        }
                    } else {
                        e11 = e10;
                    }
                    i15 = 8192;
                    i12 |= i15;
                } else {
                    e11 = e10;
                }
                if ((46811 & i12) != 9362 && rVar.B()) {
                    rVar.P();
                } else {
                    rVar.R();
                    if ((i10 & 1) == 0 && !rVar.A()) {
                        rVar.P();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        a5 = abstractC4326r2;
                    } else {
                        if (i20 == 0) {
                            a5 = abstractC4326r2;
                        }
                        if (i13 != 0) {
                            j11 = r0.r.f44263k;
                        }
                        if (i14 != 0) {
                            j12 = r0.r.f44263k;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            e11 = ((p4) rVar.m(q4.f20361a)).f20302c;
                        }
                    }
                    rVar.u();
                    AbstractC5285b.a(str, true, R4.b.X(rVar, -144790613, new v9.d(a5, j11, e11, j12)), rVar, (i12 & 14) | 432);
                    abstractC4326r2 = a5;
                }
                long j13 = j11;
                N0.E e12 = e11;
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new v9.e(str, abstractC4326r2, j13, j12, e12, i10, i11);
                    return;
                }
                return;
            }
            j12 = j10;
            if ((57344 & i10) == 0) {
            }
            if ((46811 & i12) != 9362) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i20 == 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            rVar.u();
            AbstractC5285b.a(str, true, R4.b.X(rVar, -144790613, new v9.d(a5, j11, e11, j12)), rVar, (i12 & 14) | 432);
            abstractC4326r2 = a5;
            long j132 = j11;
            N0.E e122 = e11;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        j12 = j10;
        if ((57344 & i10) == 0) {
        }
        if ((46811 & i12) != 9362) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i20 == 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        rVar.u();
        AbstractC5285b.a(str, true, R4.b.X(rVar, -144790613, new v9.d(a5, j11, e11, j12)), rVar, (i12 & 14) | 432);
        abstractC4326r2 = a5;
        long j1322 = j11;
        N0.E e1222 = e11;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void l(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        AbstractC3557B.c0("onEnableClick", abstractC6216a);
        AbstractC4326r a5 = io.sentry.compose.b.a("HistoryDisabledContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1904295967);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(abstractC6216a)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
            abstractC4326r2 = abstractC4326r;
        } else {
            if (i15 == 0) {
                a5 = abstractC4326r;
            }
            int i16 = ((i12 >> 3) & 14) | 24576;
            r9.y.l(a5, Bi.c.T0(), Ng.H.v(R.string.conversations_history_disabled_title, rVar), Ng.H.v(R.string.conversations_history_disabled_description, rVar), R4.b.X(rVar, -1662673727, new C0766k0(abstractC6216a, 0)), rVar, i16, 0);
            abstractC4326r2 = a5;
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C5386c(abstractC6216a, abstractC4326r2, i10, i11, 1);
        }
    }

    public static final void m(AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        AbstractC4326r a5 = io.sentry.compose.b.a("HistoryDisabledMiniContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(843131940);
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
            r9.y.l(abstractC4326r, Bi.c.T0(), null, Ng.H.v(R.string.conversations_history_disabled_title, rVar), null, rVar, i12 & 14, 20);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new d9.o(abstractC4326r, i10, i11, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(String str, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        boolean z10;
        boolean z11;
        Object K10;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("gizmoId", str);
        AbstractC3557B.c0("onStarSelected", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("InlineGizmoRatingContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(17586629);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(str)) {
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
            if (rVar.i(kVar)) {
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
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i16 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                AbstractC4326r b10 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.a.s(abstractC4326r4, p9.r.f42841e, p9.r.f42840d), ((C1525a3) rVar.m(AbstractC1530b3.f19940a)).f19906c);
                rVar.W(-149336170);
                boolean z12 = true;
                if ((i12 & 112) != 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 14) != 4) {
                    z12 = false;
                }
                z11 = z10 | z12;
                K10 = rVar.K();
                if (!z11 || K10 == C1723m.f22654Y) {
                    K10 = new C2615c(kVar, str, 0);
                    rVar.h0(K10);
                }
                rVar.t(false);
                abstractC4326r3 = abstractC4326r4;
                E1.a(AbstractC2614b.f28175a, AbstractC4194d.a((G0.X) a5, androidx.compose.foundation.a.h(b10, (AbstractC6216a) K10)), null, null, AbstractC2614b.f28176b, AbstractC2614b.f28177c, null, p9.i.f42782a, 0.0f, rVar, 221190, 332);
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C2616d(str, kVar, abstractC4326r3, i10, i11, 0);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        AbstractC4326r b102 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.a.s(abstractC4326r4, p9.r.f42841e, p9.r.f42840d), ((C1525a3) rVar.m(AbstractC1530b3.f19940a)).f19906c);
        rVar.W(-149336170);
        boolean z122 = true;
        if ((i12 & 112) != 32) {
        }
        if ((i12 & 14) != 4) {
        }
        z11 = z10 | z122;
        K10 = rVar.K();
        if (!z11) {
        }
        K10 = new C2615c(kVar, str, 0);
        rVar.h0(K10);
        rVar.t(false);
        abstractC4326r3 = abstractC4326r4;
        E1.a(AbstractC2614b.f28175a, AbstractC4194d.a((G0.X) a5, androidx.compose.foundation.a.h(b102, (AbstractC6216a) K10)), null, null, AbstractC2614b.f28176b, AbstractC2614b.f28177c, null, p9.i.f42782a, 0.0f, rVar, 221190, 332);
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final void o(Tc.f fVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("MemoryConversationBanner");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(704568589);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            if (i15 != 0) {
                abstractC4326r = a5;
            }
            A7.b.k(R.a.q(((P0) rVar.m(R0.f19593a)).f19529m, Z0.f19875a), R4.b.X(rVar, -984506291, new C4771m(abstractC4326r, fVar, 0)), rVar, 48);
        }
        AbstractC4326r abstractC4326r2 = abstractC4326r;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C4774n(fVar, abstractC4326r2, i10, i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, C1572k0 c1572k0, boolean z10, boolean z11, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C1572k0 c1572k02;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        Z.r rVar;
        boolean z14;
        boolean z15;
        C1572k0 c1572k03;
        AbstractC4326r abstractC4326r3;
        boolean z16;
        C1572k0 c1572k04;
        AbstractC4326r abstractC4326r4;
        boolean z17;
        C1572k0 c1572k05;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        AbstractC3557B.c0("onClick", abstractC6216a);
        AbstractC3557B.c0("content", nVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("OutlinedProgressButton");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-1427026933);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.i(abstractC6216a)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
            if ((i10 & 896) != 0) {
                if ((i11 & 4) == 0) {
                    c1572k02 = c1572k0;
                    if (rVar2.g(c1572k02)) {
                        i18 = 256;
                        i12 |= i18;
                    }
                } else {
                    c1572k02 = c1572k0;
                }
                i18 = 128;
                i12 |= i18;
            } else {
                c1572k02 = c1572k0;
            }
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                z12 = z10;
                if (rVar2.h(z12)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i12 |= i17;
                i14 = i11 & 16;
                if (i14 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    z13 = z11;
                    if (rVar2.h(z13)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                    if ((i11 & 32) == 0) {
                        i15 = 196608;
                    } else {
                        if ((458752 & i10) == 0) {
                            if (rVar2.i(nVar)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                        }
                        if ((374491 & i12) != 74898 && rVar2.B()) {
                            rVar2.P();
                            abstractC4326r3 = abstractC4326r2;
                            c1572k03 = c1572k02;
                            z15 = z12;
                            z14 = z13;
                            rVar = rVar2;
                        } else {
                            rVar2.R();
                            if ((i10 & 1) == 0 && !rVar2.A()) {
                                rVar2.P();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                abstractC4326r4 = abstractC4326r2;
                                c1572k04 = c1572k02;
                            } else {
                                if (i21 == 0) {
                                    a5 = abstractC4326r2;
                                }
                                if ((i11 & 4) != 0) {
                                    c1572k05 = AbstractC1577l0.g(rVar2);
                                    i12 &= -897;
                                } else {
                                    c1572k05 = c1572k02;
                                }
                                if (i13 != 0) {
                                    z12 = false;
                                }
                                if (i14 != 0) {
                                    abstractC4326r4 = a5;
                                    c1572k04 = c1572k05;
                                    z16 = true;
                                    z17 = z12;
                                    rVar2.u();
                                    rVar = rVar2;
                                    Ng.H.d(abstractC6216a, abstractC4326r4, z16, null, c1572k04, null, null, null, null, R4.b.X(rVar2, 1652341849, new C5380C(z17, nVar, 0)), rVar2, 805306368 | (i12 & 14) | (i12 & 112) | ((i12 >> 6) & 896) | ((i12 << 6) & 57344), 488);
                                    abstractC4326r3 = abstractC4326r4;
                                    c1572k03 = c1572k04;
                                    z14 = z16;
                                    z15 = z17;
                                } else {
                                    abstractC4326r4 = a5;
                                    c1572k04 = c1572k05;
                                }
                            }
                            z17 = z12;
                            z16 = z13;
                            rVar2.u();
                            rVar = rVar2;
                            Ng.H.d(abstractC6216a, abstractC4326r4, z16, null, c1572k04, null, null, null, null, R4.b.X(rVar2, 1652341849, new C5380C(z17, nVar, 0)), rVar2, 805306368 | (i12 & 14) | (i12 & 112) | ((i12 >> 6) & 896) | ((i12 << 6) & 57344), 488);
                            abstractC4326r3 = abstractC4326r4;
                            c1572k03 = c1572k04;
                            z14 = z16;
                            z15 = z17;
                        }
                        C1741v0 v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new C5381D(abstractC6216a, abstractC4326r3, c1572k03, z15, z14, nVar, i10, i11, 0);
                            return;
                        }
                        return;
                    }
                    i12 |= i15;
                    if ((374491 & i12) != 74898) {
                    }
                    rVar2.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if ((i11 & 4) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                }
                z13 = z11;
                if ((i11 & 32) == 0) {
                }
                i12 |= i15;
                if ((374491 & i12) != 74898) {
                }
                rVar2.R();
                if ((i10 & 1) == 0) {
                }
                if (i21 == 0) {
                }
                if ((i11 & 4) != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
            }
            z12 = z10;
            i14 = i11 & 16;
            if (i14 != 0) {
            }
            z13 = z11;
            if ((i11 & 32) == 0) {
            }
            i12 |= i15;
            if ((374491 & i12) != 74898) {
            }
            rVar2.R();
            if ((i10 & 1) == 0) {
            }
            if (i21 == 0) {
            }
            if ((i11 & 4) != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 896) != 0) {
        }
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        z12 = z10;
        i14 = i11 & 16;
        if (i14 != 0) {
        }
        z13 = z11;
        if ((i11 & 32) == 0) {
        }
        i12 |= i15;
        if ((374491 & i12) != 74898) {
        }
        rVar2.R();
        if ((i10 & 1) == 0) {
        }
        if (i21 == 0) {
        }
        if ((i11 & 4) != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, C1572k0 c1572k0, boolean z10, boolean z11, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C1572k0 c1572k02;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        Z.r rVar;
        boolean z14;
        boolean z15;
        C1572k0 c1572k03;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        boolean z16;
        C1572k0 c1572k04;
        AbstractC4326r abstractC4326r4;
        boolean z17;
        C1572k0 c1572k05;
        boolean z18;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        AbstractC3557B.c0("onClick", abstractC6216a);
        AbstractC3557B.c0("content", nVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("ProgressButton");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-1743812983);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.i(abstractC6216a)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
            if ((i10 & 896) != 0) {
                if ((i11 & 4) == 0) {
                    c1572k02 = c1572k0;
                    if (rVar2.g(c1572k02)) {
                        i18 = 256;
                        i12 |= i18;
                    }
                } else {
                    c1572k02 = c1572k0;
                }
                i18 = 128;
                i12 |= i18;
            } else {
                c1572k02 = c1572k0;
            }
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                z12 = z10;
                if (rVar2.h(z12)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i12 |= i17;
                i14 = i11 & 16;
                if (i14 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    z13 = z11;
                    if (rVar2.h(z13)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                    if ((i11 & 32) == 0) {
                        i15 = 196608;
                    } else {
                        if ((458752 & i10) == 0) {
                            if (rVar2.i(nVar)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                        }
                        if ((374491 & i12) != 74898 && rVar2.B()) {
                            rVar2.P();
                            abstractC4326r3 = abstractC4326r2;
                            c1572k03 = c1572k02;
                            z15 = z12;
                            z14 = z13;
                            rVar = rVar2;
                        } else {
                            rVar2.R();
                            if ((i10 & 1) == 0 && !rVar2.A()) {
                                rVar2.P();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                abstractC4326r4 = abstractC4326r2;
                                c1572k04 = c1572k02;
                                z17 = z12;
                            } else {
                                if (i21 == 0) {
                                    a5 = abstractC4326r2;
                                }
                                if ((i11 & 4) != 0) {
                                    c1572k05 = AbstractC1577l0.g(rVar2);
                                    i12 &= -897;
                                } else {
                                    c1572k05 = c1572k02;
                                }
                                if (i13 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z12;
                                }
                                abstractC4326r4 = a5;
                                c1572k04 = c1572k05;
                                z17 = z18;
                                if (i14 != 0) {
                                    z16 = true;
                                    rVar2.u();
                                    rVar = rVar2;
                                    Ng.H.a(abstractC6216a, abstractC4326r4, z16, null, c1572k04, null, null, null, null, R4.b.X(rVar2, 2123882649, new C5380C(z17, nVar, 1)), rVar2, 805306368 | (i12 & 14) | (i12 & 112) | ((i12 >> 6) & 896) | ((i12 << 6) & 57344), 488);
                                    abstractC4326r3 = abstractC4326r4;
                                    c1572k03 = c1572k04;
                                    z14 = z16;
                                    z15 = z17;
                                }
                            }
                            z16 = z13;
                            rVar2.u();
                            rVar = rVar2;
                            Ng.H.a(abstractC6216a, abstractC4326r4, z16, null, c1572k04, null, null, null, null, R4.b.X(rVar2, 2123882649, new C5380C(z17, nVar, 1)), rVar2, 805306368 | (i12 & 14) | (i12 & 112) | ((i12 >> 6) & 896) | ((i12 << 6) & 57344), 488);
                            abstractC4326r3 = abstractC4326r4;
                            c1572k03 = c1572k04;
                            z14 = z16;
                            z15 = z17;
                        }
                        v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new C5381D(abstractC6216a, abstractC4326r3, c1572k03, z15, z14, nVar, i10, i11, 1);
                            return;
                        }
                        return;
                    }
                    i12 |= i15;
                    if ((374491 & i12) != 74898) {
                    }
                    rVar2.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if ((i11 & 4) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    abstractC4326r4 = a5;
                    c1572k04 = c1572k05;
                    z17 = z18;
                    if (i14 != 0) {
                    }
                    z16 = z13;
                    rVar2.u();
                    rVar = rVar2;
                    Ng.H.a(abstractC6216a, abstractC4326r4, z16, null, c1572k04, null, null, null, null, R4.b.X(rVar2, 2123882649, new C5380C(z17, nVar, 1)), rVar2, 805306368 | (i12 & 14) | (i12 & 112) | ((i12 >> 6) & 896) | ((i12 << 6) & 57344), 488);
                    abstractC4326r3 = abstractC4326r4;
                    c1572k03 = c1572k04;
                    z14 = z16;
                    z15 = z17;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                z13 = z11;
                if ((i11 & 32) == 0) {
                }
                i12 |= i15;
                if ((374491 & i12) != 74898) {
                }
                rVar2.R();
                if ((i10 & 1) == 0) {
                }
                if (i21 == 0) {
                }
                if ((i11 & 4) != 0) {
                }
                if (i13 != 0) {
                }
                abstractC4326r4 = a5;
                c1572k04 = c1572k05;
                z17 = z18;
                if (i14 != 0) {
                }
                z16 = z13;
                rVar2.u();
                rVar = rVar2;
                Ng.H.a(abstractC6216a, abstractC4326r4, z16, null, c1572k04, null, null, null, null, R4.b.X(rVar2, 2123882649, new C5380C(z17, nVar, 1)), rVar2, 805306368 | (i12 & 14) | (i12 & 112) | ((i12 >> 6) & 896) | ((i12 << 6) & 57344), 488);
                abstractC4326r3 = abstractC4326r4;
                c1572k03 = c1572k04;
                z14 = z16;
                z15 = z17;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            z12 = z10;
            i14 = i11 & 16;
            if (i14 != 0) {
            }
            z13 = z11;
            if ((i11 & 32) == 0) {
            }
            i12 |= i15;
            if ((374491 & i12) != 74898) {
            }
            rVar2.R();
            if ((i10 & 1) == 0) {
            }
            if (i21 == 0) {
            }
            if ((i11 & 4) != 0) {
            }
            if (i13 != 0) {
            }
            abstractC4326r4 = a5;
            c1572k04 = c1572k05;
            z17 = z18;
            if (i14 != 0) {
            }
            z16 = z13;
            rVar2.u();
            rVar = rVar2;
            Ng.H.a(abstractC6216a, abstractC4326r4, z16, null, c1572k04, null, null, null, null, R4.b.X(rVar2, 2123882649, new C5380C(z17, nVar, 1)), rVar2, 805306368 | (i12 & 14) | (i12 & 112) | ((i12 >> 6) & 896) | ((i12 << 6) & 57344), 488);
            abstractC4326r3 = abstractC4326r4;
            c1572k03 = c1572k04;
            z14 = z16;
            z15 = z17;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 896) != 0) {
        }
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        z12 = z10;
        i14 = i11 & 16;
        if (i14 != 0) {
        }
        z13 = z11;
        if ((i11 & 32) == 0) {
        }
        i12 |= i15;
        if ((374491 & i12) != 74898) {
        }
        rVar2.R();
        if ((i10 & 1) == 0) {
        }
        if (i21 == 0) {
        }
        if ((i11 & 4) != 0) {
        }
        if (i13 != 0) {
        }
        abstractC4326r4 = a5;
        c1572k04 = c1572k05;
        z17 = z18;
        if (i14 != 0) {
        }
        z16 = z13;
        rVar2.u();
        rVar = rVar2;
        Ng.H.a(abstractC6216a, abstractC4326r4, z16, null, c1572k04, null, null, null, null, R4.b.X(rVar2, 2123882649, new C5380C(z17, nVar, 1)), rVar2, 805306368 | (i12 & 14) | (i12 & 112) | ((i12 >> 6) & 896) | ((i12 << 6) & 57344), 488);
        abstractC4326r3 = abstractC4326r4;
        c1572k03 = c1572k04;
        z14 = z16;
        z15 = z17;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(wf.n nVar, wf.p pVar, wf.n nVar2, wf.p pVar2, wf.n nVar3, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        wf.n nVar4;
        wf.p pVar3;
        int i13;
        wf.n nVar5;
        int i14;
        wf.p pVar4;
        C1741v0 v10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        AbstractC3557B.c0("content", nVar3);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1235399574);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            nVar4 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar4 = nVar;
            if (rVar.i(nVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            nVar4 = nVar;
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            pVar3 = pVar;
            if (rVar.i(pVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                nVar5 = nVar2;
                if (rVar.i(nVar5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i12 |= i17;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    pVar4 = pVar2;
                    if (rVar.i(pVar4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                    if ((i11 & 16) == 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        if (rVar.i(nVar3)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 46811) != 9362 && rVar.B()) {
                        rVar.P();
                    } else {
                        if (i20 != 0) {
                            nVar4 = null;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        }
                        if (i13 != 0) {
                            nVar5 = null;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        wf.n nVar6 = C1378w.f16389h0;
                        wf.p pVar5 = AbstractC1370n.f16344a;
                        wf.n nVar7 = C1378w.f16390i0;
                        wf.p pVar6 = AbstractC1370n.f16345b;
                        C1737t0[] c1737t0Arr = new C1737t0[1];
                        Z.O o10 = S8.Q.f16263a;
                        if (nVar4 != null) {
                            nVar6 = nVar4;
                        }
                        if (pVar3 != null) {
                            pVar5 = pVar3;
                        }
                        if (nVar5 != null) {
                            nVar7 = nVar5;
                        }
                        if (pVar4 != null) {
                            pVar6 = pVar4;
                        }
                        c1737t0Arr[0] = o10.b(new S8.P(nVar6, pVar5, nVar7, pVar6));
                        A7.b.l(c1737t0Arr, R4.b.X(rVar, -1937600214, new C1368l(nVar3, 3)), rVar, 56);
                    }
                    wf.n nVar8 = nVar4;
                    wf.p pVar7 = pVar3;
                    wf.n nVar9 = nVar5;
                    wf.p pVar8 = pVar4;
                    v10 = rVar.v();
                    if (v10 == null) {
                        v10.f22739d = new y.P(nVar8, pVar7, nVar9, pVar8, nVar3, i10, i11, 7);
                        return;
                    }
                    return;
                }
                pVar4 = pVar2;
                if ((i11 & 16) == 0) {
                }
                if ((i12 & 46811) != 9362) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                wf.n nVar62 = C1378w.f16389h0;
                wf.p pVar52 = AbstractC1370n.f16344a;
                wf.n nVar72 = C1378w.f16390i0;
                wf.p pVar62 = AbstractC1370n.f16345b;
                C1737t0[] c1737t0Arr2 = new C1737t0[1];
                Z.O o102 = S8.Q.f16263a;
                if (nVar4 != null) {
                }
                if (pVar3 != null) {
                }
                if (nVar5 != null) {
                }
                if (pVar4 != null) {
                }
                c1737t0Arr2[0] = o102.b(new S8.P(nVar62, pVar52, nVar72, pVar62));
                A7.b.l(c1737t0Arr2, R4.b.X(rVar, -1937600214, new C1368l(nVar3, 3)), rVar, 56);
                wf.n nVar82 = nVar4;
                wf.p pVar72 = pVar3;
                wf.n nVar92 = nVar5;
                wf.p pVar82 = pVar4;
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            nVar5 = nVar2;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            pVar4 = pVar2;
            if ((i11 & 16) == 0) {
            }
            if ((i12 & 46811) != 9362) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            wf.n nVar622 = C1378w.f16389h0;
            wf.p pVar522 = AbstractC1370n.f16344a;
            wf.n nVar722 = C1378w.f16390i0;
            wf.p pVar622 = AbstractC1370n.f16345b;
            C1737t0[] c1737t0Arr22 = new C1737t0[1];
            Z.O o1022 = S8.Q.f16263a;
            if (nVar4 != null) {
            }
            if (pVar3 != null) {
            }
            if (nVar5 != null) {
            }
            if (pVar4 != null) {
            }
            c1737t0Arr22[0] = o1022.b(new S8.P(nVar622, pVar522, nVar722, pVar622));
            A7.b.l(c1737t0Arr22, R4.b.X(rVar, -1937600214, new C1368l(nVar3, 3)), rVar, 56);
            wf.n nVar822 = nVar4;
            wf.p pVar722 = pVar3;
            wf.n nVar922 = nVar5;
            wf.p pVar822 = pVar4;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        pVar3 = pVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        nVar5 = nVar2;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        pVar4 = pVar2;
        if ((i11 & 16) == 0) {
        }
        if ((i12 & 46811) != 9362) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        wf.n nVar6222 = C1378w.f16389h0;
        wf.p pVar5222 = AbstractC1370n.f16344a;
        wf.n nVar7222 = C1378w.f16390i0;
        wf.p pVar6222 = AbstractC1370n.f16345b;
        C1737t0[] c1737t0Arr222 = new C1737t0[1];
        Z.O o10222 = S8.Q.f16263a;
        if (nVar4 != null) {
        }
        if (pVar3 != null) {
        }
        if (nVar5 != null) {
        }
        if (pVar4 != null) {
        }
        c1737t0Arr222[0] = o10222.b(new S8.P(nVar6222, pVar5222, nVar7222, pVar6222));
        A7.b.l(c1737t0Arr222, R4.b.X(rVar, -1937600214, new C1368l(nVar3, 3)), rVar, 56);
        wf.n nVar8222 = nVar4;
        wf.p pVar7222 = pVar3;
        wf.n nVar9222 = nVar5;
        wf.p pVar8222 = pVar4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(Tc.f fVar, String str, AbstractC4326r abstractC4326r, AbstractC4394S abstractC4394S, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4394S abstractC4394S2;
        AbstractC4394S abstractC4394S3;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        AbstractC4394S abstractC4394S4;
        Ad.g y02;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3557B.c0("appState", fVar);
        AbstractC3557B.c0(ParameterNames.VERSION, str);
        AbstractC4326r a5 = io.sentry.compose.b.a("SettingsScreen");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(838384658);
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
            if (rVar.g(str)) {
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
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            if ((i10 & 7168) != 0) {
                if ((i11 & 8) == 0) {
                    abstractC4394S2 = abstractC4394S;
                    if (rVar.g(abstractC4394S2)) {
                        i13 = 2048;
                        i12 |= i13;
                    }
                } else {
                    abstractC4394S2 = abstractC4394S;
                }
                i13 = 1024;
                i12 |= i13;
            } else {
                abstractC4394S2 = abstractC4394S;
            }
            if ((i12 & 5851) != 1170 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
                abstractC4394S3 = abstractC4394S2;
            } else {
                rVar.R();
                if ((i10 & 1) == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    abstractC4326r4 = abstractC4326r2;
                } else {
                    if (i17 == 0) {
                        a5 = abstractC4326r2;
                    }
                    if ((i11 & 8) == 0) {
                        rVar.W(-490350905);
                        Context context = (Context) rVar.m(H0.Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar.m(Ad.k.f814a);
                        androidx.lifecycle.e0 a10 = m2.b.a(rVar);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b10 = d10.b(AbstractC4394S.class);
                            AbstractC4326r abstractC4326r5 = a5;
                            AbstractC0405d b11 = d10.b(C4393Q.class);
                            rVar.W(608026872);
                            boolean g10 = rVar.g(b11) | rVar.g(b10) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                            Object K10 = rVar.K();
                            if (g10 || K10 == C1723m.f22654Y) {
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(C4393Q.class), d10.b(AbstractC4394S.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(AbstractC4394S.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K10 = y02;
                                rVar.h0(K10);
                            }
                            rVar.t(false);
                            rVar.t(false);
                            i12 &= -7169;
                            abstractC4326r4 = abstractC4326r5;
                            abstractC4394S4 = (AbstractC4394S) ((Ad.g) K10);
                            rVar.u();
                            Context context2 = (Context) rVar.m(H0.Z.f6888b);
                            rVar.W(286497075);
                            C1568j1 c1568j1 = new C1568j1(AbstractC1522a0.h(rVar), m4.f20229Y);
                            rVar.t(false);
                            K8.d.f(fVar, abstractC4394S4, new Xb.h(fVar, context2, 3), androidx.compose.ui.input.nestedscroll.a.a(abstractC4326r4, c1568j1.a(), null), 0L, R4.b.X(rVar, -999465754, new C2989h(c1568j1, fVar, 4)), false, R4.b.X(rVar, 1890441665, new C4392P(fVar, str, abstractC4394S4, context2)), rVar, 12779528 | (i12 & 14) | ((i12 >> 6) & 112), 80);
                            abstractC4326r3 = abstractC4326r4;
                            abstractC4394S3 = abstractC4394S4;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        abstractC4326r4 = a5;
                    }
                }
                abstractC4394S4 = abstractC4394S2;
                rVar.u();
                Context context22 = (Context) rVar.m(H0.Z.f6888b);
                rVar.W(286497075);
                C1568j1 c1568j12 = new C1568j1(AbstractC1522a0.h(rVar), m4.f20229Y);
                rVar.t(false);
                K8.d.f(fVar, abstractC4394S4, new Xb.h(fVar, context22, 3), androidx.compose.ui.input.nestedscroll.a.a(abstractC4326r4, c1568j12.a(), null), 0L, R4.b.X(rVar, -999465754, new C2989h(c1568j12, fVar, 4)), false, R4.b.X(rVar, 1890441665, new C4392P(fVar, str, abstractC4394S4, context22)), rVar, 12779528 | (i12 & 14) | ((i12 >> 6) & 112), 80);
                abstractC4326r3 = abstractC4326r4;
                abstractC4394S3 = abstractC4394S4;
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new G.I(fVar, str, abstractC4326r3, abstractC4394S3, i10, i11, 28);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 7168) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i17 == 0) {
        }
        if ((i11 & 8) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(AbstractC0441z abstractC0441z, int i10, wf.k kVar, AbstractC4326r abstractC4326r, int i11, AbstractC1725n abstractC1725n, int i12, int i13) {
        int i14;
        AbstractC4326r abstractC4326r2;
        int i15;
        int i16;
        int i17;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        int i18;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object K10;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        AbstractC3557B.c0("<this>", abstractC0441z);
        AbstractC3557B.c0("onRatingChanged", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("StarRatingBar");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1433106567);
        if ((i13 & 1) != 0) {
            i14 = i12 | 48;
        } else if ((i12 & 112) == 0) {
            if (rVar.e(i10)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i14 = i22 | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 384;
        } else if ((i12 & 896) == 0) {
            if (rVar.i(kVar)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i14 |= i21;
        }
        int i23 = i13 & 4;
        if (i23 != 0) {
            i14 |= 3072;
        } else if ((i12 & 7168) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i20 = 2048;
            } else {
                i20 = 1024;
            }
            i14 |= i20;
            i15 = i13 & 8;
            if (i15 == 0) {
                i14 |= 24576;
            } else if ((i12 & 57344) == 0) {
                i16 = i11;
                if (rVar.e(i16)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i14 |= i19;
                if ((46801 & i14) != 9360 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    i17 = i16;
                } else {
                    if (i23 != 0) {
                        abstractC4326r4 = a5;
                    } else {
                        abstractC4326r4 = abstractC4326r2;
                    }
                    if (i15 != 0) {
                        i18 = 5;
                    } else {
                        i18 = i16;
                    }
                    C0421f c0421f = AbstractC0429m.f3907a;
                    C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
                    rVar.W(-1028402359);
                    if ((i14 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i14 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z14 = z11 | z10;
                    if ((i14 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z14 | z12;
                    K10 = rVar.K();
                    if (!z13 || K10 == C1723m.f22654Y) {
                        K10 = new C0837a0(kVar, i18, i10);
                        rVar.h0(K10);
                    }
                    rVar.t(false);
                    int i24 = i18;
                    AbstractC0539m.c(abstractC4326r4, null, null, false, g10, null, null, false, (wf.k) K10, rVar, (i14 >> 9) & 14, 238);
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        str = AbstractC4194d.u(rVar, -1028400748, R.string.gizmo_rating_no_stars, rVar, false);
                                    } else {
                                        str = AbstractC4194d.u(rVar, -1028400818, R.string.gizmo_rating_five_stars, rVar, false);
                                    }
                                } else {
                                    str = AbstractC4194d.u(rVar, -1028400885, R.string.gizmo_rating_four_stars, rVar, false);
                                }
                            } else {
                                str = AbstractC4194d.u(rVar, -1028400953, R.string.gizmo_rating_three_stars, rVar, false);
                            }
                        } else {
                            str = AbstractC4194d.u(rVar, -1028401019, R.string.gizmo_rating_two_stars, rVar, false);
                        }
                    } else {
                        str = AbstractC4194d.u(rVar, -1028401084, R.string.gizmo_rating_one_star, rVar, false);
                    }
                    j4.b(str, a5, 0L, 0L, null, null, null, 0L, null, new Y0.i(5), 0L, 0, false, 0, 0, null, ((p4) rVar.m(q4.f20361a)).f20309j, rVar, 0, 0, 65022);
                    abstractC4326r3 = abstractC4326r4;
                    i17 = i24;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C2619g(abstractC0441z, i10, kVar, abstractC4326r3, i17, i12, i13);
                    return;
                }
                return;
            }
            i16 = i11;
            if ((46801 & i14) != 9360) {
            }
            if (i23 != 0) {
            }
            if (i15 != 0) {
            }
            C0421f c0421f2 = AbstractC0429m.f3907a;
            C0426j g102 = AbstractC0429m.g(p9.r.f42840d);
            rVar.W(-1028402359);
            if ((i14 & 57344) == 16384) {
            }
            if ((i14 & 112) == 32) {
            }
            boolean z142 = z11 | z10;
            if ((i14 & 896) == 256) {
            }
            z13 = z142 | z12;
            K10 = rVar.K();
            if (!z13) {
            }
            K10 = new C0837a0(kVar, i18, i10);
            rVar.h0(K10);
            rVar.t(false);
            int i242 = i18;
            AbstractC0539m.c(abstractC4326r4, null, null, false, g102, null, null, false, (wf.k) K10, rVar, (i14 >> 9) & 14, 238);
            if (i10 != 1) {
            }
            j4.b(str, a5, 0L, 0L, null, null, null, 0L, null, new Y0.i(5), 0L, 0, false, 0, 0, null, ((p4) rVar.m(q4.f20361a)).f20309j, rVar, 0, 0, 65022);
            abstractC4326r3 = abstractC4326r4;
            i17 = i242;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i15 = i13 & 8;
        if (i15 == 0) {
        }
        i16 = i11;
        if ((46801 & i14) != 9360) {
        }
        if (i23 != 0) {
        }
        if (i15 != 0) {
        }
        C0421f c0421f22 = AbstractC0429m.f3907a;
        C0426j g1022 = AbstractC0429m.g(p9.r.f42840d);
        rVar.W(-1028402359);
        if ((i14 & 57344) == 16384) {
        }
        if ((i14 & 112) == 32) {
        }
        boolean z1422 = z11 | z10;
        if ((i14 & 896) == 256) {
        }
        z13 = z1422 | z12;
        K10 = rVar.K();
        if (!z13) {
        }
        K10 = new C0837a0(kVar, i18, i10);
        rVar.h0(K10);
        rVar.t(false);
        int i2422 = i18;
        AbstractC0539m.c(abstractC4326r4, null, null, false, g1022, null, null, false, (wf.k) K10, rVar, (i14 >> 9) & 14, 238);
        if (i10 != 1) {
        }
        j4.b(str, a5, 0L, 0L, null, null, null, 0L, null, new Y0.i(5), 0L, 0, false, 0, 0, null, ((p4) rVar.m(q4.f20361a)).f20309j, rVar, 0, 0, 65022);
        abstractC4326r3 = abstractC4326r4;
        i17 = i2422;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void u(Tc.f fVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("TemporaryConversationBanner");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(372975937);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            if (i15 != 0) {
                abstractC4326r = a5;
            }
            A7.b.k(R.a.q(((P0) rVar.m(R0.f19593a)).f19529m, Z0.f19875a), R4.b.X(rVar, 980065793, new C4771m(abstractC4326r, fVar, 1)), rVar, 48);
        }
        AbstractC4326r abstractC4326r2 = abstractC4326r;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C4774n(fVar, abstractC4326r2, i10, i11, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(Tc.f fVar, X0 x02, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        X0 x03;
        X0 x04;
        int i13;
        Object K10;
        boolean g10;
        Object K11;
        Object y02;
        int i14;
        AbstractC3557B.c0("appState", fVar);
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(832350040);
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
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 16;
        }
        if (i15 == 2 && (i12 & 91) == 18 && rVar.B()) {
            rVar.P();
            x03 = x02;
        } else {
            rVar.R();
            int i16 = i10 & 1;
            Object obj = C1723m.f22654Y;
            if (i16 != 0 && !rVar.A()) {
                rVar.P();
                if (i15 != 0) {
                    i12 &= -113;
                }
            } else if (i15 != 0) {
                rVar.W(-490350905);
                Context context = (Context) rVar.m(H0.Z.f6888b);
                boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                List list = (List) rVar.m(AbstractC3256b.f31580a);
                List list2 = (List) rVar.m(Ad.k.f814a);
                androidx.lifecycle.e0 a5 = m2.b.a(rVar);
                if (a5 != null) {
                    Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                    kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                    Object b10 = d10.b(X0.class);
                    Object b11 = d10.b(Q0.class);
                    rVar.W(608026872);
                    boolean g11 = rVar.g(b10) | rVar.g(b11) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                    Object K12 = rVar.K();
                    if (g11 || K12 == obj) {
                        if (booleanValue) {
                            y02 = AbstractC4344b.z0(d10.b(Q0.class), d10.b(X0.class), context, list2);
                        } else if (!booleanValue) {
                            y02 = AbstractC4344b.y0(d10.b(X0.class), a5, vVar, list);
                        } else {
                            throw new RuntimeException();
                        }
                        K12 = y02;
                        rVar.h0(K12);
                    }
                    rVar.t(false);
                    rVar.t(false);
                    i13 = i12 & (-113);
                    x04 = (X0) ((Ad.g) K12);
                    rVar.u();
                    p0.f fVar2 = (p0.f) rVar.m(AbstractC0701r0.f7003f);
                    rVar.W(-1411970640);
                    K10 = rVar.K();
                    if (K10 == obj) {
                        K10 = new p0.l();
                        rVar.h0(K10);
                    }
                    p0.l lVar = (p0.l) K10;
                    rVar.t(false);
                    AbstractC1734s.e(x04, new Jb.y(x04, fVar, fVar2, lVar, null), rVar);
                    Jb.z zVar = new Jb.z(x04, 2);
                    rVar.W(-1411969883);
                    g10 = rVar.g(zVar);
                    K11 = rVar.K();
                    if (!g10 || K11 == obj) {
                        K11 = new C5605e(zVar, 6);
                        rVar.h0(K11);
                    }
                    rVar.t(false);
                    Df.H.e(false, (AbstractC6216a) K11, rVar, 0, 1);
                    w(fVar, lVar, (Q0) AbstractC4828h.z(x04.f808e, rVar).getValue(), new nb.d(3, x04), new Jb.z(x04, 0), new Jb.z(x04, 1), zVar, rVar, 568 | (i13 & 14), 0);
                    x03 = x04;
                } else {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                }
            }
            x04 = x02;
            i13 = i12;
            rVar.u();
            p0.f fVar22 = (p0.f) rVar.m(AbstractC0701r0.f7003f);
            rVar.W(-1411970640);
            K10 = rVar.K();
            if (K10 == obj) {
            }
            p0.l lVar2 = (p0.l) K10;
            rVar.t(false);
            AbstractC1734s.e(x04, new Jb.y(x04, fVar, fVar22, lVar2, null), rVar);
            Jb.z zVar2 = new Jb.z(x04, 2);
            rVar.W(-1411969883);
            g10 = rVar.g(zVar2);
            K11 = rVar.K();
            if (!g10) {
            }
            K11 = new C5605e(zVar2, 6);
            rVar.h0(K11);
            rVar.t(false);
            Df.H.e(false, (AbstractC6216a) K11, rVar, 0, 1);
            w(fVar, lVar2, (Q0) AbstractC4828h.z(x04.f808e, rVar).getValue(), new nb.d(3, x04), new Jb.z(x04, 0), new Jb.z(x04, 1), zVar2, rVar, 568 | (i13 & 14), 0);
            x03 = x04;
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new F.o(fVar, x03, i10, i11, 23);
        }
    }

    public static final void w(Tc.f fVar, p0.l lVar, Q0 q02, wf.k kVar, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, AbstractC1725n abstractC1725n, int i10, int i11) {
        Jb.A a5;
        AbstractC4326r a10 = io.sentry.compose.b.a("VerifyPhoneScreenContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1620150573);
        if ((i11 & 32) != 0) {
            a5 = Jb.A.f8954Y;
        } else {
            a5 = abstractC6216a2;
        }
        Ad.l.c(fVar, a10, Ng.H.v(R.string.onboarding_verify_phone_title, rVar), null, null, abstractC6216a3, null, null, R4.b.X(rVar, 353216054, new r9.H(q02, lVar, kVar, abstractC6216a, a5)), rVar, (i10 & 14) | 100663304 | ((i10 >> 3) & 458752), 218);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6468f(fVar, lVar, q02, kVar, abstractC6216a, a5, abstractC6216a3, i10, i11);
        }
    }

    public static final void x(C6205s c6205s, AbstractC1725n abstractC1725n, int i10) {
        String str;
        Z.r rVar;
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-372340835);
        C0421f c0421f = AbstractC0429m.f3907a;
        C0426j g10 = AbstractC0429m.g(p9.r.f42841e);
        C4317i c4317i = C4310b.f37703p0;
        rVar2.W(693286680);
        E0.N a5 = E.p0.a(g10, c4317i, rVar2);
        rVar2.W(-1323940314);
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(c4323o);
        boolean z10 = rVar2.f22696a instanceof AbstractC1707e;
        if (z10) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            C0581j c0581j = C0583l.f5808f;
            U3.f.n0(rVar2, a5, c0581j);
            C0581j c0581j2 = C0583l.f5807e;
            U3.f.n0(rVar2, p10, c0581j2);
            C0581j c0581j3 = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                AbstractC6463a.q(i11, rVar2, i11, c0581j3);
            }
            AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
            Ad.l.x(c6205s.b(), c6205s.e(), androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42833d), null, 0L, rVar2, 0, 24);
            rVar2.W(-483455358);
            E0.N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
            rVar2.W(-1323940314);
            int i13 = rVar2.P;
            AbstractC1732q0 p11 = rVar2.p();
            C3288a i14 = androidx.compose.ui.layout.a.i(c4323o);
            if (z10) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                U3.f.n0(rVar2, a10, c0581j);
                U3.f.n0(rVar2, p11, c0581j2);
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                    AbstractC6463a.q(i13, rVar2, i13, c0581j3);
                }
                AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
                AbstractC4326r a11 = io.sentry.compose.b.a("DeactivatedAccountDisplay");
                C6189g c6189g = c6205s.f48457a;
                if (c6189g == null || (str = c6189g.f48413d) == null) {
                    str = c6205s.f48458b.f48354c;
                }
                m1 m1Var = q4.f20361a;
                j4.b(str, a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((p4) rVar2.m(m1Var)).f20306g, rVar2, 0, 3072, 57342);
                Integer O02 = Bi.c.O0(c6205s);
                rVar2.W(1642041997);
                if (O02 == null) {
                    rVar = rVar2;
                } else {
                    String v10 = Ng.H.v(O02.intValue(), rVar2);
                    N0.E e10 = ((p4) rVar2.m(m1Var)).f20309j;
                    AbstractC4326r y02 = K8.d.y0(c4323o, c6205s.d());
                    rVar = rVar2;
                    j4.b(v10, y02, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, e10, rVar, 0, 3072, 57340);
                }
                AbstractC6463a.v(rVar, false, false, true, false);
                AbstractC6463a.v(rVar, false, false, true, false);
                rVar.t(false);
                C1741v0 v11 = rVar.v();
                if (v11 != null) {
                    v11.f22739d = new C6675O(c6205s, i10, 13);
                    return;
                }
                return;
            }
            R4.b.r1();
            throw null;
        }
        R4.b.r1();
        throw null;
    }

    public static final void y(cc.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Z.r rVar;
        int i12;
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-515219610);
        if ((i10 & 14) == 0) {
            if (rVar2.g(nVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar2.B()) {
            rVar2.P();
            rVar = rVar2;
        } else {
            C0421f c0421f = AbstractC0429m.f3907a;
            C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
            rVar2.W(-483455358);
            E0.N a5 = AbstractC0440y.a(g10, C4310b.f37705r0, rVar2);
            rVar2.W(-1323940314);
            int i13 = rVar2.P;
            AbstractC1732q0 p10 = rVar2.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i14 = androidx.compose.ui.layout.a.i(c4323o);
            if (rVar2.f22696a instanceof AbstractC1707e) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                U3.f.n0(rVar2, a5, C0583l.f5808f);
                U3.f.n0(rVar2, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                    AbstractC6463a.q(i13, rVar2, i13, c0581j);
                }
                AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
                AbstractC4326r a10 = io.sentry.compose.b.a("DeactivatedNotice");
                rVar2.W(372789385);
                AbstractC3557B.c0("<this>", nVar);
                ArrayList<Number> N02 = AbstractC4344b.N0(Integer.valueOf((int) R.string.deactivated_account_history_unavailable_disclaimer), Integer.valueOf((int) R.string.deactivated_account_other_workspaces_disclaimer));
                if (nVar.b()) {
                    N02.add(Integer.valueOf((int) R.string.deactivated_account_personal_workspace_disclaimer));
                }
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(N02, 10));
                for (Number number : N02) {
                    arrayList.add(Ng.H.v(number.intValue(), rVar2));
                }
                rVar2.t(false);
                C1046e Q02 = K8.d.Q0(arrayList);
                String v10 = Ng.H.v(R.string.deactivated_account_team_deactivated_header, rVar2);
                m1 m1Var = q4.f20361a;
                j4.b(v10, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(m1Var)).f20306g, rVar2, 0, 0, 65534);
                rVar = rVar2;
                j4.c(Q02, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p4) rVar2.m(m1Var)).f20309j, rVar, 0, 0, 131070);
                AbstractC6463a.v(rVar, false, true, false, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v11 = rVar.v();
        if (v11 != null) {
            v11.f22739d = new C6675O(nVar, i10, 14);
        }
    }

    public static final void z(AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar;
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-218490657);
        if (i10 == 0 && rVar2.B()) {
            rVar2.P();
            rVar = rVar2;
        } else {
            C0421f c0421f = AbstractC0429m.f3907a;
            C0426j g10 = AbstractC0429m.g(p9.r.f42841e);
            C4317i c4317i = C4310b.f37703p0;
            rVar2.W(693286680);
            E0.N a5 = E.p0.a(g10, c4317i, rVar2);
            rVar2.W(-1323940314);
            int i11 = rVar2.P;
            AbstractC1732q0 p10 = rVar2.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i12 = androidx.compose.ui.layout.a.i(c4323o);
            boolean z10 = rVar2.f22696a instanceof AbstractC1707e;
            if (z10) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                C0581j c0581j = C0583l.f5808f;
                U3.f.n0(rVar2, a5, c0581j);
                C0581j c0581j2 = C0583l.f5807e;
                U3.f.n0(rVar2, p10, c0581j2);
                C0581j c0581j3 = C0583l.f5809g;
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                    AbstractC6463a.q(i11, rVar2, i11, c0581j3);
                }
                AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
                C5953f c5953f = Bi.c.f2429e;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.Work", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i13 = AbstractC5944H.f46870a;
                    r0.N n10 = new r0.N(r0.r.f44254b);
                    Wh.p pVar = new Wh.p(0);
                    pVar.p(20.0f, 6.0f);
                    pVar.m(-4.0f);
                    pVar.n(16.0f, 4.0f);
                    pVar.h(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                    pVar.m(-4.0f);
                    pVar.h(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
                    pVar.x(2.0f);
                    pVar.n(4.0f, 6.0f);
                    pVar.h(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
                    pVar.n(2.0f, 19.0f);
                    pVar.h(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                    pVar.m(16.0f);
                    pVar.h(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
                    pVar.n(22.0f, 8.0f);
                    pVar.h(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                    pVar.f();
                    pVar.p(14.0f, 6.0f);
                    pVar.m(-4.0f);
                    pVar.n(10.0f, 4.0f);
                    pVar.m(4.0f);
                    pVar.x(2.0f);
                    pVar.f();
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    Bi.c.f2429e = c5953f;
                }
                AbstractC1607r1.b(c5953f, null, Bi.c.I1(androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42833d), true, false), 0L, rVar2, 48, 8);
                rVar2.W(-483455358);
                E0.N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
                rVar2.W(-1323940314);
                int i14 = rVar2.P;
                AbstractC1732q0 p11 = rVar2.p();
                C3288a i15 = androidx.compose.ui.layout.a.i(c4323o);
                if (z10) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a10, c0581j);
                    U3.f.n0(rVar2, p11, c0581j2);
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar2, i14, c0581j3);
                    }
                    AbstractC6463a.r(0, i15, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("LoadingAccountDisplay");
                    String v10 = Ng.H.v(R.string.deactivated_account_placeholder_name, rVar2);
                    m1 m1Var = q4.f20361a;
                    G0.X x10 = (G0.X) a11;
                    j4.b(v10, AbstractC4194d.a(x10, Bi.c.I1(c4323o, true, false)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((p4) rVar2.m(m1Var)).f20306g, rVar2, 0, 3072, 57340);
                    j4.b(Ng.H.v(R.string.settings_account_deactivated, rVar2), AbstractC4194d.a(x10, Bi.c.I1(c4323o, true, false)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((p4) rVar2.m(m1Var)).f20309j, rVar2, 0, 3072, 57340);
                    rVar = rVar2;
                    AbstractC6463a.v(rVar, false, true, false, false);
                    AbstractC6463a.v(rVar, false, true, false, false);
                } else {
                    R4.b.r1();
                    throw null;
                }
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v11 = rVar.v();
        if (v11 != null) {
            v11.f22739d = new C1761f0(i10, 4);
        }
    }

    public f0 C() {
        AbstractC4344b.T(2, "expectedValuesPerKey");
        return new f0(this);
    }

    public abstract Map E();

    public abstract int I();

    public abstract boolean P();
}
