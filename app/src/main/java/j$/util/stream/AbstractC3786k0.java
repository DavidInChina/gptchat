package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.k0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3786k0 extends AbstractC3796m0 {
    @Override // j$.util.stream.AbstractC3745c
    final boolean V0() {
        return true;
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
