package yh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class E extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final Method f50929Z;

    static {
        AbstractC2469q0.p(H.j(Th.y.a(D.class)));
    }

    public E(Method method) {
        this.f50929Z = method;
    }

    @Override // yh.Y
    public final AnnotatedElement a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        if (this.f50929Z.equals(((E) obj).f50929Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50929Z.hashCode() + (E.class.hashCode() * 31);
    }
}
