package d3;

import L2.A;
import L2.C;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f27979a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f27980b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27981c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27982d;

    public g(long[] jArr, long[] jArr2, long j6, long j10) {
        this.f27979a = jArr;
        this.f27980b = jArr2;
        this.f27981c = j6;
        this.f27982d = j10;
    }

    @Override // d3.f
    public final long c() {
        return this.f27982d;
    }

    @Override // L2.B
    public final boolean e() {
        return true;
    }

    @Override // d3.f
    public final long f(long j6) {
        return this.f27979a[AbstractC5530A.e(this.f27980b, j6, true)];
    }

    @Override // L2.B
    public final A i(long j6) {
        long[] jArr = this.f27979a;
        int e10 = AbstractC5530A.e(jArr, j6, true);
        long j10 = jArr[e10];
        long[] jArr2 = this.f27980b;
        C c10 = new C(j10, jArr2[e10]);
        if (j10 < j6 && e10 != jArr.length - 1) {
            int i10 = e10 + 1;
            return new A(c10, new C(jArr[i10], jArr2[i10]));
        }
        return new A(c10, c10);
    }

    @Override // L2.B
    public final long j() {
        return this.f27981c;
    }
}
