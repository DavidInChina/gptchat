package j$.time;

import com.revenuecat.purchases.common.UtilsKt;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Duration f34874c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a  reason: collision with root package name */
    private final long f34875a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34876b;

    static {
        BigInteger.valueOf(1000000000L);
    }

    private Duration(long j6, int i10) {
        this.f34875a = j6;
        this.f34876b = i10;
    }

    private static Duration g(long j6, int i10) {
        return (((long) i10) | j6) == 0 ? f34874c : new Duration(j6, i10);
    }

    public static Duration ofMillis(long j6) {
        long j10 = j6 / 1000;
        int i10 = (int) (j6 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j10--;
        }
        return g(j10, i10 * UtilsKt.MICROS_MULTIPLIER);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Duration s(long j6) {
        return g(j6, 0);
    }

    public static Duration w(long j6, long j10) {
        return g(j$.com.android.tools.r8.a.k(j6, j$.com.android.tools.r8.a.p(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.o(j10, 1000000000L));
    }

    private Object writeReplace() {
        return new q((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.f34875a, duration2.f34875a);
        return compare != 0 ? compare : this.f34876b - duration2.f34876b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f34875a == duration.f34875a && this.f34876b == duration.f34876b;
    }

    public final int hashCode() {
        long j6 = this.f34875a;
        return (this.f34876b * 51) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final int p() {
        return this.f34876b;
    }

    public final long r() {
        return this.f34875a;
    }

    public long toMillis() {
        long j6 = this.f34876b;
        long j10 = this.f34875a;
        if (j10 < 0) {
            j10++;
            j6 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.q(j10, 1000), j6 / 1000000);
    }

    public final String toString() {
        if (this == f34874c) {
            return "PT0S";
        }
        long j6 = this.f34875a;
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        int i11 = this.f34876b;
        long j10 = (i10 >= 0 || i11 <= 0) ? j6 : 1 + j6;
        long j11 = j10 / 3600;
        int i12 = (int) ((j10 % 3600) / 60);
        int i13 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('M');
        }
        if (i13 == 0 && i11 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (j6 >= 0 || i11 <= 0 || i13 != 0) {
            sb2.append(i13);
        } else {
            sb2.append("-0");
        }
        if (i11 > 0) {
            int length = sb2.length();
            sb2.append(j6 < 0 ? 2000000000 - i11 : i11 + 1000000000);
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(DataOutput dataOutput) {
        dataOutput.writeLong(this.f34875a);
        dataOutput.writeInt(this.f34876b);
    }
}
