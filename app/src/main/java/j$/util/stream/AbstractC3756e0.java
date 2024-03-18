package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.e0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3756e0 extends AbstractC3761f0 {
    @Override // j$.util.stream.AbstractC3745c
    final boolean V0() {
        return false;
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
