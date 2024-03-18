package lb;

import com.google.android.gms.internal.play_billing.N;
import gb.Z;
import gb.k0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class q extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38053Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f38054Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k0 f38055h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k0 k0Var, K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38054Z = k10;
        this.f38055h0 = k0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new q(this.f38055h0, this.f38054Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((q) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38053Y;
        K k10 = this.f38054Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            k10.l(n.f38040i0);
            C4368e c4368e = k10.f37957m;
            String str = ((Z) this.f38055h0).f31381a;
            o oVar = new o(k10, null);
            p pVar = new p(k10, null);
            this.f38053Y = 1;
            if (c4368e.b(str, oVar, pVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        k10.l(n.f38041j0);
        return jf.y.f36177a;
    }
}
