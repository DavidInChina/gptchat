package androidx.compose.foundation.layout;

import E.H;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;
import z.AbstractC6708l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "LG0/X;", "LE/H;", "E/G", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FillElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final int f24703b;

    /* renamed from: c  reason: collision with root package name */
    public final float f24704c;

    public FillElement(int i10, float f6) {
        this.f24703b = i10;
        this.f24704c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.f24703b == fillElement.f24703b && this.f24704c == fillElement.f24704c) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        return Float.floatToIntBits(this.f24704c) + (AbstractC6708l.f(this.f24703b) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.H] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3773s0 = this.f24703b;
        abstractC4325q.f3774t0 = this.f24704c;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        H h10 = (H) abstractC4325q;
        h10.f3773s0 = this.f24703b;
        h10.f3774t0 = this.f24704c;
    }
}
