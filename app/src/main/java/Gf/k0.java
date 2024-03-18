package Gf;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6422Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l0 f6423Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, int i10) {
        super(0);
        this.f6422Y = i10;
        this.f6423Z = l0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f6422Y;
        l0 l0Var = this.f6423Z;
        switch (i10) {
            case 0:
                return Ad.l.E(l0Var, true);
            default:
                Pf.P d10 = l0Var.x().s().d();
                if (d10 == null) {
                    return R4.b.c0(l0Var.x().s(), Nf.h.f12822a);
                }
                return d10;
        }
    }
}
