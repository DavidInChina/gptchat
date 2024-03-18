package Wc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class l {
    public static final k Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f20912c = {null, o.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    public final String f20913a;

    /* renamed from: b  reason: collision with root package name */
    public final o f20914b;

    public l(int i10, String str, o oVar) {
        if (3 == (i10 & 3)) {
            this.f20913a = str;
            this.f20914b = oVar;
            return;
        }
        R4.b.e2(i10, 3, j.f20911b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f20913a, lVar.f20913a) && this.f20914b == lVar.f20914b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f20913a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f20914b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "Detail(message=" + this.f20913a + ", errorType=" + this.f20914b + Separators.RPAREN;
    }
}
