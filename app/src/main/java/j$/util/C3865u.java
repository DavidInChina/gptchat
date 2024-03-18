package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.u */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3865u implements AbstractC3867w, AbstractC3725i {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f35790a;

    private /* synthetic */ C3865u(PrimitiveIterator.OfInt ofInt) {
        this.f35790a = ofInt;
    }

    public static /* synthetic */ AbstractC3867w a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C3866v ? ((C3866v) ofInt).f35791a : new C3865u(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C3865u) {
            obj = ((C3865u) obj).f35790a;
        }
        return this.f35790a.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f35790a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // j$.util.AbstractC3867w, java.util.Iterator, j$.util.AbstractC3725i
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35790a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.AbstractC3867w
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f35790a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f35790a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f35790a.hashCode();
    }

    @Override // j$.util.AbstractC3867w
    public final /* synthetic */ int nextInt() {
        return this.f35790a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f35790a.remove();
    }
}
