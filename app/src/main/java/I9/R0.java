package I9;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final /* synthetic */ class R0 extends kotlin.jvm.internal.k implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8228Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(int i10, Ad.g gVar) {
        super(1, gVar, F.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        this.f8228Y = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            } else {
                super(1, gVar, f1.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                return;
            }
        }
        super(1, gVar, F.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f8228Y;
        switch (i10) {
            case 0:
                I0 i02 = (I0) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("p0", i02);
                        ((F) this.receiver).j(i02);
                        break;
                    default:
                        AbstractC3557B.c0("p0", i02);
                        ((F) this.receiver).j(i02);
                        break;
                }
                return yVar;
            case 1:
                I0 i03 = (I0) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("p0", i03);
                        ((F) this.receiver).j(i03);
                        break;
                    default:
                        AbstractC3557B.c0("p0", i03);
                        ((F) this.receiver).j(i03);
                        break;
                }
                return yVar;
            default:
                X0 x02 = (X0) obj;
                AbstractC3557B.c0("p0", x02);
                ((f1) this.receiver).j(x02);
                return yVar;
        }
    }
}
