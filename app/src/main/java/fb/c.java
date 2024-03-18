package Fb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f5141b = {new C2695d(d.f5143a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f5142a;

    public c(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f5142a = list;
        } else {
            R4.b.e2(i10, 1, a.f5140b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && AbstractC3557B.K(this.f5142a, ((c) obj).f5142a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5142a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("CountriesResponse(data="), this.f5142a, Separators.RPAREN);
    }
}
