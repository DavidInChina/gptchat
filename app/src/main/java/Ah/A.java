package Ah;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class A extends C {

    /* renamed from: f  reason: collision with root package name */
    public final Method f874f;

    public A(Method method, Method method2, Method method3, Method method4, Method method5, Method method6) {
        super(method, method2, method3, method4, method5);
        this.f874f = method6;
    }

    @Override // Ah.C
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        if (!this.f874f.equals(((A) obj).f874f)) {
            return false;
        }
        return true;
    }

    @Override // Ah.J
    public final Object g(ClassLoader classLoader, String str) {
        try {
            return this.f874f.invoke(classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.C
    public final int hashCode() {
        return this.f874f.hashCode() + (super.hashCode() * 31);
    }
}
