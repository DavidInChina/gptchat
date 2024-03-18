package androidx.compose.ui.input.pointer;

import B0.C0184a;
import B0.C0197n;
import B0.C0198o;
import B0.q;
import G0.AbstractC0579h;
import G0.X;
import L.AbstractC0857k0;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "LG0/X;", "LB0/o;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final q f24815b = AbstractC0857k0.f10217b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24816c;

    public PointerHoverIconModifierElement(boolean z10) {
        this.f24816c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return AbstractC3557B.K(this.f24815b, pointerHoverIconModifierElement.f24815b) && this.f24816c == pointerHoverIconModifierElement.f24816c;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11 = ((C0184a) this.f24815b).f1624b * 31;
        if (this.f24816c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return i11 + i10;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new C0198o(this.f24815b, this.f24816c);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0198o c0198o = (C0198o) abstractC4325q;
        q qVar = c0198o.f1662s0;
        q qVar2 = this.f24815b;
        if (!AbstractC3557B.K(qVar, qVar2)) {
            c0198o.f1662s0 = qVar2;
            if (c0198o.f1664u0) {
                c0198o.C0();
            }
        }
        boolean z10 = c0198o.f1663t0;
        boolean z11 = this.f24816c;
        if (z10 != z11) {
            c0198o.f1663t0 = z11;
            if (z11) {
                if (c0198o.f1664u0) {
                    c0198o.A0();
                    return;
                }
                return;
            }
            boolean z12 = c0198o.f1664u0;
            if (z12 && z12) {
                if (!z11) {
                    ?? obj = new Object();
                    AbstractC0579h.F(c0198o, new C0197n(1, obj));
                    C0198o c0198o2 = (C0198o) obj.f37622Y;
                    if (c0198o2 != null) {
                        c0198o = c0198o2;
                    }
                }
                c0198o.A0();
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb2.append(this.f24815b);
        sb2.append(", overrideDescendants=");
        return AbstractC6463a.l(sb2, this.f24816c, ')');
    }
}
