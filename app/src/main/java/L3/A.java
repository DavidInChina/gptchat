package L3;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final long f10663a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10664b;

    public A(long j6, long j10) {
        this.f10663a = j6;
        this.f10664b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC3557B.K(A.class, obj.getClass())) {
            return false;
        }
        A a5 = (A) obj;
        if (a5.f10663a == this.f10663a && a5.f10664b == this.f10664b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f10663a;
        long j10 = this.f10664b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f10663a + ", flexIntervalMillis=" + this.f10664b + '}';
    }
}
