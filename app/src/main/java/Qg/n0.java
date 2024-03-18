package Qg;

import Pg.EnumC1170c;
import nf.AbstractC4825e;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class n0 implements D0, AbstractC1206i, Rg.y {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ D0 f14881Y;

    public n0(F0 f02) {
        this.f14881Y = f02;
    }

    @Override // Rg.y
    public final AbstractC1206i a(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        if (((i10 >= 0 && i10 < 2) || i10 == -2) && enumC1170c == EnumC1170c.f14193Z) {
            return this;
        }
        return s0.f(this, abstractC4831k, i10, enumC1170c);
    }

    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        return this.f14881Y.b(abstractC1207j, abstractC4825e);
    }

    @Override // Qg.D0
    public final Object getValue() {
        return this.f14881Y.getValue();
    }
}
