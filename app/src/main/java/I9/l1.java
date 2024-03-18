package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class l1 implements AbstractC0775p {

    /* renamed from: a  reason: collision with root package name */
    public final int f8411a;

    /* renamed from: b  reason: collision with root package name */
    public final List f8412b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8413c = "MoreGizmosItem";

    public l1(int i10, List list) {
        AbstractC3557B.c0("gizmos", list);
        this.f8411a = i10;
        this.f8412b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f8411a == l1Var.f8411a && AbstractC3557B.K(this.f8412b, l1Var.f8412b)) {
            return true;
        }
        return false;
    }

    @Override // I9.AbstractC0775p
    public final String getId() {
        return this.f8413c;
    }

    public final int hashCode() {
        return this.f8412b.hashCode() + (this.f8411a * 31);
    }

    public final String toString() {
        return "MoreGizmosItem(count=" + this.f8411a + ", gizmos=" + this.f8412b + Separators.RPAREN;
    }
}
