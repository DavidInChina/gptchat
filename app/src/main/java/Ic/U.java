package ic;

import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import y.C6461B;

/* loaded from: classes.dex */
public final class U extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f32974Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g0 f32975Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(g0 g0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32975Z = g0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new U(this.f32975Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32974Y;
        g0 g0Var = this.f32975Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Va.e eVar = g0Var.f33043l;
            this.f32974Y = 1;
            obj = ((Ya.r) eVar).h(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            g0Var.l(new C6461B(12, (List) ((u0) v0Var).f48468a));
        } else if (v0Var instanceof q0) {
            g0Var.f(new C3529G((q0) v0Var));
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
