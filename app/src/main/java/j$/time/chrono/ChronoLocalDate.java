package j$.time.chrono;

/* loaded from: classes3.dex */
public interface ChronoLocalDate extends j$.time.temporal.m, j$.time.temporal.n, Comparable<ChronoLocalDate> {
    l B();

    boolean E();

    ChronoLocalDate H(long j6, j$.time.temporal.u uVar);

    int J();

    k a();

    int compareTo(ChronoLocalDate chronoLocalDate);

    @Override // j$.time.temporal.m
    ChronoLocalDate d(long j6, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    /* renamed from: e */
    ChronoLocalDate mo88e(long j6, j$.time.temporal.u uVar);

    boolean equals(Object obj);

    @Override // j$.time.temporal.TemporalAccessor
    boolean f(j$.time.temporal.r rVar);

    int hashCode();

    ChronoLocalDate j(j$.time.p pVar);

    ChronoLocalDate m(j$.time.temporal.n nVar);

    long toEpochDay();

    String toString();

    ChronoLocalDateTime y(j$.time.i iVar);
}
