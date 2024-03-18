package Gf;

import id.AbstractC3557B;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import oe.C4992a;
import wf.AbstractC6216a;

/* renamed from: Gf.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0628b0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6397Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c0 f6398Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0628b0(c0 c0Var, int i10) {
        super(0);
        this.f6397Y = i10;
        this.f6398Z = c0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Object obj;
        AccessibleObject accessibleObject;
        int i10 = this.f6397Y;
        c0 c0Var = this.f6398Z;
        switch (i10) {
            case 0:
                return new C0626a0(c0Var);
            default:
                Member w10 = c0Var.w();
                try {
                    Object obj2 = p0.f6447r0;
                    if (c0Var.v()) {
                        obj = r.f.l(c0Var.f6451o0, c0Var.s());
                    } else {
                        obj = null;
                    }
                    if (obj == obj2) {
                        obj = null;
                    }
                    c0Var.v();
                    if (w10 instanceof AccessibleObject) {
                        accessibleObject = (AccessibleObject) w10;
                    } else {
                        accessibleObject = null;
                    }
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(R4.b.s1(c0Var));
                    }
                    if (w10 == null) {
                        return null;
                    }
                    if (w10 instanceof Field) {
                        return ((Field) w10).get(obj);
                    }
                    if (w10 instanceof Method) {
                        int length = ((Method) w10).getParameterTypes().length;
                        if (length != 0) {
                            if (length != 1) {
                                if (length == 2) {
                                    Method method = (Method) w10;
                                    Class<?> cls = ((Method) w10).getParameterTypes()[1];
                                    AbstractC3557B.b0("get(...)", cls);
                                    return method.invoke(null, obj, A0.e(cls));
                                }
                                throw new AssertionError("delegate method " + w10 + " should take 0, 1, or 2 parameters");
                            }
                            Method method2 = (Method) w10;
                            Object[] objArr = new Object[1];
                            if (obj == null) {
                                Class<?> cls2 = ((Method) w10).getParameterTypes()[0];
                                AbstractC3557B.b0("get(...)", cls2);
                                obj = A0.e(cls2);
                            }
                            objArr[0] = obj;
                            return method2.invoke(null, objArr);
                        }
                        return ((Method) w10).invoke(null, new Object[0]);
                    }
                    throw new AssertionError("delegate field/method " + w10 + " neither field nor method");
                } catch (IllegalAccessException e10) {
                    throw new C4992a(e10, 7);
                }
        }
    }
}
