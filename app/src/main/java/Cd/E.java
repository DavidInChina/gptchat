package Cd;

import gb.k0;
import gb.m0;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final /* synthetic */ class E extends kotlin.jvm.internal.k implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2997Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(int i10, Ad.g gVar) {
        super(1, gVar, J.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        this.f2997Y = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            } else {
                super(1, gVar, m0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                return;
            }
        }
        super(1, gVar, m0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f2997Y;
        switch (i10) {
            case 0:
                y yVar2 = (y) obj;
                AbstractC3557B.c0("p0", yVar2);
                ((J) this.receiver).j(yVar2);
                return yVar;
            case 1:
                k0 k0Var = (k0) obj;
                switch (i10) {
                    case 1:
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
                    case 1:
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
