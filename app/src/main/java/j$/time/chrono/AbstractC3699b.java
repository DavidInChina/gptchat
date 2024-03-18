package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;

/* renamed from: j$.time.chrono.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3699b {
    public static j$.time.temporal.m a(ChronoLocalDate chronoLocalDate, j$.time.temporal.m mVar) {
        return mVar.d(chronoLocalDate.toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
        int compare = Long.compare(chronoLocalDate.toEpochDay(), chronoLocalDate2.toEpochDay());
        if (compare == 0) {
            return ((AbstractC3698a) chronoLocalDate.a()).getId().compareTo(chronoLocalDate2.a().getId());
        }
        return compare;
    }

    public static int c(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.c().compareTo(chronoLocalDateTime2.c());
        if (compareTo == 0) {
            int compareTo2 = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return ((AbstractC3698a) chronoLocalDateTime.a()).getId().compareTo(chronoLocalDateTime2.a().getId());
        }
        return compareTo;
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.N(), chronoZonedDateTime2.N());
        if (compare == 0) {
            int S = chronoZonedDateTime.b().S() - chronoZonedDateTime2.b().S();
            if (S != 0) {
                return S;
            }
            int compareTo = chronoZonedDateTime.C().compareTo(chronoZonedDateTime2.C());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = chronoZonedDateTime.u().getId().compareTo(chronoZonedDateTime2.u().getId());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return ((AbstractC3698a) chronoZonedDateTime.a()).getId().compareTo(chronoZonedDateTime2.a().getId());
        }
        return compare;
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = AbstractC3705h.f34922a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                throw new DateTimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return i10 != 2 ? chronoZonedDateTime.C().p(rVar) : chronoZonedDateTime.k().T();
        }
        return j$.time.temporal.q.a(chronoZonedDateTime, rVar);
    }

    public static int f(l lVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? lVar.getValue() : j$.time.temporal.q.a(lVar, aVar);
    }

    public static long g(l lVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
        }
        return rVar.w(lVar);
    }

    public static boolean h(ChronoLocalDate chronoLocalDate, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar.g() : rVar != null && rVar.z(chronoLocalDate);
    }

    public static boolean i(l lVar, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.ERA : rVar != null && rVar.z(lVar);
    }

    public static Object j(ChronoLocalDate chronoLocalDate, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.q.l() || tVar == j$.time.temporal.q.k() || tVar == j$.time.temporal.q.i() || tVar == j$.time.temporal.q.g()) {
            return null;
        }
        return tVar == j$.time.temporal.q.e() ? chronoLocalDate.a() : tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.DAYS : tVar.a(chronoLocalDate);
    }

    public static Object k(ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.q.l() || tVar == j$.time.temporal.q.k() || tVar == j$.time.temporal.q.i()) {
            return null;
        }
        return tVar == j$.time.temporal.q.g() ? chronoLocalDateTime.b() : tVar == j$.time.temporal.q.e() ? chronoLocalDateTime.a() : tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.NANOS : tVar.a(chronoLocalDateTime);
    }

    public static Object l(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.q.k() || tVar == j$.time.temporal.q.l()) ? chronoZonedDateTime.u() : tVar == j$.time.temporal.q.i() ? chronoZonedDateTime.k() : tVar == j$.time.temporal.q.g() ? chronoZonedDateTime.b() : tVar == j$.time.temporal.q.e() ? chronoZonedDateTime.a() : tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.NANOS : tVar.a(chronoZonedDateTime);
    }

    public static Object m(l lVar, j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.ERAS : j$.time.temporal.q.c(lVar, tVar);
    }

    public static long n(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.c().toEpochDay() * 86400) + chronoLocalDateTime.b().f0()) - zoneOffset.T();
    }

    public static long o(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().toEpochDay() * 86400) + chronoZonedDateTime.b().f0()) - chronoZonedDateTime.k().T();
    }

    public static k p(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object obj = (k) temporalAccessor.z(j$.time.temporal.q.e());
        r rVar = r.f34946d;
        if (obj == null) {
            obj = Objects.requireNonNull(rVar, "defaultObj");
        }
        return (k) obj;
    }
}
