package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.AbstractC3699b;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.F;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class x implements r {

    /* renamed from: f  reason: collision with root package name */
    private static final w f35146f = w.j(1, 7);

    /* renamed from: g  reason: collision with root package name */
    private static final w f35147g = w.k(0, 4, 6);

    /* renamed from: h  reason: collision with root package name */
    private static final w f35148h = w.k(0, 52, 54);

    /* renamed from: i  reason: collision with root package name */
    private static final w f35149i = w.k(1, 52, 53);

    /* renamed from: a  reason: collision with root package name */
    private final String f35150a;

    /* renamed from: b  reason: collision with root package name */
    private final y f35151b;

    /* renamed from: c  reason: collision with root package name */
    private final u f35152c;

    /* renamed from: d  reason: collision with root package name */
    private final u f35153d;

    /* renamed from: e  reason: collision with root package name */
    private final w f35154e;

    private x(String str, y yVar, u uVar, u uVar2, w wVar) {
        this.f35150a = str;
        this.f35151b = yVar;
        this.f35152c = uVar;
        this.f35153d = uVar2;
        this.f35154e = wVar;
    }

    private static int a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    private int b(TemporalAccessor temporalAccessor) {
        return q.h(temporalAccessor.p(a.DAY_OF_WEEK) - this.f35151b.e().getValue()) + 1;
    }

    private int c(TemporalAccessor temporalAccessor) {
        int b10 = b(temporalAccessor);
        int p10 = temporalAccessor.p(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int p11 = temporalAccessor.p(aVar);
        int m10 = m(p11, b10);
        int a5 = a(m10, p11);
        if (a5 == 0) {
            return p10 - 1;
        }
        return a5 >= a(m10, this.f35151b.f() + ((int) temporalAccessor.s(aVar).d())) ? p10 + 1 : p10;
    }

    private int d(TemporalAccessor temporalAccessor) {
        int b10 = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int p10 = temporalAccessor.p(aVar);
        int m10 = m(p10, b10);
        int a5 = a(m10, p10);
        if (a5 == 0) {
            return d(AbstractC3699b.p(temporalAccessor).q(temporalAccessor).H(p10, b.DAYS));
        }
        if (a5 <= 50) {
            return a5;
        }
        int a10 = a(m10, this.f35151b.f() + ((int) temporalAccessor.s(aVar).d()));
        return a5 >= a10 ? (a5 - a10) + 1 : a5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x e(y yVar) {
        return new x("DayOfWeek", yVar, b.DAYS, b.WEEKS, f35146f);
    }

    private ChronoLocalDate f(j$.time.chrono.k kVar, int i10, int i11, int i12) {
        ChronoLocalDate D6 = kVar.D(i10, 1, 1);
        int m10 = m(1, b(D6));
        int i13 = i12 - 1;
        return D6.mo88e(((Math.min(i11, a(m10, this.f35151b.f() + D6.J()) - 1) - 1) * 7) + i13 + (-m10), (u) b.DAYS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x h(y yVar) {
        return new x("WeekBasedYear", yVar, j.f35126d, b.FOREVER, a.YEAR.p());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x i(y yVar) {
        return new x("WeekOfMonth", yVar, b.WEEKS, b.MONTHS, f35147g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x j(y yVar) {
        return new x("WeekOfWeekBasedYear", yVar, b.WEEKS, j.f35126d, f35149i);
    }

    private w k(TemporalAccessor temporalAccessor, a aVar) {
        int m10 = m(temporalAccessor.p(aVar), b(temporalAccessor));
        w s10 = temporalAccessor.s(aVar);
        return w.j(a(m10, (int) s10.e()), a(m10, (int) s10.d()));
    }

    private w l(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.f(aVar)) {
            return f35148h;
        }
        int b10 = b(temporalAccessor);
        int p10 = temporalAccessor.p(aVar);
        int m10 = m(p10, b10);
        int a5 = a(m10, p10);
        if (a5 == 0) {
            return l(AbstractC3699b.p(temporalAccessor).q(temporalAccessor).H(p10 + 7, b.DAYS));
        }
        int d10 = (int) temporalAccessor.s(aVar).d();
        int a10 = a(m10, this.f35151b.f() + d10);
        return a5 >= a10 ? l(AbstractC3699b.p(temporalAccessor).q(temporalAccessor).mo88e((d10 - p10) + 8, (u) b.DAYS)) : w.j(1L, a10 - 1);
    }

    private int m(int i10, int i11) {
        int h10 = q.h(i10 - i11);
        return h10 + 1 > this.f35151b.f() ? 7 - h10 : -h10;
    }

    @Override // j$.time.temporal.r
    public final m A(m mVar, long j6) {
        r rVar;
        r rVar2;
        int a5 = this.f35154e.a(j6, this);
        int p10 = mVar.p(this);
        if (a5 == p10) {
            return mVar;
        }
        if (this.f35153d != b.FOREVER) {
            return mVar.mo88e(a5 - p10, this.f35152c);
        }
        y yVar = this.f35151b;
        rVar = yVar.f35159c;
        int p11 = mVar.p(rVar);
        rVar2 = yVar.f35161e;
        return f(AbstractC3699b.p(mVar), (int) j6, mVar.p(rVar2), p11);
    }

    @Override // j$.time.temporal.r
    public final w L(TemporalAccessor temporalAccessor) {
        b bVar = b.WEEKS;
        u uVar = this.f35153d;
        if (uVar == bVar) {
            return this.f35154e;
        }
        if (uVar == b.MONTHS) {
            return k(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (uVar == b.YEARS) {
            return k(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (uVar == y.f35156h) {
            return l(temporalAccessor);
        }
        if (uVar == b.FOREVER) {
            return a.YEAR.p();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + uVar + ", this: " + this);
    }

    @Override // j$.time.temporal.r
    public final boolean g() {
        return true;
    }

    @Override // j$.time.temporal.r
    public final w p() {
        return this.f35154e;
    }

    @Override // j$.time.temporal.r
    public final boolean r() {
        return false;
    }

    @Override // j$.time.temporal.r
    public final TemporalAccessor s(HashMap hashMap, TemporalAccessor temporalAccessor, F f6) {
        long longValue;
        Object obj;
        Object obj2;
        r rVar;
        Object obj3;
        r rVar2;
        ChronoLocalDate chronoLocalDate;
        Object obj4;
        Object obj5;
        r rVar3;
        Object obj6;
        r rVar4;
        Object obj7;
        ChronoLocalDate chronoLocalDate2;
        ChronoLocalDate chronoLocalDate3;
        a aVar;
        int j6 = j$.com.android.tools.r8.a.j(((Long) hashMap.get(this)).longValue());
        u uVar = b.WEEKS;
        w wVar = this.f35154e;
        y yVar = this.f35151b;
        u uVar2 = this.f35153d;
        if (uVar2 == uVar) {
            hashMap.remove(this);
            hashMap.put(a.DAY_OF_WEEK, Long.valueOf(q.h((wVar.a(longValue, this) - 1) + (yVar.e().getValue() - 1)) + 1));
        } else {
            a aVar2 = a.DAY_OF_WEEK;
            if (hashMap.containsKey(aVar2)) {
                int h10 = q.h(aVar2.O(((Long) hashMap.get(aVar2)).longValue()) - yVar.e().getValue()) + 1;
                j$.time.chrono.k p10 = AbstractC3699b.p(temporalAccessor);
                a aVar3 = a.YEAR;
                if (hashMap.containsKey(aVar3)) {
                    int O10 = aVar3.O(((Long) hashMap.get(aVar3)).longValue());
                    u uVar3 = b.MONTHS;
                    if (uVar2 == uVar3) {
                        Object obj8 = a.MONTH_OF_YEAR;
                        if (hashMap.containsKey(obj8)) {
                            long longValue2 = ((Long) hashMap.get(obj8)).longValue();
                            long j10 = j6;
                            if (f6 == F.LENIENT) {
                                ChronoLocalDate mo88e = p10.D(O10, 1, 1).mo88e(j$.com.android.tools.r8.a.r(longValue2, 1L), uVar3);
                                int b10 = b(mo88e);
                                int p11 = mo88e.p(a.DAY_OF_MONTH);
                                chronoLocalDate3 = mo88e.mo88e(j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.q(j$.com.android.tools.r8.a.r(j10, a(m(p11, b10), p11)), 7), h10 - b(mo88e)), b.DAYS);
                                aVar = obj8;
                            } else {
                                aVar = obj8;
                                ChronoLocalDate D6 = p10.D(O10, aVar.O(longValue2), 1);
                                int b11 = b(D6);
                                int p12 = D6.p(a.DAY_OF_MONTH);
                                ChronoLocalDate mo88e2 = D6.mo88e((((int) (wVar.a(j10, this) - a(m(p12, b11), p12))) * 7) + (h10 - b(D6)), b.DAYS);
                                if (f6 == F.STRICT && mo88e2.w(aVar) != longValue2) {
                                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                                }
                                chronoLocalDate3 = mo88e2;
                            }
                            hashMap.remove(this);
                            hashMap.remove(aVar3);
                            hashMap.remove(aVar);
                            hashMap.remove(aVar2);
                            return chronoLocalDate3;
                        }
                    }
                    if (uVar2 == b.YEARS) {
                        long j11 = j6;
                        ChronoLocalDate D10 = p10.D(O10, 1, 1);
                        if (f6 == F.LENIENT) {
                            int b12 = b(D10);
                            int p13 = D10.p(a.DAY_OF_YEAR);
                            chronoLocalDate2 = D10.mo88e(j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.q(j$.com.android.tools.r8.a.r(j11, a(m(p13, b12), p13)), 7), h10 - b(D10)), b.DAYS);
                        } else {
                            int b13 = b(D10);
                            int p14 = D10.p(a.DAY_OF_YEAR);
                            ChronoLocalDate mo88e3 = D10.mo88e((((int) (wVar.a(j11, this) - a(m(p14, b13), p14))) * 7) + (h10 - b(D10)), b.DAYS);
                            if (f6 == F.STRICT && mo88e3.w(aVar3) != O10) {
                                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                            }
                            chronoLocalDate2 = mo88e3;
                        }
                        hashMap.remove(this);
                        hashMap.remove(aVar3);
                        hashMap.remove(aVar2);
                        return chronoLocalDate2;
                    }
                } else if (uVar2 == y.f35156h || uVar2 == b.FOREVER) {
                    obj = yVar.f35162f;
                    if (hashMap.containsKey(obj)) {
                        obj2 = yVar.f35161e;
                        if (hashMap.containsKey(obj2)) {
                            rVar = yVar.f35162f;
                            w wVar2 = ((x) rVar).f35154e;
                            obj3 = yVar.f35162f;
                            long longValue3 = ((Long) hashMap.get(obj3)).longValue();
                            rVar2 = yVar.f35162f;
                            int a5 = wVar2.a(longValue3, rVar2);
                            if (f6 == F.LENIENT) {
                                ChronoLocalDate f10 = f(p10, a5, 1, h10);
                                obj7 = yVar.f35161e;
                                chronoLocalDate = f10.mo88e(j$.com.android.tools.r8.a.r(((Long) hashMap.get(obj7)).longValue(), 1L), uVar);
                            } else {
                                rVar3 = yVar.f35161e;
                                w wVar3 = ((x) rVar3).f35154e;
                                obj6 = yVar.f35161e;
                                long longValue4 = ((Long) hashMap.get(obj6)).longValue();
                                rVar4 = yVar.f35161e;
                                ChronoLocalDate f11 = f(p10, a5, wVar3.a(longValue4, rVar4), h10);
                                if (f6 == F.STRICT && c(f11) != a5) {
                                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                                }
                                chronoLocalDate = f11;
                            }
                            hashMap.remove(this);
                            obj4 = yVar.f35162f;
                            hashMap.remove(obj4);
                            obj5 = yVar.f35161e;
                            hashMap.remove(obj5);
                            hashMap.remove(aVar2);
                            return chronoLocalDate;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final String toString() {
        String yVar = this.f35151b.toString();
        return this.f35150a + "[" + yVar + "]";
    }

    @Override // j$.time.temporal.r
    public final long w(TemporalAccessor temporalAccessor) {
        int c10;
        b bVar = b.WEEKS;
        u uVar = this.f35153d;
        if (uVar == bVar) {
            c10 = b(temporalAccessor);
        } else if (uVar == b.MONTHS) {
            int b10 = b(temporalAccessor);
            int p10 = temporalAccessor.p(a.DAY_OF_MONTH);
            return a(m(p10, b10), p10);
        } else if (uVar == b.YEARS) {
            int b11 = b(temporalAccessor);
            int p11 = temporalAccessor.p(a.DAY_OF_YEAR);
            return a(m(p11, b11), p11);
        } else if (uVar == y.f35156h) {
            c10 = d(temporalAccessor);
        } else if (uVar != b.FOREVER) {
            throw new IllegalStateException("unreachable, rangeUnit: " + uVar + ", this: " + this);
        } else {
            c10 = c(temporalAccessor);
        }
        return c10;
    }

    @Override // j$.time.temporal.r
    public final boolean z(TemporalAccessor temporalAccessor) {
        a aVar;
        if (temporalAccessor.f(a.DAY_OF_WEEK)) {
            b bVar = b.WEEKS;
            u uVar = this.f35153d;
            if (uVar == bVar) {
                return true;
            }
            if (uVar == b.MONTHS) {
                aVar = a.DAY_OF_MONTH;
            } else if (uVar == b.YEARS || uVar == y.f35156h) {
                aVar = a.DAY_OF_YEAR;
            } else if (uVar != b.FOREVER) {
                return false;
            } else {
                aVar = a.YEAR;
            }
            return temporalAccessor.f(aVar);
        }
        return false;
    }
}
