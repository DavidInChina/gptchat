package W;

import Z.AbstractC1725n;

/* renamed from: W.t3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1619t3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f20441Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f20442Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20443h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ N0.E f20444i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f20445j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f20446k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f20447l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619t3(wf.n nVar, wf.n nVar2, wf.n nVar3, N0.E e10, long j6, long j10, boolean z10) {
        super(2);
        this.f20441Y = nVar;
        this.f20442Z = nVar2;
        this.f20443h0 = nVar3;
        this.f20444i0 = e10;
        this.f20445j0 = j6;
        this.f20446k0 = j10;
        this.f20447l0 = z10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        if (this.f20441Y == null) {
            Z.r rVar2 = (Z.r) abstractC1725n;
            rVar2.W(-2104362406);
            AbstractC1649z3.d(this.f20442Z, null, this.f20443h0, this.f20444i0, this.f20445j0, this.f20446k0, rVar2, 48);
            rVar2.t(false);
        } else if (this.f20447l0) {
            Z.r rVar3 = (Z.r) abstractC1725n;
            rVar3.W(-2104362092);
            AbstractC1649z3.c(this.f20442Z, this.f20441Y, this.f20443h0, this.f20444i0, this.f20445j0, this.f20446k0, rVar3, 0);
            rVar3.t(false);
        } else {
            Z.r rVar4 = (Z.r) abstractC1725n;
            rVar4.W(-2104361812);
            AbstractC1649z3.d(this.f20442Z, this.f20441Y, this.f20443h0, this.f20444i0, this.f20445j0, this.f20446k0, rVar4, 0);
            rVar4.t(false);
        }
        return jf.y.f36177a;
    }
}
