package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class V0 implements D0 {

    /* renamed from: a  reason: collision with root package name */
    final double[] f35546a;

    /* renamed from: b  reason: collision with root package name */
    int f35547b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V0(long j6) {
        if (j6 < 2147483639) {
            this.f35546a = new double[(int) j6];
            this.f35547b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V0(double[] dArr) {
        this.f35546a = dArr;
        this.f35547b = dArr.length;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f35547b;
    }

    @Override // j$.util.stream.G0
    public final void d(Object obj, int i10) {
        int i11 = this.f35547b;
        System.arraycopy(this.f35546a, 0, (double[]) obj, i10, i11);
    }

    @Override // j$.util.stream.G0
    public final Object e() {
        double[] dArr = this.f35546a;
        int length = dArr.length;
        int i10 = this.f35547b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override // j$.util.stream.G0
    public final void f(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < this.f35547b; i10++) {
            doubleConsumer.accept(this.f35546a[i10]);
        }
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3855y0.M(this, consumer);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC3855y0.I(this, intFunction);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int q() {
        return 0;
    }

    /* renamed from: r */
    public final /* synthetic */ void i(Double[] dArr, int i10) {
        AbstractC3855y0.J(this, dArr, i10);
    }

    /* renamed from: s */
    public final /* synthetic */ D0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.P(this, j6, j10);
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    /* renamed from: spliterator */
    public final j$.util.O mo101spliterator() {
        return Spliterators.j(this.f35546a, 0, this.f35547b);
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo101spliterator() {
        return Spliterators.j(this.f35546a, 0, this.f35547b);
    }

    public String toString() {
        double[] dArr = this.f35546a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f35547b), Arrays.toString(dArr));
    }
}
