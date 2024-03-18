package androidx.compose.ui.layout;

import E0.A;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.o;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "LG0/X;", "LE0/A;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LayoutElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final o f24822b;

    public LayoutElement(o oVar) {
        this.f24822b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && AbstractC3557B.K(this.f24822b, ((LayoutElement) obj).f24822b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24822b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E0.A] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3984s0 = this.f24822b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((A) abstractC4325q).f3984s0 = this.f24822b;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f24822b + ')';
    }
}
