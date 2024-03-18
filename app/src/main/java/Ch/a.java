package Ch;

import Bh.AbstractC0265q;
import Qh.AbstractC1230h;
import Qh.AbstractC1234l;
import Qh.AbstractC1235m;
import Qh.AbstractC1243v;
import Qh.F;
import Qh.H;
import Qh.K;

/* loaded from: classes2.dex */
public final class a implements AbstractC1243v {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1243v f3156a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1234l f3157b;

    public a(AbstractC1243v abstractC1243v, AbstractC1230h abstractC1230h) {
        this.f3156a = abstractC1243v;
        this.f3157b = abstractC1230h;
    }

    @Override // Qh.AbstractC1243v
    public final AbstractC1234l a(AbstractC0265q abstractC0265q) {
        return new K(this.f3156a.a(abstractC0265q)).b(F.VIRTUAL.f14964Z.b(new K(H.FINAL.f14972h0)).c(AbstractC1235m.b(abstractC0265q))).c(AbstractC1235m.b(abstractC0265q).b(new K(this.f3157b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3156a.equals(aVar.f3156a) && this.f3157b.equals(aVar.f3157b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3156a.hashCode();
        return this.f3157b.hashCode() + ((hashCode + (a.class.hashCode() * 31)) * 31);
    }
}
