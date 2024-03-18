package yh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
public final class Q extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final TypeVariable f50964Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f50965h0;

    static {
        AbstractC2469q0.p(H.j(Th.y.a(P.class)));
    }

    public Q(TypeVariable typeVariable, int i10) {
        this.f50964Z = typeVariable;
        this.f50965h0 = i10;
    }

    @Override // yh.Y
    public final AnnotatedElement a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        Q q10 = (Q) obj;
        if (this.f50965h0 == q10.f50965h0 && this.f50964Z.equals(q10.f50964Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50964Z.hashCode() + (Q.class.hashCode() * 31)) * 31) + this.f50965h0;
    }
}
