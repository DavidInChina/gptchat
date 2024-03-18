package Mc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f12020a;

    public d(AbstractC2400f abstractC2400f) {
        this.f12020a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        p000if.a aVar = this.f12020a;
        AbstractC3557B.c0("provider", aVar);
        return new c(aVar);
    }
}
