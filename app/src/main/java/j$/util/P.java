package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class P implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator f35217a;

    private /* synthetic */ P(java.util.Spliterator spliterator) {
        this.f35217a = spliterator;
    }

    public static /* synthetic */ Spliterator a(java.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Spliterator.Wrapper ? Spliterator.this : spliterator instanceof Spliterator.OfPrimitive ? M.a((Spliterator.OfPrimitive) spliterator) : new P(spliterator);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f35217a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof P) {
            obj = ((P) obj).f35217a;
        }
        return this.f35217a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f35217a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35217a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f35217a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f35217a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f35217a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35217a.hashCode();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f35217a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public final /* synthetic */ Spliterator mo106trySplit() {
        return a(this.f35217a.trySplit());
    }
}
