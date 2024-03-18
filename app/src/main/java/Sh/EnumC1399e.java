package Sh;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Sh.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1399e extends Enum implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1399e f16716Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC1399e[] f16717Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Sh.e] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f16716Y = r12;
        f16717Z = new EnumC1399e[]{r12};
    }

    public static EnumC1399e valueOf(String str) {
        return (EnumC1399e) Enum.valueOf(EnumC1399e.class, str);
    }

    public static EnumC1399e[] values() {
        return (EnumC1399e[]) f16717Z.clone();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            Method method = Class.forName("java.lang.management.ManagementFactory").getMethod("getRuntimeMXBean", new Class[0]);
            for (String str : (List) method.getReturnType().getMethod("getInputArguments", new Class[0]).invoke(method.invoke(null, new Object[0]), new Object[0])) {
                if (str.startsWith("-agentlib:native-image-agent")) {
                    return EnumC1400f.AGENT;
                }
            }
        } catch (Throwable unused) {
        }
        return EnumC1400f.NONE;
    }
}
