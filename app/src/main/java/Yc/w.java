package Yc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import sd.AbstractC5616e;
import sd.C5615d;
import td.C5756a;

/* loaded from: classes.dex */
public final class w implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22285a;

    public w(AbstractC2400f abstractC2400f) {
        this.f22285a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22285a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new AbstractC5616e((C5615d) obj, "cookie_storage", new C5756a(Vc.p.Companion.serializer()), new Vc.p(kf.v.f37483Y));
    }
}
