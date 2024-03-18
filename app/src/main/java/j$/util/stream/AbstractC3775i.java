package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface AbstractC3775i extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    AbstractC3775i onClose(Runnable runnable);

    AbstractC3775i parallel();

    AbstractC3775i sequential();

    Spliterator spliterator();

    AbstractC3775i unordered();
}
