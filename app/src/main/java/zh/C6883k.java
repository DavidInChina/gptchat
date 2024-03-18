package zh;

import Bh.Z;
import Eh.AbstractC0523w;
import Qh.AbstractC1243v;
import Qh.C1242u;

/* renamed from: zh.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6883k extends Df.H {

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC1243v f52130f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AbstractC6884l f52131g;

    public C6883k(AbstractC6884l abstractC6884l, C1242u c1242u) {
        this.f52131g = abstractC6884l;
        this.f52130f = c1242u;
    }

    @Override // zh.s
    public final AbstractC6868B c(AbstractC0523w abstractC0523w) {
        return new C6882j(this, new Z(abstractC0523w));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6883k.class != obj.getClass()) {
            return false;
        }
        C6883k c6883k = (C6883k) obj;
        if (this.f52130f.equals(c6883k.f52130f) && this.f52131g.equals(c6883k.f52131g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f52130f.hashCode();
        return this.f52131g.hashCode() + ((hashCode + (C6883k.class.hashCode() * 31)) * 31);
    }
}
