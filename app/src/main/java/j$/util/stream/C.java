package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
abstract class C extends D {
    @Override // j$.util.stream.AbstractC3745c
    final boolean V0() {
        return false;
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
