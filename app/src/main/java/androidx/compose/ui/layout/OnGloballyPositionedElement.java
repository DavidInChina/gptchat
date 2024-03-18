package androidx.compose.ui.layout;

import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "LG0/X;", "LE0/X;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24824b;

    public OnGloballyPositionedElement(k kVar) {
        this.f24824b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return AbstractC3557B.K(this.f24824b, ((OnGloballyPositionedElement) obj).f24824b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24824b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E0.X, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f4044s0 = this.f24824b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((E0.X) abstractC4325q).f4044s0 = this.f24824b;
    }
}
