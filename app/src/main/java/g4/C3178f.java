package g4;

import id.AbstractC3557B;
import u0.AbstractC5824b;

/* renamed from: g4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3178f extends AbstractC3181i {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5824b f31219a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.e f31220b;

    public C3178f(AbstractC5824b abstractC5824b, q4.e eVar) {
        this.f31219a = abstractC5824b;
        this.f31220b = eVar;
    }

    @Override // g4.AbstractC3181i
    public final AbstractC5824b a() {
        return this.f31219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3178f)) {
            return false;
        }
        C3178f c3178f = (C3178f) obj;
        if (AbstractC3557B.K(this.f31219a, c3178f.f31219a) && AbstractC3557B.K(this.f31220b, c3178f.f31220b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        AbstractC5824b abstractC5824b = this.f31219a;
        if (abstractC5824b == null) {
            i10 = 0;
        } else {
            i10 = abstractC5824b.hashCode();
        }
        return this.f31220b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f31219a + ", result=" + this.f31220b + ')';
    }
}
