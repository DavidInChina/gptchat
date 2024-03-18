package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.w  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface AbstractC3867w extends B {
    @Override // java.util.Iterator, j$.util.AbstractC3725i
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // java.util.Iterator
    Integer next();

    int nextInt();
}
