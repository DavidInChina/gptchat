package Qg;

import Pg.EnumC1170c;
import Rg.AbstractC1286g;
import Rg.C1285f;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;

/* renamed from: Qg.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1198e extends AbstractC1286g {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f14836i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Object f14837j0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1198e(Iterable iterable) {
        this(iterable, C4832l.f40334Y, -2, EnumC1170c.f14192Y, 1);
        this.f14836i0 = 1;
    }

    @Override // Rg.AbstractC1286g
    public Object h(Pg.A a5, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f14836i0;
        Object obj = this.f14837j0;
        switch (i10) {
            case 0:
                Object invoke = ((wf.n) obj).invoke(a5, abstractC4825e);
                if (invoke == EnumC5000a.f41328Y) {
                    return invoke;
                }
                return yVar;
            default:
                Rg.F f6 = new Rg.F(a5);
                for (AbstractC1206i abstractC1206i : (Iterable) obj) {
                    Ad.l.O0(a5, null, null, new Rg.p(abstractC1206i, f6, null), 3);
                }
                return yVar;
        }
    }

    @Override // Rg.AbstractC1286g
    public AbstractC1286g j(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        int i11 = this.f14836i0;
        Object obj = this.f14837j0;
        switch (i11) {
            case 0:
                return new C1198e((wf.n) obj, abstractC4831k, i10, enumC1170c, 0);
            default:
                return new C1198e((Iterable) obj, abstractC4831k, i10, enumC1170c, 1);
        }
    }

    @Override // Rg.AbstractC1286g
    public final Pg.C l(Ng.F f6) {
        switch (this.f14836i0) {
            case 1:
                wf.n c1285f = new C1285f(this, null);
                EnumC1170c enumC1170c = EnumC1170c.f14192Y;
                Ng.G g10 = Ng.G.f12867Y;
                Pg.p pVar = new Pg.p(K4.J.O(f6, this.f15540Y), Bi.c.d(this.f15541Z, enumC1170c, 4), true, true);
                pVar.s0(g10, pVar, c1285f);
                return pVar;
            default:
                return super.l(f6);
        }
    }

    @Override // Rg.AbstractC1286g
    public final String toString() {
        switch (this.f14836i0) {
            case 0:
                return "block[" + ((wf.n) this.f14837j0) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1198e(Object obj, AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c, int i11) {
        super(abstractC4831k, i10, enumC1170c);
        this.f14836i0 = i11;
        this.f14837j0 = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1198e(wf.n nVar) {
        this(nVar, C4832l.f40334Y, -2, EnumC1170c.f14192Y, 0);
        this.f14836i0 = 0;
    }
}
