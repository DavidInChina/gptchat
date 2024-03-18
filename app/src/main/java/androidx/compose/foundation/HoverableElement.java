package androidx.compose.foundation;

import A.C0031m0;
import D.m;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "LG0/X;", "LA/m0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class HoverableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final m f24661b;

    public HoverableElement(m mVar) {
        this.f24661b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HoverableElement) && AbstractC3557B.K(((HoverableElement) obj).f24661b, this.f24661b)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        return this.f24661b.hashCode() * 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, A.m0] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f254s0 = this.f24661b;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0031m0 c0031m0 = (C0031m0) abstractC4325q;
        m mVar = c0031m0.f254s0;
        m mVar2 = this.f24661b;
        if (!AbstractC3557B.K(mVar, mVar2)) {
            c0031m0.C0();
            c0031m0.f254s0 = mVar2;
        }
    }
}
