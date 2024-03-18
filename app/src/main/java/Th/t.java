package Th;

import java.security.PrivilegedAction;

/* loaded from: classes.dex */
public final class t implements PrivilegedAction {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return t.class.hashCode();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return r.a();
    }
}
