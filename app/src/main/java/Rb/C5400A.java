package rb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: rb.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5400A implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44645a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44646b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f44647c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f44648d;

    public C5400A(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f44645a = abstractC2400f;
        this.f44646b = abstractC2400f2;
        this.f44647c = abstractC2400f3;
        this.f44648d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44645a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f44646b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f44647c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f44648d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new C5436z((T9.a) obj, (com.openai.experiment.r) obj2, (C5402C) obj3, (B9.j) obj4);
    }
}
