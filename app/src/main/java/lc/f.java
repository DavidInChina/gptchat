package Lc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f10993a;

    public f(AbstractC2400f abstractC2400f) {
        this.f10993a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f10993a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new e((g) obj);
    }
}
