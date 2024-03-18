package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class Q2 extends E2 {

    /* renamed from: d  reason: collision with root package name */
    private Object[] f35507d;

    /* renamed from: e  reason: collision with root package name */
    private int f35508e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f35507d;
        int i10 = this.f35508e;
        this.f35508e = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void k() {
        int i10 = 0;
        Arrays.sort(this.f35507d, 0, this.f35508e, this.f35411b);
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        abstractC3818q2.l(this.f35508e);
        if (!this.f35412c) {
            while (i10 < this.f35508e) {
                abstractC3818q2.accept((AbstractC3818q2) this.f35507d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f35508e && !abstractC3818q2.n()) {
                abstractC3818q2.accept((AbstractC3818q2) this.f35507d[i10]);
                i10++;
            }
        }
        abstractC3818q2.k();
        this.f35507d = null;
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        if (j6 < 2147483639) {
            this.f35507d = new Object[(int) j6];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
