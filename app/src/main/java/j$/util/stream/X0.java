package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X0 extends T2 implements D0, AbstractC3860z0 {
    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        super.accept(d10);
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC3860z0, j$.util.stream.C0
    /* renamed from: b */
    public final D0 mo102b() {
        return this;
    }

    @Override // j$.util.stream.AbstractC3860z0, j$.util.stream.C0
    /* renamed from: b  reason: collision with other method in class */
    public final H0 mo102b() {
        return this;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.G0
    public final void d(Object obj, int i10) {
        super.d((double[]) obj, i10);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.G0
    public final Object e() {
        return (double[]) super.e();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.G0
    public final void f(Object obj) {
        super.f((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        clear();
        u(j6);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC3855y0.I(this, intFunction);
    }

    @Override // j$.util.stream.AbstractC3803n2
    public final /* synthetic */ void p(Double d10) {
        AbstractC3855y0.A(this, d10);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: spliterator */
    public final j$.util.O mo103spliterator() {
        return super.mo103spliterator();
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo103spliterator() {
        return super.mo103spliterator();
    }

    @Override // j$.util.stream.T2
    public final j$.util.F x() {
        return super.mo103spliterator();
    }

    /* renamed from: y */
    public final /* synthetic */ void i(Double[] dArr, int i10) {
        AbstractC3855y0.J(this, dArr, i10);
    }

    /* renamed from: z */
    public final /* synthetic */ D0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.P(this, j6, j10);
    }
}
