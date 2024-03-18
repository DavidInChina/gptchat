package Ah;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class G extends I {

    /* renamed from: f  reason: collision with root package name */
    public final Method f888f;

    public G(Method method, Method method2, Method method3, Method method4, Method method5, Method method6) {
        super(method, method2, method3, method4, method5);
        this.f888f = method6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        if (this.f888f.equals(((G) obj).f888f)) {
            return true;
        }
        return false;
    }

    @Override // Ah.J
    public final Object g(ClassLoader classLoader, String str) {
        try {
            return this.f888f.invoke(classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    public final int hashCode() {
        return this.f888f.hashCode() + (G.class.hashCode() * 31);
    }
}
