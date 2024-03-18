package Rh;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import sh.AbstractC5641m;
import yh.G1;
import yh.l1;

/* renamed from: Rh.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1323r0 implements AbstractC1325s0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1337y0 f15941Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f15942Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f15943h0;

    public C1323r0(AbstractC1337y0 abstractC1337y0, ArrayList arrayList, ArrayList arrayList2) {
        this.f15941Y = abstractC1337y0;
        this.f15942Z = arrayList;
        this.f15943h0 = arrayList2;
    }

    @Override // Rh.AbstractC1325s0
    public final l1.a a(String str, Map map, yh.l1 l1Var, p1 p1Var) {
        return Y0.j1(str, map, l1Var, this.f15941Y, p1Var);
    }

    @Override // Rh.AbstractC1325s0
    public final G1 e(List list, p1 p1Var, Map map, yh.l1 l1Var) {
        return new W0(p1Var, this.f15942Z, map, list, l1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1323r0.class != obj.getClass()) {
            return false;
        }
        C1323r0 c1323r0 = (C1323r0) obj;
        if (this.f15941Y.equals(c1323r0.f15941Y) && this.f15942Z.equals(c1323r0.f15942Z) && this.f15943h0.equals(c1323r0.f15943h0)) {
            return true;
        }
        return false;
    }

    @Override // Rh.AbstractC1335x0
    public final G1 f(p1 p1Var, AbstractC5641m abstractC5641m, Map map, Map map2) {
        return new X0(p1Var, this.f15943h0, abstractC5641m, map, map2);
    }

    public final int hashCode() {
        int hashCode = this.f15941Y.hashCode();
        return this.f15943h0.hashCode() + AbstractC4194d.s(this.f15942Z, (hashCode + (C1323r0.class.hashCode() * 31)) * 31, 31);
    }
}
