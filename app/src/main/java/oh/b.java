package Oh;

import I5.h;
import Nh.j;
import Nh.k;
import Nh.l;
import android.gov.nist.core.Separators;
import androidx.lifecycle.D;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: h0  reason: collision with root package name */
    public final D f13763h0;

    public b(int i10, l lVar, D d10) {
        super(i10, lVar);
        this.f13763h0 = d10;
    }

    @Override // Nh.l
    public final void A(int i10, String str) {
        super.A(i10, this.f13763h0.d(str));
    }

    @Override // Nh.l
    public final io.sentry.vendor.b C(String str, int i10, boolean z10) {
        io.sentry.vendor.b C10 = super.C(this.f13763h0.d(str), i10, z10);
        if (C10 != null) {
            return J(str, C10);
        }
        return C10;
    }

    @Override // Nh.l
    public final io.sentry.vendor.b E(int i10, h hVar, String str, boolean z10) {
        io.sentry.vendor.b E10 = super.E(i10, hVar, this.f13763h0.d(str), z10);
        if (E10 != null) {
            return J(str, E10);
        }
        return E10;
    }

    @Override // Nh.l
    public final void F(k kVar, k kVar2, k kVar3, String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = this.f13763h0.j(str);
        }
        super.F(kVar, kVar2, kVar3, str2);
    }

    @Override // Nh.l
    public final io.sentry.vendor.b G(int i10, h hVar, String str, boolean z10) {
        io.sentry.vendor.b G10 = super.G(i10, hVar, this.f13763h0.d(str), z10);
        if (G10 != null) {
            return J(str, G10);
        }
        return G10;
    }

    @Override // Nh.l
    public final void H(int i10, String str) {
        super.H(i10, this.f13763h0.j(str));
    }

    public final io.sentry.vendor.b J(String str, io.sentry.vendor.b bVar) {
        int i10 = this.f13109Y;
        D d10 = this.f13763h0;
        return new a(i10, str, bVar, d10).B(new a(i10, null, bVar, d10));
    }

    public final Object[] K(int i10, Object[] objArr) {
        if (objArr == null) {
            return objArr;
        }
        Object[] objArr2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] instanceof String) {
                if (objArr2 == null) {
                    objArr2 = new Object[i10];
                    System.arraycopy(objArr, 0, objArr2, 0, i10);
                }
                objArr2[i11] = this.f13763h0.j((String) objArr[i11]);
            }
        }
        if (objArr2 != null) {
            return objArr2;
        }
        return objArr;
    }

    @Override // Nh.l
    public final io.sentry.vendor.b e(String str, boolean z10) {
        io.sentry.vendor.b e10 = super.e(this.f13763h0.d(str), z10);
        if (e10 != null) {
            return J(str, e10);
        }
        return e10;
    }

    @Override // Nh.l
    public final io.sentry.vendor.b f() {
        io.sentry.vendor.b f6 = super.f();
        if (f6 != null) {
            return J(null, f6);
        }
        return f6;
    }

    @Override // Nh.l
    public final void k(String str, int i10, String str2, String str3) {
        D d10 = this.f13763h0;
        super.k(d10.j(str), i10, d10.e(str, str2), d10.d(str3));
    }

    @Override // Nh.l
    public final void l(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super.l(i10, i11, i12, K(i11, objArr), K(i12, objArr2));
    }

    @Override // Nh.l
    public final io.sentry.vendor.b o(int i10, h hVar, String str, boolean z10) {
        io.sentry.vendor.b o10 = super.o(i10, hVar, this.f13763h0.d(str), z10);
        if (o10 != null) {
            return J(str, o10);
        }
        return o10;
    }

    @Override // Nh.l
    public final void q(String str, String str2, j jVar, Object... objArr) {
        D d10;
        Object[] objArr2 = new Object[objArr.length];
        int i10 = 0;
        while (true) {
            int length = objArr.length;
            d10 = this.f13763h0;
            if (i10 >= length) {
                break;
            }
            objArr2[i10] = d10.l(objArr[i10]);
            i10++;
        }
        d10.getClass();
        String str3 = (String) d10.f25290b.get(Separators.DOT + str + str2);
        if (str3 != null) {
            str = str3;
        }
        super.q(str, d10.f(str2), (j) d10.l(jVar), objArr2);
    }

    @Override // Nh.l
    public final void t(Object obj) {
        super.t(this.f13763h0.l(obj));
    }

    @Override // Nh.l
    public final void v(String str, String str2, String str3, k kVar, k kVar2, int i10) {
        D d10 = this.f13763h0;
        super.v(str, d10.d(str2), d10.h(str3, true), kVar, kVar2, i10);
    }

    @Override // Nh.l
    public final io.sentry.vendor.b w(int i10, h hVar, k[] kVarArr, k[] kVarArr2, int[] iArr, String str, boolean z10) {
        io.sentry.vendor.b w10 = super.w(i10, hVar, kVarArr, kVarArr2, iArr, this.f13763h0.d(str), z10);
        if (w10 != null) {
            return J(str, w10);
        }
        return w10;
    }

    @Override // Nh.l
    public final void z(int i10, String str, String str2, String str3, boolean z10) {
        if (this.f13109Y < 327680 && (i10 & 256) == 0) {
            super.z(i10, str, str2, str3, z10);
            return;
        }
        D d10 = this.f13763h0;
        super.z(i10, d10.j(str), d10.g(str, str2, str3), d10.f(str3), z10);
    }
}
