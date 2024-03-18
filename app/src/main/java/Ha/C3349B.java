package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: ha.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3349B implements K {
    public static final C3348A Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f31995a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31996b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31997c;

    public C3349B(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f31995a = null;
        } else {
            this.f31995a = str;
        }
        if ((i10 & 2) == 0) {
            this.f31996b = null;
        } else {
            this.f31996b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f31997c = null;
        } else {
            this.f31997c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3349B)) {
            return false;
        }
        C3349B c3349b = (C3349B) obj;
        if (!AbstractC3557B.K(this.f31995a, c3349b.f31995a)) {
            return false;
        }
        String str = this.f31996b;
        String str2 = c3349b.f31996b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f31997c, c3349b.f31997c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f31995a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f31996b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f31997c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        String str;
        String str2 = this.f31996b;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6182c0.a(str2);
        }
        StringBuilder sb2 = new StringBuilder("AlwaysAllowAction(actionType=");
        android.gov.nist.core.a.y(sb2, this.f31995a, ", targetMessageId=", str, ", operationHash=");
        return R.a.t(sb2, this.f31997c, Separators.RPAREN);
    }

    public C3349B(String str, String str2, String str3) {
        this.f31995a = str;
        this.f31996b = str2;
        this.f31997c = str3;
    }
}
