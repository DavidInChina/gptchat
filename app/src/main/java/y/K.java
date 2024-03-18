package y;

import W.C1594o2;
import W.S2;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import h0.C3288a;
import l0.AbstractC4326r;
import na.D1;
import p9.C5100b;
import z.C6729v0;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50121Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f50122Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f50123h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f50124i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f50125j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f50126k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f50127l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f50128m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(int i10, wf.n nVar, wf.o oVar, wf.n nVar2, wf.n nVar3, C1594o2 c1594o2, wf.n nVar4) {
        super(2);
        this.f50121Y = 1;
        this.f50122Z = i10;
        this.f50124i0 = nVar;
        this.f50123h0 = oVar;
        this.f50125j0 = nVar2;
        this.f50126k0 = nVar3;
        this.f50127l0 = c1594o2;
        this.f50128m0 = nVar4;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f50121Y;
        int i12 = this.f50122Z;
        Object obj = this.f50123h0;
        Object obj2 = this.f50128m0;
        Object obj3 = this.f50127l0;
        Object obj4 = this.f50125j0;
        Object obj5 = this.f50126k0;
        Object obj6 = this.f50124i0;
        switch (i11) {
            case 0:
                R4.b.g((C6729v0) obj6, (wf.k) obj4, (AbstractC4326r) obj5, (d0) obj3, (e0) obj2, (wf.o) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                S2.d(this.f50122Z, (wf.n) obj6, (wf.o) obj, (wf.n) obj4, (wf.n) obj5, (C1594o2) obj3, (wf.n) obj2, abstractC1725n, 0);
                return;
            case 2:
                C3288a c3288a = (C3288a) obj6;
                int p10 = AbstractC1734s.p(i12) | 1;
                c3288a.g(this.f50125j0, this.f50126k0, this.f50127l0, this.f50128m0, this.f50123h0, abstractC1725n, p10);
                return;
            default:
                A7.b.r((Tc.f) obj6, (D1) obj5, (wf.k) obj4, (gb.l0) obj3, (wf.k) obj2, (C5100b) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f50121Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Tc.f fVar, D1 d12, wf.k kVar, gb.l0 l0Var, wf.k kVar2, C5100b c5100b, int i10) {
        super(2);
        this.f50121Y = 3;
        this.f50124i0 = fVar;
        this.f50126k0 = d12;
        this.f50125j0 = kVar;
        this.f50127l0 = l0Var;
        this.f50128m0 = kVar2;
        this.f50123h0 = c5100b;
        this.f50122Z = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, int i11) {
        super(2);
        this.f50121Y = i11;
        this.f50124i0 = obj;
        this.f50125j0 = obj2;
        this.f50126k0 = obj3;
        this.f50127l0 = obj4;
        this.f50128m0 = obj5;
        this.f50123h0 = obj6;
        this.f50122Z = i10;
    }
}
