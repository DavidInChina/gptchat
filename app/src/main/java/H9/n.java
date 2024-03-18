package H9;

import L9.AbstractC0904j;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class n implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f7529a;

    public n(AbstractC2400f abstractC2400f) {
        this.f7529a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f7529a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new m((AbstractC0904j) obj);
    }
}
