package androidx.compose.foundation.layout;

import E.Y;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;
import z.AbstractC6708l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "LG0/X;", "LE/Y;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class IntrinsicWidthElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final int f24707b = 2;

    public final boolean equals(Object obj) {
        IntrinsicWidthElement intrinsicWidthElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicWidthElement) {
            intrinsicWidthElement = (IntrinsicWidthElement) obj;
        } else {
            intrinsicWidthElement = null;
        }
        if (intrinsicWidthElement != null && this.f24707b == intrinsicWidthElement.f24707b) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        return (AbstractC6708l.f(this.f24707b) * 31) + 1231;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.Y, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3829s0 = this.f24707b;
        abstractC4325q.f3830t0 = true;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        Y y10 = (Y) abstractC4325q;
        y10.f3829s0 = this.f24707b;
        y10.f3830t0 = true;
    }
}
