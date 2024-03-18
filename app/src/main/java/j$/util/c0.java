package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c0 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Collection f35255a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator f35256b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35257c;

    /* renamed from: d  reason: collision with root package name */
    private long f35258d;

    /* renamed from: e  reason: collision with root package name */
    private int f35259e;

    public c0(java.util.Collection collection, int i10) {
        this.f35255a = collection;
        this.f35256b = null;
        this.f35257c = (i10 & 4096) == 0 ? i10 | 16448 : i10;
    }

    public c0(Iterator it) {
        this.f35255a = null;
        this.f35256b = it;
        this.f35258d = Long.MAX_VALUE;
        this.f35257c = 272;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f35257c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f35256b == null) {
            java.util.Collection collection = this.f35255a;
            this.f35256b = collection.iterator();
            long size = collection.size();
            this.f35258d = size;
            return size;
        }
        return this.f35258d;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f35256b;
        if (it == null) {
            java.util.Collection collection = this.f35255a;
            Iterator it2 = collection.iterator();
            this.f35256b = it2;
            this.f35258d = collection.size();
            it = it2;
        }
        if (it instanceof AbstractC3725i) {
            ((AbstractC3725i) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (AbstractC3732p.e(this, 4)) {
            return null;
        }
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
        if (this.f35256b == null) {
            java.util.Collection collection = this.f35255a;
            this.f35256b = collection.iterator();
            this.f35258d = collection.size();
        }
        if (this.f35256b.hasNext()) {
            consumer.accept(this.f35256b.next());
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        long j6;
        Iterator it = this.f35256b;
        if (it == null) {
            java.util.Collection collection = this.f35255a;
            Iterator it2 = collection.iterator();
            this.f35256b = it2;
            j6 = collection.size();
            this.f35258d = j6;
            it = it2;
        } else {
            j6 = this.f35258d;
        }
        if (j6 <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f35259e + 1024;
        if (i10 > j6) {
            i10 = (int) j6;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f35259e = i11;
        long j10 = this.f35258d;
        if (j10 != Long.MAX_VALUE) {
            this.f35258d = j10 - i11;
        }
        return new V(objArr, 0, i11, this.f35257c);
    }
}
