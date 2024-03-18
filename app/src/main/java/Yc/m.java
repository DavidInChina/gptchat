package Yc;

import b9.AbstractC2133b;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class m implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22253a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f22254b;

    public m(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f22253a = abstractC2400f;
        this.f22254b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22253a.get();
        AbstractC3557B.b0("get(...)", obj);
        p000if.a aVar = this.f22254b;
        AbstractC3557B.c0("staleAccountInformationObserver", aVar);
        return new l((AbstractC2133b) obj, aVar);
    }
}
