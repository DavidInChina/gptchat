package Rh;

import java.util.Map;
import yh.AbstractC6603e;
import yh.l1;

/* renamed from: Rh.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1320p0 implements AbstractC1322q0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1337y0 f15937Y;

    public C1320p0(AbstractC1337y0 abstractC1337y0) {
        this.f15937Y = abstractC1337y0;
    }

    @Override // Rh.AbstractC1322q0
    public final l1.a d(String str, p1 p1Var, Map map, AbstractC6603e abstractC6603e) {
        return Y0.j1(str, map, abstractC6603e.mo118a(), this.f15937Y, p1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1320p0.class != obj.getClass()) {
            return false;
        }
        if (this.f15937Y.equals(((C1320p0) obj).f15937Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15937Y.hashCode() + (C1320p0.class.hashCode() * 31);
    }
}
