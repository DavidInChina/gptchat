package S8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import jf.C3970t;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e  reason: collision with root package name */
    public static final c0 f16313e = new c0(null, null, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final N0.E f16314a;

    /* renamed from: b  reason: collision with root package name */
    public final Z0.n f16315b;

    /* renamed from: c  reason: collision with root package name */
    public final r0.r f16316c;

    /* renamed from: d  reason: collision with root package name */
    public final Float f16317d;

    public c0(N0.E e10, Z0.n nVar, r0.r rVar, Float f6) {
        this.f16314a = e10;
        this.f16315b = nVar;
        this.f16316c = rVar;
        this.f16317d = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (AbstractC3557B.K(this.f16314a, c0Var.f16314a) && AbstractC3557B.K(this.f16315b, c0Var.f16315b) && AbstractC3557B.K(this.f16316c, c0Var.f16316c) && AbstractC3557B.K(this.f16317d, c0Var.f16317d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        N0.E e10 = this.f16314a;
        if (e10 == null) {
            i10 = 0;
        } else {
            i10 = e10.hashCode();
        }
        int i14 = i10 * 31;
        Z0.n nVar = this.f16315b;
        if (nVar == null) {
            i11 = 0;
        } else {
            i11 = Z0.n.d(nVar.f22811a);
        }
        int i15 = (i14 + i11) * 31;
        r0.r rVar = this.f16316c;
        if (rVar == null) {
            i12 = 0;
        } else {
            i12 = C3970t.a(rVar.f44265a);
        }
        int i16 = (i15 + i12) * 31;
        Float f6 = this.f16317d;
        if (f6 != null) {
            i13 = f6.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "TableStyle(headerTextStyle=" + this.f16314a + ", cellPadding=" + this.f16315b + ", borderColor=" + this.f16316c + ", borderStrokeWidth=" + this.f16317d + Separators.RPAREN;
    }
}
