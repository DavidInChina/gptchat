package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class C1 implements T1, AbstractC3803n2 {

    /* renamed from: a  reason: collision with root package name */
    private double f35391a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f35392b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f35393c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        this.f35392b = d10;
        this.f35393c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        this.f35391a = this.f35393c.applyAsDouble(this.f35391a, d10);
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

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        accept(((C1) t12).f35391a);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f35391a);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35391a = this.f35392b;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.AbstractC3803n2
    public final /* synthetic */ void p(Double d10) {
        AbstractC3855y0.A(this, d10);
    }
}
