package Rg;

import K4.J;
import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import id.AbstractC3557B;
import java.util.ArrayList;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;

/* renamed from: Rg.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1286g implements y {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4831k f15540Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f15541Z;

    /* renamed from: h0  reason: collision with root package name */
    public final EnumC1170c f15542h0;

    public AbstractC1286g(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        this.f15540Y = abstractC4831k;
        this.f15541Z = i10;
        this.f15542h0 = enumC1170c;
    }

    @Override // Rg.y
    public final AbstractC1206i a(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        AbstractC4831k abstractC4831k2 = this.f15540Y;
        AbstractC4831k plus = abstractC4831k.plus(abstractC4831k2);
        EnumC1170c enumC1170c2 = EnumC1170c.f14192Y;
        EnumC1170c enumC1170c3 = this.f15542h0;
        int i11 = this.f15541Z;
        if (enumC1170c == enumC1170c2) {
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            enumC1170c = enumC1170c3;
        }
        if (AbstractC3557B.K(plus, abstractC4831k2) && i10 == i11 && enumC1170c == enumC1170c3) {
            return this;
        }
        return j(plus, i10, enumC1170c);
    }

    @Override // Qg.AbstractC1206i
    public Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        Object e02 = Ad.l.e0(new C1284e(null, abstractC1207j, this), abstractC4825e);
        if (e02 != EnumC5000a.f41328Y) {
            return jf.y.f36177a;
        }
        return e02;
    }

    public String d() {
        return null;
    }

    public abstract Object h(Pg.A a5, AbstractC4825e abstractC4825e);

    public abstract AbstractC1286g j(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c);

    public AbstractC1206i k() {
        return null;
    }

    public Pg.C l(Ng.F f6) {
        int i10 = this.f15541Z;
        if (i10 == -3) {
            i10 = -2;
        }
        Ng.G g10 = Ng.G.f12869h0;
        wf.n c1285f = new C1285f(this, null);
        Pg.p pVar = new Pg.p(J.O(f6, this.f15540Y), Bi.c.d(i10, this.f15542h0, 4), true, true);
        pVar.s0(g10, pVar, c1285f);
        return pVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d10 = d();
        if (d10 != null) {
            arrayList.add(d10);
        }
        C4832l c4832l = C4832l.f40334Y;
        AbstractC4831k abstractC4831k = this.f15540Y;
        if (abstractC4831k != c4832l) {
            arrayList.add("context=" + abstractC4831k);
        }
        int i10 = this.f15541Z;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        EnumC1170c enumC1170c = EnumC1170c.f14192Y;
        EnumC1170c enumC1170c2 = this.f15542h0;
        if (enumC1170c2 != enumC1170c) {
            arrayList.add("onBufferOverflow=" + enumC1170c2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return android.gov.nist.core.a.n(sb2, kf.t.m2(arrayList, ", ", null, null, null, 62), ']');
    }
}
