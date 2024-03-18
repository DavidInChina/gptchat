package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: O9.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111j0 {
    public static final C1109i0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13546a;

    public C1111j0(int i10, String str) {
        if ((i10 & 1) == 0) {
            this.f13546a = null;
        } else {
            this.f13546a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1111j0)) {
            return false;
        }
        String str = ((C1111j0) obj).f13546a;
        String str2 = this.f13546a;
        if (str2 != null ? str != null && AbstractC3557B.K(str2, str) : str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13546a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f13546a;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6182c0.a(str2);
        }
        return android.gov.nist.core.a.A("AllowAction(targetMessageId=", str, Separators.RPAREN);
    }
}
