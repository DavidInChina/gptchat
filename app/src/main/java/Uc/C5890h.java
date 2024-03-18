package uc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import kf.v;
import kf.w;
import sd.AbstractC5614c;
import sd.C5613b;
import td.C5756a;

/* renamed from: uc.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5890h implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f46636a;

    public C5890h(AbstractC2400f abstractC2400f) {
        this.f46636a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f46636a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new AbstractC5614c((C5613b) obj, "beta_features", new C5756a(C5885c.Companion.serializer()), new C5885c(v.f37483Y, w.f37484Y));
    }
}
