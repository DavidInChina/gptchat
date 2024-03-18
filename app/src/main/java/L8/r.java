package L8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class r extends p {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f10829e;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f10830b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f10831c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f10832d = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f10829e = hashMap;
    }

    public r(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        r9.y yVar = N8.c.f12745a;
        Constructor k02 = yVar.k0(cls);
        this.f10830b = k02;
        N8.c.e(k02);
        String[] w02 = yVar.w0(cls);
        for (int i10 = 0; i10 < w02.length; i10++) {
            this.f10832d.put(w02[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f10830b.getParameterTypes();
        this.f10831c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f10831c[i11] = f10829e.get(parameterTypes[i11]);
        }
    }

    @Override // L8.p
    public final Object d() {
        return (Object[]) this.f10831c.clone();
    }

    @Override // L8.p
    public final Object e(Object obj) {
        Throwable e10;
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f10830b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e11) {
            r9.y yVar = N8.c.f12745a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
        } catch (IllegalArgumentException e12) {
            e10 = e12;
            throw new RuntimeException("Failed to invoke constructor '" + N8.c.b(constructor) + "' with args " + Arrays.toString(objArr), e10);
        } catch (InstantiationException e13) {
            e10 = e13;
            throw new RuntimeException("Failed to invoke constructor '" + N8.c.b(constructor) + "' with args " + Arrays.toString(objArr), e10);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException("Failed to invoke constructor '" + N8.c.b(constructor) + "' with args " + Arrays.toString(objArr), e14.getCause());
        }
    }

    @Override // L8.p
    public final void f(Object obj, P8.b bVar, o oVar) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f10832d;
        String str = oVar.f10816c;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object b10 = oVar.f10822i.b(bVar);
            if (b10 == null && oVar.f10825l) {
                StringBuilder s10 = android.gov.nist.core.a.s("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                s10.append(bVar.r());
                throw new RuntimeException(s10.toString());
            }
            objArr[intValue] = b10;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + N8.c.b(this.f10830b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
