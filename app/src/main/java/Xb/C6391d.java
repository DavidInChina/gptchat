package xb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: xb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6391d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f49786a;

    public C6391d(AbstractC2400f abstractC2400f) {
        this.f49786a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f49786a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C6390c((Yc.a) obj);
    }
}
