package Ia;

import Ja.p;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.t;
import id.AbstractC3557B;
import ld.C4428a;

/* loaded from: classes2.dex */
public final class m implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f8532a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f8533b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f8534c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f8535d;

    public m(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f8532a = abstractC2400f;
        this.f8533b = abstractC2400f2;
        this.f8534c = abstractC2400f3;
        this.f8535d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f8532a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f8533b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f8534c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f8535d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new l((p) obj, (xd.h) obj2, (t) obj3, (C4428a) obj4);
    }
}
