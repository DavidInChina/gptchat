package W;

import h0.C3288a;
import id.AbstractC3557B;

/* renamed from: W.k1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1573k1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20187a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.o f20188b;

    public C1573k1(C1585m3 c1585m3, C3288a c3288a) {
        this.f20187a = c1585m3;
        this.f20188b = c3288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573k1)) {
            return false;
        }
        C1573k1 c1573k1 = (C1573k1) obj;
        if (AbstractC3557B.K(this.f20187a, c1573k1.f20187a) && AbstractC3557B.K(this.f20188b, c1573k1.f20188b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f20187a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return this.f20188b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f20187a + ", transition=" + this.f20188b + ')';
    }
}
