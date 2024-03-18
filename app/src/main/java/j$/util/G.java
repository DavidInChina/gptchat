package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class G implements I {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f35211a;

    private /* synthetic */ G(Spliterator.OfInt ofInt) {
        this.f35211a = ofInt;
    }

    public static /* synthetic */ I a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof H ? ((H) ofInt).f35212a : new G(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f35211a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof G) {
            obj = ((G) obj).f35211a;
        }
        return this.f35211a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f35211a.estimateSize();
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f35211a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35211a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.I
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f35211a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f35211a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f35211a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f35211a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35211a.hashCode();
    }

    @Override // j$.util.O
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f35211a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f35211a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.I
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f35211a.tryAdvance(intConsumer);
    }
}
