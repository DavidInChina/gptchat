package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class d0 implements L {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f35336a;

    /* renamed from: b  reason: collision with root package name */
    private int f35337b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35338c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35339d;

    public d0(long[] jArr, int i10, int i11, int i12) {
        this.f35336a = jArr;
        this.f35337b = i10;
        this.f35338c = i11;
        this.f35339d = i12 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f35339d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35338c - this.f35337b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.c(this, consumer);
    }

    @Override // j$.util.L
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i10;
        longConsumer.getClass();
        long[] jArr = this.f35336a;
        int length = jArr.length;
        int i11 = this.f35338c;
        if (length < i11 || (i10 = this.f35337b) < 0) {
            return;
        }
        this.f35337b = i11;
        if (i10 >= i11) {
            return;
        }
        do {
            longConsumer.accept(jArr[i10]);
            i10++;
        } while (i10 < i11);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC3732p.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC3732p.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC3732p.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.h(this, consumer);
    }

    @Override // j$.util.L
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i10 = this.f35337b;
        if (i10 < 0 || i10 >= this.f35338c) {
            return false;
        }
        this.f35337b = i10 + 1;
        longConsumer.accept(this.f35336a[i10]);
        return true;
    }

    @Override // j$.util.L, j$.util.O, j$.util.Spliterator
    /* renamed from: trySplit */
    public final L mo106trySplit() {
        int i10 = this.f35337b;
        int i11 = (this.f35338c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f35337b = i11;
        return new d0(this.f35336a, i10, i11, this.f35339d);
    }
}
