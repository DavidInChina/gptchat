package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class Y0 extends AbstractC3747c1 implements D0 {
    @Override // j$.util.stream.AbstractC3747c1, j$.util.stream.H0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final /* synthetic */ void i(Double[] dArr, int i10) {
        AbstractC3855y0.J(this, dArr, i10);
    }

    @Override // j$.util.stream.G0
    public final Object e() {
        double[] dArr;
        dArr = AbstractC3855y0.f35779g;
        return dArr;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3855y0.M(this, consumer);
    }

    /* renamed from: g */
    public final /* synthetic */ D0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.P(this, j6, j10);
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator */
    public final j$.util.O mo101spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo101spliterator() {
        return Spliterators.b();
    }
}
