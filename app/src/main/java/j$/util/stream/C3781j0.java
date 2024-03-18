package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3781j0 extends AbstractC3796m0 {
    @Override // j$.util.stream.AbstractC3745c
    final boolean V0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC3796m0, j$.util.stream.AbstractC3811p0
    public final void forEach(LongConsumer longConsumer) {
        j$.util.L c12;
        if (isParallel()) {
            super.forEach(longConsumer);
            return;
        }
        c12 = AbstractC3796m0.c1(Y0());
        c12.forEachRemaining(longConsumer);
    }

    @Override // j$.util.stream.AbstractC3796m0, j$.util.stream.AbstractC3811p0
    public final void forEachOrdered(LongConsumer longConsumer) {
        j$.util.L c12;
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
            return;
        }
        c12 = AbstractC3796m0.c1(Y0());
        c12.forEachRemaining(longConsumer);
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ AbstractC3811p0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ AbstractC3811p0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC3796m0, j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
