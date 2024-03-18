package W;

import Z.AbstractC1725n;

/* renamed from: W.u3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1624u3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f20481Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f20482Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20483h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f20484i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f20485j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f20486k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1624u3(wf.n nVar, wf.n nVar2, wf.n nVar3, long j6, long j10, boolean z10) {
        super(2);
        this.f20481Y = nVar;
        this.f20482Z = nVar2;
        this.f20483h0 = nVar3;
        this.f20484i0 = j6;
        this.f20485j0 = j10;
        this.f20486k0 = z10;
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
        Z.m1 m1Var = q4.f20361a;
        Z.r rVar2 = (Z.r) abstractC1725n;
        N0.E a5 = q4.a((p4) rVar2.m(m1Var), X.C.f21354e);
        N0.E a10 = q4.a((p4) rVar2.m(m1Var), X.J.f21455j0);
        A7.b.k(j4.f20182a.b(a5), R4.b.X(abstractC1725n, 835891690, new C1619t3(this.f20481Y, this.f20482Z, this.f20483h0, a10, this.f20484i0, this.f20485j0, this.f20486k0)), abstractC1725n, 48);
        return jf.y.f36177a;
    }
}
