package androidx.compose.ui.focus;

import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import p0.C5034a;
import wf.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "LG0/X;", "Lp0/a;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusChangedElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24790b;

    public FocusChangedElement(k kVar) {
        this.f24790b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && AbstractC3557B.K(this.f24790b, ((FocusChangedElement) obj).f24790b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24790b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p0.a, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f41673s0 = this.f24790b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((C5034a) abstractC4325q).f41673s0 = this.f24790b;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f24790b + ')';
    }
}
