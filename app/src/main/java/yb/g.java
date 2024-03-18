package Yb;

import Vc.y;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4431d;

/* loaded from: classes2.dex */
public final class g implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22217a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f22218b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f22219c;

    public g(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f22217a = abstractC2400f;
        this.f22218b = abstractC2400f2;
        this.f22219c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22217a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f22218b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f22219c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new f((Zb.b) obj, (y) obj2, (C4431d) obj3);
    }
}
