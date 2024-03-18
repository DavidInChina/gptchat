package androidx.lifecycle;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import l8.AbstractC4344b;

/* renamed from: androidx.lifecycle.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2090z {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f25394a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f25395b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            AbstractC3557B.b0("{\n            constructo\u2026tance(`object`)\n        }", newInstance);
            android.gov.nist.core.a.u(newInstance);
            throw null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        if (r8.booleanValue() != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Class cls) {
        Constructor constructor;
        String str;
        int i10 = 0;
        int i11 = 1;
        HashMap hashMap = f25394a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r42 != null) {
                    str = r42.getName();
                } else {
                    str = "";
                }
                AbstractC3557B.b0("fullPackage", str);
                if (str.length() != 0) {
                    AbstractC3557B.b0("name", canonicalName);
                    canonicalName = canonicalName.substring(str.length() + 1);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", canonicalName);
                }
                AbstractC3557B.b0("if (fullPackage.isEmpty(\u2026g(fullPackage.length + 1)", canonicalName);
                String concat = Lg.n.A2(canonicalName, Separators.DOT, "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f25395b;
            if (constructor != null) {
                hashMap2.put(cls, AbstractC4344b.F0(constructor));
            } else {
                C2070e c2070e = C2070e.f25360c;
                HashMap hashMap3 = c2070e.f25362b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool == null) {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (((G) method.getAnnotation(G.class)) != null) {
                                c2070e.a(cls, declaredMethods);
                                break;
                            }
                        }
                        hashMap3.put(cls, Boolean.FALSE);
                        Class superclass = cls.getSuperclass();
                        if (superclass != null && AbstractC2085u.class.isAssignableFrom(superclass)) {
                            AbstractC3557B.b0("superclass", superclass);
                            if (b(superclass) != 1) {
                                Object obj = hashMap2.get(superclass);
                                AbstractC3557B.Z(obj);
                                arrayList = new ArrayList((Collection) obj);
                            }
                        }
                        Class<?>[] interfaces = cls.getInterfaces();
                        AbstractC3557B.b0("klass.interfaces", interfaces);
                        int length = interfaces.length;
                        while (true) {
                            if (i10 < length) {
                                Class<?> cls2 = interfaces[i10];
                                if (cls2 != null && AbstractC2085u.class.isAssignableFrom(cls2)) {
                                    AbstractC3557B.b0("intrface", cls2);
                                    if (b(cls2) == 1) {
                                        break;
                                    }
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj2 = hashMap2.get(cls2);
                                    AbstractC3557B.Z(obj2);
                                    arrayList.addAll((Collection) obj2);
                                }
                                i10++;
                            } else if (arrayList != null) {
                                hashMap2.put(cls, arrayList);
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
            }
            i11 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i11));
        return i11;
    }
}
