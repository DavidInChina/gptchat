package Rh;

import java.util.Map;
import sh.AbstractC5641m;
import yh.C6641v;
import yh.l1;

/* loaded from: classes2.dex */
public enum W implements AbstractC1337y0 {
    f15745Z("BOOLEAN"),
    f15746h0("BYTE"),
    f15747i0("SHORT"),
    f15748j0("CHAR"),
    f15749k0("INTEGER"),
    f15750l0("LONG"),
    f15751m0("FLOAT"),
    f15752n0("DOUBLE"),
    f15753o0("VOID");
    

    /* renamed from: Y  reason: collision with root package name */
    public final yh.l1 f15755Y;

    W(String str) {
        this.f15755Y = C6641v.l1(r2);
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        return new V(str, map, this.f15755Y, p1Var);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        throw new IllegalStateException("A primitive type cannot be a type variable bound: " + this);
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        throw new IllegalStateException("A primitive type cannot be the owner of a nested type: " + this);
    }
}
