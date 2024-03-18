package pc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4428a;

/* renamed from: pc.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5145y implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f43050a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f43051b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f43052c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f43053d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f43054e;

    public C5145y(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5) {
        this.f43050a = abstractC2400f;
        this.f43051b = abstractC2400f2;
        this.f43052c = abstractC2400f3;
        this.f43053d = abstractC2400f4;
        this.f43054e = abstractC2400f5;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f43050a.get();
        AbstractC3557B.b0("get(...)", obj);
        AbstractC5126e abstractC5126e = (AbstractC5126e) obj;
        Object obj2 = this.f43051b.get();
        AbstractC3557B.b0("get(...)", obj2);
        xd.b bVar = (xd.b) obj2;
        Object obj3 = this.f43052c.get();
        AbstractC3557B.b0("get(...)", obj3);
        xd.a aVar = (xd.a) obj3;
        Object obj4 = this.f43053d.get();
        AbstractC3557B.b0("get(...)", obj4);
        com.openai.experiment.t tVar = (com.openai.experiment.t) obj4;
        Object obj5 = this.f43054e.get();
        AbstractC3557B.b0("get(...)", obj5);
        return new C5144x(abstractC5126e, bVar, aVar, tVar, (C4428a) obj5);
    }
}
