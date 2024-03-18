package Rh;

import java.util.Map;
import sh.AbstractC5641m;
import yh.l1;

/* loaded from: classes2.dex */
public final class P implements AbstractC1337y0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1337y0 f15685Y;

    public P(AbstractC1337y0 abstractC1337y0) {
        this.f15685Y = abstractC1337y0;
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        return new O(str, map, abstractC5641m, this.f15685Y, p1Var);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        throw new IllegalStateException("A lower bound wildcard cannot be the owner of a nested type: " + this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        if (this.f15685Y.equals(((P) obj).f15685Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15685Y.hashCode() + (P.class.hashCode() * 31);
    }
}
