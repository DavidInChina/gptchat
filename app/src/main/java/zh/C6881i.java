package zh;

import Bh.Z;
import Eh.AbstractC0523w;
import wh.C6247l;
import wh.C6261z;
import yh.AbstractC6632q;

/* renamed from: zh.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6881i extends u {

    /* renamed from: f  reason: collision with root package name */
    public final C6247l f52127f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AbstractC6884l f52128g;

    public C6881i(AbstractC6884l abstractC6884l, C6247l c6247l) {
        this.f52128g = abstractC6884l;
        this.f52127f = c6247l;
    }

    @Override // zh.z
    public final y a(AbstractC6632q abstractC6632q) {
        return new C6880h(this, new C6261z(abstractC6632q.w0()));
    }

    @Override // zh.s
    public final AbstractC6868B c(AbstractC0523w abstractC0523w) {
        return new C6879g(this, new Z(abstractC0523w));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6881i.class != obj.getClass()) {
            return false;
        }
        C6881i c6881i = (C6881i) obj;
        if (this.f52127f.equals(c6881i.f52127f) && this.f52128g.equals(c6881i.f52128g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f52127f.hashCode();
        return this.f52128g.hashCode() + ((hashCode + (C6881i.class.hashCode() * 31)) * 31);
    }
}
