package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class R2 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    int f35513a;

    /* renamed from: b  reason: collision with root package name */
    final int f35514b;

    /* renamed from: c  reason: collision with root package name */
    int f35515c;

    /* renamed from: d  reason: collision with root package name */
    final int f35516d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f35517e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ C3739a3 f35518f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(C3739a3 c3739a3, int i10, int i11, int i12, int i13) {
        this.f35518f = c3739a3;
        this.f35513a = i10;
        this.f35514b = i11;
        this.f35515c = i12;
        this.f35516d = i13;
        Object[][] objArr = c3739a3.f35589f;
        this.f35517e = objArr == null ? c3739a3.f35588e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f35513a;
        int i11 = this.f35516d;
        int i12 = this.f35514b;
        if (i10 == i12) {
            return i11 - this.f35515c;
        }
        long[] jArr = this.f35518f.f35616d;
        return ((jArr[i12] + i11) - jArr[i10]) - this.f35515c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C3739a3 c3739a3;
        Objects.requireNonNull(consumer);
        int i10 = this.f35513a;
        int i11 = this.f35516d;
        int i12 = this.f35514b;
        if (i10 < i12 || (i10 == i12 && this.f35515c < i11)) {
            int i13 = this.f35515c;
            while (true) {
                c3739a3 = this.f35518f;
                if (i10 >= i12) {
                    break;
                }
                Object[] objArr = c3739a3.f35589f[i10];
                while (i13 < objArr.length) {
                    consumer.accept(objArr[i13]);
                    i13++;
                }
                i10++;
                i13 = 0;
            }
            Object[] objArr2 = this.f35513a == i12 ? this.f35517e : c3739a3.f35589f[i12];
            while (i13 < i11) {
                consumer.accept(objArr2[i13]);
                i13++;
            }
            this.f35513a = i12;
            this.f35515c = i11;
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
        Objects.requireNonNull(consumer);
        int i10 = this.f35513a;
        int i11 = this.f35514b;
        if (i10 < i11 || (i10 == i11 && this.f35515c < this.f35516d)) {
            Object[] objArr = this.f35517e;
            int i12 = this.f35515c;
            this.f35515c = i12 + 1;
            consumer.accept(objArr[i12]);
            if (this.f35515c == this.f35517e.length) {
                this.f35515c = 0;
                int i13 = this.f35513a + 1;
                this.f35513a = i13;
                Object[][] objArr2 = this.f35518f.f35589f;
                if (objArr2 != null && i13 <= i11) {
                    this.f35517e = objArr2[i13];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        int i10 = this.f35513a;
        int i11 = this.f35514b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f35515c;
            C3739a3 c3739a3 = this.f35518f;
            R2 r22 = new R2(c3739a3, i10, i12, i13, c3739a3.f35589f[i12].length);
            this.f35513a = i11;
            this.f35515c = 0;
            this.f35517e = c3739a3.f35589f[i11];
            return r22;
        } else if (i10 != i11) {
            return null;
        } else {
            int i14 = this.f35515c;
            int i15 = (this.f35516d - i14) / 2;
            if (i15 == 0) {
                return null;
            }
            Spliterator m10 = Spliterators.m(this.f35517e, i14, i14 + i15);
            this.f35515c += i15;
            return m10;
        }
    }
}
