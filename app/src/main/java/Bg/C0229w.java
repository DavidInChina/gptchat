package Bg;

import id.AbstractC3557B;

/* renamed from: Bg.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0229w extends AbstractC0227u implements n0 {

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC0227u f2160i0;

    /* renamed from: j0  reason: collision with root package name */
    public final A f2161j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0229w(AbstractC0227u abstractC0227u, A a5) {
        super(abstractC0227u.f2158Z, abstractC0227u.f2159h0);
        AbstractC3557B.c0("origin", abstractC0227u);
        AbstractC3557B.c0("enhancement", a5);
        this.f2160i0 = abstractC0227u;
        this.f2161j0 = a5;
    }

    @Override // Bg.A
    public final A A0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        AbstractC0227u abstractC0227u = this.f2160i0;
        AbstractC3557B.c0("type", abstractC0227u);
        A a5 = this.f2161j0;
        AbstractC3557B.c0("type", a5);
        return new C0229w(abstractC0227u, a5);
    }

    @Override // Bg.n0
    public final A C() {
        return this.f2161j0;
    }

    @Override // Bg.o0
    public final o0 C0(boolean z10) {
        return L4.a.Z0(this.f2160i0.C0(z10), this.f2161j0.B0().C0(z10));
    }

    @Override // Bg.o0
    public final o0 D0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        AbstractC0227u abstractC0227u = this.f2160i0;
        AbstractC3557B.c0("type", abstractC0227u);
        A a5 = this.f2161j0;
        AbstractC3557B.c0("type", a5);
        return new C0229w(abstractC0227u, a5);
    }

    @Override // Bg.o0
    public final o0 E0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return L4.a.Z0(this.f2160i0.E0(q10), this.f2161j0);
    }

    @Override // Bg.AbstractC0227u
    public final D F0() {
        return this.f2160i0.F0();
    }

    @Override // Bg.AbstractC0227u
    public final String G0(mg.m mVar, mg.o oVar) {
        AbstractC3557B.c0("renderer", mVar);
        AbstractC3557B.c0("options", oVar);
        if (oVar.e()) {
            return mVar.Y(this.f2161j0);
        }
        return this.f2160i0.G0(mVar, oVar);
    }

    @Override // Bg.n0
    public final o0 getOrigin() {
        return this.f2160i0;
    }

    @Override // Bg.AbstractC0227u
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f2161j0 + ")] " + this.f2160i0;
    }
}
