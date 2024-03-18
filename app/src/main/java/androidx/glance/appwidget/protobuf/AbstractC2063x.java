package androidx.glance.appwidget.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: androidx.glance.appwidget.protobuf.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2063x extends AbstractC2042b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2063x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected f0 unknownFields = f0.f25213f;

    public AbstractC2063x() {
        this.memoizedHashCode = 0;
    }

    public static AbstractC2063x e(Class cls) {
        AbstractC2063x abstractC2063x = defaultInstanceMap.get(cls);
        if (abstractC2063x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2063x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2063x == null) {
            abstractC2063x = (AbstractC2063x) ((AbstractC2063x) m0.b(cls)).d(6);
            if (abstractC2063x != null) {
                defaultInstanceMap.put(cls, abstractC2063x);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC2063x;
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

    public static final boolean g(AbstractC2063x abstractC2063x, boolean z10) {
        byte byteValue = ((Byte) abstractC2063x.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Y y10 = Y.f25192c;
        y10.getClass();
        boolean e10 = y10.a(abstractC2063x.getClass()).e(abstractC2063x);
        if (z10) {
            abstractC2063x.d(2);
        }
        return e10;
    }

    public static void k(Class cls, AbstractC2063x abstractC2063x) {
        abstractC2063x.i();
        defaultInstanceMap.put(cls, abstractC2063x);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2042b
    public final int a(b0 b0Var) {
        int i10;
        int i11;
        if (h()) {
            if (b0Var == null) {
                Y y10 = Y.f25192c;
                y10.getClass();
                i11 = y10.a(getClass()).f(this);
            } else {
                i11 = b0Var.f(this);
            }
            if (i11 >= 0) {
                return i11;
            }
            throw new IllegalStateException(android.gov.nist.core.a.e("serialized size must be non-negative, was ", i11));
        }
        int i12 = this.memoizedSerializedSize;
        if ((i12 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i12 & Integer.MAX_VALUE;
        }
        if (b0Var == null) {
            Y y11 = Y.f25192c;
            y11.getClass();
            i10 = y11.a(getClass()).f(this);
        } else {
            i10 = b0Var.f(this);
        }
        l(i10);
        return i10;
    }

    public final void b() {
        this.memoizedHashCode = 0;
    }

    public final void c() {
        l(Integer.MAX_VALUE);
    }

    public abstract Object d(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Y y10 = Y.f25192c;
        y10.getClass();
        return y10.a(getClass()).a(this, (AbstractC2063x) obj);
    }

    public final boolean h() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (h()) {
            Y y10 = Y.f25192c;
            y10.getClass();
            return y10.a(getClass()).b(this);
        }
        if (this.memoizedHashCode == 0) {
            Y y11 = Y.f25192c;
            y11.getClass();
            this.memoizedHashCode = y11.a(getClass()).b(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC2063x j() {
        return (AbstractC2063x) d(4);
    }

    public final void l(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(android.gov.nist.core.a.e("serialized size must be non-negative, was ", i10));
    }

    public final void m(AbstractC2055o abstractC2055o) {
        Y y10 = Y.f25192c;
        y10.getClass();
        b0 a5 = y10.a(getClass());
        F4.a aVar = abstractC2055o.f25262h;
        if (aVar == null) {
            aVar = new F4.a(abstractC2055o);
        }
        a5.h(this, aVar);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = S.f25170a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        S.c(this, sb2, 0);
        return sb2.toString();
    }
}
