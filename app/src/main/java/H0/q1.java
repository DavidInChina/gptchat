package H0;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class q1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6993Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Qg.D0 f6994Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ G0 f6995h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(Qg.D0 d02, G0 g02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6994Z = d02;
        this.f6995h0 = g02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new q1(this.f6994Z, this.f6995h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((q1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6993Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            p1 p1Var = new p1(0, this.f6995h0);
            this.f6993Y = 1;
            if (this.f6994Z.b(p1Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        throw new RuntimeException();
    }
}
