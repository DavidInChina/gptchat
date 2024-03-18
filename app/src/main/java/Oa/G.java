package oa;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ta.C5715n;

/* loaded from: classes2.dex */
public final class G implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f41084a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f41085b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f41086c;

    public G(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f41084a = abstractC2400f;
        this.f41085b = abstractC2400f2;
        this.f41086c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f41084a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f41085b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f41086c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new C4975F((Ga.E) obj, (C5715n) obj2, (com.openai.experiment.t) obj3);
    }
}
