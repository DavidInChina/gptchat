package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class E0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f48945a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48946b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f48947c;

    public E0(String str, String str2, Boolean bool) {
        AbstractC3557B.c0("testId", str);
        AbstractC3557B.c0("resultId", str2);
        this.f48945a = str;
        this.f48946b = str2;
        this.f48947c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (AbstractC3557B.K(this.f48945a, e02.f48945a) && AbstractC3557B.K(this.f48946b, e02.f48946b) && AbstractC3557B.K(this.f48947c, e02.f48947c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f48946b, this.f48945a.hashCode() * 31, 31);
        Boolean bool = this.f48947c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f48945a + ", resultId=" + this.f48946b + ", injected=" + this.f48947c + Separators.RPAREN;
    }
}
