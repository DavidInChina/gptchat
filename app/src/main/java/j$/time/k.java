package j$.time;

import j$.time.chrono.AbstractC3698a;
import j$.time.chrono.AbstractC3699b;
import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class k extends Enum implements TemporalAccessor, j$.time.temporal.n {
    public static final k APRIL;
    public static final k AUGUST;
    public static final k DECEMBER;
    public static final k FEBRUARY;
    public static final k JANUARY;
    public static final k JULY;
    public static final k JUNE;
    public static final k MARCH;
    public static final k MAY;
    public static final k NOVEMBER;
    public static final k OCTOBER;
    public static final k SEPTEMBER;

    /* renamed from: a  reason: collision with root package name */
    private static final k[] f35093a = values();

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ k[] f35094b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, j$.time.k] */
    static {
        ?? r12 = new Enum("JANUARY", 0);
        JANUARY = r12;
        ?? r13 = new Enum("FEBRUARY", 1);
        FEBRUARY = r13;
        ?? r14 = new Enum("MARCH", 2);
        MARCH = r14;
        ?? r15 = new Enum("APRIL", 3);
        APRIL = r15;
        ?? r92 = new Enum("MAY", 4);
        MAY = r92;
        ?? r82 = new Enum("JUNE", 5);
        JUNE = r82;
        ?? r72 = new Enum("JULY", 6);
        JULY = r72;
        ?? r62 = new Enum("AUGUST", 7);
        AUGUST = r62;
        ?? r52 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r52;
        ?? r42 = new Enum("OCTOBER", 9);
        OCTOBER = r42;
        ?? r32 = new Enum("NOVEMBER", 10);
        NOVEMBER = r32;
        ?? r22 = new Enum("DECEMBER", 11);
        DECEMBER = r22;
        f35094b = new k[]{r12, r13, r14, r15, r92, r82, r72, r62, r52, r42, r32, r22};
    }

    public static k Q(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i10);
        }
        return f35093a[i10 - 1];
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f35094b.clone();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        if (((AbstractC3698a) AbstractC3699b.p(mVar)).equals(j$.time.chrono.r.f34946d)) {
            return mVar.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int L(boolean z10) {
        switch (j.f35092a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return z10 + 152;
            case 4:
                return z10 + 244;
            case 5:
                return z10 + 305;
            case 6:
                return 1;
            case 7:
                return z10 + 60;
            case 8:
                return z10 + 121;
            case 9:
                return z10 + 182;
            case 10:
                return z10 + 213;
            case 11:
                return z10 + 274;
            default:
                return z10 + 335;
        }
    }

    public final int O(boolean z10) {
        int i10 = j.f35092a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public final int P() {
        int i10 = j.f35092a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final k R() {
        int i10 = ((int) 1) + 12;
        return f35093a[(i10 + ordinal()) % 12];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR : rVar != null && rVar.z(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.MONTH_OF_YEAR ? rVar.p() : j$.time.temporal.q.d(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new DateTimeException(b.a("Unsupported field: ", rVar));
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.e() ? j$.time.chrono.r.f34946d : tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.MONTHS : j$.time.temporal.q.c(this, tVar);
    }
}
