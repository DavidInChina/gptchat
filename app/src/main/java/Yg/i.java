package Yg;

import ah.AbstractC1998i;
import k6.AbstractC4194d;

@AbstractC1998i(with = Zg.j.class)
/* loaded from: classes.dex */
public final class i extends e {
    public static final h Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final int f22409c;

    public i(int i10) {
        this.f22409c = i10;
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Unit duration must be positive, but was ", i10, " months.").toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                if (this.f22409c == ((i) obj).f22409c) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22409c ^ 131072;
    }

    public final String toString() {
        int i10 = this.f22409c;
        if (i10 % 1200 == 0) {
            return l.a(i10 / 1200, "CENTURY");
        }
        if (i10 % 12 == 0) {
            return l.a(i10 / 12, "YEAR");
        }
        if (i10 % 3 == 0) {
            return l.a(i10 / 3, "QUARTER");
        }
        return l.a(i10, "MONTH");
    }
}
