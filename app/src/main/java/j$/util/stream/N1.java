package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class N1 implements T1, AbstractC3808o2 {

    /* renamed from: a  reason: collision with root package name */
    private int f35483a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f35484b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f35485c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N1(int i10, IntBinaryOperator intBinaryOperator) {
        this.f35484b = i10;
        this.f35485c = intBinaryOperator;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        this.f35483a = this.f35485c.applyAsInt(this.f35483a, i10);
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
        accept(((N1) t12).f35483a);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f35483a);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35483a = this.f35484b;
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
