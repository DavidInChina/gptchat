package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.C3723g;
import j$.util.C3728l;
import j$.util.stream.IntStream;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes3.dex */
public final /* synthetic */ class E implements G {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f35407a;

    private /* synthetic */ E(DoubleStream doubleStream) {
        this.f35407a = doubleStream;
    }

    public static /* synthetic */ G h(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof F ? ((F) doubleStream).f35414a : new E(doubleStream);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G a() {
        return h(this.f35407a.filter(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C3728l average() {
        return AbstractC3732p.j(this.f35407a.average());
    }

    @Override // j$.util.stream.G
    public final G b(C3735a c3735a) {
        return h(this.f35407a.flatMap(new C3735a(c3735a, 7)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream boxed() {
        return C3744b3.h(this.f35407a.boxed());
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f35407a.close();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f35407a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ long count() {
        return this.f35407a.count();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G distinct() {
        return h(this.f35407a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof E) {
            obj = ((E) obj).f35407a;
        }
        return this.f35407a.equals(obj);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean f() {
        return this.f35407a.allMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C3728l findAny() {
        return AbstractC3732p.j(this.f35407a.findAny());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C3728l findFirst() {
        return AbstractC3732p.j(this.f35407a.findFirst());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f35407a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f35407a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ AbstractC3811p0 g() {
        return C3801n0.h(this.f35407a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f35407a.hashCode();
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ boolean isParallel() {
        return this.f35407a.isParallel();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G limit(long j6) {
        return h(this.f35407a.limit(j6));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean m() {
        return this.f35407a.anyMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G map(DoubleUnaryOperator doubleUnaryOperator) {
        return h(this.f35407a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C3744b3.h(this.f35407a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C3728l max() {
        return AbstractC3732p.j(this.f35407a.max());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C3728l min() {
        return AbstractC3732p.j(this.f35407a.min());
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ AbstractC3775i onClose(Runnable runnable) {
        return C3765g.h(this.f35407a.onClose(runnable));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G peek(DoubleConsumer doubleConsumer) {
        return h(this.f35407a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ IntStream r() {
        return IntStream.VivifiedWrapper.convert(this.f35407a.mapToInt(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f35407a.reduce(d10, doubleBinaryOperator);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C3728l reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC3732p.j(this.f35407a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G skip(long j6) {
        return h(this.f35407a.skip(j6));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sorted() {
        return h(this.f35407a.sorted());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double sum() {
        return this.f35407a.sum();
    }

    @Override // j$.util.stream.G
    public final C3723g summaryStatistics() {
        this.f35407a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double[] toArray() {
        return this.f35407a.toArray();
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ AbstractC3775i unordered() {
        return C3765g.h(this.f35407a.unordered());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean w() {
        return this.f35407a.noneMatch(null);
    }
}
