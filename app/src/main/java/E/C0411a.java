package E;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: E.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411a implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final A0 f3833a;

    /* renamed from: b  reason: collision with root package name */
    public final A0 f3834b;

    public C0411a(j0 j0Var, A0 a02) {
        this.f3833a = j0Var;
        this.f3834b = a02;
    }

    @Override // E.A0
    public final int a(Z0.b bVar, Z0.l lVar) {
        return this.f3834b.a(bVar, lVar) + this.f3833a.a(bVar, lVar);
    }

    @Override // E.A0
    public final int b(Z0.b bVar, Z0.l lVar) {
        return this.f3834b.b(bVar, lVar) + this.f3833a.b(bVar, lVar);
    }

    @Override // E.A0
    public final int c(Z0.b bVar) {
        return this.f3834b.c(bVar) + this.f3833a.c(bVar);
    }

    @Override // E.A0
    public final int d(Z0.b bVar) {
        return this.f3834b.d(bVar) + this.f3833a.d(bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0411a)) {
            return false;
        }
        C0411a c0411a = (C0411a) obj;
        if (AbstractC3557B.K(c0411a.f3833a, this.f3833a) && AbstractC3557B.K(c0411a.f3834b, this.f3834b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3834b.hashCode() * 31) + this.f3833a.hashCode();
    }

    public final String toString() {
        return Separators.LPAREN + this.f3833a + " + " + this.f3834b + ')';
    }
}
