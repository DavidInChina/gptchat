package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W implements F {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f35239a;

    /* renamed from: b  reason: collision with root package name */
    private int f35240b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35241c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35242d;

    public W(double[] dArr, int i10, int i11, int i12) {
        this.f35239a = dArr;
        this.f35240b = i10;
        this.f35241c = i11;
        this.f35242d = i12 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f35242d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35241c - this.f35240b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.a(this, consumer);
    }

    @Override // j$.util.F
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i10;
        doubleConsumer.getClass();
        double[] dArr = this.f35239a;
        int length = dArr.length;
        int i11 = this.f35241c;
        if (length < i11 || (i10 = this.f35240b) < 0) {
            return;
        }
        this.f35240b = i11;
        if (i10 >= i11) {
            return;
        }
        do {
            doubleConsumer.accept(dArr[i10]);
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
        return AbstractC3732p.f(this, consumer);
    }

    @Override // j$.util.F
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i10 = this.f35240b;
        if (i10 < 0 || i10 >= this.f35241c) {
            return false;
        }
        this.f35240b = i10 + 1;
        doubleConsumer.accept(this.f35239a[i10]);
        return true;
    }

    @Override // j$.util.F, j$.util.O, j$.util.Spliterator
    /* renamed from: trySplit */
    public final F mo106trySplit() {
        int i10 = this.f35240b;
        int i11 = (this.f35241c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f35240b = i11;
        return new W(this.f35239a, i10, i11, this.f35242d);
    }
}
