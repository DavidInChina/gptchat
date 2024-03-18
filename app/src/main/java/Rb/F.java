package Rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class F {
    public static final E Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f15261d = {null, null, new C2695d(A.f15246a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f15262a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15263b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15264c;

    public F(int i10, String str, String str2, List list) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, D.f15260b);
            throw null;
        }
        this.f15262a = str;
        this.f15263b = str2;
        this.f15264c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        if (AbstractC3557B.K(this.f15262a, f6.f15262a) && AbstractC3557B.K(this.f15263b, f6.f15263b) && AbstractC3557B.K(this.f15264c, f6.f15264c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15264c.hashCode() + E9.f.v(this.f15263b, this.f15262a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportContentReasonsResponse(header=");
        sb2.append(this.f15262a);
        sb2.append(", headerExplanation=");
        sb2.append(this.f15263b);
        sb2.append(", reasons=");
        return android.gov.nist.core.a.o(sb2, this.f15264c, Separators.RPAREN);
    }

    public F(String str, String str2, List list) {
        this.f15262a = str;
        this.f15263b = str2;
        this.f15264c = list;
    }
}
