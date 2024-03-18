package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Za.l0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1858l0 {
    public static final C1856k0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23575a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23576b;

    /* renamed from: c  reason: collision with root package name */
    public final C1852i0 f23577c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23578d;

    public C1858l0(int i10, String str, String str2, C1852i0 c1852i0, String str3) {
        if (3 == (i10 & 3)) {
            this.f23575a = str;
            this.f23576b = str2;
            if ((i10 & 4) == 0) {
                this.f23577c = null;
            } else {
                this.f23577c = c1852i0;
            }
            if ((i10 & 8) == 0) {
                this.f23578d = null;
                return;
            } else {
                this.f23578d = str3;
                return;
            }
        }
        R4.b.e2(i10, 3, C1854j0.f23566b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858l0)) {
            return false;
        }
        C1858l0 c1858l0 = (C1858l0) obj;
        if (AbstractC3557B.K(this.f23575a, c1858l0.f23575a) && AbstractC3557B.K(this.f23576b, c1858l0.f23576b) && AbstractC3557B.K(this.f23577c, c1858l0.f23577c) && AbstractC3557B.K(this.f23578d, c1858l0.f23578d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f23575a.hashCode() * 31;
        int i12 = 0;
        String str = this.f23576b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        C1852i0 c1852i0 = this.f23577c;
        if (c1852i0 == null) {
            i11 = 0;
        } else {
            i11 = c1852i0.f23564a.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str2 = this.f23578d;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiGizmoToolMetadata(actionId=");
        sb2.append(this.f23575a);
        sb2.append(", domain=");
        sb2.append(this.f23576b);
        sb2.append(", auth=");
        sb2.append(this.f23577c);
        sb2.append(", privacyPolicyUrl=");
        return R.a.t(sb2, this.f23578d, Separators.RPAREN);
    }
}
