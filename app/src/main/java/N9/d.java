package N9;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.r;
import com.openai.experiment.t;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f12759a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f12760b;

    public d(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f12759a = abstractC2400f;
        this.f12760b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f12759a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f12760b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new c((r) obj, (t) obj2);
    }
}
