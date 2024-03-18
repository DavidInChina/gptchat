package Th;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: Y  reason: collision with root package name */
    public final Method f17301Y;

    public k(Method method) {
        this.f17301Y = method;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method method2 = this.f17301Y;
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
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
        mVar.z(184, Nh.r.k(method2.getDeclaringClass()), method2.getName(), Nh.r.m(method2), method2.getDeclaringClass().isInterface());
        mVar.n(Nh.r.t(method2.getReturnType()).p(172));
        return Math.max(i10 - 1, Nh.r.t(method2.getReturnType()).r());
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        y.f17319k0.getClass();
        return this.f17301Y.invoke(null, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        if (this.f17301Y.equals(((k) obj).f17301Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17301Y.hashCode() + (k.class.hashCode() * 31);
    }
}
