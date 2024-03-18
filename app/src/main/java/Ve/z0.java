package Ve;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class z0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18933Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f18934Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(E0 e02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18934Z = e02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new z0(this.f18934Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((z0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18933Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
            throw new RuntimeException();
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        E0 e02 = this.f18934Z;
        Qg.r0 r0Var = e02.f18652z0;
        y0 y0Var = new y0(e02, 0);
        this.f18933Y = 1;
        r0Var.getClass();
        Qg.r0.n(r0Var, y0Var, this);
        return enumC5000a;
    }
}
