package Jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class v {
    public static final u Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f9070d = {y.Companion.serializer(), null, null};

    /* renamed from: a  reason: collision with root package name */
    public final y f9071a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9072b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9073c;

    public v(int i10, y yVar, String str, String str2) {
        if (7 == (i10 & 7)) {
            this.f9071a = yVar;
            this.f9072b = str;
            this.f9073c = str2;
            return;
        }
        R4.b.e2(i10, 7, t.f9069b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f9071a == vVar.f9071a && AbstractC3557B.K(this.f9072b, vVar.f9072b) && AbstractC3557B.K(this.f9073c, vVar.f9073c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9073c.hashCode() + E9.f.v(this.f9072b, this.f9071a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileServiceFilesResponse(status=");
        sb2.append(this.f9071a);
        sb2.append(", uploadUrl=");
        sb2.append(this.f9072b);
        sb2.append(", fileId=");
        return R.a.t(sb2, this.f9073c, Separators.RPAREN);
    }
}
