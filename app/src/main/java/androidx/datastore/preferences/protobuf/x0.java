package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class x0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Unsafe f25130b;

    /* renamed from: d  reason: collision with root package name */
    public static final w0 f25132d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f25133e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f25134f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f25135g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f25136h;

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f25129a = Logger.getLogger(x0.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final Class f25131c = AbstractC2015d.f25033a;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027b  */
    static {
        boolean z10;
        boolean z11;
        Object th2;
        boolean z12;
        Class<?> cls;
        Class<?> cls2;
        boolean z13;
        Class<?>[] clsArr;
        Class<?>[] clsArr2;
        boolean z14;
        Field d10;
        boolean z15;
        w0 w0Var;
        boolean z16 = false;
        Unsafe l10 = l();
        f25130b = l10;
        Class<?> cls3 = Long.TYPE;
        boolean e10 = e(cls3);
        Class<?> cls4 = Integer.TYPE;
        boolean e11 = e(cls4);
        w0 w0Var2 = null;
        if (l10 != null) {
            if (AbstractC2015d.a()) {
                if (e10) {
                    w0Var2 = new u0(l10, 1);
                } else if (e11) {
                    w0Var2 = new u0(l10, 0);
                }
            } else {
                w0Var2 = new w0(l10);
            }
        }
        f25132d = w0Var2;
        if (l10 != null) {
            try {
                Class<?> cls5 = l10.getClass();
                cls5.getMethod("objectFieldOffset", Field.class);
                cls5.getMethod("getLong", Object.class, cls3);
                if (d() != null) {
                    if (!AbstractC2015d.a()) {
                        cls5.getMethod("getByte", cls3);
                        cls5.getMethod("putByte", cls3, Byte.TYPE);
                        cls5.getMethod("getInt", cls3);
                        cls5.getMethod("putInt", cls3, cls4);
                        cls5.getMethod("getLong", cls3);
                        cls5.getMethod("putLong", cls3, cls3);
                        cls5.getMethod("copyMemory", cls3, cls3, cls3);
                        cls5.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                    }
                    z16 = true;
                }
            } catch (Throwable th3) {
                f25129a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
                z16 = false;
            }
        }
        f25133e = z16;
        Unsafe unsafe = f25130b;
        if (unsafe == null) {
            z12 = false;
        } else {
            try {
                cls = unsafe.getClass();
                try {
                    Class<?>[] clsArr3 = new Class[1];
                    try {
                        clsArr3[0] = Field.class;
                        cls.getMethod("objectFieldOffset", clsArr3);
                        cls.getMethod("arrayBaseOffset", Class.class);
                        Class<?>[] clsArr4 = new Class[1];
                        try {
                            clsArr4[0] = Class.class;
                            cls.getMethod("arrayIndexScale", clsArr4);
                            Class<?>[] clsArr5 = new Class[2];
                            clsArr5[0] = Object.class;
                            cls2 = Long.TYPE;
                            z13 = true;
                            try {
                                clsArr5[1] = cls2;
                                cls.getMethod("getInt", clsArr5);
                                Class<?>[] clsArr6 = new Class[3];
                                clsArr6[0] = Object.class;
                                try {
                                    clsArr6[1] = cls2;
                                    clsArr6[2] = Integer.TYPE;
                                    cls.getMethod("putInt", clsArr6);
                                    Class<?>[] clsArr7 = new Class[2];
                                    z11 = false;
                                    try {
                                        clsArr7[0] = Object.class;
                                        z10 = true;
                                        try {
                                            clsArr7[1] = cls2;
                                            cls.getMethod("getLong", clsArr7);
                                            clsArr = new Class[3];
                                            clsArr[0] = Object.class;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                    }
                                    try {
                                        clsArr[1] = cls2;
                                        clsArr[2] = cls2;
                                        cls.getMethod("putLong", clsArr);
                                        clsArr2 = new Class[2];
                                        z14 = false;
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        z11 = false;
                                        f25129a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                                        z12 = z11;
                                        f25134f = z12;
                                        f25135g = b(byte[].class);
                                        b(boolean[].class);
                                        c(boolean[].class);
                                        b(int[].class);
                                        c(int[].class);
                                        b(long[].class);
                                        c(long[].class);
                                        b(float[].class);
                                        c(float[].class);
                                        b(double[].class);
                                        c(double[].class);
                                        b(Object[].class);
                                        c(Object[].class);
                                        d10 = d();
                                        if (d10 != null) {
                                        }
                                        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                                        }
                                        f25136h = z15;
                                    }
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    z10 = z13;
                                }
                            } catch (Throwable th8) {
                                th2 = th8;
                                z10 = true;
                                z11 = false;
                            }
                        } catch (Throwable th9) {
                            th2 = th9;
                            z11 = false;
                        }
                    } catch (Throwable th10) {
                        th2 = th10;
                        z11 = false;
                        z10 = true;
                    }
                } catch (Throwable th11) {
                    th2 = th11;
                    z10 = true;
                }
            } catch (Throwable th12) {
                th2 = th12;
                z11 = false;
            }
            try {
                clsArr2[0] = Object.class;
                z10 = true;
                try {
                    clsArr2[1] = cls2;
                    cls.getMethod("getObject", clsArr2);
                    Class<?>[] clsArr8 = new Class[3];
                    clsArr8[0] = Object.class;
                    clsArr8[1] = cls2;
                    clsArr8[2] = Object.class;
                    cls.getMethod("putObject", clsArr8);
                } catch (Throwable th13) {
                    th2 = th13;
                }
            } catch (Throwable th14) {
                th2 = th14;
                z11 = z14;
                z10 = true;
                f25129a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z12 = z11;
                f25134f = z12;
                f25135g = b(byte[].class);
                b(boolean[].class);
                c(boolean[].class);
                b(int[].class);
                c(int[].class);
                b(long[].class);
                c(long[].class);
                b(float[].class);
                c(float[].class);
                b(double[].class);
                c(double[].class);
                b(Object[].class);
                c(Object[].class);
                d10 = d();
                if (d10 != null) {
                }
                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                }
                f25136h = z15;
            }
            if (AbstractC2015d.a()) {
                z12 = true;
            } else {
                Class<?>[] clsArr9 = new Class[2];
                z14 = false;
                clsArr9[0] = Object.class;
                z13 = true;
                try {
                    clsArr9[1] = cls2;
                    cls.getMethod("getByte", clsArr9);
                    Class<?>[] clsArr10 = new Class[3];
                    clsArr10[0] = Object.class;
                    clsArr10[1] = cls2;
                    clsArr10[2] = Byte.TYPE;
                    cls.getMethod("putByte", clsArr10);
                    Class<?>[] clsArr11 = new Class[2];
                    clsArr11[0] = Object.class;
                    clsArr11[1] = cls2;
                    cls.getMethod("getBoolean", clsArr11);
                    Class<?>[] clsArr12 = new Class[3];
                    clsArr12[0] = Object.class;
                    clsArr12[1] = cls2;
                    clsArr12[2] = Boolean.TYPE;
                    cls.getMethod("putBoolean", clsArr12);
                    Class<?>[] clsArr13 = new Class[2];
                    clsArr13[0] = Object.class;
                    z10 = true;
                    clsArr13[1] = cls2;
                    cls.getMethod("getFloat", clsArr13);
                    Class<?>[] clsArr14 = new Class[3];
                    clsArr14[0] = Object.class;
                    clsArr14[1] = cls2;
                    clsArr14[2] = Float.TYPE;
                    cls.getMethod("putFloat", clsArr14);
                    Class<?>[] clsArr15 = new Class[2];
                    z11 = false;
                    clsArr15[0] = Object.class;
                    z10 = true;
                    clsArr15[1] = cls2;
                    cls.getMethod("getDouble", clsArr15);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    z12 = true;
                } catch (Throwable th15) {
                    th2 = th15;
                    z10 = true;
                    z11 = z14;
                    f25129a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                    z12 = z11;
                    f25134f = z12;
                    f25135g = b(byte[].class);
                    b(boolean[].class);
                    c(boolean[].class);
                    b(int[].class);
                    c(int[].class);
                    b(long[].class);
                    c(long[].class);
                    b(float[].class);
                    c(float[].class);
                    b(double[].class);
                    c(double[].class);
                    b(Object[].class);
                    c(Object[].class);
                    d10 = d();
                    if (d10 != null) {
                    }
                    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                    }
                    f25136h = z15;
                }
                f25134f = z12;
                f25135g = b(byte[].class);
                b(boolean[].class);
                c(boolean[].class);
                b(int[].class);
                c(int[].class);
                b(long[].class);
                c(long[].class);
                b(float[].class);
                c(float[].class);
                b(double[].class);
                c(double[].class);
                b(Object[].class);
                c(Object[].class);
                d10 = d();
                if (d10 != null && (w0Var = f25132d) != null) {
                    w0Var.j(d10);
                }
                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                    z15 = z10;
                } else {
                    z15 = z11;
                }
                f25136h = z15;
            }
        }
        z11 = false;
        z10 = true;
        f25134f = z12;
        f25135g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        d10 = d();
        if (d10 != null) {
            w0Var.j(d10);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
        }
        f25136h = z15;
    }

    public static Object a(Class cls) {
        try {
            return f25130b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int b(Class cls) {
        if (f25134f) {
            return f25132d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f25134f) {
            f25132d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (AbstractC2015d.a()) {
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
    public static boolean e(Class cls) {
        if (!AbstractC2015d.a()) {
            return false;
        }
        try {
            Class cls2 = f25131c;
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

    public static byte f(long j6, byte[] bArr) {
        return f25132d.d(f25135g + j6, bArr);
    }

    public static byte g(long j6, Object obj) {
        return (byte) ((f25132d.g((-4) & j6, obj) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    public static byte h(long j6, Object obj) {
        return (byte) ((f25132d.g((-4) & j6, obj) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    public static int i(long j6, Object obj) {
        return f25132d.g(j6, obj);
    }

    public static long j(long j6, Object obj) {
        return f25132d.h(j6, obj);
    }

    public static Object k(long j6, Object obj) {
        return f25132d.i(j6, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction<Object>) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(byte[] bArr, long j6, byte b10) {
        f25132d.l(bArr, f25135g + j6, b10);
    }

    public static void n(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int g10 = f25132d.g(j10, obj);
        int i10 = ((~((int) j6)) & 3) << 3;
        p(j10, obj, ((255 & b10) << i10) | (g10 & (~(255 << i10))));
    }

    public static void o(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int i10 = (((int) j6) & 3) << 3;
        p(j10, obj, ((255 & b10) << i10) | (f25132d.g(j10, obj) & (~(255 << i10))));
    }

    public static void p(long j6, Object obj, int i10) {
        f25132d.o(j6, obj, i10);
    }

    public static void q(Object obj, long j6, long j10) {
        f25132d.p(obj, j6, j10);
    }

    public static void r(long j6, Object obj, Object obj2) {
        f25132d.q(j6, obj, obj2);
    }
}
