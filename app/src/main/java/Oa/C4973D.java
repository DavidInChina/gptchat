package oa;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2401g;
import id.AbstractC3557B;
import jd.AbstractC3949a;
import o9.AbstractC4954b;
import o9.C4953a;

/* renamed from: oa.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4973D implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f41063a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f41064b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f41065c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f41066d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f41067e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f41068f;

    /* renamed from: g  reason: collision with root package name */
    public final p000if.a f41069g;

    /* renamed from: h  reason: collision with root package name */
    public final p000if.a f41070h;

    /* renamed from: i  reason: collision with root package name */
    public final p000if.a f41071i;

    /* renamed from: j  reason: collision with root package name */
    public final p000if.a f41072j;

    /* renamed from: k  reason: collision with root package name */
    public final p000if.a f41073k;

    public C4973D(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5, AbstractC2400f abstractC2400f6, AbstractC2400f abstractC2400f7, AbstractC2400f abstractC2400f8, C2401g c2401g, AbstractC2400f abstractC2400f9) {
        j9.g gVar = AbstractC4954b.f40985a;
        this.f41063a = abstractC2400f;
        this.f41064b = abstractC2400f2;
        this.f41065c = abstractC2400f3;
        this.f41066d = abstractC2400f4;
        this.f41067e = abstractC2400f5;
        this.f41068f = gVar;
        this.f41069g = abstractC2400f6;
        this.f41070h = abstractC2400f7;
        this.f41071i = abstractC2400f8;
        this.f41072j = c2401g;
        this.f41073k = abstractC2400f9;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f41063a.get();
        AbstractC3557B.b0("get(...)", obj);
        T9.d dVar = (T9.d) obj;
        Object obj2 = this.f41064b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Ea.a aVar = (Ea.a) obj2;
        Object obj3 = this.f41065c.get();
        AbstractC3557B.b0("get(...)", obj3);
        C4975F c4975f = (C4975F) obj3;
        Object obj4 = this.f41066d.get();
        AbstractC3557B.b0("get(...)", obj4);
        xd.h hVar = (xd.h) obj4;
        Object obj5 = this.f41067e.get();
        AbstractC3557B.b0("get(...)", obj5);
        ld.i iVar = (ld.i) obj5;
        Object obj6 = this.f41068f.get();
        AbstractC3557B.b0("get(...)", obj6);
        C4953a c4953a = (C4953a) obj6;
        Object obj7 = this.f41069g.get();
        AbstractC3557B.b0("get(...)", obj7);
        Na.a aVar2 = (Na.a) obj7;
        Object obj8 = this.f41070h.get();
        AbstractC3557B.b0("get(...)", obj8);
        Yc.l lVar = (Yc.l) obj8;
        Object obj9 = this.f41071i.get();
        AbstractC3557B.b0("get(...)", obj9);
        N9.c cVar = (N9.c) obj9;
        Object obj10 = this.f41073k.get();
        AbstractC3557B.b0("get(...)", obj10);
        p000if.a aVar3 = this.f41072j;
        AbstractC3557B.c0("outgoingMessageMiddlewares", aVar3);
        return new C4972C(dVar, aVar, c4975f, hVar, iVar, c4953a, aVar2, lVar, cVar, aVar3, (AbstractC3949a) obj10);
    }
}
