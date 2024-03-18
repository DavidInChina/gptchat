package j$.util.stream;

import j$.util.C3721e;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.y0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3855y0 implements N3 {

    /* renamed from: a  reason: collision with root package name */
    private static final C3742b1 f35773a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final E0 f35774b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final F0 f35775c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final D0 f35776d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f35777e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private static final long[] f35778f = new long[0];

    /* renamed from: g  reason: collision with root package name */
    private static final double[] f35779g = new double[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3855y0(EnumC3764f3 enumC3764f3) {
    }

    public static void A(AbstractC3803n2 abstractC3803n2, Double d10) {
        if (!Q3.f35509a) {
            abstractC3803n2.accept(d10.doubleValue());
        } else {
            Q3.a(abstractC3803n2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    public static C3845w0 A0(EnumC3840v0 enumC3840v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3840v0);
        return new C3845w0(EnumC3764f3.INT_VALUE, enumC3840v0, new C3800n(2, enumC3840v0, null));
    }

    public static AbstractC3811p0 B0(AbstractC3745c abstractC3745c, long j6, long j10) {
        if (j6 >= 0) {
            return new C3847w2(abstractC3745c, l0(j10), j6, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j6);
    }

    public static void C(AbstractC3808o2 abstractC3808o2, Integer num) {
        if (!Q3.f35509a) {
            abstractC3808o2.accept(num.intValue());
        } else {
            Q3.a(abstractC3808o2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    public static C3845w0 C0(EnumC3840v0 enumC3840v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3840v0);
        return new C3845w0(EnumC3764f3.LONG_VALUE, enumC3840v0, new C3800n(1, enumC3840v0, null));
    }

    public static void E(AbstractC3813p2 abstractC3813p2, Long l10) {
        if (!Q3.f35509a) {
            abstractC3813p2.accept(l10.longValue());
        } else {
            Q3.a(abstractC3813p2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    public static C3845w0 E0(EnumC3840v0 enumC3840v0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC3840v0);
        return new C3845w0(EnumC3764f3.REFERENCE, enumC3840v0, new C3800n(4, enumC3840v0, predicate));
    }

    public static Stream F0(AbstractC3745c abstractC3745c, long j6, long j10) {
        if (j6 >= 0) {
            return new C3827s2(abstractC3745c, l0(j10), j6, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j6);
    }

    public static void G() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void H() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Stream, j$.util.stream.c] */
    public static Stream H0(Spliterator spliterator, boolean z10) {
        Objects.requireNonNull(spliterator);
        return new AbstractC3745c(spliterator, EnumC3759e3.r(spliterator), z10);
    }

    public static Object[] I(G0 g02, IntFunction intFunction) {
        if (Q3.f35509a) {
            Q3.a(g02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (g02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.apply((int) g02.count());
            g02.i(objArr, 0);
            return objArr;
        }
    }

    public static void J(D0 d02, Double[] dArr, int i10) {
        if (Q3.f35509a) {
            Q3.a(d02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) d02.e();
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
        }
    }

    public static void K(E0 e02, Integer[] numArr, int i10) {
        if (Q3.f35509a) {
            Q3.a(e02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) e02.e();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
        }
    }

    public static void L(F0 f02, Long[] lArr, int i10) {
        if (Q3.f35509a) {
            Q3.a(f02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) f02.e();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i10 + i11] = Long.valueOf(jArr[i11]);
        }
    }

    public static void M(D0 d02, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            d02.f((DoubleConsumer) consumer);
        } else if (!Q3.f35509a) {
            ((j$.util.F) d02.mo101spliterator()).forEachRemaining(consumer);
        } else {
            Q3.a(d02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void N(E0 e02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e02.f((IntConsumer) consumer);
        } else if (!Q3.f35509a) {
            ((j$.util.I) e02.mo101spliterator()).forEachRemaining(consumer);
        } else {
            Q3.a(e02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void O(F0 f02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            f02.f((LongConsumer) consumer);
        } else if (!Q3.f35509a) {
            ((j$.util.L) f02.mo101spliterator()).forEachRemaining(consumer);
        } else {
            Q3.a(f02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static D0 P(D0 d02, long j6, long j10) {
        if (j6 == 0 && j10 == d02.count()) {
            return d02;
        }
        long j11 = j10 - j6;
        j$.util.F f6 = (j$.util.F) d02.mo101spliterator();
        AbstractC3860z0 h02 = h0(j11);
        h02.l(j11);
        for (int i10 = 0; i10 < j6 && f6.tryAdvance((DoubleConsumer) new C3838u3(1)); i10++) {
        }
        if (j10 == d02.count()) {
            f6.forEachRemaining((DoubleConsumer) h02);
        } else {
            for (int i11 = 0; i11 < j11 && f6.tryAdvance((DoubleConsumer) h02); i11++) {
            }
        }
        h02.k();
        return h02.mo102b();
    }

    public static E0 Q(E0 e02, long j6, long j10) {
        if (j6 == 0 && j10 == e02.count()) {
            return e02;
        }
        long j11 = j10 - j6;
        j$.util.I i10 = (j$.util.I) e02.mo101spliterator();
        A0 t02 = t0(j11);
        t02.l(j11);
        for (int i11 = 0; i11 < j6 && i10.tryAdvance((IntConsumer) new C3848w3(1)); i11++) {
        }
        if (j10 == e02.count()) {
            i10.forEachRemaining((IntConsumer) t02);
        } else {
            for (int i12 = 0; i12 < j11 && i10.tryAdvance((IntConsumer) t02); i12++) {
            }
        }
        t02.k();
        return t02.mo102b();
    }

    public static F0 R(F0 f02, long j6, long j10) {
        if (j6 == 0 && j10 == f02.count()) {
            return f02;
        }
        long j11 = j10 - j6;
        j$.util.L l10 = (j$.util.L) f02.mo101spliterator();
        B0 v02 = v0(j11);
        v02.l(j11);
        for (int i10 = 0; i10 < j6 && l10.tryAdvance((LongConsumer) new C3858y3(1)); i10++) {
        }
        if (j10 == f02.count()) {
            l10.forEachRemaining((LongConsumer) v02);
        } else {
            for (int i11 = 0; i11 < j11 && l10.tryAdvance((LongConsumer) v02); i11++) {
            }
        }
        v02.k();
        return v02.mo102b();
    }

    public static H0 S(H0 h02, long j6, long j10, IntFunction intFunction) {
        if (j6 == 0 && j10 == h02.count()) {
            return h02;
        }
        Spliterator mo101spliterator = h02.mo101spliterator();
        long j11 = j10 - j6;
        C0 Z10 = Z(j11, intFunction);
        Z10.l(j11);
        for (int i10 = 0; i10 < j6 && mo101spliterator.tryAdvance(new X(9)); i10++) {
        }
        if (j10 == h02.count()) {
            mo101spliterator.forEachRemaining(Z10);
        } else {
            for (int i11 = 0; i11 < j11 && mo101spliterator.tryAdvance(Z10); i11++) {
            }
        }
        Z10.k();
        return Z10.mo102b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long W(long j6, long j10, long j11) {
        if (j6 >= 0) {
            return Math.max(-1L, Math.min(j6 - j10, j11));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long X(long j6, long j10) {
        long j11 = j10 >= 0 ? j6 + j10 : Long.MAX_VALUE;
        if (j11 >= 0) {
            return j11;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Spliterator Y(EnumC3764f3 enumC3764f3, Spliterator spliterator, long j6, long j10) {
        long j11 = j10 >= 0 ? j6 + j10 : Long.MAX_VALUE;
        long j12 = j11 >= 0 ? j11 : Long.MAX_VALUE;
        int i10 = AbstractC3862z2.f35788a[enumC3764f3.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return new A3((j$.util.I) spliterator, j6, j12);
            }
            if (i10 == 3) {
                return new A3((j$.util.L) spliterator, j6, j12);
            }
            if (i10 == 4) {
                return new A3((j$.util.F) spliterator, j6, j12);
            }
            throw new IllegalStateException("Unknown shape " + enumC3764f3);
        }
        return new B3(spliterator, j6, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.a3, j$.util.stream.C0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.K0, j$.util.stream.C0] */
    public static C0 Z(long j6, IntFunction intFunction) {
        return (j6 < 0 || j6 >= 2147483639) ? new C3739a3() : new K0(j6, intFunction);
    }

    public static H0 a0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        long k02 = abstractC3855y0.k0(spliterator);
        if (k02 < 0 || !spliterator.hasCharacteristics(16384)) {
            H0 h02 = (H0) new M0(spliterator, abstractC3855y0, intFunction).invoke();
            return z10 ? m0(h02, intFunction) : h02;
        } else if (k02 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.apply((int) k02);
            new C3831t1(spliterator, abstractC3855y0, objArr).invoke();
            return new K0(objArr);
        }
    }

    public static D0 b0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10) {
        long k02 = abstractC3855y0.k0(spliterator);
        if (k02 < 0 || !spliterator.hasCharacteristics(16384)) {
            D0 d02 = (D0) new M0(0, spliterator, abstractC3855y0).invoke();
            return z10 ? n0(d02) : d02;
        } else if (k02 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            double[] dArr = new double[(int) k02];
            new C3817q1(spliterator, abstractC3855y0, dArr).invoke();
            return new V0(dArr);
        }
    }

    public static E0 c0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10) {
        long k02 = abstractC3855y0.k0(spliterator);
        if (k02 < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e02 = (E0) new M0(1, spliterator, abstractC3855y0).invoke();
            return z10 ? o0(e02) : e02;
        } else if (k02 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            int[] iArr = new int[(int) k02];
            new C3821r1(spliterator, abstractC3855y0, iArr).invoke();
            return new C3757e1(iArr);
        }
    }

    public static F0 d0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10) {
        long k02 = abstractC3855y0.k0(spliterator);
        if (k02 < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f02 = (F0) new M0(2, spliterator, abstractC3855y0).invoke();
            return z10 ? p0(f02) : f02;
        } else if (k02 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            long[] jArr = new long[(int) k02];
            new C3826s1(spliterator, abstractC3855y0, jArr).invoke();
            return new C3802n1(jArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static J0 e0(EnumC3764f3 enumC3764f3, H0 h02, H0 h03) {
        int i10 = I0.f35432a[enumC3764f3.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return new J0((E0) h02, (E0) h03);
            }
            if (i10 == 3) {
                return new J0((F0) h02, (F0) h03);
            }
            if (i10 == 4) {
                return new J0((D0) h02, (D0) h03);
            }
            throw new IllegalStateException("Unknown shape " + enumC3764f3);
        }
        return new J0(h02, h03);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.z0, j$.util.stream.Z2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.z0, j$.util.stream.V0] */
    public static AbstractC3860z0 h0(long j6) {
        return (j6 < 0 || j6 >= 2147483639) ? new Z2() : new V0(j6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.G, j$.util.stream.c] */
    public static G i0(j$.util.F f6) {
        return new AbstractC3745c(f6, EnumC3759e3.r(f6), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC3747c1 j0(EnumC3764f3 enumC3764f3) {
        H0 h02;
        int i10 = I0.f35432a[enumC3764f3.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                h02 = f35774b;
            } else if (i10 == 3) {
                h02 = f35775c;
            } else if (i10 != 4) {
                throw new IllegalStateException("Unknown shape " + enumC3764f3);
            } else {
                h02 = f35776d;
            }
            return (AbstractC3747c1) h02;
        }
        return f35773a;
    }

    private static int l0(long j6) {
        return (j6 != -1 ? EnumC3759e3.f35637u : 0) | EnumC3759e3.f35636t;
    }

    public static H0 m0(H0 h02, IntFunction intFunction) {
        if (h02.q() > 0) {
            long count = h02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            new C3851x1(h02, objArr).invoke();
            return new K0(objArr);
        }
        return h02;
    }

    public static D0 n0(D0 d02) {
        if (d02.q() > 0) {
            long count = d02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            double[] dArr = new double[(int) count];
            new C3851x1(d02, dArr).invoke();
            return new V0(dArr);
        }
        return d02;
    }

    public static E0 o0(E0 e02) {
        if (e02.q() > 0) {
            long count = e02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            int[] iArr = new int[(int) count];
            new C3851x1(e02, iArr).invoke();
            return new C3757e1(iArr);
        }
        return e02;
    }

    public static F0 p0(F0 f02) {
        if (f02.q() > 0) {
            long count = f02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            long[] jArr = new long[(int) count];
            new C3851x1(f02, jArr).invoke();
            return new C3802n1(jArr);
        }
        return f02;
    }

    public static Set q0(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC3780j) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC3780j enumC3780j = (EnumC3780j) it.next();
                    hashSet.add(enumC3780j == null ? null : enumC3780j == EnumC3780j.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC3780j == EnumC3780j.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e10) {
                    C3721e.a(e10, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
            return hashSet;
        } else if (!(next instanceof Collector.Characteristics)) {
            C3721e.a(next.getClass(), "java.util.stream.Collector.Characteristics");
            throw null;
        } else {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it2.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? EnumC3780j.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? EnumC3780j.UNORDERED : EnumC3780j.IDENTITY_FINISH);
                } catch (ClassCastException e11) {
                    C3721e.a(e11, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
            return hashSet;
        }
    }

    public static C3735a r0(Function function) {
        return new C3735a(function, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.Z2, j$.util.stream.A0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.A0, j$.util.stream.e1] */
    public static A0 t0(long j6) {
        return (j6 < 0 || j6 >= 2147483639) ? new Z2() : new C3757e1(j6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.IntStream, j$.util.stream.c] */
    public static IntStream u0(j$.util.I i10) {
        return new AbstractC3745c(i10, EnumC3759e3.r(i10), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.Z2, j$.util.stream.B0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.n1, j$.util.stream.B0] */
    public static B0 v0(long j6) {
        return (j6 < 0 || j6 >= 2147483639) ? new Z2() : new C3802n1(j6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.p0, j$.util.stream.c] */
    public static AbstractC3811p0 w0(j$.util.L l10) {
        return new AbstractC3745c(l10, EnumC3759e3.r(l10), false);
    }

    public static G x0(AbstractC3745c abstractC3745c, long j6, long j10) {
        if (j6 >= 0) {
            return new C3857y2(abstractC3745c, l0(j10), j6, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j6);
    }

    public static C3845w0 y0(EnumC3840v0 enumC3840v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3840v0);
        return new C3845w0(EnumC3764f3.DOUBLE_VALUE, enumC3840v0, new C3800n(3, enumC3840v0, null));
    }

    public static void z() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static IntStream z0(AbstractC3745c abstractC3745c, long j6, long j10) {
        if (j6 >= 0) {
            return new C3837u2(abstractC3745c, l0(j10), j6, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract C0 D0(long j6, IntFunction intFunction);

    public abstract T1 G0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract AbstractC3818q2 I0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract AbstractC3818q2 J0(AbstractC3818q2 abstractC3818q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean g0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2);

    @Override // j$.util.stream.N3
    public /* synthetic */ int h() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long k0(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int s0();

    @Override // j$.util.stream.N3
    public Object v(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        return ((T1) new C3738a2(this, abstractC3855y0, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.N3
    public Object y(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        T1 G02 = G0();
        abstractC3855y0.I0(spliterator, G02);
        return G02.get();
    }
}
