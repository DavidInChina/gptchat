package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class K0 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    final Object[] f35454a;

    /* renamed from: b  reason: collision with root package name */
    int f35455b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K0(long j6, IntFunction intFunction) {
        if (j6 < 2147483639) {
            this.f35454a = (Object[]) intFunction.apply((int) j6);
            this.f35455b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K0(Object[] objArr) {
        this.f35454a = objArr;
        this.f35455b = objArr.length;
    }

    @Override // j$.util.stream.H0
    public final H0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f35455b;
    }

    @Override // j$.util.stream.H0
    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f35455b; i10++) {
            consumer.accept(this.f35454a[i10]);
        }
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.S(this, j6, j10, intFunction);
    }

    @Override // j$.util.stream.H0
    public final void i(Object[] objArr, int i10) {
        System.arraycopy(this.f35454a, 0, objArr, i10, this.f35455b);
    }

    @Override // j$.util.stream.H0
    public final Object[] o(IntFunction intFunction) {
        Object[] objArr = this.f35454a;
        if (objArr.length == this.f35455b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator */
    public final Spliterator mo101spliterator() {
        return Spliterators.m(this.f35454a, 0, this.f35455b);
    }

    public String toString() {
        Object[] objArr = this.f35454a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f35455b), Arrays.toString(objArr));
    }
}
