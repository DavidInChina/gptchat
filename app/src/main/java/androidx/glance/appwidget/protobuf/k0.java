package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class k0 extends l0 {
    @Override // androidx.glance.appwidget.protobuf.l0
    public final boolean c(long j6, Object obj) {
        return this.f25243a.getBoolean(obj, j6);
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final byte d(long j6, Object obj) {
        return this.f25243a.getByte(obj, j6);
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final double e(long j6, Object obj) {
        return this.f25243a.getDouble(obj, j6);
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final float f(long j6, Object obj) {
        return this.f25243a.getFloat(obj, j6);
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final void k(Object obj, long j6, boolean z10) {
        this.f25243a.putBoolean(obj, j6, z10);
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final void l(Object obj, long j6, byte b10) {
        this.f25243a.putByte(obj, j6, b10);
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final void m(Object obj, long j6, double d10) {
        this.f25243a.putDouble(obj, j6, d10);
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final void n(Object obj, long j6, float f6) {
        this.f25243a.putFloat(obj, j6, f6);
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f25243a.getClass();
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
            m0.a(th2);
            return false;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final boolean s() {
        Unsafe unsafe = this.f25243a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (m0.e() != null) {
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
                        m0.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                m0.a(th3);
            }
        }
        return false;
    }
}
