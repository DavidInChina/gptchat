package uc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: uc.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5888f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f46635a;

    public C5888f(AbstractC2400f abstractC2400f) {
        this.f46635a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f46635a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C5887e((Yc.a) obj);
    }
}
