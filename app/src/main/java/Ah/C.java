package Ah;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.ProtectionDomain;

/* loaded from: classes2.dex */
public abstract class C implements J, E {

    /* renamed from: a  reason: collision with root package name */
    public final Method f875a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f876b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f877c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f878d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f879e;

    public C(Method method, Method method2, Method method3, Method method4, Method method5) {
        this.f875a = method;
        this.f876b = method2;
        this.f877c = method3;
        this.f878d = method4;
        this.f879e = method5;
    }

    public static C h() {
        Method method;
        Method method2;
        Method declaredMethod;
        Method method3 = null;
        if (Sh.E.b()) {
            try {
                method3 = ClassLoader.class.getMethod("getDefinedPackage", String.class);
            } catch (NoSuchMethodException unused) {
            }
        }
        Method declaredMethod2 = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
        declaredMethod2.setAccessible(true);
        Method declaredMethod3 = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
        declaredMethod3.setAccessible(true);
        Class cls = Integer.TYPE;
        Method declaredMethod4 = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls, cls, ProtectionDomain.class);
        declaredMethod4.setAccessible(true);
        Method declaredMethod5 = ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class);
        declaredMethod5.setAccessible(true);
        try {
            declaredMethod = ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class);
            declaredMethod.setAccessible(true);
            method2 = declaredMethod4;
            method = declaredMethod3;
        } catch (NoSuchMethodException unused2) {
            method2 = declaredMethod4;
            method = declaredMethod3;
        }
        try {
            return new A(declaredMethod3, declaredMethod4, method3, declaredMethod2, declaredMethod5, declaredMethod);
        } catch (NoSuchMethodException unused3) {
            return new C(method, method2, method3, declaredMethod2, declaredMethod5);
        }
    }

    @Override // Ah.E
    public final J a() {
        E e10 = L.f894j;
        throw null;
    }

    @Override // Ah.J
    public final Class b(ClassLoader classLoader, String str) {
        try {
            return (Class) this.f875a.invoke(classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Package c(ClassLoader classLoader, String str) {
        try {
            return (Package) this.f878d.invoke(classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Class d(ClassLoader classLoader, String str, ProtectionDomain protectionDomain, byte[] bArr) {
        try {
            return (Class) this.f876b.invoke(classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Package e(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
        try {
            return (Package) this.f879e.invoke(classLoader, str, str2, str3, str4, str5, str6, str7, url);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f875a.equals(c10.f875a) && this.f876b.equals(c10.f876b) && this.f877c.equals(c10.f877c) && this.f878d.equals(c10.f878d) && this.f879e.equals(c10.f879e)) {
            return true;
        }
        return false;
    }

    @Override // Ah.J
    public final Package f(ClassLoader classLoader, String str) {
        Method method = this.f877c;
        if (method == null) {
            return c(classLoader, str);
        }
        try {
            return (Package) method.invoke(classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    public int hashCode() {
        int hashCode = this.f875a.hashCode();
        int hashCode2 = this.f876b.hashCode();
        int hashCode3 = this.f877c.hashCode();
        int hashCode4 = this.f878d.hashCode();
        return this.f879e.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
