package Eh;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AccessControlContext;
import java.security.AccessController;

/* renamed from: Eh.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525y implements A, Serializable {

    /* renamed from: i0  reason: collision with root package name */
    public static final boolean f4814i0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f4815Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f4816Z;

    /* renamed from: h0  reason: collision with root package name */
    public final transient AccessControlContext f4817h0;

    static {
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f4814i0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f4814i0 = z10;
        } catch (SecurityException unused2) {
            z10 = true;
            f4814i0 = z10;
        }
    }

    public C0525y(String str, Object obj) {
        AccessControlContext accessControlContext;
        this.f4815Y = str;
        this.f4816Z = obj;
        if (f4814i0) {
            accessControlContext = AccessController.getContext();
        } else {
            accessControlContext = null;
        }
        this.f4817h0 = accessControlContext;
    }

    @Override // Eh.A
    public final void a(Class cls) {
        String str = this.f4815Y;
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (Modifier.isPublic(declaredField.getModifiers()) && Modifier.isPublic(declaredField.getDeclaringClass().getModifiers())) {
                if (Sh.E.b()) {
                    throw null;
                }
            } else {
                Uh.c cVar = new Uh.c(declaredField);
                AccessControlContext accessControlContext = this.f4817h0;
                if (f4814i0) {
                    AccessController.doPrivileged(cVar, accessControlContext);
                } else {
                    cVar.run();
                }
            }
            declaredField.set(null, this.f4816Z);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Cannot access " + str + " from " + cls, e10);
        } catch (NoSuchFieldException e11) {
            throw new IllegalStateException("There is no field " + str + " defined on " + cls, e11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0525y.class != obj.getClass()) {
            return false;
        }
        C0525y c0525y = (C0525y) obj;
        if (this.f4815Y.equals(c0525y.f4815Y) && this.f4816Z.equals(c0525y.f4816Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4816Z.hashCode() + E9.f.v(this.f4815Y, C0525y.class.hashCode() * 31, 31);
    }
}
