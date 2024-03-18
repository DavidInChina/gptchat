package Fd;

import gb.k0;
import gb.m0;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.k implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5280Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i10, m0 m0Var) {
        super(1, m0Var, m0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        this.f5280Y = i10;
        if (i10 != 1) {
        } else {
            super(1, m0Var, m0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f5280Y;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("p0", k0Var);
                        ((m0) this.receiver).j(k0Var);
                        break;
                    default:
                        AbstractC3557B.c0("p0", k0Var);
                        ((m0) this.receiver).j(k0Var);
                        break;
                }
                return yVar;
            default:
                k0 k0Var2 = (k0) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("p0", k0Var2);
                        ((m0) this.receiver).j(k0Var2);
                        break;
                    default:
                        AbstractC3557B.c0("p0", k0Var2);
                        ((m0) this.receiver).j(k0Var2);
                        break;
                }
                return yVar;
        }
    }
}
