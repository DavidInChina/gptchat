package androidx.compose.ui.draw;

import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import o0.C4873h;
import wf.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "LG0/X;", "Lo0/h;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DrawWithContentElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24783b;

    public DrawWithContentElement(k kVar) {
        this.f24783b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && AbstractC3557B.K(this.f24783b, ((DrawWithContentElement) obj).f24783b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24783b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, o0.h] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f40419s0 = this.f24783b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((C4873h) abstractC4325q).f40419s0 = this.f24783b;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f24783b + ')';
    }
}
