package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class P2 extends D2 {

    /* renamed from: c  reason: collision with root package name */
    private long[] f35501c;

    /* renamed from: d  reason: collision with root package name */
    private int f35502d;

    @Override // j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        long[] jArr = this.f35501c;
        int i10 = this.f35502d;
        this.f35502d = i10 + 1;
        jArr[i10] = j6;
    }

    @Override // j$.util.stream.AbstractC3793l2, j$.util.stream.AbstractC3818q2
    public final void k() {
        int i10 = 0;
        Arrays.sort(this.f35501c, 0, this.f35502d);
        AbstractC3818q2 abstractC3818q2 = this.f35678a;
        abstractC3818q2.l(this.f35502d);
        if (!this.f35405b) {
            while (i10 < this.f35502d) {
                abstractC3818q2.accept(this.f35501c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f35502d && !abstractC3818q2.n()) {
                abstractC3818q2.accept(this.f35501c[i10]);
                i10++;
            }
        }
        abstractC3818q2.k();
        this.f35501c = null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        if (j6 < 2147483639) {
            this.f35501c = new long[(int) j6];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
