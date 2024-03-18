package Ra;

import Jc.F;
import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class h implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f15204a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f15205b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f15206c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f15207d;

    public h(C2398d c2398d, AbstractC2400f abstractC2400f, Ua.d dVar, AbstractC2400f abstractC2400f2) {
        this.f15204a = c2398d;
        this.f15205b = abstractC2400f;
        this.f15206c = dVar;
        this.f15207d = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f15204a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f15205b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f15206c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f15207d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new g((Application) obj, (F) obj2, (Ic.a) obj3, (Aa.j) obj4);
    }
}
