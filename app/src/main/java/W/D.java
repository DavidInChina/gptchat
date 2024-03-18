package W;

import Z.AbstractC1725n;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19020Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f19021Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19022h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(wf.n nVar, wf.n nVar2, int i10) {
        super(2);
        this.f19020Y = i10;
        this.f19021Z = nVar;
        this.f19022h0 = nVar2;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19020Y;
        wf.n nVar = this.f19021Z;
        wf.n nVar2 = this.f19022h0;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-1969500671);
                if (nVar != null) {
                    nVar.invoke(rVar2, 0);
                }
                rVar2.t(false);
                nVar2.invoke(rVar2, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC1556h.b(H.f19173a, H.f19174b, R4.b.X(abstractC1725n, -909933713, new D(nVar, nVar2, 0)), abstractC1725n, 438);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19020Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
