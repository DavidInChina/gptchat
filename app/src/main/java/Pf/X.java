package Pf;

import Bg.j0;
import Mf.AbstractC0996e;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class X extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Y f14065Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0996e f14066Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y10, AbstractC0996e abstractC0996e) {
        super(0);
        this.f14065Y = y10;
        this.f14066Z = abstractC0996e;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        j0 j0Var;
        Y y10 = this.f14065Y;
        Ag.u uVar = y10.f14068J0;
        AbstractC0996e abstractC0996e = this.f14066Z;
        Nf.i annotations = ((Nf.b) abstractC0996e).getAnnotations();
        AbstractC1165x abstractC1165x = (AbstractC1165x) this.f14066Z;
        int e10 = abstractC1165x.e();
        AbstractC2469q0.u("getKind(...)", e10);
        Mf.a0 a0Var = y10.f14069K0;
        Mf.V g10 = ((AbstractC1159q) a0Var).g();
        AbstractC3557B.b0("getSource(...)", g10);
        Y y11 = new Y(uVar, y10.f14069K0, abstractC0996e, y10, annotations, e10, g10);
        Y.f14067M0.getClass();
        zg.t tVar = (zg.t) a0Var;
        AbstractC1146d abstractC1146d = null;
        if (tVar.w0() == null) {
            j0Var = null;
        } else {
            j0Var = j0.d(tVar.x0());
        }
        if (j0Var == null) {
            return null;
        }
        AbstractC1146d abstractC1146d2 = abstractC1165x.f14174o0;
        if (abstractC1146d2 != null) {
            abstractC1146d = abstractC1146d2.c(j0Var);
        }
        List<AbstractC1146d> d02 = abstractC1165x.d0();
        AbstractC3557B.b0("getContextReceiverParameters(...)", d02);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(d02, 10));
        for (AbstractC1146d abstractC1146d3 : d02) {
            arrayList.add(abstractC1146d3.c(j0Var));
        }
        AbstractC1149g abstractC1149g = (AbstractC1149g) a0Var;
        List o10 = abstractC1149g.o();
        List S = y10.S();
        Bg.A a5 = y10.f14171l0;
        AbstractC3557B.Z(a5);
        y11.B0(null, abstractC1146d, arrayList, o10, S, a5, Mf.A.f12051Z, abstractC1149g.f14092k0);
        return y11;
    }
}
