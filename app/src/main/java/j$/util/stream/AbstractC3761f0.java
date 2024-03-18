package j$.util.stream;

import j$.util.AbstractC3867w;
import j$.util.C3724h;
import j$.util.C3728l;
import j$.util.C3729m;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.f0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3761f0 extends AbstractC3745c implements IntStream {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.I c1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.I) {
            return (j$.util.I) spliterator;
        }
        if (!Q3.f35509a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        Q3.a(AbstractC3745c.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3855y0
    public final C0 D0(long j6, IntFunction intFunction) {
        return AbstractC3855y0.t0(j6);
    }

    @Override // j$.util.stream.AbstractC3745c
    final H0 N0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC3855y0.c0(abstractC3855y0, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC3745c
    final boolean O0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        IntConsumer intConsumer;
        boolean n10;
        j$.util.I c12 = c1(spliterator);
        if (abstractC3818q2 instanceof IntConsumer) {
            intConsumer = (IntConsumer) abstractC3818q2;
        } else if (Q3.f35509a) {
            Q3.a(AbstractC3745c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        } else {
            Objects.requireNonNull(abstractC3818q2);
            intConsumer = new W(abstractC3818q2);
        }
        do {
            n10 = abstractC3818q2.n();
            if (n10) {
                break;
            }
        } while (c12.tryAdvance(intConsumer));
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final EnumC3764f3 P0() {
        return EnumC3764f3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC3745c
    final Spliterator Z0(AbstractC3855y0 abstractC3855y0, C3735a c3735a, boolean z10) {
        return new AbstractC3769g3(abstractC3855y0, c3735a, z10);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        Objects.requireNonNull(null);
        return new C3844w(this, EnumC3759e3.f35636t, null, 4);
    }

    @Override // j$.util.stream.IntStream
    public final G asDoubleStream() {
        return new C3859z(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final AbstractC3811p0 asLongStream() {
        return new Z(this, 0, 0);
    }

    @Override // j$.util.stream.IntStream
    public final C3728l average() {
        long[] jArr = (long[]) collect(new C3740b(18), new C3740b(19), new C3740b(20));
        long j6 = jArr[0];
        return j6 > 0 ? C3728l.d(jArr[1] / j6) : C3728l.a();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C3834u(this, 0, new N0(27), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        Objects.requireNonNull(null);
        return new C3844w(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, null, 2);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3824s c3824s = new C3824s(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c3824s);
        return L0(new D1(EnumC3764f3.INT_VALUE, c3824s, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) L0(new F1(EnumC3764f3.INT_VALUE, 3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final G d() {
        Objects.requireNonNull(null);
        return new C3839v(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, null, 4);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC3778i2) ((AbstractC3778i2) boxed()).distinct()).mapToInt(new C3740b(17));
    }

    @Override // j$.util.stream.IntStream
    public final boolean e() {
        return ((Boolean) L0(AbstractC3855y0.A0(EnumC3840v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final C3729m findAny() {
        return (C3729m) L0(J.f35440d);
    }

    @Override // j$.util.stream.IntStream
    public final C3729m findFirst() {
        return (C3729m) L0(J.f35439c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        L0(new P(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        L0(new P(intConsumer, true));
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final AbstractC3867w iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final AbstractC3811p0 j() {
        Objects.requireNonNull(null);
        return new C3849x(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, null, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j6) {
        if (j6 >= 0) {
            return AbstractC3855y0.z0(this, 0L, j6);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C3834u(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C3729m max() {
        return reduce(new X(2));
    }

    @Override // j$.util.stream.IntStream
    public final C3729m min() {
        return reduce(new N0(28));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream n(O0 o02) {
        Objects.requireNonNull(o02);
        return new C3844w(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n | EnumC3759e3.f35636t, o02, 3);
    }

    @Override // j$.util.stream.IntStream
    public final boolean p() {
        return ((Boolean) L0(AbstractC3855y0.A0(EnumC3840v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new C3844w(this, 0, intConsumer, 1);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) L0(new O1(EnumC3764f3.INT_VALUE, intBinaryOperator, i10))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final C3729m reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (C3729m) L0(new B1(EnumC3764f3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) L0(AbstractC3855y0.A0(EnumC3840v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j6) {
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : AbstractC3855y0.z0(this, j6, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.IntStream, j$.util.stream.c] */
    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new AbstractC3745c(this, EnumC3759e3.f35633q | EnumC3759e3.f35631o);
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final j$.util.I spliterator() {
        return c1(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new X(1));
    }

    @Override // j$.util.stream.IntStream
    public final C3724h summaryStatistics() {
        return (C3724h) collect(new N0(13), new N0(29), new X(0));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC3855y0.o0((E0) M0(new C3740b(16))).e();
    }
}
