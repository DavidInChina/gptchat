package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.q  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3733q implements AbstractC3734s, AbstractC3725i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f35377a;

    private /* synthetic */ C3733q(PrimitiveIterator.OfDouble ofDouble) {
        this.f35377a = ofDouble;
    }

    public static /* synthetic */ AbstractC3734s a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof r ? ((r) ofDouble).f35378a : new C3733q(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C3733q) {
            obj = ((C3733q) obj).f35377a;
        }
        return this.f35377a.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f35377a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // j$.util.AbstractC3734s, java.util.Iterator, j$.util.AbstractC3725i
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35377a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.AbstractC3734s
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f35377a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f35377a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f35377a.hashCode();
    }

    @Override // j$.util.AbstractC3734s
    public final /* synthetic */ double nextDouble() {
        return this.f35377a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f35377a.remove();
    }
}
