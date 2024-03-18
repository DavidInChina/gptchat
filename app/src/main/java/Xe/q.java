package Xe;

import H0.p1;
import Qg.m0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f21915Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ z f21916Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r f21917h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, r rVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f21916Z = zVar;
        this.f21917h0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new q(this.f21916Z, this.f21917h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((q) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f21915Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            m0 m0Var = this.f21916Z.f21947b.f17185b;
            p1 p1Var = new p1(2, this.f21917h0);
            this.f21915Y = 1;
            if (m0Var.f14878Y.b(p1Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        throw new RuntimeException();
    }
}
