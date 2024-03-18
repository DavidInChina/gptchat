package Th;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: Y  reason: collision with root package name */
    public final Constructor f17268Y;

    public d(Constructor constructor) {
        this.f17268Y = constructor;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Constructor constructor = this.f17268Y;
        Class<?>[] parameterTypes2 = constructor.getParameterTypes();
        mVar.H(187, Nh.r.k(constructor.getDeclaringClass()));
        mVar.n(89);
        int i10 = 1;
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            Nh.r t10 = Nh.r.t(parameterTypes[i11]);
            mVar.I(t10.p(21), i10);
            Class<?> cls = parameterTypes[i11];
            Class<?> cls2 = parameterTypes2[i11];
            if (cls != cls2) {
                mVar.H(192, Nh.r.k(cls2));
            }
            i10 += t10.r();
        }
        mVar.z(183, Nh.r.k(constructor.getDeclaringClass()), "<init>", Nh.r.g(constructor), false);
        mVar.n(176);
        return i10 + 1;
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        y.f17319k0.getClass();
        return this.f17268Y.newInstance(objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        if (this.f17268Y.equals(((d) obj).f17268Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17268Y.hashCode() + (d.class.hashCode() * 31);
    }
}
