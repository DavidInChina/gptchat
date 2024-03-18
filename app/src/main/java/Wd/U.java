package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class U {
    public static final T Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48367a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48368b;

    public U(int i10, String str, String str2) {
        if (2 == (i10 & 2)) {
            if ((i10 & 1) == 0) {
                this.f48367a = null;
            } else {
                this.f48367a = str;
            }
            this.f48368b = str2;
            return;
        }
        R4.b.e2(i10, 2, S.f48366b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        if (AbstractC3557B.K(this.f48367a, u10.f48367a) && AbstractC3557B.K(this.f48368b, u10.f48368b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f48367a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f48368b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DalleMetadata(genId=");
        sb2.append(this.f48367a);
        sb2.append(", prompt=");
        return R.a.t(sb2, this.f48368b, Separators.RPAREN);
    }
}
