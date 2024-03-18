package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B3 extends C3 implements Spliterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public B3(Spliterator spliterator, long j6, long j10) {
        super(spliterator, j6, j10, 0L, Math.min(spliterator.estimateSize(), j10));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.stream.C3, j$.util.Spliterator] */
    @Override // j$.util.stream.C3
    protected final Spliterator a(Spliterator spliterator, long j6, long j10, long j11, long j12) {
        return new C3(spliterator, j6, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j6 = this.f35399e;
        long j10 = this.f35395a;
        if (j10 >= j6) {
            return;
        }
        long j11 = this.f35398d;
        if (j11 >= j6) {
            return;
        }
        if (j11 >= j10 && this.f35397c.estimateSize() + j11 <= this.f35396b) {
            this.f35397c.forEachRemaining(consumer);
            this.f35398d = this.f35399e;
            return;
        }
        while (j10 > this.f35398d) {
            this.f35397c.tryAdvance(new N0(9));
            this.f35398d++;
        }
        while (this.f35398d < this.f35399e) {
            this.f35397c.tryAdvance(consumer);
            this.f35398d++;
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
    public final boolean tryAdvance(Consumer consumer) {
        long j6;
        Objects.requireNonNull(consumer);
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
            this.f35397c.tryAdvance(new N0(8));
            this.f35398d++;
        }
        if (j6 >= this.f35399e) {
            return false;
        }
        this.f35398d = j6 + 1;
        return this.f35397c.tryAdvance(consumer);
    }
}
