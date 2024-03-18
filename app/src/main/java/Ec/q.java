package Ec;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f4636Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ G f4637Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f4638h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f4639i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(G g10, Tc.f fVar, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4637Z = g10;
        this.f4638h0 = fVar;
        this.f4639i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new q(this.f4637Z, this.f4638h0, this.f4639i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f4636Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p c5426p = this.f4637Z.f812i;
            p pVar = new p(this.f4638h0, this.f4639i0, null);
            this.f4636Y = 1;
            if (L4.a.b0(c5426p, pVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
