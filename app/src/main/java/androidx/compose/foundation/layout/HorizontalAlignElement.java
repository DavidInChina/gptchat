package androidx.compose.foundation.layout;

import E.P;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4311c;
import l0.AbstractC4325q;
import l0.C4316h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "LG0/X;", "LE/P;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HorizontalAlignElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4311c f24705b;

    public HorizontalAlignElement(C4316h c4316h) {
        this.f24705b = c4316h;
    }

    public final boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return AbstractC3557B.K(this.f24705b, horizontalAlignElement.f24705b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24705b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.P] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3809s0 = this.f24705b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((P) abstractC4325q).f3809s0 = this.f24705b;
    }
}
