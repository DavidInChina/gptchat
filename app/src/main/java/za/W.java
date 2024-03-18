package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class W {
    public static final V Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f23525c = {new C2695d(K.f23477a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f23526a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23527b;

    public W(int i10, String str, List list) {
        if (3 == (i10 & 3)) {
            this.f23526a = list;
            this.f23527b = str;
            return;
        }
        R4.b.e2(i10, 3, U.f23522b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        if (AbstractC3557B.K(this.f23526a, w10.f23526a) && AbstractC3557B.K(this.f23527b, w10.f23527b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f23526a.hashCode() * 31;
        String str = this.f23527b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ApiGizmoListObject(items=" + this.f23526a + ", cursor=" + this.f23527b + Separators.RPAREN;
    }
}
