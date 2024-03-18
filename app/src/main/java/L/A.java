package L;

import h.C3277c;
import q0.C5251c;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9854Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N.t0 f9855Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(N.t0 t0Var, int i10) {
        super(1);
        this.f9854Y = i10;
        this.f9855Z = t0Var;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f9854Y;
        N.t0 t0Var = this.f9855Z;
        switch (i10) {
            case 0:
                Z.N n10 = (Z.N) obj;
                return new C3277c(4, t0Var);
            default:
                long j6 = ((C5251c) obj).f43623a;
                t0Var.n();
                return jf.y.f36177a;
        }
    }
}
