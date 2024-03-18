package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.format.F;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
abstract class h extends Enum implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f35119a = {0, 90, 181, 273, 0, 91, 182, 274};

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ h[] f35120b;

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final m A(m mVar, long j6) {
                long w10 = w(mVar);
                p().b(j6, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j6 - w10) + mVar.w(aVar), aVar);
            }

            @Override // j$.time.temporal.r
            public final w L(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    long w10 = temporalAccessor.w(h.QUARTER_OF_YEAR);
                    if (w10 == 1) {
                        return j$.time.chrono.r.f34946d.K(temporalAccessor.w(a.YEAR)) ? w.j(1L, 91L) : w.j(1L, 90L);
                    }
                    return w10 == 2 ? w.j(1L, 91L) : (w10 == 3 || w10 == 4) ? w.j(1L, 92L) : p();
                }
                throw new DateTimeException("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.r
            public final w p() {
                return w.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.r
            public final TemporalAccessor s(HashMap hashMap, TemporalAccessor temporalAccessor, F f6) {
                long j6;
                LocalDate localDate;
                a aVar = a.YEAR;
                Long l10 = (Long) hashMap.get(aVar);
                r rVar = h.QUARTER_OF_YEAR;
                Long l11 = (Long) hashMap.get(rVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int O10 = aVar.O(l10.longValue());
                long longValue = ((Long) hashMap.get(h.DAY_OF_QUARTER)).longValue();
                if (!j.a(temporalAccessor)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (f6 == F.LENIENT) {
                    localDate = LocalDate.of(O10, 1, 1).plusMonths(j$.com.android.tools.r8.a.q(j$.com.android.tools.r8.a.r(l11.longValue(), 1L), 3));
                    j6 = j$.com.android.tools.r8.a.r(longValue, 1L);
                } else {
                    LocalDate of2 = LocalDate.of(O10, ((rVar.p().a(l11.longValue(), rVar) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        (f6 == F.STRICT ? L(of2) : p()).b(longValue, this);
                    }
                    j6 = longValue - 1;
                    localDate = of2;
                }
                hashMap.remove(this);
                hashMap.remove(aVar);
                hashMap.remove(rVar);
                return localDate.a0(j6);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.r
            public final long w(TemporalAccessor temporalAccessor) {
                int[] iArr;
                if (z(temporalAccessor)) {
                    int p10 = temporalAccessor.p(a.DAY_OF_YEAR);
                    int p11 = temporalAccessor.p(a.MONTH_OF_YEAR);
                    long w10 = temporalAccessor.w(a.YEAR);
                    iArr = h.f35119a;
                    return p10 - iArr[((p11 - 1) / 3) + (j$.time.chrono.r.f34946d.K(w10) ? 4 : 0)];
                }
                throw new DateTimeException("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.r
            public final boolean z(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.DAY_OF_YEAR) && temporalAccessor.f(a.MONTH_OF_YEAR) && temporalAccessor.f(a.YEAR) && j.a(temporalAccessor);
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final m A(m mVar, long j6) {
                long w10 = w(mVar);
                p().b(j6, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j6 - w10) * 3) + mVar.w(aVar), aVar);
            }

            @Override // j$.time.temporal.r
            public final w L(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return p();
                }
                throw new DateTimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.r
            public final w p() {
                return w.j(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.r
            public final long w(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return (temporalAccessor.w(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new DateTimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.r
            public final boolean z(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.MONTH_OF_YEAR) && j.a(temporalAccessor);
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final m A(m mVar, long j6) {
                p().b(j6, this);
                return mVar.mo88e(j$.com.android.tools.r8.a.r(j6, w(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.r
            public final w L(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return h.S(LocalDate.P(temporalAccessor));
                }
                throw new DateTimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final w p() {
                return w.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.r
            public final TemporalAccessor s(HashMap hashMap, TemporalAccessor temporalAccessor, F f6) {
                LocalDate localDate;
                long j6;
                long j10;
                r rVar = h.WEEK_BASED_YEAR;
                Long l10 = (Long) hashMap.get(rVar);
                a aVar = a.DAY_OF_WEEK;
                Long l11 = (Long) hashMap.get(aVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int a5 = rVar.p().a(l10.longValue(), rVar);
                long longValue = ((Long) hashMap.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                if (!j.a(temporalAccessor)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate of2 = LocalDate.of(a5, 1, 4);
                if (f6 == F.LENIENT) {
                    long longValue2 = l11.longValue();
                    if (longValue2 > 7) {
                        j10 = longValue2 - 1;
                        of2 = of2.b0(j10 / 7);
                    } else {
                        j6 = 1;
                        if (longValue2 < 1) {
                            of2 = of2.b0(j$.com.android.tools.r8.a.r(longValue2, 7L) / 7);
                            j10 = longValue2 + 6;
                        }
                        localDate = of2.b0(j$.com.android.tools.r8.a.r(longValue, j6)).d(longValue2, aVar);
                    }
                    j6 = 1;
                    longValue2 = (j10 % 7) + 1;
                    localDate = of2.b0(j$.com.android.tools.r8.a.r(longValue, j6)).d(longValue2, aVar);
                } else {
                    int O10 = aVar.O(l11.longValue());
                    if (longValue < 1 || longValue > 52) {
                        (f6 == F.STRICT ? h.S(of2) : p()).b(longValue, this);
                    }
                    localDate = of2.b0(longValue - 1).d(O10, aVar);
                }
                hashMap.remove(this);
                hashMap.remove(rVar);
                hashMap.remove(aVar);
                return localDate;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.r
            public final long w(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return h.P(LocalDate.P(temporalAccessor));
                }
                throw new DateTimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final boolean z(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.EPOCH_DAY) && j.a(temporalAccessor);
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final m A(m mVar, long j6) {
                a aVar;
                LocalDate of2;
                int U10;
                if (z(mVar)) {
                    int a5 = a.YEAR.p().a(j6, h.WEEK_BASED_YEAR);
                    LocalDate P = LocalDate.P(mVar);
                    int p10 = P.p(a.DAY_OF_WEEK);
                    int P10 = h.P(P);
                    if (P10 == 53) {
                        U10 = h.U(a5);
                        if (U10 == 52) {
                            P10 = 52;
                        }
                    }
                    return mVar.r(LocalDate.of(a5, 1, 4).a0(((P10 - 1) * 7) + (p10 - of2.p(aVar))));
                }
                throw new DateTimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final w L(TemporalAccessor temporalAccessor) {
                if (z(temporalAccessor)) {
                    return a.YEAR.p();
                }
                throw new DateTimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final w p() {
                return a.YEAR.p();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.r
            public final long w(TemporalAccessor temporalAccessor) {
                int T;
                if (z(temporalAccessor)) {
                    T = h.T(LocalDate.P(temporalAccessor));
                    return T;
                }
                throw new DateTimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final boolean z(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.EPOCH_DAY) && j.a(temporalAccessor);
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f35120b = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(LocalDate localDate) {
        int ordinal = localDate.R().ordinal();
        int i10 = 1;
        int S = localDate.S() - 1;
        int i11 = (3 - ordinal) + S;
        int i12 = i11 - ((i11 / 7) * 7);
        int i13 = i12 - 3;
        if (i13 < -3) {
            i13 = i12 + 4;
        }
        if (S < i13) {
            return (int) w.j(1L, U(T(localDate.g0(180).c0(-1L)))).d();
        }
        int i14 = ((S - i13) / 7) + 1;
        if (i14 != 53 || i13 == -3 || (i13 == -2 && localDate.E())) {
            i10 = i14;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w S(LocalDate localDate) {
        return w.j(1L, U(T(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int T(LocalDate localDate) {
        int year = localDate.getYear();
        int S = localDate.S();
        if (S <= 3) {
            return S - localDate.R().ordinal() < -2 ? year - 1 : year;
        } else if (S < 363) {
            return year;
        } else {
            return ((S - 363) - (localDate.E() ? 1 : 0)) - localDate.R().ordinal() >= 0 ? year + 1 : year;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int U(int i10) {
        LocalDate of2 = LocalDate.of(i10, 1, 1);
        if (of2.R() != j$.time.c.THURSDAY) {
            return (of2.R() != j$.time.c.WEDNESDAY || !of2.E()) ? 52 : 53;
        }
        return 53;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f35120b.clone();
    }

    @Override // j$.time.temporal.r
    public final boolean g() {
        return true;
    }

    @Override // j$.time.temporal.r
    public final boolean r() {
        return false;
    }

    public /* synthetic */ TemporalAccessor s(HashMap hashMap, TemporalAccessor temporalAccessor, F f6) {
        return null;
    }
}
