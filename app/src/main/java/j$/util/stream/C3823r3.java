package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.r3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3823r3 extends AbstractC3769g3 implements j$.util.I {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.util.function.IntConsumer, java.lang.Object, j$.util.stream.e] */
    @Override // j$.util.stream.AbstractC3769g3
    final void d() {
        ?? z22 = new Z2();
        this.f35661h = z22;
        Objects.requireNonNull(z22);
        this.f35658e = this.f35655b.J0(new C3819q3(z22, 0));
        this.f35659f = new C3735a(this, 4);
    }

    @Override // j$.util.stream.AbstractC3769g3
    final AbstractC3769g3 e(Spliterator spliterator) {
        return new AbstractC3769g3(this.f35655b, spliterator, this.f35654a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.b(this, consumer);
    }

    @Override // j$.util.I
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f35661h != null || this.f35662i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        C3819q3 c3819q3 = new C3819q3(intConsumer, 1);
        this.f35655b.I0(this.f35657d, c3819q3);
        this.f35662i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.g(this, consumer);
    }

    @Override // j$.util.I
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a5 = a();
        if (a5) {
            V2 v22 = (V2) this.f35661h;
            long j6 = this.f35660g;
            int t10 = v22.t(j6);
            intConsumer.accept((v22.f35615c == 0 && t10 == 0) ? ((int[]) v22.f35575e)[(int) j6] : ((int[][]) v22.f35576f)[t10][(int) (j6 - v22.f35616d[t10])]);
        }
        return a5;
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit */
    public final j$.util.I mo106trySplit() {
        return (j$.util.I) super.mo106trySplit();
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit  reason: collision with other method in class */
    public final j$.util.O mo106trySplit() {
        return (j$.util.I) super.mo106trySplit();
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        return (j$.util.I) super.mo106trySplit();
    }
}
