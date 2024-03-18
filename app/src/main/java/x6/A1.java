package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class A1 {

    /* renamed from: a  reason: collision with root package name */
    public final M1 f48912a;

    /* renamed from: b  reason: collision with root package name */
    public final S1 f48913b;

    public A1(M1 m12, S1 s12) {
        this.f48912a = m12;
        this.f48913b = s12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a12 = (A1) obj;
        if (this.f48912a == a12.f48912a && this.f48913b == a12.f48913b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        M1 m12 = this.f48912a;
        if (m12 == null) {
            i10 = 0;
        } else {
            i10 = m12.hashCode();
        }
        int i12 = i10 * 31;
        S1 s12 = this.f48913b;
        if (s12 != null) {
            i11 = s12.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "DdSession(plan=" + this.f48912a + ", sessionPrecondition=" + this.f48913b + Separators.RPAREN;
    }
}
