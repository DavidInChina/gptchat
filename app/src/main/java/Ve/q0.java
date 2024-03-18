package Ve;

import Sg.C1394f;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class q0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18852Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r0 f18853Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f18854h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18853Z = r0Var;
        this.f18854h0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new q0(this.f18853Z, this.f18854h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18852Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            r0 r0Var = this.f18853Z;
            Te.b bVar = r0Var.f18873l;
            AbstractC2469q0.q("reason", this.f18854h0);
            Te.w wVar = new Te.w(r0Var);
            C1394f c1394f = r0Var.f18872k;
            if (c1394f != null) {
                Ng.D0 a5 = bVar.a(wVar, c1394f);
                this.f18852Y = 1;
                if (a5.F(this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                AbstractC3557B.C2("coroutineScope");
                throw null;
            }
        }
        return jf.y.f36177a;
    }
}
