package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class z0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14955Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14956Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ D0 f14957h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(D0 d02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14957h0 = d02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        z0 z0Var = new z0(this.f14957h0, abstractC4825e);
        z0Var.f14956Z = obj;
        return z0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((z0) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14955Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            N.W w10 = new N.W(new Object(), 14, (AbstractC1207j) this.f14956Z);
            this.f14955Y = 1;
            if (this.f14957h0.b(w10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        throw new RuntimeException();
    }
}
