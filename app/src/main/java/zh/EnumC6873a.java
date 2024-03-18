package zh;

import java.net.URL;
import java.net.URLClassLoader;
import java.security.PrivilegedAction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: zh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6873a extends Enum implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6873a f52117Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC6873a[] f52118Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, zh.a] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f52117Y = r12;
        f52118Z = new EnumC6873a[]{r12};
    }

    public static EnumC6873a valueOf(String str) {
        return (EnumC6873a) Enum.valueOf(EnumC6873a.class, str);
    }

    public static EnumC6873a[] values() {
        return (EnumC6873a[]) f52118Z.clone();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return new URLClassLoader(new URL[0], null);
    }
}
