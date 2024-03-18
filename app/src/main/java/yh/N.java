package yh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.AnnotatedElement;

/* loaded from: classes2.dex */
public final class N extends AbstractC6645x {

    /* renamed from: h0  reason: collision with root package name */
    public final int f50959h0;

    static {
        AbstractC2469q0.p(H.j(Th.y.a(M.class)));
    }

    public N(Y y10, int i10) {
        super(y10);
        this.f50959h0 = i10;
    }

    @Override // yh.AbstractC6645x
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        if (this.f50959h0 != ((N) obj).f50959h0) {
            return false;
        }
        return true;
    }

    @Override // yh.AbstractC6645x
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f50959h0;
    }

    @Override // yh.AbstractC6645x
    public final AnnotatedElement k() {
        throw null;
    }
}
