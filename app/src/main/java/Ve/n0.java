package Ve;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class n0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18830Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r0 f18831Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r0 r0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18831Z = r0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new n0(this.f18831Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((n0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18830Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            r0 r0Var = this.f18831Z;
            Qg.m0 m0Var = r0Var.f18883v.f21063e.f17185b;
            m0 m0Var2 = new m0(r0Var, 0);
            this.f18830Y = 1;
            if (m0Var.f14878Y.b(m0Var2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        throw new RuntimeException();
    }
}
