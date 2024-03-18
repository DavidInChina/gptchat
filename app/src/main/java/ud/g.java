package ud;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import jf.C3970t;
import r0.r;

@AbstractC1998i
/* loaded from: classes.dex */
public final class g {
    public static final f Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f46686a;

    /* renamed from: b  reason: collision with root package name */
    public final r f46687b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f46688c;

    /* renamed from: d  reason: collision with root package name */
    public final List f46689d;

    public g(int i10, String str, r rVar, Integer num, List list) {
        if (9 == (i10 & 9)) {
            this.f46686a = str;
            if ((i10 & 2) == 0) {
                this.f46687b = null;
            } else {
                this.f46687b = rVar;
            }
            if ((i10 & 4) == 0) {
                this.f46688c = null;
            } else {
                this.f46688c = num;
            }
            this.f46689d = list;
            return;
        }
        R4.b.e2(i10, 9, e.f46685b);
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
        if (AbstractC3557B.K(this.f46686a, gVar.f46686a) && AbstractC3557B.K(this.f46687b, gVar.f46687b) && AbstractC3557B.K(this.f46688c, gVar.f46688c) && AbstractC3557B.K(this.f46689d, gVar.f46689d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f46686a.hashCode() * 31;
        int i11 = 0;
        r rVar = this.f46687b;
        if (rVar == null) {
            i10 = 0;
        } else {
            i10 = C3970t.a(rVar.f44265a);
        }
        int i12 = (hashCode + i10) * 31;
        Integer num = this.f46688c;
        if (num != null) {
            i11 = num.hashCode();
        }
        return this.f46689d.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        return "Node(value=" + this.f46686a + ", color=" + this.f46687b + ", fontWeight=" + this.f46688c + ", children=" + this.f46689d + Separators.RPAREN;
    }
}
