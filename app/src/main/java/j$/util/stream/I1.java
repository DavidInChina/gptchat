package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class I1 extends U1 implements T1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f35433b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiFunction f35434c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f35435d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f35433b = obj;
        this.f35434c = biFunction;
        this.f35435d = binaryOperator;
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

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35540a = this.f35434c.apply(this.f35540a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        this.f35540a = this.f35435d.apply(this.f35540a, ((I1) t12).f35540a);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35540a = this.f35433b;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
