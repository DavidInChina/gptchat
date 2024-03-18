package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class O2 extends C2 {

    /* renamed from: c  reason: collision with root package name */
    private int[] f35492c;

    /* renamed from: d  reason: collision with root package name */
    private int f35493d;

    @Override // j$.util.stream.AbstractC3808o2, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        int[] iArr = this.f35492c;
        int i11 = this.f35493d;
        this.f35493d = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.stream.AbstractC3788k2, j$.util.stream.AbstractC3818q2
    public final void k() {
        int i10 = 0;
        Arrays.sort(this.f35492c, 0, this.f35493d);
        AbstractC3818q2 abstractC3818q2 = this.f35675a;
        abstractC3818q2.l(this.f35493d);
        if (!this.f35394b) {
            while (i10 < this.f35493d) {
                abstractC3818q2.accept(this.f35492c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f35493d && !abstractC3818q2.n()) {
                abstractC3818q2.accept(this.f35492c[i10]);
                i10++;
            }
        }
        abstractC3818q2.k();
        this.f35492c = null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        if (j6 < 2147483639) {
            this.f35492c = new int[(int) j6];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
