package Dh;

import Bh.AbstractC0265q;
import Qh.AbstractC1234l;
import Qh.AbstractC1235m;
import Qh.AbstractC1243v;
import Qh.F;
import Qh.H;
import Qh.K;
import Qh.b0;

/* loaded from: classes.dex */
public final class h implements AbstractC1243v {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1243v f3718a;

    public h(AbstractC1243v abstractC1243v) {
        this.f3718a = abstractC1243v;
    }

    @Override // Qh.AbstractC1243v
    public final AbstractC1234l a(AbstractC0265q abstractC0265q) {
        return F.VIRTUAL.f14964Z.b(new K(H.FINAL.f14972h0)).b(new b0(abstractC0265q)).b(new K(this.f3718a.a(abstractC0265q))).c(AbstractC1235m.b(abstractC0265q));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        if (this.f3718a.equals(((h) obj).f3718a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3718a.hashCode() + (h.class.hashCode() * 31);
    }
}
