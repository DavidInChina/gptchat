package j$.util;

import java.util.function.IntConsumer;

/* renamed from: j$.util.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3724h implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public final void a(C3724h c3724h) {
        this.count += c3724h.count;
        this.sum += c3724h.sum;
        this.min = Math.min(this.min, c3724h.min);
        this.max = Math.max(this.max, c3724h.max);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.count++;
        this.sum += i10;
        this.min = Math.min(this.min, i10);
        this.max = Math.max(this.max, i10);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C3724h.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j6 = this.count;
        objArr[4] = Double.valueOf(j6 > 0 ? this.sum / j6 : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
