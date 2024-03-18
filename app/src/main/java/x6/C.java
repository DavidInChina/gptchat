package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final String f48924a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48925b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f48926c;

    public C(String str, String str2, Boolean bool) {
        AbstractC3557B.c0("testId", str);
        AbstractC3557B.c0("resultId", str2);
        this.f48924a = str;
        this.f48925b = str2;
        this.f48926c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (AbstractC3557B.K(this.f48924a, c10.f48924a) && AbstractC3557B.K(this.f48925b, c10.f48925b) && AbstractC3557B.K(this.f48926c, c10.f48926c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f48925b, this.f48924a.hashCode() * 31, 31);
        Boolean bool = this.f48926c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f48924a + ", resultId=" + this.f48925b + ", injected=" + this.f48926c + Separators.RPAREN;
    }
}
