package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: O9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096c implements AbstractC1102f {
    public static final C1094b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13524a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13525b;

    public C1096c(int i10, String str, String str2) {
        if (3 == (i10 & 3)) {
            this.f13524a = str;
            this.f13525b = str2;
            return;
        }
        R4.b.e2(i10, 3, C1092a.f13518b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1096c)) {
            return false;
        }
        C1096c c1096c = (C1096c) obj;
        if (AbstractC3557B.K(this.f13524a, c1096c.f13524a) && AbstractC3557B.K(this.f13525b, c1096c.f13525b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13525b.hashCode() + (this.f13524a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiCodeContent(text=");
        sb2.append(this.f13524a);
        sb2.append(", contentType=");
        return R.a.t(sb2, this.f13525b, Separators.RPAREN);
    }
}
