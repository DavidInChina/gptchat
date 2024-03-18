package f9;

import ce.AbstractC2400f;
import ce.C2396b;
import ce.C2398d;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import e9.C2821n;
import g9.AbstractC3215f;
import id.AbstractC3557B;
import ld.AbstractC4433f;
import rc.C5439C;
import rc.C5454c;
import rc.C5464m;
import rc.C5466o;
import rc.C5473w;
import rc.C5475y;
import rc.i0;
import rc.k0;
import tc.C5740i;
import wc.C6162d;

/* loaded from: classes2.dex */
public final class w implements AbstractC3215f {

    /* renamed from: a  reason: collision with root package name */
    public final nd.h f29970a;

    /* renamed from: b  reason: collision with root package name */
    public final ld.p f29971b;

    /* renamed from: c  reason: collision with root package name */
    public final p f29972c;

    /* renamed from: d  reason: collision with root package name */
    public final w f29973d = this;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC2400f f29974e;

    /* renamed from: f  reason: collision with root package name */
    public final C2398d f29975f;

    /* renamed from: g  reason: collision with root package name */
    public final C2398d f29976g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC2400f f29977h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC2400f f29978i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC2400f f29979j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC2400f f29980k;

    /* renamed from: l  reason: collision with root package name */
    public final AbstractC2400f f29981l;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC2400f f29982m;

    /* renamed from: n  reason: collision with root package name */
    public final AbstractC2400f f29983n;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC2400f f29984o;

    /* renamed from: p  reason: collision with root package name */
    public final AbstractC2400f f29985p;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC2400f f29986q;

    public w(p pVar, nd.h hVar, ld.p pVar2) {
        this.f29972c = pVar;
        this.f29970a = hVar;
        this.f29971b = pVar2;
        AbstractC2400f abstractC2400f = pVar.f29906f;
        AbstractC3557B.c0("appCoroutineScope", abstractC2400f);
        this.f29974e = C2396b.a(new ld.r(abstractC2400f));
        this.f29975f = C2398d.a(hVar);
        C2398d a5 = C2398d.a(pVar2);
        this.f29976g = a5;
        AbstractC2400f a10 = C2396b.a(new C2821n(pVar.f29904e, a5, this.f29975f, this.f29974e, 5));
        this.f29977h = a10;
        AbstractC2400f a11 = C2396b.a(new C5475y(a10));
        this.f29978i = a11;
        C2398d c2398d = this.f29975f;
        AbstractC3557B.c0("authSession", c2398d);
        this.f29979j = C2396b.a(new C2821n(C2396b.a(new C5454c(c2398d, a11)), this.f29976g, this.f29974e, new r(1, this), 1));
        AbstractC2400f abstractC2400f2 = this.f29977h;
        AbstractC3557B.c0("dependencies", abstractC2400f2);
        this.f29980k = C2396b.a(new k0(abstractC2400f2));
        AbstractC2400f abstractC2400f3 = pVar.f29882I;
        AbstractC3557B.c0("requester", abstractC2400f3);
        AbstractC2400f a12 = C2396b.a(new C6162d(abstractC2400f3));
        AbstractC2400f abstractC2400f4 = this.f29980k;
        AbstractC2400f abstractC2400f5 = pVar.f29874A;
        C2398d c2398d2 = this.f29976g;
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, abstractC2400f4);
        AbstractC3557B.c0("authSessionProvider", abstractC2400f5);
        AbstractC3557B.c0("coroutineScope", c2398d2);
        this.f29981l = C2396b.a(new i0(abstractC2400f4, abstractC2400f5, a12, c2398d2));
        AbstractC2400f abstractC2400f6 = this.f29977h;
        AbstractC3557B.c0("dependencies", abstractC2400f6);
        this.f29982m = C2396b.a(new C5466o(abstractC2400f6));
        AbstractC2400f abstractC2400f7 = this.f29977h;
        AbstractC3557B.c0("dependencies", abstractC2400f7);
        this.f29983n = C2396b.a(new C5439C(abstractC2400f7));
        AbstractC2400f abstractC2400f8 = pVar.f29882I;
        AbstractC3557B.c0("requester", abstractC2400f8);
        AbstractC2400f a13 = C2396b.a(new C5740i(abstractC2400f8));
        AbstractC2400f abstractC2400f9 = this.f29982m;
        AbstractC2400f abstractC2400f10 = this.f29983n;
        AbstractC2400f abstractC2400f11 = pVar.f29874A;
        C2398d c2398d3 = this.f29976g;
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, abstractC2400f9);
        AbstractC3557B.c0("legacyStore", abstractC2400f10);
        AbstractC3557B.c0("authSessionProvider", abstractC2400f11);
        AbstractC3557B.c0("coroutineScope", c2398d3);
        AbstractC2400f a14 = C2396b.a(new C5464m(abstractC2400f9, abstractC2400f10, abstractC2400f11, a13, c2398d3));
        this.f29984o = a14;
        AbstractC2400f abstractC2400f12 = this.f29978i;
        C2398d c2398d4 = this.f29976g;
        AbstractC2400f abstractC2400f13 = this.f29981l;
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, abstractC2400f12);
        AbstractC3557B.c0("coroutineScope", c2398d4);
        AbstractC3557B.c0("userRepository", abstractC2400f13);
        this.f29985p = C2396b.a(new C5473w(abstractC2400f12, c2398d4, abstractC2400f13, a14));
        AbstractC2400f abstractC2400f14 = pVar.f29882I;
        AbstractC3557B.c0("requester", abstractC2400f14);
        this.f29986q = C2396b.a(new E9.i(abstractC2400f14));
    }

    @Override // g9.AbstractC3215f
    public final AbstractC4433f b() {
        return this.f29971b;
    }

    @Override // g9.AbstractC3215f
    public final ld.o d() {
        return (ld.q) this.f29974e.get();
    }

    @Override // g9.AbstractC3215f
    public final nd.k e() {
        return this.f29970a;
    }
}
