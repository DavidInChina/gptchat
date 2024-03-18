package df;

import id.AbstractC3557B;

/* renamed from: df.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2641f {

    /* renamed from: a  reason: collision with root package name */
    public final long f28265a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28266b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28267c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28268d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28269e;

    public C2641f(String str, String str2, String str3, String str4, long j6) {
        AbstractC3557B.c0("uri", str3);
        this.f28265a = j6;
        this.f28266b = str;
        this.f28267c = str2;
        this.f28268d = str3;
        this.f28269e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2641f)) {
            return false;
        }
        C2641f c2641f = (C2641f) obj;
        if (this.f28265a == c2641f.f28265a && AbstractC3557B.K(this.f28266b, c2641f.f28266b) && AbstractC3557B.K(this.f28267c, c2641f.f28267c) && AbstractC3557B.K(this.f28268d, c2641f.f28268d) && AbstractC3557B.K(this.f28269e, c2641f.f28269e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        long j6 = this.f28265a;
        int i12 = ((int) (j6 ^ (j6 >>> 32))) * 31;
        int i13 = 0;
        String str = this.f28266b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f28267c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int v10 = E9.f.v(this.f28268d, (i14 + i11) * 31, 31);
        String str3 = this.f28269e;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return v10 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SdpExt(value=");
        sb2.append(this.f28265a);
        sb2.append(", direction=");
        sb2.append(this.f28266b);
        sb2.append(", encryptUri=");
        sb2.append(this.f28267c);
        sb2.append(", uri=");
        sb2.append(this.f28268d);
        sb2.append(", config=");
        return android.gov.nist.core.a.n(sb2, this.f28269e, ')');
    }
}
