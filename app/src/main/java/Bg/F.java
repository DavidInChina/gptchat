package Bg;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class F extends AbstractC0225s {

    /* renamed from: h0  reason: collision with root package name */
    public final Q f2068h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(D d10, Q q10) {
        super(d10);
        AbstractC3557B.c0("delegate", d10);
        AbstractC3557B.c0("attributes", q10);
        this.f2068h0 = q10;
    }

    @Override // Bg.r
    public final r J0(D d10) {
        return new F(d10, this.f2068h0);
    }

    @Override // Bg.r, Bg.A
    public final Q x0() {
        return this.f2068h0;
    }
}
