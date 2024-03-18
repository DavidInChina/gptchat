package Ra;

import A.C0046u0;
import Cb.C0293c;
import Cd.L;
import Cd.M;
import Cd.N;
import Cd.O;
import Cd.Q;
import Cd.V;
import Cd.W;
import Dd.C0398t;
import Df.H;
import F.B;
import F.C0535i;
import H0.AbstractC0696o0;
import H0.C0689l;
import Kd.C0833i;
import Kd.C0834j;
import Kd.C0835k;
import Mb.G;
import Mb.S;
import N0.C1046e;
import Rb.C1265k;
import Rb.C1272s;
import Rb.C1278y;
import T0.z;
import V1.AbstractComponentCallbacksC1480v;
import V1.C1460a;
import V1.K;
import Yg.v;
import Z.AbstractC1706d0;
import Z.S0;
import ab.AbstractC1953g;
import ab.C1952f;
import ab.C1965s;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Path;
import android.graphics.Rect;
import bb.l0;
import bb.m0;
import bc.C2187b;
import ca.AbstractC2313e;
import ca.C2317i;
import ca.C2326r;
import ca.C2328t;
import cb.C2332A;
import cb.C2334C;
import cb.C2350T;
import cb.C2379t;
import dc.C2620a;
import dc.C2623d;
import ec.AbstractC2853e;
import ec.C2851c;
import ec.C2873y;
import fa.AbstractC2965B;
import fa.C2976e;
import fa.C2979h;
import fb.AbstractC2992k;
import fb.C2990i;
import fb.C2996o;
import gb.C3234k;
import gb.C3235l;
import gb.b0;
import gb.o0;
import h0.C3288a;
import ha.C3370m;
import hc.C3403s;
import ic.C3537g;
import ic.P;
import id.AbstractC3557B;
import id.C3556A;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import jf.y;
import kb.AbstractC4215I;
import kf.AbstractC4268D;
import kf.w;
import l8.AbstractC4344b;
import m0.C4543a;
import na.C4751f0;
import q0.C5252d;
import q0.C5254f;
import q1.AbstractC5260f;
import r0.C5344h;
import r0.E;
import rc.C5463l;
import rc.C5472v;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5653l;
import t0.C5654m;
import t9.AbstractC5684a;
import ta.C5721u;
import te.C5760d;
import uc.C5885c;
import uc.C5900r;
import ue.C5906a;
import wa.C6154f;
import wd.AbstractC6211y;
import wd.C6174I;
import wd.C6189g;
import wd.C6195j;
import wd.C6200m;
import wd.C6205s;
import wd.U;
import wd.X;
import wd.Y;
import wd.n0;
import wd.u0;
import wd.v0;
import wf.AbstractC6216a;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6405J;
import xe.C6425n;
import xe.C6431t;
import xe.C6433v;
import y.C6471i;
import yf.AbstractC6583a;
import za.AbstractC6790g;
import za.C6784a;
import za.C6786c;
import za.C6788e;
import za.C6807x;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15218Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f15219Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f15220h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, int i10, Object obj2) {
        super(1);
        this.f15218Y = i10;
        this.f15219Z = obj;
        this.f15220h0 = obj2;
    }

    public final void a(B b10) {
        List<Wa.m> list;
        C2379t c2379t;
        List list2;
        Object obj;
        String str;
        boolean z10;
        int i10 = this.f15218Y;
        int i11 = 12;
        Object obj2 = this.f15220h0;
        Object obj3 = this.f15219Z;
        switch (i10) {
            case 2:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                C1965s c1965s = (C1965s) obj3;
                E9.f.t(b10, null, new C3288a(new C6471i(12, c1965s), true, -616567418), 3);
                if (c1965s.f24124a) {
                    E9.f.t(b10, null, AbstractC1953g.f24093b, 3);
                    return;
                }
                Wa.j jVar = c1965s.f24127d;
                if (jVar != null && (list = jVar.f20853a) != null) {
                    wf.k kVar = (wf.k) obj2;
                    for (Wa.m mVar : list) {
                        C2334C c2334c = c1965s.f24126c;
                        if (c2334c != null && (list2 = c2334c.f26459v) != null) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    C2332A c2332a = ((C2379t) obj).f26551c;
                                    if (c2332a != null) {
                                        str = c2332a.f26424a;
                                    } else {
                                        str = null;
                                    }
                                    if (AbstractC3557B.K(str, mVar.f20857a)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            c2379t = (C2379t) obj;
                        } else {
                            c2379t = null;
                        }
                        E9.f.t(b10, null, new C3288a(new C0046u0(c2379t, i11, kVar), true, -644811430), 3);
                        Map map = mVar.f20860d;
                        if (map == null) {
                            map = w.f37484Y;
                        }
                        List K22 = kf.t.K2(map.entrySet());
                        ((C0535i) b10).l0(K22.size(), null, new C4751f0(C1952f.f24088Z, K22, 9), new C3288a(new C6154f(K22, mVar, c2379t, kVar, 1), true, -632812321));
                        i11 = 12;
                    }
                    return;
                }
                return;
            case 4:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                List list3 = ((C2996o) obj3).f30105a;
                ((C0535i) b10).l0(list3.size(), new C4751f0(C2990i.f30095Z, list3, 12), new C4751f0(C2990i.f30096h0, list3, 13), new C3288a(new t3.s(list3, 4, (AbstractC2992k) obj2), true, -632812321));
                return;
            case 16:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                xd.e eVar = (xd.e) obj3;
                E9.f.t(b10, null, new C3288a(new C6471i(20, eVar), true, -1021581822), 3);
                List list4 = eVar.f49810b;
                ((C0535i) b10).l0(list4.size(), null, new C4751f0(C2187b.f25931Z, list4, 15), new C3288a(new d9.i(list4, (wf.k) obj2, eVar, 5), true, -632812321));
                return;
            case 18:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                dc.h hVar = (dc.h) obj2;
                for (C2620a c2620a : ((dc.g) obj3).f28205a) {
                    E9.f.t(b10, null, new C3288a(new C0046u0(c2620a, 22, hVar), true, -1724293608), 3);
                    E9.f.t(b10, null, new C3288a(new C6471i(22, c2620a), true, 958255937), 3);
                }
                return;
            case 19:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                C2873y c2873y = (C2873y) obj3;
                boolean z11 = c2873y.f29272g;
                C6189g c6189g = c2873y.f29271f;
                boolean z12 = false;
                if (z11) {
                    if (c6189g != null && c6189g.b()) {
                        E9.f.t(b10, "training", AbstractC2853e.f29212b, 2);
                    } else {
                        E9.f.t(b10, "training", new C3288a(new C2851c(c2873y, (wf.k) obj2, 0), true, 262127036), 2);
                    }
                } else {
                    E9.f.t(b10, "history", new C3288a(new C2851c(c2873y, (wf.k) obj2, 1), true, 64315681), 2);
                    if (c6189g != null && c6189g.b()) {
                        E9.f.t(b10, "training", AbstractC2853e.f29213c, 2);
                    }
                }
                Boolean bool = c2873y.f29273h;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    zd.n nVar = c2873y.f29266a;
                    if (nVar != null && nVar.f51982a) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                if (c2873y.f29275j != null || (z10 && c2873y.f29274i)) {
                    E9.f.t(b10, "voice", new C3288a(new C2851c(c2873y, (wf.k) obj2, 2), true, -409546033), 2);
                }
                wf.k kVar2 = (wf.k) obj2;
                E9.f.t(b10, "archive", new C3288a(new C2851c(c2873y, kVar2, 3), true, 48177021), 2);
                E9.f.t(b10, SDPKeywords.CLEAR, new C3288a(new C2851c(c2873y, kVar2, 4), true, 1494332404), 2);
                if (c6189g != null && c6189g.b()) {
                    z12 = true;
                }
                if (!z12) {
                    E9.f.t(b10, "account", AbstractC2853e.f29214d, 2);
                    E9.f.t(b10, "export", new C3288a(new C2851c(c2873y, kVar2, 5), true, 1605000583), 2);
                    E9.f.t(b10, "delete", new C3288a(new C2851c(c2873y, kVar2, 6), true, -1547619128), 2);
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                ArrayList arrayList = ((P) obj3).f32969i;
                ((C0535i) b10).l0(arrayList.size(), null, new C4751f0(C3537g.f33030Z, arrayList, 18), new C3288a(new C5721u(arrayList, (wf.k) obj2, 3), true, -632812321));
                return;
        }
    }

    public final void c(C6405J c6405j) {
        String str;
        int i10 = this.f15218Y;
        Object obj = this.f15220h0;
        Object obj2 = this.f15219Z;
        switch (i10) {
            case 1:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{"user_action_settings"});
                R4.b.L1((C5760d) obj2, "gizmo_id", (String) obj);
                return;
            default:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{"reasons"});
                C1272s c1272s = (C1272s) obj;
                ((Tb.d) obj2).getClass();
                if (c1272s.f15368a != null) {
                    str = "gizmo";
                } else if (c1272s.f15369b != null) {
                    str = "conversation";
                } else if (c1272s.f15370c != null) {
                    str = "share_link";
                } else {
                    throw new IllegalArgumentException("Invalid report content id");
                }
                P4.a.n(c6405j, new String[]{str});
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0352  */
    /* JADX WARN: Type inference failed for: r3v67, types: [byte[], java.io.Serializable] */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        U u10;
        boolean K10;
        U u11;
        boolean z10;
        C0293c c0293c;
        C2620a c2620a;
        boolean z11;
        boolean z12;
        Object obj2;
        String str;
        U3.f fVar;
        U3.f fVar2;
        y yVar = y.f36177a;
        int i10 = this.f15218Y;
        int i11 = 0;
        boolean z13 = true;
        String str2 = null;
        Object obj3 = this.f15220h0;
        Object obj4 = this.f15219Z;
        switch (i10) {
            case 0:
                k kVar = (k) obj;
                AbstractC3557B.c0("$this$setState", kVar);
                s sVar = (s) ((u0) ((v0) obj4)).f48468a;
                return k.e(kVar, sVar.f15242b, sVar.f15241a, (C3556A) obj3, 1);
            case 1:
                c((C6405J) obj);
                return yVar;
            case 2:
                a((B) obj);
                return yVar;
            case 3:
                m0 m0Var = (m0) obj;
                AbstractC3557B.c0("$this$setState", m0Var);
                return m0.e(m0Var, null, null, null, new l0((String) obj4, Bi.c.K1((C2350T) obj3)), 7);
            case 4:
                a((B) obj);
                return yVar;
            case 5:
                invoke((String) obj);
                return yVar;
            case 6:
                C3235l c3235l = (C3235l) obj;
                AbstractC3557B.c0("image", c3235l);
                List<Y> list = ((C2979h) ((AbstractC2965B) obj4)).f30064b;
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (Y y10 : list) {
                    String str3 = y10.f48372a;
                    X x10 = y10.f48376e;
                    arrayList.add(new C3234k(str3, (x10 == null || (u10 = x10.f48371a) == null) ? null : u10.f48367a));
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                    } else if (!AbstractC3557B.K(((C3234k) it.next()).f31470a, c3235l.f31474c)) {
                        i11++;
                    }
                }
                ((wf.k) obj3).invoke(new b0(i11, arrayList));
                return yVar;
            case 7:
                AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
                AbstractC3557B.c0("$this$Canvas", abstractC5650i);
                E e10 = (E) obj4;
                float f6 = AbstractC4215I.f37241a;
                AbstractC3557B.c0("trianglePath", e10);
                float R10 = abstractC5650i.R(p9.r.f42839c);
                C5344h c5344h = (C5344h) e10;
                Path path = c5344h.f44241a;
                path.rewind();
                float f10 = 2;
                path.moveTo(C5254f.d(abstractC5650i.g()) / f10, C5254f.b(abstractC5650i.g()) - R10);
                c5344h.b(C5254f.d(abstractC5650i.g()) - R10, R10);
                c5344h.b(R10, R10);
                path.close();
                long j6 = r0.r.f44258f;
                AbstractC5648g.i(abstractC5650i, e10, r0.r.b(j6, 0.8f), 0.0f, C5653l.f45622a, 52);
                float f11 = AbstractC4215I.f37244d;
                C5654m c5654m = new C5654m(abstractC5650i.R(f11), 0.0f, 0, 0, 30);
                long j10 = AbstractC4215I.f37245e;
                AbstractC5648g.i(abstractC5650i, e10, j10, 0.0f, c5654m, 52);
                long r10 = R4.b.r(C5254f.d(abstractC5650i.g()) / f10, (1 - ((S0) ((AbstractC1706d0) obj3)).h()) * C5254f.b(abstractC5650i.g()));
                float f12 = AbstractC4215I.f37243c;
                AbstractC5648g.c(abstractC5650i, j6, abstractC5650i.R(f12), r10, null, 120);
                AbstractC5648g.c(abstractC5650i, j10, abstractC5650i.R(f12), r10, new C5654m(abstractC5650i.R(f11), 0.0f, 0, 0, 30), 104);
                return yVar;
            case 8:
                gb.l0 l0Var = (gb.l0) obj;
                AbstractC3557B.c0("$this$setState", l0Var);
                return gb.l0.e(l0Var, null, false, null, new o0((String) obj4, (C3370m) obj3), 47);
            case 9:
                C6807x c6807x = (C6807x) obj;
                AbstractC3557B.c0("$this$update", c6807x);
                String str4 = (String) obj4;
                Map map = c6807x.f51805b;
                if (!map.isEmpty()) {
                    Iterator it2 = map.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AbstractC6790g abstractC6790g = ((C6786c) ((Map.Entry) it2.next()).getValue()).f51784b;
                            if (abstractC6790g instanceof C6788e) {
                                AbstractC6211y abstractC6211y = ((C6788e) abstractC6790g).f51786a;
                                if (abstractC6211y instanceof C6174I) {
                                    K10 = AbstractC3557B.K(((C6174I) abstractC6211y).f48345d, str4);
                                } else if (!(abstractC6211y instanceof Y)) {
                                    continue;
                                } else {
                                    X x11 = ((Y) abstractC6211y).f48376e;
                                    K10 = AbstractC3557B.K((x11 == null || (u11 = x11.f48371a) == null) ? null : u11.f48367a, str4);
                                }
                                if (K10) {
                                    map = w.f37484Y;
                                }
                            }
                        }
                    }
                }
                return C6807x.a(c6807x, null, map, null, true, (C6784a) obj3, 5);
            case 10:
                tb.h hVar = (tb.h) obj;
                AbstractC3557B.c0("$this$setState", hVar);
                return new tb.h(AbstractC4268D.g1(hVar.f46059a, new C3959i((tb.g) obj3, (v0) obj4)));
            case 11:
                p0.o oVar = (p0.o) obj;
                AbstractC3557B.c0("focusState", oVar);
                m0.c cVar = (m0.c) obj4;
                if (cVar != null) {
                    m0.h hVar2 = (m0.h) obj3;
                    if (((p0.p) oVar).a()) {
                        C4543a c4543a = (C4543a) cVar;
                        C5252d c5252d = hVar2.f38809b;
                        if (c5252d != null) {
                            c4543a.f38801c.notifyViewEntered(c4543a.f38799a, hVar2.f38811d, new Rect(AbstractC4344b.Y0(c5252d.f43625a), AbstractC4344b.Y0(c5252d.f43626b), AbstractC4344b.Y0(c5252d.f43627c), AbstractC4344b.Y0(c5252d.f43628d)));
                        } else {
                            throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
                        }
                    } else {
                        C4543a c4543a2 = (C4543a) cVar;
                        c4543a2.f38801c.notifyViewExited(c4543a2.f38799a, hVar2.f38811d);
                    }
                }
                return yVar;
            case 12:
                Gb.a aVar = (Gb.a) obj;
                AbstractC3557B.c0("$this$AndroidViewBinding", aVar);
                K k10 = (K) obj4;
                k10.getClass();
                C1460a c1460a = new C1460a(k10);
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) obj3;
                int id2 = aVar.f6259b.getId();
                if (id2 != 0) {
                    c1460a.e(id2, abstractComponentCallbacksC1480v, null, 2);
                    c1460a.d(true);
                    return yVar;
                }
                throw new IllegalArgumentException("Must use non-zero containerViewId");
            case 13:
                G g10 = (G) obj;
                AbstractC3557B.c0("$this$setState", g10);
                S s10 = (S) obj4;
                Cb.Y y11 = (Cb.Y) obj3;
                s10.getClass();
                Yg.p pVar = y11.f2924f;
                if (pVar != null) {
                    Yg.p a5 = ((Yg.a) s10.f11838m).a();
                    Yg.r rVar = AbstractC5684a.f45797a;
                    Yg.w.Companion.getClass();
                    if (P4.a.M0(a5, v.a()).f22423Y.getHour() - P4.a.M0(pVar, v.a()).f22423Y.getHour() < 12) {
                        z10 = true;
                        c0293c = y11.f2921c;
                        String str5 = c0293c == null ? c0293c.f2931a : null;
                        String str6 = c0293c == null ? c0293c.f2932b : null;
                        if (c0293c != null) {
                            str2 = c0293c.f2933c;
                        }
                        String str7 = str2;
                        if (c0293c != null || (r1 = c0293c.f2934d) == null) {
                            Fb.f fVar3 = g10.f11783f;
                        }
                        return G.e(g10, str5, str6, null, str7, null, fVar3, null, z10, false, false, false, false, 3924);
                    }
                }
                z10 = false;
                c0293c = y11.f2921c;
                if (c0293c == null) {
                }
                if (c0293c == null) {
                }
                if (c0293c != null) {
                }
                String str72 = str2;
                if (c0293c != null) {
                }
                Fb.f fVar32 = g10.f11783f;
                return G.e(g10, str5, str6, null, str72, null, fVar32, null, z10, false, false, false, false, 3924);
            case 14:
                invoke((String) obj);
                return yVar;
            case 15:
                c((C6405J) obj);
                return yVar;
            case 16:
                a((B) obj);
                return yVar;
            case 17:
                ((Boolean) obj).getClass();
                ((C2620a) obj3).getClass();
                ((dc.h) obj4).j(new C2623d(!c2620a.f28200a));
                return yVar;
            case 18:
                a((B) obj);
                return yVar;
            case 19:
                a((B) obj);
                return yVar;
            case 20:
                C3403s c3403s = (C3403s) obj;
                AbstractC3557B.c0("$this$setState", c3403s);
                return C3403s.e(c3403s, null, z.b((z) obj4, (String) obj3), false, false, 27);
            case 21:
                a((B) obj);
                return yVar;
            case 22:
                nc.s sVar2 = (nc.s) obj;
                AbstractC3557B.c0("$this$setState", sVar2);
                T9.c cVar2 = (T9.c) obj4;
                String str8 = cVar2.f16970e;
                List list2 = cVar2.f16971f;
                ArrayList b10 = T9.b.b(list2);
                ((oc.k) obj3).getClass();
                if (!b10.isEmpty()) {
                    Iterator it3 = b10.iterator();
                    while (it3.hasNext()) {
                        AbstractC2313e abstractC2313e = (AbstractC2313e) it3.next();
                        if ((abstractC2313e.c().f30015h instanceof fa.q) || (abstractC2313e.c().f30015h instanceof C2976e) || (abstractC2313e.c().f30015h instanceof C2979h) || ((((z12 = abstractC2313e instanceof C2317i)) && (((C2317i) abstractC2313e).f26395d instanceof C2326r)) || (z12 && (((C2317i) abstractC2313e).f26395d instanceof C2328t)))) {
                            z11 = true;
                            return nc.s.e(sVar2, null, str8, z11, list2, null, null, null, false, null, false, 1009);
                        }
                    }
                }
                z11 = false;
                return nc.s.e(sVar2, null, str8, z11, list2, null, null, null, false, null, false, 1009);
            case 23:
                AbstractC3557B.c0("$this$setState", (pc.m0) obj);
                return new pc.l0((List) ((n0) ((wd.o0) obj4)).f48446a, null, null, (pc.S) obj3);
            case 24:
                C6200m c6200m = (C6200m) obj;
                C6189g c6189g = (C6189g) obj4;
                if (c6189g == null) {
                    return c6200m;
                }
                ((C5463l) obj3).getClass();
                String str9 = c6189g.f48410a;
                C3959i c3959i = new C3959i(new C6195j(str9), c6189g);
                C6200m.Companion.getClass();
                return new C6200m(AbstractC4344b.F0(new C6195j(str9)), AbstractC4268D.a1(c3959i, new C3959i(new C6195j(C6200m.f48440d), c6189g)));
            case 25:
                xd.e eVar = (xd.e) obj;
                if (eVar == null) {
                    return null;
                }
                String str10 = (String) obj3;
                Iterator it4 = eVar.f49810b.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        String a10 = ((C6205s) obj2).a();
                        if (a10 != null && AbstractC3557B.K(a10, str10)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                C6205s c6205s = (C6205s) obj2;
                if (c6205s == null || (str = c6205s.a()) == null) {
                    Object value = ((C5472v) obj4).f44938h.getValue();
                    if (value == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    str = ((C6195j) value).f48426a;
                }
                return xd.e.a(eVar, str, null, 2);
            case 26:
                C5885c c5885c = (C5885c) obj;
                AbstractC3557B.c0("it", c5885c);
                ((C5900r) obj4).getClass();
                return C5885c.a(c5885c, AbstractC4268D.k1(new ArrayList()), null, 2);
            case 27:
                Cd.X x12 = (Cd.X) obj;
                AbstractC3557B.c0("$this$setState", x12);
                Kd.m mVar = (Kd.m) obj4;
                C0398t c0398t = (C0398t) obj3;
                AbstractC3557B.c0("connectionState", mVar);
                AbstractC3557B.c0("remoteState", c0398t);
                if (AbstractC3557B.K(mVar, C0835k.f9748a)) {
                    fVar2 = M.f3017g;
                } else if (!AbstractC3557B.K(mVar, Kd.l.f9749a)) {
                    boolean K11 = AbstractC3557B.K(mVar, C0834j.f9747a);
                    fVar = L.f3016g;
                    if (!K11) {
                        if (mVar instanceof C0833i) {
                            switch (c0398t.f3573a.ordinal()) {
                                case 0:
                                    break;
                                case 1:
                                    fVar2 = Cd.K.f3015g;
                                    break;
                                case 2:
                                    fVar2 = O.f3019g;
                                    break;
                                case 3:
                                    fVar2 = Q.f3021g;
                                    break;
                                case 4:
                                    Double d10 = c0398t.f3574b;
                                    if (d10 != null) {
                                        Mg.a aVar2 = Mg.b.f12127Z;
                                        fVar = new Cd.S(H.w0(d10.doubleValue(), Mg.d.f12134i0));
                                        break;
                                    } else {
                                        fVar = Cd.P.f3020g;
                                        break;
                                    }
                                case 5:
                                    fVar2 = W.f3025g;
                                    break;
                                case 6:
                                    fVar2 = V.f3024g;
                                    break;
                                default:
                                    throw new RuntimeException();
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    if ((mVar instanceof C0833i) || !((C0833i) mVar).f9746a) {
                        z13 = false;
                    }
                    return Cd.X.e(x12, null, fVar, z13, false, false, false, null, null, Hd.b.e(x12.f3038m, null, null, null, null, null, null, null, mVar, c0398t.f3573a, 0L, 0L, null, null, null, null, null, null, null, null, null, 8388223), 4085);
                } else {
                    fVar2 = N.f3018g;
                }
                fVar = fVar2;
                if (mVar instanceof C0833i) {
                }
                z13 = false;
                return Cd.X.e(x12, null, fVar, z13, false, false, false, null, null, Hd.b.e(x12.f3038m, null, null, null, null, null, null, null, mVar, c0398t.f3573a, 0L, 0L, null, null, null, null, null, null, null, null, null, 8388223), 4085);
            case 28:
                Id.l lVar = (Id.l) obj;
                AbstractC3557B.c0("$this$setState", lVar);
                String str11 = (String) obj4;
                Ed.i.Companion.getClass();
                return Id.l.e(lVar, Ed.h.b(str11), Ed.h.a(str11), (Ed.i) obj3, false, 8);
            default:
                C5906a c5906a = (C5906a) obj;
                AbstractC3557B.c0("$this$formData", c5906a);
                Ec.o oVar2 = (Ec.o) obj4;
                Ec.o.f4626h0.getClass();
                AbstractC3557B.c0("<this>", oVar2);
                if (oVar2 != Ec.o.f4627i0) {
                    str2 = oVar2.f4631Y;
                }
                ArrayList arrayList2 = c5906a.f46713a;
                if (str2 != null) {
                    AbstractC6432u.f49955a.getClass();
                    arrayList2.add(new ue.e("language", str2, C6425n.f49943c));
                }
                ?? K12 = AbstractC5260f.K((File) obj3);
                C6431t c6431t = AbstractC6432u.f49955a;
                C6433v c6433v = new C6433v();
                List list3 = AbstractC6435x.f49956a;
                c6433v.f(SIPHeaderNames.CONTENT_TYPE, "audio/m4a");
                c6433v.f(SIPHeaderNames.CONTENT_DISPOSITION, "filename=\"audio.m4a\"");
                arrayList2.add(new ue.e("file", K12, c6433v.n()));
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tb.g gVar, v0 v0Var) {
        super(1);
        this.f15218Y = 10;
        this.f15220h0 = gVar;
        this.f15219Z = v0Var;
    }

    public final void invoke(String str) {
        int i10 = this.f15218Y;
        Object obj = this.f15220h0;
        Object obj2 = this.f15219Z;
        switch (i10) {
            case 5:
                AbstractC3557B.c0("formula", str);
                ((C0689l) ((AbstractC0696o0) obj2)).a(new C1046e(str, null, 6));
                ((AbstractC6216a) obj).mo122invoke();
                return;
            default:
                AbstractC3557B.c0("it", str);
                ((wf.k) obj2).invoke(new C1278y((C1265k) obj, str));
                return;
        }
    }
}
