package Rh;

import th.AbstractC5809q;
import th.C5787T;
import wh.AbstractC6242g;
import yh.AbstractC6632q;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class E0 extends AbstractC5809q {

    /* renamed from: a  reason: collision with root package name */
    public final String f15617a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15618b;

    public E0(String str, int i10) {
        this.f15617a = str;
        this.f15618b = i10;
    }

    @Override // th.h0
    public final th.a0 a(ClassLoader classLoader) {
        throw new IllegalStateException("Expected filtering of this unresolved property");
    }

    @Override // th.h0
    public final Object b() {
        throw new IllegalStateException("Expected filtering of this unresolved property");
    }

    @Override // th.h0
    public final int c() {
        return 14;
    }

    @Override // th.h0
    public final th.h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        String str;
        if (abstractC6242g.getReturnType().T0()) {
            str = th.g0.JAVA_19_CAPABLE_VM.a(this.f15618b);
        } else {
            str = this.f15617a;
        }
        return new C5787T(2, abstractC6242g, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E0.class != obj.getClass()) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (AbstractC6708l.c(this.f15618b, e02.f15618b) && this.f15617a.equals(e02.f15617a)) {
            return true;
        }
        return false;
    }

    @Override // th.h0
    public final int getState() {
        return 2;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f15618b) + E9.f.v(this.f15617a, E0.class.hashCode() * 31, 31);
    }
}
