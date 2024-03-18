package Vb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class l {
    public static final k Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f18519e = {c.Companion.serializer(), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final c f18520a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18521b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18522c;

    /* renamed from: d  reason: collision with root package name */
    public final String f18523d;

    public l(int i10, c cVar, String str, String str2, String str3) {
        if (15 == (i10 & 15)) {
            this.f18520a = cVar;
            this.f18521b = str;
            this.f18522c = str2;
            this.f18523d = str3;
            return;
        }
        R4.b.e2(i10, 15, j.f18518b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f18520a == lVar.f18520a && AbstractC3557B.K(this.f18521b, lVar.f18521b) && AbstractC3557B.K(this.f18522c, lVar.f18522c) && AbstractC3557B.K(this.f18523d, lVar.f18523d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f18520a.hashCode() * 31;
        int i12 = 0;
        String str = this.f18521b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        String str2 = this.f18522c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f18523d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServerStatusResponse(status=");
        sb2.append(this.f18520a);
        sb2.append(", message=");
        sb2.append(this.f18521b);
        sb2.append(", buttonUrl=");
        sb2.append(this.f18522c);
        sb2.append(", buttonTitle=");
        return R.a.t(sb2, this.f18523d, Separators.RPAREN);
    }
}
