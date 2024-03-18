package Rg;

import K4.J;
import Ng.C1090y;
import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Sg.AbstractC1389a;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4826f;
import of.EnumC5000a;

/* renamed from: Rg.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1288i extends AbstractC1286g {

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC1206i f15546i0;

    public AbstractC1288i(int i10, AbstractC4831k abstractC4831k, EnumC1170c enumC1170c, AbstractC1206i abstractC1206i) {
        super(abstractC4831k, i10, enumC1170c);
        this.f15546i0 = abstractC1206i;
    }

    @Override // Rg.AbstractC1286g, Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        Object b10;
        AbstractC4831k abstractC4831k;
        jf.y yVar = jf.y.f36177a;
        if (this.f15541Z == -3) {
            AbstractC4831k context = abstractC4825e.getContext();
            Boolean bool = Boolean.FALSE;
            C1090y c1090y = C1090y.f12995h0;
            AbstractC4831k abstractC4831k2 = this.f15540Y;
            if (!((Boolean) abstractC4831k2.fold(bool, c1090y)).booleanValue()) {
                abstractC4831k = context.plus(abstractC4831k2);
            } else {
                abstractC4831k = J.t(context, abstractC4831k2, false);
            }
            if (AbstractC3557B.K(abstractC4831k, context)) {
                b10 = m(abstractC1207j, abstractC4825e);
                if (b10 != EnumC5000a.f41328Y) {
                    return yVar;
                }
            } else {
                C4826f c4826f = C4826f.f40317Y;
                if (AbstractC3557B.K(abstractC4831k.get(c4826f), context.get(c4826f))) {
                    AbstractC4831k context2 = abstractC4825e.getContext();
                    if (!(abstractC1207j instanceof F) && !(abstractC1207j instanceof A)) {
                        abstractC1207j = new y.F(abstractC1207j, context2);
                    }
                    b10 = Bi.c.Q1(abstractC4831k, abstractC1207j, AbstractC1389a.d(abstractC4831k), new C1287h(this, null), abstractC4825e);
                    if (b10 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                }
            }
            return b10;
        }
        b10 = super.b(abstractC1207j, abstractC4825e);
        if (b10 != EnumC5000a.f41328Y) {
            return yVar;
        }
        return b10;
    }

    @Override // Rg.AbstractC1286g
    public final Object h(Pg.A a5, AbstractC4825e abstractC4825e) {
        Object m10 = m(new F(a5), abstractC4825e);
        if (m10 != EnumC5000a.f41328Y) {
            return jf.y.f36177a;
        }
        return m10;
    }

    public abstract Object m(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e);

    @Override // Rg.AbstractC1286g
    public final String toString() {
        return this.f15546i0 + " -> " + super.toString();
    }
}
