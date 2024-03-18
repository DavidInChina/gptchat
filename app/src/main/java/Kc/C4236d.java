package kc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import jc.C3935c;

/* renamed from: kc.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4236d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f37294a;

    public C4236d(AbstractC2400f abstractC2400f) {
        this.f37294a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f37294a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C4235c((C3935c) obj);
    }
}
