package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public interface F extends O {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.O, j$.util.Spliterator
    /* renamed from: trySplit */
    F mo106trySplit();
}
