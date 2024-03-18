package Bg;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class G extends r implements n0 {

    /* renamed from: Z  reason: collision with root package name */
    public final D f2069Z;

    /* renamed from: h0  reason: collision with root package name */
    public final A f2070h0;

    public G(D d10, A a5) {
        AbstractC3557B.c0("delegate", d10);
        AbstractC3557B.c0("enhancement", a5);
        this.f2069Z = d10;
        this.f2070h0 = a5;
    }

    @Override // Bg.n0
    public final A C() {
        return this.f2070h0;
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        o0 Z02 = L4.a.Z0(this.f2069Z.C0(z10), this.f2070h0.B0().C0(z10));
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType", Z02);
        return (D) Z02;
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        o0 Z02 = L4.a.Z0(this.f2069Z.E0(q10), this.f2070h0);
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType", Z02);
        return (D) Z02;
    }

    @Override // Bg.r
    public final D H0() {
        return this.f2069Z;
    }

    @Override // Bg.r
    public final r J0(D d10) {
        return new G(d10, this.f2070h0);
    }

    /* renamed from: K0 */
    public final G I0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D d10 = this.f2069Z;
        AbstractC3557B.c0("type", d10);
        A a5 = this.f2070h0;
        AbstractC3557B.c0("type", a5);
        return new G(d10, a5);
    }

    @Override // Bg.n0
    public final o0 getOrigin() {
        return this.f2069Z;
    }

    @Override // Bg.D
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f2070h0 + ")] " + this.f2069Z;
    }
}
