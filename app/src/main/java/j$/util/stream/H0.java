package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface H0 {
    H0 a(int i10);

    long count();

    void forEach(Consumer consumer);

    H0 h(long j6, long j10, IntFunction intFunction);

    void i(Object[] objArr, int i10);

    Object[] o(IntFunction intFunction);

    int q();

    /* renamed from: spliterator */
    Spliterator mo101spliterator();
}
