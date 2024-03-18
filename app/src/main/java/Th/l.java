package Th;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: Y  reason: collision with root package name */
    public final String f17302Y;

    public l(String str) {
        this.f17302Y = str;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        mVar.H(187, Nh.r.k(IllegalStateException.class));
        mVar.n(89);
        mVar.t(this.f17302Y);
        mVar.z(183, Nh.r.k(IllegalStateException.class), "<init>", Nh.r.l(Nh.r.f13211e, Nh.r.t(String.class)), false);
        mVar.n(191);
        return 3;
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        throw new IllegalStateException("Could not invoke proxy: " + this.f17302Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        if (this.f17302Y.equals(((l) obj).f17302Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17302Y.hashCode() + (l.class.hashCode() * 31);
    }
}
