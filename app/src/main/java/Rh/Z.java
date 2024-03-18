package Rh;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import yh.r1;

/* loaded from: classes2.dex */
public final class Z extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15777Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15778h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Map f15779i0;

    /* renamed from: j0  reason: collision with root package name */
    public final List f15780j0;

    public Z(p1 p1Var, AbstractC5641m abstractC5641m, Map map, List list) {
        super(0);
        this.f15777Z = p1Var;
        this.f15778h0 = abstractC5641m;
        this.f15779i0 = map;
        this.f15780j0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Map map;
        Integer valueOf = Integer.valueOf(i10);
        Map map2 = this.f15779i0;
        boolean containsKey = map2.containsKey(valueOf);
        p1 p1Var = this.f15777Z;
        List list = this.f15780j0;
        if (!containsKey && !map2.containsKey(Integer.valueOf(i10 + 1))) {
            map = Collections.emptyMap();
        } else {
            map = (Map) map2.get(Integer.valueOf((!((AbstractC1337y0) list.get(0)).b(p1Var)) + i10));
        }
        AbstractC1337y0 abstractC1337y0 = (AbstractC1337y0) list.get(i10);
        if (map == null) {
            map = Collections.emptyMap();
        }
        return abstractC1337y0.a(p1Var, this.f15778h0, "", map);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15780j0.size();
    }
}
