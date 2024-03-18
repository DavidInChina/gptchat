package androidx.compose.ui.input.rotary;

import D0.b;
import G0.X;
import H0.C0702s;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "LG0/X;", "LD0/b;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RotaryInputElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24821b = C0702s.f7025i0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        return AbstractC3557B.K(this.f24821b, ((RotaryInputElement) obj).f24821b) && AbstractC3557B.K(null, null);
    }

    @Override // G0.X
    public final int hashCode() {
        k kVar = this.f24821b;
        return (kVar == null ? 0 : kVar.hashCode()) * 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, D0.b] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3197s0 = this.f24821b;
        abstractC4325q.f3198t0 = null;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        b bVar = (b) abstractC4325q;
        bVar.f3197s0 = this.f24821b;
        bVar.f3198t0 = null;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f24821b + ", onPreRotaryScrollEvent=null)";
    }
}
