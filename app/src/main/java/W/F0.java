package W;

import Z.AbstractC1725n;

/* loaded from: classes.dex */
public final class F0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f19117Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N0.E f19118Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19119h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19120i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19121j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ A0 f19122k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f19123l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ float f19124m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ E.g0 f19125n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(wf.n nVar, N0.E e10, long j6, wf.n nVar2, wf.n nVar3, A0 a02, boolean z10, float f6, E.g0 g0Var) {
        super(2);
        this.f19117Y = nVar;
        this.f19118Z = e10;
        this.f19119h0 = j6;
        this.f19120i0 = nVar2;
        this.f19121j0 = nVar3;
        this.f19122k0 = a02;
        this.f19123l0 = z10;
        this.f19124m0 = f6;
        this.f19125n0 = g0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        long j6;
        long j10;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        A0 a02 = this.f19122k0;
        boolean z10 = this.f19123l0;
        if (z10) {
            j6 = a02.f18968c;
        } else {
            j6 = a02.f18972g;
        }
        long j11 = j6;
        if (z10) {
            j10 = a02.f18969d;
        } else {
            j10 = a02.f18973h;
        }
        long j12 = j10;
        O0.e(this.f19117Y, this.f19118Z, this.f19119h0, this.f19120i0, null, this.f19121j0, j11, j12, this.f19124m0, this.f19125n0, abstractC1725n, 24576);
        return jf.y.f36177a;
    }
}
