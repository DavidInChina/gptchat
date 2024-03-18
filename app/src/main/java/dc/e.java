package Dc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import xd.g;

/* loaded from: classes2.dex */
public final class e implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f3498a;

    public e(AbstractC2400f abstractC2400f) {
        this.f3498a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f3498a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new d((g) obj);
    }
}
