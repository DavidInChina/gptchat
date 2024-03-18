package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes3.dex */
final class z implements TemporalAccessor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChronoLocalDate f35077a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TemporalAccessor f35078b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.k f35079c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZoneId f35080d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, j$.time.chrono.k kVar, ZoneId zoneId) {
        this.f35077a = chronoLocalDate;
        this.f35078b = temporalAccessor;
        this.f35079c = kVar;
        this.f35080d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        ChronoLocalDate chronoLocalDate = this.f35077a;
        return (chronoLocalDate == null || !rVar.g()) ? this.f35078b.f(rVar) : chronoLocalDate.f(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        ChronoLocalDate chronoLocalDate = this.f35077a;
        return (chronoLocalDate == null || !rVar.g()) ? this.f35078b.s(rVar) : chronoLocalDate.s(rVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.k kVar = this.f35079c;
        if (kVar != null) {
            str = " with chronology " + kVar;
        } else {
            str = str2;
        }
        ZoneId zoneId = this.f35080d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f35078b + str + str2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        ChronoLocalDate chronoLocalDate = this.f35077a;
        return (chronoLocalDate == null || !rVar.g()) ? this.f35078b.w(rVar) : chronoLocalDate.w(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.e() ? this.f35079c : tVar == j$.time.temporal.q.l() ? this.f35080d : tVar == j$.time.temporal.q.j() ? this.f35078b.z(tVar) : tVar.a(this);
    }
}
