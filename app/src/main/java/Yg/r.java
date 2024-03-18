package Yg;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;

@AbstractC1998i(with = Zg.h.class)
/* loaded from: classes.dex */
public final class r implements Comparable<r> {
    public static final q Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final LocalDate f22420Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [Yg.q, java.lang.Object] */
    static {
        LocalDate localDate = LocalDate.MIN;
        AbstractC3557B.b0("MIN", localDate);
        new r(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        AbstractC3557B.b0("MAX", localDate2);
        new r(localDate2);
    }

    public r(LocalDate localDate) {
        AbstractC3557B.c0("value", localDate);
        this.f22420Y = localDate;
    }

    /* renamed from: a */
    public final int compareTo(r rVar) {
        AbstractC3557B.c0("other", rVar);
        return this.f22420Y.compareTo((ChronoLocalDate) rVar.f22420Y);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                if (AbstractC3557B.K(this.f22420Y, ((r) obj).f22420Y)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22420Y.hashCode();
    }

    public final String toString() {
        String localDate = this.f22420Y.toString();
        AbstractC3557B.b0("toString(...)", localDate);
        return localDate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(int i10, int i11, int i12) {
        this(r1);
        try {
            LocalDate of2 = LocalDate.of(i10, i11, i12);
            AbstractC3557B.Z(of2);
        } catch (DateTimeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
