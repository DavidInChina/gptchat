package Th;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i implements m {

    /* renamed from: Y  reason: collision with root package name */
    public final Class f17298Y;

    public i(Class cls) {
        this.f17298Y = cls;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        mVar.I(25, 1);
        mVar.H(193, Nh.r.k(this.f17298Y));
        mVar.n(172);
        return 1;
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        return Boolean.valueOf(this.f17298Y.isInstance(objArr[0]));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        if (this.f17298Y.equals(((i) obj).f17298Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17298Y.hashCode() + (i.class.hashCode() * 31);
    }
}
