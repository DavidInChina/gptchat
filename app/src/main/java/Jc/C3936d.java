package jc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: jc.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3936d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f36105a;

    public C3936d(AbstractC2400f abstractC2400f) {
        this.f36105a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f36105a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C3935c((Yc.a) obj);
    }
}
