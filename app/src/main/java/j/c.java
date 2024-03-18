package J;

import Cd.X;
import Df.v;
import I9.j1;
import L0.r;
import L0.t;
import L0.u;
import id.AbstractC3557B;
import jf.C3959i;
import jf.y;
import kotlin.jvm.internal.o;
import na.D1;
import wf.k;
import zd.g;
import zd.n;

/* loaded from: classes2.dex */
public final class c extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8719Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f8720Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, boolean z10) {
        super(1);
        this.f8719Y = i10;
        this.f8720Z = z10;
    }

    public final D1 a(D1 d12) {
        switch (this.f8719Y) {
            case 4:
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, this.f8720Z, false, false, null, false, null, false, null, -33554433, 63);
            default:
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, false, false, false, Boolean.valueOf(this.f8720Z), false, null, false, null, Integer.MAX_VALUE, 63);
        }
    }

    public final g c(g gVar) {
        int i10 = this.f8719Y;
        boolean z10 = this.f8720Z;
        switch (i10) {
            case 8:
                AbstractC3557B.c0("settings", gVar);
                return g.a(gVar, Boolean.valueOf(z10), null, null, null, null, 254);
            case 9:
                AbstractC3557B.c0("settings", gVar);
                return g.a(gVar, null, Boolean.valueOf(z10), null, null, null, 253);
            default:
                AbstractC3557B.c0("settings", gVar);
                return g.a(gVar, null, null, Boolean.valueOf(z10), null, null, 251);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (Lg.n.I2((java.lang.String) r1.f36155Y, "$", false) == false) goto L8;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f8719Y;
        boolean z11 = this.f8720Z;
        switch (i10) {
            case 0:
                v[] vVarArr = t.f10472a;
                u uVar = r.f10440B;
                v vVar = t.f10472a[17];
                uVar.a((L0.v) obj, Boolean.valueOf(z11));
                return y.f36177a;
            case 1:
                B3.b bVar = (B3.b) obj;
                AbstractC3557B.c0("db", bVar);
                bVar.Q(z11);
                return null;
            case 2:
                H9.o oVar = (H9.o) obj;
                AbstractC3557B.c0("$this$setState", oVar);
                return H9.o.e(oVar, this.f8720Z, null, null, false, 29);
            case 3:
                j1 j1Var = (j1) obj;
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, this.f8720Z, null, false, null, null, null, null, false, 130815);
            case 4:
                return a((D1) obj);
            case 5:
                return a((D1) obj);
            case 6:
                Ba.c cVar = (Ba.c) obj;
                if (cVar == null) {
                    return null;
                }
                return Ba.c.a(cVar, z11, null, null, 6);
            case 7:
                n nVar = (n) obj;
                AbstractC3557B.c0("$this$update", nVar);
                return n.a(nVar, false, null, false, false, false, false, false, false, null, this.f8720Z, 2047);
            case 8:
                return c((g) obj);
            case 9:
                return c((g) obj);
            case 10:
                return c((g) obj);
            case 11:
                X x10 = (X) obj;
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, this.f8720Z, false, false, null, null, null, 8175);
            default:
                C3959i c3959i = (C3959i) obj;
                AbstractC3557B.c0("it", c3959i);
                if (z11) {
                    z10 = false;
                    break;
                }
                z10 = true;
                return Boolean.valueOf(z10);
        }
    }
}
