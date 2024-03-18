package androidx.compose.foundation.layout;

import E.C0431o;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4313e;
import l0.AbstractC4325q;
import l0.C4318j;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "LG0/X;", "LE/o;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BoxChildDataElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4313e f24702b;

    public BoxChildDataElement(C4318j c4318j) {
        this.f24702b = c4318j;
    }

    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement == null) {
            return false;
        }
        return AbstractC3557B.K(this.f24702b, boxChildDataElement.f24702b);
    }

    @Override // G0.X
    public final int hashCode() {
        return (this.f24702b.hashCode() * 31) + 1237;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.o] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3929s0 = this.f24702b;
        abstractC4325q.f3930t0 = false;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0431o c0431o = (C0431o) abstractC4325q;
        c0431o.f3929s0 = this.f24702b;
        c0431o.f3930t0 = false;
    }
}
