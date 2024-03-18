package Jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class g {
    public static final C0812f Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f9048e = {y.Companion.serializer(), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final y f9049a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9050b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9051c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9052d;

    public g(int i10, y yVar, String str, String str2, String str3) {
        if (3 == (i10 & 3)) {
            this.f9049a = yVar;
            this.f9050b = str;
            if ((i10 & 4) == 0) {
                this.f9051c = null;
            } else {
                this.f9051c = str2;
            }
            if ((i10 & 8) == 0) {
                this.f9052d = null;
                return;
            } else {
                this.f9052d = str3;
                return;
            }
        }
        R4.b.e2(i10, 3, C0811e.f9047b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f9049a == gVar.f9049a && AbstractC3557B.K(this.f9050b, gVar.f9050b) && AbstractC3557B.K(this.f9051c, gVar.f9051c) && AbstractC3557B.K(this.f9052d, gVar.f9052d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f9049a.hashCode() * 31;
        int i12 = 0;
        String str = this.f9050b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        String str2 = this.f9051c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f9052d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileServiceDownloadResponse(status=");
        sb2.append(this.f9049a);
        sb2.append(", downloadUrl=");
        sb2.append(this.f9050b);
        sb2.append(", errorCode=");
        sb2.append(this.f9051c);
        sb2.append(", errorMessage=");
        return R.a.t(sb2, this.f9052d, Separators.RPAREN);
    }
}
