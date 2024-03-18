package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class G2 extends C2 {

    /* renamed from: c  reason: collision with root package name */
    private V2 f35421c;

    @Override // j$.util.stream.AbstractC3808o2, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        this.f35421c.accept(i10);
    }

    @Override // j$.util.stream.AbstractC3788k2, j$.util.stream.AbstractC3818q2
    public final void k() {
        int[] iArr = (int[]) this.f35421c.e();
        Arrays.sort(iArr);
        AbstractC3818q2 abstractC3818q2 = this.f35675a;
        abstractC3818q2.l(iArr.length);
        int i10 = 0;
        if (!this.f35394b) {
            int length = iArr.length;
            while (i10 < length) {
                abstractC3818q2.accept(iArr[i10]);
                i10++;
            }
        } else {
            int length2 = iArr.length;
            while (i10 < length2) {
                int i11 = iArr[i10];
                if (abstractC3818q2.n()) {
                    break;
                }
                abstractC3818q2.accept(i11);
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
            this.f35421c = j6 > 0 ? new Z2((int) j6) : new Z2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
