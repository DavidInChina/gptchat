package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3802n1 implements F0 {

    /* renamed from: a  reason: collision with root package name */
    final long[] f35696a;

    /* renamed from: b  reason: collision with root package name */
    int f35697b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3802n1(long j6) {
        if (j6 < 2147483639) {
            this.f35696a = new long[(int) j6];
            this.f35697b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3802n1(long[] jArr) {
        this.f35696a = jArr;
        this.f35697b = jArr.length;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f35697b;
    }

    @Override // j$.util.stream.G0
    public final void d(Object obj, int i10) {
        int i11 = this.f35697b;
        System.arraycopy(this.f35696a, 0, (long[]) obj, i10, i11);
    }

    @Override // j$.util.stream.G0
    public final Object e() {
        long[] jArr = this.f35696a;
        int length = jArr.length;
        int i10 = this.f35697b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    @Override // j$.util.stream.G0
    public final void f(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < this.f35697b; i10++) {
            longConsumer.accept(this.f35696a[i10]);
        }
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3855y0.O(this, consumer);
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
    public final /* synthetic */ void i(Long[] lArr, int i10) {
        AbstractC3855y0.L(this, lArr, i10);
    }

    /* renamed from: s */
    public final /* synthetic */ F0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.R(this, j6, j10);
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    /* renamed from: spliterator */
    public final j$.util.O mo101spliterator() {
        return Spliterators.l(this.f35696a, 0, this.f35697b);
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo101spliterator() {
        return Spliterators.l(this.f35696a, 0, this.f35697b);
    }

    public String toString() {
        long[] jArr = this.f35696a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f35697b), Arrays.toString(jArr));
    }
}
