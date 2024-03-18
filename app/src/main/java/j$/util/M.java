package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class M implements O {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f35215a;

    private /* synthetic */ M(Spliterator.OfPrimitive ofPrimitive) {
        this.f35215a = ofPrimitive;
    }

    public static /* synthetic */ O a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof N ? ((N) ofPrimitive).f35216a : ofPrimitive instanceof Spliterator.OfDouble ? D.a((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? G.a((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? J.a((Spliterator.OfLong) ofPrimitive) : new M(ofPrimitive);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f35215a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof M) {
            obj = ((M) obj).f35215a;
        }
        return this.f35215a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f35215a.estimateSize();
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f35215a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35215a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f35215a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f35215a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f35215a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35215a.hashCode();
    }

    @Override // j$.util.O
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f35215a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f35215a.tryAdvance(consumer);
    }
}
