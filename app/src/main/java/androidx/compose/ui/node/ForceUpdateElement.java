package androidx.compose.ui.node;

import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/ForceUpdateElement;", "LG0/X;", "Ll0/q;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ForceUpdateElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final X f24825b;

    public ForceUpdateElement(X x10) {
        this.f24825b = x10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && AbstractC3557B.K(this.f24825b, ((ForceUpdateElement) obj).f24825b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24825b.hashCode();
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        throw new IllegalStateException("Shouldn't be called");
    }

    public final String toString() {
        return "ForceUpdateElement(original=" + this.f24825b + ')';
    }
}
