package L2;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class k implements B {

    /* renamed from: a  reason: collision with root package name */
    public final int f10610a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f10611b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f10612c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f10613d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f10614e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10615f;

    public k(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f10611b = iArr;
        this.f10612c = jArr;
        this.f10613d = jArr2;
        this.f10614e = jArr3;
        int length = iArr.length;
        this.f10610a = length;
        if (length > 0) {
            this.f10615f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f10615f = 0L;
        }
    }

    @Override // L2.B
    public final boolean e() {
        return true;
    }

    @Override // L2.B
    public final A i(long j6) {
        long[] jArr = this.f10614e;
        int e10 = AbstractC5530A.e(jArr, j6, true);
        long j10 = jArr[e10];
        long[] jArr2 = this.f10612c;
        C c10 = new C(j10, jArr2[e10]);
        if (j10 < j6 && e10 != this.f10610a - 1) {
            int i10 = e10 + 1;
            return new A(c10, new C(jArr[i10], jArr2[i10]));
        }
        return new A(c10, c10);
    }

    @Override // L2.B
    public final long j() {
        return this.f10615f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f10610a + ", sizes=" + Arrays.toString(this.f10611b) + ", offsets=" + Arrays.toString(this.f10612c) + ", timeUs=" + Arrays.toString(this.f10614e) + ", durationsUs=" + Arrays.toString(this.f10613d) + Separators.RPAREN;
    }
}
