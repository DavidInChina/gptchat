package Ah;

import Qh.C1223a;
import Sh.EnumC1400f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.ProtectionDomain;
import ph.C5189a;
import rh.C5498e;
import zh.AbstractC6887o;
import zh.C6870D;

/* loaded from: classes2.dex */
public abstract class I implements J, E {

    /* renamed from: a  reason: collision with root package name */
    public final Method f889a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f890b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f891c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f892d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f893e;

    public I(Method method, Method method2, Method method3, Method method4, Method method5) {
        this.f889a = method;
        this.f890b = method2;
        this.f891c = method3;
        this.f892d = method4;
        this.f893e = method5;
    }

    public static E h() {
        Field field;
        Method method;
        Method declaredMethod;
        Method declaredMethod2;
        Method declaredMethod3;
        Method declaredMethod4;
        if (Boolean.parseBoolean(System.getProperty("net.bytebuddy.safe", Boolean.toString(EnumC1400f.a().f16726Y)))) {
            return new D("Use of Unsafe was disabled by system property");
        }
        Class<?> cls = Class.forName("sun.misc.Unsafe");
        Field declaredField = cls.getDeclaredField("theUnsafe");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            C6870D i10 = ((AbstractC6887o) new C5189a().a().j("net.bytebuddy.mirror.AccessibleObject")).b(zh.H.f52110a).f(new C5498e(C1223a.d(false), C1223a.d(false).c(C1223a.d(true)))).d().i(AccessibleObject.class.getClassLoader(), Y.WRAPPER.f922Y.a(AccessibleObject.class.getProtectionDomain()));
            field = ((Class) i10.f52104j0.get(i10.f52106Y)).getDeclaredField("override");
        }
        Long l10 = (Long) cls.getMethod("objectFieldOffset", Field.class).invoke(obj, field);
        l10.getClass();
        Method method2 = cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
        try {
            if (Sh.E.b()) {
                try {
                    method = ClassLoader.class.getMethod("getDefinedPackage", String.class);
                } catch (NoSuchMethodException unused2) {
                }
                declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                Boolean bool = Boolean.TRUE;
                method2.invoke(obj, declaredMethod, l10, bool);
                declaredMethod2 = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
                Class cls2 = Integer.TYPE;
                declaredMethod3 = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls2, cls2, ProtectionDomain.class);
                declaredMethod4 = ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class);
                method2.invoke(obj, declaredMethod3, l10, bool);
                method2.invoke(obj, declaredMethod2, l10, bool);
                method2.invoke(obj, declaredMethod4, l10, bool);
                Method declaredMethod5 = ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class);
                method2.invoke(obj, declaredMethod5, l10, bool);
                return new G(declaredMethod2, declaredMethod3, method, declaredMethod, declaredMethod4, declaredMethod5);
            }
            Method declaredMethod52 = ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class);
            method2.invoke(obj, declaredMethod52, l10, bool);
            return new G(declaredMethod2, declaredMethod3, method, declaredMethod, declaredMethod4, declaredMethod52);
        } catch (NoSuchMethodException unused3) {
            return new I(declaredMethod2, declaredMethod3, method, declaredMethod, declaredMethod4);
        }
        method = null;
        declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
        Boolean bool2 = Boolean.TRUE;
        method2.invoke(obj, declaredMethod, l10, bool2);
        declaredMethod2 = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
        Class cls22 = Integer.TYPE;
        declaredMethod3 = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls22, cls22, ProtectionDomain.class);
        declaredMethod4 = ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class);
        method2.invoke(obj, declaredMethod3, l10, bool2);
        method2.invoke(obj, declaredMethod2, l10, bool2);
        method2.invoke(obj, declaredMethod4, l10, bool2);
    }

    @Override // Ah.E
    public final J a() {
        E e10 = L.f894j;
        throw null;
    }

    @Override // Ah.J
    public final Class b(ClassLoader classLoader, String str) {
        try {
            return (Class) this.f889a.invoke(classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Package c(ClassLoader classLoader, String str) {
        try {
            return (Package) this.f892d.invoke(classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Class d(ClassLoader classLoader, String str, ProtectionDomain protectionDomain, byte[] bArr) {
        try {
            return (Class) this.f890b.invoke(classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Package e(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
        try {
            return (Package) this.f893e.invoke(classLoader, str, str2, str3, str4, str5, str6, str7, url);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Package f(ClassLoader classLoader, String str) {
        Method method = this.f891c;
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
}
