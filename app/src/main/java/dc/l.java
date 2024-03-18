package dc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class l implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f28212a;

    public l(AbstractC2400f abstractC2400f) {
        this.f28212a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f28212a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new k((com.openai.experiment.h) obj);
    }
}
