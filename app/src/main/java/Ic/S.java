package ic;

import na.V0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class S extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f32970Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g0 f32971Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(g0 g0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32971Z = g0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new S(this.f32971Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32970Y;
        g0 g0Var = this.f32971Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.g gVar = g0Var.f33042k;
            this.f32970Y = 1;
            obj = ((C5451O) gVar).b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            g0Var.l(new V0((zd.g) ((u0) v0Var).f48468a, 2));
        } else if (v0Var instanceof q0) {
            x8.W.W(Pc.e.a(), "Failed to get user settings", ((q0) v0Var).f48450a, null, 4);
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
