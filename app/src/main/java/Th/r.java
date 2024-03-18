package Th;

import Sh.EnumC1400f;
import Sh.H;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r extends ClassLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17311a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f17312b = new Class[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f17313c = new Object[0];

    static {
        String str;
        Object obj;
        try {
            Uh.b bVar = new Uh.b("net.bytebuddy.dump");
            if (y.f17320l0) {
                obj = AccessController.doPrivileged(bVar);
            } else {
                obj = bVar.run();
            }
            str = (String) obj;
        } catch (Throwable unused) {
            str = null;
        }
        f17311a = str;
    }

    public r(Class cls) {
        super(cls.getClassLoader());
        y.f17318j0.a(cls, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Th.c] */
    public static c a() {
        Nh.d dVar = new Nh.d(null, 0);
        dVar.a(ph.f.f43189k0.f43205Y, 1, Nh.r.k(c.class) + "$Dispatcher", null, Nh.r.k(Object.class), new String[]{Nh.r.k(c.class)});
        EnumC1400f a5 = EnumC1400f.a();
        Method[] methods = c.class.getMethods();
        a5.b(methods, H.f16700Y);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            int i11 = 1;
            if (i10 >= length) {
                break;
            }
            Method method = methods[i10];
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            String[] strArr = new String[exceptionTypes.length];
            for (int i12 = 0; i12 < exceptionTypes.length; i12++) {
                strArr[i12] = Nh.r.k(exceptionTypes[i12]);
            }
            Nh.l m10 = dVar.m(1, method.getName(), Nh.r.m(method), null, strArr);
            Nh.r[] rVarArr = new Nh.r[method.getParameterTypes().length - 1];
            for (int i13 = 0; i13 < method.getParameterTypes().length; i13++) {
                Nh.r t10 = Nh.r.t(method.getParameterTypes()[i13]);
                if (i13 > 0) {
                    rVarArr[i13 - 1] = t10;
                }
                m10.I(t10.p(21), i11);
                i11 += t10.r();
            }
            m10.z(182, Nh.r.k(method.getParameterTypes()[0]), method.getName(), Nh.r.l(Nh.r.t(method.getReturnType()), rVarArr), false);
            m10.n(Nh.r.t(method.getReturnType()).p(172));
            m10.y(Math.max(i11 - 1, Nh.r.t(method.getReturnType()).r()), i11);
            i10++;
        }
        Nh.r rVar = Nh.r.f13211e;
        Nh.l m11 = dVar.m(1, "<init>", Nh.r.l(rVar, new Nh.r[0]), null, null);
        m11.I(25, 0);
        m11.z(183, Nh.r.k(Object.class), "<init>", Nh.r.l(rVar, new Nh.r[0]), false);
        m11.n(177);
        m11.y(1, 1);
        byte[] C10 = dVar.C();
        try {
            String property = System.getProperty("net.bytebuddy.dump");
            if (property != null) {
                File file = new File(property, c.class.getName() + "$Dispatcher.class");
                io.sentry.instrumentation.file.e p10 = r.f.p(new FileOutputStream(file), file);
                p10.write(C10);
                p10.close();
            }
        } catch (Throwable unused) {
        }
        try {
            return (c) new r(c.class).defineClass(c.class.getName() + "$Dispatcher", C10, 0, C10.length, y.class.getProtectionDomain()).getConstructor(f17312b).newInstance(f17313c);
        } catch (UnsupportedOperationException unused2) {
            return new Object();
        } catch (Exception e10) {
            throw new IllegalStateException("Failed to create invoker for ".concat(c.class.getName()), e10);
        }
    }

    public static Object b(Class cls, HashMap hashMap) {
        Exception e10;
        Nh.d dVar = new Nh.d(null, 0);
        dVar.a(ph.f.f43189k0.f43205Y, 1, Nh.r.k(cls) + "$Proxy", null, Nh.r.k(Object.class), new String[]{Nh.r.k(cls)});
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            int i10 = 1;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Class<?>[] exceptionTypes = ((Method) entry.getKey()).getExceptionTypes();
            String[] strArr = new String[exceptionTypes.length];
            for (int i11 = 0; i11 < exceptionTypes.length; i11++) {
                strArr[i11] = Nh.r.k(exceptionTypes[i11]);
            }
            Nh.l m10 = dVar.m(1, ((Method) entry.getKey()).getName(), Nh.r.m((Method) entry.getKey()), null, strArr);
            if ((((Method) entry.getKey()).getModifiers() & 8) != 0) {
                i10 = 0;
            }
            for (Class<?> cls2 : ((Method) entry.getKey()).getParameterTypes()) {
                i10 += Nh.r.t(cls2).r();
            }
            m10.y(((m) entry.getValue()).a((Nh.m) m10, (Method) entry.getKey()), i10);
        }
        Nh.r rVar = Nh.r.f13211e;
        Nh.l m11 = dVar.m(1, "<init>", Nh.r.l(rVar, new Nh.r[0]), null, null);
        m11.I(25, 0);
        m11.z(183, Nh.r.k(Object.class), "<init>", Nh.r.l(rVar, new Nh.r[0]), false);
        m11.n(177);
        m11.y(1, 1);
        byte[] C10 = dVar.C();
        String str = f17311a;
        if (str != null) {
            try {
                File file = new File(str, cls.getName() + "$Proxy.class");
                io.sentry.instrumentation.file.e p10 = r.f.p(new FileOutputStream(file), file);
                p10.write(C10);
                p10.close();
            } catch (Throwable unused) {
            }
        }
        try {
        } catch (Exception e11) {
            e10 = e11;
        }
        try {
            return new r(cls).defineClass(cls.getName() + "$Proxy", C10, 0, C10.length, y.class.getProtectionDomain()).getConstructor(f17312b).newInstance(f17313c);
        } catch (Exception e12) {
            e10 = e12;
            throw new IllegalStateException("Failed to create proxy for ".concat(cls.getName()), e10);
        }
    }
}
