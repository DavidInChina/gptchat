package vc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: vc.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6025o implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f47469a;

    public C6025o(AbstractC2400f abstractC2400f) {
        this.f47469a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f47469a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C6024n((Yc.a) obj);
    }
}
