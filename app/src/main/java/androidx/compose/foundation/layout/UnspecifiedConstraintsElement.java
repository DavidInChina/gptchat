package androidx.compose.foundation.layout;

import E.x0;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "LG0/X;", "LE/x0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class UnspecifiedConstraintsElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24723b;

    /* renamed from: c  reason: collision with root package name */
    public final float f24724c;

    public UnspecifiedConstraintsElement(float f6, float f10) {
        this.f24723b = f6;
        this.f24724c = f10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!Z0.e.a(this.f24723b, unspecifiedConstraintsElement.f24723b) || !Z0.e.a(this.f24724c, unspecifiedConstraintsElement.f24724c)) {
            return false;
        }
        return true;
    }

    @Override // G0.X
    public final int hashCode() {
        return Float.floatToIntBits(this.f24724c) + (Float.floatToIntBits(this.f24723b) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.x0, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3978s0 = this.f24723b;
        abstractC4325q.f3979t0 = this.f24724c;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        x0 x0Var = (x0) abstractC4325q;
        x0Var.f3978s0 = this.f24723b;
        x0Var.f3979t0 = this.f24724c;
    }
}
