package Ra;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import id.C3556A;
import id.x;

/* loaded from: classes.dex */
public final class k implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f15214a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15215b;

    /* renamed from: c  reason: collision with root package name */
    public final x f15216c;

    /* renamed from: d  reason: collision with root package name */
    public final C3556A f15217d;

    public k(String str, String str2, x xVar, C3556A c3556a) {
        AbstractC3557B.c0("selectionState", c3556a);
        this.f15214a = str;
        this.f15215b = str2;
        this.f15216c = xVar;
        this.f15217d = c3556a;
    }

    public static k e(k kVar, String str, x xVar, C3556A c3556a, int i10) {
        String str2 = kVar.f15214a;
        if ((i10 & 2) != 0) {
            str = kVar.f15215b;
        }
        if ((i10 & 4) != 0) {
            xVar = kVar.f15216c;
        }
        kVar.getClass();
        AbstractC3557B.c0("selectionState", c3556a);
        return new k(str2, str, xVar, c3556a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (AbstractC3557B.K(this.f15214a, kVar.f15214a) && AbstractC3557B.K(this.f15215b, kVar.f15215b) && AbstractC3557B.K(this.f15216c, kVar.f15216c) && AbstractC3557B.K(this.f15217d, kVar.f15217d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f15214a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f15215b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        x xVar = this.f15216c;
        if (xVar != null) {
            i12 = xVar.hashCode();
        }
        return this.f15217d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "ConversationSpreadsheetState(title=" + this.f15214a + ", downloadUrl=" + this.f15215b + ", spreadsheetModel=" + this.f15216c + ", selectionState=" + this.f15217d + Separators.RPAREN;
    }
}
