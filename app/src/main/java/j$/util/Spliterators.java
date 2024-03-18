package j$.util;

import android.gov.nist.core.Separators;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Spliterators {

    /* renamed from: a  reason: collision with root package name */
    private static final Spliterator f35225a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final I f35226b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final L f35227c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final F f35228d = new Object();

    private static void a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + Separators.RPAREN);
    }

    public static F b() {
        return f35228d;
    }

    public static I c() {
        return f35226b;
    }

    public static L d() {
        return f35227c;
    }

    public static Spliterator e() {
        return f35225a;
    }

    public static AbstractC3734s f(F f6) {
        Objects.requireNonNull(f6);
        return new U(f6);
    }

    public static AbstractC3867w g(I i10) {
        Objects.requireNonNull(i10);
        return new S(i10);
    }

    public static A h(L l10) {
        Objects.requireNonNull(l10);
        return new T(l10);
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new Q(spliterator);
    }

    public static F j(double[] dArr, int i10, int i11) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i10, i11);
        return new W(dArr, i10, i11, 1040);
    }

    public static I k(int[] iArr, int i10, int i11) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i10, i11);
        return new b0(iArr, i10, i11, 1040);
    }

    public static L l(long[] jArr, int i10, int i11) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i10, i11);
        return new d0(jArr, i10, i11, 1040);
    }

    public static Spliterator m(Object[] objArr, int i10, int i11) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i10, i11);
        return new V(objArr, i10, i11, 1040);
    }

    public static Spliterator n(Iterator it) {
        return new c0((Iterator) Objects.requireNonNull(it));
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i10) {
        return new c0((java.util.Collection) Objects.requireNonNull(collection), i10);
    }
}
