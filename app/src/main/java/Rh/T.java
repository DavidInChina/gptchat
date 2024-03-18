package Rh;

import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import sh.AbstractC5641m;
import yh.l1;

/* loaded from: classes2.dex */
public final class T implements AbstractC1337y0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15726Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f15727Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC1337y0 f15728h0;

    public T(String str, List list, AbstractC1337y0 abstractC1337y0) {
        this.f15726Y = str;
        this.f15727Z = list;
        this.f15728h0 = abstractC1337y0;
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        return new S(p1Var, abstractC5641m, str, map, this.f15726Y, this.f15727Z, this.f15728h0);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        return !p1Var.a(this.f15726Y).a().E0();
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        return this.f15728h0.c() + '.';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t10 = (T) obj;
        if (this.f15726Y.equals(t10.f15726Y) && this.f15727Z.equals(t10.f15727Z) && this.f15728h0.equals(t10.f15728h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15728h0.hashCode() + AbstractC4194d.s(this.f15727Z, E9.f.v(this.f15726Y, T.class.hashCode() * 31, 31), 31);
    }
}
