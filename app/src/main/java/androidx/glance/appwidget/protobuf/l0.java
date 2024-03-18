package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f25243a;

    public l0(Unsafe unsafe) {
        this.f25243a = unsafe;
    }

    public final int a(Class cls) {
        return this.f25243a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f25243a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j6, Object obj);

    public abstract byte d(long j6, Object obj);

    public abstract double e(long j6, Object obj);

    public abstract float f(long j6, Object obj);

    public final int g(long j6, Object obj) {
        return this.f25243a.getInt(obj, j6);
    }

    public final long h(long j6, Object obj) {
        return this.f25243a.getLong(obj, j6);
    }

    public final Object i(long j6, Object obj) {
        return this.f25243a.getObject(obj, j6);
    }

    public final long j(Field field) {
        return this.f25243a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j6, boolean z10);

    public abstract void l(Object obj, long j6, byte b10);

    public abstract void m(Object obj, long j6, double d10);

    public abstract void n(Object obj, long j6, float f6);

    public final void o(long j6, Object obj, int i10) {
        this.f25243a.putInt(obj, j6, i10);
    }

    public final void p(Object obj, long j6, long j10) {
        this.f25243a.putLong(obj, j6, j10);
    }

    public final void q(long j6, Object obj, Object obj2) {
        this.f25243a.putObject(obj, j6, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f25243a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
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
            m0.a(th2);
            return false;
        }
    }

    public abstract boolean s();
}
