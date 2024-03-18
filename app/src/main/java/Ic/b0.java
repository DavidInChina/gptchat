package ic;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class b0 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f33003Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g0 f33004Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ O f33005h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, O o10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f33004Z = g0Var;
        this.f33005h0 = o10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new b0(this.f33004Z, this.f33005h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((b0) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33003Y;
        O o10 = this.f33005h0;
        g0 g0Var = this.f33004Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.g gVar = g0Var.f33042k;
            ((N) o10).getClass();
            this.f33003Y = 1;
            obj = ((C5451O) gVar).c(true, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
            g0Var.l(new a0(o10, 1));
        } else if (v0Var instanceof q0) {
            g0Var.f(new C3529G((q0) v0Var));
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
