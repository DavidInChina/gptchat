package x6;

import android.gov.nist.core.Separators;
import z.AbstractC6708l;

/* renamed from: x6.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6341v0 {

    /* renamed from: a  reason: collision with root package name */
    public final D0 f49452a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49453b;

    public C6341v0(D0 d02, int i10) {
        this.f49452a = d02;
        this.f49453b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6341v0)) {
            return false;
        }
        C6341v0 c6341v0 = (C6341v0) obj;
        if (this.f49452a == c6341v0.f49452a && this.f49453b == c6341v0.f49453b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        D0 d02 = this.f49452a;
        if (d02 == null) {
            i10 = 0;
        } else {
            i10 = d02.hashCode();
        }
        int i12 = i10 * 31;
        int i13 = this.f49453b;
        if (i13 != 0) {
            i11 = AbstractC6708l.f(i13);
        }
        return i12 + i11;
    }

    public final String toString() {
        return "DdSession(plan=" + this.f49452a + ", sessionPrecondition=" + AbstractC6287d.T(this.f49453b) + Separators.RPAREN;
    }
}
