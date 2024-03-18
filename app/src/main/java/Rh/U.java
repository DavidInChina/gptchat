package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import yh.l1;

/* loaded from: classes2.dex */
public final class U implements AbstractC1337y0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15735Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f15736Z;

    public U(String str, List list) {
        this.f15735Y = str;
        this.f15736Z = list;
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        return new Q(p1Var, abstractC5641m, str, map, this.f15735Y, this.f15736Z);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        return !p1Var.a(this.f15735Y).a().E0();
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        return String.valueOf('.');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        U u10 = (U) obj;
        if (this.f15735Y.equals(u10.f15735Y) && this.f15736Z.equals(u10.f15736Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15736Z.hashCode() + E9.f.v(this.f15735Y, U.class.hashCode() * 31, 31);
    }
}
