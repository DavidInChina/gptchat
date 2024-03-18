package Cc;

import Dd.W;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class e implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2984a;

    public e(AbstractC2400f abstractC2400f) {
        this.f2984a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2984a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new d((W) obj);
    }
}
