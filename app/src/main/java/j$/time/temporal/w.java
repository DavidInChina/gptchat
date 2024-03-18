package j$.time.temporal;

import j$.time.DateTimeException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a  reason: collision with root package name */
    private final long f35142a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35143b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35144c;

    /* renamed from: d  reason: collision with root package name */
    private final long f35145d;

    private w(long j6, long j10, long j11, long j12) {
        this.f35142a = j6;
        this.f35143b = j10;
        this.f35144c = j11;
        this.f35145d = j12;
    }

    private String c(long j6, r rVar) {
        if (rVar == null) {
            return "Invalid value (valid values " + this + "): " + j6;
        }
        return "Invalid value for " + rVar + " (valid values " + this + "): " + j6;
    }

    public static w j(long j6, long j10) {
        if (j6 <= j10) {
            return new w(j6, j6, j10, j10);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static w k(long j6, long j10, long j11) {
        if (j6 <= 1) {
            if (j10 > j11) {
                throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
            }
            if (1 > j11) {
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            return new w(j6, 1L, j10, j11);
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j6 = this.f35142a;
        long j10 = this.f35143b;
        if (j6 <= j10) {
            long j11 = this.f35144c;
            long j12 = this.f35145d;
            if (j11 > j12) {
                throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
            }
            if (j10 > j12) {
                throw new InvalidObjectException("Minimum value must be less than maximum value");
            }
            return;
        }
        throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
    }

    public final int a(long j6, r rVar) {
        if (!h() || !i(j6)) {
            throw new DateTimeException(c(j6, rVar));
        }
        return (int) j6;
    }

    public final void b(long j6, r rVar) {
        if (i(j6)) {
            return;
        }
        throw new DateTimeException(c(j6, rVar));
    }

    public final long d() {
        return this.f35145d;
    }

    public final long e() {
        return this.f35142a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f35142a == wVar.f35142a && this.f35143b == wVar.f35143b && this.f35144c == wVar.f35144c && this.f35145d == wVar.f35145d;
    }

    public final long f() {
        return this.f35144c;
    }

    public final boolean g() {
        return this.f35142a == this.f35143b && this.f35144c == this.f35145d;
    }

    public final boolean h() {
        return this.f35142a >= -2147483648L && this.f35145d <= 2147483647L;
    }

    public final int hashCode() {
        long j6 = this.f35143b;
        long j10 = this.f35142a + (j6 << 16) + (j6 >> 48);
        long j11 = this.f35144c;
        long j12 = j10 + (j11 << 32) + (j11 >> 32);
        long j13 = this.f35145d;
        long j14 = j12 + (j13 << 48) + (j13 >> 16);
        return (int) ((j14 >>> 32) ^ j14);
    }

    public final boolean i(long j6) {
        return j6 >= this.f35142a && j6 <= this.f35145d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j6 = this.f35142a;
        sb2.append(j6);
        long j10 = this.f35143b;
        if (j6 != j10) {
            sb2.append('/');
            sb2.append(j10);
        }
        sb2.append(" - ");
        long j11 = this.f35144c;
        sb2.append(j11);
        long j12 = this.f35145d;
        if (j11 != j12) {
            sb2.append('/');
            sb2.append(j12);
        }
        return sb2.toString();
    }
}
