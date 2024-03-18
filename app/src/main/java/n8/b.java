package N8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import r9.y;

/* loaded from: classes.dex */
public final class b extends y {

    /* renamed from: l  reason: collision with root package name */
    public final Method f12741l = Class.class.getMethod("isRecord", new Class[0]);

    /* renamed from: m  reason: collision with root package name */
    public final Method f12742m;

    /* renamed from: n  reason: collision with root package name */
    public final Method f12743n;

    /* renamed from: o  reason: collision with root package name */
    public final Method f12744o;

    public b() {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f12742m = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f12743n = componentType.getMethod("getName", new Class[0]);
        this.f12744o = componentType.getMethod("getType", new Class[0]);
    }

    @Override // r9.y
    public final boolean G0(Class cls) {
        try {
            return ((Boolean) this.f12741l.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // r9.y
    public final Method i0(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // r9.y
    public final Constructor k0(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f12742m.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f12744o.invoke(objArr[i10], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // r9.y
    public final String[] w0(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f12742m.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f12743n.invoke(objArr[i10], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}
