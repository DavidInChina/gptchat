package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class J0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f26853a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f26854b = Memory.class;

    /* renamed from: c  reason: collision with root package name */
    public static final I0 f26855c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f26856d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f26857e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f26858f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f26859g;

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|(17:(1:6)(1:(1:8))|9|(7:12|57|13|59|14|(4:65|17|(1:20)|22)|(14:24|27|(14:30|63|31|32|35|61|36|(3:55|39|(6:45|(1:49)|50|(1:52)|53|54))|44|(2:47|49)|50|(0)|53|54)|29|35|61|36|(0)|44|(0)|50|(0)|53|54))|11|27|(0)|29|35|61|36|(0)|44|(0)|50|(0)|53|54)|4|9|(0)|11|27|(0)|29|35|61|36|(0)|44|(0)|50|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r0.getType() == java.lang.Long.TYPE) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0169, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        I0 i02;
        boolean z10;
        I0 i03;
        boolean z11;
        Field field;
        Field field2;
        I0 i04;
        Field field3;
        boolean z12 = false;
        Unsafe j6 = j();
        f26853a = j6;
        int i10 = AbstractC2485z.f26996a;
        Class<?> cls = Long.TYPE;
        boolean s10 = s(cls);
        boolean s11 = s(Integer.TYPE);
        if (j6 != null) {
            if (s10) {
                i02 = new I0(j6);
            } else if (s11) {
                i02 = new I0(j6);
            }
            f26855c = i02;
            if (i02 != null) {
                try {
                    Class<?> cls2 = i02.f26850a.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                    try {
                        field3 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        field3 = null;
                    }
                    if (field3 == null) {
                        try {
                            field3 = Buffer.class.getDeclaredField("address");
                        } catch (Throwable unused2) {
                            field3 = null;
                        }
                        if (field3 != null) {
                        }
                        field3 = null;
                    }
                } catch (Throwable th2) {
                    Logger.getLogger(J0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                }
                if (field3 != null) {
                    z10 = true;
                    f26856d = z10;
                    i03 = f26855c;
                    if (i03 != null) {
                        try {
                            Class<?> cls3 = i03.f26850a.getClass();
                            cls3.getMethod("objectFieldOffset", Field.class);
                            cls3.getMethod("arrayBaseOffset", Class.class);
                            cls3.getMethod("arrayIndexScale", Class.class);
                            Class<?> cls4 = Long.TYPE;
                            cls3.getMethod("getInt", Object.class, cls4);
                            cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                            cls3.getMethod("getLong", Object.class, cls4);
                            cls3.getMethod("putLong", Object.class, cls4, cls4);
                            cls3.getMethod("getObject", Object.class, cls4);
                            cls3.getMethod("putObject", Object.class, cls4, Object.class);
                            z11 = true;
                        } catch (Throwable th3) {
                            Logger.getLogger(J0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                        }
                        f26857e = z11;
                        f26858f = u(byte[].class);
                        u(boolean[].class);
                        a(boolean[].class);
                        u(int[].class);
                        a(int[].class);
                        u(long[].class);
                        a(long[].class);
                        u(float[].class);
                        a(float[].class);
                        u(double[].class);
                        a(double[].class);
                        u(Object[].class);
                        a(Object[].class);
                        int i11 = AbstractC2485z.f26996a;
                        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                        if (field == null) {
                            try {
                                field = Buffer.class.getDeclaredField("address");
                            } catch (Throwable unused3) {
                                field = null;
                            }
                            if (field == null || field.getType() != Long.TYPE) {
                                field2 = null;
                                if (field2 != null && (i04 = f26855c) != null) {
                                    i04.f26850a.objectFieldOffset(field2);
                                }
                                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                                    z12 = true;
                                }
                                f26859g = z12;
                            }
                        }
                        field2 = field;
                        if (field2 != null) {
                            i04.f26850a.objectFieldOffset(field2);
                        }
                        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                        }
                        f26859g = z12;
                    }
                    z11 = false;
                    f26857e = z11;
                    f26858f = u(byte[].class);
                    u(boolean[].class);
                    a(boolean[].class);
                    u(int[].class);
                    a(int[].class);
                    u(long[].class);
                    a(long[].class);
                    u(float[].class);
                    a(float[].class);
                    u(double[].class);
                    a(double[].class);
                    u(Object[].class);
                    a(Object[].class);
                    int i112 = AbstractC2485z.f26996a;
                    field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    if (field == null) {
                    }
                    field2 = field;
                    if (field2 != null) {
                    }
                    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                    }
                    f26859g = z12;
                }
            }
            z10 = false;
            f26856d = z10;
            i03 = f26855c;
            if (i03 != null) {
            }
            z11 = false;
            f26857e = z11;
            f26858f = u(byte[].class);
            u(boolean[].class);
            a(boolean[].class);
            u(int[].class);
            a(int[].class);
            u(long[].class);
            a(long[].class);
            u(float[].class);
            a(float[].class);
            u(double[].class);
            a(double[].class);
            u(Object[].class);
            a(Object[].class);
            int i1122 = AbstractC2485z.f26996a;
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field == null) {
            }
            field2 = field;
            if (field2 != null) {
            }
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            }
            f26859g = z12;
        }
        i02 = null;
        f26855c = i02;
        if (i02 != null) {
        }
        z10 = false;
        f26856d = z10;
        i03 = f26855c;
        if (i03 != null) {
        }
        z11 = false;
        f26857e = z11;
        f26858f = u(byte[].class);
        u(boolean[].class);
        a(boolean[].class);
        u(int[].class);
        a(int[].class);
        u(long[].class);
        a(long[].class);
        u(float[].class);
        a(float[].class);
        u(double[].class);
        a(double[].class);
        u(Object[].class);
        a(Object[].class);
        int i11222 = AbstractC2485z.f26996a;
        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field == null) {
        }
        field2 = field;
        if (field2 != null) {
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
        }
        f26859g = z12;
    }

    public static void a(Class cls) {
        if (f26857e) {
            f26855c.f26850a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j6, byte b10) {
        I0 i02 = f26855c;
        long j10 = (-4) & j6;
        int i10 = i02.f26850a.getInt(obj, j10);
        int i11 = ((~((int) j6)) & 3) << 3;
        i02.f26850a.putInt(obj, j10, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void c(Object obj, long j6, byte b10) {
        I0 i02 = f26855c;
        long j10 = (-4) & j6;
        int i10 = (((int) j6) & 3) << 3;
        i02.f26850a.putInt(obj, j10, ((255 & b10) << i10) | (i02.f26850a.getInt(obj, j10) & (~(255 << i10))));
    }

    public static double d(long j6, Object obj) {
        return f26855c.a(j6, obj);
    }

    public static float e(long j6, Object obj) {
        return f26855c.b(j6, obj);
    }

    public static int f(long j6, Object obj) {
        return f26855c.f26850a.getInt(obj, j6);
    }

    public static long g(long j6, Object obj) {
        return f26855c.f26850a.getLong(obj, j6);
    }

    public static Object h(Class cls) {
        try {
            return f26853a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object i(long j6, Object obj) {
        return f26855c.f26850a.getObject(obj, j6);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction<Object>) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j6, boolean z10) {
        f26855c.c(obj, j6, z10);
    }

    public static void l(Object obj, long j6, double d10) {
        f26855c.e(obj, j6, d10);
    }

    public static void m(Object obj, long j6, float f6) {
        f26855c.f(obj, j6, f6);
    }

    public static void n(long j6, Object obj, int i10) {
        f26855c.f26850a.putInt(obj, j6, i10);
    }

    public static void o(Object obj, long j6, long j10) {
        f26855c.f26850a.putLong(obj, j6, j10);
    }

    public static void p(long j6, Object obj, Object obj2) {
        f26855c.f26850a.putObject(obj, j6, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean q(long j6, Object obj) {
        if (((byte) ((f26855c.f26850a.getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean r(long j6, Object obj) {
        if (((byte) ((f26855c.f26850a.getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean s(Class cls) {
        int i10 = AbstractC2485z.f26996a;
        try {
            Class cls2 = f26854b;
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

    public static boolean t(long j6, Object obj) {
        return f26855c.g(j6, obj);
    }

    public static int u(Class cls) {
        if (f26857e) {
            return f26855c.f26850a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
