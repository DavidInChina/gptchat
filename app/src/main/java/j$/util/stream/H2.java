package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class H2 extends D2 {

    /* renamed from: c  reason: collision with root package name */
    private X2 f35428c;

    @Override // j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f35428c.accept(j6);
    }

    @Override // j$.util.stream.AbstractC3793l2, j$.util.stream.AbstractC3818q2
    public final void k() {
        long[] jArr = (long[]) this.f35428c.e();
        Arrays.sort(jArr);
        AbstractC3818q2 abstractC3818q2 = this.f35678a;
        abstractC3818q2.l(jArr.length);
        int i10 = 0;
        if (!this.f35405b) {
            int length = jArr.length;
            while (i10 < length) {
                abstractC3818q2.accept(jArr[i10]);
                i10++;
            }
        } else {
            int length2 = jArr.length;
            while (i10 < length2) {
                long j6 = jArr[i10];
                if (abstractC3818q2.n()) {
                    break;
                }
                abstractC3818q2.accept(j6);
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
            this.f35428c = j6 > 0 ? new Z2((int) j6) : new Z2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
