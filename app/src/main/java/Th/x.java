package Th;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements InvocationHandler {

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f17314c = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public final String f17315a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f17316b;

    public x(String str, HashMap hashMap) {
        this.f17315a = str;
        this.f17316b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f17315a.equals(xVar.f17315a) && this.f17316b.equals(xVar.f17316b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17316b.hashCode() + E9.f.v(this.f17315a, x.class.hashCode() * 31, 31);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        r2 = false;
        r2 = false;
        boolean z10 = false;
        if (method.getDeclaringClass() == Object.class) {
            if (method.getName().equals("hashCode")) {
                return Integer.valueOf(hashCode());
            }
            if (method.getName().equals("equals")) {
                Object obj2 = objArr[0];
                if (obj2 != null && Proxy.isProxyClass(obj2.getClass()) && Proxy.getInvocationHandler(objArr[0]).equals(this)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            } else if (method.getName().equals("toString")) {
                return "Call proxy for " + this.f17315a;
            } else {
                throw new IllegalStateException("Unexpected object method: " + method);
            }
        }
        m mVar = (m) this.f17316b.get(method);
        try {
            try {
                if (mVar != null) {
                    if (objArr == null) {
                        objArr = f17314c;
                    }
                    return mVar.b(objArr);
                }
                throw new IllegalStateException("No proxy target found for " + method);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            }
        } catch (Error e11) {
            throw e11;
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Throwable th2) {
            for (Class<?> cls : method.getExceptionTypes()) {
                if (cls.isInstance(th2)) {
                    throw th2;
                }
            }
            throw new IllegalStateException("Failed to invoke proxy for " + method, th2);
        }
    }
}
