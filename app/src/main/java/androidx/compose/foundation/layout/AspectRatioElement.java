package androidx.compose.foundation.layout;

import E.C0430n;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "LG0/X;", "LE/n;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AspectRatioElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24700b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24701c;

    public AspectRatioElement(boolean z10) {
        this.f24701c = z10;
    }

    public final boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.f24700b == aspectRatioElement.f24700b) {
            if (this.f24701c == ((AspectRatioElement) obj).f24701c) {
                return true;
            }
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f24700b) * 31;
        if (this.f24701c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return floatToIntBits + i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.n, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3919s0 = this.f24700b;
        abstractC4325q.f3920t0 = this.f24701c;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0430n c0430n = (C0430n) abstractC4325q;
        c0430n.f3919s0 = this.f24700b;
        c0430n.f3920t0 = this.f24701c;
    }
}
