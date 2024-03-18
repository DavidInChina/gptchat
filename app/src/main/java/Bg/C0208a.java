package Bg;

import id.AbstractC3557B;

/* renamed from: Bg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0208a extends r {

    /* renamed from: Z  reason: collision with root package name */
    public final D f2101Z;

    /* renamed from: h0  reason: collision with root package name */
    public final D f2102h0;

    public C0208a(D d10, D d11) {
        AbstractC3557B.c0("delegate", d10);
        AbstractC3557B.c0("abbreviation", d11);
        this.f2101Z = d10;
        this.f2102h0 = d11;
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return new C0208a(this.f2101Z.E0(q10), this.f2102h0);
    }

    @Override // Bg.r
    public final D H0() {
        return this.f2101Z;
    }

    @Override // Bg.r
    public final r J0(D d10) {
        return new C0208a(d10, this.f2102h0);
    }

    /* renamed from: K0 */
    public final C0208a F0(boolean z10) {
        return new C0208a(this.f2101Z.C0(z10), this.f2102h0.C0(z10));
    }

    /* renamed from: L0 */
    public final C0208a I0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D d10 = this.f2101Z;
        AbstractC3557B.c0("type", d10);
        D d11 = this.f2102h0;
        AbstractC3557B.c0("type", d11);
        return new C0208a(d10, d11);
    }
}
