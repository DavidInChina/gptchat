package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class A extends D {
    @Override // j$.util.stream.AbstractC3745c
    final boolean V0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void forEach(DoubleConsumer doubleConsumer) {
        j$.util.F c12;
        if (isParallel()) {
            super.forEach(doubleConsumer);
            return;
        }
        c12 = D.c1(Y0());
        c12.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        j$.util.F c12;
        if (isParallel()) {
            super.forEachOrdered(doubleConsumer);
            return;
        }
        c12 = D.c1(Y0());
        c12.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.D, j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
