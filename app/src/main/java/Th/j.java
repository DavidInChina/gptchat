package Th;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: Z  reason: collision with root package name */
    public static final Object[] f17299Z = new Object[0];

    /* renamed from: Y  reason: collision with root package name */
    public final Method f17300Y;

    public j(Method method) {
        this.f17300Y = method;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        int i10;
        Class<?> cls;
        Class<?> cls2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method method2 = this.f17300Y;
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        int i11 = 1;
        for (int i12 = 0; i12 < parameterTypes.length; i12++) {
            Nh.r t10 = Nh.r.t(parameterTypes[i12]);
            mVar.I(t10.p(21), i11);
            Class<?> cls3 = parameterTypes[i12];
            if (i12 == 0) {
                cls = method2.getDeclaringClass();
            } else {
                cls = parameterTypes2[i12 - 1];
            }
            if (cls3 != cls) {
                if (i12 == 0) {
                    cls2 = method2.getDeclaringClass();
                } else {
                    cls2 = parameterTypes2[i12 - 1];
                }
                mVar.H(192, Nh.r.k(cls2));
            }
            i11 += t10.r();
        }
        if (method2.getDeclaringClass().isInterface()) {
            i10 = 185;
        } else {
            i10 = 182;
        }
        mVar.z(i10, Nh.r.k(method2.getDeclaringClass()), method2.getName(), Nh.r.m(method2), method2.getDeclaringClass().isInterface());
        mVar.n(Nh.r.t(method2.getReturnType()).p(172));
        return Math.max(i11 - 1, Nh.r.t(method2.getReturnType()).r());
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        Object[] objArr2;
        if (objArr.length == 1) {
            objArr2 = f17299Z;
        } else {
            int length = objArr.length - 1;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr, 1, objArr3, 0, length);
            objArr2 = objArr3;
        }
        c cVar = y.f17319k0;
        Object obj = objArr[0];
        cVar.getClass();
        return this.f17300Y.invoke(obj, objArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        if (this.f17300Y.equals(((j) obj).f17300Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17300Y.hashCode() + (j.class.hashCode() * 31);
    }
}
