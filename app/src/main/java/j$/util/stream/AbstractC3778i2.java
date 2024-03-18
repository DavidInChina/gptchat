package j$.util.stream;

import j$.util.C3727k;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
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

/* renamed from: j$.util.stream.i2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3778i2 extends AbstractC3745c implements Stream {
    @Override // j$.util.stream.AbstractC3855y0
    final C0 D0(long j6, IntFunction intFunction) {
        return AbstractC3855y0.Z(j6, intFunction);
    }

    @Override // j$.util.stream.AbstractC3745c
    final H0 N0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC3855y0.a0(abstractC3855y0, spliterator, z10, intFunction);
    }

    @Override // j$.util.stream.AbstractC3745c
    final boolean O0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        boolean n10;
        do {
            n10 = abstractC3818q2.n();
            if (n10) {
                break;
            }
        } while (spliterator.tryAdvance(abstractC3818q2));
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final EnumC3764f3 P0() {
        return EnumC3764f3.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC3745c
    final Spliterator Z0(AbstractC3855y0 abstractC3855y0, C3735a c3735a, boolean z10) {
        return new AbstractC3769g3(abstractC3855y0, c3735a, z10);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) L0(AbstractC3855y0.E0(EnumC3840v0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) L0(AbstractC3855y0.E0(EnumC3840v0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream b(C3735a c3735a) {
        Objects.requireNonNull(c3735a);
        return new C3753d2(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n | EnumC3759e3.f35636t, c3735a, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object obj;
        if (!isParallel() || !collector.characteristics().contains(EnumC3780j.CONCURRENT) || (R0() && !collector.characteristics().contains(EnumC3780j.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            obj = L0(new K1(EnumC3764f3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        } else {
            obj = collector.supplier().get();
            forEach(new C3800n(5, collector.accumulator(), obj));
        }
        return collector.characteristics().contains(EnumC3780j.IDENTITY_FINISH) ? obj : collector.finisher().apply(obj);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return L0(new D1(EnumC3764f3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) L0(new F1(EnumC3764f3.REFERENCE, 2))).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Stream, j$.util.stream.c] */
    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new AbstractC3745c(this, EnumC3759e3.f35629m | EnumC3759e3.f35636t);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i10 = a4.f35590a;
        Objects.requireNonNull(predicate);
        return new T3(this, a4.f35591b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C3834u(this, EnumC3759e3.f35636t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final C3727k findAny() {
        return (C3727k) L0(L.f35463d);
    }

    @Override // j$.util.stream.Stream
    public final C3727k findFirst() {
        return (C3727k) L0(L.f35462c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        L0(new S(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        L0(new S(consumer, true));
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final AbstractC3811p0 l(C3735a c3735a) {
        Objects.requireNonNull(c3735a);
        return new C3849x(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n | EnumC3759e3.f35636t, c3735a, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j6) {
        if (j6 >= 0) {
            return AbstractC3855y0.F0(this, 0L, j6);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C3753d2(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final G mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C3839v(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, toDoubleFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new C3844w(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, toIntFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final AbstractC3811p0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C3849x(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, toLongFunction, 7);
    }

    @Override // j$.util.stream.Stream
    public final C3727k max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final C3727k min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) L0(AbstractC3855y0.E0(EnumC3840v0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C3834u(this, 0, consumer, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream q(C3735a c3735a) {
        Objects.requireNonNull(c3735a);
        return new C3844w(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n | EnumC3759e3.f35636t, c3735a, 7);
    }

    @Override // j$.util.stream.Stream
    public final C3727k reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (C3727k) L0(new B1(EnumC3764f3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return L0(new D1(EnumC3764f3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return L0(new D1(EnumC3764f3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j6) {
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : AbstractC3855y0.F0(this, j6, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new L2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i10 = a4.f35590a;
        Objects.requireNonNull(predicate);
        return new R3(this, a4.f35590a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new N0(4));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC3855y0.m0(M0(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final G x(C3735a c3735a) {
        Objects.requireNonNull(c3735a);
        return new C3839v(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n | EnumC3759e3.f35636t, c3735a, 7);
    }
}
