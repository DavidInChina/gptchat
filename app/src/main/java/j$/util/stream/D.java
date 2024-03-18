package j$.util.stream;

import j$.util.AbstractC3734s;
import j$.util.C3723g;
import j$.util.C3728l;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
abstract class D extends AbstractC3745c implements G {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.F c1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.F) {
            return (j$.util.F) spliterator;
        }
        if (!Q3.f35509a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        Q3.a(AbstractC3745c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3855y0
    public final C0 D0(long j6, IntFunction intFunction) {
        return AbstractC3855y0.h0(j6);
    }

    @Override // j$.util.stream.AbstractC3745c
    final H0 N0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC3855y0.b0(abstractC3855y0, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC3745c
    final boolean O0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        DoubleConsumer doubleConsumer;
        boolean n10;
        j$.util.F c12 = c1(spliterator);
        if (abstractC3818q2 instanceof DoubleConsumer) {
            doubleConsumer = (DoubleConsumer) abstractC3818q2;
        } else if (Q3.f35509a) {
            Q3.a(AbstractC3745c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        } else {
            Objects.requireNonNull(abstractC3818q2);
            doubleConsumer = new r(abstractC3818q2);
        }
        do {
            n10 = abstractC3818q2.n();
            if (n10) {
                break;
            }
        } while (c12.tryAdvance(doubleConsumer));
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final EnumC3764f3 P0() {
        return EnumC3764f3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC3745c
    final Spliterator Z0(AbstractC3855y0 abstractC3855y0, C3735a c3735a, boolean z10) {
        return new AbstractC3769g3(abstractC3855y0, c3735a, z10);
    }

    @Override // j$.util.stream.G
    public final G a() {
        Objects.requireNonNull(null);
        return new C3839v(this, EnumC3759e3.f35636t, null, 2);
    }

    @Override // j$.util.stream.G
    public final C3728l average() {
        double[] dArr = (double[]) collect(new C3740b(4), new C3740b(5), new C3740b(6));
        if (dArr[2] > 0.0d) {
            Set set = Collectors.f35400a;
            double d10 = dArr[0] + dArr[1];
            double d11 = dArr[dArr.length - 1];
            if (Double.isNaN(d10) && Double.isInfinite(d11)) {
                d10 = d11;
            }
            return C3728l.d(d10 / dArr[2]);
        }
        return C3728l.a();
    }

    @Override // j$.util.stream.G
    public final G b(C3735a c3735a) {
        Objects.requireNonNull(c3735a);
        return new C3839v(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n | EnumC3759e3.f35636t, c3735a, 1);
    }

    @Override // j$.util.stream.G
    public final Stream boxed() {
        return new C3834u(this, 0, new N0(21), 0);
    }

    @Override // j$.util.stream.G
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3824s c3824s = new C3824s(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c3824s);
        return L0(new D1(EnumC3764f3.DOUBLE_VALUE, c3824s, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.G
    public final long count() {
        return ((Long) L0(new F1(EnumC3764f3.DOUBLE_VALUE, 1))).longValue();
    }

    /* renamed from: d1 */
    public final G unordered() {
        return !R0() ? this : new C3859z(this, EnumC3759e3.f35634r, 0);
    }

    @Override // j$.util.stream.G
    public final G distinct() {
        return ((AbstractC3778i2) ((AbstractC3778i2) boxed()).distinct()).mapToDouble(new C3740b(7));
    }

    @Override // j$.util.stream.G
    public final boolean f() {
        return ((Boolean) L0(AbstractC3855y0.y0(EnumC3840v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final C3728l findAny() {
        return (C3728l) L0(I.f35431d);
    }

    @Override // j$.util.stream.G
    public final C3728l findFirst() {
        return (C3728l) L0(I.f35430c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        L0(new O(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        L0(new O(doubleConsumer, true));
    }

    @Override // j$.util.stream.G
    public final AbstractC3811p0 g() {
        Objects.requireNonNull(null);
        return new C3849x(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, null, 0);
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final AbstractC3734s iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.G
    public final G limit(long j6) {
        if (j6 >= 0) {
            return AbstractC3855y0.x0(this, 0L, j6);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.G
    public final boolean m() {
        return ((Boolean) L0(AbstractC3855y0.y0(EnumC3840v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final G map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new C3839v(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.G
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C3834u(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, doubleFunction, 0);
    }

    @Override // j$.util.stream.G
    public final C3728l max() {
        return reduce(new N0(22));
    }

    @Override // j$.util.stream.G
    public final C3728l min() {
        return reduce(new N0(18));
    }

    @Override // j$.util.stream.G
    public final G peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C3839v(this, 0, doubleConsumer, 3);
    }

    @Override // j$.util.stream.G
    public final IntStream r() {
        Objects.requireNonNull(null);
        return new C3844w(this, EnumC3759e3.f35632p | EnumC3759e3.f35630n, null, 0);
    }

    @Override // j$.util.stream.G
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) L0(new H1(EnumC3764f3.DOUBLE_VALUE, doubleBinaryOperator, d10))).doubleValue();
    }

    @Override // j$.util.stream.G
    public final C3728l reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C3728l) L0(new B1(EnumC3764f3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.G
    public final G skip(long j6) {
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : AbstractC3855y0.x0(this, j6, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.G, j$.util.stream.c] */
    @Override // j$.util.stream.G
    public final G sorted() {
        return new AbstractC3745c(this, EnumC3759e3.f35633q | EnumC3759e3.f35631o);
    }

    @Override // j$.util.stream.AbstractC3745c, j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final j$.util.F spliterator() {
        return c1(super.spliterator());
    }

    @Override // j$.util.stream.G
    public final double sum() {
        double[] dArr = (double[]) collect(new C3740b(9), new C3740b(10), new C3740b(3));
        Set set = Collectors.f35400a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (!Double.isNaN(d10) || !Double.isInfinite(d11)) ? d10 : d11;
    }

    @Override // j$.util.stream.G
    public final C3723g summaryStatistics() {
        return (C3723g) collect(new N0(10), new N0(19), new N0(20));
    }

    @Override // j$.util.stream.G
    public final double[] toArray() {
        return (double[]) AbstractC3855y0.n0((D0) M0(new C3740b(8))).e();
    }

    @Override // j$.util.stream.G
    public final boolean w() {
        return ((Boolean) L0(AbstractC3855y0.y0(EnumC3840v0.NONE))).booleanValue();
    }
}
