package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f25248a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f25249b = AbstractC2044d.f25207a;

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f25250c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f25251d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f25252e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f25253f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f25254g;

    static {
        boolean z10;
        boolean z11;
        Unsafe m10 = m();
        f25248a = m10;
        boolean f6 = f(Long.TYPE);
        boolean f10 = f(Integer.TYPE);
        boolean z12 = true;
        l0 l0Var = null;
        if (m10 != null) {
            if (AbstractC2044d.a()) {
                if (f6) {
                    l0Var = new j0(m10, 1);
                } else if (f10) {
                    l0Var = new j0(m10, 0);
                }
            } else {
                l0Var = new l0(m10);
            }
        }
        f25250c = l0Var;
        if (l0Var == null) {
            z10 = false;
        } else {
            z10 = l0Var.s();
        }
        f25251d = z10;
        if (l0Var == null) {
            z11 = false;
        } else {
            z11 = l0Var.r();
        }
        f25252e = z11;
        f25253f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e10 = e();
        if (e10 != null && l0Var != null) {
            l0Var.j(e10);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z12 = false;
        }
        f25254g = z12;
    }

    public static void a(Throwable th2) {
        Logger logger = Logger.getLogger(m0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f25248a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class cls) {
        if (f25252e) {
            return f25250c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f25252e) {
            f25250c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC2044d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!AbstractC2044d.a()) {
            return false;
        }
        try {
            Class cls2 = f25249b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(long j6, byte[] bArr) {
        return f25250c.d(f25253f + j6, bArr);
    }

    public static byte h(long j6, Object obj) {
        return (byte) ((f25250c.g((-4) & j6, obj) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    public static byte i(long j6, Object obj) {
        return (byte) ((f25250c.g((-4) & j6, obj) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    public static int j(long j6, Object obj) {
        return f25250c.g(j6, obj);
    }

    public static long k(long j6, Object obj) {
        return f25250c.h(j6, obj);
    }

    public static Object l(long j6, Object obj) {
        return f25250c.i(j6, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction<Object>) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(byte[] bArr, long j6, byte b10) {
        f25250c.l(bArr, f25253f + j6, b10);
    }

    public static void o(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int g10 = f25250c.g(j10, obj);
        int i10 = ((~((int) j6)) & 3) << 3;
        q(j10, obj, ((255 & b10) << i10) | (g10 & (~(255 << i10))));
    }

    public static void p(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int i10 = (((int) j6) & 3) << 3;
        q(j10, obj, ((255 & b10) << i10) | (f25250c.g(j10, obj) & (~(255 << i10))));
    }

    public static void q(long j6, Object obj, int i10) {
        f25250c.o(j6, obj, i10);
    }

    public static void r(Object obj, long j6, long j10) {
        f25250c.p(obj, j6, j10);
    }

    public static void s(long j6, Object obj, Object obj2) {
        f25250c.q(j6, obj, obj2);
    }
}
