package j$.util;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.j  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3726j implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final void a(C3726j c3726j) {
        this.count += c3726j.count;
        this.sum += c3726j.sum;
        this.min = Math.min(this.min, c3726j.min);
        this.max = Math.max(this.max, c3726j.max);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        accept(i10);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.count++;
        this.sum += j6;
        this.min = Math.min(this.min, j6);
        this.max = Math.max(this.max, j6);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C3726j.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j6 = this.count;
        objArr[4] = Double.valueOf(j6 > 0 ? this.sum / j6 : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
