package Sf;

import M3.H;
import bg.AbstractC2207o;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class C extends y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16591a;

    public C(Object obj) {
        AbstractC3557B.c0("recordComponent", obj);
        this.f16591a = obj;
    }

    @Override // Sf.y
    public final Member a() {
        Object obj = this.f16591a;
        AbstractC3557B.c0("recordComponent", obj);
        C3636c1 c3636c1 = H.f11533g;
        Method method = null;
        if (c3636c1 == null) {
            Class<?> cls = obj.getClass();
            try {
                c3636c1 = new C3636c1(cls.getMethod("getType", new Class[0]), 24, cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c3636c1 = new C3636c1((Object) null, 24, (Object) null);
            }
            H.f11533g = c3636c1;
        }
        Method method2 = (Method) c3636c1.f34286h0;
        if (method2 != null) {
            Object invoke = method2.invoke(obj, new Object[0]);
            AbstractC3557B.a0("null cannot be cast to non-null type java.lang.reflect.Method", invoke);
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final AbstractC2207o e() {
        Object obj = this.f16591a;
        AbstractC3557B.c0("recordComponent", obj);
        C3636c1 c3636c1 = H.f11533g;
        Class cls = null;
        if (c3636c1 == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c3636c1 = new C3636c1(cls2.getMethod("getType", new Class[0]), 24, cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c3636c1 = new C3636c1((Object) null, 24, (Object) null);
            }
            H.f11533g = c3636c1;
        }
        Method method = (Method) c3636c1.f34285Z;
        if (method != null) {
            Object invoke = method.invoke(obj, new Object[0]);
            AbstractC3557B.a0("null cannot be cast to non-null type java.lang.Class<*>", invoke);
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new s(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
