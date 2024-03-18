package tc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: tc.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5740i implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f46084a;

    public C5740i(AbstractC2400f abstractC2400f) {
        this.f46084a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f46084a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C5739h((Yc.f) obj);
    }
}
