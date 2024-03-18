package E;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class F implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final A0 f3768a;

    /* renamed from: b  reason: collision with root package name */
    public final A0 f3769b;

    public F(A0 a02, A0 a03) {
        this.f3768a = a02;
        this.f3769b = a03;
    }

    @Override // E.A0
    public final int a(Z0.b bVar, Z0.l lVar) {
        int a5 = this.f3768a.a(bVar, lVar) - this.f3769b.a(bVar, lVar);
        if (a5 < 0) {
            return 0;
        }
        return a5;
    }

    @Override // E.A0
    public final int b(Z0.b bVar, Z0.l lVar) {
        int b10 = this.f3768a.b(bVar, lVar) - this.f3769b.b(bVar, lVar);
        if (b10 < 0) {
            return 0;
        }
        return b10;
    }

    @Override // E.A0
    public final int c(Z0.b bVar) {
        int c10 = this.f3768a.c(bVar) - this.f3769b.c(bVar);
        if (c10 < 0) {
            return 0;
        }
        return c10;
    }

    @Override // E.A0
    public final int d(Z0.b bVar) {
        int d10 = this.f3768a.d(bVar) - this.f3769b.d(bVar);
        if (d10 < 0) {
            return 0;
        }
        return d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        if (AbstractC3557B.K(f6.f3768a, this.f3768a) && AbstractC3557B.K(f6.f3769b, this.f3769b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3769b.hashCode() + (this.f3768a.hashCode() * 31);
    }

    public final String toString() {
        return Separators.LPAREN + this.f3768a + " - " + this.f3769b + ')';
    }
}
