package j$.time.format;

import android.gov.nist.core.Separators;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC3698a;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class E implements TemporalAccessor {

    /* renamed from: b  reason: collision with root package name */
    ZoneId f34989b;

    /* renamed from: c  reason: collision with root package name */
    j$.time.chrono.k f34990c;

    /* renamed from: d  reason: collision with root package name */
    private F f34991d;

    /* renamed from: e  reason: collision with root package name */
    private ChronoLocalDate f34992e;

    /* renamed from: f  reason: collision with root package name */
    private j$.time.i f34993f;

    /* renamed from: a  reason: collision with root package name */
    final HashMap f34988a = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    j$.time.p f34994g = j$.time.p.f35101d;

    private void A(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f34992e;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            ChronoLocalDate chronoLocalDate3 = this.f34992e;
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + chronoLocalDate3 + Separators.SP + chronoLocalDate);
        } else if (chronoLocalDate == null) {
        } else {
            if (((AbstractC3698a) this.f34990c).equals(chronoLocalDate.a())) {
                this.f34992e = chronoLocalDate;
                return;
            }
            j$.time.chrono.k kVar = this.f34990c;
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + kVar);
        }
    }

    private void D(j$.time.temporal.a aVar, j$.time.temporal.a aVar2, Long l10) {
        Long l11 = (Long) this.f34988a.put(aVar2, l10);
        if (l11 == null || l11.longValue() == l10.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + aVar2 + Separators.SP + l11 + " differs from " + aVar2 + Separators.SP + l10 + " while resolving  " + aVar);
    }

    private void h(TemporalAccessor temporalAccessor) {
        Iterator it = this.f34988a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.r rVar = (j$.time.temporal.r) entry.getKey();
            if (temporalAccessor.f(rVar)) {
                try {
                    long w10 = temporalAccessor.w(rVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (w10 != longValue) {
                        throw new DateTimeException("Conflict found: Field " + rVar + Separators.SP + w10 + " differs from " + rVar + Separators.SP + longValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void n() {
        HashMap hashMap = this.f34988a;
        if (hashMap.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f34989b;
            if (zoneId != null) {
                q(zoneId);
                return;
            }
            Long l10 = (Long) hashMap.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l10 == null) {
                return;
            }
            q(ZoneOffset.V(l10.intValue()));
        }
    }

    private void q(ZoneId zoneId) {
        HashMap hashMap = this.f34988a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        ChronoZonedDateTime G10 = this.f34990c.G(Instant.P(((Long) hashMap.remove(aVar)).longValue()), zoneId);
        A(G10.c());
        D(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(G10.b().f0()));
    }

    private void t(long j6, long j10, long j11, long j12) {
        j$.time.i V10;
        j$.time.p pVar;
        if (this.f34991d == F.LENIENT) {
            long k10 = j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.q(j6, 3600000000000L), j$.com.android.tools.r8.a.q(j10, 60000000000L)), j$.com.android.tools.r8.a.q(j11, 1000000000L)), j12);
            V10 = j$.time.i.W(j$.com.android.tools.r8.a.o(k10, 86400000000000L));
            pVar = j$.time.p.c((int) j$.com.android.tools.r8.a.p(k10, 86400000000000L));
        } else {
            int O10 = j$.time.temporal.a.MINUTE_OF_HOUR.O(j10);
            int O11 = j$.time.temporal.a.NANO_OF_SECOND.O(j12);
            if (this.f34991d == F.SMART && j6 == 24 && O10 == 0 && j11 == 0 && O11 == 0) {
                V10 = j$.time.i.f35086g;
                pVar = j$.time.p.c(1);
            } else {
                V10 = j$.time.i.V(j$.time.temporal.a.HOUR_OF_DAY.O(j6), O10, j$.time.temporal.a.SECOND_OF_MINUTE.O(j11), O11);
                pVar = j$.time.p.f35101d;
            }
        }
        x(V10, pVar);
    }

    private void v() {
        j$.time.temporal.a aVar;
        long j6;
        HashMap hashMap = this.f34988a;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        long j10 = 0;
        if (hashMap.containsKey(aVar2)) {
            long longValue = ((Long) hashMap.remove(aVar2)).longValue();
            F f6 = this.f34991d;
            if (f6 == F.STRICT || (f6 == F.SMART && longValue != 0)) {
                aVar2.P(longValue);
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            D(aVar2, aVar3, Long.valueOf(longValue));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(aVar4)) {
            long longValue2 = ((Long) hashMap.remove(aVar4)).longValue();
            F f10 = this.f34991d;
            if (f10 == F.STRICT || (f10 == F.SMART && longValue2 != 0)) {
                aVar4.P(longValue2);
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j10 = longValue2;
            }
            D(aVar4, aVar5, Long.valueOf(j10));
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.AMPM_OF_DAY;
        if (hashMap.containsKey(aVar6)) {
            j$.time.temporal.a aVar7 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (hashMap.containsKey(aVar7)) {
                long longValue3 = ((Long) hashMap.remove(aVar6)).longValue();
                long longValue4 = ((Long) hashMap.remove(aVar7)).longValue();
                if (this.f34991d == F.LENIENT) {
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    j6 = j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.q(longValue3, 12), longValue4);
                } else {
                    aVar6.P(longValue3);
                    aVar7.P(longValue3);
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    j6 = (longValue3 * 12) + longValue4;
                }
                D(aVar6, aVar, Long.valueOf(j6));
            }
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.NANO_OF_DAY;
        if (hashMap.containsKey(aVar8)) {
            long longValue5 = ((Long) hashMap.remove(aVar8)).longValue();
            if (this.f34991d != F.LENIENT) {
                aVar8.P(longValue5);
            }
            D(aVar8, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            D(aVar8, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            D(aVar8, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            D(aVar8, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.MICRO_OF_DAY;
        if (hashMap.containsKey(aVar9)) {
            long longValue6 = ((Long) hashMap.remove(aVar9)).longValue();
            if (this.f34991d != F.LENIENT) {
                aVar9.P(longValue6);
            }
            D(aVar9, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            D(aVar9, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MILLI_OF_DAY;
        if (hashMap.containsKey(aVar10)) {
            long longValue7 = ((Long) hashMap.remove(aVar10)).longValue();
            if (this.f34991d != F.LENIENT) {
                aVar10.P(longValue7);
            }
            D(aVar10, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            D(aVar10, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.SECOND_OF_DAY;
        if (hashMap.containsKey(aVar11)) {
            long longValue8 = ((Long) hashMap.remove(aVar11)).longValue();
            if (this.f34991d != F.LENIENT) {
                aVar11.P(longValue8);
            }
            D(aVar11, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            D(aVar11, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            D(aVar11, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        j$.time.temporal.a aVar12 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (hashMap.containsKey(aVar12)) {
            long longValue9 = ((Long) hashMap.remove(aVar12)).longValue();
            if (this.f34991d != F.LENIENT) {
                aVar12.P(longValue9);
            }
            D(aVar12, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            D(aVar12, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        j$.time.temporal.a aVar13 = j$.time.temporal.a.NANO_OF_SECOND;
        if (hashMap.containsKey(aVar13)) {
            long longValue10 = ((Long) hashMap.get(aVar13)).longValue();
            F f11 = this.f34991d;
            F f12 = F.LENIENT;
            if (f11 != f12) {
                aVar13.P(longValue10);
            }
            j$.time.temporal.a aVar14 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (hashMap.containsKey(aVar14)) {
                long longValue11 = ((Long) hashMap.remove(aVar14)).longValue();
                if (this.f34991d != f12) {
                    aVar14.P(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                D(aVar14, aVar13, Long.valueOf(longValue10));
            }
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar15)) {
                long longValue12 = ((Long) hashMap.remove(aVar15)).longValue();
                if (this.f34991d != f12) {
                    aVar15.P(longValue12);
                }
                D(aVar15, aVar13, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar16 = j$.time.temporal.a.HOUR_OF_DAY;
        if (hashMap.containsKey(aVar16)) {
            j$.time.temporal.a aVar17 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (!hashMap.containsKey(aVar17)) {
                return;
            }
            j$.time.temporal.a aVar18 = j$.time.temporal.a.SECOND_OF_MINUTE;
            if (!hashMap.containsKey(aVar18) || !hashMap.containsKey(aVar13)) {
                return;
            }
            t(((Long) hashMap.remove(aVar16)).longValue(), ((Long) hashMap.remove(aVar17)).longValue(), ((Long) hashMap.remove(aVar18)).longValue(), ((Long) hashMap.remove(aVar13)).longValue());
        }
    }

    private void x(j$.time.i iVar, j$.time.p pVar) {
        j$.time.i iVar2 = this.f34993f;
        if (iVar2 == null) {
            this.f34993f = iVar;
        } else if (!iVar2.equals(iVar)) {
            j$.time.i iVar3 = this.f34993f;
            throw new DateTimeException("Conflict found: Fields resolved to different times: " + iVar3 + Separators.SP + iVar);
        } else {
            j$.time.p pVar2 = this.f34994g;
            pVar2.getClass();
            j$.time.p pVar3 = j$.time.p.f35101d;
            if (pVar2 != pVar3 && pVar != pVar3 && !this.f34994g.equals(pVar)) {
                j$.time.p pVar4 = this.f34994g;
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + pVar4 + Separators.SP + pVar);
            }
        }
        this.f34994g = pVar;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        if (!this.f34988a.containsKey(rVar)) {
            ChronoLocalDate chronoLocalDate = this.f34992e;
            if (chronoLocalDate != null && chronoLocalDate.f(rVar)) {
                return true;
            }
            j$.time.i iVar = this.f34993f;
            if (iVar != null && iVar.f(rVar)) {
                return true;
            }
            return rVar != null && !(rVar instanceof j$.time.temporal.a) && rVar.z(this);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(F f6, Set set) {
        ChronoLocalDate chronoLocalDate;
        j$.time.i iVar;
        ChronoZonedDateTime o10;
        j$.time.temporal.a aVar;
        j$.time.p pVar;
        j$.time.p pVar2;
        j$.time.temporal.a aVar2;
        Long valueOf;
        HashMap hashMap = this.f34988a;
        if (set != null) {
            hashMap.keySet().retainAll(set);
        }
        this.f34991d = f6;
        n();
        A(this.f34990c.h(hashMap, this.f34991d));
        v();
        if (hashMap.size() > 0) {
            int i10 = 0;
            loop0: while (i10 < 50) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    j$.time.temporal.r rVar = (j$.time.temporal.r) entry.getKey();
                    TemporalAccessor s10 = rVar.s(hashMap, this, this.f34991d);
                    if (s10 != null) {
                        if (s10 instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) s10;
                            ZoneId zoneId = this.f34989b;
                            if (zoneId == null) {
                                this.f34989b = chronoZonedDateTime.u();
                            } else if (!zoneId.equals(chronoZonedDateTime.u())) {
                                ZoneId zoneId2 = this.f34989b;
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + zoneId2);
                            }
                            s10 = chronoZonedDateTime.C();
                        }
                        if (s10 instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) s10;
                            x(chronoLocalDateTime.b(), j$.time.p.f35101d);
                            A(chronoLocalDateTime.c());
                        } else if (s10 instanceof ChronoLocalDate) {
                            A((ChronoLocalDate) s10);
                        } else if (!(s10 instanceof j$.time.i)) {
                            throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        } else {
                            x((j$.time.i) s10, j$.time.p.f35101d);
                        }
                    } else if (!hashMap.containsKey(rVar)) {
                        break;
                    }
                    i10++;
                }
            }
            if (i10 == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i10 > 0) {
                n();
                A(this.f34990c.h(hashMap, this.f34991d));
                v();
            }
        }
        if (this.f34993f == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar3)) {
                long longValue = ((Long) hashMap.remove(aVar3)).longValue();
                j$.time.temporal.a aVar4 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (hashMap.containsKey(aVar4)) {
                    long longValue2 = (((Long) hashMap.get(aVar4)).longValue() % 1000) + (longValue * 1000);
                    D(aVar3, aVar4, Long.valueOf(longValue2));
                    hashMap.remove(aVar4);
                    aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                    valueOf = Long.valueOf(longValue2 * 1000);
                } else {
                    aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                    valueOf = Long.valueOf(longValue * 1000000);
                }
                hashMap.put(aVar2, valueOf);
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (hashMap.containsKey(obj)) {
                    hashMap.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) hashMap.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l10 = (Long) hashMap.get(obj2);
            if (l10 != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l11 = (Long) hashMap.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l12 = (Long) hashMap.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l13 = (Long) hashMap.get(obj5);
                if ((l11 != null || (l12 == null && l13 == null)) && (l11 == null || l12 != null || l13 == null)) {
                    t(l10.longValue(), l11 != null ? l11.longValue() : 0L, l12 != null ? l12.longValue() : 0L, l13 != null ? l13.longValue() : 0L);
                    hashMap.remove(obj2);
                    hashMap.remove(obj3);
                    hashMap.remove(obj4);
                    hashMap.remove(obj5);
                }
                chronoLocalDate = this.f34992e;
                if (chronoLocalDate != null) {
                    h(chronoLocalDate);
                }
                iVar = this.f34993f;
                if (iVar != null) {
                    h(iVar);
                    if (this.f34992e != null && hashMap.size() > 0) {
                        h(this.f34992e.y(this.f34993f));
                    }
                }
                if (this.f34992e != null && this.f34993f != null) {
                    pVar = this.f34994g;
                    pVar.getClass();
                    pVar2 = j$.time.p.f35101d;
                    if (pVar != pVar2) {
                        this.f34992e = this.f34992e.j(this.f34994g);
                        this.f34994g = pVar2;
                    }
                }
                if (this.f34993f == null && (hashMap.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || hashMap.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || hashMap.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
                    aVar = j$.time.temporal.a.NANO_OF_SECOND;
                    if (!hashMap.containsKey(aVar)) {
                        long longValue3 = ((Long) hashMap.get(aVar)).longValue();
                        hashMap.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue3 / 1000));
                        hashMap.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue3 / 1000000));
                    } else {
                        hashMap.put(aVar, 0L);
                        hashMap.put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                        hashMap.put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                    }
                }
                if (this.f34992e != null || this.f34993f == null) {
                }
                Long l14 = (Long) hashMap.get(j$.time.temporal.a.OFFSET_SECONDS);
                if (l14 != null) {
                    o10 = this.f34992e.y(this.f34993f).o(ZoneOffset.V(l14.intValue()));
                } else if (this.f34989b == null) {
                    return;
                } else {
                    o10 = this.f34992e.y(this.f34993f).o(this.f34989b);
                }
                hashMap.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(o10.N()));
                return;
            }
        }
        if (this.f34991d != F.LENIENT && hashMap.size() > 0) {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                j$.time.temporal.r rVar2 = (j$.time.temporal.r) entry2.getKey();
                if ((rVar2 instanceof j$.time.temporal.a) && rVar2.r()) {
                    ((j$.time.temporal.a) rVar2).P(((Long) entry2.getValue()).longValue());
                }
            }
        }
        chronoLocalDate = this.f34992e;
        if (chronoLocalDate != null) {
        }
        iVar = this.f34993f;
        if (iVar != null) {
        }
        if (this.f34992e != null) {
            pVar = this.f34994g;
            pVar.getClass();
            pVar2 = j$.time.p.f35101d;
            if (pVar != pVar2) {
            }
        }
        if (this.f34993f == null) {
            aVar = j$.time.temporal.a.NANO_OF_SECOND;
            if (!hashMap.containsKey(aVar)) {
            }
        }
        if (this.f34992e != null) {
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.d(this, rVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f34988a);
        sb2.append(',');
        sb2.append(this.f34990c);
        if (this.f34989b != null) {
            sb2.append(',');
            sb2.append(this.f34989b);
        }
        if (this.f34992e != null || this.f34993f != null) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f34992e;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.f34993f != null) {
                    sb2.append('T');
                }
            }
            sb2.append(this.f34993f);
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        Objects.requireNonNull(rVar, "field");
        Long l10 = (Long) this.f34988a.get(rVar);
        if (l10 != null) {
            return l10.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f34992e;
        if (chronoLocalDate != null && chronoLocalDate.f(rVar)) {
            return this.f34992e.w(rVar);
        }
        j$.time.i iVar = this.f34993f;
        if (iVar != null && iVar.f(rVar)) {
            return this.f34993f.w(rVar);
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.q.l()) {
            return this.f34989b;
        }
        if (tVar == j$.time.temporal.q.e()) {
            return this.f34990c;
        }
        if (tVar == j$.time.temporal.q.f()) {
            ChronoLocalDate chronoLocalDate = this.f34992e;
            if (chronoLocalDate == null) {
                return null;
            }
            return LocalDate.P(chronoLocalDate);
        } else if (tVar == j$.time.temporal.q.g()) {
            return this.f34993f;
        } else {
            if (tVar != j$.time.temporal.q.i()) {
                if (tVar == j$.time.temporal.q.k() || tVar != j$.time.temporal.q.j()) {
                    return tVar.a(this);
                }
                return null;
            }
            Long l10 = (Long) this.f34988a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l10 != null) {
                return ZoneOffset.V(l10.intValue());
            }
            ZoneId zoneId = this.f34989b;
            return zoneId instanceof ZoneOffset ? zoneId : tVar.a(this);
        }
    }
}
