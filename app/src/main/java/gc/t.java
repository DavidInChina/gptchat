package gc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class t implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f31578a;

    public t(AbstractC2400f abstractC2400f) {
        AbstractC3557B.c0("experimentManager", abstractC2400f);
        this.f31578a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f31578a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new s((com.openai.experiment.t) obj);
    }
}
