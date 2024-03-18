package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class N implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ O f35216a;

    private /* synthetic */ N(O o10) {
        this.f35216a = o10;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(O o10) {
        if (o10 == null) {
            return null;
        }
        return o10 instanceof M ? ((M) o10).f35215a : o10 instanceof F ? E.a((F) o10) : o10 instanceof I ? H.a((I) o10) : o10 instanceof L ? K.a((L) o10) : new N(o10);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f35216a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        O o10 = this.f35216a;
        if (obj instanceof N) {
            obj = ((N) obj).f35216a;
        }
        return o10.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f35216a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f35216a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35216a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f35216a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f35216a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f35216a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35216a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f35216a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f35216a.tryAdvance(consumer);
    }
}
