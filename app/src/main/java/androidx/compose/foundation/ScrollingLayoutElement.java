package androidx.compose.foundation;

import A.Z0;
import A.b1;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "LG0/X;", "LA/b1;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final Z0 f24672b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24673c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f24674d;

    public ScrollingLayoutElement(Z0 z02, boolean z10, boolean z11) {
        this.f24672b = z02;
        this.f24673c = z10;
        this.f24674d = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!AbstractC3557B.K(this.f24672b, scrollingLayoutElement.f24672b) || this.f24673c != scrollingLayoutElement.f24673c || this.f24674d != scrollingLayoutElement.f24674d) {
            return false;
        }
        return true;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int hashCode = this.f24672b.hashCode() * 31;
        int i11 = 1237;
        if (this.f24673c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f24674d) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A.b1, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f174s0 = this.f24672b;
        abstractC4325q.f175t0 = this.f24673c;
        abstractC4325q.f176u0 = this.f24674d;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        b1 b1Var = (b1) abstractC4325q;
        b1Var.f174s0 = this.f24672b;
        b1Var.f175t0 = this.f24673c;
        b1Var.f176u0 = this.f24674d;
    }
}
