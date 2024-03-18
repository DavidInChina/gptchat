package La;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import f9.C2961m;
import id.AbstractC3557B;
import ld.C4428a;

/* loaded from: classes.dex */
public final class d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f10973a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f10974b;

    public d(C2961m c2961m, AbstractC2400f abstractC2400f) {
        this.f10973a = c2961m;
        this.f10974b = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f10973a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f10974b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new c((Z3.a) obj, (C4428a) obj2);
    }
}
