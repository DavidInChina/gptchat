package Ah;

import java.security.PrivilegedAction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ah.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0086e extends Enum implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0086e f935Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0086e[] f936Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Ah.e, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f935Y = r12;
        f936Z = new EnumC0086e[]{r12};
    }

    public static EnumC0086e valueOf(String str) {
        return (EnumC0086e) Enum.valueOf(EnumC0086e.class, str);
    }

    public static EnumC0086e[] values() {
        return (EnumC0086e[]) f936Z.clone();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        boolean b10 = Sh.E.b();
        EnumC0088g enumC0088g = EnumC0088g.f940Y;
        if (b10) {
            try {
                return new C0087f(ClassLoader.class.getMethod("getDefinedPackage", String.class));
            } catch (Exception unused) {
                return enumC0088g;
            }
        }
        return enumC0088g;
    }
}
