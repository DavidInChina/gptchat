package Gf;

import Mf.AbstractC0994c;
import Mf.AbstractC1003l;
import Sf.AbstractC1385d;
import id.AbstractC3557B;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kg.C4291c;
import kg.C4294f;
import kotlin.jvm.internal.AbstractC4306e;

/* loaded from: classes2.dex */
public abstract class H implements AbstractC4306e {

    /* renamed from: Y  reason: collision with root package name */
    public static final Lg.i f6342Y = new Lg.i("<v#(\\d+)>");

    public static Method u(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Class l22;
        Method u10;
        if (z10) {
            clsArr[0] = cls;
        }
        Method x10 = x(cls, str, clsArr, cls2);
        if (x10 != null) {
            return x10;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (u10 = u(superclass, str, clsArr, cls2, z10)) != null) {
            return u10;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC3557B.b0("getInterfaces(...)", interfaces);
        for (Class<?> cls3 : interfaces) {
            AbstractC3557B.Z(cls3);
            Method u11 = u(cls3, str, clsArr, cls2, z10);
            if (u11 != null) {
                return u11;
            }
            if (z10 && (l22 = R4.b.l2(AbstractC1385d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method x11 = x(l22, str, clsArr, cls2);
                if (x11 != null) {
                    return x11;
                }
            }
        }
        return null;
    }

    public static Constructor w(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method x(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC3557B.K(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC3557B.b0("getDeclaredMethods(...)", declaredMethods);
            for (Method method : declaredMethods) {
                if (AbstractC3557B.K(method.getName(), str) && AbstractC3557B.K(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void g(String str, ArrayList arrayList, boolean z10) {
        ArrayList t10 = t(str);
        arrayList.addAll(t10);
        int size = (t10.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls = Integer.TYPE;
            AbstractC3557B.b0("TYPE", cls);
            arrayList.add(cls);
        }
        if (z10) {
            arrayList.remove(kotlin.jvm.internal.g.class);
            arrayList.add(kotlin.jvm.internal.g.class);
            return;
        }
        arrayList.add(Object.class);
    }

    public final Method h(String str, String str2) {
        Method u10;
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("desc", str2);
        if (AbstractC3557B.K(str, "<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) t(str2).toArray(new Class[0]);
        Class v10 = v(Lg.n.k2(str2, ')', 0, false, 6) + 1, str2.length(), str2);
        Method u11 = u(n(), str, clsArr, v10, false);
        if (u11 != null) {
            return u11;
        }
        if (!n().isInterface() || (u10 = u(Object.class, str, clsArr, v10, false)) == null) {
            return null;
        }
        return u10;
    }

    public abstract Collection j();

    public abstract Collection k(C4294f c4294f);

    public abstract Mf.P l(int i10);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m(ug.n nVar, E e10) {
        AbstractC0644s abstractC0644s;
        boolean z10;
        AbstractC3557B.c0("scope", nVar);
        C0631e c0631e = new C0631e(this);
        ArrayList arrayList = new ArrayList();
        for (AbstractC1003l abstractC1003l : Bi.c.Q0(nVar, null, 3)) {
            if (abstractC1003l instanceof AbstractC0994c) {
                AbstractC0994c abstractC0994c = (AbstractC0994c) abstractC1003l;
                if (!AbstractC3557B.K(abstractC0994c.getVisibility(), Mf.r.f12108h)) {
                    boolean z11 = false;
                    if (abstractC0994c.e() != 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (e10 == E.f6338Y) {
                        z11 = true;
                    }
                    if (z10 == z11) {
                        abstractC0644s = (AbstractC0644s) abstractC1003l.u0(c0631e, jf.y.f36177a);
                        if (abstractC0644s == null) {
                            arrayList.add(abstractC0644s);
                        }
                    }
                }
            }
            abstractC0644s = null;
            if (abstractC0644s == null) {
            }
        }
        return kf.t.K2(arrayList);
    }

    public Class n() {
        Class f6 = f();
        List list = AbstractC1385d.f16603a;
        AbstractC3557B.c0("<this>", f6);
        Class cls = (Class) AbstractC1385d.f16605c.get(f6);
        if (cls == null) {
            return f();
        }
        return cls;
    }

    public abstract Collection s(C4294f c4294f);

    public final ArrayList t(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (str.charAt(i11) != ')') {
            int i12 = i11;
            while (str.charAt(i12) == '[') {
                i12++;
            }
            char charAt = str.charAt(i12);
            if (Lg.n.a2("VZCBSIFJD", charAt)) {
                i10 = i12 + 1;
            } else if (charAt == 'L') {
                i10 = Lg.n.k2(str, ';', i11, false, 4) + 1;
            } else {
                throw new Lc.l("Unknown type prefix in the method signature: ".concat(str), 3);
            }
            arrayList.add(v(i11, i10, str));
            i11 = i10;
        }
        return arrayList;
    }

    public final Class v(int i10, int i11, String str) {
        char charAt = str.charAt(i10);
        if (charAt == 'L') {
            ClassLoader d10 = AbstractC1385d.d(f());
            String substring = str.substring(i10 + 1, i11 - 1);
            AbstractC3557B.b0("substring(...)", substring);
            Class<?> loadClass = d10.loadClass(Lg.n.z2(substring, '/', '.'));
            AbstractC3557B.b0("loadClass(...)", loadClass);
            return loadClass;
        } else if (charAt == '[') {
            Class v10 = v(i10 + 1, i11, str);
            C4291c c4291c = A0.f6330a;
            AbstractC3557B.c0("<this>", v10);
            return Array.newInstance(v10, 0).getClass();
        } else if (charAt == 'V') {
            Class cls = Void.TYPE;
            AbstractC3557B.b0("TYPE", cls);
            return cls;
        } else if (charAt == 'Z') {
            return Boolean.TYPE;
        } else {
            if (charAt == 'C') {
                return Character.TYPE;
            }
            if (charAt == 'B') {
                return Byte.TYPE;
            }
            if (charAt == 'S') {
                return Short.TYPE;
            }
            if (charAt == 'I') {
                return Integer.TYPE;
            }
            if (charAt == 'F') {
                return Float.TYPE;
            }
            if (charAt == 'J') {
                return Long.TYPE;
            }
            if (charAt == 'D') {
                return Double.TYPE;
            }
            throw new Lc.l("Unknown type prefix in the method signature: ".concat(str), 3);
        }
    }
}
