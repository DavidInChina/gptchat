package Bg;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class C extends AbstractC0225s {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f2062h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d10, int i10) {
        super(d10);
        this.f2062h0 = i10;
        if (i10 != 1) {
            AbstractC3557B.c0("delegate", d10);
            return;
        }
        AbstractC3557B.c0("delegate", d10);
        super(d10);
    }

    @Override // Bg.r
    public final r J0(D d10) {
        switch (this.f2062h0) {
            case 0:
                return new C(d10, 0);
            default:
                return new C(d10, 1);
        }
    }

    @Override // Bg.r, Bg.A
    public final boolean z0() {
        switch (this.f2062h0) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
