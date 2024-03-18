package M;

import G0.AbstractC0579h;
import H0.B0;
import N0.B;
import N0.C;
import N0.C1046e;
import N0.E;
import Ng.H;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import kf.v;
import r0.r;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11353Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f11354Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(1);
        this.f11353Y = i10;
        this.f11354Z = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C c10;
        Z0.b bVar;
        boolean z10 = false;
        int i10 = this.f11353Y;
        C c11 = null;
        q qVar = this.f11354Z;
        switch (i10) {
            case 0:
                List list = (List) obj;
                e A02 = qVar.A0();
                E f6 = E.f(0, 16777214, r.f44263k, 0L, 0L, 0L, qVar.f11359t0, null, null, null, null);
                Z0.l lVar = A02.f11302o;
                if (lVar != null && (bVar = A02.f11296i) != null) {
                    C1046e c1046e = new C1046e(A02.f11288a, null, 6);
                    if (A02.f11297j != null && A02.f11301n != null) {
                        long a5 = Z0.a.a(A02.f11303p, 0, 0, 0, 0, 10);
                        v vVar = v.f37483Y;
                        int i11 = A02.f11293f;
                        boolean z11 = A02.f11292e;
                        int i12 = A02.f11291d;
                        S0.r rVar = A02.f11290c;
                        c10 = new C(new B(c1046e, f6, vVar, i11, z11, i12, bVar, lVar, rVar, a5), new N0.i(new N0.k(c1046e, f6, vVar, bVar, rVar), a5, A02.f11293f, AbstractC3557B.D0(A02.f11291d, 2)), A02.f11299l);
                        if (c10 != null) {
                            list.add(c10);
                            c11 = c10;
                        }
                        if (c11 != null) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    }
                }
                c10 = null;
                if (c10 != null) {
                }
                if (c11 != null) {
                }
                return Boolean.valueOf(z10);
            case 1:
                String str = ((C1046e) obj).f12512Y;
                o C02 = qVar.C0();
                if (C02 != null) {
                    if (!AbstractC3557B.K(str, C02.f11350b)) {
                        C02.f11350b = str;
                        e eVar = C02.f11352d;
                        if (eVar != null) {
                            E e10 = qVar.f11359t0;
                            S0.r rVar2 = qVar.f11360u0;
                            int i13 = qVar.f11361v0;
                            boolean z12 = qVar.f11362w0;
                            int i14 = qVar.f11363x0;
                            int i15 = qVar.f11364y0;
                            eVar.f11288a = str;
                            eVar.f11289b = e10;
                            eVar.f11290c = rVar2;
                            eVar.f11291d = i13;
                            eVar.f11292e = z12;
                            eVar.f11293f = i14;
                            eVar.f11294g = i15;
                            eVar.f11297j = null;
                            eVar.f11301n = null;
                            eVar.f11302o = null;
                            eVar.f11304q = -1;
                            eVar.f11305r = -1;
                            eVar.f11303p = B0.d(0, 0);
                            eVar.f11299l = H.c(0, 0);
                            eVar.f11298k = false;
                            y yVar = y.f36177a;
                        }
                    }
                } else {
                    o oVar = new o(qVar.f11358s0, str);
                    e eVar2 = new e(str, qVar.f11359t0, qVar.f11360u0, qVar.f11361v0, qVar.f11362w0, qVar.f11363x0, qVar.f11364y0);
                    eVar2.c(qVar.A0().f11296i);
                    oVar.f11352d = eVar2;
                    qVar.f11357C0.setValue(oVar);
                }
                AbstractC0579h.v(qVar);
                return Boolean.TRUE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (qVar.C0() == null) {
                    return Boolean.FALSE;
                }
                o C03 = qVar.C0();
                if (C03 != null) {
                    C03.f11351c = booleanValue;
                }
                AbstractC0579h.v(qVar);
                AbstractC0579h.u(qVar);
                AbstractC0579h.t(qVar);
                return Boolean.TRUE;
        }
    }
}
