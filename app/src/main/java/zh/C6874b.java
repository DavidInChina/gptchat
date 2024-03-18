package zh;

import java.io.InputStream;
import java.security.AccessController;

/* renamed from: zh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6874b implements AbstractC6878f {

    /* renamed from: Z  reason: collision with root package name */
    public static final ClassLoader f52119Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final boolean f52120h0;

    /* renamed from: Y  reason: collision with root package name */
    public final ClassLoader f52121Y;

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    static {
        Object obj;
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f52120h0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f52120h0 = z10;
            EnumC6873a enumC6873a = EnumC6873a.f52117Y;
            if (f52120h0) {
            }
            f52119Z = (ClassLoader) obj;
        } catch (SecurityException unused2) {
            z10 = true;
            f52120h0 = z10;
            EnumC6873a enumC6873a2 = EnumC6873a.f52117Y;
            if (f52120h0) {
            }
            f52119Z = (ClassLoader) obj;
        }
        EnumC6873a enumC6873a22 = EnumC6873a.f52117Y;
        if (f52120h0) {
            obj = AccessController.doPrivileged(enumC6873a22);
        } else {
            obj = enumC6873a22.run();
        }
        f52119Z = (ClassLoader) obj;
    }

    public C6874b(ClassLoader classLoader) {
        this.f52121Y = classLoader;
    }

    @Override // zh.AbstractC6878f
    public final AbstractC6877e G(String str) {
        InputStream resourceAsStream = this.f52121Y.getResourceAsStream(str.replace('.', '/') + ".class");
        if (resourceAsStream != null) {
            try {
                return new C6875c(Sh.K.f16709a.a(resourceAsStream));
            } finally {
                resourceAsStream.close();
            }
        }
        return new C6876d(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6874b.class != obj.getClass()) {
            return false;
        }
        if (this.f52121Y.equals(((C6874b) obj).f52121Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52121Y.hashCode() + (C6874b.class.hashCode() * 31);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
