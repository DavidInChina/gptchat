package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class U1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49106a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49107b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49108c;

    public U1(String str, String str2, Boolean bool) {
        AbstractC3557B.c0("testId", str);
        AbstractC3557B.c0("resultId", str2);
        this.f49106a = str;
        this.f49107b = str2;
        this.f49108c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U1)) {
            return false;
        }
        U1 u12 = (U1) obj;
        if (AbstractC3557B.K(this.f49106a, u12.f49106a) && AbstractC3557B.K(this.f49107b, u12.f49107b) && AbstractC3557B.K(this.f49108c, u12.f49108c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f49107b, this.f49106a.hashCode() * 31, 31);
        Boolean bool = this.f49108c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f49106a + ", resultId=" + this.f49107b + ", injected=" + this.f49108c + Separators.RPAREN;
    }
}
