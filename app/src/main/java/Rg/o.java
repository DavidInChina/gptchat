package Rg;

import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class o extends AbstractC1288i {

    /* renamed from: j0  reason: collision with root package name */
    public final wf.o f15564j0;

    public o(wf.o oVar, AbstractC1206i abstractC1206i, AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        super(i10, abstractC4831k, enumC1170c, abstractC1206i);
        this.f15564j0 = oVar;
    }

    @Override // Rg.AbstractC1286g
    public final AbstractC1286g j(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        return new o(this.f15564j0, this.f15546i0, abstractC4831k, i10, enumC1170c);
    }

    @Override // Rg.AbstractC1288i
    public final Object m(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        Object e02 = Ad.l.e0(new n(this, abstractC1207j, null), abstractC4825e);
        if (e02 == EnumC5000a.f41328Y) {
            return e02;
        }
        return jf.y.f36177a;
    }
}
