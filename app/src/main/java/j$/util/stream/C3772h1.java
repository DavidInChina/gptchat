package j$.util.stream;

import j$.util.AbstractC3732p;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.h1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3772h1 extends AbstractC3787k1 implements j$.util.F {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.f(this, consumer);
    }
}
