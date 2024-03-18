package androidx.compose.foundation.layout;

import E.C0415c;
import E0.AbstractC0442a;
import E0.C0458q;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import y.AbstractC6463a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "LG0/X;", "LE/c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AlignmentLineOffsetDpElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0442a f24697b;

    /* renamed from: c  reason: collision with root package name */
    public final float f24698c;

    /* renamed from: d  reason: collision with root package name */
    public final float f24699d;

    public AlignmentLineOffsetDpElement(C0458q c0458q, float f6, float f10) {
        this.f24697b = c0458q;
        this.f24698c = f6;
        this.f24699d = f10;
        if ((f6 < 0.0f && !Z0.e.a(f6, Float.NaN)) || (f10 < 0.0f && !Z0.e.a(f10, Float.NaN))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public final boolean equals(Object obj) {
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetDpElement) {
            alignmentLineOffsetDpElement = (AlignmentLineOffsetDpElement) obj;
        } else {
            alignmentLineOffsetDpElement = null;
        }
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        if (AbstractC3557B.K(this.f24697b, alignmentLineOffsetDpElement.f24697b) && Z0.e.a(this.f24698c, alignmentLineOffsetDpElement.f24698c) && Z0.e.a(this.f24699d, alignmentLineOffsetDpElement.f24699d)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        return Float.floatToIntBits(this.f24699d) + AbstractC6463a.e(this.f24698c, this.f24697b.hashCode() * 31, 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, E.c] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3847s0 = this.f24697b;
        abstractC4325q.f3848t0 = this.f24698c;
        abstractC4325q.f3849u0 = this.f24699d;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0415c c0415c = (C0415c) abstractC4325q;
        c0415c.f3847s0 = this.f24697b;
        c0415c.f3848t0 = this.f24698c;
        c0415c.f3849u0 = this.f24699d;
    }
}
