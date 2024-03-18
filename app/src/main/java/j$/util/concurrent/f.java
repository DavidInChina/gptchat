package j$.util.concurrent;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f extends q implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f35289i;

    /* renamed from: j  reason: collision with root package name */
    long f35290j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l[] lVarArr, int i10, int i11, int i12, long j6, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i10, i11, i12);
        this.f35289i = concurrentHashMap;
        this.f35290j = j6;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35290j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a5 = a();
            if (a5 != null) {
                consumer.accept(new k(a5.f35299b, a5.f35300c, this.f35289i));
            } else {
                return;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC3732p.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC3732p.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a5 = a();
        if (a5 == null) {
            return false;
        }
        consumer.accept(new k(a5.f35299b, a5.f35300c, this.f35289i));
        return true;
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        int i10 = this.f35311f;
        int i11 = this.f35312g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        l[] lVarArr = this.f35306a;
        this.f35312g = i12;
        long j6 = this.f35290j >>> 1;
        this.f35290j = j6;
        return new f(lVarArr, this.f35313h, i12, i11, j6, this.f35289i);
    }
}
