package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class Q1 extends U1 implements T1, AbstractC3808o2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f35504b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ObjIntConsumer f35505c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f35506d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q1(Supplier supplier, ObjIntConsumer objIntConsumer, BinaryOperator binaryOperator) {
        this.f35504b = supplier;
        this.f35505c = objIntConsumer;
        this.f35506d = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        this.f35505c.accept(this.f35540a, i10);
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        this.f35540a = this.f35506d.apply(this.f35540a, ((Q1) t12).f35540a);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35540a = this.f35504b.get();
    }

    @Override // j$.util.stream.AbstractC3808o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3855y0.C(this, num);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
