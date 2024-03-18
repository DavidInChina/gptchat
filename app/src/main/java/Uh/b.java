package Uh;

import java.security.PrivilegedAction;

/* loaded from: classes.dex */
public final class b implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public final String f17889Y;

    public b(String str) {
        this.f17889Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        if (this.f17889Y.equals(((b) obj).f17889Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17889Y.hashCode() + (b.class.hashCode() * 31);
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty(this.f17889Y);
    }
}
