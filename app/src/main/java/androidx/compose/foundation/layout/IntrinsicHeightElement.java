package androidx.compose.foundation.layout;

import E.W;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;
import z.AbstractC6708l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "LG0/X;", "LE/W;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IntrinsicHeightElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final int f24706b = 1;

    public final boolean equals(Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        if (intrinsicHeightElement != null && this.f24706b == intrinsicHeightElement.f24706b) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        return (AbstractC6708l.f(this.f24706b) * 31) + 1231;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.W] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3827s0 = this.f24706b;
        abstractC4325q.f3828t0 = true;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        W w10 = (W) abstractC4325q;
        w10.f3827s0 = this.f24706b;
        w10.f3828t0 = true;
    }
}
