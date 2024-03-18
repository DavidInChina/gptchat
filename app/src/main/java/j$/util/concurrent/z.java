package j$.util.concurrent;

import j$.util.AbstractC3732p;
import j$.util.I;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class z implements I {

    /* renamed from: a  reason: collision with root package name */
    long f35331a;

    /* renamed from: b  reason: collision with root package name */
    final long f35332b;

    /* renamed from: c  reason: collision with root package name */
    final int f35333c;

    /* renamed from: d  reason: collision with root package name */
    final int f35334d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(long j6, long j10, int i10, int i11) {
        this.f35331a = j6;
        this.f35332b = j10;
        this.f35333c = i10;
        this.f35334d = i11;
    }

    /* renamed from: a */
    public final z mo106trySplit() {
        long j6 = this.f35331a;
        long j10 = (this.f35332b + j6) >>> 1;
        if (j10 <= j6) {
            return null;
        }
        this.f35331a = j10;
        return new z(j6, j10, this.f35333c, this.f35334d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35332b - this.f35331a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.b(this, consumer);
    }

    @Override // j$.util.I
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j6 = this.f35331a;
        long j10 = this.f35332b;
        if (j6 < j10) {
            this.f35331a = j10;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.d(this.f35333c, this.f35334d));
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
        return AbstractC3732p.g(this, consumer);
    }

    @Override // j$.util.I
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j6 = this.f35331a;
        if (j6 < this.f35332b) {
            intConsumer.accept(ThreadLocalRandom.current().d(this.f35333c, this.f35334d));
            this.f35331a = j6 + 1;
            return true;
        }
        return false;
    }
}
