package j$.util.concurrent;

import j$.util.AbstractC3732p;
import j$.util.L;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class A implements L {

    /* renamed from: a  reason: collision with root package name */
    long f35260a;

    /* renamed from: b  reason: collision with root package name */
    final long f35261b;

    /* renamed from: c  reason: collision with root package name */
    final long f35262c;

    /* renamed from: d  reason: collision with root package name */
    final long f35263d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(long j6, long j10, long j11, long j12) {
        this.f35260a = j6;
        this.f35261b = j10;
        this.f35262c = j11;
        this.f35263d = j12;
    }

    /* renamed from: a */
    public final A mo106trySplit() {
        long j6 = this.f35260a;
        long j10 = (this.f35261b + j6) >>> 1;
        if (j10 <= j6) {
            return null;
        }
        this.f35260a = j10;
        return new A(j6, j10, this.f35262c, this.f35263d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35261b - this.f35260a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.c(this, consumer);
    }

    @Override // j$.util.L
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j6 = this.f35260a;
        long j10 = this.f35261b;
        if (j6 < j10) {
            this.f35260a = j10;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.e(this.f35262c, this.f35263d));
                j6++;
            } while (j6 < j10);
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
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
        long j6 = this.f35260a;
        if (j6 < this.f35261b) {
            longConsumer.accept(ThreadLocalRandom.current().e(this.f35262c, this.f35263d));
            this.f35260a = j6 + 1;
            return true;
        }
        return false;
    }
}
