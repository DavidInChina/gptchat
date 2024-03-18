package bb;

import cb.C2334C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class G extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f25713Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ L f25714Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(L l10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f25714Z = l10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new G(this.f25714Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((G) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25713Y;
        L l10 = this.f25714Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Va.e eVar = l10.f25732j;
            String str = ((C2152D) l10.f808e.getValue()).f25693a;
            this.f25713Y = 1;
            obj = ((Ya.r) eVar).b(str, this, false);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        wd.v0 v0Var = (wd.v0) obj;
        if (v0Var instanceof wd.u0) {
            l10.l(new Ya.b((C2334C) ((wd.u0) v0Var).f48468a, 2));
        } else if (v0Var instanceof wd.q0) {
            l10.g(new Ad.q((wd.q0) v0Var));
        } else if (!(v0Var instanceof wd.p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
