package Rh;

import java.util.Map;
import yh.l1;

/* renamed from: Rh.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312l0 implements AbstractC1314m0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1337y0 f15924Y;

    public C1312l0(AbstractC1337y0 abstractC1337y0) {
        this.f15924Y = abstractC1337y0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1312l0.class != obj.getClass()) {
            return false;
        }
        if (this.f15924Y.equals(((C1312l0) obj).f15924Y)) {
            return true;
        }
        return false;
    }

    @Override // Rh.AbstractC1314m0
    public final l1.a g(String str, p1 p1Var, Map map, vh.c cVar) {
        return Y0.j1(str, map, cVar.mo118a(), this.f15924Y, p1Var);
    }

    public final int hashCode() {
        return this.f15924Y.hashCode() + (C1312l0.class.hashCode() * 31);
    }
}
