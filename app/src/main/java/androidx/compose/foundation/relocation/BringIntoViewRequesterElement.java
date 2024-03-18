package androidx.compose.foundation.relocation;

import G0.X;
import I.f;
import I.g;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "LG0/X;", "LI/g;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class BringIntoViewRequesterElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final f f24750b;

    public BringIntoViewRequesterElement(f fVar) {
        this.f24750b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (AbstractC3557B.K(this.f24750b, ((BringIntoViewRequesterElement) obj).f24750b)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24750b.hashCode();
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new g(this.f24750b);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        g gVar = (g) abstractC4325q;
        f fVar = gVar.f7923u0;
        if (fVar instanceof f) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", fVar);
            fVar.f7922a.m(gVar);
        }
        f fVar2 = this.f24750b;
        if (fVar2 instanceof f) {
            fVar2.f7922a.b(gVar);
        }
        gVar.f7923u0 = fVar2;
    }
}
