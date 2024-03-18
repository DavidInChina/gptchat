package Bh;

import Eh.AbstractC0511j;
import sh.AbstractC5634f;
import wh.AbstractC6250o;

/* loaded from: classes2.dex */
public final class b1 implements c1 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6250o f2318Y;

    public b1(AbstractC6250o abstractC6250o) {
        this.f2318Y = abstractC6250o;
    }

    @Override // Bh.c1
    public final Hh.a b(Nh.l lVar, AbstractC0511j abstractC0511j) {
        throw new IllegalStateException("Cannot apply code for non-implemented method on " + this.f2318Y);
    }

    @Override // Bh.c1
    public final int c() {
        return 1;
    }

    @Override // Bh.c1
    public final void d(Nh.l lVar) {
        throw new IllegalStateException("Cannot apply head for non-implemented method on " + this.f2318Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        if (this.f2318Y.equals(((b1) obj).f2318Y)) {
            return true;
        }
        return false;
    }

    @Override // Bh.c1
    public final void g(Nh.l lVar, AbstractC0511j abstractC0511j, Fh.n nVar) {
        throw new IllegalStateException("Cannot apply body for non-implemented method on " + this.f2318Y);
    }

    @Override // Bh.c1
    public final AbstractC6250o getMethod() {
        return this.f2318Y;
    }

    @Override // Bh.c1
    public final xh.e getVisibility() {
        return ((AbstractC5634f) this.f2318Y).g1();
    }

    public final int hashCode() {
        return this.f2318Y.hashCode() + (b1.class.hashCode() * 31);
    }

    @Override // Bh.c1
    public final void e(Nh.l lVar, Fh.n nVar) {
    }

    @Override // Bh.c1
    public final void f(io.sentry.vendor.b bVar, AbstractC0511j abstractC0511j, Fh.n nVar) {
    }
}
