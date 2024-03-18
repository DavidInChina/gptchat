package c6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299d {

    /* renamed from: a  reason: collision with root package name */
    public final String f26296a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26297b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26298c;

    /* renamed from: d  reason: collision with root package name */
    public final List f26299d;

    public C2299d(String str, String str2, String str3, ArrayList arrayList) {
        this.f26296a = str;
        this.f26297b = str2;
        this.f26298c = str3;
        this.f26299d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2299d)) {
            return false;
        }
        C2299d c2299d = (C2299d) obj;
        if (AbstractC3557B.K(this.f26296a, c2299d.f26296a) && AbstractC3557B.K(this.f26297b, c2299d.f26297b) && AbstractC3557B.K(this.f26298c, c2299d.f26298c) && AbstractC3557B.K(this.f26299d, c2299d.f26299d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f26296a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f26297b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f26298c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        List list = this.f26299d;
        if (list != null) {
            i13 = list.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(kind=");
        sb2.append(this.f26296a);
        sb2.append(", message=");
        sb2.append(this.f26297b);
        sb2.append(", stack=");
        sb2.append(this.f26298c);
        sb2.append(", threads=");
        return android.gov.nist.core.a.o(sb2, this.f26299d, Separators.RPAREN);
    }
}
