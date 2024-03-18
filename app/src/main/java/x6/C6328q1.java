package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.q1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6328q1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49422a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49423b;

    public C6328q1(String str, String str2) {
        this.f49422a = str;
        this.f49423b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6328q1)) {
            return false;
        }
        C6328q1 c6328q1 = (C6328q1) obj;
        if (AbstractC3557B.K(this.f49422a, c6328q1.f49422a) && AbstractC3557B.K(this.f49423b, c6328q1.f49423b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f49422a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f49423b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f49422a);
        sb2.append(", carrierName=");
        return R.a.t(sb2, this.f49423b, Separators.RPAREN);
    }
}
