package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class G1 extends U1 implements T1, AbstractC3803n2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f35418b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f35419c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f35420d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BinaryOperator binaryOperator) {
        this.f35418b = supplier;
        this.f35419c = objDoubleConsumer;
        this.f35420d = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        this.f35419c.accept(this.f35540a, d10);
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
        this.f35540a = this.f35420d.apply(this.f35540a, ((G1) t12).f35540a);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35540a = this.f35418b.get();
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
