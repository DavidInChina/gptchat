package pc;

import id.AbstractC3557B;
import java.util.List;
import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.B0;
import wd.C6189g;
import wd.C6205s;
import wd.H0;
import wd.n0;
import wd.o0;

/* loaded from: classes.dex */
public final class d0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f42975Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ h0 f42976Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f42976Z = h0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        d0 d0Var = new d0(this.f42976Z, abstractC4825e);
        d0Var.f42975Y = obj;
        return d0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((d0) create((C3959i) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        H0 h02;
        S s10;
        H0 h03;
        C6189g c6189g;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C3959i c3959i = (C3959i) this.f42975Y;
        C6205s c6205s = (C6205s) c3959i.f36155Y;
        T t10 = (T) c3959i.f36156Z;
        B0 b02 = t10.f42945b;
        if (b02 != null) {
            h02 = b02.f48317b;
        } else {
            h02 = null;
        }
        if (h02 == H0.f48338Z) {
            s10 = S.f42942h0;
        } else {
            if (b02 != null) {
                h03 = b02.f48317b;
            } else {
                h03 = null;
            }
            if (h03 == null && ((c6189g = t10.f42944a) == null || !c6189g.b())) {
                s10 = S.f42940Y;
            } else {
                s10 = S.f42941Z;
            }
        }
        boolean e10 = c6205s.e();
        h0 h0Var = this.f42976Z;
        if (e10) {
            h0Var.m(J.f42905i0);
        } else if (s10 == S.f42941Z) {
            h0Var.m(C5115A.f42893i0);
        } else if (!t10.f42946c && s10 == S.f42940Y) {
            h0Var.m(new C5116B());
        } else {
            wd.m0 m0Var = wd.m0.f48443a;
            o0 o0Var = t10.f42947d;
            if (AbstractC3557B.K(o0Var, m0Var)) {
                h0Var.l(P.f42936i0);
            } else if (o0Var instanceof wd.l0) {
                Throwable th2 = ((wd.l0) o0Var).f48438a.f48450a;
                x8.W.G(Pc.e.a(), "Unable to fetch subscription packages", th2, 4);
                if (th2 instanceof AbstractC5137p) {
                    int i10 = K.f42906h0;
                    h0Var.m(k5.F.g((AbstractC5137p) th2));
                } else {
                    h0Var.m(new C5119E(th2));
                }
            } else if (o0Var instanceof n0) {
                if (((List) ((n0) o0Var).f48446a).isEmpty()) {
                    x8.W.G(Pc.e.a(), "Packages successfully loaded, but were empty", null, 6);
                    h0Var.m(C5118D.f42896i0);
                } else {
                    h0Var.l(new Ra.l(o0Var, 23, s10));
                }
            }
        }
        return jf.y.f36177a;
    }
}
