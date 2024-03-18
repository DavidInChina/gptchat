package ic;

import cb.C2334C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class d0 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f33014Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g0 f33015Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ O f33016h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, O o10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f33015Z = g0Var;
        this.f33016h0 = o10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new d0(this.f33015Z, this.f33016h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((d0) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33014Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C2334C c2334c = ((M) this.f33016h0).f32960a;
            this.f33014Y = 1;
            if (g0.p(this.f33015Z, c2334c, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
