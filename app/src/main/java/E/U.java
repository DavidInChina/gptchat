package E;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class U implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final A0 f3821a;

    /* renamed from: b  reason: collision with root package name */
    public final Z0.b f3822b;

    public U(A0 a02, Z0.b bVar) {
        this.f3821a = a02;
        this.f3822b = bVar;
    }

    @Override // E.g0
    public final float a() {
        A0 a02 = this.f3821a;
        Z0.b bVar = this.f3822b;
        return bVar.J(a02.d(bVar));
    }

    @Override // E.g0
    public final float b(Z0.l lVar) {
        A0 a02 = this.f3821a;
        Z0.b bVar = this.f3822b;
        return bVar.J(a02.a(bVar, lVar));
    }

    @Override // E.g0
    public final float c(Z0.l lVar) {
        A0 a02 = this.f3821a;
        Z0.b bVar = this.f3822b;
        return bVar.J(a02.b(bVar, lVar));
    }

    @Override // E.g0
    public final float d() {
        A0 a02 = this.f3821a;
        Z0.b bVar = this.f3822b;
        return bVar.J(a02.c(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        if (AbstractC3557B.K(this.f3821a, u10.f3821a) && AbstractC3557B.K(this.f3822b, u10.f3822b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3822b.hashCode() + (this.f3821a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f3821a + ", density=" + this.f3822b + ')';
    }
}
