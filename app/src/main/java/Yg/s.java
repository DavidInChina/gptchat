package Yg;

import id.AbstractC3557B;
import j$.time.DateTimeException;
import j$.time.LocalDate;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final long f22421a = LocalDate.MIN.toEpochDay();

    /* renamed from: b  reason: collision with root package name */
    public static final long f22422b = LocalDate.MAX.toEpochDay();

    public static final r a(r rVar, int i10, e eVar) {
        LocalDate localDate;
        boolean z10;
        AbstractC3557B.c0("unit", eVar);
        long j6 = -i10;
        try {
            boolean z11 = eVar instanceof g;
            LocalDate localDate2 = rVar.f22420Y;
            if (z11) {
                long c12 = Ad.l.c1(j6, ((g) eVar).f22408c);
                long epochDay = localDate2.toEpochDay();
                long j10 = epochDay + c12;
                boolean z12 = false;
                if ((epochDay ^ c12) < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((epochDay ^ j10) >= 0) {
                    z12 = true;
                }
                if (z10 | z12) {
                    localDate = b(j10);
                } else {
                    throw new ArithmeticException();
                }
            } else if (eVar instanceof i) {
                localDate = localDate2.plusMonths(Ad.l.c1(j6, ((i) eVar).f22409c));
            } else {
                throw new RuntimeException();
            }
            return new r(localDate);
        } catch (Exception e10) {
            if (!(e10 instanceof DateTimeException) && !(e10 instanceof ArithmeticException)) {
                throw e10;
            }
            String str = "The result of adding " + j6 + " of " + eVar + " to " + rVar + " is out of LocalDate range.";
            AbstractC3557B.c0("message", str);
            throw new RuntimeException(str, e10);
        }
    }

    public static final LocalDate b(long j6) {
        if (j6 <= f22422b && f22421a <= j6) {
            LocalDate ofEpochDay = LocalDate.ofEpochDay(j6);
            AbstractC3557B.b0("ofEpochDay(...)", ofEpochDay);
            return ofEpochDay;
        }
        throw new DateTimeException("The resulting day " + j6 + " is out of supported LocalDate range.");
    }
}
