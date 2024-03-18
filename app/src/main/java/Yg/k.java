package Yg;

import ah.AbstractC1998i;
import com.revenuecat.purchases.common.UtilsKt;
import id.AbstractC3557B;

@AbstractC1998i(with = Zg.k.class)
/* loaded from: classes.dex */
public final class k extends l {
    public static final j Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final long f22410c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22411d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22412e;

    public k(long j6) {
        this.f22410c = j6;
        if (j6 > 0) {
            if (j6 % 3600000000000L == 0) {
                this.f22411d = "HOUR";
                this.f22412e = j6 / 3600000000000L;
                return;
            } else if (j6 % 60000000000L == 0) {
                this.f22411d = "MINUTE";
                this.f22412e = j6 / 60000000000L;
                return;
            } else {
                long j10 = 1000000000;
                if (j6 % j10 == 0) {
                    this.f22411d = "SECOND";
                    this.f22412e = j6 / j10;
                    return;
                }
                long j11 = (long) UtilsKt.MICROS_MULTIPLIER;
                if (j6 % j11 == 0) {
                    this.f22411d = "MILLISECOND";
                    this.f22412e = j6 / j11;
                    return;
                }
                long j12 = 1000;
                if (j6 % j12 == 0) {
                    this.f22411d = "MICROSECOND";
                    this.f22412e = j6 / j12;
                    return;
                }
                this.f22411d = "NANOSECOND";
                this.f22412e = j6;
                return;
            }
        }
        throw new IllegalArgumentException(("Unit duration must be positive, but was " + j6 + " ns.").toString());
    }

    public final k b(int i10) {
        return new k(Ad.l.c1(this.f22410c, i10));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                if (this.f22410c == ((k) obj).f22410c) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f22410c;
        return ((int) (j6 >> 32)) ^ ((int) j6);
    }

    public final String toString() {
        String str = this.f22411d;
        AbstractC3557B.c0("unit", str);
        long j6 = this.f22412e;
        if (j6 != 1) {
            return j6 + '-' + str;
        }
        return str;
    }
}
