package mb;

import Ng.Q;
import Qg.AbstractC1207j;
import Z8.U;
import Z8.V;
import jf.C3959i;
import nf.AbstractC4825e;
import x8.W;
import y.C6484w;

/* renamed from: mb.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4577B implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39016Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4586K f39017Z;

    public /* synthetic */ C4577B(C4586K c4586k, int i10) {
        this.f39016Y = i10;
        this.f39017Z = c4586k;
    }

    @Override // Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        String str;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39016Y;
        C4586K c4586k = this.f39017Z;
        switch (i10) {
            case 0:
                C3959i c3959i = (C3959i) obj;
                long longValue = ((Number) c3959i.f36155Y).longValue();
                long longValue2 = ((Number) c3959i.f36156Z).longValue();
                String m10 = C4586K.m(c4586k, longValue);
                if (longValue2 > 0) {
                    str = C4586K.m(c4586k, longValue2);
                } else {
                    str = " --:-- ";
                }
                c4586k.l(new C6484w(android.gov.nist.core.a.j(m10, " / ", str), longValue2, 6));
                return yVar;
            default:
                hb.y yVar2 = (hb.y) obj;
                if (yVar2 instanceof hb.x) {
                    c4586k.o(V.f23277c, null);
                    c4586k.l(C4612y.f39115h0);
                } else if (yVar2 instanceof hb.v) {
                    if (!((hb.t) c4586k.e()).f32130b) {
                        C4603p n10 = c4586k.n();
                        n10.getClass();
                        Tg.e eVar = Q.f12904a;
                        Ad.l.O0(n10.f39079a, Sg.u.f16684a, null, new C4602o(n10, null), 2);
                        c4586k.l(C4612y.f39116i0);
                    }
                } else if (yVar2 instanceof hb.w) {
                    c4586k.o(U.f23275c, null);
                    c4586k.l(C4612y.f39117j0);
                    W.M(Pc.e.a(), "Download Audio Failed", null, 6);
                }
                return yVar;
        }
    }
}
