package M;

import G0.AbstractC0579h;
import N0.B;
import N0.C;
import N0.C1046e;
import N0.E;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import r0.r;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11332Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f11333Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i10) {
        super(1);
        this.f11332Y = i10;
        this.f11333Z = nVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f11332Y;
        C c10 = null;
        n nVar = this.f11333Z;
        switch (i10) {
            case 0:
                List list = (List) obj;
                C c11 = nVar.B0().f11285n;
                if (c11 != null) {
                    B b10 = c11.f12477a;
                    C c12 = new C(new B(b10.f12467a, E.f(0, 16777214, r.f44263k, 0L, 0L, 0L, nVar.f11342t0, null, null, null, null), b10.f12469c, b10.f12470d, b10.f12471e, b10.f12472f, b10.f12473g, b10.f12474h, b10.f12475i, b10.f12476j), c11.f12478b, c11.f12479c);
                    list.add(c12);
                    c10 = c12;
                }
                if (c10 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                C1046e c1046e = (C1046e) obj;
                l D02 = nVar.D0();
                if (D02 != null) {
                    if (!AbstractC3557B.K(c1046e, D02.f11329b)) {
                        D02.f11329b = c1046e;
                        d dVar = D02.f11331d;
                        if (dVar != null) {
                            E e10 = nVar.f11342t0;
                            S0.r rVar = nVar.f11343u0;
                            int i11 = nVar.f11345w0;
                            boolean z11 = nVar.f11346x0;
                            int i12 = nVar.f11347y0;
                            int i13 = nVar.f11348z0;
                            List list2 = nVar.f11334A0;
                            dVar.f11272a = c1046e;
                            dVar.f11273b = e10;
                            dVar.f11274c = rVar;
                            dVar.f11275d = i11;
                            dVar.f11276e = z11;
                            dVar.f11277f = i12;
                            dVar.f11278g = i13;
                            dVar.f11279h = list2;
                            dVar.f11283l = null;
                            dVar.f11285n = null;
                            dVar.f11287p = -1;
                            dVar.f11286o = -1;
                            y yVar = y.f36177a;
                        }
                    }
                } else {
                    l lVar = new l(nVar.f11341s0, c1046e);
                    d dVar2 = new d(c1046e, nVar.f11342t0, nVar.f11343u0, nVar.f11345w0, nVar.f11346x0, nVar.f11347y0, nVar.f11348z0, nVar.f11334A0);
                    dVar2.c(nVar.B0().f11282k);
                    lVar.f11331d = dVar2;
                    nVar.f11340G0.setValue(lVar);
                }
                AbstractC0579h.v(nVar);
                return Boolean.TRUE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (nVar.D0() == null) {
                    return Boolean.FALSE;
                }
                l D03 = nVar.D0();
                if (D03 != null) {
                    D03.f11330c = booleanValue;
                }
                AbstractC0579h.v(nVar);
                AbstractC0579h.u(nVar);
                AbstractC0579h.t(nVar);
                return Boolean.TRUE;
        }
    }
}
