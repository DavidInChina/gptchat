package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3757e1 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    final int[] f35617a;

    /* renamed from: b  reason: collision with root package name */
    int f35618b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3757e1(long j6) {
        if (j6 < 2147483639) {
            this.f35617a = new int[(int) j6];
            this.f35618b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3757e1(int[] iArr) {
        this.f35617a = iArr;
        this.f35618b = iArr.length;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f35618b;
    }

    @Override // j$.util.stream.G0
    public final void d(Object obj, int i10) {
        int i11 = this.f35618b;
        System.arraycopy(this.f35617a, 0, (int[]) obj, i10, i11);
    }

    @Override // j$.util.stream.G0
    public final Object e() {
        int[] iArr = this.f35617a;
        int length = iArr.length;
        int i10 = this.f35618b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    @Override // j$.util.stream.G0
    public final void f(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < this.f35618b; i10++) {
            intConsumer.accept(this.f35617a[i10]);
        }
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3855y0.N(this, consumer);
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
    public final /* synthetic */ void i(Integer[] numArr, int i10) {
        AbstractC3855y0.K(this, numArr, i10);
    }

    /* renamed from: s */
    public final /* synthetic */ E0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.Q(this, j6, j10);
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    /* renamed from: spliterator */
    public final j$.util.O mo101spliterator() {
        return Spliterators.k(this.f35617a, 0, this.f35618b);
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo101spliterator() {
        return Spliterators.k(this.f35617a, 0, this.f35618b);
    }

    public String toString() {
        int[] iArr = this.f35617a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f35618b), Arrays.toString(iArr));
    }
}
