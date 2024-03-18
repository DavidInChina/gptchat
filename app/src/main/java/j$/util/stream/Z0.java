package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class Z0 extends AbstractC3747c1 implements E0 {
    @Override // j$.util.stream.AbstractC3747c1, j$.util.stream.H0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final /* synthetic */ void i(Integer[] numArr, int i10) {
        AbstractC3855y0.K(this, numArr, i10);
    }

    @Override // j$.util.stream.G0
    public final Object e() {
        int[] iArr;
        iArr = AbstractC3855y0.f35777e;
        return iArr;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3855y0.N(this, consumer);
    }

    /* renamed from: g */
    public final /* synthetic */ E0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.Q(this, j6, j10);
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator */
    public final j$.util.O mo101spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo101spliterator() {
        return Spliterators.c();
    }
}
