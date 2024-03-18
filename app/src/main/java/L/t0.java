package L;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10302Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x0 f10303Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(x0 x0Var, int i10) {
        super(0);
        this.f10302Y = i10;
        this.f10303Z = x0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        x0 x0Var = this.f10303Z;
        int i10 = this.f10302Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        x0Var.c();
                        break;
                    default:
                        x0Var.b();
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        x0Var.c();
                        break;
                    default:
                        x0Var.b();
                        break;
                }
                return yVar;
        }
    }
}
