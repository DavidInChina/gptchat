package f9;

import Cb.T;
import Cb.a0;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import ce.AbstractC2400f;
import ce.C2396b;
import ce.C2398d;
import e9.C2821n;
import g9.AbstractC3215f;
import id.AbstractC3557B;
import java.util.Set;
import ld.AbstractC4433f;
import x8.S;
import x8.x0;

/* loaded from: classes2.dex */
public final class y implements AbstractC3215f, com.openai.experiment.D, com.openai.experiment.v, Ad.v {

    /* renamed from: a  reason: collision with root package name */
    public final nd.k f29988a;

    /* renamed from: b  reason: collision with root package name */
    public final ld.j f29989b;

    /* renamed from: c  reason: collision with root package name */
    public final p f29990c;

    /* renamed from: d  reason: collision with root package name */
    public final y f29991d = this;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC2400f f29992e;

    /* renamed from: f  reason: collision with root package name */
    public final C2398d f29993f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC2400f f29994g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC2400f f29995h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC2400f f29996i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC2400f f29997j;

    public y(p pVar, nd.k kVar, ld.j jVar) {
        this.f29990c = pVar;
        this.f29988a = kVar;
        this.f29989b = jVar;
        AbstractC2400f abstractC2400f = pVar.f29906f;
        AbstractC3557B.c0("appCoroutineScope", abstractC2400f);
        this.f29992e = C2396b.a(new ld.l(abstractC2400f));
        C2398d a5 = C2398d.a(jVar);
        this.f29993f = a5;
        C2398d c2398d = pVar.f29902d;
        C2959k c2959k = pVar.f29900c;
        com.openai.experiment.x.f27700d.getClass();
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, c2398d);
        AbstractC3557B.c0("appType", c2959k);
        AbstractC2400f a10 = C2396b.a(new com.openai.experiment.x(c2398d, a5, c2959k));
        this.f29994g = a10;
        C2398d c2398d2 = this.f29993f;
        AbstractC3557B.c0("coroutineScope", c2398d2);
        this.f29995h = C2396b.a(new com.openai.experiment.z(c2398d2, a10));
        this.f29996i = C2396b.a(new C2957i(this.f29993f, new r(2, this), 2));
        AbstractC2400f a11 = C2396b.a(new a0(C2396b.a(new C2821n(pVar.f29904e, this.f29993f, C2398d.a(kVar), this.f29992e, 4))));
        C2398d c2398d3 = this.f29993f;
        AbstractC2400f abstractC2400f2 = pVar.f29919l0;
        AbstractC3557B.c0("scope", c2398d3);
        AbstractC3557B.c0("onboardingService", abstractC2400f2);
        this.f29997j = C2396b.a(new T(c2398d3, a11, abstractC2400f2));
    }

    @Override // com.openai.experiment.D
    public final com.openai.experiment.C a() {
        return (com.openai.experiment.C) this.f29994g.get();
    }

    @Override // g9.AbstractC3215f
    public final AbstractC4433f b() {
        return this.f29989b;
    }

    @Override // com.openai.experiment.v
    public final com.openai.experiment.t c() {
        return (com.openai.experiment.t) this.f29995h.get();
    }

    @Override // g9.AbstractC3215f
    public final ld.o d() {
        return (ld.k) this.f29992e.get();
    }

    @Override // g9.AbstractC3215f
    public final nd.k e() {
        return this.f29988a;
    }

    @Override // Ad.v
    public final Set f() {
        int i10 = S.f49530h0;
        return new x0((Ad.u) this.f29996i.get());
    }
}
