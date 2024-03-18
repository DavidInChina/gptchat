package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import yh.H1;
import yh.r1;

/* loaded from: classes2.dex */
public final class W0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15756Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f15757h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f15758i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC5641m f15759j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Map f15760k0;

    public W0(p1 p1Var, List list, Map map, List list2, AbstractC5641m abstractC5641m) {
        super(0);
        this.f15756Z = p1Var;
        this.f15757h0 = list;
        this.f15760k0 = map;
        this.f15758i0 = list2;
        this.f15759j0 = abstractC5641m;
    }

    @Override // yh.r1, yh.G1
    public final H1 Q() {
        return new Q0(this.f15756Z, this.f15758i0);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f15758i0;
        int size = list.size();
        List list2 = this.f15757h0;
        int size2 = list2.size();
        p1 p1Var = this.f15756Z;
        if (size == size2) {
            return Y0.j1((String) list.get(i10), (Map) this.f15760k0.get(Integer.valueOf(i10)), this.f15759j0, (AbstractC1337y0) list2.get(i10), p1Var);
        }
        return Y0.k1(p1Var, (String) list.get(i10)).w0();
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15758i0.size();
    }
}
