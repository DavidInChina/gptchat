package I;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: u0  reason: collision with root package name */
    public f f7923u0;

    public g(f fVar) {
        this.f7923u0 = fVar;
    }

    @Override // l0.AbstractC4325q
    public final void t0() {
        f fVar = this.f7923u0;
        if (fVar instanceof f) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", fVar);
            fVar.f7922a.m(this);
        }
        if (fVar instanceof f) {
            fVar.f7922a.b(this);
        }
        this.f7923u0 = fVar;
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        f fVar = this.f7923u0;
        if (fVar instanceof f) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", fVar);
            fVar.f7922a.m(this);
        }
    }
}
