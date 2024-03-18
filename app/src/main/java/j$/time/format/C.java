package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
class C {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f34972a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator f34973b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final C f34974c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f34975d = 0;

    private static Object b(j$.time.temporal.r rVar, Locale locale) {
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(rVar, locale);
        ConcurrentHashMap concurrentHashMap = f34972a;
        V v10 = concurrentHashMap.get(simpleImmutableEntry);
        if (v10 == 0) {
            HashMap hashMap = new HashMap();
            int i10 = 0;
            if (rVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                while (i10 < eras.length) {
                    if (!eras[i10].isEmpty()) {
                        long j6 = i10;
                        hashMap2.put(Long.valueOf(j6), eras[i10]);
                        hashMap3.put(Long.valueOf(j6), c(eras[i10]));
                    }
                    i10++;
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(H.FULL, hashMap2);
                    hashMap.put(H.SHORT, hashMap2);
                    hashMap.put(H.NARROW, hashMap3);
                }
                obj = new B(hashMap);
            } else if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                j$.com.android.tools.r8.a.i(hashMap, dateFormatSymbols2, locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] months = dateFormatSymbols2.getMonths();
                for (int i11 = 0; i11 < months.length; i11++) {
                    if (!months[i11].isEmpty()) {
                        long j10 = i11 + 1;
                        hashMap4.put(Long.valueOf(j10), months[i11]);
                        hashMap5.put(Long.valueOf(j10), c(months[i11]));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(H.FULL, hashMap4);
                    hashMap.put(H.NARROW, hashMap5);
                }
                HashMap hashMap6 = new HashMap();
                String[] shortMonths = dateFormatSymbols2.getShortMonths();
                while (i10 < shortMonths.length) {
                    if (!shortMonths[i10].isEmpty()) {
                        hashMap6.put(Long.valueOf(i10 + 1), shortMonths[i10]);
                    }
                    i10++;
                }
                if (!hashMap6.isEmpty()) {
                    hashMap.put(H.SHORT, hashMap6);
                }
                obj = new B(hashMap);
            } else if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap7 = new HashMap();
                String[] weekdays = dateFormatSymbols3.getWeekdays();
                hashMap7.put(1L, weekdays[2]);
                hashMap7.put(2L, weekdays[3]);
                hashMap7.put(3L, weekdays[4]);
                hashMap7.put(4L, weekdays[5]);
                hashMap7.put(5L, weekdays[6]);
                hashMap7.put(6L, weekdays[7]);
                hashMap7.put(7L, weekdays[1]);
                hashMap.put(H.FULL, hashMap7);
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, c(weekdays[2]));
                hashMap8.put(2L, c(weekdays[3]));
                hashMap8.put(3L, c(weekdays[4]));
                hashMap8.put(4L, c(weekdays[5]));
                hashMap8.put(5L, c(weekdays[6]));
                hashMap8.put(6L, c(weekdays[7]));
                hashMap8.put(7L, c(weekdays[1]));
                hashMap.put(H.NARROW, hashMap8);
                HashMap hashMap9 = new HashMap();
                String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
                hashMap9.put(1L, shortWeekdays[2]);
                hashMap9.put(2L, shortWeekdays[3]);
                hashMap9.put(3L, shortWeekdays[4]);
                hashMap9.put(4L, shortWeekdays[5]);
                hashMap9.put(5L, shortWeekdays[6]);
                hashMap9.put(6L, shortWeekdays[7]);
                hashMap9.put(7L, shortWeekdays[1]);
                hashMap.put(H.SHORT, hashMap9);
                obj = new B(hashMap);
            } else if (rVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap10 = new HashMap();
                HashMap hashMap11 = new HashMap();
                String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
                while (i10 < amPmStrings.length) {
                    if (!amPmStrings[i10].isEmpty()) {
                        long j11 = i10;
                        hashMap10.put(Long.valueOf(j11), amPmStrings[i10]);
                        hashMap11.put(Long.valueOf(j11), c(amPmStrings[i10]));
                    }
                    i10++;
                }
                if (!hashMap10.isEmpty()) {
                    hashMap.put(H.FULL, hashMap10);
                    hashMap.put(H.SHORT, hashMap10);
                    hashMap.put(H.NARROW, hashMap11);
                }
                obj = new B(hashMap);
            } else {
                obj = "";
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            return concurrentHashMap.get(simpleImmutableEntry);
        }
        return v10;
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C d() {
        return f34974c;
    }

    public String e(j$.time.chrono.k kVar, j$.time.temporal.r rVar, long j6, H h10, Locale locale) {
        if (kVar == j$.time.chrono.r.f34946d || !(rVar instanceof j$.time.temporal.a)) {
            return f(rVar, j6, h10, locale);
        }
        return null;
    }

    public String f(j$.time.temporal.r rVar, long j6, H h10, Locale locale) {
        Object b10 = b(rVar, locale);
        if (b10 instanceof B) {
            return ((B) b10).a(j6, h10);
        }
        return null;
    }

    public Iterator g(j$.time.chrono.k kVar, j$.time.temporal.r rVar, H h10, Locale locale) {
        if (kVar == j$.time.chrono.r.f34946d || !(rVar instanceof j$.time.temporal.a)) {
            return h(rVar, h10, locale);
        }
        return null;
    }

    public Iterator h(j$.time.temporal.r rVar, H h10, Locale locale) {
        Object b10 = b(rVar, locale);
        if (b10 instanceof B) {
            return ((B) b10).b(h10);
        }
        return null;
    }
}
