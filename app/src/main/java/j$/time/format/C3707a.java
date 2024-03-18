package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3707a implements j$.time.temporal.t {
    @Override // j$.time.temporal.t
    public final Object a(TemporalAccessor temporalAccessor) {
        int i10 = x.f35064j;
        ZoneId zoneId = (ZoneId) temporalAccessor.z(j$.time.temporal.q.l());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
