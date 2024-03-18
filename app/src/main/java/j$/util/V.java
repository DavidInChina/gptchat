package j$.util;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class V implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f35235a;

    /* renamed from: b  reason: collision with root package name */
    private int f35236b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35237c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35238d;

    public V(Object[] objArr, int i10, int i11, int i12) {
        this.f35235a = objArr;
        this.f35236b = i10;
        this.f35237c = i11;
        this.f35238d = i12 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f35238d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35237c - this.f35236b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        consumer.getClass();
        Object[] objArr = this.f35235a;
        int length = objArr.length;
        int i11 = this.f35237c;
        if (length < i11 || (i10 = this.f35236b) < 0) {
            return;
        }
        this.f35236b = i11;
        if (i10 >= i11) {
            return;
        }
        do {
            consumer.accept(objArr[i10]);
            i10++;
        } while (i10 < i11);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
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
        int i10 = this.f35236b;
        if (i10 < 0 || i10 >= this.f35237c) {
            return false;
        }
        this.f35236b = i10 + 1;
        consumer.accept(this.f35235a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        int i10 = this.f35236b;
        int i11 = (this.f35237c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f35236b = i11;
        return new V(this.f35235a, i10, i11, this.f35238d);
    }
}
