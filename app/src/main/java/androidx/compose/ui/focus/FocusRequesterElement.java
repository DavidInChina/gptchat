package androidx.compose.ui.focus;

import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import p0.l;
import p0.n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "LG0/X;", "Lp0/n;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusRequesterElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final l f24792b;

    public FocusRequesterElement(l lVar) {
        this.f24792b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && AbstractC3557B.K(this.f24792b, ((FocusRequesterElement) obj).f24792b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24792b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p0.n, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f41706s0 = this.f24792b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        n nVar = (n) abstractC4325q;
        nVar.f41706s0.f41705a.m(nVar);
        l lVar = this.f24792b;
        nVar.f41706s0 = lVar;
        lVar.f41705a.b(nVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f24792b + ')';
    }
}
