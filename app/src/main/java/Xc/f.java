package xc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.t;
import id.AbstractC3557B;
import ld.C4428a;
import nd.C4812a;

/* loaded from: classes.dex */
public final class f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f49802a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f49803b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f49804c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f49805d;

    public f(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f49802a = abstractC2400f;
        this.f49803b = abstractC2400f2;
        this.f49804c = abstractC2400f3;
        this.f49805d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f49802a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f49803b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f49804c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f49805d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new e((C4428a) obj, (C4812a) obj2, (xd.b) obj3, (t) obj4);
    }
}
