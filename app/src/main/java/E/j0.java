package E;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class j0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f3881a;

    public j0(g0 g0Var) {
        this.f3881a = g0Var;
    }

    @Override // E.A0
    public final int a(Z0.b bVar, Z0.l lVar) {
        return bVar.a0(this.f3881a.b(lVar));
    }

    @Override // E.A0
    public final int b(Z0.b bVar, Z0.l lVar) {
        return bVar.a0(this.f3881a.c(lVar));
    }

    @Override // E.A0
    public final int c(Z0.b bVar) {
        return bVar.a0(this.f3881a.d());
    }

    @Override // E.A0
    public final int d(Z0.b bVar) {
        return bVar.a0(this.f3881a.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return AbstractC3557B.K(((j0) obj).f3881a, this.f3881a);
    }

    public final int hashCode() {
        return this.f3881a.hashCode();
    }

    public final String toString() {
        Z0.l lVar = Z0.l.f22805Y;
        g0 g0Var = this.f3881a;
        float b10 = g0Var.b(lVar);
        float d10 = g0Var.d();
        float c10 = g0Var.c(lVar);
        float a5 = g0Var.a();
        return "PaddingValues(" + ((Object) Z0.e.b(b10)) + ", " + ((Object) Z0.e.b(d10)) + ", " + ((Object) Z0.e.b(c10)) + ", " + ((Object) Z0.e.b(a5)) + ')';
    }
}
