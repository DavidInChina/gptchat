package Yg;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.chrono.ChronoLocalDateTime;

@AbstractC1998i(with = Zg.i.class)
/* loaded from: classes.dex */
public final class u implements Comparable<u> {
    public static final t Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final LocalDateTime f22423Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Yg.t] */
    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        AbstractC3557B.b0("MIN", localDateTime);
        new u(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        AbstractC3557B.b0("MAX", localDateTime2);
        new u(localDateTime2);
    }

    public u(LocalDateTime localDateTime) {
        AbstractC3557B.c0("value", localDateTime);
        this.f22423Y = localDateTime;
    }

    public final r a() {
        LocalDate c10 = this.f22423Y.c();
        AbstractC3557B.b0("toLocalDate(...)", c10);
        return new r(c10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(u uVar) {
        u uVar2 = uVar;
        AbstractC3557B.c0("other", uVar2);
        return this.f22423Y.compareTo((ChronoLocalDateTime<?>) uVar2.f22423Y);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u) {
                if (AbstractC3557B.K(this.f22423Y, ((u) obj).f22423Y)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22423Y.hashCode();
    }

    public final String toString() {
        String localDateTime = this.f22423Y.toString();
        AbstractC3557B.b0("toString(...)", localDateTime);
        return localDateTime;
    }
}
