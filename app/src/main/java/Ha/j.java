package Ha;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class j implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f7589a;

    public j(AbstractC2400f abstractC2400f) {
        this.f7589a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f7589a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new i((Yc.a) obj);
    }
}
