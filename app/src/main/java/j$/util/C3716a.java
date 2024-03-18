package j$.util;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3716a implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final java.util.List f35243a;

    /* renamed from: b  reason: collision with root package name */
    private int f35244b;

    /* renamed from: c  reason: collision with root package name */
    private int f35245c;

    private C3716a(C3716a c3716a, int i10, int i11) {
        this.f35243a = c3716a.f35243a;
        this.f35244b = i10;
        this.f35245c = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3716a(java.util.List list) {
        this.f35243a = list;
        this.f35244b = 0;
        this.f35245c = -1;
    }

    private int a() {
        int i10 = this.f35245c;
        if (i10 < 0) {
            int size = this.f35243a.size();
            this.f35245c = size;
            return size;
        }
        return i10;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f35244b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a5 = a();
        this.f35244b = a5;
        for (int i10 = this.f35244b; i10 < a5; i10++) {
            try {
                consumer.accept(this.f35243a.get(i10));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
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
        int a5 = a();
        int i10 = this.f35244b;
        if (i10 < a5) {
            this.f35244b = i10 + 1;
            try {
                consumer.accept(this.f35243a.get(i10));
                return true;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        int a5 = a();
        int i10 = this.f35244b;
        int i11 = (a5 + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f35244b = i11;
        return new C3716a(this, i10, i11);
    }
}
