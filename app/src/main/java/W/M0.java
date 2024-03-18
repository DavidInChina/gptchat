package W;

import Z.AbstractC1725n;

/* loaded from: classes2.dex */
public final class M0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ V2 f19359Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f19360Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f19361h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19362i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N0.E f19363j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19364k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19365l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19366m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ float f19367n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ E.g0 f19368o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(V2 v22, boolean z10, boolean z11, wf.n nVar, N0.E e10, wf.n nVar2, wf.n nVar3, wf.n nVar4, float f6, E.g0 g0Var) {
        super(2);
        this.f19359Y = v22;
        this.f19360Z = z10;
        this.f19361h0 = z11;
        this.f19362i0 = nVar;
        this.f19363j0 = e10;
        this.f19364k0 = nVar2;
        this.f19365l0 = nVar3;
        this.f19366m0 = nVar4;
        this.f19367n0 = f6;
        this.f19368o0 = g0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        long j6;
        long j10;
        long j11;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        V2 v22 = this.f19359Y;
        boolean z10 = this.f19360Z;
        boolean z11 = this.f19361h0;
        if (!z10) {
            j6 = v22.f19750f;
        } else if (!z11) {
            j6 = v22.f19746b;
        } else {
            j6 = v22.f19755k;
        }
        if (!z10) {
            j10 = v22.f19751g;
        } else if (!z11) {
            j10 = v22.f19747c;
        } else {
            j10 = v22.f19756l;
        }
        long j12 = j10;
        if (!z10) {
            j11 = v22.f19752h;
        } else if (!z11) {
            j11 = v22.f19748d;
        } else {
            j11 = v22.f19757m;
        }
        long j13 = j11;
        long j14 = j6;
        O0.e(this.f19362i0, this.f19363j0, j14, this.f19364k0, this.f19365l0, this.f19366m0, j12, j13, this.f19367n0, this.f19368o0, abstractC1725n, 0);
        return jf.y.f36177a;
    }
}
