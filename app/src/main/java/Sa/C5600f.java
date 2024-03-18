package sa;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.i;

/* renamed from: sa.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5600f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f45487a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f45488b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f45489c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f45490d;

    public C5600f(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f45487a = abstractC2400f;
        this.f45488b = abstractC2400f2;
        this.f45489c = abstractC2400f3;
        this.f45490d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f45487a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f45488b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f45489c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f45490d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new C5599e((Va.e) obj, (i) obj2, (Z9.d) obj3, (T9.a) obj4);
    }
}
