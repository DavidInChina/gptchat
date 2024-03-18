package Z1;

import Z.AbstractC1725n;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23130Y = 2;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f23131Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f23132h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f23133i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ D0 f23134j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(long j6, D0 d02, wf.n nVar, int i10) {
        super(2);
        this.f23133i0 = j6;
        this.f23134j0 = d02;
        this.f23131Z = nVar;
        this.f23132h0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f23130Y;
        int i12 = this.f23132h0;
        switch (i11) {
            case 0:
                R4.b.m(i12 | 1, this.f23133i0, abstractC1725n, this.f23134j0, this.f23131Z);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                A0 a02 = A0.f22816Y;
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(578571862);
                int i13 = i12 & 896;
                rVar2.W(-548224868);
                if (rVar2.f22696a instanceof X1.b) {
                    rVar2.U();
                    if (rVar2.f22695O) {
                        rVar2.o(a02);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, new Z0.g(this.f23133i0), m0.f23032y0);
                    U3.f.n0(rVar2, this.f23134j0, m0.f23033z0);
                    this.f23131Z.invoke(rVar2, Integer.valueOf((i13 >> 6) & 14));
                    rVar2.t(true);
                    rVar2.t(false);
                    rVar2.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                R4.b.t(i12 | 1, this.f23133i0, abstractC1725n, this.f23134j0, this.f23131Z);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f23130Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(D0 d02, long j6, wf.n nVar, int i10) {
        super(2);
        this.f23134j0 = d02;
        this.f23133i0 = j6;
        this.f23131Z = nVar;
        this.f23132h0 = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(wf.n nVar, int i10, long j6, D0 d02) {
        super(2);
        this.f23131Z = nVar;
        this.f23132h0 = i10;
        this.f23133i0 = j6;
        this.f23134j0 = d02;
    }
}
