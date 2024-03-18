package Ah;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Ah.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0099s implements AbstractC0102v, AbstractC0101u {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f957Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Method f958Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Method f959h0;

    public C0099s(Object obj, Method method, Method method2) {
        this.f957Y = obj;
        this.f958Z = method;
        this.f959h0 = method2;
    }

    @Override // Ah.AbstractC0102v
    public final Object b(C0103w c0103w, String str) {
        try {
            return this.f959h0.invoke(this.f958Z.invoke(this.f957Y, c0103w), new Object[]{str});
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
        if (obj == null || C0099s.class != obj.getClass()) {
            return false;
        }
        C0099s c0099s = (C0099s) obj;
        if (this.f957Y.equals(c0099s.f957Y) && this.f958Z.equals(c0099s.f958Z) && this.f959h0.equals(c0099s.f959h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f957Y.hashCode();
        int hashCode2 = this.f958Z.hashCode();
        return this.f959h0.hashCode() + ((hashCode2 + ((hashCode + (C0099s.class.hashCode() * 31)) * 31)) * 31);
    }

    @Override // Ah.AbstractC0101u
    public final AbstractC0102v a() {
        return this;
    }
}
