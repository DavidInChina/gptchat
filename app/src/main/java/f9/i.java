package F9;

import Ad.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import id.x;

/* loaded from: classes2.dex */
public final class i implements s {

    /* renamed from: a  reason: collision with root package name */
    public final String f5087a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5088b;

    /* renamed from: c  reason: collision with root package name */
    public final x f5089c;

    public i(String str, String str2, x xVar) {
        this.f5087a = str;
        this.f5088b = str2;
        this.f5089c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3557B.K(this.f5087a, iVar.f5087a) && AbstractC3557B.K(this.f5088b, iVar.f5088b) && AbstractC3557B.K(this.f5089c, iVar.f5089c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f5087a.hashCode() * 31;
        int i11 = 0;
        String str = this.f5088b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        x xVar = this.f5089c;
        if (xVar != null) {
            i11 = xVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ConversationCsvAttachmentState(title=" + this.f5087a + ", downloadUrl=" + this.f5088b + ", spreadsheetModel=" + this.f5089c + Separators.RPAREN;
    }
}
