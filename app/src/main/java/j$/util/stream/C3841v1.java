package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3841v1 extends C3739a3 implements H0, C0 {
    @Override // j$.util.stream.H0
    public final H0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(int i10) {
        AbstractC3855y0.G();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    @Override // j$.util.stream.C3739a3, java.util.function.Consumer
    public final void accept(Object obj) {
        super.accept(obj);
    }

    @Override // j$.util.stream.C0
    /* renamed from: b */
    public final H0 mo102b() {
        return this;
    }

    @Override // j$.util.stream.C3739a3, java.lang.Iterable
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.S(this, j6, j10, intFunction);
    }

    @Override // j$.util.stream.H0
    public final void i(Object[] objArr, int i10) {
        long j6 = i10;
        long count = count() + j6;
        if (count > objArr.length || count < j6) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f35615c == 0) {
            System.arraycopy(this.f35588e, 0, objArr, i10, this.f35614b);
            return;
        }
        for (int i11 = 0; i11 < this.f35615c; i11++) {
            Object[] objArr2 = this.f35589f[i11];
            System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
            i10 += this.f35589f[i11].length;
        }
        int i12 = this.f35614b;
        if (i12 <= 0) {
            return;
        }
        System.arraycopy(this.f35588e, 0, objArr, i10, i12);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        clear();
        r(j6);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.H0
    public final Object[] o(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            i(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.C3739a3, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }
}
