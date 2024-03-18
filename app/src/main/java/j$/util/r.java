package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements PrimitiveIterator.OfDouble {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC3734s f35378a;

    private /* synthetic */ r(AbstractC3734s abstractC3734s) {
        this.f35378a = abstractC3734s;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(AbstractC3734s abstractC3734s) {
        if (abstractC3734s == null) {
            return null;
        }
        return abstractC3734s instanceof C3733q ? ((C3733q) abstractC3734s).f35377a : new r(abstractC3734s);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC3734s abstractC3734s = this.f35378a;
        if (obj instanceof r) {
            obj = ((r) obj).f35378a;
        }
        return abstractC3734s.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f35378a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35378a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f35378a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f35378a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f35378a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f35378a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f35378a.remove();
    }
}
