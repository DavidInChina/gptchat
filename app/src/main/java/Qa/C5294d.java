package qa;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: qa.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5294d {

    /* renamed from: a  reason: collision with root package name */
    public final String f44022a;

    /* renamed from: b  reason: collision with root package name */
    public final String f44023b;

    /* renamed from: c  reason: collision with root package name */
    public final String f44024c;

    /* renamed from: d  reason: collision with root package name */
    public final List f44025d;

    /* renamed from: e  reason: collision with root package name */
    public final String f44026e;

    public /* synthetic */ C5294d(String str, String str2, List list, String str3, int i10) {
        this(str, (String) null, (i10 & 4) != 0 ? null : str2, list, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5294d)) {
            return false;
        }
        C5294d c5294d = (C5294d) obj;
        if (AbstractC3557B.K(this.f44022a, c5294d.f44022a) && AbstractC3557B.K(this.f44023b, c5294d.f44023b) && AbstractC3557B.K(this.f44024c, c5294d.f44024c) && AbstractC3557B.K(this.f44025d, c5294d.f44025d) && AbstractC3557B.K(this.f44026e, c5294d.f44026e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f44022a.hashCode() * 31;
        int i11 = 0;
        String str = this.f44023b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f44024c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f44026e.hashCode() + AbstractC4194d.s(this.f44025d, (i12 + i11) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Content(title=");
        sb2.append(this.f44022a);
        sb2.append(", heading=");
        sb2.append(this.f44023b);
        sb2.append(", subheading=");
        sb2.append(this.f44024c);
        sb2.append(", items=");
        sb2.append(this.f44025d);
        sb2.append(", cta=");
        return R.a.t(sb2, this.f44026e, Separators.RPAREN);
    }

    public C5294d(String str, String str2, String str3, List list, String str4) {
        this.f44022a = str;
        this.f44023b = str2;
        this.f44024c = str3;
        this.f44025d = list;
        this.f44026e = str4;
    }
}
