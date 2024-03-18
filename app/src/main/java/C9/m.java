package C9;

import Vc.y;
import android.app.Application;
import b9.p;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4431d;

/* loaded from: classes.dex */
public final class m implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2802a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f2803b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f2804c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f2805d;

    public m(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f2802a = abstractC2400f;
        this.f2803b = abstractC2400f2;
        this.f2804c = abstractC2400f3;
        this.f2805d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2802a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f2803b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f2804c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f2805d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new l((Application) obj, (p) obj2, (C4431d) obj3, (y) obj4);
    }
}
