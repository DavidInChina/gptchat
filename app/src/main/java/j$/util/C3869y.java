package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.y  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3869y implements A, AbstractC3725i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f35793a;

    private /* synthetic */ C3869y(PrimitiveIterator.OfLong ofLong) {
        this.f35793a = ofLong;
    }

    public static /* synthetic */ A a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C3870z ? ((C3870z) ofLong).f35794a : new C3869y(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C3869y) {
            obj = ((C3869y) obj).f35793a;
        }
        return this.f35793a.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f35793a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.A, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f35793a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f35793a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f35793a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f35793a.hashCode();
    }

    @Override // j$.util.A
    public final /* synthetic */ long nextLong() {
        return this.f35793a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f35793a.remove();
    }
}
