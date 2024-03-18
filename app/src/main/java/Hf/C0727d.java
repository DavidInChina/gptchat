package Hf;

import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import jf.AbstractC3957g;
import jf.C3963m;

/* renamed from: Hf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727d implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Class f7708a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f7709b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3957g f7710c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC3957g f7711d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7712e;

    public C0727d(Class cls, Map map, C3963m c3963m, C3963m c3963m2, List list) {
        this.f7708a = cls;
        this.f7709b = map;
        this.f7710c = c3963m;
        this.f7711d = c3963m2;
        this.f7712e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Annotation annotation;
        boolean z10;
        Class cls = this.f7708a;
        AbstractC3557B.c0("$annotationClass", cls);
        Map map = this.f7709b;
        AbstractC3557B.c0("$values", map);
        AbstractC3957g abstractC3957g = this.f7710c;
        AbstractC3557B.c0("$toString$delegate", abstractC3957g);
        AbstractC3957g abstractC3957g2 = this.f7711d;
        AbstractC3557B.c0("$hashCode$delegate", abstractC3957g2);
        List<Method> list = this.f7712e;
        AbstractC3557B.c0("$methods", list);
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) abstractC3957g2.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) abstractC3957g.getValue();
            }
        }
        boolean z11 = false;
        if (AbstractC3557B.K(name, "equals") && objArr != null && objArr.length == 1) {
            Object v32 = kf.q.v3(objArr);
            Class cls2 = null;
            if (v32 instanceof Annotation) {
                annotation = (Annotation) v32;
            } else {
                annotation = null;
            }
            if (annotation != null) {
                cls2 = R4.b.k1(R4.b.d1(annotation));
            }
            if (AbstractC3557B.K(cls2, cls)) {
                if (!list.isEmpty()) {
                    for (Method method2 : list) {
                        Object obj2 = map.get(method2.getName());
                        Object invoke = method2.invoke(v32, new Object[0]);
                        if (obj2 instanceof boolean[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.BooleanArray", invoke);
                            z10 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                            continue;
                        } else if (obj2 instanceof char[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.CharArray", invoke);
                            z10 = Arrays.equals((char[]) obj2, (char[]) invoke);
                            continue;
                        } else if (obj2 instanceof byte[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.ByteArray", invoke);
                            z10 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                            continue;
                        } else if (obj2 instanceof short[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.ShortArray", invoke);
                            z10 = Arrays.equals((short[]) obj2, (short[]) invoke);
                            continue;
                        } else if (obj2 instanceof int[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.IntArray", invoke);
                            z10 = Arrays.equals((int[]) obj2, (int[]) invoke);
                            continue;
                        } else if (obj2 instanceof float[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.FloatArray", invoke);
                            z10 = Arrays.equals((float[]) obj2, (float[]) invoke);
                            continue;
                        } else if (obj2 instanceof long[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.LongArray", invoke);
                            z10 = Arrays.equals((long[]) obj2, (long[]) invoke);
                            continue;
                        } else if (obj2 instanceof double[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.DoubleArray", invoke);
                            z10 = Arrays.equals((double[]) obj2, (double[]) invoke);
                            continue;
                        } else if (obj2 instanceof Object[]) {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<*>", invoke);
                            z10 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                            continue;
                        } else {
                            z10 = AbstractC3557B.K(obj2, invoke);
                            continue;
                        }
                        if (!z10) {
                            break;
                        }
                    }
                }
                z11 = true;
            }
            return Boolean.valueOf(z11);
        } else if (map.containsKey(name)) {
            return map.get(name);
        } else {
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(kf.q.z3(objArr));
            sb2.append(')');
            throw new Lc.l(sb2.toString(), 3);
        }
    }
}
