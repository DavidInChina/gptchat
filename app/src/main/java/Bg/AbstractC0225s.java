package Bg;

import id.AbstractC3557B;

/* renamed from: Bg.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0225s extends r {

    /* renamed from: Z  reason: collision with root package name */
    public final D f2155Z;

    public AbstractC0225s(D d10) {
        AbstractC3557B.c0("delegate", d10);
        this.f2155Z = d10;
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        if (z10 == z0()) {
            return this;
        }
        return this.f2155Z.C0(z10).E0(x0());
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        if (q10 != x0()) {
            return new F(this, q10);
        }
        return this;
    }

    @Override // Bg.r
    public final D H0() {
        return this.f2155Z;
    }
}
