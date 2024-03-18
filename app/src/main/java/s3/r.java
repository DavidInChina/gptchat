package s3;

import Df.AbstractC0408g;
import E0.AbstractC0461u;
import F.C0535i;
import H0.W0;
import N0.C1045d;
import N0.C1046e;
import Z.AbstractC1706d0;
import Z.AbstractC1710f0;
import Z.S0;
import Z.l1;
import android.app.Activity;
import android.net.Uri;
import androidx.lifecycle.AbstractC2086v;
import b4.AbstractC2121b;
import cb.C2334C;
import cb.C2373n;
import com.openai.experiment.ExperimentKey;
import d4.AbstractC2598g;
import e4.C2793a;
import h.C3277c;
import h.C3287m;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n9.C4726e;
import na.B1;
import na.C4732E;
import na.C4751f0;
import na.C4780p;
import na.D0;
import na.D1;
import na.E0;
import p6.C5094b;
import p6.C5095c;
import q5.C5271a;
import qa.C5295e;
import t5.AbstractC5676b;
import ta.AbstractC5690F;
import ta.C5705d;
import ta.C5721u;
import wd.C6168C;
import wd.C6182c0;
import wd.C6189g;
import wd.C6205s;
import wd.EnumC6181c;
import wf.AbstractC6216a;
import x3.AbstractC6273c;
import x9.C6383b;
import ya.AbstractC6572t;
import ya.C6564l;
import ya.C6565m;
import z.C6678S;
import za.C6783B;
import za.C6795l;
import za.C6802s;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45333Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f45334Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f45335h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, int i10, Object obj2) {
        super(1);
        this.f45333Y = i10;
        this.f45334Z = obj;
        this.f45335h0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [Z.M, java.lang.Object] */
    public final Z.M a(Z.N n10) {
        androidx.lifecycle.S h10;
        int i10 = this.f45333Y;
        Object obj = this.f45335h0;
        Object obj2 = this.f45334Z;
        switch (i10) {
            case 1:
                C5545H c5545h = (C5545H) obj2;
                AbstractC2086v abstractC2086v = (AbstractC2086v) obj;
                c5545h.getClass();
                AbstractC3557B.c0("owner", abstractC2086v);
                if (!AbstractC3557B.K(abstractC2086v, c5545h.f45354o)) {
                    AbstractC2086v abstractC2086v2 = c5545h.f45354o;
                    C5564n c5564n = c5545h.f45358s;
                    if (abstractC2086v2 != null && (h10 = abstractC2086v2.h()) != null) {
                        h10.g(c5564n);
                    }
                    c5545h.f45354o = abstractC2086v;
                    abstractC2086v.h().a(c5564n);
                }
                return new Object();
            case 2:
                return new C6678S((l1) obj2, 9, (t3.i) obj);
            default:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                a7.d dVar = (a7.d) obj2;
                dVar.f23910f = (C3287m) obj;
                return new C3277c(10, dVar);
        }
    }

    public final Object c(B3.b bVar) {
        int i10 = this.f45333Y;
        Object obj = this.f45335h0;
        Object obj2 = this.f45334Z;
        switch (i10) {
            case 3:
                AbstractC3557B.c0("db", bVar);
                bVar.W((String) obj2, (Object[]) obj);
                return null;
            default:
                AbstractC3557B.c0("db", bVar);
                AbstractC6273c abstractC6273c = (AbstractC6273c) obj2;
                abstractC6273c.getClass();
                bVar.x(null);
                abstractC6273c.getClass();
                throw null;
        }
    }

    public final void e(int i10) {
        int i11 = this.f45333Y;
        Object obj = this.f45335h0;
        Object obj2 = this.f45334Z;
        switch (i11) {
            case 17:
                C1045d c1045d = (C1045d) kf.t.h2(((C1046e) obj2).a(i10, i10, "url"));
                if (c1045d != null) {
                    ((W0) obj).a((String) c1045d.f12508a);
                    return;
                }
                return;
            default:
                ((AbstractC6216a) obj2).mo122invoke();
                ((AbstractC6216a) obj).mo122invoke();
                return;
        }
    }

    public final void f(F.B b10) {
        int i10 = this.f45333Y;
        Object obj = this.f45335h0;
        Object obj2 = this.f45334Z;
        switch (i10) {
            case 18:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                H9.o oVar = (H9.o) obj2;
                E9.f.u(b10, oVar.f7535f.size(), new C6383b(5, oVar), new C3288a(new t3.s(oVar, 3, (wf.k) obj), true, 1538289408), 4);
                return;
            default:
                AbstractC3557B.c0("$this$LazyRow", b10);
                List K22 = kf.t.K2(((C6783B) obj2).f51762e.entrySet());
                C0535i c0535i = (C0535i) b10;
                c0535i.l0(K22.size(), new C4751f0(C5705d.f45914m0, K22, 2), new C4751f0(C5705d.f45915n0, K22, 3), new C3288a(new C5721u(K22, (wf.k) obj, 0), true, -632812321));
                return;
        }
    }

    public final void g(AbstractC2598g abstractC2598g) {
        int i10 = this.f45333Y;
        Object obj = this.f45335h0;
        Object obj2 = this.f45334Z;
        switch (i10) {
            case 11:
                AbstractC3557B.c0("$this$execute", abstractC2598g);
                abstractC2598g.b(0, ((C4726e) obj2).f39671b.f39672a.d(new C6168C((String) obj)));
                return;
            case 12:
                AbstractC3557B.c0("$this$execute", abstractC2598g);
                C4726e c4726e = (C4726e) obj2;
                n9.g gVar = (n9.g) obj;
                abstractC2598g.b(0, c4726e.f39671b.f39672a.d(new C6168C(gVar.f39674a)));
                abstractC2598g.b(1, c4726e.f39671b.f39673b.d(gVar.f39675b));
                return;
            case 13:
                AbstractC3557B.c0("$this$executeQuery", abstractC2598g);
                abstractC2598g.b(0, ((n9.n) obj2).f39693b.f39677b.d(new C6168C(((n9.j) obj).f39682b)));
                return;
            case 14:
                AbstractC3557B.c0("$this$execute", abstractC2598g);
                abstractC2598g.b(0, ((n9.n) obj2).f39693b.f39677b.d(new C6168C((String) obj)));
                return;
            default:
                AbstractC3557B.c0("$this$execute", abstractC2598g);
                n9.n nVar = (n9.n) obj2;
                n9.i iVar = (n9.i) obj;
                abstractC2598g.b(0, nVar.f39693b.f39676a.d(new C6182c0(iVar.f39679a)));
                n9.h hVar = nVar.f39693b;
                abstractC2598g.b(1, hVar.f39677b.d(new C6168C(iVar.f39680b)));
                abstractC2598g.b(2, hVar.f39678c.d(iVar.f39681c));
                return;
        }
    }

    public final void i(r5.d dVar) {
        int i10 = this.f45333Y;
        Object obj = this.f45335h0;
        Object obj2 = this.f45334Z;
        switch (i10) {
            case 6:
                AbstractC3557B.c0("it", dVar);
                Activity activity = (Activity) obj;
                ((C5094b) obj2).f42748Z.a(activity, activity.getWindow(), dVar);
                return;
            default:
                AbstractC3557B.c0("it", dVar);
                Activity activity2 = (Activity) obj;
                ((C5095c) obj2).f42749Z.a(activity2, activity2.getWindow(), dVar);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, s3.Y] */
    /* JADX WARN: Type inference failed for: r4v1, types: [s3.d, java.lang.Object] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        Object obj2;
        AbstractC0461u abstractC0461u;
        Set set;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f45333Y;
        Object obj3 = this.f45335h0;
        Object obj4 = this.f45334Z;
        switch (i10) {
            case 0:
                C5549L c5549l = (C5549L) obj;
                AbstractC3557B.c0("$this$navOptions", c5549l);
                C5552b c5552b = C5552b.f45286l0;
                ?? obj5 = new Object();
                obj5.f45293a = -1;
                obj5.f45294b = -1;
                c5552b.invoke(obj5);
                int i11 = obj5.f45293a;
                C5547J c5547j = c5549l.f45254a;
                c5547j.f45241a = i11;
                c5547j.f45242b = obj5.f45294b;
                c5547j.f45243c = -1;
                c5547j.f45244d = -1;
                AbstractC5540C abstractC5540C = (AbstractC5540C) obj4;
                if (abstractC5540C instanceof C5542E) {
                    int i12 = AbstractC5540C.f45214n0;
                    AbstractC5568s abstractC5568s = (AbstractC5568s) obj3;
                    Iterator it = B2.u.x(abstractC5540C).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC5540C abstractC5540C2 = (AbstractC5540C) it.next();
                            AbstractC5540C h10 = abstractC5568s.h();
                            if (AbstractC3557B.K(abstractC5540C2, h10 != null ? h10.f45216Z : null)) {
                            }
                        } else if (AbstractC5568s.f45336D) {
                            int i13 = C5542E.f45226s0;
                            int i14 = P5.c.y(abstractC5568s.j()).f45221l0;
                            C5552b c5552b2 = C5552b.f45287m0;
                            c5549l.f45257d = i14;
                            ?? obj6 = new Object();
                            c5552b2.invoke(obj6);
                            c5549l.f45258e = obj6.f45280a;
                        }
                    }
                }
                return yVar;
            case 1:
                return a((Z.N) obj);
            case 2:
                return a((Z.N) obj);
            case 3:
                return c((B3.b) obj);
            case 4:
                return c((B3.b) obj);
            case 5:
                AbstractC5676b abstractC5676b = (AbstractC5676b) obj;
                AbstractC3557B.c0("it", abstractC5676b);
                ((wf.n) obj4).invoke((C5271a) obj3, abstractC5676b);
                return yVar;
            case 6:
                i((r5.d) obj);
                return yVar;
            case 7:
                i((r5.d) obj);
                return yVar;
            case 8:
                return a((Z.N) obj);
            case 9:
                Map map = (Map) obj;
                AbstractC3557B.c0("permissionsResult", map);
                a7.d dVar = (a7.d) obj4;
                dVar.getClass();
                for (String str : map.keySet()) {
                    Iterator it2 = dVar.f23905a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (AbstractC3557B.K(((a7.g) obj2).f23916a, str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    a7.g gVar = (a7.g) obj2;
                    if (gVar != null && ((Boolean) map.get(str)) != null) {
                        gVar.c();
                    }
                }
                ((wf.k) obj3).invoke(map);
                return yVar;
            case 10:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 11:
                g((AbstractC2598g) obj);
                return yVar;
            case 12:
                g((AbstractC2598g) obj);
                return yVar;
            case 13:
                g((AbstractC2598g) obj);
                return yVar;
            case 14:
                g((AbstractC2598g) obj);
                return yVar;
            case 15:
                C2793a c2793a = (C2793a) obj;
                AbstractC3557B.c0("cursor", c2793a);
                n9.n nVar = (n9.n) obj3;
                AbstractC2121b abstractC2121b = nVar.f39693b.f39676a;
                String a5 = c2793a.a(0);
                AbstractC3557B.Z(a5);
                Object g10 = abstractC2121b.g(a5);
                n9.h hVar = nVar.f39693b;
                AbstractC2121b abstractC2121b2 = hVar.f39677b;
                String a10 = c2793a.a(1);
                AbstractC3557B.Z(a10);
                Object g11 = abstractC2121b2.g(a10);
                String a11 = c2793a.a(2);
                AbstractC3557B.Z(a11);
                return ((wf.o) obj4).invoke(g10, g11, hVar.f39678c.g(a11));
            case 16:
                g((AbstractC2598g) obj);
                return yVar;
            case 17:
                e(((Number) obj).intValue());
                return yVar;
            case 18:
                f((F.B) obj);
                return yVar;
            case 19:
                AbstractC3557B.c0("it", (AbstractC0461u) obj);
                ((S0) ((AbstractC1706d0) obj4)).i(((int) (abstractC0461u.j() & 4294967295L)) / ((Z0.b) obj3).b());
                return yVar;
            case 20:
                e(((Number) obj).intValue());
                return yVar;
            case 21:
                C2373n c2373n = (C2373n) obj;
                AbstractC3557B.c0("social", c2373n);
                C2334C c2334c = (C2334C) obj4;
                if (c2334c != null) {
                    ((wf.k) ((AbstractC0408g) obj3)).invoke(new na.S(c2334c, c2373n));
                }
                return yVar;
            case 22:
                Ed.m mVar = (Ed.m) obj;
                ((E0) obj4).j(C4732E.f39788a);
                if (mVar != null) {
                    ((AbstractC6572t) obj3).j(new C6564l(mVar));
                }
                return yVar;
            case 23:
                List list = (List) obj;
                AbstractC3557B.c0("feedbackReasons", list);
                AbstractC6572t abstractC6572t = (AbstractC6572t) obj4;
                Ed.m mVar2 = ((ya.x) obj3).f50885b;
                if (mVar2 != null) {
                    abstractC6572t.j(new C6565m(mVar2, list));
                    return yVar;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 24:
                String str2 = (String) obj;
                AbstractC3557B.c0("newName", str2);
                ((wf.k) ((AbstractC0408g) obj4)).invoke(new na.L(str2));
                float f6 = D0.f39745a;
                ((AbstractC1710f0) obj3).setValue(Boolean.FALSE);
                return yVar;
            case 25:
                D1 d12 = (D1) obj;
                AbstractC3557B.c0("$this$setState", d12);
                C6205s c6205s = (C6205s) obj4;
                C6189g c6189g = c6205s.f48457a;
                return D1.e(d12, c6205s.f48458b, c6189g, null, null, null, null, null, null, null, null, null, null, null, false, ((com.openai.experiment.G) ((B1) obj3).f39709j).c(ExperimentKey.ShareButtonEnabled.INSTANCE) && !c6205s.e(), false, null, false, false, false, null, C4780p.a(d12.f39785x, (c6189g == null || (set = c6189g.f48415f) == null) ? false : set.contains(EnumC6181c.f48387j0), null, null, false, false, 30), null, false, false, false, null, false, null, false, null, -8454151, 63);
            case 26:
                AbstractC3557B.c0("$this$setState", (C5295e) obj);
                return R4.a.V(((C6205s) obj4).f48457a, (p9.s) obj3);
            case 27:
                f((F.B) obj);
                return yVar;
            case 28:
                Aa.c cVar = (Aa.c) obj;
                AbstractC3557B.c0("it", cVar);
                ((wf.k) ((AbstractC0408g) obj4)).invoke(new C6795l(((Aa.e) ((Aa.f) obj3)).f735a, cVar));
                return yVar;
            default:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
        }
    }

    public final void invoke(boolean z10) {
        Uri uri;
        int i10 = this.f45333Y;
        Object obj = this.f45335h0;
        Object obj2 = this.f45334Z;
        switch (i10) {
            case 10:
                ((a7.g) obj2).c();
                ((wf.k) obj).invoke(Boolean.valueOf(z10));
                return;
            default:
                wf.k kVar = (wf.k) ((AbstractC0408g) obj2);
                if (z10) {
                    float f6 = AbstractC5690F.f45817a;
                    uri = (Uri) ((l1) obj).getValue();
                } else {
                    uri = null;
                }
                kVar.invoke(new C6802s(uri));
                return;
        }
    }
}
