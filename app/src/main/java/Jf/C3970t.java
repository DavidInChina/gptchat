package jf;

import K4.J;
import id.AbstractC3557B;

/* renamed from: jf.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3970t implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final long f36172Y;

    public /* synthetic */ C3970t(long j6) {
        this.f36172Y = j6;
    }

    public static int a(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i10 = ((this.f36172Y ^ Long.MIN_VALUE) > (((C3970t) obj).f36172Y ^ Long.MIN_VALUE) ? 1 : ((this.f36172Y ^ Long.MIN_VALUE) == (((C3970t) obj).f36172Y ^ Long.MIN_VALUE) ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3970t)) {
            return false;
        }
        if (this.f36172Y != ((C3970t) obj).f36172Y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a(this.f36172Y);
    }

    public final String toString() {
        long j6 = this.f36172Y;
        if (j6 >= 0) {
            J.j(10);
            String l10 = Long.toString(j6, 10);
            AbstractC3557B.b0("toString(...)", l10);
            return l10;
        }
        long j10 = 10;
        long j11 = ((j6 >>> 1) / j10) << 1;
        long j12 = j6 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        J.j(10);
        String l11 = Long.toString(j11, 10);
        AbstractC3557B.b0("toString(...)", l11);
        J.j(10);
        String l12 = Long.toString(j12, 10);
        AbstractC3557B.b0("toString(...)", l12);
        return l11.concat(l12);
    }
}
