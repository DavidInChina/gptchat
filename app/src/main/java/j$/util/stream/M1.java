package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class M1 extends U1 implements T1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f35474b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f35475c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BiConsumer f35476d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f35474b = supplier;
        this.f35475c = biConsumer;
        this.f35476d = biConsumer2;
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
        this.f35475c.accept(this.f35540a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        this.f35476d.accept(this.f35540a, ((M1) t12).f35540a);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35540a = this.f35474b.get();
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
