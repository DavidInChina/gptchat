package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class L extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19305Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f19306Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19307h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19308i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.o f19309j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E.A0 f19310k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ k4 f19311l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ n4 f19312m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f19313n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f19314o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(wf.n nVar, AbstractC4326r abstractC4326r, wf.n nVar2, wf.o oVar, E.A0 a02, k4 k4Var, n4 n4Var, int i10, int i11, int i12) {
        super(2);
        this.f19305Y = i12;
        this.f19306Z = nVar;
        this.f19307h0 = abstractC4326r;
        this.f19308i0 = nVar2;
        this.f19309j0 = oVar;
        this.f19310k0 = a02;
        this.f19311l0 = k4Var;
        this.f19312m0 = n4Var;
        this.f19313n0 = i10;
        this.f19314o0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19305Y;
        int i12 = this.f19313n0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC1522a0.a(this.f19306Z, this.f19307h0, this.f19308i0, this.f19309j0, this.f19310k0, this.f19311l0, this.f19312m0, abstractC1725n, p10, this.f19314o0);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                AbstractC1522a0.b(this.f19306Z, this.f19307h0, this.f19308i0, this.f19309j0, this.f19310k0, this.f19311l0, this.f19312m0, abstractC1725n, p11, this.f19314o0);
                return;
            default:
                int p12 = AbstractC1734s.p(i12 | 1);
                AbstractC1522a0.d(this.f19306Z, this.f19307h0, this.f19308i0, this.f19309j0, this.f19310k0, this.f19311l0, this.f19312m0, abstractC1725n, p12, this.f19314o0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19305Y) {
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
