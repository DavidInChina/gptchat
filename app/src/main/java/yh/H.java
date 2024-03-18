package yh;

import java.security.AccessController;
import th.AbstractC5806n;
import th.C5805m;

/* loaded from: classes2.dex */
public abstract class H implements Y {

    /* renamed from: Y  reason: collision with root package name */
    public static final boolean f50943Y;

    static {
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f50943Y = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f50943Y = z10;
        } catch (SecurityException unused2) {
            z10 = true;
            f50943Y = z10;
        }
    }

    public static Object j(Th.y yVar) {
        if (f50943Y) {
            return AccessController.doPrivileged(yVar);
        }
        return yVar.run();
    }

    @Override // yh.Y
    public final Y b() {
        return new AbstractC6645x(this);
    }

    @Override // yh.Y
    public final Y c(int i10) {
        return new U(this, i10);
    }

    @Override // yh.Y
    public final Y d() {
        return new AbstractC6645x(this);
    }

    @Override // yh.Y
    public final Y e() {
        return new AbstractC6645x(this);
    }

    @Override // yh.Y
    public final AbstractC5806n f() {
        return new C5805m(a().getDeclaredAnnotations());
    }

    @Override // yh.Y
    public final Y g(int i10) {
        return new N(this, i10);
    }

    @Override // yh.Y
    public final Y h(int i10) {
        return new W(this, i10);
    }

    @Override // yh.Y
    public Y i(int i10) {
        return new S(this, i10);
    }
}
