package androidx.compose.ui.draw;

import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import o0.C4868c;
import o0.C4869d;
import wf.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "LG0/X;", "Lo0/c;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DrawWithCacheElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24782b;

    public DrawWithCacheElement(k kVar) {
        this.f24782b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && AbstractC3557B.K(this.f24782b, ((DrawWithCacheElement) obj).f24782b);
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24782b.hashCode();
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new C4868c(new C4869d(), this.f24782b);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C4868c c4868c = (C4868c) abstractC4325q;
        c4868c.f40414u0 = this.f24782b;
        c4868c.A0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f24782b + ')';
    }
}
