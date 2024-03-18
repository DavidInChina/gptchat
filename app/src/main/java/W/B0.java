package W;

import Qg.AbstractC1206i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class B0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18987Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D.l f18988Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j0.u f18989h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(D.l lVar, j0.u uVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18988Z = lVar;
        this.f18989h0 = uVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new B0(this.f18988Z, this.f18989h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18987Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1206i a5 = this.f18988Z.a();
            C1582m0 c1582m0 = new C1582m0(this.f18989h0, 2);
            this.f18987Y = 1;
            if (a5.b(c1582m0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
