package y;

import id.AbstractC3557B;
import z.AbstractC6659E;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f50278a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6659E f50279b;

    public q0(AbstractC6659E abstractC6659E, wf.k kVar) {
        this.f50278a = kVar;
        this.f50279b = abstractC6659E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (AbstractC3557B.K(this.f50278a, q0Var.f50278a) && AbstractC3557B.K(this.f50279b, q0Var.f50279b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50279b.hashCode() + (this.f50278a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f50278a + ", animationSpec=" + this.f50279b + ')';
    }
}
