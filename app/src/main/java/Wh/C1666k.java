package Wh;

import bi.AbstractC2228c;
import id.AbstractC3557B;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: Wh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1666k {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f21219j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f21220k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f21221l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f21222m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f21223a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21224b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21225c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21226d;

    /* renamed from: e  reason: collision with root package name */
    public final String f21227e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f21228f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21229g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f21230h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f21231i;

    public C1666k(String str, String str2, long j6, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21223a = str;
        this.f21224b = str2;
        this.f21225c = j6;
        this.f21226d = str3;
        this.f21227e = str4;
        this.f21228f = z10;
        this.f21229g = z11;
        this.f21230h = z12;
        this.f21231i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1666k) {
            C1666k c1666k = (C1666k) obj;
            if (AbstractC3557B.K(c1666k.f21223a, this.f21223a) && AbstractC3557B.K(c1666k.f21224b, this.f21224b) && c1666k.f21225c == this.f21225c && AbstractC3557B.K(c1666k.f21226d, this.f21226d) && AbstractC3557B.K(c1666k.f21227e, this.f21227e) && c1666k.f21228f == this.f21228f && c1666k.f21229g == this.f21229g && c1666k.f21230h == this.f21230h && c1666k.f21231i == this.f21231i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int v10 = E9.f.v(this.f21224b, E9.f.v(this.f21223a, 527, 31), 31);
        long j6 = this.f21225c;
        int v11 = E9.f.v(this.f21227e, E9.f.v(this.f21226d, (v10 + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31), 31);
        int i13 = 1237;
        if (this.f21228f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (v11 + i10) * 31;
        if (this.f21229g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f21230h) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (i15 + i12) * 31;
        if (this.f21231i) {
            i13 = 1231;
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21223a);
        sb2.append('=');
        sb2.append(this.f21224b);
        if (this.f21230h) {
            long j6 = this.f21225c;
            if (j6 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String format = ((DateFormat) AbstractC2228c.f26021a.get()).format(new Date(j6));
                AbstractC3557B.b0("STANDARD_DATE_FORMAT.get().format(this)", format);
                sb2.append(format);
            }
        }
        if (!this.f21231i) {
            sb2.append("; domain=");
            sb2.append(this.f21226d);
        }
        sb2.append("; path=");
        sb2.append(this.f21227e);
        if (this.f21228f) {
            sb2.append("; secure");
        }
        if (this.f21229g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString()", sb3);
        return sb3;
    }
}
