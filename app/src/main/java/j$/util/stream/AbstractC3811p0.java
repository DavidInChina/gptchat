package j$.util.stream;

import j$.util.C3726j;
import j$.util.C3728l;
import j$.util.C3730n;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.p0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface AbstractC3811p0 extends AbstractC3775i {
    AbstractC3811p0 a();

    G asDoubleStream();

    C3728l average();

    AbstractC3811p0 b(C3735a c3735a);

    Stream boxed();

    AbstractC3811p0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    AbstractC3811p0 distinct();

    C3730n findAny();

    C3730n findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    G i();

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    j$.util.A iterator();

    boolean k();

    AbstractC3811p0 limit(long j6);

    Stream mapToObj(LongFunction longFunction);

    C3730n max();

    C3730n min();

    boolean o();

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    AbstractC3811p0 parallel();

    AbstractC3811p0 peek(LongConsumer longConsumer);

    long reduce(long j6, LongBinaryOperator longBinaryOperator);

    C3730n reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    AbstractC3811p0 sequential();

    AbstractC3811p0 skip(long j6);

    AbstractC3811p0 sorted();

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    j$.util.L spliterator();

    long sum();

    C3726j summaryStatistics();

    boolean t();

    long[] toArray();

    IntStream u();
}
