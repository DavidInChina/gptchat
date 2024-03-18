package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import yh.l1;

/* renamed from: Rh.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296d0 implements AbstractC1337y0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15808Y;

    public C1296d0(String str) {
        this.f15808Y = str;
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        String str2 = this.f15808Y;
        l1.a Z02 = abstractC5641m.Z0(str2);
        if (Z02 == null) {
            return new C1294c0(abstractC5641m, p1Var, str2, (List) map.get(str));
        }
        return new Y(p1Var, (List) map.get(str), Z02);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        return true;
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        throw new IllegalStateException("A type variable cannot be the owner of a nested type: " + this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1296d0.class != obj.getClass()) {
            return false;
        }
        if (this.f15808Y.equals(((C1296d0) obj).f15808Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15808Y.hashCode() + (C1296d0.class.hashCode() * 31);
    }
}
