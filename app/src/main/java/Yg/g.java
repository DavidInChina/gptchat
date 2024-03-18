package Yg;

import ah.AbstractC1998i;
import k6.AbstractC4194d;

@AbstractC1998i(with = Zg.e.class)
/* loaded from: classes.dex */
public final class g extends e {
    public static final f Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final int f22408c;

    public g(int i10) {
        this.f22408c = i10;
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Unit duration must be positive, but was ", i10, " days.").toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                if (this.f22408c == ((g) obj).f22408c) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22408c ^ 65536;
    }

    public final String toString() {
        int i10 = this.f22408c;
        if (i10 % 7 == 0) {
            return l.a(i10 / 7, "WEEK");
        }
        return l.a(i10, "DAY");
    }
}
