package androidx.compose.foundation.layout;

import E.C0418d0;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "LG0/X;", "LE/d0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OffsetPxElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final k f24712b;

    public OffsetPxElement(k kVar) {
        this.f24712b = kVar;
    }

    public final boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement == null) {
            return false;
        }
        return AbstractC3557B.K(this.f24712b, offsetPxElement.f24712b);
    }

    @Override // G0.X
    public final int hashCode() {
        return (this.f24712b.hashCode() * 31) + 1231;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.d0, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3854s0 = this.f24712b;
        abstractC4325q.f3855t0 = true;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0418d0 c0418d0 = (C0418d0) abstractC4325q;
        c0418d0.f3854s0 = this.f24712b;
        c0418d0.f3855t0 = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f24712b + ", rtlAware=true)";
    }
}
