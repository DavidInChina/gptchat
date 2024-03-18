package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public final class l extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final long f11202Y;

    public l(long j6) {
        this.f11202Y = j6;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.t(Long.valueOf(this.f11202Y));
        return m.f11205i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        if (this.f11202Y == ((l) obj).f11202Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f11202Y;
        return (l.class.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }
}
