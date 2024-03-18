package androidx.compose.foundation.lazy;

import G.C0565u;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import z.AbstractC6659E;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/AnimateItemElement;", "LG0/X;", "LG/u;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AnimateItemElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6659E f24748b = null;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6659E f24749c;

    public AnimateItemElement(AbstractC6659E abstractC6659E) {
        this.f24749c = abstractC6659E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateItemElement)) {
            return false;
        }
        AnimateItemElement animateItemElement = (AnimateItemElement) obj;
        return AbstractC3557B.K(this.f24748b, animateItemElement.f24748b) && AbstractC3557B.K(this.f24749c, animateItemElement.f24749c);
    }

    @Override // G0.X
    public final int hashCode() {
        int i10 = 0;
        AbstractC6659E abstractC6659E = this.f24748b;
        int hashCode = (abstractC6659E == null ? 0 : abstractC6659E.hashCode()) * 31;
        AbstractC6659E abstractC6659E2 = this.f24749c;
        if (abstractC6659E2 != null) {
            i10 = abstractC6659E2.hashCode();
        }
        return hashCode + i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, G.u] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f5568s0 = this.f24748b;
        abstractC4325q.f5569t0 = this.f24749c;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0565u c0565u = (C0565u) abstractC4325q;
        c0565u.f5568s0 = this.f24748b;
        c0565u.f5569t0 = this.f24749c;
    }

    public final String toString() {
        return "AnimateItemElement(appearanceSpec=" + this.f24748b + ", placementSpec=" + this.f24749c + ')';
    }
}
