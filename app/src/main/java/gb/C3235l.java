package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;
import wd.C6209w;

/* renamed from: gb.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3235l extends AbstractC3237n {

    /* renamed from: a  reason: collision with root package name */
    public final String f31472a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31473b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31474c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31475d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31476e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31477f;

    /* renamed from: g  reason: collision with root package name */
    public final String f31478g;

    public /* synthetic */ C3235l(String str, String str2, int i10, int i11, String str3, int i12) {
        this(null, null, str, str2, i10, i11, (i12 & 64) != 0 ? null : str3);
    }

    @Override // gb.AbstractC3237n
    public final int a() {
        return this.f31477f;
    }

    @Override // gb.AbstractC3237n
    public final int b() {
        return this.f31476e;
    }

    @Override // gb.AbstractC3237n
    public final String c() {
        return this.f31475d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3235l)) {
            return false;
        }
        C3235l c3235l = (C3235l) obj;
        String str = c3235l.f31472a;
        String str2 = this.f31472a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        String str3 = this.f31473b;
        String str4 = c3235l.f31473b;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f31474c, c3235l.f31474c) && AbstractC3557B.K(this.f31475d, c3235l.f31475d) && this.f31476e == c3235l.f31476e && this.f31477f == c3235l.f31477f && AbstractC3557B.K(this.f31478g, c3235l.f31478g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f31472a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f31473b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int v10 = E9.f.v(this.f31474c, (i14 + i11) * 31, 31);
        String str3 = this.f31475d;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i15 = (((((v10 + i12) * 31) + this.f31476e) * 31) + this.f31477f) * 31;
        String str4 = this.f31478g;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i15 + i13;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f31472a;
        if (str3 == null) {
            str = str2;
        } else {
            str = C6168C.a(str3);
        }
        String str4 = this.f31473b;
        if (str4 != null) {
            str2 = C6182c0.a(str4);
        }
        String a5 = C6209w.a(this.f31474c);
        StringBuilder t10 = android.gov.nist.core.a.t("Image(conversationId=", str, ", messageId=", str2, ", assetPointer=");
        t10.append(a5);
        t10.append(", prompt=");
        t10.append(this.f31475d);
        t10.append(", declaredWidth=");
        t10.append(this.f31476e);
        t10.append(", declaredHeight=");
        t10.append(this.f31477f);
        t10.append(", genId=");
        return R.a.t(t10, this.f31478g, Separators.RPAREN);
    }

    public C3235l(String str, String str2, String str3, String str4, int i10, int i11, String str5) {
        AbstractC3557B.c0("assetPointer", str3);
        this.f31472a = str;
        this.f31473b = str2;
        this.f31474c = str3;
        this.f31475d = str4;
        this.f31476e = i10;
        this.f31477f = i11;
        this.f31478g = str5;
    }
}
