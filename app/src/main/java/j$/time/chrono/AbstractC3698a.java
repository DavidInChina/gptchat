package j$.time.chrono;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import j$.time.DateTimeException;
import j$.time.LocalDateTime;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;

/* renamed from: j$.time.chrono.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3698a implements k {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f34910a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f34911b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f34912c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(HashMap hashMap, j$.time.temporal.a aVar, long j6) {
        Long l10 = (Long) hashMap.get(aVar);
        if (l10 == null || l10.longValue() == j6) {
            hashMap.put(aVar, Long.valueOf(j6));
            return;
        }
        throw new DateTimeException("Conflict found: " + aVar + Separators.SP + l10 + " differs from " + aVar + Separators.SP + j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k r(String str) {
        Objects.requireNonNull(str, ParameterNames.ID);
        while (true) {
            ConcurrentHashMap concurrentHashMap = f34910a;
            k kVar = (k) concurrentHashMap.get(str);
            if (kVar == null) {
                kVar = (k) f34911b.get(str);
            }
            if (kVar != null) {
                return kVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(k.class).iterator();
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    if (str.equals(kVar2.getId()) || str.equals(kVar2.v())) {
                        return kVar2;
                    }
                    while (it.hasNext()) {
                    }
                }
                throw new DateTimeException("Unknown chronology: " + str);
            }
            n nVar = n.f34928o;
            s(nVar, nVar.getId());
            u uVar = u.f34949d;
            s(uVar, uVar.getId());
            z zVar = z.f34961d;
            s(zVar, zVar.getId());
            F f6 = F.f34906d;
            s(f6, f6.getId());
            Iterator it2 = ServiceLoader.load(AbstractC3698a.class, null).iterator();
            while (it2.hasNext()) {
                AbstractC3698a abstractC3698a = (AbstractC3698a) it2.next();
                if (!abstractC3698a.getId().equals("ISO")) {
                    s(abstractC3698a, abstractC3698a.getId());
                }
            }
            r rVar = r.f34946d;
            s(rVar, rVar.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k s(AbstractC3698a abstractC3698a, String str) {
        String v10;
        k kVar = (k) f34910a.putIfAbsent(str, abstractC3698a);
        if (kVar == null && (v10 = abstractC3698a.v()) != null) {
            f34911b.putIfAbsent(v10, abstractC3698a);
        }
        return kVar;
    }

    static ChronoLocalDate w(ChronoLocalDate chronoLocalDate, long j6, long j10, long j11) {
        long j12;
        ChronoLocalDate mo88e = chronoLocalDate.mo88e(j6, (j$.time.temporal.u) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        ChronoLocalDate mo88e2 = mo88e.mo88e(j10, (j$.time.temporal.u) bVar);
        if (j11 <= 7) {
            if (j11 < 1) {
                mo88e2 = mo88e2.mo88e(j$.com.android.tools.r8.a.r(j11, 7L) / 7, (j$.time.temporal.u) bVar);
                j12 = j11 + 6;
            }
            return mo88e2.m(new j$.time.temporal.o(j$.time.c.L((int) j11).getValue(), 0));
        }
        j12 = j11 - 1;
        mo88e2 = mo88e2.mo88e(j12 / 7, (j$.time.temporal.u) bVar);
        j11 = (j12 % 7) + 1;
        return mo88e2.m(new j$.time.temporal.o(j$.time.c.L((int) j11).getValue(), 0));
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [j$.time.temporal.n, java.lang.Object] */
    ChronoLocalDate A(HashMap hashMap, j$.time.format.F f6) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a5 = F(aVar).a(((Long) hashMap.remove(aVar)).longValue(), aVar);
        if (f6 == j$.time.format.F.LENIENT) {
            long r10 = j$.com.android.tools.r8.a.r(((Long) hashMap.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return D(a5, 1, 1).mo88e(r10, (j$.time.temporal.u) j$.time.temporal.b.MONTHS).mo88e(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a10 = F(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a11 = F(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
        if (f6 != j$.time.format.F.SMART) {
            return D(a5, a10, a11);
        }
        try {
            return D(a5, a10, a11);
        } catch (DateTimeException unused) {
            return D(a5, a10, 1).m(new Object());
        }
    }

    ChronoLocalDate L(HashMap hashMap, j$.time.format.F f6) {
        j$.time.temporal.a aVar;
        l lVar;
        long j6;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l10 = (Long) hashMap.remove(aVar2);
        if (l10 == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (!hashMap.containsKey(aVar3)) {
                return null;
            }
            F(aVar3).b(((Long) hashMap.get(aVar3)).longValue(), aVar3);
            return null;
        }
        Long l11 = (Long) hashMap.remove(j$.time.temporal.a.ERA);
        int a5 = f6 != j$.time.format.F.LENIENT ? F(aVar2).a(l10.longValue(), aVar2) : j$.com.android.tools.r8.a.j(l10.longValue());
        if (l11 != null) {
            g(hashMap, j$.time.temporal.a.YEAR, i(M(F(aVar).a(l11.longValue(), aVar)), a5));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (hashMap.containsKey(aVar4)) {
            lVar = x(F(aVar4).a(((Long) hashMap.get(aVar4)).longValue(), aVar4), 1).B();
        } else if (f6 == j$.time.format.F.STRICT) {
            hashMap.put(aVar2, l10);
            return null;
        } else {
            List I10 = I();
            if (I10.isEmpty()) {
                j6 = a5;
                g(hashMap, aVar4, j6);
                return null;
            }
            lVar = (l) I10.get(I10.size() - 1);
        }
        j6 = i(lVar, a5);
        g(hashMap, aVar4, j6);
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((k) obj).getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC3698a) && getId().compareTo(((AbstractC3698a) obj).getId()) == 0;
    }

    @Override // j$.time.chrono.k
    public ChronoLocalDate h(HashMap hashMap, j$.time.format.F f6) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (hashMap.containsKey(aVar)) {
            return n(((Long) hashMap.remove(aVar)).longValue());
        }
        z(hashMap, f6);
        ChronoLocalDate L10 = L(hashMap, f6);
        if (L10 != null) {
            return L10;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!hashMap.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (hashMap.containsKey(aVar3)) {
            if (hashMap.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return A(hashMap, f6);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (hashMap.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (hashMap.containsKey(aVar5)) {
                    int a5 = F(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                    if (f6 == j$.time.format.F.LENIENT) {
                        long r10 = j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar3)).longValue(), 1L);
                        long r11 = j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar4)).longValue(), 1L);
                        return D(a5, 1, 1).mo88e(r10, (j$.time.temporal.u) j$.time.temporal.b.MONTHS).mo88e(r11, (j$.time.temporal.u) j$.time.temporal.b.WEEKS).mo88e(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar5)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                    }
                    int a10 = F(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                    int a11 = F(aVar4).a(((Long) hashMap.remove(aVar4)).longValue(), aVar4);
                    ChronoLocalDate mo88e = D(a5, a10, 1).mo88e((F(aVar5).a(((Long) hashMap.remove(aVar5)).longValue(), aVar5) - 1) + ((a11 - 1) * 7), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                    if (f6 == j$.time.format.F.STRICT && mo88e.p(aVar3) != a10) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    return mo88e;
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (hashMap.containsKey(aVar6)) {
                    int a12 = F(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                    if (f6 == j$.time.format.F.LENIENT) {
                        return w(D(a12, 1, 1), j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar3)).longValue(), 1L), j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar4)).longValue(), 1L), j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar6)).longValue(), 1L));
                    }
                    int a13 = F(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                    ChronoLocalDate m10 = D(a12, a13, 1).mo88e((F(aVar4).a(((Long) hashMap.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.u) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(j$.time.c.L(F(aVar6).a(((Long) hashMap.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (f6 == j$.time.format.F.STRICT && m10.p(aVar3) != a13) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    return m10;
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (hashMap.containsKey(aVar7)) {
            int a14 = F(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
            if (f6 != j$.time.format.F.LENIENT) {
                return x(a14, F(aVar7).a(((Long) hashMap.remove(aVar7)).longValue(), aVar7));
            }
            return x(a14, 1).mo88e(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar7)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!hashMap.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (hashMap.containsKey(aVar9)) {
            int a15 = F(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
            if (f6 == j$.time.format.F.LENIENT) {
                long r12 = j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar8)).longValue(), 1L);
                return x(a15, 1).mo88e(r12, (j$.time.temporal.u) j$.time.temporal.b.WEEKS).mo88e(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar9)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
            }
            int a16 = F(aVar8).a(((Long) hashMap.remove(aVar8)).longValue(), aVar8);
            ChronoLocalDate mo88e2 = x(a15, 1).mo88e((F(aVar9).a(((Long) hashMap.remove(aVar9)).longValue(), aVar9) - 1) + ((a16 - 1) * 7), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
            if (f6 == j$.time.format.F.STRICT && mo88e2.p(aVar2) != a15) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            return mo88e2;
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!hashMap.containsKey(aVar10)) {
            return null;
        }
        int a17 = F(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
        if (f6 == j$.time.format.F.LENIENT) {
            return w(x(a17, 1), 0L, j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar10)).longValue(), 1L));
        }
        ChronoLocalDate m11 = x(a17, 1).mo88e((F(aVar8).a(((Long) hashMap.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.u) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(j$.time.c.L(F(aVar10).a(((Long) hashMap.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (f6 == j$.time.format.F.STRICT && m11.p(aVar2) != a17) {
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        return m11;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public abstract /* synthetic */ ChronoLocalDate p();

    @Override // j$.time.chrono.k
    public ChronoLocalDateTime t(LocalDateTime localDateTime) {
        try {
            return q(localDateTime).y(j$.time.i.P(localDateTime));
        } catch (DateTimeException e10) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e10);
        }
    }

    public final String toString() {
        return getId();
    }

    void z(HashMap hashMap, j$.time.format.F f6) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l10 = (Long) hashMap.remove(aVar);
        if (l10 != null) {
            if (f6 != j$.time.format.F.LENIENT) {
                aVar.P(l10.longValue());
            }
            ChronoLocalDate d10 = p().d(1L, (j$.time.temporal.r) j$.time.temporal.a.DAY_OF_MONTH).d(l10.longValue(), (j$.time.temporal.r) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            g(hashMap, aVar2, d10.p(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            g(hashMap, aVar3, d10.p(aVar3));
        }
    }
}
