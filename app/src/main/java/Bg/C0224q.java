package Bg;

import id.AbstractC3557B;

/* renamed from: Bg.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0224q extends r implements AbstractC0222o, Eg.d {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f2152i0 = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final D f2153Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f2154h0;

    public C0224q(D d10, boolean z10) {
        this.f2153Z = d10;
        this.f2154h0 = z10;
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        if (z10) {
            return this.f2153Z.C0(z10);
        }
        return this;
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return new C0224q(this.f2153Z.E0(q10), this.f2154h0);
    }

    @Override // Bg.r
    public final D H0() {
        return this.f2153Z;
    }

    @Override // Bg.r
    public final r J0(D d10) {
        return new C0224q(d10, this.f2154h0);
    }

    @Override // Bg.AbstractC0222o
    public final boolean k0() {
        D d10 = this.f2153Z;
        d10.y0();
        return d10.y0().k() instanceof Mf.b0;
    }

    @Override // Bg.AbstractC0222o
    public final o0 p0(A a5) {
        AbstractC3557B.c0("replacement", a5);
        return R4.b.E1(a5.B0(), this.f2154h0);
    }

    @Override // Bg.D
    public final String toString() {
        return this.f2153Z + " & Any";
    }

    @Override // Bg.r, Bg.A
    public final boolean z0() {
        return false;
    }
}
