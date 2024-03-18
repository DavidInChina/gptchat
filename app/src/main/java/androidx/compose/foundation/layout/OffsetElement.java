package androidx.compose.foundation.layout;

import E.C0416c0;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "LG0/X;", "LE/c0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OffsetElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24710b;

    /* renamed from: c  reason: collision with root package name */
    public final float f24711c;

    public OffsetElement(float f6, float f10) {
        this.f24710b = f6;
        this.f24711c = f10;
    }

    public final boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement == null) {
            return false;
        }
        if (Z0.e.a(this.f24710b, offsetElement.f24710b) && Z0.e.a(this.f24711c, offsetElement.f24711c)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        return ((Float.floatToIntBits(this.f24711c) + (Float.floatToIntBits(this.f24710b) * 31)) * 31) + 1231;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.c0] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3850s0 = this.f24710b;
        abstractC4325q.f3851t0 = this.f24711c;
        abstractC4325q.f3852u0 = true;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0416c0 c0416c0 = (C0416c0) abstractC4325q;
        c0416c0.f3850s0 = this.f24710b;
        c0416c0.f3851t0 = this.f24711c;
        c0416c0.f3852u0 = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) Z0.e.b(this.f24710b)) + ", y=" + ((Object) Z0.e.b(this.f24711c)) + ", rtlAware=true)";
    }
}
