package W;

import Z.AbstractC1725n;

/* loaded from: classes2.dex */
public final class S3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19675Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f19676Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19677h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S3(long j6, wf.n nVar, int i10) {
        super(2);
        this.f19675Y = i10;
        this.f19676Z = j6;
        this.f19677h0 = nVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f19675Y) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                X3.b(this.f19676Z, null, this.f19677h0, abstractC1725n, 0, 2);
                return;
            case 1:
                if ((i10 & 3) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                X3.b(this.f19676Z, null, this.f19677h0, abstractC1725n, 0, 2);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                A7.b.k(Z0.f19875a.b(new r0.r(this.f19676Z)), this.f19677h0, abstractC1725n, 0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19675Y) {
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
}
