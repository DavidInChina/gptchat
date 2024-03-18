package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class E implements Spliterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ F f35210a;

    private /* synthetic */ E(F f6) {
        this.f35210a = f6;
    }

    public static /* synthetic */ Spliterator.OfDouble a(F f6) {
        if (f6 == null) {
            return null;
        }
        return f6 instanceof D ? ((D) f6).f35204a : new E(f6);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f35210a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        F f6 = this.f35210a;
        if (obj instanceof E) {
            obj = ((E) obj).f35210a;
        }
        return f6.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f35210a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f35210a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35210a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f35210a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f35210a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f35210a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f35210a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35210a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f35210a.tryAdvance((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f35210a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f35210a.tryAdvance(doubleConsumer);
    }
}
