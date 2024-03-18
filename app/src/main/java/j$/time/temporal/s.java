package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes3.dex */
final class s implements t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35141a;

    public /* synthetic */ s(int i10) {
        this.f35141a = i10;
    }

    @Override // j$.time.temporal.t
    public final Object a(TemporalAccessor temporalAccessor) {
        t tVar = q.f35137d;
        t tVar2 = q.f35134a;
        int i10 = this.f35141a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return (ZoneId) temporalAccessor.z(tVar2);
                    default:
                        ZoneId zoneId = (ZoneId) temporalAccessor.z(tVar2);
                        return zoneId != null ? zoneId : (ZoneId) temporalAccessor.z(tVar);
                }
            case 1:
                return (j$.time.chrono.k) temporalAccessor.z(q.f35135b);
            case 2:
                return (u) temporalAccessor.z(q.f35136c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (!temporalAccessor.f(aVar)) {
                    return null;
                }
                return ZoneOffset.V(temporalAccessor.p(aVar));
            case 4:
                switch (i10) {
                    case 0:
                        return (ZoneId) temporalAccessor.z(tVar2);
                    default:
                        ZoneId zoneId2 = (ZoneId) temporalAccessor.z(tVar2);
                        return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.z(tVar);
                }
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (!temporalAccessor.f(aVar2)) {
                    return null;
                }
                return LocalDate.ofEpochDay(temporalAccessor.w(aVar2));
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (!temporalAccessor.f(aVar3)) {
                    return null;
                }
                return j$.time.i.W(temporalAccessor.w(aVar3));
        }
    }

    public final String toString() {
        switch (this.f35141a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
