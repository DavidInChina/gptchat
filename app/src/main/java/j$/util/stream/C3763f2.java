package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3763f2 extends AbstractC3778i2 {
    @Override // j$.util.stream.AbstractC3745c
    final boolean V0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC3778i2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            Y0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC3778i2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            Y0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC3775i
    public final AbstractC3775i unordered() {
        return !R0() ? this : new AbstractC3745c(this, EnumC3759e3.f35634r);
    }
}
