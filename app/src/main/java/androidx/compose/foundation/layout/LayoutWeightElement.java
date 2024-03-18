package androidx.compose.foundation.layout;

import E.Z;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "LG0/X;", "LE/Z;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutWeightElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24708b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24709c;

    public LayoutWeightElement(float f6, boolean z10) {
        this.f24708b = f6;
        this.f24709c = z10;
    }

    public final boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement == null) {
            return false;
        }
        if (this.f24708b == layoutWeightElement.f24708b && this.f24709c == layoutWeightElement.f24709c) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f24708b) * 31;
        if (this.f24709c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return floatToIntBits + i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.Z, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3831s0 = this.f24708b;
        abstractC4325q.f3832t0 = this.f24709c;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        Z z10 = (Z) abstractC4325q;
        z10.f3831s0 = this.f24708b;
        z10.f3832t0 = this.f24709c;
    }
}
