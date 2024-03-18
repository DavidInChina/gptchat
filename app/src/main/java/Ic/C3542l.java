package ic;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import nd.AbstractC4816e;

/* renamed from: ic.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3542l implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f33057a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f33058b;

    public C3542l(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f33057a = abstractC2400f;
        this.f33058b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f33057a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f33058b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new C3541k((xd.h) obj, (AbstractC4816e) obj2);
    }
}
