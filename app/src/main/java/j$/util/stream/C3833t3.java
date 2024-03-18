package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.t3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3833t3 extends AbstractC3769g3 implements j$.util.L {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.lang.Object, j$.util.stream.e, java.util.function.LongConsumer] */
    @Override // j$.util.stream.AbstractC3769g3
    final void d() {
        ?? z22 = new Z2();
        this.f35661h = z22;
        Objects.requireNonNull(z22);
        this.f35658e = this.f35655b.J0(new C3828s3(z22, 0));
        this.f35659f = new C3735a(this, 5);
    }

    @Override // j$.util.stream.AbstractC3769g3
    final AbstractC3769g3 e(Spliterator spliterator) {
        return new AbstractC3769g3(this.f35655b, spliterator, this.f35654a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.c(this, consumer);
    }

    @Override // j$.util.L
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f35661h != null || this.f35662i) {
            do {
            } while (tryAdvance(longConsumer));
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        C3828s3 c3828s3 = new C3828s3(longConsumer, 1);
        this.f35655b.I0(this.f35657d, c3828s3);
        this.f35662i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.h(this, consumer);
    }

    @Override // j$.util.L
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean a5 = a();
        if (a5) {
            X2 x22 = (X2) this.f35661h;
            long j6 = this.f35660g;
            int t10 = x22.t(j6);
            longConsumer.accept((x22.f35615c == 0 && t10 == 0) ? ((long[]) x22.f35575e)[(int) j6] : ((long[][]) x22.f35576f)[t10][(int) (j6 - x22.f35616d[t10])]);
        }
        return a5;
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit */
    public final j$.util.L mo106trySplit() {
        return (j$.util.L) super.mo106trySplit();
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit  reason: collision with other method in class */
    public final j$.util.O mo106trySplit() {
        return (j$.util.L) super.mo106trySplit();
    }

    @Override // j$.util.stream.AbstractC3769g3, j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        return (j$.util.L) super.mo106trySplit();
    }
}
