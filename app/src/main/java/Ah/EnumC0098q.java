package Ah;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ah.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0098q extends Enum implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0098q f954Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0098q[] f955Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Ah.q] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f954Y = r12;
        f955Z = new EnumC0098q[]{r12};
    }

    public static EnumC0098q valueOf(String str) {
        return (EnumC0098q) Enum.valueOf(EnumC0098q.class, str);
    }

    public static EnumC0098q[] values() {
        return (EnumC0098q[]) f955Z.clone();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        EnumC0100t enumC0100t = EnumC0100t.f960Y;
        try {
            try {
                Class<?> cls = Class.forName("java.lang.invoke.MethodType");
                Class<?> cls2 = Class.forName("java.lang.invoke.MethodHandle");
                Method method = Class.forName("java.lang.invoke.MethodHandles$Lookup").getMethod("findVirtual", Class.class, String.class, cls);
                AbstractC0089h abstractC0089h = C0103w.f962g;
                return new C0099s(method.invoke(Class.forName("java.lang.invoke.MethodHandles").getMethod("lookup", new Class[0]).invoke(null, new Object[0]), ClassLoader.class, "getClassLoadingLock", cls.getMethod("methodType", Class.class, Class[].class).invoke(null, Object.class, new Class[]{String.class})), cls2.getMethod("bindTo", Object.class), cls2.getMethod("invokeWithArguments", Object[].class));
            } catch (Exception unused) {
                return enumC0100t;
            }
        } catch (Exception unused2) {
            if (!ph.f.i(ph.f.f43189k0).d(ph.f.f43193o0) || C0103w.class.getClassLoader() != null) {
                return new r(ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class));
            }
            return enumC0100t;
        }
    }
}
