package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class Y2 implements j$.util.O {

    /* renamed from: a  reason: collision with root package name */
    int f35565a;

    /* renamed from: b  reason: collision with root package name */
    final int f35566b;

    /* renamed from: c  reason: collision with root package name */
    int f35567c;

    /* renamed from: d  reason: collision with root package name */
    final int f35568d;

    /* renamed from: e  reason: collision with root package name */
    Object f35569e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Z2 f35570f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y2(Z2 z22, int i10, int i11, int i12, int i13) {
        this.f35570f = z22;
        this.f35565a = i10;
        this.f35566b = i11;
        this.f35567c = i12;
        this.f35568d = i13;
        Object[] objArr = z22.f35576f;
        this.f35569e = objArr == null ? z22.f35575e : objArr[i10];
    }

    abstract void a(int i10, Object obj, Object obj2);

    abstract j$.util.O b(Object obj, int i10, int i11);

    abstract j$.util.O c(int i10, int i11, int i12, int i13);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f35565a;
        int i11 = this.f35568d;
        int i12 = this.f35566b;
        if (i10 == i12) {
            return i11 - this.f35567c;
        }
        long[] jArr = this.f35570f.f35616d;
        return ((jArr[i12] + i11) - jArr[i10]) - this.f35567c;
    }

    @Override // j$.util.O
    public final void forEachRemaining(Object obj) {
        Z2 z22;
        Objects.requireNonNull(obj);
        int i10 = this.f35565a;
        int i11 = this.f35568d;
        int i12 = this.f35566b;
        if (i10 < i12 || (i10 == i12 && this.f35567c < i11)) {
            int i13 = this.f35567c;
            while (true) {
                z22 = this.f35570f;
                if (i10 >= i12) {
                    break;
                }
                Object obj2 = z22.f35576f[i10];
                z22.r(obj2, i13, z22.s(obj2), obj);
                i10++;
                i13 = 0;
            }
            z22.r(this.f35565a == i12 ? this.f35569e : z22.f35576f[i12], i13, i11, obj);
            this.f35565a = i12;
            this.f35567c = i11;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
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

    @Override // j$.util.O
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i10 = this.f35565a;
        int i11 = this.f35566b;
        if (i10 < i11 || (i10 == i11 && this.f35567c < this.f35568d)) {
            Object obj2 = this.f35569e;
            int i12 = this.f35567c;
            this.f35567c = i12 + 1;
            a(i12, obj2, obj);
            int i13 = this.f35567c;
            Object obj3 = this.f35569e;
            Z2 z22 = this.f35570f;
            if (i13 == z22.s(obj3)) {
                this.f35567c = 0;
                int i14 = this.f35565a + 1;
                this.f35565a = i14;
                Object[] objArr = z22.f35576f;
                if (objArr != null && i14 <= i11) {
                    this.f35569e = objArr[i14];
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.O, j$.util.Spliterator
    /* renamed from: trySplit */
    public final j$.util.O mo106trySplit() {
        int i10 = this.f35565a;
        int i11 = this.f35566b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f35567c;
            Z2 z22 = this.f35570f;
            j$.util.O c10 = c(i10, i12, i13, z22.s(z22.f35576f[i12]));
            this.f35565a = i11;
            this.f35567c = 0;
            this.f35569e = z22.f35576f[i11];
            return c10;
        } else if (i10 != i11) {
            return null;
        } else {
            int i14 = this.f35567c;
            int i15 = (this.f35568d - i14) / 2;
            if (i15 == 0) {
                return null;
            }
            j$.util.O b10 = b(this.f35569e, i14, i15);
            this.f35567c += i15;
            return b10;
        }
    }
}
