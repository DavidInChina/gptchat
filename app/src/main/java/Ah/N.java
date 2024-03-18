package Ah;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class N implements Q, O {

    /* renamed from: a  reason: collision with root package name */
    public final Object f902a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f903b;

    public N(Object obj, Method method) {
        this.f902a = obj;
        this.f903b = method;
    }

    @Override // Ah.O
    public final Q a() {
        O o10 = T.f905i;
        throw null;
    }

    @Override // Ah.O
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        N n10 = (N) obj;
        if (this.f902a.equals(n10.f902a) && this.f903b.equals(n10.f903b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f902a.hashCode();
        return this.f903b.hashCode() + ((hashCode + (N.class.hashCode() * 31)) * 31);
    }
}
