package androidx.compose.ui;

import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;
import l0.C4328t;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "LG0/X;", "Ll0/t;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ZIndexElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24780b;

    public ZIndexElement(float f6) {
        this.f24780b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f24780b, ((ZIndexElement) obj).f24780b) == 0;
    }

    @Override // G0.X
    public final int hashCode() {
        return Float.floatToIntBits(this.f24780b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, l0.t] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f37735s0 = this.f24780b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((C4328t) abstractC4325q).f37735s0 = this.f24780b;
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("ZIndexElement(zIndex="), this.f24780b, ')');
    }
}
