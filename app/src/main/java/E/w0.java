package E;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class w0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final A0 f3969a;

    /* renamed from: b  reason: collision with root package name */
    public final A0 f3970b;

    public w0(A0 a02, A0 a03) {
        this.f3969a = a02;
        this.f3970b = a03;
    }

    @Override // E.A0
    public final int a(Z0.b bVar, Z0.l lVar) {
        return Math.max(this.f3969a.a(bVar, lVar), this.f3970b.a(bVar, lVar));
    }

    @Override // E.A0
    public final int b(Z0.b bVar, Z0.l lVar) {
        return Math.max(this.f3969a.b(bVar, lVar), this.f3970b.b(bVar, lVar));
    }

    @Override // E.A0
    public final int c(Z0.b bVar) {
        return Math.max(this.f3969a.c(bVar), this.f3970b.c(bVar));
    }

    @Override // E.A0
    public final int d(Z0.b bVar) {
        return Math.max(this.f3969a.d(bVar), this.f3970b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (AbstractC3557B.K(w0Var.f3969a, this.f3969a) && AbstractC3557B.K(w0Var.f3970b, this.f3970b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3970b.hashCode() * 31) + this.f3969a.hashCode();
    }

    public final String toString() {
        return Separators.LPAREN + this.f3969a + " \u222a " + this.f3970b + ')';
    }
}
