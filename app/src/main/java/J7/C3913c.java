package j7;

import java.util.Set;

/* renamed from: j7.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3913c {

    /* renamed from: a  reason: collision with root package name */
    public final long f36034a;

    /* renamed from: b  reason: collision with root package name */
    public final long f36035b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f36036c;

    public C3913c(long j6, long j10, Set set) {
        this.f36034a = j6;
        this.f36035b = j10;
        this.f36036c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3913c)) {
            return false;
        }
        C3913c c3913c = (C3913c) obj;
        if (this.f36034a == c3913c.f36034a && this.f36035b == c3913c.f36035b && this.f36036c.equals(c3913c.f36036c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f36034a;
        long j10 = this.f36035b;
        return ((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f36036c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f36034a + ", maxAllowedDelay=" + this.f36035b + ", flags=" + this.f36036c + "}";
    }
}
