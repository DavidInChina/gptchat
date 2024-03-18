package Rh;

import java.util.Map;
import sh.AbstractC5641m;
import yh.l1;

/* loaded from: classes2.dex */
public final class N implements AbstractC1337y0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1337y0 f15674Y;

    public N(AbstractC1337y0 abstractC1337y0) {
        this.f15674Y = abstractC1337y0;
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        return new M(str, map, abstractC5641m, this.f15674Y, p1Var);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        throw new IllegalStateException("A generic array type cannot be a type variable bound: " + this);
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        throw new IllegalStateException("A generic array type cannot be the owner of a nested type: " + this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        if (this.f15674Y.equals(((N) obj).f15674Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15674Y.hashCode() + (N.class.hashCode() * 31);
    }
}
