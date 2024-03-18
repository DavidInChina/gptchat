package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.C3726j;
import j$.util.C3728l;
import j$.util.C3730n;
import j$.util.stream.IntStream;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.n0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3801n0 implements AbstractC3811p0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f35695a;

    private /* synthetic */ C3801n0(LongStream longStream) {
        this.f35695a = longStream;
    }

    public static /* synthetic */ AbstractC3811p0 h(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C3806o0 ? ((C3806o0) longStream).f35706a : new C3801n0(longStream);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ AbstractC3811p0 a() {
        return h(this.f35695a.filter(null));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ G asDoubleStream() {
        return E.h(this.f35695a.asDoubleStream());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ C3728l average() {
        return AbstractC3732p.j(this.f35695a.average());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 b(C3735a c3735a) {
        return h(this.f35695a.flatMap(new C3735a(c3735a, 9)));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ Stream boxed() {
        return C3744b3.h(this.f35695a.boxed());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ AbstractC3811p0 c() {
        return h(this.f35695a.map(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f35695a.close();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f35695a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ long count() {
        return this.f35695a.count();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ AbstractC3811p0 distinct() {
        return h(this.f35695a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C3801n0) {
            obj = ((C3801n0) obj).f35695a;
        }
        return this.f35695a.equals(obj);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ C3730n findAny() {
        return AbstractC3732p.l(this.f35695a.findAny());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ C3730n findFirst() {
        return AbstractC3732p.l(this.f35695a.findFirst());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f35695a.forEach(longConsumer);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f35695a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35695a.hashCode();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ G i() {
        return E.h(this.f35695a.mapToDouble(null));
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ boolean isParallel() {
        return this.f35695a.isParallel();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ boolean k() {
        return this.f35695a.noneMatch(null);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ AbstractC3811p0 limit(long j6) {
        return h(this.f35695a.limit(j6));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C3744b3.h(this.f35695a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ C3730n max() {
        return AbstractC3732p.l(this.f35695a.max());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ C3730n min() {
        return AbstractC3732p.l(this.f35695a.min());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ boolean o() {
        return this.f35695a.allMatch(null);
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ AbstractC3775i onClose(Runnable runnable) {
        return C3765g.h(this.f35695a.onClose(runnable));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ AbstractC3811p0 peek(LongConsumer longConsumer) {
        return h(this.f35695a.peek(longConsumer));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ long reduce(long j6, LongBinaryOperator longBinaryOperator) {
        return this.f35695a.reduce(j6, longBinaryOperator);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ C3730n reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC3732p.l(this.f35695a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ AbstractC3811p0 skip(long j6) {
        return h(this.f35695a.skip(j6));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ AbstractC3811p0 sorted() {
        return h(this.f35695a.sorted());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ long sum() {
        return this.f35695a.sum();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final C3726j summaryStatistics() {
        this.f35695a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ boolean t() {
        return this.f35695a.anyMatch(null);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ long[] toArray() {
        return this.f35695a.toArray();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final /* synthetic */ IntStream u() {
        return IntStream.VivifiedWrapper.convert(this.f35695a.mapToInt(null));
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ AbstractC3775i unordered() {
        return C3765g.h(this.f35695a.unordered());
    }
}
