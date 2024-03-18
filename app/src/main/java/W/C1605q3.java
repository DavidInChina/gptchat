package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* renamed from: W.q3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1605q3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20353Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f20354Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20355h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20356i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N0.E f20357j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f20358k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ long f20359l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f20360m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1605q3(wf.n nVar, wf.n nVar2, wf.n nVar3, N0.E e10, long j6, long j10, int i10, int i11) {
        super(2);
        this.f20353Y = i11;
        this.f20354Z = nVar;
        this.f20355h0 = nVar2;
        this.f20356i0 = nVar3;
        this.f20357j0 = e10;
        this.f20358k0 = j6;
        this.f20359l0 = j10;
        this.f20360m0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20353Y;
        int i12 = this.f20360m0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC1649z3.c(this.f20354Z, this.f20355h0, this.f20356i0, this.f20357j0, this.f20358k0, this.f20359l0, abstractC1725n, p10);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                AbstractC1649z3.d(this.f20354Z, this.f20355h0, this.f20356i0, this.f20357j0, this.f20358k0, this.f20359l0, abstractC1725n, p11);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20353Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
