package androidx.compose.foundation.layout;

import E.s0;
import E0.AbstractC0442a;
import E0.C0458q;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "LG0/X;", "LE/s0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WithAlignmentLineElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0442a f24726b;

    public WithAlignmentLineElement(C0458q c0458q) {
        this.f24726b = c0458q;
    }

    public final boolean equals(Object obj) {
        WithAlignmentLineElement withAlignmentLineElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof WithAlignmentLineElement) {
            withAlignmentLineElement = (WithAlignmentLineElement) obj;
        } else {
            withAlignmentLineElement = null;
        }
        if (withAlignmentLineElement == null) {
            return false;
        }
        return AbstractC3557B.K(this.f24726b, withAlignmentLineElement.f24726b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24726b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.s0] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3947s0 = this.f24726b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((s0) abstractC4325q).f3947s0 = this.f24726b;
    }
}
