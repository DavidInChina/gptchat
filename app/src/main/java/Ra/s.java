package Ra;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import id.x;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final x f15241a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15242b;

    public s(x xVar, String str) {
        AbstractC3557B.c0("model", xVar);
        AbstractC3557B.c0("downloadUrl", str);
        this.f15241a = xVar;
        this.f15242b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3557B.K(this.f15241a, sVar.f15241a) && AbstractC3557B.K(this.f15242b, sVar.f15242b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15242b.hashCode() + (this.f15241a.hashCode() * 31);
    }

    public final String toString() {
        return "SpreadsheetData(model=" + this.f15241a + ", downloadUrl=" + this.f15242b + Separators.RPAREN;
    }
}
