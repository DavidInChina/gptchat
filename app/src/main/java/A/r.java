package A;

import id.AbstractC3557B;
import r0.AbstractC5352p;
import t0.C5644c;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final r0.z f285a = null;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5352p f286b = null;

    /* renamed from: c  reason: collision with root package name */
    public final C5644c f287c = null;

    /* renamed from: d  reason: collision with root package name */
    public r0.E f288d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3557B.K(this.f285a, rVar.f285a) && AbstractC3557B.K(this.f286b, rVar.f286b) && AbstractC3557B.K(this.f287c, rVar.f287c) && AbstractC3557B.K(this.f288d, rVar.f288d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        r0.z zVar = this.f285a;
        int i13 = 0;
        if (zVar == null) {
            i10 = 0;
        } else {
            i10 = zVar.hashCode();
        }
        int i14 = i10 * 31;
        AbstractC5352p abstractC5352p = this.f286b;
        if (abstractC5352p == null) {
            i11 = 0;
        } else {
            i11 = abstractC5352p.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        C5644c c5644c = this.f287c;
        if (c5644c == null) {
            i12 = 0;
        } else {
            i12 = c5644c.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        r0.E e10 = this.f288d;
        if (e10 != null) {
            i13 = e10.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f285a + ", canvas=" + this.f286b + ", canvasDrawScope=" + this.f287c + ", borderPath=" + this.f288d + ')';
    }
}
