package j$.util;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.List;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.p  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3732p {
    public static void a(F f6, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f6.forEachRemaining((DoubleConsumer) consumer);
        } else if (f0.f35345a) {
            f0.a(f6.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            f6.forEachRemaining((DoubleConsumer) new C3731o(consumer));
        }
    }

    public static void b(I i10, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            i10.forEachRemaining((IntConsumer) consumer);
        } else if (f0.f35345a) {
            f0.a(i10.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            i10.forEachRemaining((IntConsumer) new C3864t(consumer));
        }
    }

    public static void c(L l10, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            l10.forEachRemaining((LongConsumer) consumer);
        } else if (f0.f35345a) {
            f0.a(l10.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            l10.forEachRemaining((LongConsumer) new C3868x(consumer));
        }
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i10) {
        return (spliterator.characteristics() & i10) == i10;
    }

    public static boolean f(F f6, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return f6.tryAdvance((DoubleConsumer) consumer);
        }
        if (!f0.f35345a) {
            Objects.requireNonNull(consumer);
            return f6.tryAdvance((DoubleConsumer) new C3731o(consumer));
        }
        f0.a(f6.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static boolean g(I i10, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return i10.tryAdvance((IntConsumer) consumer);
        }
        if (!f0.f35345a) {
            Objects.requireNonNull(consumer);
            return i10.tryAdvance((IntConsumer) new C3864t(consumer));
        }
        f0.a(i10.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static boolean h(L l10, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return l10.tryAdvance((LongConsumer) consumer);
        }
        if (!f0.f35345a) {
            Objects.requireNonNull(consumer);
            return l10.tryAdvance((LongConsumer) new C3868x(consumer));
        }
        f0.a(l10.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public static C3727k i(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? C3727k.d(optional.get()) : C3727k.a();
    }

    public static C3728l j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C3728l.d(optionalDouble.getAsDouble()) : C3728l.a();
    }

    public static C3729m k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C3729m.d(optionalInt.getAsInt()) : C3729m.a();
    }

    public static C3730n l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C3730n.d(optionalLong.getAsLong()) : C3730n.a();
    }

    public static Optional m(C3727k c3727k) {
        if (c3727k == null) {
            return null;
        }
        return c3727k.c() ? Optional.of(c3727k.b()) : Optional.empty();
    }

    public static OptionalDouble n(C3728l c3728l) {
        if (c3728l == null) {
            return null;
        }
        return c3728l.c() ? OptionalDouble.of(c3728l.b()) : OptionalDouble.empty();
    }

    public static OptionalInt o(C3729m c3729m) {
        if (c3729m == null) {
            return null;
        }
        return c3729m.c() ? OptionalInt.of(c3729m.b()) : OptionalInt.empty();
    }

    public static OptionalLong p(C3730n c3730n) {
        if (c3730n == null) {
            return null;
        }
        return c3730n.c() ? OptionalLong.of(c3730n.b()) : OptionalLong.empty();
    }

    public static void q(java.util.Collection collection, Consumer consumer) {
        if (collection instanceof Collection) {
            ((Collection) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    public static Spliterator r(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection) collection).mo48spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return Spliterators.spliterator((LinkedHashSet) collection, 17);
        }
        if (!(collection instanceof SortedSet)) {
            return collection instanceof java.util.Set ? Spliterators.spliterator((java.util.Set) collection, 1) : collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : Collection.CC.$default$spliterator(collection);
        }
        SortedSet sortedSet = (SortedSet) collection;
        return new C(sortedSet, sortedSet);
    }

    public static /* synthetic */ java.util.Comparator s(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    /* renamed from: trySplit */
    public Spliterator mo106trySplit() {
        return null;
    }
}
