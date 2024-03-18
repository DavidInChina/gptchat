package kd;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: kd.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4242f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f37302a;

    public C4242f(AbstractC2400f abstractC2400f) {
        this.f37302a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f37302a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C4241e((Yc.a) obj);
    }
}
