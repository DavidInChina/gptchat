package Rh;

/* loaded from: classes2.dex */
public final class B implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15598Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4.g f15599Z;

    public /* synthetic */ B(C4.g gVar, int i10) {
        this.f15598Y = i10;
        this.f15599Z = gVar;
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        int i10 = this.f15598Y;
        C4.g gVar = this.f15599Z;
        switch (i10) {
            case 0:
                gVar.f2681Z.add(abstractC1337y0);
                return;
            default:
                gVar.f2681Z.add(new C1304h0(abstractC1337y0));
                return;
        }
    }
}
