package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public interface L extends O {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.O, j$.util.Spliterator
    /* renamed from: trySplit */
    L mo106trySplit();
}
