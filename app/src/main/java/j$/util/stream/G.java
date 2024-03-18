package j$.util.stream;

import j$.util.AbstractC3734s;
import j$.util.C3723g;
import j$.util.C3728l;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public interface G extends AbstractC3775i {
    G a();

    C3728l average();

    G b(C3735a c3735a);

    Stream boxed();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    G distinct();

    boolean f();

    C3728l findAny();

    C3728l findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    AbstractC3811p0 g();

    @Override // 
    AbstractC3734s iterator();

    G limit(long j6);

    boolean m();

    G map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    C3728l max();

    C3728l min();

    @Override // 
    G parallel();

    G peek(DoubleConsumer doubleConsumer);

    IntStream r();

    double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator);

    C3728l reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // 
    G sequential();

    G skip(long j6);

    G sorted();

    @Override // 
    j$.util.F spliterator();

    double sum();

    C3723g summaryStatistics();

    double[] toArray();

    boolean w();
}
