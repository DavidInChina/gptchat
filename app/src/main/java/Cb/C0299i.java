package Cb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import wd.EnumC6206t;

/* renamed from: Cb.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299i implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2949a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f2950b;

    public C0299i(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f2949a = abstractC2400f;
        this.f2950b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2949a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f2950b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new C0294d((EnumC6206t) obj, (Vc.y) obj2);
    }
}
