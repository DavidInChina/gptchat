package I9;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5472v;

/* loaded from: classes2.dex */
public final class g1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f8351Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X0 f8352Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h1 f8353h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(X0 x02, h1 h1Var, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f8352Z = x02;
        this.f8353h0 = h1Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new g1(this.f8352Z, this.f8353h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((g1) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8351Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            String a5 = ((W0) this.f8352Z).f8248a.a();
            if (a5 != null) {
                xd.b bVar = this.f8353h0.f8364j;
                this.f8351Y = 1;
                if (((C5472v) bVar).b(a5, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
