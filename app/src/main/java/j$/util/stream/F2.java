package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class F2 extends B2 {

    /* renamed from: c  reason: collision with root package name */
    private T2 f35416c;

    @Override // j$.util.stream.AbstractC3803n2, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        this.f35416c.accept(d10);
    }

    @Override // j$.util.stream.AbstractC3783j2, j$.util.stream.AbstractC3818q2
    public final void k() {
        double[] dArr = (double[]) this.f35416c.e();
        Arrays.sort(dArr);
        AbstractC3818q2 abstractC3818q2 = this.f35672a;
        abstractC3818q2.l(dArr.length);
        int i10 = 0;
        if (!this.f35390b) {
            int length = dArr.length;
            while (i10 < length) {
                abstractC3818q2.accept(dArr[i10]);
                i10++;
            }
        } else {
            int length2 = dArr.length;
            while (i10 < length2) {
                double d10 = dArr[i10];
                if (abstractC3818q2.n()) {
                    break;
                }
                abstractC3818q2.accept(d10);
                i10++;
            }
        }
        abstractC3818q2.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Z2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Z2] */
    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        if (j6 < 2147483639) {
            this.f35416c = j6 > 0 ? new Z2((int) j6) : new Z2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
