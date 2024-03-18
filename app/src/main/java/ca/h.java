package Ca;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class h implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2837a;

    public h(AbstractC2400f abstractC2400f) {
        this.f2837a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2837a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C0290g((Yc.a) obj);
    }
}
