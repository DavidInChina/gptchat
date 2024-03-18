package I9;

import id.AbstractC3557B;
import j$.time.LocalDate;
import t9.AbstractC5684a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class K0 implements P0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8204a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8205b;

    public K0(int i10, int i11) {
        this.f8204a = i10;
        this.f8205b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (this.f8204a == k02.f8204a && this.f8205b == k02.f8205b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8204a * 31) + this.f8205b;
    }

    public final String toString() {
        Yg.r rVar = new Yg.r(this.f8205b, this.f8204a, 1);
        Yg.r rVar2 = AbstractC5684a.f45797a;
        LocalDate localDate = rVar.f22420Y;
        int year = localDate.getYear();
        Yg.w.Companion.getClass();
        Yg.w a5 = Yg.v.a();
        Yg.p.Companion.getClass();
        if (year == P4.a.M0(new Yg.p(AbstractC6463a.n("instant(...)")), a5).a().f22420Y.getYear()) {
            String format = AbstractC5684a.f45800d.format(localDate);
            AbstractC3557B.Z(format);
            return format;
        }
        String format2 = AbstractC5684a.f45801e.format(localDate);
        AbstractC3557B.Z(format2);
        return format2;
    }
}
