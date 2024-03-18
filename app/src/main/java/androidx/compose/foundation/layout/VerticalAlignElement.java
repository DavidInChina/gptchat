package androidx.compose.foundation.layout;

import E.z0;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4312d;
import l0.AbstractC4325q;
import l0.C4310b;
import l0.C4317i;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "LG0/X;", "LE/z0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VerticalAlignElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4312d f24725b = C4310b.f37703p0;

    public final boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalAlignElement) {
            verticalAlignElement = (VerticalAlignElement) obj;
        } else {
            verticalAlignElement = null;
        }
        if (verticalAlignElement == null) {
            return false;
        }
        return AbstractC3557B.K(this.f24725b, verticalAlignElement.f24725b);
    }

    @Override // G0.X
    public final int hashCode() {
        return Float.floatToIntBits(((C4317i) this.f24725b).f37711a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.z0] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3983s0 = this.f24725b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((z0) abstractC4325q).f3983s0 = this.f24725b;
    }
}
