package Bh;

import Eh.AbstractC0512k;
import java.util.List;
import rh.AbstractC5496c;
import wh.AbstractC6256u;
import yh.AbstractC6624m;
import yh.l1;
import zh.AbstractC6878f;

/* loaded from: classes2.dex */
public final class C0 extends D0 {

    /* renamed from: A  reason: collision with root package name */
    public static final Object[] f2190A = null;

    /* renamed from: z  reason: collision with root package name */
    public final V f2191z;

    public C0(l1 l1Var, ph.f fVar, C0245g c0245g, C0242e0 c0242e0, List list, vh.l lVar, AbstractC6256u abstractC6256u, AbstractC6256u abstractC6256u2, AbstractC6624m abstractC6624m, Eh.A a5, AbstractC0252j0 abstractC0252j0, Fh.F f6, AbstractC5496c abstractC5496c, Fh.n nVar, int i10, Gh.b bVar, AbstractC0512k abstractC0512k, int i11, AbstractC0241e abstractC0241e, Rh.l1 l1Var2, l1 l1Var3, AbstractC6878f abstractC6878f, V v10) {
        super(l1Var, fVar, c0245g, c0242e0, list, lVar, abstractC6256u, abstractC6256u2, abstractC6624m, a5, abstractC0252j0, f6, abstractC5496c, nVar, i10, bVar, abstractC0512k, i11, abstractC0241e, l1Var2, l1Var3, abstractC6878f);
        this.f2191z = v10;
    }

    @Override // Bh.D0, Bh.R0
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C0.class != obj.getClass()) {
            return false;
        }
        if (!this.f2191z.equals(((C0) obj).f2191z)) {
            return false;
        }
        Object obj2 = Dh.j.LEVEL_TYPE;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = Ch.b.f3158Y;
        if (!obj3.equals(obj3)) {
            return false;
        }
        return true;
    }

    @Override // Bh.D0, Bh.R0
    public final int hashCode() {
        int hashCode = this.f2191z.hashCode();
        int hashCode2 = Dh.j.LEVEL_TYPE.hashCode();
        return Ch.b.f3158Y.hashCode() + ((hashCode2 + ((hashCode + (super.hashCode() * 31)) * 31)) * 31);
    }
}
