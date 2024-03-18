package Pg;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f14245a;

    public q(Throwable th2) {
        this.f14245a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (AbstractC3557B.K(this.f14245a, ((q) obj).f14245a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f14245a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // Pg.r
    public final String toString() {
        return "Closed(" + this.f14245a + ')';
    }
}
