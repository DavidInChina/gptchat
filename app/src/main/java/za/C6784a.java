package za;

import android.gov.nist.core.Separators;
import android.net.Uri;
import id.AbstractC3557B;
import wd.C6209w;

/* renamed from: za.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6784a {

    /* renamed from: a  reason: collision with root package name */
    public final String f51775a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51776b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f51777c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f51778d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f51779e;

    public C6784a(String str, String str2, Uri uri, Uri uri2) {
        boolean z10;
        this.f51775a = str;
        this.f51776b = str2;
        this.f51777c = uri;
        this.f51778d = uri2;
        if (uri2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51779e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6784a)) {
            return false;
        }
        C6784a c6784a = (C6784a) obj;
        if (!AbstractC3557B.K(this.f51775a, c6784a.f51775a)) {
            return false;
        }
        String str = this.f51776b;
        String str2 = c6784a.f51776b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f51777c, c6784a.f51777c) && AbstractC3557B.K(this.f51778d, c6784a.f51778d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f51775a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f51776b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        Uri uri = this.f51777c;
        if (uri == null) {
            i12 = 0;
        } else {
            i12 = uri.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Uri uri2 = this.f51778d;
        if (uri2 != null) {
            i13 = uri2.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        String str;
        String str2 = this.f51776b;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6209w.a(str2);
        }
        StringBuilder sb2 = new StringBuilder("DrawnImageAttachment(genId=");
        android.gov.nist.core.a.y(sb2, this.f51775a, ", originalAssetPointer=", str, ", originalUri=");
        sb2.append(this.f51777c);
        sb2.append(", drawnImageUri=");
        sb2.append(this.f51778d);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
