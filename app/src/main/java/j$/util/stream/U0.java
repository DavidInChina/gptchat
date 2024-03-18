package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U0 extends J0 {
    @Override // j$.util.stream.H0
    public final void forEach(Consumer consumer) {
        this.f35441a.forEach(consumer);
        this.f35442b.forEach(consumer);
    }

    @Override // j$.util.stream.H0
    public final H0 h(long j6, long j10, IntFunction intFunction) {
        if (j6 == 0 && j10 == count()) {
            return this;
        }
        long count = this.f35441a.count();
        if (j6 >= count) {
            return this.f35442b.h(j6 - count, j10 - count, intFunction);
        } else if (j10 <= count) {
            return this.f35441a.h(j6, j10, intFunction);
        } else {
            return AbstractC3855y0.e0(EnumC3764f3.REFERENCE, this.f35441a.h(j6, count, intFunction), this.f35442b.h(0L, j10 - count, intFunction));
        }
    }

    @Override // j$.util.stream.H0
    public final void i(Object[] objArr, int i10) {
        Objects.requireNonNull(objArr);
        H0 h02 = this.f35441a;
        h02.i(objArr, i10);
        this.f35442b.i(objArr, i10 + ((int) h02.count()));
    }

    @Override // j$.util.stream.H0
    public final Object[] o(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            i(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator */
    public final Spliterator mo101spliterator() {
        return new AbstractC3797m1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f35441a, this.f35442b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
