package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: O9.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117m0 {
    public static final C1115l0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13560a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13561b;

    public C1117m0(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f13560a = null;
        } else {
            this.f13560a = str;
        }
        if ((i10 & 2) == 0) {
            this.f13561b = null;
        } else {
            this.f13561b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1117m0)) {
            return false;
        }
        C1117m0 c1117m0 = (C1117m0) obj;
        String str = c1117m0.f13560a;
        String str2 = this.f13560a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f13561b, c1117m0.f13561b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f13560a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f13561b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        String str;
        String str2 = this.f13560a;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6182c0.a(str2);
        }
        return R.a.t(android.gov.nist.core.a.s("AlwaysAllowAction(targetMessageId=", str, ", operationHash="), this.f13561b, Separators.RPAREN);
    }
}
