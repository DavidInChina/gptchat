package na;

import id.AbstractC3557B;

/* renamed from: na.l0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4769l0 extends kotlin.jvm.internal.k implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40045Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4769l0(int i10, Ad.g gVar) {
        super(1, gVar, E0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        this.f40045Y = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return;
                        } else {
                            super(1, gVar, E0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                            return;
                        }
                    }
                    super(1, gVar, E0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                    return;
                }
                super(1, gVar, hb.u.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                return;
            }
            super(1, gVar, gb.m0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
            return;
        }
        super(1, gVar, hb.u.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
    }

    public final void f(Z z10) {
        switch (this.f40045Y) {
            case 0:
                AbstractC3557B.c0("p0", z10);
                ((E0) this.receiver).j(z10);
                return;
            case 4:
                AbstractC3557B.c0("p0", z10);
                ((E0) this.receiver).j(z10);
                return;
            default:
                AbstractC3557B.c0("p0", z10);
                ((E0) this.receiver).j(z10);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f40045Y;
        switch (i10) {
            case 0:
                f((Z) obj);
                return yVar;
            case 1:
                hb.l lVar = (hb.l) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("p0", lVar);
                        ((hb.u) this.receiver).j(lVar);
                        break;
                    default:
                        AbstractC3557B.c0("p0", lVar);
                        ((hb.u) this.receiver).j(lVar);
                        break;
                }
                return yVar;
            case 2:
                gb.k0 k0Var = (gb.k0) obj;
                AbstractC3557B.c0("p0", k0Var);
                ((gb.m0) this.receiver).j(k0Var);
                return yVar;
            case 3:
                hb.l lVar2 = (hb.l) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("p0", lVar2);
                        ((hb.u) this.receiver).j(lVar2);
                        break;
                    default:
                        AbstractC3557B.c0("p0", lVar2);
                        ((hb.u) this.receiver).j(lVar2);
                        break;
                }
                return yVar;
            case 4:
                f((Z) obj);
                return yVar;
            default:
                f((Z) obj);
                return yVar;
        }
    }
}
