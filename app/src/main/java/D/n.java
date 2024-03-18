package D;

import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import Qg.C1204h;
import Qg.k0;
import Qg.s0;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3189a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1206i f3190b;

    public n(int i10) {
        this.f3189a = i10;
        if (i10 != 1) {
            this.f3190b = s0.b(0, 16, EnumC1170c.f14193Z, 1);
        } else {
            this.f3190b = C1204h.f14855Y;
        }
    }

    @Override // D.l
    public final AbstractC1206i a() {
        int i10 = this.f3189a;
        AbstractC1206i abstractC1206i = this.f3190b;
        switch (i10) {
            case 0:
                return (k0) abstractC1206i;
            default:
                return abstractC1206i;
        }
    }

    @Override // D.m
    public final Object b(k kVar, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        switch (this.f3189a) {
            case 0:
                Object c10 = ((k0) this.f3190b).c(kVar, abstractC4825e);
                if (c10 == EnumC5000a.f41328Y) {
                    return c10;
                }
                return yVar;
            default:
                return yVar;
        }
    }

    @Override // D.m
    public final boolean c(k kVar) {
        switch (this.f3189a) {
            case 0:
                return ((k0) this.f3190b).g(kVar);
            default:
                return true;
        }
    }
}
