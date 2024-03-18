package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class C1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f27383a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f27384b = AbstractC2499e.f27538a;

    /* renamed from: c  reason: collision with root package name */
    public static final B1 f27385c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f27386d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f27387e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f27388f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f27389g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f27390h;

    static {
        boolean z10;
        boolean z11;
        long j6;
        Unsafe m10 = m();
        f27383a = m10;
        boolean f6 = f(Long.TYPE);
        boolean f10 = f(Integer.TYPE);
        boolean z12 = true;
        B1 b1 = null;
        if (m10 != null) {
            if (AbstractC2499e.a()) {
                if (f6) {
                    b1 = new z1(m10, 1);
                } else if (f10) {
                    b1 = new z1(m10, 0);
                }
            } else {
                b1 = new B1(m10);
            }
        }
        f27385c = b1;
        if (b1 == null) {
            z10 = false;
        } else {
            z10 = b1.u();
        }
        f27386d = z10;
        if (b1 == null) {
            z11 = false;
        } else {
            z11 = b1.t();
        }
        f27387e = z11;
        f27388f = c(byte[].class);
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
        java.lang.reflect.Field e10 = e();
        if (e10 != null && b1 != null) {
            j6 = b1.l(e10);
        } else {
            j6 = -1;
        }
        f27389g = j6;
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z12 = false;
        }
        f27390h = z12;
    }

    public static void a(Throwable th2) {
        Logger logger = Logger.getLogger(C1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f27383a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class cls) {
        if (f27387e) {
            return f27385c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f27387e) {
            f27385c.b(cls);
        }
    }

    public static java.lang.reflect.Field e() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        if (AbstractC2499e.a()) {
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
        if (!AbstractC2499e.a()) {
            return false;
        }
        try {
            Class cls2 = f27384b;
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
        return f27385c.f(f27388f + j6, bArr);
    }

    public static byte h(long j6, Object obj) {
        return (byte) ((f27385c.i((-4) & j6, obj) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    public static byte i(long j6, Object obj) {
        return (byte) ((f27385c.i((-4) & j6, obj) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    public static int j(long j6, Object obj) {
        return f27385c.i(j6, obj);
    }

    public static long k(long j6, Object obj) {
        return f27385c.j(j6, obj);
    }

    public static Object l(long j6, Object obj) {
        return f27385c.k(j6, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction<Object>) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j6, boolean z10) {
        f27385c.m(obj, j6, z10);
    }

    public static void o(byte[] bArr, long j6, byte b10) {
        f27385c.n(bArr, f27388f + j6, b10);
    }

    public static void p(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int i10 = f27385c.i(j10, obj);
        int i11 = ((~((int) j6)) & 3) << 3;
        t(j10, obj, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void q(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int i10 = (((int) j6) & 3) << 3;
        t(j10, obj, ((255 & b10) << i10) | (f27385c.i(j10, obj) & (~(255 << i10))));
    }

    public static void r(Object obj, long j6, double d10) {
        f27385c.o(obj, j6, d10);
    }

    public static void s(Object obj, long j6, float f6) {
        f27385c.p(obj, j6, f6);
    }

    public static void t(long j6, Object obj, int i10) {
        f27385c.q(j6, obj, i10);
    }

    public static void u(Object obj, long j6, long j10) {
        f27385c.r(obj, j6, j10);
    }

    public static void v(long j6, Object obj, Object obj2) {
        f27385c.s(j6, obj, obj2);
    }
}
