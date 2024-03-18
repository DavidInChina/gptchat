package Gg;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6502a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6503b;

    public a(Object obj, Object obj2) {
        this.f6502a = obj;
        this.f6503b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3557B.K(this.f6502a, aVar.f6502a) && AbstractC3557B.K(this.f6503b, aVar.f6503b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f6502a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i12 = i10 * 31;
        Object obj2 = this.f6503b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f6502a + ", upper=" + this.f6503b + ')';
    }
}
