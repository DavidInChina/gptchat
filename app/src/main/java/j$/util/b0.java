package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b0 implements I {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f35248a;

    /* renamed from: b  reason: collision with root package name */
    private int f35249b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35250c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35251d;

    public b0(int[] iArr, int i10, int i11, int i12) {
        this.f35248a = iArr;
        this.f35249b = i10;
        this.f35250c = i11;
        this.f35251d = i12 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f35251d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35250c - this.f35249b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.b(this, consumer);
    }

    @Override // j$.util.I
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i10;
        intConsumer.getClass();
        int[] iArr = this.f35248a;
        int length = iArr.length;
        int i11 = this.f35250c;
        if (length < i11 || (i10 = this.f35249b) < 0) {
            return;
        }
        this.f35249b = i11;
        if (i10 >= i11) {
            return;
        }
        do {
            intConsumer.accept(iArr[i10]);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.g(this, consumer);
    }

    @Override // j$.util.I
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i10 = this.f35249b;
        if (i10 < 0 || i10 >= this.f35250c) {
            return false;
        }
        this.f35249b = i10 + 1;
        intConsumer.accept(this.f35248a[i10]);
        return true;
    }

    @Override // j$.util.I, j$.util.O, j$.util.Spliterator
    /* renamed from: trySplit */
    public final I mo106trySplit() {
        int i10 = this.f35249b;
        int i11 = (this.f35250c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f35249b = i11;
        return new b0(this.f35248a, i10, i11, this.f35251d);
    }
}
