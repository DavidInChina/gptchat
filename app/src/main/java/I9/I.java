package I9;

import ca.C2311c;
import id.AbstractC3557B;
import kf.AbstractC4273I;
import wd.C6168C;

/* loaded from: classes.dex */
public final class I extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8180Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2311c f8181Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(C2311c c2311c, int i10) {
        super(1);
        this.f8180Y = i10;
        this.f8181Z = c2311c;
    }

    public final j1 a(j1 j1Var) {
        int i10 = this.f8180Y;
        C2311c c2311c = this.f8181Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, AbstractC4273I.v2(j1Var.f8397o, new C6168C(c2311c.f26374a)), null, false, 114687);
            case 1:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, AbstractC4273I.s2(j1Var.f8397o, new C6168C(c2311c.f26374a)), null, false, 114687);
            case 2:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, null, AbstractC4273I.v2(j1Var.f8398p, new C6168C(c2311c.f26374a)), false, 98303);
            case 3:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, null, AbstractC4273I.s2(j1Var.f8398p, new C6168C(c2311c.f26374a)), false, 98303);
            case 4:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, AbstractC4273I.v2(j1Var.f8396n, new C6168C(c2311c.f26374a)), null, null, false, 122879);
            default:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, AbstractC4273I.s2(j1Var.f8396n, new C6168C(c2311c.f26374a)), null, null, false, 122879);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f8180Y) {
            case 0:
                return a((j1) obj);
            case 1:
                return a((j1) obj);
            case 2:
                return a((j1) obj);
            case 3:
                return a((j1) obj);
            case 4:
                return a((j1) obj);
            case 5:
                return a((j1) obj);
            default:
                nc.s sVar = (nc.s) obj;
                AbstractC3557B.c0("$this$setState", sVar);
                return nc.s.e(sVar, null, null, false, null, null, this.f8181Z.f26376c, null, false, null, false, 991);
        }
    }
}
