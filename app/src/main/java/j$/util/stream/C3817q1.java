package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3817q1 extends AbstractC3836u1 implements AbstractC3803n2 {

    /* renamed from: h  reason: collision with root package name */
    private final double[] f35712h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3817q1(Spliterator spliterator, AbstractC3855y0 abstractC3855y0, double[] dArr) {
        super(dArr.length, spliterator, abstractC3855y0);
        this.f35712h = dArr;
    }

    C3817q1(C3817q1 c3817q1, Spliterator spliterator, long j6, long j10) {
        super(c3817q1, spliterator, j6, j10, c3817q1.f35712h.length);
        this.f35712h = c3817q1.f35712h;
    }

    @Override // j$.util.stream.AbstractC3836u1
    final AbstractC3836u1 a(Spliterator spliterator, long j6, long j10) {
        return new C3817q1(this, spliterator, j6, j10);
    }

    @Override // j$.util.stream.AbstractC3836u1, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        int i10 = this.f35742f;
        if (i10 < this.f35743g) {
            double[] dArr = this.f35712h;
            this.f35742f = i10 + 1;
            dArr[i10] = d10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f35742f));
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC3803n2
    public final /* synthetic */ void p(Double d10) {
        AbstractC3855y0.A(this, d10);
    }
}
