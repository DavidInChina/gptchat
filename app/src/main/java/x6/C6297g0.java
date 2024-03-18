package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6297g0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49314a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49315b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49316c;

    public C6297g0(String str, String str2, Boolean bool) {
        AbstractC3557B.c0("testId", str);
        AbstractC3557B.c0("resultId", str2);
        this.f49314a = str;
        this.f49315b = str2;
        this.f49316c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6297g0)) {
            return false;
        }
        C6297g0 c6297g0 = (C6297g0) obj;
        if (AbstractC3557B.K(this.f49314a, c6297g0.f49314a) && AbstractC3557B.K(this.f49315b, c6297g0.f49315b) && AbstractC3557B.K(this.f49316c, c6297g0.f49316c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f49315b, this.f49314a.hashCode() * 31, 31);
        Boolean bool = this.f49316c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f49314a + ", resultId=" + this.f49315b + ", injected=" + this.f49316c + Separators.RPAREN;
    }
}
