package Q3;

import Df.H;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class i implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14415Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i[] f14416Z;

    public /* synthetic */ i(AbstractC1206i[] abstractC1206iArr, int i10) {
        this.f14415Y = i10;
        this.f14416Z = abstractC1206iArr;
    }

    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        int i10 = this.f14415Y;
        AbstractC1206i[] abstractC1206iArr = this.f14416Z;
        switch (i10) {
            case 0:
                Object u10 = H.u(abstractC4825e, new g(abstractC1206iArr, 0), new h(0, null), abstractC1207j, abstractC1206iArr);
                if (u10 == EnumC5000a.f41328Y) {
                    return u10;
                }
                return yVar;
            default:
                Object u11 = H.u(abstractC4825e, new g(abstractC1206iArr, 2), new h(14, null), abstractC1207j, abstractC1206iArr);
                if (u11 == EnumC5000a.f41328Y) {
                    return u11;
                }
                return yVar;
        }
    }
}
