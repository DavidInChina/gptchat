package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6296g {

    /* renamed from: a  reason: collision with root package name */
    public final String f49312a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49313b;

    public C6296g(String str, String str2) {
        this.f49312a = str;
        this.f49313b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6296g)) {
            return false;
        }
        C6296g c6296g = (C6296g) obj;
        if (AbstractC3557B.K(this.f49312a, c6296g.f49312a) && AbstractC3557B.K(this.f49313b, c6296g.f49313b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f49312a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f49313b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f49312a);
        sb2.append(", carrierName=");
        return R.a.t(sb2, this.f49313b, Separators.RPAREN);
    }
}
