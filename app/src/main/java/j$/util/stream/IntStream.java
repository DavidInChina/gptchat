package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.AbstractC3867w;
import j$.util.C3724h;
import j$.util.C3728l;
import j$.util.C3729m;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes3.dex */
public interface IntStream extends AbstractC3775i {

    /* loaded from: classes3.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a */
        public final /* synthetic */ java.util.stream.IntStream f35437a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f35437a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream a() {
            return convert(this.f35437a.filter(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ G asDoubleStream() {
            return E.h(this.f35437a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ AbstractC3811p0 asLongStream() {
            return C3801n0.h(this.f35437a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C3728l average() {
            return AbstractC3732p.j(this.f35437a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return C3744b3.h(this.f35437a.boxed());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream c() {
            return convert(this.f35437a.map(null));
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f35437a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return this.f35437a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f35437a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ G d() {
            return E.h(this.f35437a.mapToDouble(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f35437a.distinct());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean e() {
            return this.f35437a.noneMatch(null);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f35437a;
            }
            return this.f35437a.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C3729m findAny() {
            return AbstractC3732p.k(this.f35437a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C3729m findFirst() {
            return AbstractC3732p.k(this.f35437a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.f35437a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.f35437a.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return this.f35437a.hashCode();
        }

        @Override // j$.util.stream.AbstractC3775i
        public final /* synthetic */ boolean isParallel() {
            return this.f35437a.isParallel();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ AbstractC3811p0 j() {
            return C3801n0.h(this.f35437a.mapToLong(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j6) {
            return convert(this.f35437a.limit(j6));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return C3744b3.h(this.f35437a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C3729m max() {
            return AbstractC3732p.k(this.f35437a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C3729m min() {
            return AbstractC3732p.k(this.f35437a.min());
        }

        @Override // j$.util.stream.IntStream
        public final IntStream n(O0 o02) {
            return convert(this.f35437a.flatMap(new O0(o02)));
        }

        @Override // j$.util.stream.AbstractC3775i
        public final /* synthetic */ AbstractC3775i onClose(Runnable runnable) {
            return C3765g.h(this.f35437a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean p() {
            return this.f35437a.anyMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            return convert(this.f35437a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return this.f35437a.reduce(i10, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C3729m reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC3732p.k(this.f35437a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean s() {
            return this.f35437a.allMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j6) {
            return convert(this.f35437a.skip(j6));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f35437a.sorted());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f35437a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final C3724h summaryStatistics() {
            this.f35437a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f35437a.toArray();
        }

        @Override // j$.util.stream.AbstractC3775i
        public final /* synthetic */ AbstractC3775i unordered() {
            return C3765g.h(this.f35437a.unordered());
        }
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
            IntStream.this = r1;
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f35437a : new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.s();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.p();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return F.h(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C3806o0.h(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC3732p.n(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.a());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC3732p.o(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC3732p.o(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            return convert(IntStream.this.n(new O0(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j6) {
            return convert(IntStream.this.limit(j6));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.c());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return F.h(IntStream.this.d());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C3806o0.h(IntStream.this.j());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC3732p.o(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC3732p.o(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.e();
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
            return C3770h.h(IntStream.this.onClose(runnable));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i10, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC3732p.o(IntStream.this.reduce(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j6) {
            return convert(IntStream.this.skip(j6));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream unordered() {
            return C3770h.h(IntStream.this.unordered());
        }
    }

    IntStream a();

    G asDoubleStream();

    AbstractC3811p0 asLongStream();

    C3728l average();

    Stream boxed();

    IntStream c();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    G d();

    IntStream distinct();

    boolean e();

    C3729m findAny();

    C3729m findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    AbstractC3867w iterator();

    AbstractC3811p0 j();

    IntStream limit(long j6);

    Stream mapToObj(IntFunction intFunction);

    C3729m max();

    C3729m min();

    IntStream n(O0 o02);

    boolean p();

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    int reduce(int i10, IntBinaryOperator intBinaryOperator);

    C3729m reduce(IntBinaryOperator intBinaryOperator);

    boolean s();

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    IntStream sequential();

    IntStream skip(long j6);

    IntStream sorted();

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    j$.util.I spliterator();

    int sum();

    C3724h summaryStatistics();

    int[] toArray();
}
