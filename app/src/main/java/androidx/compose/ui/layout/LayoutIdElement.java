package androidx.compose.ui.layout;

import E0.C0462v;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "LG0/X;", "LE0/v;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutIdElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final Object f24823b;

    public LayoutIdElement(String str) {
        this.f24823b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && AbstractC3557B.K(this.f24823b, ((LayoutIdElement) obj).f24823b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24823b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E0.v, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f4091s0 = this.f24823b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((C0462v) abstractC4325q).f4091s0 = this.f24823b;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f24823b + ')';
    }
}
