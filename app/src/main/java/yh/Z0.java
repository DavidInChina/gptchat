package yh;

import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.l1;

/* loaded from: classes.dex */
public final class Z0 extends H0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1.a f50984Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6596b1 f50985h0;

    public Z0(C6596b1 c6596b1, l1.a aVar) {
        this.f50985h0 = c6596b1;
        this.f50984Z = aVar;
    }

    @Override // yh.l1.a
    public final String A0() {
        return this.f50984Z.A0();
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        return this.f50984Z.B();
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f50984Z.getDeclaredAnnotations();
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return this.f50984Z.getUpperBounds().k(this.f50985h0);
    }
}
