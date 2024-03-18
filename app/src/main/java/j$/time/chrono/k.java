package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public interface k extends Comparable {
    ChronoLocalDate D(int i10, int i11, int i12);

    j$.time.temporal.w F(j$.time.temporal.a aVar);

    ChronoZonedDateTime G(Instant instant, ZoneId zoneId);

    List I();

    boolean K(long j6);

    l M(int i10);

    String getId();

    ChronoLocalDate h(HashMap hashMap, j$.time.format.F f6);

    int i(l lVar, int i10);

    ChronoLocalDate n(long j6);

    ChronoLocalDate q(TemporalAccessor temporalAccessor);

    ChronoLocalDateTime t(LocalDateTime localDateTime);

    String v();

    ChronoLocalDate x(int i10, int i11);
}
