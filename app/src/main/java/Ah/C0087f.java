package Ah;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Ah.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0087f implements AbstractC0089h {

    /* renamed from: Y  reason: collision with root package name */
    public final Method f937Y;

    public C0087f(Method method) {
        this.f937Y = method;
    }

    @Override // Ah.AbstractC0089h
    public final Package a(C0103w c0103w, String str) {
        try {
            return (Package) this.f937Y.invoke(c0103w, str);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(e11.getTargetException());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0087f.class != obj.getClass()) {
            return false;
        }
        if (this.f937Y.equals(((C0087f) obj).f937Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f937Y.hashCode() + (C0087f.class.hashCode() * 31);
    }
}
