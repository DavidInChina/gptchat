package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class L implements AbstractC6211y {
    public static final C6176K Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48357a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48358b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f48359c;

    public L(int i10, String str, String str2, Integer num) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C6175J.f48350b);
            throw null;
        }
        this.f48357a = str;
        this.f48358b = str2;
        if ((i10 & 4) == 0) {
            this.f48359c = null;
        } else {
            this.f48359c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        if (AbstractC3557B.K(this.f48357a, l10.f48357a) && AbstractC3557B.K(this.f48358b, l10.f48358b) && AbstractC3557B.K(this.f48359c, l10.f48359c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f48358b, this.f48357a.hashCode() * 31, 31);
        Integer num = this.f48359c;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("FileAssetPointer(assetPointer=", C6209w.a(this.f48357a), ", name=");
        s10.append(this.f48358b);
        s10.append(", size=");
        s10.append(this.f48359c);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public L(String str, String str2, Integer num) {
        AbstractC3557B.c0("name", str2);
        this.f48357a = str;
        this.f48358b = str2;
        this.f48359c = num;
    }
}
