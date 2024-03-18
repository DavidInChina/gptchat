package W;

import Z.AbstractC1725n;

/* renamed from: W.s2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1613s2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20406Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f20407Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f20408h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ D.m f20409i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N3 f20410j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ r0.L f20411k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1613s2(boolean z10, boolean z11, D.m mVar, N3 n32, r0.L l10, int i10) {
        super(2);
        this.f20406Y = i10;
        this.f20407Z = z10;
        this.f20408h0 = z11;
        this.f20409i0 = mVar;
        this.f20410j0 = n32;
        this.f20411k0 = l10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f20406Y) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C1608r2.f20379a.a(this.f20407Z, this.f20408h0, this.f20409i0, this.f20410j0, this.f20411k0, 0.0f, 0.0f, abstractC1725n, 12582912, 96);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                C1608r2.f20379a.a(this.f20407Z, this.f20408h0, this.f20409i0, this.f20410j0, this.f20411k0, 0.0f, 0.0f, abstractC1725n, 12582912, 96);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20406Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
