package Lc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import sd.AbstractC5616e;
import sd.C5615d;
import td.C5756a;

/* loaded from: classes.dex */
public final class h implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f10994a;

    public h(AbstractC2400f abstractC2400f) {
        this.f10994a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f10994a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new AbstractC5616e((C5615d) obj, "device_preferences", new C5756a(k.Companion.serializer()), new k(null));
    }
}
