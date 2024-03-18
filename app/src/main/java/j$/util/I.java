package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public interface I extends O {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.O, j$.util.Spliterator
    /* renamed from: trySplit */
    I mo106trySplit();
}
