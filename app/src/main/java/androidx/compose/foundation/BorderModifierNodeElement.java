package androidx.compose.foundation;

import A.C0049w;
import G0.X;
import Z0.e;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import o0.AbstractC4867b;
import o0.C4868c;
import r0.AbstractC5350n;
import r0.L;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "LG0/X;", "LA/w;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BorderModifierNodeElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24644b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5350n f24645c;

    /* renamed from: d  reason: collision with root package name */
    public final L f24646d;

    public BorderModifierNodeElement(float f6, AbstractC5350n abstractC5350n, L l10) {
        this.f24644b = f6;
        this.f24645c = abstractC5350n;
        this.f24646d = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return e.a(this.f24644b, borderModifierNodeElement.f24644b) && AbstractC3557B.K(this.f24645c, borderModifierNodeElement.f24645c) && AbstractC3557B.K(this.f24646d, borderModifierNodeElement.f24646d);
    }

    @Override // G0.X
    public final int hashCode() {
        int hashCode = this.f24645c.hashCode();
        return this.f24646d.hashCode() + ((hashCode + (Float.floatToIntBits(this.f24644b) * 31)) * 31);
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new C0049w(this.f24644b, this.f24645c, this.f24646d);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0049w c0049w = (C0049w) abstractC4325q;
        float f6 = c0049w.f316v0;
        float f10 = this.f24644b;
        boolean a5 = e.a(f6, f10);
        AbstractC4867b abstractC4867b = c0049w.f319y0;
        if (!a5) {
            c0049w.f316v0 = f10;
            ((C4868c) abstractC4867b).A0();
        }
        AbstractC5350n abstractC5350n = c0049w.f317w0;
        AbstractC5350n abstractC5350n2 = this.f24645c;
        if (!AbstractC3557B.K(abstractC5350n, abstractC5350n2)) {
            c0049w.f317w0 = abstractC5350n2;
            ((C4868c) abstractC4867b).A0();
        }
        L l10 = c0049w.f318x0;
        L l11 = this.f24646d;
        if (!AbstractC3557B.K(l10, l11)) {
            c0049w.f318x0 = l11;
            ((C4868c) abstractC4867b).A0();
        }
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) e.b(this.f24644b)) + ", brush=" + this.f24645c + ", shape=" + this.f24646d + ')';
    }
}
