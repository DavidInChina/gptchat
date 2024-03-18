package th;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import wh.AbstractC6240e;
import yh.C6641v;

/* renamed from: th.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5794b implements InvocationHandler {

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f46207d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public final Class f46208a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f46209b;

    /* renamed from: c  reason: collision with root package name */
    public transient /* synthetic */ int f46210c;

    public C5794b(Class cls, LinkedHashMap linkedHashMap) {
        this.f46208a = cls;
        this.f46209b = linkedHashMap;
    }

    public static Annotation a(ClassLoader classLoader, Class cls, Map map) {
        Method[] declaredMethods;
        h0 h0Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Method method : cls.getDeclaredMethods()) {
            h0 h0Var2 = (h0) map.get(method.getName());
            if (h0Var2 == null) {
                Object defaultValue = method.getDefaultValue();
                if (defaultValue == null) {
                    h0Var = new C5787T(1, new C6641v(method.getDeclaringClass()), method.getName());
                } else {
                    h0Var = C5795c.i(method.getReturnType(), defaultValue);
                }
                linkedHashMap.put(method, h0Var.a(classLoader));
            } else {
                AbstractC6240e abstractC6240e = new AbstractC6240e(method);
                linkedHashMap.put(method, ((AbstractC5809q) h0Var2).d(abstractC6240e, abstractC6240e.getReturnType()).a(classLoader));
            }
        }
        return (Annotation) Proxy.newProxyInstance(classLoader, new Class[]{cls}, new C5794b(cls, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5794b)) {
            return false;
        }
        C5794b c5794b = (C5794b) obj;
        if (!this.f46208a.equals(c5794b.f46208a)) {
            return false;
        }
        for (Map.Entry entry : this.f46209b.entrySet()) {
            if (!((a0) entry.getValue()).equals(c5794b.f46209b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        if (this.f46210c != 0) {
            i10 = 0;
        } else {
            LinkedHashMap linkedHashMap = this.f46209b;
            int hashCode = linkedHashMap.hashCode() + (this.f46208a.hashCode() * 31);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                hashCode = (hashCode * 31) + entry.getValue().hashCode();
            }
            i10 = hashCode;
        }
        if (i10 == 0) {
            return this.f46210c;
        }
        this.f46210c = i10;
        return i10;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?> declaringClass = method.getDeclaringClass();
        LinkedHashMap linkedHashMap = this.f46209b;
        Class<?> cls = this.f46208a;
        if (declaringClass != cls) {
            boolean z10 = true;
            int i10 = 0;
            if (method.getName().equals("hashCode")) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((a0) entry.getValue()).a() != 1) {
                        i10 += ((a0) entry.getValue()).hashCode() ^ (((Method) entry.getKey()).getName().hashCode() * 127);
                    }
                }
                return Integer.valueOf(i10);
            } else if (method.getName().equals("equals") && method.getParameterTypes().length == 1) {
                Object obj2 = objArr[0];
                if (obj != obj2) {
                    if (cls.isInstance(obj2)) {
                        if (Proxy.isProxyClass(obj2.getClass())) {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj2);
                            if (invocationHandler instanceof C5794b) {
                                z10 = invocationHandler.equals(this);
                            }
                        }
                        try {
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (!((a0) entry2.getValue()).b(((Method) entry2.getKey()).invoke(obj2, f46207d))) {
                                }
                            }
                        } catch (IllegalAccessException e10) {
                            throw new IllegalStateException("Could not access annotation property", e10);
                        } catch (RuntimeException | InvocationTargetException unused) {
                        }
                    }
                    z10 = false;
                    break;
                }
                return Boolean.valueOf(z10);
            } else if (method.getName().equals("toString")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                EnumC5801i.f46224Y.b(sb2, C6641v.l1(cls));
                sb2.append('(');
                boolean z11 = true;
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    if (((a0) entry3.getValue()).a() != 1) {
                        if (z11) {
                            z11 = false;
                        } else {
                            sb2.append(", ");
                        }
                        EnumC5801i.f46224Y.a(sb2, ((Method) entry3.getKey()).getName(), linkedHashMap.entrySet().size());
                        sb2.append(((a0) entry3.getValue()).toString());
                    }
                }
                sb2.append(')');
                return sb2.toString();
            } else if (method.getName().equals("annotationType")) {
                return cls;
            } else {
                throw new IllegalStateException("Unexpected method: " + method);
            }
        }
        return ((a0) linkedHashMap.get(method)).c();
    }
}
