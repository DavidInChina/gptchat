package y;

import z.AbstractC6659E;
import z.AbstractC6717p0;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50166Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d0 f50167Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ e0 f50168h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(d0 d0Var, e0 e0Var, int i10) {
        super(1);
        this.f50166Y = i10;
        this.f50167Z = d0Var;
        this.f50168h0 = e0Var;
    }

    public final Float a(V v10) {
        int i10 = this.f50166Y;
        d0 d0Var = this.f50167Z;
        e0 e0Var = this.f50168h0;
        float f6 = 1.0f;
        switch (i10) {
            case 1:
                int ordinal = v10.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            f0 f0Var = e0Var.f50201a.f50300a;
                            if (f0Var != null) {
                                f6 = f0Var.f50212a;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    f0 f0Var2 = d0Var.f50197a.f50300a;
                    if (f0Var2 != null) {
                        f6 = f0Var2.f50212a;
                    }
                }
                return Float.valueOf(f6);
            default:
                int ordinal2 = v10.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            k0 k0Var = e0Var.f50201a.f50303d;
                            if (k0Var != null) {
                                f6 = k0Var.f50228a;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    k0 k0Var2 = d0Var.f50197a.f50303d;
                    if (k0Var2 != null) {
                        f6 = k0Var2.f50228a;
                    }
                }
                return Float.valueOf(f6);
        }
    }

    public final AbstractC6659E c(AbstractC6717p0 abstractC6717p0) {
        AbstractC6659E abstractC6659E;
        AbstractC6659E abstractC6659E2;
        AbstractC6659E abstractC6659E3;
        AbstractC6659E abstractC6659E4;
        V v10 = V.f50158h0;
        V v11 = V.f50157Z;
        V v12 = V.f50156Y;
        int i10 = this.f50166Y;
        e0 e0Var = this.f50168h0;
        d0 d0Var = this.f50167Z;
        switch (i10) {
            case 0:
                if (abstractC6717p0.b(v12, v11)) {
                    f0 f0Var = d0Var.f50197a.f50300a;
                    if (f0Var == null || (abstractC6659E2 = f0Var.f50213b) == null) {
                        return androidx.compose.animation.b.f24637b;
                    }
                    return abstractC6659E2;
                } else if (abstractC6717p0.b(v11, v10)) {
                    f0 f0Var2 = e0Var.f50201a.f50300a;
                    if (f0Var2 == null || (abstractC6659E = f0Var2.f50213b) == null) {
                        return androidx.compose.animation.b.f24637b;
                    }
                    return abstractC6659E;
                } else {
                    return androidx.compose.animation.b.f24637b;
                }
            default:
                if (abstractC6717p0.b(v12, v11)) {
                    k0 k0Var = d0Var.f50197a.f50303d;
                    if (k0Var == null || (abstractC6659E4 = k0Var.f50230c) == null) {
                        return androidx.compose.animation.b.f24637b;
                    }
                    return abstractC6659E4;
                } else if (abstractC6717p0.b(v11, v10)) {
                    k0 k0Var2 = e0Var.f50201a.f50303d;
                    if (k0Var2 == null || (abstractC6659E3 = k0Var2.f50230c) == null) {
                        return androidx.compose.animation.b.f24637b;
                    }
                    return abstractC6659E3;
                } else {
                    return androidx.compose.animation.b.f24637b;
                }
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f50166Y) {
            case 0:
                return c((AbstractC6717p0) obj);
            case 1:
                return a((V) obj);
            case 2:
                return c((AbstractC6717p0) obj);
            default:
                return a((V) obj);
        }
    }
}
