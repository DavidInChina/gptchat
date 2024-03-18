package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* loaded from: classes2.dex */
public final class P2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19546Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f19547Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19548h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.o f19549i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19550j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19551k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ E.A0 f19552l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19553m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f19554n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P2(int i10, wf.n nVar, wf.o oVar, wf.n nVar2, wf.n nVar3, E.A0 a02, wf.n nVar4, int i11, int i12) {
        super(2);
        this.f19546Y = i12;
        this.f19547Z = i10;
        this.f19548h0 = nVar;
        this.f19549i0 = oVar;
        this.f19550j0 = nVar2;
        this.f19551k0 = nVar3;
        this.f19552l0 = a02;
        this.f19553m0 = nVar4;
        this.f19554n0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19546Y;
        int i12 = this.f19554n0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                S2.a(this.f19547Z, this.f19548h0, this.f19549i0, this.f19550j0, this.f19551k0, this.f19552l0, this.f19553m0, abstractC1725n, p10);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                S2.d(this.f19547Z, this.f19548h0, this.f19549i0, this.f19550j0, this.f19551k0, this.f19552l0, this.f19553m0, abstractC1725n, p11);
                return;
            default:
                int p12 = AbstractC1734s.p(i12 | 1);
                S2.c(this.f19547Z, this.f19548h0, this.f19549i0, this.f19550j0, this.f19551k0, this.f19552l0, this.f19553m0, abstractC1725n, p12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19546Y) {
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
