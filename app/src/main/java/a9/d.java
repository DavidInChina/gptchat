package A9;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.r;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f734a;

    public d(AbstractC2400f abstractC2400f) {
        this.f734a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f734a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new c((r) obj);
    }
}
