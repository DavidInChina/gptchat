package Ah;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class r implements AbstractC0102v, AbstractC0101u {

    /* renamed from: Y  reason: collision with root package name */
    public final Method f956Y;

    public r(Method method) {
        this.f956Y = method;
    }

    @Override // Ah.AbstractC0101u
    public final AbstractC0102v a() {
        try {
            this.f956Y.setAccessible(true);
            return this;
        } catch (Exception unused) {
            return EnumC0100t.f960Y;
        }
    }

    @Override // Ah.AbstractC0102v
    public final Object b(C0103w c0103w, String str) {
        try {
            return this.f956Y.invoke(c0103w, str);
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
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        if (this.f956Y.equals(((r) obj).f956Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f956Y.hashCode() + (r.class.hashCode() * 31);
    }
}
