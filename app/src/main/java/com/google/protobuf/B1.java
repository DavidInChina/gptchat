package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class B1 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f27382a;

    public B1(Unsafe unsafe) {
        this.f27382a = unsafe;
    }

    public final int a(Class cls) {
        return this.f27382a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f27382a.arrayIndexScale(cls);
    }

    public abstract void c(long j6, byte[] bArr, long j10);

    public abstract boolean d(long j6, Object obj);

    public abstract byte e(long j6);

    public abstract byte f(long j6, Object obj);

    public abstract double g(long j6, Object obj);

    public abstract float h(long j6, Object obj);

    public final int i(long j6, Object obj) {
        return this.f27382a.getInt(obj, j6);
    }

    public final long j(long j6, Object obj) {
        return this.f27382a.getLong(obj, j6);
    }

    public final Object k(long j6, Object obj) {
        return this.f27382a.getObject(obj, j6);
    }

    public final long l(java.lang.reflect.Field field) {
        return this.f27382a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j6, boolean z10);

    public abstract void n(Object obj, long j6, byte b10);

    public abstract void o(Object obj, long j6, double d10);

    public abstract void p(Object obj, long j6, float f6);

    public final void q(long j6, Object obj, int i10) {
        this.f27382a.putInt(obj, j6, i10);
    }

    public final void r(Object obj, long j6, long j10) {
        this.f27382a.putLong(obj, j6, j10);
    }

    public final void s(long j6, Object obj, Object obj2) {
        this.f27382a.putObject(obj, j6, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f27382a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            C1.a(th2);
            return false;
        }
    }

    public abstract boolean u();
}
