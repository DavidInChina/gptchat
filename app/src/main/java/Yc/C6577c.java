package yc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import nd.C4812a;

/* renamed from: yc.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6577c implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f50894a;

    public C6577c(AbstractC2400f abstractC2400f) {
        this.f50894a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f50894a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C6576b((C4812a) obj);
    }
}
