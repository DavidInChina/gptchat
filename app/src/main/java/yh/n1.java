package yh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class n1 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Class f51056a;

    public n1(Class cls) {
        this.f51056a = cls;
    }

    public static l1 a(Class cls) {
        return (l1) Proxy.newProxyInstance(l1.class.getClassLoader(), new Class[]{l1.class}, new n1(cls));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n1.class != obj.getClass()) {
            return false;
        }
        if (this.f51056a.equals(((n1) obj).f51056a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51056a.hashCode() + (n1.class.hashCode() * 31);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(C6641v.l1(this.f51056a), objArr);
        } catch (InvocationTargetException e10) {
            throw e10.getTargetException();
        }
    }
}
