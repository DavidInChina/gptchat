package pc;

import android.gov.nist.core.Separators;
import android.net.Uri;
import id.AbstractC3557B;
import wd.C6195j;

/* renamed from: pc.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5125d {

    /* renamed from: a  reason: collision with root package name */
    public final String f42973a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f42974b;

    public /* synthetic */ C5125d(String str, int i10) {
        this((i10 & 1) != 0 ? null : str, (Uri) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5125d)) {
            return false;
        }
        C5125d c5125d = (C5125d) obj;
        String str = c5125d.f42973a;
        String str2 = this.f42973a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f42974b, c5125d.f42974b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f42973a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        Uri uri = this.f42974b;
        if (uri != null) {
            i11 = uri.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        String str;
        String str2 = this.f42973a;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6195j.a(str2);
        }
        return "CustomerInfo(accountId=" + str + ", subscriptionManagementUrl=" + this.f42974b + Separators.RPAREN;
    }

    public C5125d(String str, Uri uri) {
        this.f42973a = str;
        this.f42974b = uri;
    }
}
