package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2070e {

    /* renamed from: c  reason: collision with root package name */
    public static final C2070e f25360c = new C2070e();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f25361a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f25362b = new HashMap();

    public static void c(HashMap hashMap, C2069d c2069d, EnumC2081p enumC2081p, Class cls) {
        EnumC2081p enumC2081p2 = (EnumC2081p) hashMap.get(c2069d);
        if (enumC2081p2 != null && enumC2081p != enumC2081p2) {
            Method method = c2069d.f25358b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC2081p2 + ", new value " + enumC2081p);
        } else if (enumC2081p2 == null) {
            hashMap.put(c2069d, enumC2081p);
        }
    }

    public final C2068c a(Class cls, Method[] methodArr) {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f25356b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f25356b.entrySet()) {
                c(hashMap, (C2069d) entry.getKey(), (EnumC2081p) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            G g10 = (G) method.getAnnotation(G.class);
            if (g10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (AbstractC2086v.class.isAssignableFrom(parameterTypes[0])) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                EnumC2081p value = g10.value();
                if (parameterTypes.length > 1) {
                    if (EnumC2081p.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC2081p.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C2069d(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C2068c c2068c = new C2068c(hashMap);
        this.f25361a.put(cls, c2068c);
        this.f25362b.put(cls, Boolean.valueOf(z10));
        return c2068c;
    }

    public final C2068c b(Class cls) {
        C2068c c2068c = (C2068c) this.f25361a.get(cls);
        if (c2068c != null) {
            return c2068c;
        }
        return a(cls, null);
    }
}
