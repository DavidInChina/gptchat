package Th;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: Y  reason: collision with root package name */
    public final Method f17305Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Method f17306Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Method f17307h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Method f17308i0;

    public o(Method method, Method method2, Method method3, Method method4) {
        this.f17305Y = method;
        this.f17306Z = method2;
        this.f17307h0 = method3;
        this.f17308i0 = method4;
    }

    @Override // Th.q
    public final void a(Class cls, ClassLoader classLoader) {
        Package r02 = cls.getPackage();
        if (r02 != null) {
            try {
                Object invoke = this.f17305Y.invoke(cls, new Object[0]);
                if (!((Boolean) this.f17306Z.invoke(invoke, r02.getName())).booleanValue()) {
                    this.f17307h0.invoke(invoke, r02.getName(), this.f17308i0.invoke(classLoader, new Object[0]));
                }
            } catch (Exception e10) {
                throw new IllegalStateException("Failed to adjust module graph for dispatcher", e10);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f17305Y.equals(oVar.f17305Y) && this.f17306Z.equals(oVar.f17306Z) && this.f17307h0.equals(oVar.f17307h0) && this.f17308i0.equals(oVar.f17308i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17305Y.hashCode();
        int hashCode2 = this.f17306Z.hashCode();
        int hashCode3 = this.f17307h0.hashCode();
        return this.f17308i0.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (o.class.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
