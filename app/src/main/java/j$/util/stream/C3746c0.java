package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3746c0 extends AbstractC3761f0 {
    @Override // j$.util.stream.AbstractC3745c
    final boolean V0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC3761f0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        j$.util.I c12;
        if (isParallel()) {
            super.forEach(intConsumer);
            return;
        }
        c12 = AbstractC3761f0.c1(Y0());
        c12.forEachRemaining(intConsumer);
    }

    @Override // j$.util.stream.AbstractC3761f0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        j$.util.I c12;
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
            return;
        }
        c12 = AbstractC3761f0.c1(Y0());
        c12.forEachRemaining(intConsumer);
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC3761f0, j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.AbstractC3775i
    public final AbstractC3775i unordered() {
        return !R0() ? this : new AbstractC3745c(this, EnumC3759e3.f35634r);
    }
}
