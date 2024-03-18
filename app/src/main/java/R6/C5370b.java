package r6;

import K4.J;
import M3.H;
import N.D;
import android.app.Activity;
import android.os.Handler;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import g.RunnableC3111d;
import i6.h;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.C4191a;
import k6.C4192b;
import kf.AbstractC4268D;
import kf.v;
import kf.w;
import m6.C4564c;
import o6.C;
import o6.C4920A;
import o6.C4921B;
import o6.C4928g;
import o6.C4930i;
import o6.C4931j;
import o6.C4932k;
import o6.C4933l;
import o6.C4936o;
import o6.C4937p;
import o6.C4939s;
import o6.C4941u;
import o6.C4942v;
import o6.C4945y;
import o6.E;
import o6.F;
import o6.G;
import o6.r;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import t5.AbstractC5675a;
import u5.RunnableC5841a;
import w6.m;

/* renamed from: r6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5370b implements i6.f, AbstractC5369a {

    /* renamed from: j  reason: collision with root package name */
    public static final long f44443j = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f44444k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final u5.g f44445a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5675a f44446b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f44447c;

    /* renamed from: d  reason: collision with root package name */
    public final A6.c f44448d;

    /* renamed from: e  reason: collision with root package name */
    public final C4192b f44449e;

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f44450f;

    /* renamed from: g  reason: collision with root package name */
    public final C4928g f44451g;

    /* renamed from: h  reason: collision with root package name */
    public final RunnableC3111d f44452h;

    /* renamed from: i  reason: collision with root package name */
    public final ConcurrentHashMap f44453i = new ConcurrentHashMap();

    public C5370b(String str, u5.g gVar, float f6, boolean z10, boolean z11, AbstractC5675a abstractC5675a, Handler handler, A6.c cVar, D5.a aVar, m mVar, m mVar2, m mVar3, h hVar) {
        C4192b c4192b = new C4192b();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC3557B.b0("newSingleThreadExecutor()", newSingleThreadExecutor);
        AbstractC3557B.c0("applicationId", str);
        AbstractC3557B.c0("writer", abstractC5675a);
        AbstractC3557B.c0("firstPartyHostHeaderTypeResolver", aVar);
        AbstractC3557B.c0("cpuVitalMonitor", mVar);
        AbstractC3557B.c0("memoryVitalMonitor", mVar2);
        AbstractC3557B.c0("frameRateVitalMonitor", mVar3);
        AbstractC3557B.c0("sessionListener", hVar);
        this.f44445a = gVar;
        this.f44446b = abstractC5675a;
        this.f44447c = handler;
        this.f44448d = cVar;
        this.f44449e = c4192b;
        this.f44450f = newSingleThreadExecutor;
        this.f44451g = new C4928g(str, gVar, f6, z10, z11, aVar, mVar, mVar2, mVar3, new C4191a(hVar, cVar));
        RunnableC3111d runnableC3111d = new RunnableC3111d(29, this);
        this.f44452h = runnableC3111d;
        handler.postDelayed(runnableC3111d, f44443j);
        new AtomicBoolean(false);
    }

    public static C4564c c(Map map) {
        Long l10;
        Object obj = map.get("_dd.timestamp");
        if (obj instanceof Long) {
            l10 = (Long) obj;
        } else {
            l10 = null;
        }
        if (l10 != null) {
            long longValue = l10.longValue();
            long currentTimeMillis = System.currentTimeMillis();
            return new C4564c(longValue, TimeUnit.MILLISECONDS.toNanos(longValue - currentTimeMillis) + System.nanoTime());
        }
        return new C4564c();
    }

    public final void a(String str, r.f fVar) {
        AbstractC3557B.c0("event", fVar);
        if (fVar instanceof c) {
            d(new C4930i(str));
        } else if (fVar instanceof g) {
            d(new C4941u(str));
        } else if (fVar instanceof d) {
            d(new C4936o(str));
        } else if (fVar instanceof f) {
            d(new r(str, false));
        } else if (fVar instanceof e) {
            d(new r(str, true));
        }
    }

    public final void b(String str, r.f fVar) {
        AbstractC3557B.c0("event", fVar);
        if (fVar instanceof c) {
            d(new C4931j(str, ((c) fVar).f44454f));
        } else if (fVar instanceof g) {
            d(new C4942v(str));
        } else if (fVar instanceof d) {
            d(new C4937p(str));
        } else if (fVar instanceof f) {
            d(new C4939s(str, false));
        } else if (fVar instanceof e) {
            d(new C4939s(str, true));
        }
    }

    public final void d(L4.a aVar) {
        if ((aVar instanceof C4932k) && ((C4932k) aVar).f40877n) {
            synchronized (this.f44451g) {
                this.f44451g.b(aVar, this.f44446b);
            }
        } else if (aVar instanceof C4945y) {
            A6.c cVar = this.f44448d;
            C4945y c4945y = (C4945y) aVar;
            AbstractC5675a abstractC5675a = this.f44446b;
            cVar.getClass();
            AbstractC3557B.c0("writer", abstractC5675a);
            if (((S5.c) cVar.f708b).b()) {
                if (c4945y.f40910j != 3 || ((S5.c) cVar.f709c).b()) {
                    A6.d dVar = new A6.d(c4945y.f40910j, c4945y.f40911k, c4945y.f40913m);
                    EnumC5090b enumC5090b = EnumC5090b.f42739Z;
                    LinkedHashSet linkedHashSet = cVar.f712f;
                    boolean z10 = c4945y.f40918r;
                    r5.d dVar2 = cVar.f707a;
                    if (!z10 && linkedHashSet.contains(dVar)) {
                        P4.a.m0(dVar2.l(), 3, enumC5090b, new X0.b(27, dVar), null, false, 56);
                    } else if (linkedHashSet.size() >= cVar.f710d) {
                        P4.a.m0(dVar2.l(), 3, enumC5090b, A6.a.f698h0, null, false, 56);
                    } else {
                        linkedHashSet.add(new A6.d(c4945y.f40910j, c4945y.f40911k, c4945y.f40913m));
                        AbstractC5368c h10 = dVar2.h("rum");
                        if (h10 != null) {
                            H.B0(h10, new D(c4945y, cVar, abstractC5675a, 6));
                        }
                    }
                }
            }
        } else {
            this.f44447c.removeCallbacks(this.f44452h);
            if (!this.f44450f.isShutdown()) {
                H.w0(this.f44450f, "Rum event handling", this.f44445a.l(), new RunnableC5841a(this, 4, aVar));
            }
        }
    }

    @Override // i6.f
    public final Map h() {
        return this.f44453i;
    }

    @Override // i6.f
    public final void i(String str, String str2, Throwable th2) {
        w wVar = w.f37484Y;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC2469q0.q("source", 1);
        d(new F(str, null, str2, th2, AbstractC4268D.l1(wVar)));
    }

    @Override // i6.f
    public final void j(String str, Integer num, Long l10, int i10, LinkedHashMap linkedHashMap) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC2469q0.q("kind", i10);
        d(new E(str, Long.valueOf(num.intValue()), l10, i10, AbstractC4268D.l1(linkedHashMap), c(linkedHashMap)));
    }

    @Override // i6.f
    public final void k(String str, Object obj, Map map) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
        d(new C(J.u(str, obj), AbstractC4268D.l1(map), c(map)));
    }

    @Override // i6.f
    public final void l(i6.d dVar, String str, Map map) {
        d(new C4920A(dVar, str, false, AbstractC4268D.l1(map), c(map)));
    }

    @Override // i6.f
    public final void m(String str, Object obj) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", obj);
        d(new C4933l(str, obj));
    }

    @Override // i6.f
    public final void n(String str, Object obj) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        ConcurrentHashMap concurrentHashMap = this.f44453i;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // i6.f
    public final void o(Activity activity, Map map) {
        AbstractC3557B.c0("attributes", map);
        d(new G(J.u(null, activity), AbstractC4268D.l1(map), c(map)));
    }

    @Override // i6.f
    public final void p(i6.d dVar, LinkedHashMap linkedHashMap) {
        d(new o6.D(dVar, AbstractC4268D.l1(linkedHashMap), c(linkedHashMap)));
    }

    @Override // i6.f
    public final void q(String str, int i10, Throwable th2, Map map) {
        String str2;
        AbstractC2469q0.q("source", i10);
        C4564c c10 = c(map);
        Object obj = map.get("_dd.error_type");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        d(new C4932k(str, i10, th2, false, AbstractC4268D.l1(map), c10, str2, v.f37483Y, 256));
    }

    @Override // i6.f
    public final void r(LinkedHashMap linkedHashMap) {
        d(new C4920A(i6.d.f32723Z, "", true, AbstractC4268D.l1(linkedHashMap), c(linkedHashMap)));
    }

    @Override // i6.f
    public final void s(String str, int i10, String str2, Map map) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC2469q0.q("method", i10);
        AbstractC3557B.c0("url", str2);
        AbstractC3557B.c0("attributes", map);
        d(new C4921B(str, str2, i10, AbstractC4268D.l1(map), c(map)));
    }
}
