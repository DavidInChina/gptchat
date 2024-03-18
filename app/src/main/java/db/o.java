package Db;

import Vc.y;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class o implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f3486a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f3487b;

    public o(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f3486a = abstractC2400f;
        this.f3487b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f3486a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f3487b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new m((Yc.f) obj, (y) obj2);
    }
}
