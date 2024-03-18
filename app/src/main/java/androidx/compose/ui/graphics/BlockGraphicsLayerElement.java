package androidx.compose.ui.graphics;

import G0.AbstractC0579h;
import G0.X;
import G0.g0;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import r0.C5349m;
import wf.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "LG0/X;", "Lr0/m;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BlockGraphicsLayerElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24794b;

    public BlockGraphicsLayerElement(k kVar) {
        this.f24794b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && AbstractC3557B.K(this.f24794b, ((BlockGraphicsLayerElement) obj).f24794b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24794b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, r0.m] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f44251s0 = this.f24794b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C5349m c5349m = (C5349m) abstractC4325q;
        c5349m.f44251s0 = this.f24794b;
        g0 g0Var = AbstractC0579h.z(c5349m, 2).f5771o0;
        if (g0Var != null) {
            g0Var.Y0(c5349m.f44251s0, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f24794b + ')';
    }
}
