package hb;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes.dex */
public final class q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f32121Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ u f32122Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f32123h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32122Z = uVar;
        this.f32123h0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new q(this.f32122Z, this.f32123h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32121Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p c5426p = this.f32122Z.f812i;
            p pVar = new p(this.f32123h0, null);
            this.f32121Y = 1;
            if (L4.a.b0(c5426p, pVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
