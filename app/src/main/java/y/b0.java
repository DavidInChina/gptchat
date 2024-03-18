package y;

import z.AbstractC6659E;
import z.AbstractC6717p0;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50181Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c0 f50182Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, int i10) {
        super(1);
        this.f50181Y = i10;
        this.f50182Z = c0Var;
    }

    public final AbstractC6659E a(AbstractC6717p0 abstractC6717p0) {
        AbstractC6659E abstractC6659E;
        AbstractC6659E abstractC6659E2;
        V v10 = V.f50158h0;
        V v11 = V.f50157Z;
        V v12 = V.f50156Y;
        int i10 = this.f50181Y;
        c0 c0Var = this.f50182Z;
        switch (i10) {
            case 0:
                AbstractC6659E abstractC6659E3 = null;
                if (abstractC6717p0.b(v12, v11)) {
                    N n10 = c0Var.f50191w0.f50197a.f50302c;
                    if (n10 != null) {
                        abstractC6659E3 = n10.f50132c;
                    }
                } else if (abstractC6717p0.b(v11, v10)) {
                    N n11 = c0Var.f50192x0.f50201a.f50302c;
                    if (n11 != null) {
                        abstractC6659E3 = n11.f50132c;
                    }
                } else {
                    abstractC6659E3 = androidx.compose.animation.b.f24639d;
                }
                if (abstractC6659E3 == null) {
                    return androidx.compose.animation.b.f24639d;
                }
                return abstractC6659E3;
            default:
                if (abstractC6717p0.b(v12, v11)) {
                    q0 q0Var = c0Var.f50191w0.f50197a.f50301b;
                    if (q0Var == null || (abstractC6659E2 = q0Var.f50279b) == null) {
                        return androidx.compose.animation.b.f24638c;
                    }
                    return abstractC6659E2;
                } else if (abstractC6717p0.b(v11, v10)) {
                    q0 q0Var2 = c0Var.f50192x0.f50201a.f50301b;
                    if (q0Var2 == null || (abstractC6659E = q0Var2.f50279b) == null) {
                        return androidx.compose.animation.b.f24638c;
                    }
                    return abstractC6659E;
                } else {
                    return androidx.compose.animation.b.f24638c;
                }
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f50181Y) {
            case 0:
                return a((AbstractC6717p0) obj);
            default:
                return a((AbstractC6717p0) obj);
        }
    }
}
