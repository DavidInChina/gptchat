package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.k1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6310k1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49367a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49368b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49369c;

    public C6310k1(String str, String str2, Boolean bool) {
        AbstractC3557B.c0("testId", str);
        AbstractC3557B.c0("resultId", str2);
        this.f49367a = str;
        this.f49368b = str2;
        this.f49369c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6310k1)) {
            return false;
        }
        C6310k1 c6310k1 = (C6310k1) obj;
        if (AbstractC3557B.K(this.f49367a, c6310k1.f49367a) && AbstractC3557B.K(this.f49368b, c6310k1.f49368b) && AbstractC3557B.K(this.f49369c, c6310k1.f49369c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f49368b, this.f49367a.hashCode() * 31, 31);
        Boolean bool = this.f49369c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f49367a + ", resultId=" + this.f49368b + ", injected=" + this.f49369c + Separators.RPAREN;
    }
}
