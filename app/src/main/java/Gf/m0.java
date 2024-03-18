package Gf;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6430Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n0 f6431Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(n0 n0Var, int i10) {
        super(0);
        this.f6430Y = i10;
        this.f6431Z = n0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f6430Y;
        n0 n0Var = this.f6431Z;
        switch (i10) {
            case 0:
                return Ad.l.E(n0Var, false);
            default:
                Mf.S b10 = n0Var.x().s().b();
                if (b10 == null) {
                    return R4.b.d0(n0Var.x().s(), Nf.h.f12822a);
                }
                return b10;
        }
    }
}
