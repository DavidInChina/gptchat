package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class A1 extends B1 {
    @Override // com.google.protobuf.B1
    public final void c(long j6, byte[] bArr, long j10) {
        this.f27382a.copyMemory((Object) null, j6, bArr, C1.f27388f, j10);
    }

    @Override // com.google.protobuf.B1
    public final boolean d(long j6, Object obj) {
        return this.f27382a.getBoolean(obj, j6);
    }

    @Override // com.google.protobuf.B1
    public final byte e(long j6) {
        return this.f27382a.getByte(j6);
    }

    @Override // com.google.protobuf.B1
    public final byte f(long j6, Object obj) {
        return this.f27382a.getByte(obj, j6);
    }

    @Override // com.google.protobuf.B1
    public final double g(long j6, Object obj) {
        return this.f27382a.getDouble(obj, j6);
    }

    @Override // com.google.protobuf.B1
    public final float h(long j6, Object obj) {
        return this.f27382a.getFloat(obj, j6);
    }

    @Override // com.google.protobuf.B1
    public final void m(Object obj, long j6, boolean z10) {
        this.f27382a.putBoolean(obj, j6, z10);
    }

    @Override // com.google.protobuf.B1
    public final void n(Object obj, long j6, byte b10) {
        this.f27382a.putByte(obj, j6, b10);
    }

    @Override // com.google.protobuf.B1
    public final void o(Object obj, long j6, double d10) {
        this.f27382a.putDouble(obj, j6, d10);
    }

    @Override // com.google.protobuf.B1
    public final void p(Object obj, long j6, float f6) {
        this.f27382a.putFloat(obj, j6, f6);
    }

    @Override // com.google.protobuf.B1
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f27382a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            C1.a(th2);
            return false;
        }
    }

    @Override // com.google.protobuf.B1
    public final boolean u() {
        Unsafe unsafe = this.f27382a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (C1.e() != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        C1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                C1.a(th3);
            }
        }
        return false;
    }
}
