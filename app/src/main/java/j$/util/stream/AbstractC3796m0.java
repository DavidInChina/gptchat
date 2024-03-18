package j$.util.stream;

import j$.util.C3726j;
import j$.util.C3728l;
import j$.util.C3730n;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.m0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3796m0 extends AbstractC3745c implements AbstractC3811p0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.L c1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.L) {
            return (j$.util.L) spliterator;
        }
        if (!Q3.f35509a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        Q3.a(AbstractC3745c.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3855y0
    public final C0 D0(long j6, IntFunction intFunction) {
        return AbstractC3855y0.v0(j6);
    }

    @Override // j$.util.stream.AbstractC3745c
    final H0 N0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC3855y0.d0(abstractC3855y0, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC3745c
    final boolean O0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        LongConsumer longConsumer;
        boolean n10;
        j$.util.L c12 = c1(spliterator);
        if (abstractC3818q2 instanceof LongConsumer) {
            longConsumer = (LongConsumer) abstractC3818q2;
        } else if (Q3.f35509a) {
            Q3.a(AbstractC3745c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        } else {
            Objects.requireNonNull(abstractC3818q2);
            longConsumer = new C3766g0(abstractC3818q2);
        }
        do {
            n10 = abstractC3818q2.n();
            if (n10) {
                break;
            }
        } while (c12.tryAdvance(longConsumer));
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final EnumC3764f3 P0() {
        return EnumC3764f3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC3745c
    final Spliterator Z0(AbstractC3855y0 abstractC3855y0, C3735a c3735a, boolean z10) {
        return new AbstractC3769g3(abstractC3855y0, c3735a, z10);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 a() {
        Objects.requireNonNull(null);
        return new C3849x(this, EnumC3759e3.f35636t, null, 4);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final G asDoubleStream() {
        return new C3859z(this, EnumC3759e3.f35630n, 2);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final C3728l average() {
        long[] jArr = (long[]) collect(new C3740b(23), new C3740b(24), new C3740b(25));
        long j6 = jArr[0];
        return j6 > 0 ? C3728l.d(jArr[1] / j6) : C3728l.a();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 b(C3735a c3735a) {
        Objects.requireNonNull(c3735a);
        return new C3849x(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n | EnumC3759e3.f35636t, c3735a, 3);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final Stream boxed() {
        return new C3834u(this, 0, new X(6), 2);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 c() {
        Objects.requireNonNull(null);
        return new C3849x(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, null, 2);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3824s c3824s = new C3824s(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c3824s);
        return L0(new D1(EnumC3764f3.LONG_VALUE, c3824s, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final long count() {
        return ((Long) L0(new F1(EnumC3764f3.LONG_VALUE, 0))).longValue();
    }

    /* renamed from: d1 */
    public final AbstractC3811p0 unordered() {
        return !R0() ? this : new Z(this, EnumC3759e3.f35634r, 1);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 distinct() {
        return ((AbstractC3778i2) ((AbstractC3778i2) boxed()).distinct()).mapToLong(new C3740b(21));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final C3730n findAny() {
        return (C3730n) L0(K.f35453d);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final C3730n findFirst() {
        return (C3730n) L0(K.f35452c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        L0(new Q(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        L0(new Q(longConsumer, true));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final G i() {
        Objects.requireNonNull(null);
        return new C3839v(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, null, 5);
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final j$.util.A iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final boolean k() {
        return ((Boolean) L0(AbstractC3855y0.C0(EnumC3840v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 limit(long j6) {
        if (j6 >= 0) {
            return AbstractC3855y0.B0(this, 0L, j6);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C3834u(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, longFunction, 2);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final C3730n max() {
        return reduce(new X(7));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final C3730n min() {
        return reduce(new X(4));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final boolean o() {
        return ((Boolean) L0(AbstractC3855y0.C0(EnumC3840v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C3849x(this, 0, longConsumer, 5);
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final long reduce(long j6, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) L0(new C3861z1(EnumC3764f3.LONG_VALUE, longBinaryOperator, j6))).longValue();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final C3730n reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (C3730n) L0(new B1(EnumC3764f3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 skip(long j6) {
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : AbstractC3855y0.B0(this, j6, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.p0, j$.util.stream.c] */
    @Override // j$.util.stream.AbstractC3811p0
    public final AbstractC3811p0 sorted() {
        return new AbstractC3745c(this, EnumC3759e3.f35633q | EnumC3759e3.f35631o);
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final j$.util.L spliterator() {
        return c1(super.spliterator());
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final long sum() {
        return reduce(0L, new X(8));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final C3726j summaryStatistics() {
        return (C3726j) collect(new N0(14), new X(3), new X(5));
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final boolean t() {
        return ((Boolean) L0(AbstractC3855y0.C0(EnumC3840v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final long[] toArray() {
        return (long[]) AbstractC3855y0.p0((F0) M0(new C3740b(22))).e();
    }

    @Override // j$.util.stream.AbstractC3811p0
    public final IntStream u() {
        Objects.requireNonNull(null);
        return new C3844w(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, null, 5);
    }
}
