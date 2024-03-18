package qb;

import Jc.F;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: qb.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5301c implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44039a;

    public C5301c(AbstractC2400f abstractC2400f) {
        this.f44039a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44039a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C5300b((F) obj);
    }
}
