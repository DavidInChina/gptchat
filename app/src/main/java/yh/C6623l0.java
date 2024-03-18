package yh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import yh.l1;

/* renamed from: yh.l0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6623l0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Class f51038a;

    public C6623l0(Class cls) {
        this.f51038a = cls;
    }

    public static l1.a a(Class cls) {
        return (l1.a) Proxy.newProxyInstance(l1.a.class.getClassLoader(), new Class[]{l1.a.class}, new C6623l0(cls));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6623l0.class != obj.getClass()) {
            return false;
        }
        if (this.f51038a.equals(((C6623l0) obj).f51038a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51038a.hashCode() + (C6623l0.class.hashCode() * 31);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(C6633q0.i1(this.f51038a), objArr);
        } catch (InvocationTargetException e10) {
            throw e10.getTargetException();
        }
    }
}
