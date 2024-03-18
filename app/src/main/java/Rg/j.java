package Rg;

import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class j extends AbstractC1288i {
    public j(AbstractC1206i abstractC1206i, Tg.d dVar, int i10, EnumC1170c enumC1170c, int i11) {
        super((i11 & 4) != 0 ? -3 : i10, (i11 & 2) != 0 ? C4832l.f40334Y : dVar, (i11 & 8) != 0 ? EnumC1170c.f14192Y : enumC1170c, abstractC1206i);
    }

    @Override // Rg.AbstractC1286g
    public final AbstractC1286g j(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        return new AbstractC1288i(i10, abstractC4831k, enumC1170c, this.f15546i0);
    }

    @Override // Rg.AbstractC1286g
    public final AbstractC1206i k() {
        return this.f15546i0;
    }

    @Override // Rg.AbstractC1288i
    public final Object m(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        Object b10 = this.f15546i0.b(abstractC1207j, abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return jf.y.f36177a;
    }
}
