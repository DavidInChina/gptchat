package Uh;

import java.security.PrivilegedAction;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public final Class[] f17888Y;

    public a(Class... clsArr) {
        this.f17888Y = clsArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass() && Arrays.equals(this.f17888Y, ((a) obj).f17888Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((a.class.hashCode() * 31) + 496472185) * 31) + 686218487) * 31) + Arrays.hashCode(this.f17888Y);
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            return Class.forName("java.lang.SecurityManager").getMethod("checkPermission", this.f17888Y);
        } catch (Exception unused) {
            return null;
        }
    }
}
