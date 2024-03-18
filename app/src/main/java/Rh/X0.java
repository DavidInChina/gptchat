package Rh;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import yh.r1;

/* loaded from: classes2.dex */
public final class X0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15762Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f15763h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC5641m f15764i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15765j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Map f15766k0;

    public X0(p1 p1Var, List list, AbstractC5641m abstractC5641m, Map map, Map map2) {
        super(0);
        this.f15762Z = p1Var;
        this.f15763h0 = list;
        this.f15764i0 = abstractC5641m;
        this.f15765j0 = map;
        this.f15766k0 = map2;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Map map = (Map) this.f15765j0.get(Integer.valueOf(i10));
        Map map2 = (Map) this.f15766k0.get(Integer.valueOf(i10));
        C1292b0 c1292b0 = (C1292b0) ((AbstractC1310k0) this.f15763h0.get(i10));
        c1292b0.getClass();
        if (map == null) {
            map = Collections.emptyMap();
        }
        Map map3 = map;
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return new C1290a0(this.f15762Z, this.f15764i0, map3, map2, c1292b0.f15794a, c1292b0.f15795b);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15763h0.size();
    }
}
