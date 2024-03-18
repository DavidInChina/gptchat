package j$.com.android.tools.r8;

import j$.time.format.H;
import j$.util.Objects;
import j$.util.concurrent.u;
import j$.util.function.b;
import j$.util.function.e;
import j$.util.function.f;
import j$.util.function.g;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static g a(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 0);
    }

    public static u b(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new u(biFunction, function);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b c(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d10) {
                DoubleConsumer.this.accept(d10);
                doubleConsumer2.accept(d10);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.c(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e d(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                IntConsumer.this.accept(i10);
                intConsumer2.accept(i10);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.d(this, intConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f e(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.LongConsumer
            public final void accept(long j6) {
                LongConsumer.this.accept(j6);
                longConsumer2.accept(j6);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.e(this, longConsumer3);
            }
        };
    }

    public static j$.util.function.a f(Predicate predicate) {
        return new j$.util.function.a(predicate, 2);
    }

    public static g g(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 1);
    }

    public static void i(HashMap hashMap, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getMonths().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (int i10 = 1; i10 < length; i10++) {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL", locale);
            simpleDateFormat.setTimeZone(timeZone);
            Calendar calendar = Calendar.getInstance();
            calendar.set(0, i10, 0);
            String format = simpleDateFormat.format(calendar.getTime());
            long j6 = i10;
            linkedHashMap.put(Long.valueOf(j6), format);
            linkedHashMap2.put(Long.valueOf(j6), format.substring(0, Character.charCount(format.codePointAt(0))));
            TimeZone timeZone2 = TimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("LLL", locale);
            simpleDateFormat2.setTimeZone(timeZone2);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(0, i10, 0);
            linkedHashMap3.put(Long.valueOf(j6), simpleDateFormat2.format(calendar2.getTime()));
        }
        if (length > 0) {
            long j10 = length;
            linkedHashMap.put(Long.valueOf(j10), "");
            linkedHashMap2.put(Long.valueOf(j10), "");
            linkedHashMap3.put(Long.valueOf(j10), "");
            hashMap.put(H.FULL_STANDALONE, linkedHashMap);
            hashMap.put(H.NARROW_STANDALONE, linkedHashMap2);
            hashMap.put(H.SHORT_STANDALONE, linkedHashMap3);
        }
    }

    public static /* synthetic */ int j(long j6) {
        int i10 = (int) j6;
        if (j6 == i10) {
            return i10;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long k(long j6, long j10) {
        long j11 = j6 + j10;
        boolean z10 = false;
        boolean z11 = (j10 ^ j6) < 0;
        if ((j6 ^ j11) >= 0) {
            z10 = true;
        }
        if (z11 || z10) {
            return j11;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry l(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List m(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean n(Unsafe unsafe, Object obj, long j6, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j6, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j6) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long o(long j6, long j10) {
        long j11 = j6 % j10;
        if (j11 == 0) {
            return 0L;
        }
        return (((j6 ^ j10) >> 63) | 1) > 0 ? j11 : j11 + j10;
    }

    public static /* synthetic */ long p(long j6, long j10) {
        long j11 = j6 / j10;
        return (j6 - (j10 * j11) != 0 && (((j6 ^ j10) >> 63) | 1) < 0) ? j11 - 1 : j11;
    }

    public static /* synthetic */ long q(long j6, long j10) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6);
        if (numberOfLeadingZeros > 65) {
            return j6 * j10;
        }
        if (numberOfLeadingZeros >= 64) {
            int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
            boolean z10 = false;
            boolean z11 = i10 >= 0;
            if (j10 != Long.MIN_VALUE) {
                z10 = true;
            }
            if (z10 | z11) {
                long j11 = j6 * j10;
                if (i10 == 0 || j11 / j6 == j10) {
                    return j11;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long r(long j6, long j10) {
        long j11 = j6 - j10;
        boolean z10 = false;
        boolean z11 = (j10 ^ j6) >= 0;
        if ((j6 ^ j11) >= 0) {
            z10 = true;
        }
        if (z11 || z10) {
            return j11;
        }
        throw new ArithmeticException();
    }
}
