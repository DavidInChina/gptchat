package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f1969a;

    /* renamed from: b  reason: collision with root package name */
    public final q f1970b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1971c = "log";

    /* renamed from: d  reason: collision with root package name */
    public final String f1972d = "error";

    public s(String str, q qVar) {
        AbstractC3557B.c0("message", str);
        this.f1969a = str;
        this.f1970b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3557B.K(this.f1969a, sVar.f1969a) && AbstractC3557B.K(this.f1970b, sVar.f1970b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f1969a.hashCode() * 31;
        q qVar = this.f1970b;
        if (qVar == null) {
            i10 = 0;
        } else {
            i10 = qVar.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Telemetry(message=" + this.f1969a + ", error=" + this.f1970b + Separators.RPAREN;
    }
}
