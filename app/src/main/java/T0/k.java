package T0;

import N0.C1046e;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final t f16791a;

    /* renamed from: b  reason: collision with root package name */
    public int f16792b;

    /* renamed from: c  reason: collision with root package name */
    public int f16793c;

    /* renamed from: d  reason: collision with root package name */
    public int f16794d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f16795e = -1;

    /* JADX WARN: Type inference failed for: r0v0, types: [T0.t, java.lang.Object] */
    public k(C1046e c1046e, long j6) {
        String str = c1046e.f12512Y;
        ?? obj = new Object();
        obj.f16812a = str;
        obj.f16814c = -1;
        obj.f16815d = -1;
        this.f16791a = obj;
        this.f16792b = N0.D.e(j6);
        this.f16793c = N0.D.d(j6);
        int e10 = N0.D.e(j6);
        int d10 = N0.D.d(j6);
        String str2 = c1046e.f12512Y;
        if (e10 >= 0 && e10 <= str2.length()) {
            if (d10 >= 0 && d10 <= str2.length()) {
                if (e10 <= d10) {
                    return;
                }
                throw new IllegalArgumentException(AbstractC2469q0.i("Do not set reversed range: ", e10, " > ", d10));
            }
            StringBuilder q10 = android.gov.nist.core.a.q("end (", d10, ") offset is outside of text region ");
            q10.append(str2.length());
            throw new IndexOutOfBoundsException(q10.toString());
        }
        StringBuilder q11 = android.gov.nist.core.a.q("start (", e10, ") offset is outside of text region ");
        q11.append(str2.length());
        throw new IndexOutOfBoundsException(q11.toString());
    }

    public final void a(int i10, int i11) {
        long e10 = U3.f.e(i10, i11);
        this.f16791a.b(i10, i11, "");
        long v02 = AbstractC4828h.v0(U3.f.e(this.f16792b, this.f16793c), e10);
        h(N0.D.e(v02));
        g(N0.D.d(v02));
        int i12 = this.f16794d;
        if (i12 != -1) {
            long v03 = AbstractC4828h.v0(U3.f.e(i12, this.f16795e), e10);
            if (N0.D.b(v03)) {
                this.f16794d = -1;
                this.f16795e = -1;
                return;
            }
            this.f16794d = N0.D.e(v03);
            this.f16795e = N0.D.d(v03);
        }
    }

    public final char b(int i10) {
        t tVar = this.f16791a;
        m mVar = tVar.f16813b;
        if (mVar == null) {
            return tVar.f16812a.charAt(i10);
        }
        if (i10 < tVar.f16814c) {
            return tVar.f16812a.charAt(i10);
        }
        int M10 = mVar.f16797b - mVar.M();
        int i11 = tVar.f16814c;
        if (i10 < M10 + i11) {
            int i12 = i10 - i11;
            int i13 = mVar.f16798c;
            if (i12 < i13) {
                return ((char[]) mVar.f16800e)[i12];
            }
            return ((char[]) mVar.f16800e)[(i12 - i13) + mVar.f16799d];
        }
        return tVar.f16812a.charAt(i10 - ((M10 - tVar.f16815d) + i11));
    }

    public final N0.D c() {
        int i10 = this.f16794d;
        if (i10 != -1) {
            return new N0.D(U3.f.e(i10, this.f16795e));
        }
        return null;
    }

    public final void d(int i10, int i11, String str) {
        t tVar = this.f16791a;
        if (i10 >= 0 && i10 <= tVar.a()) {
            if (i11 >= 0 && i11 <= tVar.a()) {
                if (i10 <= i11) {
                    tVar.b(i10, i11, str);
                    h(str.length() + i10);
                    g(str.length() + i10);
                    this.f16794d = -1;
                    this.f16795e = -1;
                    return;
                }
                throw new IllegalArgumentException(AbstractC2469q0.i("Do not set reversed range: ", i10, " > ", i11));
            }
            StringBuilder q10 = android.gov.nist.core.a.q("end (", i11, ") offset is outside of text region ");
            q10.append(tVar.a());
            throw new IndexOutOfBoundsException(q10.toString());
        }
        StringBuilder q11 = android.gov.nist.core.a.q("start (", i10, ") offset is outside of text region ");
        q11.append(tVar.a());
        throw new IndexOutOfBoundsException(q11.toString());
    }

    public final void e(int i10, int i11) {
        t tVar = this.f16791a;
        if (i10 >= 0 && i10 <= tVar.a()) {
            if (i11 >= 0 && i11 <= tVar.a()) {
                if (i10 < i11) {
                    this.f16794d = i10;
                    this.f16795e = i11;
                    return;
                }
                throw new IllegalArgumentException(AbstractC2469q0.i("Do not set reversed or empty range: ", i10, " > ", i11));
            }
            StringBuilder q10 = android.gov.nist.core.a.q("end (", i11, ") offset is outside of text region ");
            q10.append(tVar.a());
            throw new IndexOutOfBoundsException(q10.toString());
        }
        StringBuilder q11 = android.gov.nist.core.a.q("start (", i10, ") offset is outside of text region ");
        q11.append(tVar.a());
        throw new IndexOutOfBoundsException(q11.toString());
    }

    public final void f(int i10, int i11) {
        t tVar = this.f16791a;
        if (i10 >= 0 && i10 <= tVar.a()) {
            if (i11 >= 0 && i11 <= tVar.a()) {
                if (i10 <= i11) {
                    h(i10);
                    g(i11);
                    return;
                }
                throw new IllegalArgumentException(AbstractC2469q0.i("Do not set reversed range: ", i10, " > ", i11));
            }
            StringBuilder q10 = android.gov.nist.core.a.q("end (", i11, ") offset is outside of text region ");
            q10.append(tVar.a());
            throw new IndexOutOfBoundsException(q10.toString());
        }
        StringBuilder q11 = android.gov.nist.core.a.q("start (", i10, ") offset is outside of text region ");
        q11.append(tVar.a());
        throw new IndexOutOfBoundsException(q11.toString());
    }

    public final void g(int i10) {
        if (i10 >= 0) {
            this.f16793c = i10;
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Cannot set selectionEnd to a negative value: ", i10).toString());
    }

    public final void h(int i10) {
        if (i10 >= 0) {
            this.f16792b = i10;
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Cannot set selectionStart to a negative value: ", i10).toString());
    }

    public final String toString() {
        return this.f16791a.toString();
    }
}
