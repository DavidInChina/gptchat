package Rh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import sh.AbstractC5641m;
import wh.AbstractC6242g;
import yh.G1;
import yh.l1;

/* renamed from: Rh.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1316n0 implements AbstractC1318o0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1337y0 f15928Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f15929Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f15930h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f15931i0;

    public C1316n0(AbstractC1337y0 abstractC1337y0, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f15928Y = abstractC1337y0;
        this.f15929Z = arrayList;
        this.f15930h0 = arrayList2;
        this.f15931i0 = arrayList3;
    }

    @Override // Rh.AbstractC1318o0
    public final l1.a b(String str, p1 p1Var, Map map, AbstractC6242g abstractC6242g) {
        return Y0.j1(str, map, abstractC6242g, this.f15928Y, p1Var);
    }

    @Override // Rh.AbstractC1318o0
    public final G1 c(ArrayList arrayList, p1 p1Var, Map map, M0 m02) {
        return new W0(p1Var, this.f15929Z, map, arrayList, m02);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1316n0.class != obj.getClass()) {
            return false;
        }
        C1316n0 c1316n0 = (C1316n0) obj;
        if (this.f15928Y.equals(c1316n0.f15928Y) && this.f15929Z.equals(c1316n0.f15929Z) && this.f15930h0.equals(c1316n0.f15930h0) && this.f15931i0.equals(c1316n0.f15931i0)) {
            return true;
        }
        return false;
    }

    @Override // Rh.AbstractC1335x0
    public final G1 f(p1 p1Var, AbstractC5641m abstractC5641m, Map map, Map map2) {
        return new X0(p1Var, this.f15931i0, abstractC5641m, map, map2);
    }

    @Override // Rh.AbstractC1318o0
    public final G1 h(List list, p1 p1Var, Map map, AbstractC6242g abstractC6242g) {
        if (this.f15930h0.isEmpty()) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return new C1329u0(p1Var, map, list);
        }
        return new W0(p1Var, this.f15930h0, map, list, abstractC6242g);
    }

    public final int hashCode() {
        int hashCode = this.f15928Y.hashCode();
        return this.f15931i0.hashCode() + AbstractC4194d.s(this.f15930h0, AbstractC4194d.s(this.f15929Z, (hashCode + (C1316n0.class.hashCode() * 31)) * 31, 31), 31);
    }
}
