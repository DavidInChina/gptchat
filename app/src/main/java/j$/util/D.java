package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class D implements F {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f35204a;

    private /* synthetic */ D(Spliterator.OfDouble ofDouble) {
        this.f35204a = ofDouble;
    }

    public static /* synthetic */ F a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof E ? ((E) ofDouble).f35210a : new D(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f35204a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof D) {
            obj = ((D) obj).f35204a;
        }
        return this.f35204a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f35204a.estimateSize();
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f35204a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35204a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.F
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f35204a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f35204a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f35204a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f35204a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35204a.hashCode();
    }

    @Override // j$.util.O
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f35204a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f35204a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.F
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f35204a.tryAdvance(doubleConsumer);
    }
}
