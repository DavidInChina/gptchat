package Xb;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pd.t;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class l extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f21830Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f21831Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f21831Z = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new l(this.f21831Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((l) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f21830Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            t tVar = this.f21831Z.f21835j;
            this.f21830Y = 1;
            if (((Ub.e) tVar).f(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
