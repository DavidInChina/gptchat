package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class E1 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f48948a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f48949b;

    /* renamed from: c  reason: collision with root package name */
    public final Number f48950c;

    /* renamed from: d  reason: collision with root package name */
    public final Number f48951d;

    public E1(Number number, Number number2, Number number3, Number number4) {
        this.f48948a = number;
        this.f48949b = number2;
        this.f48950c = number3;
        this.f48951d = number4;
    }

    public final I8.u a() {
        I8.u uVar = new I8.u();
        uVar.V(this.f48948a, "min");
        uVar.V(this.f48949b, "max");
        uVar.V(this.f48950c, "average");
        Number number = this.f48951d;
        if (number != null) {
            uVar.V(number, "metric_max");
        }
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1)) {
            return false;
        }
        E1 e12 = (E1) obj;
        if (AbstractC3557B.K(this.f48948a, e12.f48948a) && AbstractC3557B.K(this.f48949b, e12.f48949b) && AbstractC3557B.K(this.f48950c, e12.f48950c) && AbstractC3557B.K(this.f48951d, e12.f48951d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f48949b.hashCode();
        int hashCode2 = (this.f48950c.hashCode() + ((hashCode + (this.f48948a.hashCode() * 31)) * 31)) * 31;
        Number number = this.f48951d;
        if (number == null) {
            i10 = 0;
        } else {
            i10 = number.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        return "FlutterBuildTime(min=" + this.f48948a + ", max=" + this.f48949b + ", average=" + this.f48950c + ", metricMax=" + this.f48951d + Separators.RPAREN;
    }
}
