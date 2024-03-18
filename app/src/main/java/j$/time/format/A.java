package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    private TemporalAccessor f34967a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f34968b;

    /* renamed from: c  reason: collision with root package name */
    private int f34969c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.temporal.a[] values;
        j$.time.chrono.k a5 = dateTimeFormatter.a();
        ZoneId d10 = dateTimeFormatter.d();
        if (a5 != null || d10 != null) {
            j$.time.chrono.k kVar = (j$.time.chrono.k) temporalAccessor.z(j$.time.temporal.q.e());
            ZoneId zoneId = (ZoneId) temporalAccessor.z(j$.time.temporal.q.l());
            ChronoLocalDate chronoLocalDate = null;
            a5 = Objects.equals(a5, kVar) ? null : a5;
            d10 = Objects.equals(d10, zoneId) ? null : d10;
            if (a5 != null || d10 != null) {
                j$.time.chrono.k kVar2 = a5 != null ? a5 : kVar;
                if (d10 != null) {
                    if (temporalAccessor.f(j$.time.temporal.a.INSTANT_SECONDS)) {
                        temporalAccessor = ((j$.time.chrono.k) (kVar2 == null ? Objects.requireNonNull(j$.time.chrono.r.f34946d, "defaultObj") : kVar2)).G(Instant.O(temporalAccessor), d10);
                    } else if (d10.normalized() instanceof ZoneOffset) {
                        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                        if (temporalAccessor.f(aVar) && temporalAccessor.p(aVar) != d10.getRules().d(Instant.EPOCH).T()) {
                            throw new DateTimeException("Unable to apply override zone '" + d10 + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                        }
                    }
                }
                zoneId = d10 != null ? d10 : zoneId;
                if (a5 != null) {
                    if (temporalAccessor.f(j$.time.temporal.a.EPOCH_DAY)) {
                        chronoLocalDate = kVar2.q(temporalAccessor);
                    } else if (a5 != j$.time.chrono.r.f34946d || kVar != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.g() && temporalAccessor.f(aVar2)) {
                                throw new DateTimeException("Unable to apply override chronology '" + a5 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new z(chronoLocalDate, temporalAccessor, kVar2, zoneId);
            }
        }
        this.f34967a = temporalAccessor;
        this.f34968b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f34969c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D b() {
        return this.f34968b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.f34968b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TemporalAccessor d() {
        return this.f34967a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.r rVar) {
        int i10 = this.f34969c;
        TemporalAccessor temporalAccessor = this.f34967a;
        if (i10 <= 0 || temporalAccessor.f(rVar)) {
            return Long.valueOf(temporalAccessor.w(rVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(j$.time.temporal.t tVar) {
        TemporalAccessor temporalAccessor = this.f34967a;
        Object z10 = temporalAccessor.z(tVar);
        if (z10 == null && this.f34969c == 0) {
            throw new DateTimeException("Unable to extract " + tVar + " from temporal " + temporalAccessor);
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.f34969c++;
    }

    public final String toString() {
        return this.f34967a.toString();
    }
}
