package lc;

import android.app.Application;
import b9.AbstractC2133b;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import nd.AbstractC4816e;

/* loaded from: classes.dex */
public final class a0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f38177a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f38178b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f38179c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f38180d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f38181e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f38182f;

    /* renamed from: g  reason: collision with root package name */
    public final p000if.a f38183g;

    /* renamed from: h  reason: collision with root package name */
    public final p000if.a f38184h;

    /* renamed from: i  reason: collision with root package name */
    public final p000if.a f38185i;

    /* renamed from: j  reason: collision with root package name */
    public final p000if.a f38186j;

    public a0(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5, AbstractC2400f abstractC2400f6, AbstractC2400f abstractC2400f7, AbstractC2400f abstractC2400f8, AbstractC2400f abstractC2400f9, C2398d c2398d) {
        this.f38177a = abstractC2400f;
        this.f38178b = abstractC2400f2;
        this.f38179c = abstractC2400f3;
        this.f38180d = abstractC2400f4;
        this.f38181e = abstractC2400f5;
        this.f38182f = abstractC2400f6;
        this.f38183g = abstractC2400f7;
        this.f38184h = abstractC2400f8;
        this.f38185i = abstractC2400f9;
        this.f38186j = c2398d;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f38177a.get();
        AbstractC3557B.b0("get(...)", obj);
        u9.b bVar = (u9.b) obj;
        Object obj2 = this.f38178b.get();
        AbstractC3557B.b0("get(...)", obj2);
        xd.b bVar2 = (xd.b) obj2;
        Object obj3 = this.f38179c.get();
        AbstractC3557B.b0("get(...)", obj3);
        AbstractC4816e abstractC4816e = (AbstractC4816e) obj3;
        Object obj4 = this.f38180d.get();
        AbstractC3557B.b0("get(...)", obj4);
        com.openai.experiment.h hVar = (com.openai.experiment.h) obj4;
        Object obj5 = this.f38181e.get();
        AbstractC3557B.b0("get(...)", obj5);
        com.openai.experiment.t tVar = (com.openai.experiment.t) obj5;
        Object obj6 = this.f38182f.get();
        AbstractC3557B.b0("get(...)", obj6);
        Dd.W w10 = (Dd.W) obj6;
        Object obj7 = this.f38183g.get();
        AbstractC3557B.b0("get(...)", obj7);
        AbstractC2133b abstractC2133b = (AbstractC2133b) obj7;
        Object obj8 = this.f38184h.get();
        AbstractC3557B.b0("get(...)", obj8);
        xd.h hVar2 = (xd.h) obj8;
        Object obj9 = this.f38185i.get();
        AbstractC3557B.b0("get(...)", obj9);
        xd.g gVar = (xd.g) obj9;
        Object obj10 = this.f38186j.get();
        AbstractC3557B.b0("get(...)", obj10);
        return new C4401Z(bVar, bVar2, abstractC4816e, hVar, tVar, w10, abstractC2133b, hVar2, gVar, (Application) obj10);
    }
}
