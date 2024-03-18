package nb;

import Cb.C0293c;
import Cb.C0310u;
import Cb.Y;
import Cb.g0;
import Cd.X;
import Dd.C0385f;
import Dd.K;
import E0.AbstractC0461u;
import Fb.y;
import Mb.C0951e0;
import Mb.C0963k0;
import Mb.C0986w0;
import Mb.G;
import Mb.O0;
import Mb.P0;
import Mb.Q0;
import Mb.X0;
import Q9.i;
import Rb.F;
import Rb.M;
import Rb.N;
import Vc.w;
import Yb.m;
import aa.C1939b;
import android.graphics.Bitmap;
import b5.C2127b;
import b9.EnumC2132a;
import ec.AbstractC2868t;
import ec.C2866r;
import gc.C3253e;
import ic.AbstractC3549t;
import ic.C3551v;
import id.AbstractC3557B;
import ja.C3931c;
import java.io.OutputStream;
import kf.t;
import kotlin.jvm.internal.o;
import nc.r;
import nc.s;
import nc.z;
import ne.C4819c;
import qd.C5305b;
import wd.C6200m;
import wd.K0;
import wd.u0;
import wf.k;
import yc.C6575a;
import yc.C6576b;
import yc.C6578d;
import zd.n;
import zd.q;

/* loaded from: classes.dex */
public final class d extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40172Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f40173Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj) {
        super(1);
        this.f40172Y = i10;
        this.f40173Z = obj;
    }

    public final Y a(Y y10) {
        int i10 = this.f40172Y;
        Object obj = this.f40173Z;
        switch (i10) {
            case 1:
                AbstractC3557B.c0("it", y10);
                String str = ((y) ((w) obj).f18565a).f5181a;
                AbstractC3557B.c0("value", str);
                return Y.a(y10, null, null, null, null, str, null, null, 111);
            case 5:
                AbstractC3557B.c0("it", y10);
                g0 g0Var = g0.f2944i0;
                G g10 = (G) obj;
                String str2 = g10.f11778a;
                if (str2 != null) {
                    String str3 = g10.f11779b;
                    if (str3 != null) {
                        Fb.f fVar = g10.f11783f;
                        if (fVar != null) {
                            return Y.a(y10, g0Var, null, new C0293c(str2, str3, g10.f11781d, fVar), null, null, null, null, 122);
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                AbstractC3557B.c0("it", y10);
                String str4 = ((C0310u) obj).f2962a;
                AbstractC3557B.c0("value", str4);
                return Y.a(y10, null, null, null, str4, null, null, null, 119);
        }
    }

    public final X c(X x10) {
        int i10 = this.f40172Y;
        Object obj = this.f40173Z;
        switch (i10) {
            case 26:
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, false, false, false, null, (C1939b) obj, null, 6143);
            case 27:
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, false, false, false, null, null, Hd.b.e(x10.f3038m, null, ((C0385f) obj).f3556a, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, 8388605), 4095);
            case 28:
                AbstractC3557B.c0("$this$setState", x10);
                Hd.b bVar = x10.f3038m;
                return X.e(x10, null, null, false, false, false, false, null, null, Hd.b.e(bVar, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, t.x2((K) obj, bVar.f7631v), null, 6291455), 4095);
            default:
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, false, false, false, null, null, Hd.b.e(x10.f3038m, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, (Ed.c) obj, 4194303), 4095);
        }
    }

    public final M e(M m10) {
        int i10 = this.f40172Y;
        Object obj = this.f40173Z;
        switch (i10) {
            case 10:
                AbstractC3557B.c0("$this$setState", m10);
                return M.e(m10, (N) obj, null, null, false, null, 30);
            default:
                AbstractC3557B.c0("$this$setState", m10);
                return M.e(m10, null, (F) obj, null, false, null, 29);
        }
    }

    public final s f(s sVar) {
        int i10 = this.f40172Y;
        Object obj = this.f40173Z;
        switch (i10) {
            case 17:
                AbstractC3557B.c0("$this$setState", sVar);
                return s.e(sVar, null, null, false, null, (K0) ((u0) obj).f48468a, null, null, false, null, false, 1007);
            case 18:
                AbstractC3557B.c0("$this$setState", sVar);
                i iVar = (i) obj;
                return s.e(sVar, iVar.f14540b, null, false, null, null, null, null, iVar.f14541c, iVar.f14539a, false, 638);
            default:
                AbstractC3557B.c0("$this$setState", sVar);
                return s.e(sVar, null, Lg.o.Z2(128, ((nc.o) ((r) obj)).f40246a), false, null, null, null, null, false, null, false, 1021);
        }
    }

    public final n g(n nVar) {
        int i10 = this.f40172Y;
        Object obj = this.f40173Z;
        switch (i10) {
            case 13:
                AbstractC3557B.c0("$this$update", nVar);
                return n.a(nVar, ((C2866r) ((AbstractC2868t) obj)).f29244a, null, false, false, false, false, false, false, null, false, 4094);
            default:
                AbstractC3557B.c0("$this$update", nVar);
                return n.a(nVar, false, (zd.d) obj, false, false, false, false, false, false, null, false, 4091);
        }
    }

    public final void i(C4819c c4819c) {
        int i10 = this.f40172Y;
        Object obj = this.f40173Z;
        switch (i10) {
            case 24:
                AbstractC3557B.c0("$this$createClientPlugin", c4819c);
                c4819c.f40297b.add(new ne.f(new C6575a((C6576b) obj, null, 0)));
                return;
            default:
                AbstractC3557B.c0("$this$createClientPlugin", c4819c);
                c4819c.f40297b.add(new ne.f(new C6575a((C6578d) obj, null, 1)));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f40172Y;
        Object obj2 = this.f40173Z;
        switch (i10) {
            case 0:
                OutputStream outputStream = (OutputStream) obj;
                AbstractC3557B.c0("it", outputStream);
                ((Bitmap) obj2).compress(Bitmap.CompressFormat.JPEG, 90, outputStream);
                return yVar;
            case 1:
                return a((Y) obj);
            case 2:
                AbstractC0461u abstractC0461u = (AbstractC0461u) obj;
                AbstractC3557B.c0("it", abstractC0461u);
                ((m0.h) obj2).f38809b = androidx.compose.ui.layout.a.c(abstractC0461u);
                return yVar;
            case 3:
                String str = (String) obj;
                AbstractC3557B.c0("it", str);
                ((X0) obj2).j(new O0(str));
                return yVar;
            case 4:
                C0951e0 c0951e0 = (C0951e0) obj;
                AbstractC3557B.c0("$this$setState", c0951e0);
                return C0951e0.e(c0951e0, false, (EnumC2132a) obj2, false, 5);
            case 5:
                return a((Y) obj);
            case 6:
                AbstractC3557B.c0("$this$setState", (C0963k0) obj);
                return new C0963k0((C2127b) obj2);
            case 7:
                return a((Y) obj);
            case 8:
                C0986w0 c0986w0 = (C0986w0) obj;
                AbstractC3557B.c0("$this$setState", c0986w0);
                return C0986w0.e(c0986w0, ((Y) obj2).f2920b, null, null, 12);
            case 9:
                Q0 q02 = (Q0) obj;
                AbstractC3557B.c0("$this$setState", q02);
                return Q0.e(q02, null, ((O0) ((P0) obj2)).f11824a, null, false, 13);
            case 10:
                return e((M) obj);
            case 11:
                return e((M) obj);
            case 12:
                AbstractC3557B.c0("$this$setState", (m) obj);
                C5305b c5305b = (C5305b) obj2;
                return new m(c5305b.f44062a, c5305b.f44063b, c5305b.f44064c);
            case 13:
                return g((n) obj);
            case 14:
                gc.o oVar = (gc.o) obj;
                AbstractC3557B.c0("$this$setState", oVar);
                return gc.o.e(oVar, ((C3253e) ((gc.g) obj2)).f31554a, null, 2);
            case 15:
                C3551v c3551v = (C3551v) obj;
                AbstractC3557B.c0("$this$setState", c3551v);
                return C3551v.e(c3551v, Boolean.valueOf(((ic.r) ((AbstractC3549t) obj2)).f33063a), null, 2);
            case 16:
                return g((n) obj);
            case 17:
                return f((s) obj);
            case 18:
                return f((s) obj);
            case 19:
                return f((s) obj);
            case 20:
                z zVar = (z) obj;
                AbstractC3557B.c0("$this$setState", zVar);
                return z.e(zVar, null, null, null, false, (C3931c) obj2, null, null, null, 991);
            case 21:
                C6200m c6200m = (C6200m) obj;
                return (C6200m) obj2;
            case 22:
                zd.g gVar = (zd.g) obj;
                AbstractC3557B.c0("settings", gVar);
                return zd.g.a(gVar, null, null, null, (q) obj2, null, 239);
            case 23:
                K0 k02 = (K0) obj;
                return (K0) obj2;
            case 24:
                i((C4819c) obj);
                return yVar;
            case 25:
                i((C4819c) obj);
                return yVar;
            case 26:
                return c((X) obj);
            case 27:
                return c((X) obj);
            case 28:
                return c((X) obj);
            default:
                return c((X) obj);
        }
    }
}
