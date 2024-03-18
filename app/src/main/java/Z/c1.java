package Z;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class c1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22607Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22608Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f22609h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f22610i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(wf.n nVar, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22609h0 = nVar;
        this.f22610i0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        c1 c1Var = new c1(this.f22609h0, this.f22610i0, abstractC4825e);
        c1Var.f22608Z = obj;
        return c1Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22607Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1733r0 c1733r0 = new C1733r0(this.f22610i0, ((Ng.F) this.f22608Z).i());
            this.f22607Y = 1;
            if (this.f22609h0.invoke(c1733r0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
