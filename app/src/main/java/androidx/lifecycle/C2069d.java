package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2069d {

    /* renamed from: a  reason: collision with root package name */
    public final int f25357a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f25358b;

    public C2069d(int i10, Method method) {
        this.f25357a = i10;
        this.f25358b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2069d)) {
            return false;
        }
        C2069d c2069d = (C2069d) obj;
        if (this.f25357a == c2069d.f25357a && this.f25358b.getName().equals(c2069d.f25358b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25358b.getName().hashCode() + (this.f25357a * 31);
    }
}
