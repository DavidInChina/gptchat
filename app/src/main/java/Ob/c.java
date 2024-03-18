package Ob;

import Pb.h;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.r;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f13673a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f13674b;

    public c(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f13673a = abstractC2400f;
        this.f13674b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f13673a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f13674b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new b((r) obj, (h) obj2);
    }
}
