package Fc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class p implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f5228a;

    public p(AbstractC2400f abstractC2400f) {
        this.f5228a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f5228a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new o((g) obj);
    }
}
