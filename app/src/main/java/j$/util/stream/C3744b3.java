package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.C3727k;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3744b3 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Stream f35595a;

    private /* synthetic */ C3744b3(java.util.stream.Stream stream) {
        this.f35595a = stream;
    }

    public static /* synthetic */ Stream h(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C3744b3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f35595a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f35595a.anyMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream b(C3735a c3735a) {
        return h(this.f35595a.flatMap(AbstractC3855y0.r0(c3735a)));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f35595a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f35595a.collect(C3790l.a(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f35595a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f35595a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return h(this.f35595a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return h(this.f35595a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C3744b3) {
            obj = ((C3744b3) obj).f35595a;
        }
        return this.f35595a.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return h(this.f35595a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C3727k findAny() {
        return AbstractC3732p.i(this.f35595a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C3727k findFirst() {
        return AbstractC3732p.i(this.f35595a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f35595a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f35595a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35595a.hashCode();
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ boolean isParallel() {
        return this.f35595a.isParallel();
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f35595a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ AbstractC3811p0 l(C3735a c3735a) {
        return C3801n0.h(this.f35595a.flatMapToLong(AbstractC3855y0.r0(c3735a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j6) {
        return h(this.f35595a.limit(j6));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return h(this.f35595a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G mapToDouble(ToDoubleFunction toDoubleFunction) {
        return E.h(this.f35595a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f35595a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ AbstractC3811p0 mapToLong(ToLongFunction toLongFunction) {
        return C3801n0.h(this.f35595a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C3727k max(Comparator comparator) {
        return AbstractC3732p.i(this.f35595a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C3727k min(Comparator comparator) {
        return AbstractC3732p.i(this.f35595a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f35595a.noneMatch(predicate);
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ AbstractC3775i onClose(Runnable runnable) {
        return C3765g.h(this.f35595a.onClose(runnable));
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* synthetic */ AbstractC3775i parallel() {
        return C3765g.h(this.f35595a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return h(this.f35595a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream q(C3735a c3735a) {
        return IntStream.VivifiedWrapper.convert(this.f35595a.flatMapToInt(AbstractC3855y0.r0(c3735a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C3727k reduce(BinaryOperator binaryOperator) {
        return AbstractC3732p.i(this.f35595a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f35595a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f35595a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* synthetic */ AbstractC3775i sequential() {
        return C3765g.h(this.f35595a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j6) {
        return h(this.f35595a.skip(j6));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return h(this.f35595a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return h(this.f35595a.sorted(comparator));
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.P.a(this.f35595a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return h(this.f35595a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f35595a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f35595a.toArray(intFunction);
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ AbstractC3775i unordered() {
        return C3765g.h(this.f35595a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G x(C3735a c3735a) {
        return E.h(this.f35595a.flatMapToDouble(AbstractC3855y0.r0(c3735a)));
    }
}
