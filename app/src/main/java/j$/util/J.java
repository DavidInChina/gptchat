package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class J implements L {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f35213a;

    private /* synthetic */ J(Spliterator.OfLong ofLong) {
        this.f35213a = ofLong;
    }

    public static /* synthetic */ L a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof K ? ((K) ofLong).f35214a : new J(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f35213a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof J) {
            obj = ((J) obj).f35213a;
        }
        return this.f35213a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f35213a.estimateSize();
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f35213a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35213a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.L
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f35213a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f35213a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f35213a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f35213a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35213a.hashCode();
    }

    @Override // j$.util.O
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f35213a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f35213a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.L
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f35213a.tryAdvance(longConsumer);
    }
}
