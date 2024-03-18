package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.protobuf.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2497d0 extends AbstractC2493c {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2497d0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected v1 unknownFields = v1.f27627f;

    public AbstractC2497d0() {
        this.memoizedHashCode = 0;
    }

    public static void b(AbstractC2497d0 abstractC2497d0) {
        if (abstractC2497d0 != null && !abstractC2497d0.isInitialized()) {
            u1 newUninitializedMessageException = abstractC2497d0.newUninitializedMessageException();
            newUninitializedMessageException.getClass();
            throw new IOException(newUninitializedMessageException.getMessage());
        }
    }

    public static AbstractC2497d0 c(AbstractC2497d0 abstractC2497d0, InputStream inputStream, J j6) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            AbstractC2543v i10 = AbstractC2543v.i(new C2487a(inputStream, AbstractC2543v.y(inputStream, read), 0));
            AbstractC2497d0 parsePartialFrom = parsePartialFrom(abstractC2497d0, i10, j6);
            i10.a(0);
            return parsePartialFrom;
        } catch (C2540t0 e10) {
            if (e10.f27601Y) {
                throw new IOException(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new IOException(e11.getMessage(), e11);
        }
    }

    public static AbstractC2497d0 d(AbstractC2497d0 abstractC2497d0, byte[] bArr, int i10, int i11, J j6) {
        AbstractC2497d0 newMutableInstance = abstractC2497d0.newMutableInstance();
        try {
            AbstractC2504f1 b10 = C2495c1.f27531c.b(newMutableInstance);
            b10.h(newMutableInstance, bArr, i10, i10 + i11, new com.google.android.gms.internal.play_billing.A(j6));
            b10.d(newMutableInstance);
            return newMutableInstance;
        } catch (C2540t0 e10) {
            if (e10.f27601Y) {
                throw new IOException(e10.getMessage(), e10);
            }
            throw e10;
        } catch (u1 e11) {
            throw new IOException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2540t0) {
                throw ((C2540t0) e12.getCause());
            }
            throw new IOException(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw C2540t0.g();
        }
    }

    public static AbstractC2509h0 emptyBooleanList() {
        return C2514j.f27560i0;
    }

    public static AbstractC2512i0 emptyDoubleList() {
        return C2551z.f27645i0;
    }

    public static AbstractC2521l0 emptyFloatList() {
        return U.f27500i0;
    }

    public static AbstractC2524m0 emptyIntList() {
        return C2506g0.f27544i0;
    }

    public static AbstractC2533p0 emptyLongList() {
        return B0.f27379i0;
    }

    public static <E> AbstractC2535q0 emptyProtobufList() {
        return C2498d1.f27535i0;
    }

    public static <T extends AbstractC2497d0> T getDefaultInstance(Class<T> cls) {
        AbstractC2497d0 abstractC2497d0 = defaultInstanceMap.get(cls);
        if (abstractC2497d0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2497d0 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2497d0 == null) {
            abstractC2497d0 = (T) ((AbstractC2497d0) C1.b(cls)).getDefaultInstanceForType();
            if (abstractC2497d0 != null) {
                defaultInstanceMap.put(cls, abstractC2497d0);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) abstractC2497d0;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
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

    public static AbstractC2524m0 mutableCopy(AbstractC2524m0 abstractC2524m0) {
        C2506g0 c2506g0 = (C2506g0) abstractC2524m0;
        int i10 = c2506g0.f27546h0;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new C2506g0(Arrays.copyOf(c2506g0.f27545Z, i11), c2506g0.f27546h0);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(M0 m02, String str, Object[] objArr) {
        return new C2501e1(m02, str, objArr);
    }

    public static <ContainingType extends M0, Type> C2491b0 newRepeatedGeneratedExtension(ContainingType containingtype, M0 m02, AbstractC2518k0 abstractC2518k0, int i10, N1 n12, boolean z10, Class cls) {
        return new C2491b0(containingtype, Collections.emptyList(), m02, new C2488a0(abstractC2518k0, i10, n12, true, z10));
    }

    public static <ContainingType extends M0, Type> C2491b0 newSingularGeneratedExtension(ContainingType containingtype, Type type, M0 m02, AbstractC2518k0 abstractC2518k0, int i10, N1 n12, Class cls) {
        return new C2491b0(containingtype, type, m02, new C2488a0(abstractC2518k0, i10, n12, false, false));
    }

    public static <T extends AbstractC2497d0> T parseDelimitedFrom(T t10, InputStream inputStream) {
        T t11 = (T) c(t10, inputStream, J.b());
        b(t11);
        return t11;
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, ByteBuffer byteBuffer, J j6) {
        T t11 = (T) parseFrom(t10, AbstractC2543v.j(byteBuffer, false), j6);
        b(t11);
        return t11;
    }

    public static <T extends AbstractC2497d0> T parsePartialFrom(T t10, AbstractC2543v abstractC2543v, J j6) {
        T t11 = (T) t10.newMutableInstance();
        try {
            AbstractC2504f1 b10 = C2495c1.f27531c.b(t11);
            T0.m mVar = abstractC2543v.f27625d;
            if (mVar == null) {
                mVar = new T0.m(abstractC2543v);
            }
            b10.i(t11, mVar, j6);
            b10.d(t11);
            return t11;
        } catch (C2540t0 e10) {
            if (e10.f27601Y) {
                throw new IOException(e10.getMessage(), e10);
            }
            throw e10;
        } catch (u1 e11) {
            throw new IOException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2540t0) {
                throw ((C2540t0) e12.getCause());
            }
            throw new IOException(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C2540t0) {
                throw ((C2540t0) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends AbstractC2497d0> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(EnumC2494c0.f27525h0);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        C2495c1 c2495c1 = C2495c1.f27531c;
        c2495c1.getClass();
        return c2495c1.a(getClass()).b(this);
    }

    public final <MessageType extends AbstractC2497d0, BuilderType extends X> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(EnumC2494c0.f27527j0);
    }

    public Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj) {
        return dynamicMethod(enumC2494c0, obj, null);
    }

    public abstract Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2495c1 c2495c1 = C2495c1.f27531c;
        c2495c1.getClass();
        return c2495c1.a(getClass()).a(this, (AbstractC2497d0) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final AbstractC2489a1 getParserForType() {
        return (AbstractC2489a1) dynamicMethod(EnumC2494c0.f27529l0);
    }

    @Override // com.google.protobuf.AbstractC2493c
    public int getSerializedSize(AbstractC2504f1 abstractC2504f1) {
        int i10;
        int i11;
        if (isMutable()) {
            if (abstractC2504f1 == null) {
                C2495c1 c2495c1 = C2495c1.f27531c;
                c2495c1.getClass();
                i11 = c2495c1.a(getClass()).f(this);
            } else {
                i11 = abstractC2504f1.f(this);
            }
            if (i11 < 0) {
                throw new IllegalStateException(android.gov.nist.core.a.e("serialized size must be non-negative, was ", i11));
            }
            return i11;
        } else if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        } else {
            if (abstractC2504f1 == null) {
                C2495c1 c2495c12 = C2495c1.f27531c;
                c2495c12.getClass();
                i10 = c2495c12.a(getClass()).f(this);
            } else {
                i10 = abstractC2504f1.f(this);
            }
            setMemoizedSerializedSize(i10);
            return i10;
        }
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        if (getMemoizedHashCode() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.N0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public void makeImmutable() {
        C2495c1 c2495c1 = C2495c1.f27531c;
        c2495c1.getClass();
        c2495c1.a(getClass()).d(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i10, AbstractC2534q abstractC2534q) {
        if (this.unknownFields == v1.f27627f) {
            this.unknownFields = new v1();
        }
        v1 v1Var = this.unknownFields;
        v1Var.a();
        if (i10 != 0) {
            v1Var.f((i10 << 3) | 2, abstractC2534q);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(v1 v1Var) {
        this.unknownFields = v1.e(this.unknownFields, v1Var);
    }

    public void mergeVarintField(int i10, int i11) {
        if (this.unknownFields == v1.f27627f) {
            this.unknownFields = new v1();
        }
        v1 v1Var = this.unknownFields;
        v1Var.a();
        if (i10 != 0) {
            v1Var.f(i10 << 3, Long.valueOf(i11));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public AbstractC2497d0 newMutableInstance() {
        return (AbstractC2497d0) dynamicMethod(EnumC2494c0.f27526i0);
    }

    public boolean parseUnknownField(int i10, AbstractC2543v abstractC2543v) {
        if ((i10 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == v1.f27627f) {
            this.unknownFields = new v1();
        }
        return this.unknownFields.d(i10, abstractC2543v);
    }

    public void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    public void setMemoizedSerializedSize(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(android.gov.nist.core.a.e("serialized size must be non-negative, was ", i10));
    }

    public String toString() {
        String obj = super.toString();
        char[] cArr = O0.f27457a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        O0.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.google.protobuf.M0
    public void writeTo(AbstractC2549y abstractC2549y) {
        C2495c1 c2495c1 = C2495c1.f27531c;
        c2495c1.getClass();
        AbstractC2504f1 a5 = c2495c1.a(getClass());
        S4.o oVar = abstractC2549y.f27644c;
        if (oVar == null) {
            oVar = new S4.o(abstractC2549y);
        }
        a5.j(oVar, this);
    }

    public static final <T extends AbstractC2497d0> boolean isInitialized(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.dynamicMethod(EnumC2494c0.f27523Y)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C2495c1 c2495c1 = C2495c1.f27531c;
        c2495c1.getClass();
        boolean e10 = c2495c1.a(t10.getClass()).e(t10);
        if (z10) {
            t10.dynamicMethod(EnumC2494c0.f27524Z, e10 ? t10 : null);
        }
        return e10;
    }

    public final <MessageType extends AbstractC2497d0, BuilderType extends X> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.f(messagetype);
        return buildertype;
    }

    public Object dynamicMethod(EnumC2494c0 enumC2494c0) {
        return dynamicMethod(enumC2494c0, null, null);
    }

    @Override // com.google.protobuf.N0
    public final AbstractC2497d0 getDefaultInstanceForType() {
        return (AbstractC2497d0) dynamicMethod(EnumC2494c0.f27528k0);
    }

    @Override // com.google.protobuf.M0
    public final X newBuilderForType() {
        return (X) dynamicMethod(EnumC2494c0.f27527j0);
    }

    @Override // com.google.protobuf.M0
    public final X toBuilder() {
        X x10 = (X) dynamicMethod(EnumC2494c0.f27527j0);
        x10.f(this);
        return x10;
    }

    public static <T extends AbstractC2497d0> T parseDelimitedFrom(T t10, InputStream inputStream, J j6) {
        T t11 = (T) c(t10, inputStream, j6);
        b(t11);
        return t11;
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, ByteBuffer byteBuffer) {
        return (T) parseFrom(t10, byteBuffer, J.b());
    }

    public static AbstractC2533p0 mutableCopy(AbstractC2533p0 abstractC2533p0) {
        B0 b02 = (B0) abstractC2533p0;
        int i10 = b02.f27381h0;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new B0(Arrays.copyOf(b02.f27380Z, i11), b02.f27381h0);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, AbstractC2534q abstractC2534q) {
        T t11 = (T) parseFrom(t10, abstractC2534q, J.b());
        b(t11);
        return t11;
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, AbstractC2534q abstractC2534q, J j6) {
        AbstractC2543v U10 = abstractC2534q.U();
        T t11 = (T) parsePartialFrom(t10, U10, j6);
        U10.a(0);
        b(t11);
        return t11;
    }

    public static AbstractC2521l0 mutableCopy(AbstractC2521l0 abstractC2521l0) {
        U u10 = (U) abstractC2521l0;
        int i10 = u10.f27502h0;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new U(u10.f27502h0, Arrays.copyOf(u10.f27501Z, i11));
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, byte[] bArr) {
        T t11 = (T) d(t10, bArr, 0, bArr.length, J.b());
        b(t11);
        return t11;
    }

    public static AbstractC2512i0 mutableCopy(AbstractC2512i0 abstractC2512i0) {
        C2551z c2551z = (C2551z) abstractC2512i0;
        int i10 = c2551z.f27647h0;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new C2551z(c2551z.f27647h0, Arrays.copyOf(c2551z.f27646Z, i11));
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, byte[] bArr, J j6) {
        T t11 = (T) d(t10, bArr, 0, bArr.length, j6);
        b(t11);
        return t11;
    }

    public static AbstractC2509h0 mutableCopy(AbstractC2509h0 abstractC2509h0) {
        C2514j c2514j = (C2514j) abstractC2509h0;
        int i10 = c2514j.f27562h0;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new C2514j(Arrays.copyOf(c2514j.f27561Z, i11), c2514j.f27562h0);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, InputStream inputStream) {
        T t11 = (T) parsePartialFrom(t10, AbstractC2543v.i(inputStream), J.b());
        b(t11);
        return t11;
    }

    public static <E> AbstractC2535q0 mutableCopy(AbstractC2535q0 abstractC2535q0) {
        int size = abstractC2535q0.size();
        return abstractC2535q0.h(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, InputStream inputStream, J j6) {
        T t11 = (T) parsePartialFrom(t10, AbstractC2543v.i(inputStream), j6);
        b(t11);
        return t11;
    }

    @Override // com.google.protobuf.M0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, AbstractC2543v abstractC2543v) {
        return (T) parseFrom(t10, abstractC2543v, J.b());
    }

    public static <T extends AbstractC2497d0> T parsePartialFrom(T t10, AbstractC2543v abstractC2543v) {
        return (T) parsePartialFrom(t10, abstractC2543v, J.b());
    }

    public static <T extends AbstractC2497d0> T parseFrom(T t10, AbstractC2543v abstractC2543v, J j6) {
        T t11 = (T) parsePartialFrom(t10, abstractC2543v, j6);
        b(t11);
        return t11;
    }
}
