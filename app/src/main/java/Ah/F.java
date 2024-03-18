package Ah;

import Bh.EnumC0237c;
import Bh.EnumC0255l;
import Sh.EnumC1400f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.ProtectionDomain;
import ph.C5189a;
import yh.C6641v;
import zh.AbstractC6868B;
import zh.AbstractC6869C;
import zh.AbstractC6885m;
import zh.AbstractC6887o;
import zh.C6870D;

/* loaded from: classes2.dex */
public final class F implements J, E {

    /* renamed from: a  reason: collision with root package name */
    public final Object f881a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f882b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f883c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f884d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f885e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f886f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f887g;

    public F(Object obj, Method method, Method method2, Method method3, Method method4, Method method5, Method method6) {
        this.f881a = obj;
        this.f882b = method;
        this.f883c = method2;
        this.f884d = method3;
        this.f885e = method4;
        this.f886f = method5;
        this.f887g = method6;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(13:26|8|10|(1:12)|28|13|30|14|15|19|(1:21)(1:22)|23|24)|9|10|(0)|28|13|30|14|15|19|(0)(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0243, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0245, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0246, code lost:
        r4 = new xh.AbstractC6458a[r3];
        r4[0] = r10;
        r2 = ((zh.AbstractC6887o) r2).g("getClassLoadingLock", java.lang.Object.class, r4);
        r7 = new java.lang.reflect.Type[2];
        r7[0] = java.lang.ClassLoader.class;
        r7[r3] = java.lang.String.class;
        r2 = ((zh.u) r2).F0(r7).c(new Eh.C0502a());
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02d3  */
    /* JADX WARN: Type inference failed for: r3v32, types: [Ah.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static E h() {
        Method declaredMethod;
        Method method;
        if (Boolean.parseBoolean(System.getProperty("net.bytebuddy.safe", Boolean.toString(EnumC1400f.a().f16726Y)))) {
            return new D("Use of Unsafe was disabled by system property");
        }
        Class<?> cls = Class.forName("sun.misc.Unsafe");
        Field declaredField = cls.getDeclaredField("theUnsafe");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        if (Sh.E.b()) {
            try {
                declaredMethod = ClassLoader.class.getDeclaredMethod("getDefinedPackage", String.class);
            } catch (NoSuchMethodException unused) {
            }
            C5189a c5189a = new C5189a();
            AbstractC6869C j6 = new C5189a(c5189a.f43164a, c5189a.f43165b, c5189a.f43166c, Fh.m.f5394Y, 1, c5189a.f43169f, c5189a.f43170g, EnumC0255l.f2359Y, 2, zh.P.f52115Y, EnumC0237c.f2319Y, c5189a.f43172i).b(C6641v.l1(Object.class), Dh.f.f3715Y).j(ClassLoader.class.getName().concat("$ByteBuddyAccessor$V1"));
            xh.e eVar = xh.e.PUBLIC;
            zh.v g10 = ((AbstractC6887o) ((zh.u) ((AbstractC6887o) j6).g("findLoadedClass", Class.class, eVar)).F0(ClassLoader.class, String.class).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class)).g().f(1))).g("defineClass", Class.class, eVar);
            Class cls2 = Integer.TYPE;
            Type[] typeArr = {ClassLoader.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class};
            AbstractC6868B c10 = ((zh.u) ((AbstractC6887o) ((zh.u) ((AbstractC6887o) ((zh.u) g10).F0(ClassLoader.class, String.class, byte[].class, cls2, cls2, ProtectionDomain.class).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls2, cls2, ProtectionDomain.class)).g().f(1, 2, 3, 4, 5))).g("getPackage", Package.class, eVar)).F0(ClassLoader.class, String.class).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("getPackage", String.class)).g().f(1))).g("definePackage", Package.class, eVar)).F0(typeArr).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class)).g().f(1, 2, 3, 4, 5, 6, 7, 8));
            if (declaredMethod != null) {
                c10 = ((zh.u) ((AbstractC6887o) c10).g("getDefinedPackage", Package.class, eVar)).F0(ClassLoader.class, String.class).c(Eh.b0.a(declaredMethod).g().f(1));
            }
            AbstractC6868B abstractC6868B = ((zh.u) ((AbstractC6887o) c10).g("getClassLoadingLock", Object.class, eVar)).F0(ClassLoader.class, String.class).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class)).g().f(1));
            C6870D i10 = ((AbstractC6885m) abstractC6868B).d().i(null, new Object());
            Class cls3 = (Class) i10.f52104j0.get(i10.f52106Y);
            Object invoke = cls.getMethod("allocateInstance", Class.class).invoke(obj, cls3);
            Method method2 = cls3.getMethod("findLoadedClass", ClassLoader.class, String.class);
            Class<?> cls4 = Integer.TYPE;
            Method method3 = cls3.getMethod("defineClass", ClassLoader.class, String.class, byte[].class, cls4, cls4, ProtectionDomain.class);
            if (declaredMethod != null) {
                method = cls3.getMethod("getDefinedPackage", ClassLoader.class, String.class);
            } else {
                method = null;
            }
            return new F(invoke, method2, method3, method, cls3.getMethod("getPackage", ClassLoader.class, String.class), cls3.getMethod("definePackage", ClassLoader.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class), cls3.getMethod("getClassLoadingLock", ClassLoader.class, String.class));
        }
        declaredMethod = null;
        C5189a c5189a2 = new C5189a();
        AbstractC6869C j62 = new C5189a(c5189a2.f43164a, c5189a2.f43165b, c5189a2.f43166c, Fh.m.f5394Y, 1, c5189a2.f43169f, c5189a2.f43170g, EnumC0255l.f2359Y, 2, zh.P.f52115Y, EnumC0237c.f2319Y, c5189a2.f43172i).b(C6641v.l1(Object.class), Dh.f.f3715Y).j(ClassLoader.class.getName().concat("$ByteBuddyAccessor$V1"));
        xh.e eVar2 = xh.e.PUBLIC;
        zh.v g102 = ((AbstractC6887o) ((zh.u) ((AbstractC6887o) j62).g("findLoadedClass", Class.class, eVar2)).F0(ClassLoader.class, String.class).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class)).g().f(1))).g("defineClass", Class.class, eVar2);
        Class cls22 = Integer.TYPE;
        Type[] typeArr2 = {ClassLoader.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class};
        AbstractC6868B c102 = ((zh.u) ((AbstractC6887o) ((zh.u) ((AbstractC6887o) ((zh.u) g102).F0(ClassLoader.class, String.class, byte[].class, cls22, cls22, ProtectionDomain.class).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls22, cls22, ProtectionDomain.class)).g().f(1, 2, 3, 4, 5))).g("getPackage", Package.class, eVar2)).F0(ClassLoader.class, String.class).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("getPackage", String.class)).g().f(1))).g("definePackage", Package.class, eVar2)).F0(typeArr2).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class)).g().f(1, 2, 3, 4, 5, 6, 7, 8));
        if (declaredMethod != null) {
        }
        AbstractC6868B abstractC6868B2 = ((zh.u) ((AbstractC6887o) c102).g("getClassLoadingLock", Object.class, eVar2)).F0(ClassLoader.class, String.class).c(Eh.b0.a(ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class)).g().f(1));
        C6870D i102 = ((AbstractC6885m) abstractC6868B2).d().i(null, new Object());
        Class cls32 = (Class) i102.f52104j0.get(i102.f52106Y);
        Object invoke2 = cls.getMethod("allocateInstance", Class.class).invoke(obj, cls32);
        Method method22 = cls32.getMethod("findLoadedClass", ClassLoader.class, String.class);
        Class<?> cls42 = Integer.TYPE;
        Method method32 = cls32.getMethod("defineClass", ClassLoader.class, String.class, byte[].class, cls42, cls42, ProtectionDomain.class);
        if (declaredMethod != null) {
        }
        return new F(invoke2, method22, method32, method, cls32.getMethod("getPackage", ClassLoader.class, String.class), cls32.getMethod("definePackage", ClassLoader.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class), cls32.getMethod("getClassLoadingLock", ClassLoader.class, String.class));
    }

    @Override // Ah.E
    public final J a() {
        E e10 = L.f894j;
        throw null;
    }

    @Override // Ah.J
    public final Class b(ClassLoader classLoader, String str) {
        try {
            return (Class) this.f882b.invoke(this.f881a, classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Package c(ClassLoader classLoader, String str) {
        try {
            return (Package) this.f885e.invoke(this.f881a, classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Class d(ClassLoader classLoader, String str, ProtectionDomain protectionDomain, byte[] bArr) {
        try {
            return (Class) this.f883c.invoke(this.f881a, classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Package e(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
        try {
            return (Package) this.f886f.invoke(this.f881a, classLoader, str, str2, str3, str4, str5, str6, str7, url);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f6 = (F) obj;
        if (this.f881a.equals(f6.f881a) && this.f882b.equals(f6.f882b) && this.f883c.equals(f6.f883c) && this.f884d.equals(f6.f884d) && this.f885e.equals(f6.f885e) && this.f886f.equals(f6.f886f) && this.f887g.equals(f6.f887g)) {
            return true;
        }
        return false;
    }

    @Override // Ah.J
    public final Package f(ClassLoader classLoader, String str) {
        Method method = this.f884d;
        if (method == null) {
            return c(classLoader, str);
        }
        try {
            return (Package) method.invoke(this.f881a, classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    @Override // Ah.J
    public final Object g(ClassLoader classLoader, String str) {
        try {
            return this.f887g.invoke(this.f881a, classLoader, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    public final int hashCode() {
        int hashCode = this.f881a.hashCode();
        int hashCode2 = this.f882b.hashCode();
        int hashCode3 = this.f883c.hashCode();
        int hashCode4 = this.f884d.hashCode();
        int hashCode5 = this.f885e.hashCode();
        int hashCode6 = this.f886f.hashCode();
        return this.f887g.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (F.class.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
