package F9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import id.x;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final x f5109a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5110b;

    public o(x xVar, String str) {
        AbstractC3557B.c0("model", xVar);
        AbstractC3557B.c0("downloadUrl", str);
        this.f5109a = xVar;
        this.f5110b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3557B.K(this.f5109a, oVar.f5109a) && AbstractC3557B.K(this.f5110b, oVar.f5110b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5110b.hashCode() + (this.f5109a.hashCode() * 31);
    }

    public final String toString() {
        return "CsvAttachmentData(model=" + this.f5109a + ", downloadUrl=" + this.f5110b + Separators.RPAREN;
    }
}
