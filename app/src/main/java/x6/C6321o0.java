package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6321o0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49408a;

    public C6321o0(String str) {
        this.f49408a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6321o0) && AbstractC3557B.K(this.f49408a, ((C6321o0) obj).f49408a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49408a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("CiTest(testExecutionId="), this.f49408a, Separators.RPAREN);
    }
}
