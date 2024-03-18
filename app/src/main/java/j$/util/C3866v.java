package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.v */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3866v implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3867w f35791a;

    private /* synthetic */ C3866v(AbstractC3867w abstractC3867w) {
        this.f35791a = abstractC3867w;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(AbstractC3867w abstractC3867w) {
        if (abstractC3867w == null) {
            return null;
        }
        return abstractC3867w instanceof C3865u ? ((C3865u) abstractC3867w).f35790a : new C3866v(abstractC3867w);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC3867w abstractC3867w = this.f35791a;
        if (obj instanceof C3866v) {
            obj = ((C3866v) obj).f35791a;
        }
        return abstractC3867w.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f35791a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35791a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f35791a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f35791a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f35791a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f35791a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f35791a.remove();
    }
}
