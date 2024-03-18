package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f34872b;

    /* renamed from: a  reason: collision with root package name */
    private final Unsafe f34873a;

    static {
        Field i10 = i();
        i10.setAccessible(true);
        try {
            f34872b = new a((Unsafe) i10.get(null));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("Couldn't get the Unsafe", e10);
        }
    }

    a(Unsafe unsafe) {
        this.f34873a = unsafe;
    }

    public static a h() {
        return f34872b;
    }

    private static Field i() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e10);
        }
    }

    public final int a(Class cls) {
        return this.f34873a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f34873a.arrayIndexScale(cls);
    }

    public final boolean c(Object obj, long j6, int i10, int i11) {
        return this.f34873a.compareAndSwapInt(obj, j6, i10, i11);
    }

    public final boolean d(Object obj, long j6, long j10, long j11) {
        return this.f34873a.compareAndSwapLong(obj, j6, j10, j11);
    }

    public final boolean e(Object obj, long j6, Object obj2) {
        return j$.com.android.tools.r8.a.n(this.f34873a, obj, j6, obj2);
    }

    public final int f(Object obj, long j6) {
        int intVolatile;
        do {
            intVolatile = this.f34873a.getIntVolatile(obj, j6);
        } while (!this.f34873a.compareAndSwapInt(obj, j6, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final Object g(Object obj, long j6) {
        return this.f34873a.getObjectVolatile(obj, j6);
    }

    public final long j(Class cls, String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Cannot find field:", e10);
        }
    }

    public final long k(Field field) {
        return this.f34873a.objectFieldOffset(field);
    }

    public final void l(Object obj, long j6, Object obj2) {
        this.f34873a.putObjectVolatile(obj, j6, obj2);
    }
}
