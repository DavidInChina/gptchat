package L2;

import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class z implements B {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f10659a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f10660b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10661c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10662d;

    public z(long j6, long[] jArr, long[] jArr2) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f10662d = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f10659a = jArr3;
            long[] jArr4 = new long[i10];
            this.f10660b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f10659a = jArr;
            this.f10660b = jArr2;
        }
        this.f10661c = j6;
    }

    @Override // L2.B
    public final boolean e() {
        return this.f10662d;
    }

    @Override // L2.B
    public final A i(long j6) {
        if (!this.f10662d) {
            C c10 = C.f10519c;
            return new A(c10, c10);
        }
        long[] jArr = this.f10660b;
        int e10 = AbstractC5530A.e(jArr, j6, true);
        long j10 = jArr[e10];
        long[] jArr2 = this.f10659a;
        C c11 = new C(j10, jArr2[e10]);
        if (j10 != j6 && e10 != jArr.length - 1) {
            int i10 = e10 + 1;
            return new A(c11, new C(jArr[i10], jArr2[i10]));
        }
        return new A(c11, c11);
    }

    @Override // L2.B
    public final long j() {
        return this.f10661c;
    }
}
