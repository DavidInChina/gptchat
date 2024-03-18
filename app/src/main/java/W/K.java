package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.AbstractC3953c;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class K extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19260Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19261Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19262h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f19263i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19264j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f19265k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f19266l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f19267m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f19268n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Object f19269o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ Object f19270p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ Object f19271q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(AbstractC4326r abstractC4326r, wf.n nVar, N0.E e10, boolean z10, wf.n nVar2, wf.o oVar, E.A0 a02, k4 k4Var, n4 n4Var, int i10, int i11) {
        super(2);
        this.f19261Z = abstractC4326r;
        this.f19262h0 = nVar;
        this.f19267m0 = e10;
        this.f19263i0 = z10;
        this.f19264j0 = nVar2;
        this.f19268n0 = oVar;
        this.f19269o0 = a02;
        this.f19270p0 = k4Var;
        this.f19271q0 = n4Var;
        this.f19265k0 = i10;
        this.f19266l0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19260Y;
        int i12 = this.f19265k0;
        Object obj = this.f19271q0;
        Object obj2 = this.f19270p0;
        Object obj3 = this.f19269o0;
        AbstractC3953c abstractC3953c = this.f19268n0;
        Object obj4 = this.f19267m0;
        switch (i11) {
            case 0:
                E.g0 g0Var = (E.g0) obj2;
                D.m mVar = (D.m) obj;
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC4326r abstractC4326r = this.f19261Z;
                int i13 = this.f19266l0;
                wf.n nVar = this.f19262h0;
                wf.n nVar2 = this.f19264j0;
                Df.H.g(nVar, (AbstractC6216a) abstractC3953c, abstractC4326r, nVar2, (wf.n) obj4, this.f19263i0, (I1) obj3, g0Var, mVar, abstractC1725n, p10, i13);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                wf.n nVar3 = this.f19262h0;
                boolean z10 = this.f19263i0;
                AbstractC1522a0.c(this.f19261Z, nVar3, (N0.E) obj4, z10, this.f19264j0, (wf.o) abstractC3953c, (E.A0) obj3, (k4) obj2, (n4) obj, abstractC1725n, p11, this.f19266l0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19260Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(wf.n nVar, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, wf.n nVar2, wf.n nVar3, boolean z10, I1 i12, E.g0 g0Var, D.m mVar, int i10, int i11) {
        super(2);
        this.f19262h0 = nVar;
        this.f19268n0 = abstractC6216a;
        this.f19261Z = abstractC4326r;
        this.f19264j0 = nVar2;
        this.f19267m0 = nVar3;
        this.f19263i0 = z10;
        this.f19269o0 = i12;
        this.f19270p0 = g0Var;
        this.f19271q0 = mVar;
        this.f19265k0 = i10;
        this.f19266l0 = i11;
    }
}
