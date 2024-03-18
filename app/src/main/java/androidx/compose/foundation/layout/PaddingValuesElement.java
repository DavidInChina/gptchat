package androidx.compose.foundation.layout;

import E.g0;
import E.k0;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "LG0/X;", "LE/k0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PaddingValuesElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final g0 f24717b;

    public PaddingValuesElement(g0 g0Var) {
        this.f24717b = g0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (obj instanceof PaddingValuesElement) {
            paddingValuesElement = (PaddingValuesElement) obj;
        } else {
            paddingValuesElement = null;
        }
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC3557B.K(this.f24717b, paddingValuesElement.f24717b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24717b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.k0] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3882s0 = this.f24717b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((k0) abstractC4325q).f3882s0 = this.f24717b;
    }
}
