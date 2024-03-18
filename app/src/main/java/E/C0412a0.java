package E;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: E.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0412a0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final A0 f3835a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3836b;

    public C0412a0(A0 a02, int i10) {
        this.f3835a = a02;
        this.f3836b = i10;
    }

    @Override // E.A0
    public final int a(Z0.b bVar, Z0.l lVar) {
        int i10;
        if (lVar == Z0.l.f22805Y) {
            i10 = 8;
        } else {
            i10 = 2;
        }
        if ((i10 & this.f3836b) != 0) {
            return this.f3835a.a(bVar, lVar);
        }
        return 0;
    }

    @Override // E.A0
    public final int b(Z0.b bVar, Z0.l lVar) {
        int i10;
        if (lVar == Z0.l.f22805Y) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        if ((i10 & this.f3836b) != 0) {
            return this.f3835a.b(bVar, lVar);
        }
        return 0;
    }

    @Override // E.A0
    public final int c(Z0.b bVar) {
        if ((this.f3836b & 16) != 0) {
            return this.f3835a.c(bVar);
        }
        return 0;
    }

    @Override // E.A0
    public final int d(Z0.b bVar) {
        if ((this.f3836b & 32) != 0) {
            return this.f3835a.d(bVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0412a0)) {
            return false;
        }
        C0412a0 c0412a0 = (C0412a0) obj;
        if (AbstractC3557B.K(this.f3835a, c0412a0.f3835a)) {
            if (this.f3836b == c0412a0.f3836b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3835a.hashCode() * 31) + this.f3836b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        sb2.append(this.f3835a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i10 = this.f3836b;
        int i11 = r9.y.f44621a;
        if ((i10 & i11) == i11) {
            r9.y.g1("Start", sb4);
        }
        int i12 = r9.y.f44623c;
        if ((i10 & i12) == i12) {
            r9.y.g1("Left", sb4);
        }
        if ((i10 & 16) == 16) {
            r9.y.g1("Top", sb4);
        }
        int i13 = r9.y.f44622b;
        if ((i10 & i13) == i13) {
            r9.y.g1("End", sb4);
        }
        int i14 = r9.y.f44624d;
        if ((i10 & i14) == i14) {
            r9.y.g1("Right", sb4);
        }
        if ((i10 & 32) == 32) {
            r9.y.g1("Bottom", sb4);
        }
        String sb5 = sb4.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb5);
        sb3.append(sb5);
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
