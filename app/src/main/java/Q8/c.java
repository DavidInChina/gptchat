package Q8;

import R8.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final s f14475a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14476b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f14477c;

    public c(s sVar, boolean z10, Integer num) {
        AbstractC3557B.c0("astNode", sVar);
        this.f14475a = sVar;
        this.f14476b = z10;
        this.f14477c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f14475a, cVar.f14475a) && this.f14476b == cVar.f14476b && AbstractC3557B.K(this.f14477c, cVar.f14477c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f14475a.hashCode() * 31;
        if (this.f14476b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        Integer num = this.f14477c;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "AstNodeTraversalEntry(astNode=" + this.f14475a + ", isVisited=" + this.f14476b + ", formatIndex=" + this.f14477c + Separators.RPAREN;
    }
}
