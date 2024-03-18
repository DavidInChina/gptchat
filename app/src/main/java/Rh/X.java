package Rh;

import java.util.Map;
import sh.AbstractC5641m;
import yh.l1;

/* loaded from: classes2.dex */
public final class X implements AbstractC1337y0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15761Y;

    public X(String str) {
        this.f15761Y = str;
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        return new C1331v0(str, map, p1Var.a(this.f15761Y).a(), p1Var);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        return !p1Var.a(this.f15761Y).a().E0();
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        throw new IllegalStateException("A non-generic type cannot be the owner of a nested type: " + this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        if (this.f15761Y.equals(((X) obj).f15761Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15761Y.hashCode() + (X.class.hashCode() * 31);
    }
}
