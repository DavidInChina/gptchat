package ld;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: ld.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4430c implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f38280a;

    public C4430c(AbstractC2400f abstractC2400f) {
        this.f38280a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f38280a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new o((C4431d) obj);
    }
}
