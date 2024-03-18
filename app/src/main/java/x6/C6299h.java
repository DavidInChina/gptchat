package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6299h {

    /* renamed from: a  reason: collision with root package name */
    public final String f49320a;

    public C6299h(String str) {
        this.f49320a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6299h) && AbstractC3557B.K(this.f49320a, ((C6299h) obj).f49320a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49320a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("CiTest(testExecutionId="), this.f49320a, Separators.RPAREN);
    }
}
