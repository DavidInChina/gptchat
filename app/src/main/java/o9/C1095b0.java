package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: O9.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1095b0 {
    public static final C1093a0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Y f13520a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13521b;

    public C1095b0(int i10, Y y10, String str) {
        if ((i10 & 1) == 0) {
            this.f13520a = null;
        } else {
            this.f13520a = y10;
        }
        if ((i10 & 2) == 0) {
            this.f13521b = null;
        } else {
            this.f13521b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1095b0)) {
            return false;
        }
        C1095b0 c1095b0 = (C1095b0) obj;
        if (AbstractC3557B.K(this.f13520a, c1095b0.f13520a) && AbstractC3557B.K(this.f13521b, c1095b0.f13521b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Y y10 = this.f13520a;
        if (y10 == null) {
            i10 = 0;
        } else {
            i10 = y10.hashCode();
        }
        int i12 = i10 * 31;
        String str = this.f13521b;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "UserAction(data=" + this.f13520a + ", targetMessageId=" + this.f13521b + Separators.RPAREN;
    }

    public C1095b0(Y y10, String str) {
        this.f13520a = y10;
        this.f13521b = str;
    }
}
