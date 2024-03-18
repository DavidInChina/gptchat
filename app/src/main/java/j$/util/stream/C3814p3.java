package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.p3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3814p3 extends AbstractC3769g3 implements j$.util.F {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.lang.Object, java.util.function.DoubleConsumer, j$.util.stream.e] */
    @Override // j$.util.stream.AbstractC3769g3
    final void d() {
        ?? z22 = new Z2();
        this.f35661h = z22;
        Objects.requireNonNull(z22);
        this.f35658e = this.f35655b.J0(new C3809o3(z22, 0));
        this.f35659f = new C3735a(this, 3);
    }

    @Override // j$.util.stream.AbstractC3769g3
    final AbstractC3769g3 e(Spliterator spliterator) {
        return new AbstractC3769g3(this.f35655b, spliterator, this.f35654a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.a(this, consumer);
    }

    @Override // j$.util.F
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f35661h != null || this.f35662i) {
            do {
            } while (tryAdvance(doubleConsumer));
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        C3809o3 c3809o3 = new C3809o3(doubleConsumer, 1);
        this.f35655b.I0(this.f35657d, c3809o3);
        this.f35662i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.f(this, consumer);
    }

    @Override // j$.util.F
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean a5 = a();
        if (a5) {
            T2 t22 = (T2) this.f35661h;
            long j6 = this.f35660g;
            int t10 = t22.t(j6);
            doubleConsumer.accept((t22.f35615c == 0 && t10 == 0) ? ((double[]) t22.f35575e)[(int) j6] : ((double[][]) t22.f35576f)[t10][(int) (j6 - t22.f35616d[t10])]);
        }
        return a5;
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit */
    public final j$.util.F mo106trySplit() {
        return (j$.util.F) super.mo106trySplit();
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit  reason: collision with other method in class */
    public final j$.util.O mo106trySplit() {
        return (j$.util.F) super.mo106trySplit();
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        return (j$.util.F) super.mo106trySplit();
    }
}
