package df;

import id.AbstractC3557B;

/* renamed from: df.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2644i {

    /* renamed from: a  reason: collision with root package name */
    public final long f28273a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28274b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f28275c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28276d;

    public C2644i(long j6, String str, Long l10, String str2) {
        AbstractC3557B.c0("codec", str);
        this.f28273a = j6;
        this.f28274b = str;
        this.f28275c = l10;
        this.f28276d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2644i)) {
            return false;
        }
        C2644i c2644i = (C2644i) obj;
        if (this.f28273a == c2644i.f28273a && AbstractC3557B.K(this.f28274b, c2644i.f28274b) && AbstractC3557B.K(this.f28275c, c2644i.f28275c) && AbstractC3557B.K(this.f28276d, c2644i.f28276d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j6 = this.f28273a;
        int v10 = E9.f.v(this.f28274b, ((int) (j6 ^ (j6 >>> 32))) * 31, 31);
        int i11 = 0;
        Long l10 = this.f28275c;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        int i12 = (v10 + i10) * 31;
        String str = this.f28276d;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SdpRtp(payload=");
        sb2.append(this.f28273a);
        sb2.append(", codec=");
        sb2.append(this.f28274b);
        sb2.append(", rate=");
        sb2.append(this.f28275c);
        sb2.append(", encoding=");
        return android.gov.nist.core.a.n(sb2, this.f28276d, ')');
    }
}
