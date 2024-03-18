package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.z  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3870z implements PrimitiveIterator.OfLong {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ A f35794a;

    private /* synthetic */ C3870z(A a5) {
        this.f35794a = a5;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(A a5) {
        if (a5 == null) {
            return null;
        }
        return a5 instanceof C3869y ? ((C3869y) a5).f35793a : new C3870z(a5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        A a5 = this.f35794a;
        if (obj instanceof C3870z) {
            obj = ((C3870z) obj).f35794a;
        }
        return a5.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f35794a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35794a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f35794a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f35794a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f35794a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f35794a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f35794a.remove();
    }
}
