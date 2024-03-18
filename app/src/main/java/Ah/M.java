package Ah;

import Qh.C1223a;
import Sh.EnumC1400f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import ph.C5189a;
import rh.C5498e;
import zh.AbstractC6887o;
import zh.C6870D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class M extends Enum implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public static final M f900Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ M[] f901Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Ah.M] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f900Y = r12;
        f901Z = new M[]{r12};
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f901Z.clone();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Object p10;
        Field field;
        if (Boolean.parseBoolean(System.getProperty("net.bytebuddy.safe", Boolean.toString(EnumC1400f.a().f16726Y)))) {
            return new P("Use of Unsafe was disabled by system property");
        }
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            try {
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("defineClass", String.class, byte[].class, cls2, cls2, ClassLoader.class, ProtectionDomain.class);
                method.setAccessible(true);
                return new N(obj, method);
            } catch (Exception e10) {
                try {
                    try {
                        field = AccessibleObject.class.getDeclaredField("override");
                    } catch (NoSuchFieldException unused) {
                        C6870D i10 = ((AbstractC6887o) new C5189a().a().j("net.bytebuddy.mirror.AccessibleObject")).b(zh.H.f52110a).f(new C5498e(C1223a.d(false), C1223a.d(false).c(C1223a.d(true)))).d().i(AccessibleObject.class.getClassLoader(), Y.WRAPPER.f922Y.a(AccessibleObject.class.getProtectionDomain()));
                        field = ((Class) i10.f52104j0.get(i10.f52106Y)).getDeclaredField("override");
                    }
                    Long l10 = (Long) cls.getMethod("objectFieldOffset", Field.class).invoke(obj, field);
                    l10.getClass();
                    Method method2 = cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
                    Class<?> cls3 = Class.forName("jdk.internal.misc.Unsafe");
                    Field declaredField2 = cls3.getDeclaredField("theUnsafe");
                    Boolean bool = Boolean.TRUE;
                    method2.invoke(obj, declaredField2, l10, bool);
                    Class<?> cls4 = Integer.TYPE;
                    Method method3 = cls3.getMethod("defineClass", String.class, byte[].class, cls4, cls4, ClassLoader.class, ProtectionDomain.class);
                    method2.invoke(obj, method3, l10, bool);
                    p10 = new N(declaredField2.get(null), method3);
                    return p10;
                } catch (Exception unused2) {
                    throw e10;
                }
            }
        } catch (Exception e11) {
            p10 = new P(e11.getMessage());
            return p10;
        }
    }
}
