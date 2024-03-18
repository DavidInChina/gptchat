package S8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f16297a;

    /* renamed from: b  reason: collision with root package name */
    public final List f16298b;

    public a0(ArrayList arrayList, ArrayList arrayList2) {
        this.f16297a = arrayList;
        this.f16298b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (AbstractC3557B.K(this.f16297a, a0Var.f16297a) && AbstractC3557B.K(this.f16298b, a0Var.f16298b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16298b.hashCode() + (this.f16297a.hashCode() * 31);
    }

    public final String toString() {
        return "TableLayoutResult(rowOffsets=" + this.f16297a + ", columnOffsets=" + this.f16298b + Separators.RPAREN;
    }
}
