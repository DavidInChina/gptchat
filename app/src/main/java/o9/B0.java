package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class B0 {
    public static final A0 Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f13445c = {null, new C2695d(C0.f13450a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f13446a;

    /* renamed from: b  reason: collision with root package name */
    public final List f13447b;

    public B0(int i10, String str, List list) {
        if ((i10 & 1) == 0) {
            this.f13446a = null;
        } else {
            this.f13446a = str;
        }
        if ((i10 & 2) == 0) {
            this.f13447b = null;
        } else {
            this.f13447b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (AbstractC3557B.K(this.f13446a, b02.f13446a) && AbstractC3557B.K(this.f13447b, b02.f13447b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f13446a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        List list = this.f13447b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ApiMessageAggregateResult(code=" + this.f13446a + ", messages=" + this.f13447b + Separators.RPAREN;
    }
}
