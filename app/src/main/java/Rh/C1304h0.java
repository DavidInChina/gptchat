package Rh;

import java.util.Map;
import sh.AbstractC5641m;
import yh.l1;

/* renamed from: Rh.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304h0 implements AbstractC1337y0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1337y0 f15875Y;

    public C1304h0(AbstractC1337y0 abstractC1337y0) {
        this.f15875Y = abstractC1337y0;
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        return new C1302g0(str, map, abstractC5641m, this.f15875Y, p1Var);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        throw new IllegalStateException("An upper bound wildcard cannot be the owner of a nested type: " + this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1304h0.class != obj.getClass()) {
            return false;
        }
        if (this.f15875Y.equals(((C1304h0) obj).f15875Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15875Y.hashCode() + (C1304h0.class.hashCode() * 31);
    }
}
