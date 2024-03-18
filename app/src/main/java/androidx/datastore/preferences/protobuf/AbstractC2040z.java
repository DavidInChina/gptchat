package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2040z extends AbstractC2011b {
    private static Map<Object, AbstractC2040z> defaultInstanceMap = new ConcurrentHashMap();
    protected o0 unknownFields = o0.f25094f;
    protected int memoizedSerializedSize = -1;

    public AbstractC2040z() {
        this.memoizedHashCode = 0;
    }

    public static AbstractC2040z e(Class cls) {
        AbstractC2040z abstractC2040z = defaultInstanceMap.get(cls);
        if (abstractC2040z == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2040z = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2040z == null) {
            abstractC2040z = (AbstractC2040z) ((AbstractC2040z) x0.a(cls)).d(6);
            if (abstractC2040z != null) {
                defaultInstanceMap.put(cls, abstractC2040z);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC2040z;
    }

    public static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void h(Class cls, AbstractC2040z abstractC2040z) {
        defaultInstanceMap.put(cls, abstractC2040z);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2011b
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            C2014c0 c2014c0 = C2014c0.f25030c;
            c2014c0.getClass();
            this.memoizedSerializedSize = c2014c0.a(getClass()).f(this);
        }
        return this.memoizedSerializedSize;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, J0.a] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC2011b
    public final void c(AbstractC2031p abstractC2031p) {
        C2014c0 c2014c0 = C2014c0.f25030c;
        c2014c0.getClass();
        AbstractC2022g0 a5 = c2014c0.a(getClass());
        J0.a aVar = abstractC2031p.f25102c;
        J0.a aVar2 = aVar;
        if (aVar == null) {
            ?? obj = new Object();
            Charset charset = B.f24959a;
            obj.f8729Y = abstractC2031p;
            abstractC2031p.f25102c = obj;
            aVar2 = obj;
        }
        a5.i(this, aVar2);
    }

    public abstract Object d(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC2040z) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        C2014c0 c2014c0 = C2014c0.f25030c;
        c2014c0.getClass();
        return c2014c0.a(getClass()).a(this, (AbstractC2040z) obj);
    }

    public final boolean g() {
        byte byteValue = ((Byte) d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C2014c0 c2014c0 = C2014c0.f25030c;
        c2014c0.getClass();
        boolean e10 = c2014c0.a(getClass()).e(this);
        d(2);
        return e10;
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        C2014c0 c2014c0 = C2014c0.f25030c;
        c2014c0.getClass();
        int b10 = c2014c0.a(getClass()).b(this);
        this.memoizedHashCode = b10;
        return b10;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        V.i(this, sb2, 0);
        return sb2.toString();
    }
}
