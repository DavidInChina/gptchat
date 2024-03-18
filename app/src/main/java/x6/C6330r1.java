package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.r1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6330r1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49428a;

    public C6330r1(String str) {
        this.f49428a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6330r1) && AbstractC3557B.K(this.f49428a, ((C6330r1) obj).f49428a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49428a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("CiTest(testExecutionId="), this.f49428a, Separators.RPAREN);
    }
}
