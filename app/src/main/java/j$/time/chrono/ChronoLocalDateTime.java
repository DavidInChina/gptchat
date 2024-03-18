package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;

/* loaded from: classes3.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends j$.time.temporal.m, j$.time.temporal.n, Comparable<ChronoLocalDateTime<?>> {
    k a();

    j$.time.i b();

    ChronoLocalDate c();

    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    ChronoZonedDateTime o(ZoneId zoneId);
}
