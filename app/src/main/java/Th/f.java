package Th;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f17270Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Class f17271Z;

    public f(Class cls, Object obj) {
        this.f17270Y = obj;
        this.f17271Z = cls;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        mVar.n(3);
        mVar.H(189, Nh.r.k(this.f17271Z));
        mVar.n(176);
        return 1;
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        return this.f17270Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        if (this.f17271Z.equals(((f) obj).f17271Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17271Z.hashCode() + (f.class.hashCode() * 31);
    }
}
