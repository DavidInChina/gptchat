package j$.util.concurrent;

import j$.util.AbstractC3732p;
import j$.util.F;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class y implements F {

    /* renamed from: a  reason: collision with root package name */
    long f35327a;

    /* renamed from: b  reason: collision with root package name */
    final long f35328b;

    /* renamed from: c  reason: collision with root package name */
    final double f35329c;

    /* renamed from: d  reason: collision with root package name */
    final double f35330d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(long j6, long j10, double d10, double d11) {
        this.f35327a = j6;
        this.f35328b = j10;
        this.f35329c = d10;
        this.f35330d = d11;
    }

    /* renamed from: a */
    public final y mo106trySplit() {
        long j6 = this.f35327a;
        long j10 = (this.f35328b + j6) >>> 1;
        if (j10 <= j6) {
            return null;
        }
        this.f35327a = j10;
        return new y(j6, j10, this.f35329c, this.f35330d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35328b - this.f35327a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.a(this, consumer);
    }

    @Override // j$.util.F
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j6 = this.f35327a;
        long j10 = this.f35328b;
        if (j6 < j10) {
            this.f35327a = j10;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(current.c(this.f35329c, this.f35330d));
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
        return AbstractC3732p.f(this, consumer);
    }

    @Override // j$.util.F
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j6 = this.f35327a;
        if (j6 < this.f35328b) {
            doubleConsumer.accept(ThreadLocalRandom.current().c(this.f35329c, this.f35330d));
            this.f35327a = j6 + 1;
            return true;
        }
        return false;
    }
}
