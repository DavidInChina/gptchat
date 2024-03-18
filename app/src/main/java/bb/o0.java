package bb;

import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.C6461B;

/* loaded from: classes2.dex */
public final class o0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f25879Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f25880Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(F0 f02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f25880Z = f02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new o0(this.f25880Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25879Y;
        F0 f02 = this.f25880Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Va.e eVar = f02.f25710j;
            this.f25879Y = 1;
            obj = ((Ya.r) eVar).g(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        wd.v0 v0Var = (wd.v0) obj;
        if (v0Var instanceof wd.u0) {
            f02.l(new C6461B(9, (List) ((wd.u0) v0Var).f48468a));
        } else if (v0Var instanceof wd.q0) {
            f02.g(new Ad.q((wd.q0) v0Var));
        } else if (!(v0Var instanceof wd.p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
