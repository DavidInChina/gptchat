package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;

/* loaded from: classes3.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    ChronoLocalDateTime C();

    long N();

    k a();

    j$.time.i b();

    ChronoLocalDate c();

    ZoneOffset k();

    ChronoZonedDateTime l(ZoneId zoneId);

    Instant toInstant();

    ZoneId u();
}
