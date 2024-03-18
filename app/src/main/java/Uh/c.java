package Uh;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;

/* loaded from: classes.dex */
public final class c implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public final AccessibleObject f17890Y;

    public c(AccessibleObject accessibleObject) {
        this.f17890Y = accessibleObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        if (this.f17890Y.equals(((c) obj).f17890Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17890Y.hashCode() + (c.class.hashCode() * 31);
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        AccessibleObject accessibleObject = this.f17890Y;
        accessibleObject.setAccessible(true);
        return accessibleObject;
    }
}
