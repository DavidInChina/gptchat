package Nh;

import io.sentry.android.core.z;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: Y  reason: collision with root package name */
    public final int f13109Y;

    /* renamed from: Z  reason: collision with root package name */
    public l f13110Z;

    public l(int i10, l lVar) {
        if (i10 != 589824 && i10 != 524288 && i10 != 458752 && i10 != 393216 && i10 != 327680 && i10 != 262144 && i10 != 17432576) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported api ", i10));
        }
        if (i10 == 17432576) {
            Bi.c.B0(this);
        }
        this.f13109Y = i10;
        this.f13110Z = lVar;
    }

    public void A(int i10, String str) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.A(i10, str);
        }
    }

    public void B(int i10, String str) {
        if (this.f13109Y >= 327680) {
            l lVar = this.f13110Z;
            if (lVar != null) {
                lVar.B(i10, str);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public io.sentry.vendor.b C(String str, int i10, boolean z10) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            return lVar.C(str, i10, z10);
        }
        return null;
    }

    public void D(int i10, int i11, k kVar, k... kVarArr) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.D(i10, i11, kVar, kVarArr);
        }
    }

    public io.sentry.vendor.b E(int i10, I5.h hVar, String str, boolean z10) {
        if (this.f13109Y >= 327680) {
            l lVar = this.f13110Z;
            if (lVar != null) {
                return lVar.E(i10, hVar, str, z10);
            }
            return null;
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public void F(k kVar, k kVar2, k kVar3, String str) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.F(kVar, kVar2, kVar3, str);
        }
    }

    public io.sentry.vendor.b G(int i10, I5.h hVar, String str, boolean z10) {
        if (this.f13109Y >= 327680) {
            l lVar = this.f13110Z;
            if (lVar != null) {
                return lVar.G(i10, hVar, str, z10);
            }
            return null;
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public void H(int i10, String str) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.H(i10, str);
        }
    }

    public void I(int i10, int i11) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.I(i10, i11);
        }
    }

    public void d(int i10, boolean z10) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.d(i10, z10);
        }
    }

    public io.sentry.vendor.b e(String str, boolean z10) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            return lVar.e(str, z10);
        }
        return null;
    }

    public io.sentry.vendor.b f() {
        l lVar = this.f13110Z;
        if (lVar != null) {
            return lVar.f();
        }
        return null;
    }

    public void g(z zVar) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.g(zVar);
        }
    }

    public void i() {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.i();
        }
    }

    public void j() {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.j();
        }
    }

    public void k(String str, int i10, String str2, String str3) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.k(str, i10, str2, str3);
        }
    }

    public void l(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.l(i10, i11, i12, objArr, objArr2);
        }
    }

    public void m(int i10, int i11) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.m(i10, i11);
        }
    }

    public void n(int i10) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.n(i10);
        }
    }

    public io.sentry.vendor.b o(int i10, I5.h hVar, String str, boolean z10) {
        if (this.f13109Y >= 327680) {
            l lVar = this.f13110Z;
            if (lVar != null) {
                return lVar.o(i10, hVar, str, z10);
            }
            return null;
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public void p(int i10, int i11) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.p(i10, i11);
        }
    }

    public void q(String str, String str2, j jVar, Object... objArr) {
        if (this.f13109Y >= 327680) {
            l lVar = this.f13110Z;
            if (lVar != null) {
                lVar.q(str, str2, jVar, objArr);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public void r(int i10, k kVar) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.r(i10, kVar);
        }
    }

    public void s(k kVar) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.s(kVar);
        }
    }

    public void t(Object obj) {
        int i10 = this.f13109Y;
        if (i10 < 327680 && ((obj instanceof j) || ((obj instanceof r) && ((r) obj).s() == 11))) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (i10 < 458752 && (obj instanceof e)) {
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.t(obj);
        }
    }

    public void u(int i10, k kVar) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.u(i10, kVar);
        }
    }

    public void v(String str, String str2, String str3, k kVar, k kVar2, int i10) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.v(str, str2, str3, kVar, kVar2, i10);
        }
    }

    public io.sentry.vendor.b w(int i10, I5.h hVar, k[] kVarArr, k[] kVarArr2, int[] iArr, String str, boolean z10) {
        if (this.f13109Y >= 327680) {
            l lVar = this.f13110Z;
            if (lVar != null) {
                return lVar.w(i10, hVar, kVarArr, kVarArr2, iArr, str, z10);
            }
            return null;
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public void x(k kVar, int[] iArr, k[] kVarArr) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.x(kVar, iArr, kVarArr);
        }
    }

    public void y(int i10, int i11) {
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.y(i10, i11);
        }
    }

    public void z(int i10, String str, String str2, String str3, boolean z10) {
        boolean z11;
        int i11;
        boolean z12;
        int i12 = this.f13109Y;
        if (i12 < 327680 && (i10 & 256) == 0) {
            if (i10 == 185) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                if (i12 < 327680) {
                    i11 = 256;
                } else {
                    i11 = 0;
                }
                int i13 = i11 | i10;
                if (i10 == 185) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z(i13, str, str2, str3, z12);
                return;
            }
            throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
        }
        l lVar = this.f13110Z;
        if (lVar != null) {
            lVar.z(i10 & (-257), str, str2, str3, z10);
        }
    }
}
