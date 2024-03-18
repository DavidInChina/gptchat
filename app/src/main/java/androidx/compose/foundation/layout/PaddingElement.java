package androidx.compose.foundation.layout;

import E.C0422f0;
import G0.X;
import kotlin.Metadata;
import l0.AbstractC4325q;
import y.AbstractC6463a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "LG0/X;", "LE/f0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PaddingElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24713b;

    /* renamed from: c  reason: collision with root package name */
    public final float f24714c;

    /* renamed from: d  reason: collision with root package name */
    public final float f24715d;

    /* renamed from: e  reason: collision with root package name */
    public final float f24716e;

    public PaddingElement(float f6, float f10, float f11, float f12) {
        this.f24713b = f6;
        this.f24714c = f10;
        this.f24715d = f11;
        this.f24716e = f12;
        if ((f6 < 0.0f && !Z0.e.a(f6, Float.NaN)) || ((f10 < 0.0f && !Z0.e.a(f10, Float.NaN)) || ((f11 < 0.0f && !Z0.e.a(f11, Float.NaN)) || (f12 < 0.0f && !Z0.e.a(f12, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !Z0.e.a(this.f24713b, paddingElement.f24713b) || !Z0.e.a(this.f24714c, paddingElement.f24714c) || !Z0.e.a(this.f24715d, paddingElement.f24715d) || !Z0.e.a(this.f24716e, paddingElement.f24716e)) {
            return false;
        }
        return true;
    }

    @Override // G0.X
    public final int hashCode() {
        return ((Float.floatToIntBits(this.f24716e) + AbstractC6463a.e(this.f24715d, AbstractC6463a.e(this.f24714c, Float.floatToIntBits(this.f24713b) * 31, 31), 31)) * 31) + 1231;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.f0, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3863s0 = this.f24713b;
        abstractC4325q.f3864t0 = this.f24714c;
        abstractC4325q.f3865u0 = this.f24715d;
        abstractC4325q.f3866v0 = this.f24716e;
        abstractC4325q.f3867w0 = true;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0422f0 c0422f0 = (C0422f0) abstractC4325q;
        c0422f0.f3863s0 = this.f24713b;
        c0422f0.f3864t0 = this.f24714c;
        c0422f0.f3865u0 = this.f24715d;
        c0422f0.f3866v0 = this.f24716e;
        c0422f0.f3867w0 = true;
    }
}
