package Th;

import java.security.PrivilegedAction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class n extends Enum implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public static final n f17303Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ n[] f17304Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Th.n, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f17303Y = r12;
        f17304Z = new n[]{r12};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f17304Z.clone();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            Class<?> cls = Class.forName("java.lang.Module", false, null);
            return new o(Class.class.getMethod("getModule", new Class[0]), cls.getMethod("isExported", String.class), cls.getMethod("addExports", String.class, cls), ClassLoader.class.getMethod("getUnnamedModule", new Class[0]));
        } catch (Exception unused) {
            return p.f17309Y;
        }
    }
}
