package Gf;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class B0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f6334a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6335b;

    public B0(ClassLoader classLoader) {
        this.f6334a = new WeakReference(classLoader);
        this.f6335b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof B0) && this.f6334a.get() == ((B0) obj).f6334a.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6335b;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.f6334a.get();
        if (classLoader == null || (obj = classLoader.toString()) == null) {
            return "<null>";
        }
        return obj;
    }
}
