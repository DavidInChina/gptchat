package L;

import B.Z1;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class S extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10063Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B0.A f10064Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N.t0 f10065h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(B0.A a5, N.t0 t0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10064Z = a5;
        this.f10065h0 = t0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new S(this.f10064Z, this.f10065h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10063Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            A a5 = new A(this.f10065h0, 1);
            this.f10063Y = 1;
            if (Z1.d(this.f10064Z, null, null, a5, this, 7) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
