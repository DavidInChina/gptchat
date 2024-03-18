package androidx.compose.foundation.layout;

import E.u0;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;
import y.AbstractC6463a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "LG0/X;", "LE/u0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SizeElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24718b;

    /* renamed from: c  reason: collision with root package name */
    public final float f24719c;

    /* renamed from: d  reason: collision with root package name */
    public final float f24720d;

    /* renamed from: e  reason: collision with root package name */
    public final float f24721e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f24722f;

    public SizeElement(float f6, float f10, float f11, float f12, boolean z10) {
        this.f24718b = f6;
        this.f24719c = f10;
        this.f24720d = f11;
        this.f24721e = f12;
        this.f24722f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (Z0.e.a(this.f24718b, sizeElement.f24718b) && Z0.e.a(this.f24719c, sizeElement.f24719c) && Z0.e.a(this.f24720d, sizeElement.f24720d) && Z0.e.a(this.f24721e, sizeElement.f24721e) && this.f24722f == sizeElement.f24722f) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int e10 = AbstractC6463a.e(this.f24721e, AbstractC6463a.e(this.f24720d, AbstractC6463a.e(this.f24719c, Float.floatToIntBits(this.f24718b) * 31, 31), 31), 31);
        if (this.f24722f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return e10 + i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.u0, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3961s0 = this.f24718b;
        abstractC4325q.f3962t0 = this.f24719c;
        abstractC4325q.f3963u0 = this.f24720d;
        abstractC4325q.f3964v0 = this.f24721e;
        abstractC4325q.f3965w0 = this.f24722f;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        u0 u0Var = (u0) abstractC4325q;
        u0Var.f3961s0 = this.f24718b;
        u0Var.f3962t0 = this.f24719c;
        u0Var.f3963u0 = this.f24720d;
        u0Var.f3964v0 = this.f24721e;
        u0Var.f3965w0 = this.f24722f;
    }

    public /* synthetic */ SizeElement(float f6, float f10, float f11, float f12, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f6, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? Float.NaN : f11, (i10 & 8) != 0 ? Float.NaN : f12, true);
    }
}
