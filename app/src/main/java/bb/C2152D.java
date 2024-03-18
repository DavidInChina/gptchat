package bb;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: bb.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2152D implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f25693a;

    /* renamed from: b  reason: collision with root package name */
    public final C2334C f25694b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f25695c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f25696d;

    /* renamed from: e  reason: collision with root package name */
    public final String f25697e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f25698f;

    /* renamed from: g  reason: collision with root package name */
    public final String f25699g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f25700h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f25701i;

    public C2152D(String str, C2334C c2334c, Integer num, Integer num2, String str2, boolean z10, String str3, boolean z11, boolean z12) {
        this.f25693a = str;
        this.f25694b = c2334c;
        this.f25695c = num;
        this.f25696d = num2;
        this.f25697e = str2;
        this.f25698f = z10;
        this.f25699g = str3;
        this.f25700h = z11;
        this.f25701i = z12;
    }

    public static C2152D e(C2152D c2152d, C2334C c2334c, Integer num, Integer num2, String str, boolean z10, String str2, boolean z11, boolean z12, int i10) {
        C2334C c2334c2;
        Integer num3;
        Integer num4;
        String str3;
        boolean z13;
        String str4;
        boolean z14;
        boolean z15;
        String str5 = c2152d.f25693a;
        if ((i10 & 2) != 0) {
            c2334c2 = c2152d.f25694b;
        } else {
            c2334c2 = c2334c;
        }
        if ((i10 & 4) != 0) {
            num3 = c2152d.f25695c;
        } else {
            num3 = num;
        }
        if ((i10 & 8) != 0) {
            num4 = c2152d.f25696d;
        } else {
            num4 = num2;
        }
        if ((i10 & 16) != 0) {
            str3 = c2152d.f25697e;
        } else {
            str3 = str;
        }
        if ((i10 & 32) != 0) {
            z13 = c2152d.f25698f;
        } else {
            z13 = z10;
        }
        if ((i10 & 64) != 0) {
            str4 = c2152d.f25699g;
        } else {
            str4 = str2;
        }
        if ((i10 & 128) != 0) {
            z14 = c2152d.f25700h;
        } else {
            z14 = z11;
        }
        if ((i10 & 256) != 0) {
            z15 = c2152d.f25701i;
        } else {
            z15 = z12;
        }
        c2152d.getClass();
        AbstractC3557B.c0("gizmoId", str5);
        return new C2152D(str5, c2334c2, num3, num4, str3, z13, str4, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2152D)) {
            return false;
        }
        C2152D c2152d = (C2152D) obj;
        if (AbstractC3557B.K(this.f25693a, c2152d.f25693a) && AbstractC3557B.K(this.f25694b, c2152d.f25694b) && AbstractC3557B.K(this.f25695c, c2152d.f25695c) && AbstractC3557B.K(this.f25696d, c2152d.f25696d) && AbstractC3557B.K(this.f25697e, c2152d.f25697e) && this.f25698f == c2152d.f25698f && AbstractC3557B.K(this.f25699g, c2152d.f25699g) && this.f25700h == c2152d.f25700h && this.f25701i == c2152d.f25701i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int hashCode = this.f25693a.hashCode() * 31;
        int i16 = 0;
        C2334C c2334c = this.f25694b;
        if (c2334c == null) {
            i10 = 0;
        } else {
            i10 = c2334c.hashCode();
        }
        int i17 = (hashCode + i10) * 31;
        Integer num = this.f25695c;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i18 = (i17 + i11) * 31;
        Integer num2 = this.f25696d;
        if (num2 == null) {
            i12 = 0;
        } else {
            i12 = num2.hashCode();
        }
        int i19 = (i18 + i12) * 31;
        String str = this.f25697e;
        if (str == null) {
            i13 = 0;
        } else {
            i13 = str.hashCode();
        }
        int i20 = (i19 + i13) * 31;
        int i21 = 1237;
        if (this.f25698f) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i22 = (i20 + i14) * 31;
        String str2 = this.f25699g;
        if (str2 != null) {
            i16 = str2.hashCode();
        }
        int i23 = (i22 + i16) * 31;
        if (this.f25700h) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i24 = (i23 + i15) * 31;
        if (this.f25701i) {
            i21 = 1231;
        }
        return i24 + i21;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("GizmoRatingState(gizmoId=", wd.O.a(this.f25693a), ", gizmo=");
        s10.append(this.f25694b);
        s10.append(", rating=");
        s10.append(this.f25695c);
        s10.append(", initialRating=");
        s10.append(this.f25696d);
        s10.append(", privateNoteText=");
        s10.append(this.f25697e);
        s10.append(", emailWillBeSent=");
        s10.append(this.f25698f);
        s10.append(", userEmail=");
        s10.append(this.f25699g);
        s10.append(", alreadyRated=");
        s10.append(this.f25700h);
        s10.append(", submitting=");
        return AbstractC4194d.w(s10, this.f25701i, Separators.RPAREN);
    }
}
