package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.i1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6304i1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49332a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49333b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49334c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49335d;

    public C6304i1(String str, String str2, String str3, String str4) {
        this.f49332a = str;
        this.f49333b = str2;
        this.f49334c = str3;
        this.f49335d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6304i1)) {
            return false;
        }
        C6304i1 c6304i1 = (C6304i1) obj;
        if (AbstractC3557B.K(this.f49332a, c6304i1.f49332a) && AbstractC3557B.K(this.f49333b, c6304i1.f49333b) && AbstractC3557B.K(this.f49334c, c6304i1.f49334c) && AbstractC3557B.K(this.f49335d, c6304i1.f49335d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f49332a.hashCode() * 31;
        int i11 = 0;
        String str = this.f49333b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f49334c, (hashCode + i10) * 31, 31);
        String str2 = this.f49335d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return v10 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResourceEventView(id=");
        sb2.append(this.f49332a);
        sb2.append(", referrer=");
        sb2.append(this.f49333b);
        sb2.append(", url=");
        sb2.append(this.f49334c);
        sb2.append(", name=");
        return R.a.t(sb2, this.f49335d, Separators.RPAREN);
    }
}
