package Rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.y0;

@AbstractC1998i
/* renamed from: Rb.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272s {
    public static final r Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f15368a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15369b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15370c;

    public /* synthetic */ C1272s(String str, String str2, String str3, int i10) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }

    public static C1272s a(C1272s c1272s, int i10) {
        String str;
        String str2;
        String str3 = null;
        if ((i10 & 1) != 0) {
            str = c1272s.f15368a;
        } else {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = c1272s.f15369b;
        } else {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = c1272s.f15370c;
        }
        c1272s.getClass();
        return new C1272s(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1272s)) {
            return false;
        }
        C1272s c1272s = (C1272s) obj;
        String str = c1272s.f15368a;
        String str2 = this.f15368a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        String str3 = this.f15369b;
        String str4 = c1272s.f15369b;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        String str5 = this.f15370c;
        String str6 = c1272s.f15370c;
        if (str5 != null ? str6 != null && AbstractC3557B.K(str5, str6) : str6 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f15368a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f15369b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f15370c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = "null";
        String str4 = this.f15368a;
        if (str4 == null) {
            str = str3;
        } else {
            str = wd.O.a(str4);
        }
        String str5 = this.f15369b;
        if (str5 == null) {
            str2 = str3;
        } else {
            str2 = C6168C.a(str5);
        }
        String str6 = this.f15370c;
        if (str6 != null) {
            str3 = y0.a(str6);
        }
        return R.a.t(android.gov.nist.core.a.t("ReportContentId(gizmoId=", str, ", conversationId=", str2, ", sharedConversationId="), str3, Separators.RPAREN);
    }

    public C1272s(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f15368a = null;
        } else {
            this.f15368a = str;
        }
        if ((i10 & 2) == 0) {
            this.f15369b = null;
        } else {
            this.f15369b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f15370c = null;
        } else {
            this.f15370c = str3;
        }
    }

    public C1272s(String str, String str2, String str3) {
        this.f15368a = str;
        this.f15369b = str2;
        this.f15370c = str3;
    }
}
