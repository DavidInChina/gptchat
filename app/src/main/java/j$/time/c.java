package j$.time;

import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class c extends Enum implements TemporalAccessor, j$.time.temporal.n {
    public static final c FRIDAY;
    public static final c MONDAY;
    public static final c SATURDAY;
    public static final c SUNDAY;
    public static final c THURSDAY;
    public static final c TUESDAY;
    public static final c WEDNESDAY;

    /* renamed from: a  reason: collision with root package name */
    private static final c[] f34898a = values();

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ c[] f34899b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, j$.time.c] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, j$.time.c] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, j$.time.c] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.c] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, j$.time.c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, j$.time.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, j$.time.c] */
    static {
        ?? r72 = new Enum("MONDAY", 0);
        MONDAY = r72;
        ?? r82 = new Enum("TUESDAY", 1);
        TUESDAY = r82;
        ?? r92 = new Enum("WEDNESDAY", 2);
        WEDNESDAY = r92;
        ?? r10 = new Enum("THURSDAY", 3);
        THURSDAY = r10;
        ?? r11 = new Enum("FRIDAY", 4);
        FRIDAY = r11;
        ?? r12 = new Enum("SATURDAY", 5);
        SATURDAY = r12;
        ?? r13 = new Enum("SUNDAY", 6);
        SUNDAY = r13;
        f34899b = new c[]{r72, r82, r92, r10, r11, r12, r13};
    }

    public static c L(int i10) {
        if (i10 < 1 || i10 > 7) {
            throw new DateTimeException("Invalid value for DayOfWeek: " + i10);
        }
        return f34898a[i10 - 1];
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f34899b.clone();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    public final c O(long j6) {
        int i10 = ((int) (j6 % 7)) + 7;
        return f34898a[(i10 + ordinal()) % 7];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.DAY_OF_WEEK : rVar != null && rVar.z(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.DAY_OF_WEEK ? rVar.p() : j$.time.temporal.q.d(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new DateTimeException(b.a("Unsupported field: ", rVar));
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.DAYS : j$.time.temporal.q.c(this, tVar);
    }
}
