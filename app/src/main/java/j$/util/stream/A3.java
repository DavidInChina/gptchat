package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class A3 extends C3 implements j$.util.O {
    /* JADX INFO: Access modifiers changed from: package-private */
    public A3(j$.util.O o10, long j6, long j10) {
        super(o10, j6, j10, 0L, Math.min(o10.estimateSize(), j10));
    }

    protected abstract Object b();

    @Override // j$.util.O
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j6 = this.f35399e;
        long j10 = this.f35395a;
        if (j10 >= j6) {
            return;
        }
        long j11 = this.f35398d;
        if (j11 >= j6) {
            return;
        }
        if (j11 >= j10 && ((j$.util.O) this.f35397c).estimateSize() + j11 <= this.f35396b) {
            ((j$.util.O) this.f35397c).forEachRemaining(obj);
            this.f35398d = this.f35399e;
            return;
        }
        while (j10 > this.f35398d) {
            ((j$.util.O) this.f35397c).tryAdvance(b());
            this.f35398d++;
        }
        while (this.f35398d < this.f35399e) {
            ((j$.util.O) this.f35397c).tryAdvance(obj);
            this.f35398d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
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

    @Override // j$.util.O
    public final boolean tryAdvance(Object obj) {
        long j6;
        Objects.requireNonNull(obj);
        long j10 = this.f35399e;
        long j11 = this.f35395a;
        if (j11 >= j10) {
            return false;
        }
        while (true) {
            j6 = this.f35398d;
            if (j11 <= j6) {
                break;
            }
            ((j$.util.O) this.f35397c).tryAdvance(b());
            this.f35398d++;
        }
        if (j6 >= this.f35399e) {
            return false;
        }
        this.f35398d = j6 + 1;
        return ((j$.util.O) this.f35397c).tryAdvance(obj);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
