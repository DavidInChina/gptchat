package pc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: pc.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5128g {

    /* renamed from: a  reason: collision with root package name */
    public final String f42986a;

    public /* synthetic */ C5128g(String str) {
        this.f42986a = str;
    }

    public static String a(String str) {
        return android.gov.nist.core.a.A("Id(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5128g)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f42986a, ((C5128g) obj).f42986a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f42986a.hashCode();
    }

    public final String toString() {
        return a(this.f42986a);
    }
}
